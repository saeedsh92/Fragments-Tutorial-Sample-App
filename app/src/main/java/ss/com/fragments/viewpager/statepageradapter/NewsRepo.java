package ss.com.fragments.viewpager.statepageradapter;

import java.util.ArrayList;

/**
 * @author S.Shahini
 * @since 12/31/17
 */

public class NewsRepo {
    public static ArrayList<News> getMostPopularNews() {
        ArrayList<News> newsList = new ArrayList<>();
        News news1 = new News("Indian Tamil cinema superstar Rajinikanth to enter politics",
                "Rajinikanth is widely credited for almost single-handedly defeating a state government in 1996 by asking his fans to...");

        News news2 = new News("Pakistan´s girl cadets dream of taking power",
                "In starched khaki uniforms and red berets Durkhanay and her classmates march the parade ground, stepping to the beat...");

        News news3 = new News("Five personnel of FC martyred as tanker hit them in Kharan",
                "the tanker carrying smuggled Iranian diesel was on its way when Frontier Corps personnel signaled it for checking but...");

        News news4 = new News("Gulalai denied seat on stage in respect of tribal customs",
                "Gulalai was opted out from stage participation at the protest for KP-FATA merger on basis of tribal customs, where...");

        News news5 = new News("Erdogan to visit France amid tensions with EU",
                "Turkish President Recep Tayyip Erdogan announced on Saturday that he will travel to France to discuss bilateral...");

        newsList.add(news1);
        newsList.add(news2);
        newsList.add(news3);
        newsList.add(news4);
        newsList.add(news5);
        return newsList;
    }

    public static ArrayList<News> getLatestNews() {
        ArrayList<News> newsList = new ArrayList<>();
        News news1 = new News("Indian Tamil cinema superstar Rajinikanth to enter politics",
                "Rajinikanth is widely credited for almost single-handedly defeating a state government in 1996 by asking his fans to...");

        News news2 = new News("Pakistan´s girl cadets dream of taking power",
                "In starched khaki uniforms and red berets Durkhanay and her classmates march the parade ground, stepping to the beat...");

        News news3 = new News("Five personnel of FC martyred as tanker hit them in Kharan",
                "the tanker carrying smuggled Iranian diesel was on its way when Frontier Corps personnel signaled it for checking but...");

        News news4 = new News("Gulalai denied seat on stage in respect of tribal customs",
                "Gulalai was opted out from stage participation at the protest for KP-FATA merger on basis of tribal customs, where...");

        News news5 = new News("Erdogan to visit France amid tensions with EU",
                "Turkish President Recep Tayyip Erdogan announced on Saturday that he will travel to France to discuss bilateral...");

        newsList.add(news5);
        newsList.add(news2);
        newsList.add(news3);
        newsList.add(news4);
        newsList.add(news1);
        return newsList;
    }


}
