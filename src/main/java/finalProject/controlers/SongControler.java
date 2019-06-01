package finalProject.controlers;

import com.google.common.collect.Lists;
import finalProject.entities.Song;
import finalProject.entities.Verse;
import finalProject.reposiories.CategorieRepository;
import finalProject.reposiories.SongRepository;
import finalProject.reposiories.VerseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Controller
public class SongControler {

    @Autowired
    SongRepository songRepository;

    @GetMapping("/all")
    public String allSongs(Model model) {

        List<Song> songs = Lists.newArrayList(songRepository.findAll());

        model.addAttribute("songs", songs);
        return "all";
    }

//    Optional<Song> songId = songRepository.findById(id);
}
