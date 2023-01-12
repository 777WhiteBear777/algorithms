package ex_7;

import java.util.List;

public class InitData {

    public List<List<Node>> getData() {

        final String ODESSA = "Odessa";
        final String UMAN = "Uman";
        final String NIKOLAEV = "Nikolaev";
        final String KIEV = "Kiev";
        final String VINITSA = "Vinitsa";
        final String KROPIVNITSKIY = "Kropivnitskiy";
        final String KHERSON = "Kherson";
        final String KRIVOIROG = "KrivoiRog";
        final String ZITOMIR = "Zitomir";
        final String POLTAVA = "Poltava";
        final String KHMELNITSKIY = "Khmelnitskiy";
        final String DNEPR = "Dnepr";
        final String KHARKOV = "Kharkov";
        final String SYMI = "Symi";
        final String RIVNE = "Rivne";
        final String TERNOPIL = "Ternopil";
        final String LVOV = "Lvov";


        return List.of(
                List.of(
                        new Node(UMAN, 1, ODESSA, 271),
                        new Node(NIKOLAEV, 2, ODESSA, 132)
                ),
                List.of(
                        new Node(KIEV, 3, UMAN, 212),
                        new Node(VINITSA, 4, UMAN, 160),
                        new Node(KROPIVNITSKIY, 5, UMAN, 167)
                ),
                List.of(
                        new Node(KHERSON, 6, NIKOLAEV, 71),
                        new Node(KRIVOIROG, 7, NIKOLAEV, 204)
                ),
                List.of(
                        new Node(ZITOMIR, 12, KIEV, 140),
                        new Node(POLTAVA, 9, KIEV, 342)
                ),
                List.of(
                        new Node(KHMELNITSKIY, 13, VINITSA, 122)
                ),
                List.of(
                        new Node(KRIVOIROG, 7, KROPIVNITSKIY, 119),
                        new Node(DNEPR, 8, KROPIVNITSKIY, 245)
                ),
                List.of(
                        new Node(KHERSON)
                ),
                List.of(
                        new Node(DNEPR, 8, KRIVOIROG, 146)
                ),
                List.of(
                        new Node(KHARKOV, 10, DNEPR, 216)
                ),
                List.of(
                        new Node(KHARKOV, 10, POLTAVA, 143)
                ),
                List.of(
                        new Node(SYMI, 11, KHARKOV, 183)
                ),
                List.of(
                        new Node(SYMI)
                ),
                List.of(
                        new Node(RIVNE, 14, ZITOMIR, 188)
                ),
                List.of(
                        new Node(TERNOPIL, 15, KHMELNITSKIY, 111)
                ),
                List.of(
                        new Node(LVOV, 16, RIVNE, 121)
                ),
                List.of(
                        new Node(RIVNE, 14, TERNOPIL, 159),
                        new Node(LVOV, 16, TERNOPIL, 127)
                ),
                List.of(
                        new Node(LVOV)
                )
        );
    }
}
