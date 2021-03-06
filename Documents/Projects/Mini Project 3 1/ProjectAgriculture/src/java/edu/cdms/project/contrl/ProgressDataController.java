/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cdms.project.contrl;

import edu.cdms.project.orm.Majorpaddy;
import edu.cdms.project.orm.Minorpaddy;
import edu.cdms.project.orm.Rainfedpaddy;
import edu.cdms.project.orm.Variety;
import edu.cdms.project.orm.Years;
import edu.cdms.project.service.ProgressDataService;
import java.time.Month;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Chathurika Senani
 */
@Controller
@RequestMapping("/")

public class ProgressDataController {

    @Autowired
    private ProgressDataService progressDataService;

    @RequestMapping(value = "/addrainfed", method = RequestMethod.POST)
    public String addrainfed(@Valid Rainfedpaddy rainfedpaddy, ModelMap map) {

        progressDataService.addRainfedProgress(rainfedpaddy);
        map.addAttribute("rainfed", rainfedpaddy);

        ArrayList<Years> years = progressDataService.getYearList();
        map.addAttribute("years", years);

        ArrayList<Month> monthses = progressDataService.getMonthList();
        map.addAttribute("months", monthses);

        ArrayList<Variety> varietys = progressDataService.getVarietyList();
        map.addAttribute("varieties", varietys);

        return "addProgress";
    }

    @RequestMapping(value = "/addmajor", method = RequestMethod.POST)
    public String addmajor(@Valid Majorpaddy majorpaddy, ModelMap map) {

        progressDataService.addMajorProgress(majorpaddy);
        map.addAttribute("major", majorpaddy);

        ArrayList<Years> years = progressDataService.getYearList();
        map.addAttribute("years", years);

        ArrayList<Month> monthses = progressDataService.getMonthList();
        map.addAttribute("months", monthses);

        ArrayList<Variety> varietys = progressDataService.getVarietyList();
        map.addAttribute("varieties", varietys);

        return "addProgress";
    }

    @RequestMapping(value = "/addminor", method = RequestMethod.POST)
    public String addmajor(@Valid Minorpaddy minorpaddy, ModelMap map) {

        progressDataService.addMinorProgress(minorpaddy);
        map.addAttribute("minor", minorpaddy);

        ArrayList<Years> years = progressDataService.getYearList();
        map.addAttribute("years", years);

        ArrayList<Month> monthses = progressDataService.getMonthList();
        map.addAttribute("months", monthses);

        ArrayList<Variety> varietys = progressDataService.getVarietyList();
        map.addAttribute("varieties", varietys);

        return "addProgress";
    }

}
