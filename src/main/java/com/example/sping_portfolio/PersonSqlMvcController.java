package com.example.sping_portfolio;

import com.example.sping_portfolio.SQL.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import javax.validation.Valid;
import java.util.List;
import java.util.ArrayList;
// Built using article: https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/mvc.html
// or similar: https://asbnotebook.com/2020/04/11/spring-boot-thymeleaf-form-validation-example/


@Controller
public class PersonSqlMvcController implements WebMvcConfigurer {

    // Autowired enables Control to connect HTML and POJO Object to Database easily for CRUD
    @Autowired
    private PersonSqlRepository repository;

    @GetMapping("/person")
    public String person(Model model) {
        List<Person> list = repository.listAll();
        model.addAttribute("list", list);
        return "/person";
    }

    /*  The HTML template Forms and PersonForm attributes are bound
        @return - template for person form
        @param - Person Class
    */
    @GetMapping("/personcreate")
    public String personAdd(Person person) {
        return "/personcreate";
    }

    /* Gathers the attributes filled out in the form, tests for and retrieves validation error
    @param - Person object with @Valid
    @param - BindingResult object
     */
    @PostMapping("/personcreate")
    public String personSave(@Valid Person person, BindingResult bindingResult) {
        // Validation of Decorated PersonForm attributes
        if (bindingResult.hasErrors()) {
            return "/personcreate";
        }
        repository.save(person);
        // Redirect to next step
        return "redirect:/person";
    }


//    @GetMapping("/aboutflora")
//    public String aboutflora() {
//        return "aboutflora";
//    }
//

    /*
    public static String makeurl(){
        String makeurl = "https://billboard-api2.p.rapidapi.com/billboard-200?range=1-10&date=" + java.time.LocalDate.now();
        return makeurl;
    }


    @GetMapping("AboutUs/aboutkira2")
    public String quotes(Model model) throws IOException, InterruptedException, ParseException {
        //rapidapi setup:
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(makeurl()))
                .header("x-rapidapi-host", "billboard-api2.p.rapidapi.com")
                .header("x-rapidapi-key", "f4e47a0331msh068fd5299f4fe60p13031ejsn3acdd247ddd3")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        //convert response.body() to java hash map
        var aboutkira = new ObjectMapper().readValue(response.body(), HashMap.class);

        KiraLightSequence gradshow = new KiraLightSequence("0101 0101 0101");
        String returnString1 = gradshow.getSequence();

        gradshow.changeSequence("0011 0011 0011");
        String returnString2 = gradshow.getSequence();

        String returnString3 = gradshow.insertSegment("1111 1111", 4);
        String returnString4 = KiraLightSequence.newSequence("1100000111", "11");
        int returnString5 = KiraLightSequence.squareRoot(4, 0);

        String returnString = "a) " + returnString1 + "\n" +
                "b) " + returnString2 + "\n" +
                "c) " + returnString3 + "\n" +
                "d) " + returnString4 + "\n" +
                "e) " + returnString5;

        //pass stats to view
        model.addAttribute("aboutkira", aboutkira);
        model.addAttribute("returnString", returnString);
        return "AboutUs/aboutkira2";
    }
*/

