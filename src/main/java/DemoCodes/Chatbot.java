package DemoCodes;

import generics.ChatBotTest;
import generics.map;
import org.testng.annotations.Test;

public class Chatbot extends ChatBotTest {
    @Test
    public void chatBotInteraction(){
        map.addDataIntoMap("credentials");
        response("name");
        waitingFor(".//span[text()='Yes']");
        yesText();
        waitUntil("health practitioner");
        yeahWithText();
        waitingFor(".//button[@title=\"Depression\"]");
        System.out.println("Depression Option Selected");
        depression();
        waitUntil("physical health conditions you are");
        hypertension();
        waitUntil("loss of loved one");
        map.addDataIntoMap("depressionpathway");
        response("input1");
        waitUntil("numb and disconnected");
        response("input2");
        waitUntil("interpersonal relationships");
        response("input3");
        waitUntil("coping with everything");
        response("input4");
        waitUntil("challenging beliefs");
        response("input5");
        waitingFor("(.//div[@class='ac-container'])[4]");
        yes();
        waitingFor("(.//div[@class='ac-container'])[5]");
        response("input6");
        waitUntil("volunteering");
        response("input7");
        waitUntil("positive mindset");
        response("input8");
        waitingFor("(.//div[@class='ac-container'])[6]");
        male();
        waitingFor("(.//div[@class='ac-container'])[7]");
        continueWithHealoBot();
        waitUntil("like to do next?");
        goInDepth();
        waitUntil("Okay so tell me, do you want to work on:");
        theIssueItself();
        System.out.println("Main Flow ends and the issue opens");
        //session 1 starts
        System.out.println("Session 1 Starts");
        System.out.println("Depression Pathway Starts");
        waitUntil("considered individually");
        response("input9");
        waitUntil("those people");
        response("input10");
        waitUntil("grounded and centered");
        yes();
        waitUntil("begin by");
        noDiagnosis();
        waitUntil("Dysthymia");
        majorDepression();
        waitUntil("details as this");
        response("input11");
        waitUntil("incorrect diagnosis");
        borderlineDisorder();
        waitUntil("wired differently");
        response("input12");
        waitUntil("checklist with");
        highAnxiety();
        waitUntil("Do you think something like this might be happening with you as well?");
        yeahAllTheTime();
        waitUntil("Moving on, I’d like to know, did you develop a thought pattern that led you to believe you were up to no good?");
        yeahThatSoundsLikeMe();
        waitUntil("ignoring your pain?");
        response("input13");
        waitUntil("logic applies");
        yesAbsolutely();
        waitUntil("happened to you");
        yesMostOfTheTime();
        waitUntil("ever tried to");
        no();
        feedbackPathway();
        System.out.println("Session 1 ends");
        //session 2 starts
        System.out.println("Session 2 starts");
        switchSession();
        waitUntil("exercise we did");
        button("(.//button[@type='button'])[2]");
        waitUntil("any other");
        response("input14");
        waitUntil("being so pessimistic");
        button("(.//button[@type='button'])[2]");
        waitUntil("artistic way");
        response("input15");
        waitUntil("Isn’t that right?");
        button("(.//button[@type='button'])[2]");
        waitUntil("altered sleeping");
        response("input16");
        waitUntil("can be overwhelming");
        response("input17");
        waitingFor("(.//div[@class='ac-container'])[2]");
        response("input18");
        waitUntil("self-destructive");
        firstOption();
        waitUntil("resonate with");
        ummYeah();
        waitUntil("So, why do you think this happens?");
        firstOption();
        waitUntil("Are you with me so far?");
        firstOption();
        waitUntil("strong sense of");
        yeahTotally();
        feedbackPathway();
        System.out.println("Session 2 ends");
        //session 3
        System.out.println("Session 3 starts");
        switchSession();
        waitUntil("exercise we did");
        button(".//button[@title='I really enjoyed doing them']");
        waitUntil("any other");
        response("input19");
        waitUntil("afraid of being");
        yesText();
        waitUntil("Do you feel like your experience is the same?");
        yesmaybeWithText();
        waitUntil("feel guilty");
        yesText();
        waitUntil("increased appetite");
        yesText();
        waitUntil("winter blues and");
        yesText();
        waitUntil("intensity because");
        yesText();
        waitUntil("depressive symptoms");
        yesText();
        waitUntil("natural process");
        yesText();
        waitUntil("sexual, dirty");
        yesText();
        waitUntil("hormonal changes");
        yesText();
        waitUntil("blues and not of");
        yesItsBabyBlues();
        feedbackPathway();
        System.out.println("Session 3 ends");
        switchSession();
        //session 4
        System.out.println("Session 4 starts");
        waitUntil("exercise we did");
        button(".//button[@title='I really enjoyed doing them']");
        waitUntil("feedback you would like");
        response("input20");
        waitUntil("Have you heard about them before?");
        yesText();
        waitUntil("If I were to ask you, who/what do you turn to in those times?");
        iIsolateMyself();
        waitUntil("overly revved");
        yesText();
        waitUntil("unrestrained shopping sprees");
        yeahNotSure();
        waitUntil("repetitively have obsessive");
        mayBeSomeTimes();
        waitUntil("you engage");
        youAreLikelyToTakeThingsPersonally();
        waitUntil("Also, do you feel the pressure to always be perfect or guilty if you are not helping others all the time?");
        response("input21");
        waitUntil("you tend to");
        yesText();
        feedbackPathway();
        System.out.println("Session 4 ends");
        switchSession();
        //session 5
        System.out.println("Session 5 starts");
        waitUntil("exercise we did");
        button(".//button[@title='I really enjoyed doing them']");
        waitUntil("feedback you would like");
        response("input22");
        waitUntil("sense anger inside");
        response("input23");
        waitUntil("especially the ones");
        noNotReally();
        waitUntil("experience rejection");
        response("input24");
        waitUntil("narcissistic or neglectful");
        yesText();
        waitUntil("state wherein");
        mayBeIDK();
        waitUntil("On this note, who do you think you need to forgive?");
        myself();
        feedbackPathway();
        System.out.println("Session 5 ends");
        switchSession();
        //session 6
        System.out.println("Session 6 starts");
        waitUntil("exercise we did");
        button(".//button[@title='I really enjoyed doing them']");
        waitUntil("feedback you would like");
        response("input25");
    }
}
