package pl.coderslab.imageviewer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.coderslab.imageviewer.model.Image;
import pl.coderslab.imageviewer.service.IImageService;
import pl.coderslab.imageviewer.service.ImageService;


import java.util.List;

@Controller
public class ImageController {
    private IImageService imageService;

    @Autowired
    public void setImageService(ImageService imageService) {
        this.imageService = imageService;
    }

    @GetMapping("/images")
    public String findImage(Model model){
        var images = (List<Image>)imageService.findAll();

        model.addAttribute("images", images);

        return "Images";
    }
}