    public static String createurl(){
        //String createurl = "https://dad-jokes.p.rapidapi.com/random/joke?count=1";
        String createurl = "https://www.episodate.com/api/most-popular?page=1";
        // change to this API https://www.episodate.com/api/most-popular?page=1
        return createurl;
    }

//    @GetMapping("AboutUs/aboutmaggie")
//    public String aboutmaggie(@RequestParam(name="seq", required=false, defaultValue="000000000000") String seq,
//                              @RequestParam(name="insseq", required=false, defaultValue="1111") String insseq,
//                              @RequestParam(name="idx" , required=false, defaultValue="4") int idx,
//                              @RequestParam(name="remseq" , required=false, defaultValue="11") String remseq,
//                              @RequestParam(name="attendance" , required=false, defaultValue="false") Boolean attendance,
//                              @RequestParam(name="food" , required=false, defaultValue="1") int food,
//                              @RequestParam(name="word" , required=false, defaultValue="GREET") String word,
//                              @RequestParam(name="startingcoins" , required=false, defaultValue="10") int startingcoins,
//                              @RequestParam(name="maxrounds" , required=false, defaultValue="5") int maxrounds,
//                              @RequestParam(name="len" , required=false, defaultValue="4") int len,
//                              @RequestParam(name="pref" , required=false, defaultValue="chs") String pref,
//                              @RequestParam(name="hname" , required=false, defaultValue="Karen") String hname,
//                              @RequestParam(name="guestname" , required=false, defaultValue="Cheryl") String guestname,
//                              @RequestParam(name="address" , required=false, defaultValue="5678 Cashew Lane") String address,
//                              @RequestParam(name="newaddress" , required=false, defaultValue="1234 Walnut Street") String newaddress,
//                              @RequestParam(name="firstn" , required=false, defaultValue="mary") String firstn,
//                              @RequestParam(name="lastn" , required=false, defaultValue="hart") String lastn,
//                              @RequestParam(name="title" , required=false, defaultValue="Frankenstein") String title,
//                              @RequestParam(name="author" , required=false, defaultValue="Mary Shelley") String author,
//                              @RequestParam(name="titlep", required = false, defaultValue = "The Wonderful Wizard of Oz") String titlep,
//                              @RequestParam(name="authorp", required = false, defaultValue = "TL. Frank Baum") String authorp,
//                              @RequestParam(name="illustrator", required = false, defaultValue = "W.W. Denslow") String illustrator,
//                              @RequestParam(name="number1" , required=false, defaultValue="30") int number1,
//                              @RequestParam(name="number2" , required=false, defaultValue="3") int number2,
//                              Model model) throws IOException, InterruptedException {
//        //FRQ #2
//        MaggieLightSequence gradShow = new MaggieLightSequence("010101010101");
//        model.addAttribute("originalSequence", gradShow.display());
//        gradShow.changeSequence(seq);
//        model.addAttribute("changedSequence", gradShow.display());
//        gradShow.insertSegment(insseq, idx);
//        model.addAttribute("insertedSequence", gradShow.display());
//        gradShow.removeSegment(remseq);
//        model.addAttribute("removedSequence", gradShow.display());
//        double x = gradShow.findDistance(3, 4);
//        model.addAttribute("distance", x);
//        //FRQ #3
//        MaggieDinner myDinner = new MaggieDinner(attendance, food);
//        myDinner.message1();
//        model.addAttribute("message", myDinner.displayOption1());
//        //FRQ #4
//        MaggieLongestStreak myStreak = new MaggieLongestStreak();
//        model.addAttribute("streakInfo", myStreak.longestStreak(word));
//        MaggieCoinGame coingame = new MaggieCoinGame(startingcoins,maxrounds);
//        model.addAttribute("gameresults", coingame.playGame());
//        //FRQ #5
//        MaggiePasswordGenerator pw1 = new MaggiePasswordGenerator(len, pref);
//        model.addAttribute("genpassword",pw1.pwGen());
//        model.addAttribute("passwordcount",pw1.pwCount());
//        MaggieInvitation party = new MaggieInvitation(hname, address);
//        model.addAttribute("hostname",party.displayHostName());
//        model.addAttribute("message1",party.message(guestname));
//        party.updateAddress(newaddress);
//        model.addAttribute("message2",party.message(guestname));
//        //FRQ #6
//        MaggiePayroll maggiepayroll = new MaggiePayroll();
//        maggiepayroll.computeWages(10.0, 1.5);
//        maggiepayroll.printWages();
//        model.addAttribute("bonusthreshold", maggiepayroll.computeBonusThreshold());
//        //FRQ #7
//        String[] used = {"harta", "hartm", "harty"};
//        MaggieUsername person2 = new MaggieUsername(firstn, lastn);
//        person2.setAvailableUserNames(used);
//        model.addAttribute("usernames", person2.displayPossibleUsernames());
//        //FRQ #8
//        MaggieExperimentalFarm f = new MaggieExperimentalFarm();
//        MaggiePlot highestYield = f.getHighestYield("corn");
//        model.addAttribute("highestcornyield", highestYield.getCropYield());
//        MaggiePlot highestYield1 = f.getHighestYield("peas");
//        model.addAttribute("highestpeasyield", highestYield1.getCropYield());
//        model.addAttribute("samecropcolumn1", f.sameCrop(0));
//        model.addAttribute("samecropcolumn2", f.sameCrop(1));
//        model.addAttribute("samecropcolumn3", f.sameCrop(2));
//        //FRQ #9
//        ArrayList<MaggieBook> myLibrary = new ArrayList<MaggieBook>();
//        MaggieBook book1 = new MaggieBook(title, author);
//        MaggieBook book2 = new MaggiePictureBook(titlep, authorp, illustrator);
//        myLibrary.add(book1);
//        myLibrary.add(book2);
//        MaggieBookListing listing1 = new MaggieBookListing(book1, 10.99);
//        model.addAttribute("bookone", listing1.printDescription());
//        MaggieBookListing listing2 = new MaggieBookListing(book2, 12.99);
//        model.addAttribute("booktwo", listing2.printDescription());
//        //FRQ #10
//        int gcfresult = MaggieNumberSystem.gcf(number1,number2);
//        model.addAttribute("gcfresult", gcfresult);
//        String reduceresult = MaggieNumberSystem.reduceFraction(number1, number2);
//        model.addAttribute("reduceresult", reduceresult);
//        return "AboutUs/aboutmaggie";
//    }


