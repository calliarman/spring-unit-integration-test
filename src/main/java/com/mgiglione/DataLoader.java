package com.mgiglione;

import com.mgiglione.model.Manga;
import com.mgiglione.repository.MangaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    private MangaRepository mangaRepository;

    @Autowired
    public DataLoader(MangaRepository mangaRepository) {
        this.mangaRepository = mangaRepository;
    }

    public void run(ApplicationArguments args) {
        mangaRepository.save(new Manga("Rurouni Kenshin: Meiji Kenkaku Romantan","Ten years have passed since the end of Bakumatsu, an era of war that saw the uprising of citizens against the Tokugawa shogunate. The revolutionaries wanted to create a time of peace, and a thriving c...",new Integer(28),new Double(8.69)));
        mangaRepository.save(new Manga("Sun-Ken Rock","The story revolves around Ken, a man from an upper-class family that was orphaned young due to his family's involvement with the Yakuza; he became a high school delinquent known for fighting. The only...",new Integer(25),new Double(8.12)));
        mangaRepository.save(new Manga("Hokuto no Ken","For those who suffer nightmares, help awaits at the Ginseikan Tea House, where patrons can order much more than just Darjeeling. Hiruko is a special kind of a private investigator. He's a dream eater....",new Integer(9),new Double(7.97)));
    }
}