package com.mpls.NewYorkTimesApi1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.Arrays;


@RestController
public class NYTIMESController {
    Multimedia multimedia1 = new Multimedia("a@.com", "a", 3, 450, "love","james","bond", "girl");
    ArrayList<Multimedia> multimediaList = new ArrayList<Multimedia>(Arrays.asList(multimedia1));
    Results one = new Results("a", "b", "c", "h@h.com", "e", "f", "g", "h", "11", "11", "", "",null, null, null,null, multimediaList);
    ArrayList<Results> english = new ArrayList<>(Arrays.asList(one));

    @GetMapping("/science")
public NYTimes nyTimes(){


return new NYTimes("OK","Copyright (c) 2020 the New York Times company"
        ,"Science","2020-11-12T07:48:22-05:00" ,25,english);
    }
}

//"a@.com", "a", 3, 450, "love","james","bond", "girl")