    @GetMapping("/personupdate/{id}")
    public String personUpdate(@PathVariable("id") int id, Model model) {
        model.addAttribute("person", repository.get(id));
        return "/personupdate";
    }

    @PostMapping("/personupdate")
    public String personUpdateSave(@Valid Person person, BindingResult bindingResult) {
        // Validation of Decorated PersonForm attributes
        if (bindingResult.hasErrors()) {
            return "/personupdate";
        }
        repository.save(person);
        // Redirect to next step
        return "redirect:/person";
    }

    @GetMapping("/persondelete/{id}")
    public String personDelete(@PathVariable("id") long id) {
        repository.delete(id);
        return "redirect:/person";
    }

    /*
    #### RESTful API section ####
    Resource: https://spring.io/guides/gs/rest-service/
    */

    /*
    GET List of People
     */
    @RequestMapping(value = "/api/people/get")
    public ResponseEntity<List<Person>> getPeople() {
        return new ResponseEntity<>( repository.listAll(), HttpStatus.OK);
    }

    /*
    GET individual Person using ID
     */
    @RequestMapping(value = "/api/person/get/{id}")
    public ResponseEntity<Person> getPerson(@PathVariable long id) {
        return new ResponseEntity<>( repository.get(id), HttpStatus.OK);
    }

    /*
    DELETE individual Person using ID
     */
    @RequestMapping(value = "/api/person/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deletePerson(@PathVariable long id) {
        repository.delete(id);
        return new ResponseEntity<>( ""+ id +" deleted", HttpStatus.OK);
    }


    /*
    POST Aa record by Requesting Parameters from URI
     */
    @RequestMapping(value = "/api/person/post", method = RequestMethod.POST)
    public ResponseEntity<Object> postPerson(@RequestParam("teacher_class") String teacher_class,
                                             @RequestParam("teacher_name") String teacher_name,
                                             @RequestParam("rating") String rating) {

        // A person object WITHOUT ID will create a new record
        Person person = new Person(teacher_class, teacher_name, rating);
        repository.save(person);
        return new ResponseEntity<>(teacher_class +" is created successfully", HttpStatus.CREATED);
    }

}