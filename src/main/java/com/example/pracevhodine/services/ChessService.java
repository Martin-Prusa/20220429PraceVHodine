package com.example.pracevhodine.services;

import com.example.pracevhodine.models.ChessPlayer;
import com.example.pracevhodine.models.Gender;
import com.example.pracevhodine.models.PlayersGroup;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@ApplicationScoped
public class ChessService {

    private List<ChessPlayer> players;

    public ChessService() {
        players = Arrays.stream(("\"1\",\"2219263\",\"Larios Crespo Manuel\",\"ESP\",\"M\",\"\",\"1964\"\n" +
                "\"2\",\"42570280\",\"Asad Tabrizi Parsa\",\"IRI\",\"M\",\"\",\"2006\"\n" +
                "\"3\",\"720453\",\"Bodis Laszlo\",\"HUN\",\"M\",\"\",\"1962\"\n" +
                "\"4\",\"23718285\",\"Buchta Josef\",\"CZE\",\"M\",\"\",\"2006\"\n" +
                "\"5\",\"44171145\",\"Erkhov Andrey\",\"RUS\",\"M\",\"\",\"2005\"\n" +
                "\"6\",\"22756051\",\"Guedes Andre Vieira\",\"BRA\",\"M\",\"\",\"2011\"\n" +
                "\"7\",\"12533149\",\"Bakhshayeshi Majid\",\"IRI\",\"M\",\"\",\"0\"\n" +
                "\"8\",\"651077612\",\"Belmahdi Karim\",\"FRA\",\"M\",\"\",\"2008\"\n" +
                "\"9\",\"34113444\",\"Husak Dmitriy\",\"UKR\",\"M\",\"\",\"2001\"\n" +
                "\"10\",\"24141364\",\"Galiakhmedov Albert\",\"RUS\",\"M\",\"\",\"1953\"\n" +
                "\"11\",\"22587632\",\"Kazemizadeh Mojtaba\",\"IRI\",\"M\",\"\",\"1977\"\n" +
                "\"12\",\"8602255\",\"Gao Fang\",\"CHN\",\"M\",\"\",\"1990\"\n" +
                "\"13\",\"23714344\",\"Sovany Attila\",\"CZE\",\"M\",\"\",\"1999\"\n" +
                "\"14\",\"36039373\",\"Stam Bart\",\"FRA\",\"M\",\"\",\"2002\"\n" +
                "\"15\",\"4424425\",\"Quintero Rangel Edwin\",\"COL\",\"M\",\"\",\"1989\"\n" +
                "\"16\",\"14570009\",\"Zovko Josipa\",\"CRO\",\"F\",\"\",\"2008\"\n" +
                "\"17\",\"22713794\",\"Araujo Thiago Henrique de Almeida\",\"BRA\",\"M\",\"\",\"2007\"\n" +
                "\"18\",\"152064\",\"Allasia Jesus\",\"ARG\",\"M\",\"\",\"2000\"\n" +
                "\"19\",\"45168768\",\"Vorontsov Andrei\",\"FRA\",\"M\",\"\",\"2010\"\n" +
                "\"20\",\"5063000\",\"Sushrutha G\",\"IND\",\"M\",\"\",\"1994\"\n" +
                "\"21\",\"16210034\",\"Raasch Hauke\",\"GER\",\"M\",\"\",\"2006\"\n" +
                "\"22\",\"45052832\",\"Thirthalli Shefali\",\"IND\",\"F\",\"\",\"2004\"\n" +
                "\"23\",\"14303396\",\"Van Rensburg Pierre\",\"RSA\",\"M\",\"\",\"1993\"\n" +
                "\"24\",\"184519\",\"Sala Alejandro\",\"ARG\",\"M\",\"\",\"1961\"\n" +
                "\"25\",\"44131119\",\"Tlupov Asker\",\"RUS\",\"M\",\"\",\"2001\"\n" +
                "\"26\",\"13623389\",\"kiladze Luka\",\"GEO\",\"M\",\"\",\"2009\"\n" +
                "\"27\",\"6707696\",\"Garcia Aristides Enmanuel\",\"ESA\",\"M\",\"\",\"2003\"\n" +
                "\"28\",\"551046733\",\"De Matos Monteiro Tarquinio\",\"FRA\",\"M\",\"\",\"1965\"\n" +
                "\"29\",\"1620916\",\"Leitner Renate\",\"AUT\",\"F\",\"\",\"1947\"\n" +
                "\"30\",\"3436934\",\"Zamora Espinoza Gaston Mateo\",\"CHI\",\"M\",\"\",\"2010\"\n" +
                "\"31\",\"3908038\",\"Carrasquel Orlando\",\"VEN\",\"M\",\"\",\"0\"\n" +
                "\"32\",\"20602995\",\"Leveque Laurent\",\"FRA\",\"M\",\"\",\"1988\"\n" +
                "\"33\",\"2238071\",\"Julian Ortin Raquel\",\"ESP\",\"F\",\"\",\"1996\"\n" +
                "\"34\",\"25882376\",\"Sarafis Rafail\",\"GRE\",\"M\",\"\",\"2010\"\n" +
                "\"35\",\"34561722\",\"Calisir Ferhat\",\"TUR\",\"M\",\"\",\"1975\"\n" +
                "\"36\",\"4610903\",\"Laux Tino Dr.\",\"GER\",\"M\",\"FM\",\"1970\"\n" +
                "\"37\",\"25620410\",\"Walunj Shruti\",\"IND\",\"F\",\"\",\"2002\"\n" +
                "\"38\",\"12963828\",\"Abele Klaus Dr.\",\"GER\",\"M\",\"\",\"1962\"\n" +
                "\"39\",\"25031880\",\"Rounak Bhattacharya\",\"IND\",\"M\",\"\",\"1995\"\n" +
                "\"40\",\"1163094\",\"Mankowski Sebastian\",\"POL\",\"M\",\"\",\"1994\"\n" +
                "\"41\",\"34370633\",\"Ratenkova Kseniya S\",\"RUS\",\"F\",\"\",\"2010\"\n" +
                "\"42\",\"12308196\",\"Lama Shyam\",\"NEP\",\"M\",\"\",\"0\"\n" +
                "\"43\",\"2016842\",\"Bayati Arkia\",\"USA\",\"M\",\"\",\"1959\"\n" +
                "\"44\",\"34209549\",\"Ryzhakov Bogdan\",\"RUS\",\"M\",\"\",\"2008\"\n" +
                "\"45\",\"54141389\",\"Frolov Nikita\",\"RUS\",\"M\",\"\",\"2001\"\n" +
                "\"46\",\"34398457\",\"Koshkarev Dmitry\",\"RUS\",\"M\",\"\",\"2008\"\n" +
                "\"47\",\"54519977\",\"Garcia Vazquez Alejandro\",\"ESP\",\"M\",\"\",\"1993\"\n" +
                "\"48\",\"5053323\",\"Shashwat Shivam\",\"IND\",\"M\",\"\",\"1995\"\n" +
                "\"49\",\"1211951\",\"Bulgaru Constantin\",\"ROU\",\"M\",\"\",\"1961\"\n" +
                "\"50\",\"325619\",\"Dostal Pavel\",\"CZE\",\"M\",\"\",\"1975\"\n" +
                "\"51\",\"34559760\",\"Ciblakbas Sertan\",\"TUR\",\"M\",\"\",\"1997\"\n" +
                "\"52\",\"32721838\",\"Bastami Hilia\",\"IRI\",\"M\",\"\",\"2009\"\n" +
                "\"53\",\"22259406\",\"Garcia Araez Juan Antonio\",\"ESP\",\"M\",\"\",\"1969\"\n" +
                "\"54\",\"25060953\",\"Sangita Saha\",\"IND\",\"F\",\"\",\"1991\"\n" +
                "\"55\",\"209619\",\"Pitropakis Kyriakos\",\"BEL\",\"M\",\"\",\"1950\"\n" +
                "\"56\",\"16245466\",\"Zander Hans-Joerg Dr.\",\"GER\",\"M\",\"\",\"1969\"\n" +
                "\"57\",\"12510955\",\"Mehdizadeh Reza\",\"IRI\",\"M\",\"\",\"0\"\n" +
                "\"58\",\"13012770\",\"Thu Rein Tun\",\"MYA\",\"M\",\"\",\"2000\"\n" +
                "\"59\",\"12845043\",\"Kamarauskas Ricardas\",\"LTU\",\"M\",\"\",\"1998\"\n" +
                "\"60\",\"13903217\",\"Cauia Liviu\",\"MDA\",\"M\",\"\",\"1991\"\n" +
                "\"61\",\"54562546\",\"Ferrando Garcia  German\",\"ESP\",\"M\",\"\",\"1969\"\n" +
                "\"62\",\"1428209\",\"Johannsen Kaj\",\"DEN\",\"M\",\"\",\"1959\"\n" +
                "\"63\",\"404730\",\"Davey Mark\",\"ENG\",\"M\",\"\",\"1976\"\n" +
                "\"64\",\"16224426\",\"Hanak Matthias\",\"GER\",\"M\",\"\",\"1995\"\n" +
                "\"65\",\"3430693\",\"Casilla Munoz Marco Antonio\",\"CHI\",\"M\",\"\",\"1978\"\n" +
                "\"66\",\"10252096\",\"Yashin Khan Shuvo\",\"BAN\",\"M\",\"\",\"2005\"\n" +
                "\"67\",\"1243802\",\"Anton Claudiu-George-Alexandr\",\"ROU\",\"M\",\"\",\"2004\"\n" +
                "\"68\",\"2887806\",\"Avellone Giorgia\",\"ITA\",\"F\",\"\",\"2009\"\n" +
                "\"69\",\"14907119\",\"Smrek Peter\",\"SVK\",\"M\",\"\",\"1982\"\n" +
                "\"70\",\"35048317\",\"Arjun K\",\"IND\",\"M\",\"\",\"1993\"\n" +
                "\"71\",\"21850755\",\"Knapik Jakub\",\"POL\",\"M\",\"\",\"2002\"\n" +
                "\"72\",\"417050\",\"Page Mark E\",\"ENG\",\"M\",\"\",\"1954\"\n" +
                "\"73\",\"20696574\",\"Krief Fradji\",\"FRA\",\"M\",\"\",\"1964\"\n" +
                "\"74\",\"4103297\",\"Fradkin Boris\",\"RUS\",\"M\",\"IM\",\"1946\"\n" +
                "\"75\",\"2033755\",\"Dickson James O\",\"USA\",\"M\",\"\",\"1987\"\n" +
                "\"76\",\"6516734\",\"Alvarez Calderon Leana Maria\",\"CRC\",\"F\",\"\",\"2000\"\n" +
                "\"77\",\"3828158\",\"Monge Soriano Rodolfo\",\"PER\",\"M\",\"\",\"1992\"\n" +
                "\"78\",\"54161339\",\"Chechin Anton\",\"RUS\",\"M\",\"\",\"2006\"\n" +
                "\"79\",\"13015001\",\"Nyan Swan Pyae\",\"MYA\",\"M\",\"\",\"2009\"\n" +
                "\"80\",\"137553\",\"Munzi Sergio\",\"ARG\",\"M\",\"\",\"0\"\n" +
                "\"81\",\"3527239\",\"Dominguez Hernandez Meyling\",\"CUB\",\"F\",\"\",\"2004\"\n" +
                "\"82\",\"9912525\",\"Ranathunga Hirushan\",\"SRI\",\"M\",\"\",\"1998\"\n" +
                "\"83\",\"4200411\",\"Efstathiou Damianos\",\"GRE\",\"M\",\"\",\"1957\"\n" +
                "\"84\",\"6366732\",\"Elidolu Oguz Kaan\",\"TUR\",\"M\",\"\",\"2001\"\n" +
                "\"85\",\"25765000\",\"Gaurav Ramdev\",\"IND\",\"M\",\"\",\"1996\"\n" +
                "\"86\",\"4202406\",\"Hristofis Ilias\",\"GRE\",\"M\",\"\",\"1968\"\n" +
                "\"87\",\"5902002\",\"Nabil Michael\",\"CYP\",\"M\",\"\",\"2003\"\n" +
                "\"88\",\"42596009\",\"Nasirian Jabraeil\",\"IRI\",\"M\",\"\",\"1984\"\n" +
                "\"89\",\"13750011\",\"Aubakirov Alikhan\",\"KAZ\",\"M\",\"\",\"2005\"\n" +
                "\"90\",\"5200296\",\"Pacis Adrian\",\"PHI\",\"M\",\"FM\",\"1958\"\n" +
                "\"91\",\"2318717\",\"Ofeigsson Daniel Freyr\",\"ISL\",\"M\",\"\",\"2008\"\n" +
                "\"92\",\"2404850\",\"Robson Matthew\",\"SCO\",\"M\",\"\",\"1980\"\n" +
                "\"93\",\"1114760\",\"Prokop Jacek\",\"POL\",\"M\",\"\",\"1977\"\n" +
                "\"94\",\"25835416\",\"Chondroglou Stergios\",\"GRE\",\"M\",\"\",\"1978\"\n" +
                "\"95\",\"23715375\",\"Rybacek Jan\",\"CZE\",\"M\",\"\",\"2008\"\n" +
                "\"96\",\"21829659\",\"Krotowski-Cacha Rafal\",\"POL\",\"M\",\"\",\"1977\"\n" +
                "\"97\",\"24692212\",\"Berger Nadja\",\"GER\",\"F\",\"\",\"1996\"\n" +
                "\"98\",\"45150338\",\"Deher Simeon\",\"FRA\",\"M\",\"\",\"1997\"\n" +
                "\"99\",\"4637313\",\"Wolski Thomas\",\"GER\",\"M\",\"FM\",\"1966\"\n" +
                "\"100\",\"8636770\",\"Ning Zijin\",\"CHN\",\"F\",\"\",\"2008\"\n" +
                "\"101\",\"14214776\",\"Narzullaev Firdavs\",\"UZB\",\"M\",\"\",\"2005\"\n" +
                "\"102\",\"1275143\",\"Sachilaru Alexandru\",\"ROU\",\"M\",\"\",\"2007\"\n" +
                "\"103\",\"551002329\",\"Gros-Desormeaux Kyllian\",\"FRA\",\"M\",\"\",\"2008\"\n" +
                "\"104\",\"3214338\",\"Edwards Regina\",\"AUS\",\"F\",\"\",\"1975\"\n" +
                "\"105\",\"45178992\",\"Villemur Denis\",\"FRA\",\"M\",\"\",\"1959\"\n" +
                "\"106\",\"10616977\",\"Abdel Fatah Khaled\",\"EGY\",\"M\",\"\",\"1969\"\n" +
                "\"107\",\"1653067\",\"Brandsteidl Karl\",\"AUT\",\"M\",\"\",\"1942\"\n" +
                "\"108\",\"256404\",\"Bauman Robert\",\"BEL\",\"M\",\"\",\"1982\"\n" +
                "\"109\",\"11618124\",\"Mikelsons Mikelis\",\"LAT\",\"M\",\"\",\"2005\"\n" +
                "\"110\",\"2313650\",\"Hardarson Gudni Karl\",\"ISL\",\"M\",\"\",\"1954\"\n" +
                "\"111\",\"3602516\",\"Velasquez Garcia Luis Moises\",\"ECU\",\"M\",\"\",\"1995\"\n" +
                "\"112\",\"661430\",\"Paravagna Alain\",\"FRA\",\"M\",\"\",\"1956\"\n" +
                "\"113\",\"12986232\",\"Stuelcken Philipp\",\"GER\",\"M\",\"\",\"2000\"\n" +
                "\"114\",\"2945576\",\"Andrade Rolando\",\"BUL\",\"M\",\"\",\"1990\"\n" +
                "\"115\",\"1472747\",\"Stefansson Atli Rafn\",\"DEN\",\"M\",\"\",\"1991\"\n" +
                "\"116\",\"32714610\",\"Faham Babak\",\"IRI\",\"M\",\"\",\"1972\"\n" +
                "\"117\",\"24673765\",\"Prox Oswald\",\"GER\",\"M\",\"\",\"1929\"\n" +
                "\"118\",\"14222736\",\"Mirzaev Islombek\",\"UZB\",\"M\",\"\",\"2011\"\n" +
                "\"119\",\"4142098\",\"Sharikov Leonid\",\"RUS\",\"M\",\"\",\"1940\"\n" +
                "\"120\",\"20661177\",\"Rosetta Pascal\",\"FRA\",\"M\",\"\",\"1969\"\n" +
                "\"121\",\"12821608\",\"Scerba Valerij\",\"LTU\",\"M\",\"\",\"1949\"\n" +
                "\"122\",\"6375294\",\"Saglam Umit\",\"TUR\",\"M\",\"\",\"1984\"\n" +
                "\"123\",\"3955656\",\"Montilva Muller Sebastian Daniel\",\"VEN\",\"M\",\"\",\"2007\"\n" +
                "\"124\",\"551035430\",\"Puc Fabrice\",\"FRA\",\"M\",\"\",\"1971\"\n" +
                "\"125\",\"25829343\",\"Aleiferi Aikaterini\",\"GRE\",\"F\",\"\",\"2005\"\n" +
                "\"126\",\"25684434\",\"Susanta Sarma H S V S K S H\",\"IND\",\"M\",\"\",\"2011\"\n" +
                "\"127\",\"24286664\",\"Akhmurzanov Damir\",\"RUS\",\"M\",\"\",\"2010\"\n" +
                "\"128\",\"3711293\",\"Meza Soto Fabian Ezequiel\",\"PAR\",\"M\",\"\",\"2001\"\n" +
                "\"129\",\"4134842\",\"Trofimov Viktor\",\"RUS\",\"M\",\"\",\"1953\"\n" +
                "\"130\",\"24165107\",\"Filatov Anatoly\",\"RUS\",\"M\",\"\",\"1939\"\n" +
                "\"131\",\"21016453\",\"Walawicz Jerzy\",\"POL\",\"M\",\"\",\"1960\"\n" +
                "\"132\",\"3405710\",\"Vilches Romero Eduardo\",\"CHI\",\"M\",\"\",\"1986\"\n" +
                "\"133\",\"878642\",\"Podgornik Massimo\",\"ITA\",\"M\",\"\",\"1961\"\n" +
                "\"134\",\"2856358\",\"Ovidi Marco\",\"ITA\",\"M\",\"\",\"2007\"\n" +
                "\"135\",\"796638\",\"Molnar Lajos\",\"HUN\",\"M\",\"\",\"1986\"\n" +
                "\"136\",\"2205670\",\"Timon Piote Vicente\",\"ESP\",\"M\",\"\",\"1976\"\n" +
                "\"137\",\"14562154\",\"Stojanovic Dino\",\"CRO\",\"M\",\"\",\"2007\"\n" +
                "\"138\",\"165328\",\"Prado Ignacio\",\"ARG\",\"M\",\"\",\"2002\"\n" +
                "\"139\",\"1214543\",\"Stoica Ion\",\"ROU\",\"M\",\"\",\"1944\"\n" +
                "\"140\",\"34150161\",\"Gontarenko Andrei\",\"UKR\",\"M\",\"\",\"2007\"\n" +
                "\"141\",\"443808\",\"Imykshenova Eugenia\",\"ENG\",\"F\",\"\",\"1978\"\n" +
                "\"142\",\"32784589\",\"Nikkhou Danyal\",\"IRI\",\"M\",\"\",\"2007\"\n" +
                "\"143\",\"12988561\",\"Pritsch Michael Dr.\",\"GER\",\"M\",\"\",\"1981\"\n" +
                "\"144\",\"28523792\",\"Giana Gian Pietro\",\"ITA\",\"M\",\"\",\"1963\"\n" +
                "\"145\",\"28529332\",\"Degli Atti Lorenzo\",\"ITA\",\"M\",\"\",\"2007\"\n" +
                "\"146\",\"22287868\",\"Azcona Esteras Fermin\",\"ESP\",\"M\",\"\",\"1998\"\n" +
                "\"147\",\"14935686\",\"Stutika Benjamin\",\"SVK\",\"M\",\"\",\"2002\"\n" +
                "\"148\",\"13728075\",\"Aidarkhan Mariyam\",\"KAZ\",\"M\",\"\",\"2006\"\n" +
                "\"149\",\"256749\",\"Tihulca Dan-Ionut\",\"BEL\",\"M\",\"\",\"1988\"\n" +
                "\"150\",\"2859446\",\"Pascolini Alessandra\",\"ITA\",\"F\",\"\",\"2005\"")
                .split("\n"))
                .map(i -> i.split(","))
                .map(i -> new ChessPlayer(i[2].replaceAll("\"",""), i[3].replaceAll("\"",""), i[4].replaceAll("\"","").equals("M") ? Gender.Male : Gender.Female, Integer.parseInt(i[6].replaceAll("\"",""))))
                .toList();
    }

    public HashMap<Gender, PlayersGroup> getPlayersByGender() {
        HashMap<Gender, PlayersGroup> map = new HashMap<>();
        map.put(Gender.Male, new PlayersGroup(new ArrayList<>()));
        map.put(Gender.Female, new PlayersGroup(new ArrayList<>()));
        players.forEach(player -> map.get(player.getGender()).getPlayers().add(player));
        return map;
    }

    public HashMap<String, List<ChessPlayer>> getPlayersByCountry() {
        HashMap<String, List<ChessPlayer>> map = new HashMap<>();
        players.forEach(player -> {
            if(!map.containsKey(player.getFederation())) map.put(player.getFederation(), new ArrayList<>());
            map.get(player.getFederation()).add(player);
        });
        return map;
    }
}
