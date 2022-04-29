package com.example.pracevhodine.services;

import com.example.pracevhodine.models.Game;

import javax.enterprise.context.ApplicationScoped;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@ApplicationScoped
public class GamesService {

    private List<Game> games;

    public GamesService() {
        games = Arrays.stream(("\"1\",\"499\",\"Little Triangle\",\"Jan 20 2017\",\"11.99\",\"0 .. 20000\",\"CottonGame\",\"Dreamoji\",\"0\",\"0\",\"98\"\n" +
                "\"2\",\"5052\",\"DEEP SPACE WAIFU: NEKOMIMI\",\"Dec 18 2018\",\"1.99\",\"0 .. 20000\",\"Neko Climax Studios\",\"Neko Climax Studios\",\"0\",\"0\",\"98\"\n" +
                "\"3\",\"1973\",\"Meltys Quest\",\"Oct 24 2017\",\"19.99\",\"20000 .. 50000\",\"Remtairy Happy Life\",\"Remtairy Kagura Games\",\"0\",\"0\",\"97\"\n" +
                "\"4\",\"1\",\"Half-Life 2\",\"Nov 16 2004\",\"9.99\",\"10000000 .. 20000000\",\"Valve\",\"Valve\",\"110\",\"66\",\"96\"\n" +
                "\"5\",\"1\",\"BioShock\",\"Aug 21 2007\",\"19.99\",\"2000000 .. 5000000\",\"2K Boston 2K Australia\",\"2K\",\"0\",\"0\",\"96\"\n" +
                "\"6\",\"1\",\"Grand Theft Auto V\",\"Apr 14 2015\",\"29.99\",\"10000000 .. 20000000\",\"Rockstar North\",\"Rockstar Games\",\"697\",\"234\",\"96\"\n" +
                "\"7\",\"1\",\"Portal 2\",\"Apr 18 2011\",\"9.99\",\"10000000 .. 20000000\",\"Valve\",\"Valve\",\"147\",\"154\",\"95\"\n" +
                "\"8\",\"5744\",\"Deep Space Waifu: FLAT JUSTICE\",\"Dec 7 2017\",\"1.99\",\"50000 .. 100000\",\"Neko Climax Studios\",\"Neko Climax Studios\",\"2\",\"0\",\"95\"\n" +
                "\"9\",\"1\",\"Sid Meier's Civilization IV\",\"Oct 25 2005\",\"19.99\",\"1000000 .. 2000000\",\"Firaxis Games\",\"2K\",\"0\",\"0\",\"94\"\n" +
                "\"10\",\"1\",\"The Elder Scrolls IV: Oblivion Game of the Year Edition\",\"Jun 16 2009\",\"14.99\",\"2000000 .. 5000000\",\"Bethesda Game Studios\",\"Bethesda Softworks\",\"397\",\"264\",\"94\"\n" +
                "\"11\",\"2\",\"The Elder Scrolls IV: Oblivion Game of the Year Edition Deluxe\",\"Jun 16 2009\",\"19.99\",\"0 .. 20000\",\"Bethesda Game Studios®\",\"Bethesda Softworks\",\"0\",\"0\",\"94\"\n" +
                "\"12\",\"1\",\"Mass Effect 2\",\"Jan 26 2010\",\"19.99\",\"2000000 .. 5000000\",\"BioWare\",\"Electronic Arts\",\"0\",\"0\",\"94\"\n" +
                "\"13\",\"2\",\"Mass Effect 2 Digital Deluxe Edition\",\"Jan 27 2010\",\"29.99\",\"0 .. 20000\",\"BioWare\",\"Electronic Arts\",\"0\",\"0\",\"94\"\n" +
                "\"14\",\"3\",\"The Elder Scrolls V: Skyrim\",\"Nov 10 2011\",\"19.99\",\"10000000 .. 20000000\",\"Bethesda Game Studios\",\"Bethesda Softworks\",\"528\",\"567\",\"94\"\n" +
                "\"15\",\"2\",\"Grand Theft Auto: Vice City\",\"Jan 10 2011\",\"9.99\",\"2000000 .. 5000000\",\"Rockstar Games\",\"Rockstar Games\",\"6\",\"3\",\"94\"\n" +
                "\"16\",\"1\",\"BioShock Infinite\",\"Mar 25 2013\",\"29.99\",\"2000000 .. 5000000\",\"Irrational Games Virtual Programming (Linux)\",\"2K\",\"75\",\"25\",\"94\"\n" +
                "\"17\",\"2\",\"Divinity: Original Sin - Enhanced Edition\",\"Oct 27 2015\",\"39.99\",\"1000000 .. 2000000\",\"Larian Studios\",\"Larian Studios\",\"0\",\"0\",\"94\"\n" +
                "\"18\",\"2930\",\"Kara no Shojo\",\"Oct 22 2018\",\"34.99\",\"0 .. 20000\",\"Innocent Grey\",\"MangaGamer\",\"0\",\"0\",\"94\"\n" +
                "\"19\",\"2\",\"Unreal Tournament 2004: Editor's Choice Edition\",\"Mar 16 2004\",\"14.99\",\"500000 .. 1000000\",\"Epic Games Inc.\",\"Epic Games Inc.\",\"0\",\"0\",\"93\"\n" +
                "\"20\",\"2\",\"Grand Theft Auto: San Andreas\",\"Jun 6 2005\",\"14.99\",\"2000000 .. 5000000\",\"Rockstar Games\",\"Rockstar Games\",\"373\",\"236\",\"93\"\n" +
                "\"21\",\"1\",\"Company of Heroes\",\"Sep 11 2006\",\"19.99\",\"500000 .. 1000000\",\"Relic Entertainment\",\"SEGA\",\"0\",\"0\",\"93\"\n" +
                "\"22\",\"2\",\"Company of Heroes - Legacy Edition\",\"Jul 17 2007\",\"19.99\",\"2000000 .. 5000000\",\"Relic Entertainment\",\"SEGA\",\"0\",\"0\",\"93\"\n" +
                "\"23\",\"4\",\"Grand Theft Auto III\",\"Jan 6 2011\",\"9.99\",\"2000000 .. 5000000\",\"Rockstar Games\",\"Rockstar Games\",\"0\",\"0\",\"93\"\n" +
                "\"24\",\"3\",\"The Witcher 3: Wild Hunt\",\"May 18 2015\",\"39.99\",\"5000000 .. 10000000\",\"CD PROJEKT RED\",\"CD PROJEKT RED\",\"609\",\"281\",\"93\"\n" +
                "\"25\",\"1\",\"Divinity: Original Sin 2 - Definitive Edition\",\"Sep 14 2017\",\"44.99\",\"2000000 .. 5000000\",\"Larian Studios\",\"Larian Studios\",\"717\",\"532\",\"93\"\n" +
                "\"26\",\"3\",\"Tom Clancy's Splinter Cell Chaos Theory\",\"Mar 29 2005\",\"9.99\",\"200000 .. 500000\",\"Ubisoft Montreal\",\"Ubisoft\",\"0\",\"0\",\"92\"\n" +
                "\"27\",\"4\",\"Team Fortress 2\",\"Oct 10 2007\",NA,\"50000000 .. 100000000\",\"Valve\",\"Valve\",\"336\",\"108\",\"92\"\n" +
                "\"28\",\"3\",\"Call of Duty 4: Modern Warfare\",\"Nov 12 2007\",\"19.99\",\"1000000 .. 2000000\",\"Infinity Ward\",\"Activision\",\"0\",\"0\",\"92\"\n" +
                "\"29\",\"5\",\"Rome: Total War - Collection\",\"Aug 28 2007\",\"12.99\",\"1000000 .. 2000000\",\"CREATIVE ASSEMBLY\",\"SEGA\",\"349\",\"183\",\"92\"\n" +
                "\"30\",\"1\",\"Unreal Tournament: Game of the Year Edition\",\"Mar 17 2008\",\"9.99\",\"200000 .. 500000\",\"Epic Games Inc.\",\"Epic Games Inc.\",\"0\",\"0\",\"92\"\n" +
                "\"31\",\"3\",\"Tom Clancy's Splinter Cell Chaos Theory\",\"Aug 27 2009\",\"9.99\",\"200000 .. 500000\",\"Ubisoft Montreal\",\"Ubisoft\",\"0\",\"0\",\"92\"\n" +
                "\"32\",\"282\",\"Sam & Max: The Devil’s Playhouse\",\"Apr 15 2010\",\"19.99\",\"0 .. 20000\",\"Telltale Games\",\"Telltale Games\",\"0\",\"0\",\"92\"\n" +
                "\"33\",\"5\",\"Galactic Civilizations II: Ultimate Edition\",\"Dec 2 2011\",\"19.99\",\"500000 .. 1000000\",\"Stardock Entertainment\",\"Stardock Entertainment\",\"0\",\"0\",\"92\"\n" +
                "\"34\",\"4\",\"Undertale\",\"Sep 15 2015\",\"9.99\",\"2000000 .. 5000000\",\"tobyfox\",\"tobyfox\",\"0\",\"0\",\"92\"\n" +
                "\"35\",\"1\",\"Out of the Park Baseball 17\",\"Mar 22 2016\",\"19.99\",\"100000 .. 200000\",\"Out of the Park Developments\",\"Out of the Park Developments\",\"332\",\"110\",\"92\"\n" +
                "\"36\",\"2\",\"OKAMI HD / 大神 絶景版\",\"Dec 12 2017\",\"19.99\",\"200000 .. 500000\",\"CAPCOM Co. Ltd.\",\"CAPCOM Co. Ltd.\",\"0\",\"0\",\"92\"\n" +
                "\"37\",\"2\",\"Call of Duty\",\"Oct 13 2006\",\"19.99\",\"200000 .. 500000\",\"Infinity Ward\",\"Activision\",\"0\",\"0\",\"91\"\n" +
                "\"38\",\"6\",\"The Longest Journey\",\"May 1 2007\",\"9.99\",\"200000 .. 500000\",\"Funcom\",\"Funcom\",\"0\",\"0\",\"91\"\n" +
                "\"39\",\"3\",\"Fallout 3\",\"Oct 28 2008\",\"9.99\",\"500000 .. 1000000\",\"Bethesda Game Studios\",\"Bethesda Softworks\",\"0\",\"0\",\"91\"\n" +
                "\"40\",\"2\",\"Tom Clancy's Splinter Cell\",\"Apr 1 2008\",\"9.99\",\"200000 .. 500000\",\"Ubisoft\",\"Ubisoft\",\"0\",\"0\",\"91\"\n" +
                "\"41\",\"7\",\"Fallout 3: Game of the Year Edition\",\"Dec 17 2009\",\"19.99\",\"2000000 .. 5000000\",\"Bethesda Game Studios\",\"Bethesda Softworks\",\"0\",\"0\",\"91\"\n" +
                "\"42\",\"5\",\"STAR WARS Jedi Knight: Dark Forces II\",\"Sep 16 2009\",\"5.99\",\"1000000 .. 2000000\",\"LucasArts\",\"LucasArts Lucasfilm Disney Interactive\",\"0\",\"0\",\"91\"\n" +
                "\"43\",\"4\",\"Dragon Age: Origins\",\"Nov 6 2009\",\"19.99\",\"500000 .. 1000000\",\"BioWare\",\"Electronic Arts\",\"0\",\"0\",\"91\"\n" +
                "\"44\",\"6\",\"Street Fighter IV\",\"Jul 7 2009\",\"19.99\",\"100000 .. 200000\",\"Capcom\",\"Capcom\",\"0\",\"0\",\"91\"\n" +
                "\"45\",\"4\",\"Batman: Arkham Asylum Game of the Year Edition\",\"Mar 26 2010\",\"19.99\",\"2000000 .. 5000000\",\"Rocksteady Studios Feral Interactive (Mac)\",\"Warner Bros. Interactive Entertainment Feral Interactive (Mac)\",\"196\",\"130\",\"91\"\n" +
                "\"46\",\"3\",\"Dragon Age: Origins - Ultimate Edition\",\"Oct 26 2010\",\"29.99\",\"1000000 .. 2000000\",\"BioWare\",\"Electronic Arts\",\"0\",\"0\",\"91\"\n" +
                "\"47\",\"1\",\"Dishonored\",\"Oct 8 2012\",\"9.99\",\"2000000 .. 5000000\",\"Arkane Studios\",\"Bethesda Softworks\",\"0\",\"0\",\"91\"\n" +
                "\"48\",\"2\",\"Batman: Arkham City - Game of the Year Edition\",\"Sep 7 2012\",\"19.99\",\"2000000 .. 5000000\",\"Rocksteady Studios Feral Interactive (Mac)\",\"Warner Bros. Interactive Entertainment Feral Interactive (Mac)\",\"178\",\"59\",\"91\"\n" +
                "\"49\",\"2\",\"Deus Ex: Human Revolution - Director's Cut\",\"Oct 25 2013\",\"19.99\",\"1000000 .. 2000000\",\"Eidos Montreal Feral Interactive (Mac)\",\"Square Enix Feral Interactive (Mac)\",\"0\",\"0\",\"91\"\n" +
                "\"50\",\"3\",\"FEZ\",\"May 1 2013\",\"9.99\",\"1000000 .. 2000000\",\"Polytron Corporation\",\"Trapdoor\",\"50\",\"16\",\"91\"\n" +
                "\"51\",\"2\",\"DARK SOULS II\",\"Apr 25 2014\",\"39.99\",\"1000000 .. 2000000\",\"FromSoftware Inc\",\"BANDAI NAMCO Entertainment FromSoftware Inc\",\"0\",\"0\",\"91\"\n" +
                "\"52\",\"1\",\"Freespace 2\",\"Jun 6 2014\",\"9.99\",\"20000 .. 50000\",\"Volition Inc\",\"Interplay Corp\",\"0\",\"0\",\"91\"\n" +
                "\"53\",\"5\",\"METAL GEAR SOLID V: THE PHANTOM PAIN\",\"Sep 1 2015\",\"19.99\",\"1000000 .. 2000000\",\"Konami Digital Entertainment\",\"Konami Digital Entertainment\",\"220\",\"157\",\"91\"\n" +
                "\"54\",\"2\",\"Tumblestone\",\"Jul 12 2016\",\"24.99\",\"50000 .. 100000\",\"The Quantum Astrophysicists Guild\",\"The Quantum Astrophysicists Guild\",\"343\",\"166\",\"91\"\n" +
                "\"55\",\"8\",\"Portal\",\"Oct 10 2007\",\"9.99\",\"10000000 .. 20000000\",\"Valve\",\"Valve\",\"69\",\"24\",\"90\"\n" +
                "\"56\",\"7\",\"Half-Life 2: Episode Two\",\"Oct 10 2007\",\"7.99\",\"5000000 .. 10000000\",\"Valve\",\"Valve\",\"15\",\"5\",\"90\"\n" +
                "\"57\",\"9\",\"Deus Ex: Game of the Year Edition\",\"Mar 29 2007\",\"6.99\",\"1000000 .. 2000000\",\"Ion Storm\",\"Square Enix\",\"0\",\"0\",\"90\"\n" +
                "\"58\",\"5\",\"Grand Theft Auto IV\",\"Dec 2 2008\",\"19.99\",\"2000000 .. 5000000\",\"Rockstar North Rockstar Toronto\",\"Rockstar Games\",\"83\",\"49\",\"90\"\n" +
                "\"59\",\"6\",\"World of Goo\",\"Oct 13 2008\",\"14.99\",\"1000000 .. 2000000\",\"2D BOY\",\"2D BOY\",\"0\",\"0\",\"90\"\n" +
                "\"60\",\"4\",\"Silent Hunter III\",\"Jun 13 2008\",\"9.99\",\"100000 .. 200000\",\"Ubisoft\",\"Ubisoft\",\"0\",\"0\",\"90\"\n" +
                "\"61\",\"8\",\"Braid\",\"Apr 10 2009\",\"14.99\",\"1000000 .. 2000000\",\"Number None\",\"Number None\",\"0\",\"0\",\"90\"\n" +
                "\"62\",\"9\",\"Freedom Force\",\"May 29 2009\",\"4.99\",\"200000 .. 500000\",\"Irrational Games\",\"2K\",\"0\",\"0\",\"90\"\n" +
                "\"63\",\"6\",\"Sid Meier's Civilization V\",\"Sep 21 2010\",\"29.99\",\"10000000 .. 20000000\",\"Firaxis Games Aspyr (Mac) Aspyr (Linux)\",\"2K Aspyr (Mac) Aspyr (Linux)\",\"329\",\"288\",\"90\"\n" +
                "\"64\",\"5\",\"Grand Theft Auto IV: Complete Edition\",\"Oct 27 2010\",\"29.99\",\"0 .. 20000\",\"Rockstar North Rockstar Toronto\",\"Rockstar Games\",\"0\",\"0\",\"90\"\n" +
                "\"65\",\"6\",\"Total War: SHOGUN 2\",\"Mar 15 2011\",\"29.99\",\"0 .. 20000\",\"CREATIVE ASSEMBLY Feral Interactive (Mac) Feral Interactive (Linux)\",\"SEGA Feral Interactive (Mac) Feral Interactive (Linux)\",\"0\",\"0\",\"90\"\n" +
                "\"66\",\"5\",\"Dota 2\",\"Jul 9 2013\",NA,\"100000000 .. 200000000\",\"Valve\",\"Valve\",\"1498\",\"806\",\"90\"\n" +
                "\"67\",\"4\",\"Brothers - A Tale of Two Sons\",\"Sep 3 2013\",\"14.99\",\"1000000 .. 2000000\",\"Starbreeze Studios AB\",\"505 Games\",\"0\",\"0\",\"90\"\n" +
                "\"68\",\"6\",\"Spelunky\",\"Aug 8 2013\",\"14.99\",\"1000000 .. 2000000\",NA,\"Mossmouth\",\"10\",\"3\",\"90\"\n" +
                "\"69\",\"4\",\"NBA 2K17\",\"Sep 20 2016\",\"59.99\",\"500000 .. 1000000\",\"Visual Concepts\",\"2K\",\"1\",\"0\",\"90\"\n" +
                "\"70\",\"5\",\"N++ (NPLUSPLUS)\",\"Aug 25 2016\",\"14.99\",\"100000 .. 200000\",\"Metanet Software Inc.\",\"Metanet Software Inc.\",\"0\",\"0\",\"90\"\n" +
                "\"71\",\"3\",\"Stephen's Sausage Roll\",\"Apr 18 2016\",\"29.99\",\"20000 .. 50000\",\"increpare games\",\"increpare games\",\"0\",\"0\",\"90\"\n" +
                "\"72\",\"6\",\"Tadpole Treble\",\"Sep 2 2016\",\"4.99\",\"0 .. 20000\",\"BitFinity\",\"BitFinity Sunken Treasure Games\",\"0\",\"0\",\"90\"\n" +
                "\"73\",\"3\",\"Bayonetta\",\"Apr 11 2017\",\"19.99\",\"500000 .. 1000000\",\"PlatinumGames\",\"SEGA\",\"25\",\"8\",\"90\"\n" +
                "\"74\",\"4\",\"Opus Magnum\",\"Dec 7 2017\",\"19.99\",\"200000 .. 500000\",\"Zachtronics\",\"Zachtronics\",\"0\",\"0\",\"90\"\n" +
                "\"75\",\"5\",\"Linelight\",\"Jan 30 2017\",\"9.99\",\"50000 .. 100000\",\"My Dog Zorro\",\"My Dog Zorro\",\"0\",\"0\",\"90\"\n" +
                "\"76\",\"1\",\"Into the Breach\",\"Feb 27 2018\",\"14.99\",\"200000 .. 500000\",\"Subset Games\",\"Subset Games\",\"0\",\"0\",\"90\"\n" +
                "\"77\",\"7\",\"Left 4 Dead\",\"Nov 17 2008\",\"9.99\",\"5000000 .. 10000000\",\"Valve\",\"Valve\",\"88\",\"73\",\"89\"\n" +
                "\"78\",\"11\",\"Mass Effect\",\"May 28 2008\",\"19.99\",\"1000000 .. 2000000\",\"BioWare\",\"Electronic Arts\",\"85\",\"28\",\"89\"\n" +
                "\"79\",\"8\",\"Far Cry\",\"Apr 1 2008\",\"9.99\",\"500000 .. 1000000\",\"Crytek Studios\",\"Ubisoft\",\"0\",\"0\",\"89\"\n" +
                "\"80\",\"9\",\"Max Payne\",\"Jan 4 2008\",\"9.99\",\"500000 .. 1000000\",\"Remedy Entertainment\",\"Rockstar Games\",\"0\",\"0\",\"89\"\n" +
                "\"81\",\"10\",\"Prince of Persia: The Sands of Time\",\"Nov 21 2008\",\"9.99\",\"200000 .. 500000\",\"Kudosoft\",\"Ubisoft\",\"7\",\"2\",\"89\"\n" +
                "\"82\",\"10\",\"Left 4 Dead 2\",\"Nov 16 2009\",\"9.99\",\"10000000 .. 20000000\",\"Valve\",\"Valve\",\"131\",\"73\",\"89\"\n" +
                "\"83\",\"12\",\"The Elder Scrolls III: Morrowind Game of the Year Edition\",\"Jun 16 2009\",\"14.99\",\"1000000 .. 2000000\",\"Bethesda Game Studios\",\"Bethesda Softworks\",\"207\",\"69\",\"89\"\n" +
                "\"84\",\"13\",\"STAR WARS Jedi Knight II - Jedi Outcast\",\"Sep 16 2009\",\"9.99\",\"1000000 .. 2000000\",\"Raven Software\",\"LucasArts Lucasfilm Disney Interactive\",\"0\",\"0\",\"89\"\n" +
                "\"85\",\"11\",\"Sacrifice\",\"Aug 19 2009\",\"9.99\",\"50000 .. 100000\",\"Shiny Entertainment\",\"Interplay Inc.\",\"0\",\"0\",\"89\"\n" +
                "\"86\",\"4\",\"Borderlands 2\",\"Sep 17 2012\",\"19.99\",\"10000000 .. 20000000\",\"Gearbox Software Aspyr (Mac) Aspyr (Linux)\",\"2K Aspyr (Mac) Aspyr (Linux)\",\"542\",\"186\",\"89\"\n" +
                "\"87\",\"3\",\"XCOM: Enemy Unknown\",\"Oct 8 2012\",\"29.99\",\"2000000 .. 5000000\",\"Firaxis Games Feral Interactive (Mac) Feral Interactive (Linux)\",\"2K Feral Interactive (Mac) Feral Interactive (Linux)\",\"0\",\"0\",\"89\"\n" +
                "\"88\",\"7\",\"Rayman Legends\",\"Sep 3 2013\",\"29.99\",\"200000 .. 500000\",NA,\"Ubisoft\",\"124\",\"41\",\"89\"\n" +
                "\"89\",\"4\",\"Rise of Nations: Extended Edition\",\"Jun 12 2014\",\"19.99\",\"500000 .. 1000000\",\"SkyBox Labs Big Huge Games\",\"Xbox Game Studios\",\"1\",\"0\",\"89\"\n" +
                "\"90\",\"3\",\"Descent 3\",\"Apr 15 2014\",\"9.99\",\"0 .. 20000\",\"Outrage Entertainment\",\"Interplay Inc.\",\"0\",\"0\",\"89\"\n" +
                "\"91\",\"6\",\"Pillars of Eternity\",\"Mar 26 2015\",\"29.99\",\"1000000 .. 2000000\",\"Obsidian Entertainment\",\"Paradox Interactive\",\"0\",\"0\",\"89\"\n" +
                "\"92\",\"7\",\"Fallout: A Post Nuclear Role Playing Game\",\"Nov 1 2015\",\"9.99\",\"1000000 .. 2000000\",\"Interplay Inc.\",\"Bethesda Softworks\",\"0\",\"0\",\"89\"\n" +
                "\"93\",\"7\",\"DARK SOULS III\",\"Apr 11 2016\",\"59.99\",\"2000000 .. 5000000\",\"FromSoftware Inc.\",\"FromSoftware Inc. BANDAI NAMCO Entertainment\",\"868\",\"1066\",\"89\"\n" +
                "\"94\",\"9\",\"Stardew Valley\",\"Feb 26 2016\",\"14.99\",\"2000000 .. 5000000\",\"ConcernedApe\",\"ConcernedApe\",\"499\",\"566\",\"89\"\n" +
                "\"95\",\"8\",\"Street Fighter V\",\"Feb 15 2016\",\"19.99\",\"500000 .. 1000000\",\"Capcom\",\"Capcom\",\"120\",\"40\",\"89\"\n" +
                "\"96\",\"7\",\"F1 2017\",\"Aug 24 2017\",\"59.99\",\"200000 .. 500000\",\"Codemasters Feral Interactive (Mac) Feral Interactive (Linux)\",\"Codemasters Feral Interactive (Mac) Feral Interactive (Linux)\",\"1\",\"0\",\"89\"\n" +
                "\"97\",\"8\",\"What Remains of Edith Finch\",\"Apr 24 2017\",\"19.99\",\"200000 .. 500000\",\"Giant Sparrow\",\"Annapurna Interactive\",\"5\",\"1\",\"89\"\n" +
                "\"98\",\"6\",\"Pinball FX3\",\"Sep 26 2017\",\"23.97\",\"50000 .. 100000\",\"Zen Studios\",\"Zen Studios\",\"0\",\"0\",\"89\"\n" +
                "\"99\",\"9\",\"Rez Infinite\",\"Aug 9 2017\",\"24.99\",\"20000 .. 50000\",\"Monstars Inc. Resonair\",\"Enhance\",\"0\",\"0\",\"89\"\n" +
                "\"100\",\"2\",\"Dead Cells\",\"Aug 6 2018\",\"24.99\",\"1000000 .. 2000000\",\"Motion Twin\",\"Motion Twin\",\"73\",\"85\",\"89\"\n" +
                "\"101\",\"3\",\"Return of the Obra Dinn\",\"Oct 18 2018\",\"19.99\",\"100000 .. 200000\",\"Lucas Pope\",\"3909\",\"0\",\"0\",\"89\"\n" +
                "\"102\",\"4\",\"The Curse of Monkey Island\",\"Mar 22 2018\",\"6.99\",\"50000 .. 100000\",\"LucasArts\",\"LucasArts Lucasfilm Disney\",\"0\",\"0\",\"89\"\n" +
                "\"103\",\"3\",\"Counter-Strike: Source\",\"Nov 1 2004\",\"9.99\",\"10000000 .. 20000000\",\"Valve\",\"Valve\",\"236\",\"128\",\"88\"\n" +
                "\"104\",\"4\",\"Sid Meier's Pirates!\",\"Jul 11 2005\",\"9.99\",\"500000 .. 1000000\",\"Firaxis Games\",\"2K\",\"0\",\"0\",\"88\"\n" +
                "\"105\",\"10\",\"Return to Castle Wolfenstein\",\"Aug 3 2007\",\"4.99\",\"200000 .. 500000\",\"Gray Matter Studios\",\"Bethesda-Softworks\",\"0\",\"0\",\"88\"\n" +
                "\"106\",\"8\",\"BioShock 2\",\"Feb 9 2010\",NA,\"2000000 .. 5000000\",\"2K Marin 2K China Digital Extremes 2K Australia Feral Interactive (Mac)\",\"2K Feral Interactive (Mac)\",\"0\",\"0\",\"88\"\n" +
                "\"107\",\"7\",\"F.E.A.R.\",\"May 21 2010\",\"54.99\",\"1000000 .. 2000000\",\"Monolith Productions Inc. Timegate\",\"Warner Bros. Interactive Entertainment\",\"0\",\"0\",\"88\"\n" +
                "\"108\",\"8\",\"LIMBO\",\"Aug 2 2011\",\"9.99\",\"2000000 .. 5000000\",\"Playdead\",\"Playdead\",\"141\",\"84\",\"88\"\n" +
                "\"109\",\"7\",\"Assassin’s Creed Brotherhood\",\"Mar 22 2011\",\"19.99\",\"1000000 .. 2000000\",\"Ubisoft Montreal\",\"Ubisoft\",\"0\",\"0\",\"88\"\n" +
                "\"110\",\"7\",\"The Witcher 2: Assassins of Kings Enhanced Edition\",\"Apr 16 2012\",\"19.99\",\"5000000 .. 10000000\",\"CD PROJEKT RED\",\"CD PROJEKT RED 1C-SoftClub\",\"276\",\"275\",\"88\"\n" +
                "\"111\",\"6\",\"Torchlight II\",\"Sep 20 2012\",\"19.99\",\"2000000 .. 5000000\",\"Runic Games\",\"Runic Games\",\"32\",\"10\",\"88\"\n" +
                "\"112\",\"8\",\"Far Cry 3\",\"Dec 4 2012\",\"19.99\",\"2000000 .. 5000000\",\"Ubisoft Montreal Massive Entertainment and Ubisoft Shanghai\",\"Ubisoft\",\"157\",\"52\",\"88\"\n" +
                "\"113\",\"9\",\"Super Hexagon\",\"Nov 27 2012\",\"2.99\",\"1000000 .. 2000000\",\"Terry Cavanagh\",\"Terry Cavanagh\",\"0\",\"0\",\"88\"\n" +
                "\"114\",\"5\",\"Thirty Flights of Loving\",\"Aug 20 2012\",\"4.99\",\"100000 .. 200000\",\"Blendo Games\",\"Blendo Games\",\"0\",\"0\",\"88\"\n" +
                "\"115\",\"8\",\"The Stanley Parable\",\"Oct 17 2013\",\"14.99\",\"2000000 .. 5000000\",\"Galactic Cafe\",\"Galactic Cafe\",\"0\",\"0\",\"88\"\n" +
                "\"116\",\"9\",\"Guacamelee! Gold Edition\",\"Aug 8 2013\",\"14.99\",\"500000 .. 1000000\",\"DrinkBox Studios\",\"DrinkBox Studios\",\"0\",\"0\",\"88\"\n" +
                "\"117\",\"8\",\"Kerbal Space Program\",\"Apr 27 2015\",\"39.99\",\"2000000 .. 5000000\",\"Squad\",\"Private Division\",\"0\",\"0\",\"88\"\n" +
                "\"118\",\"9\",\"Ori and the Blind Forest\",\"Mar 10 2015\",NA,\"1000000 .. 2000000\",\"Moon Studios GmbH\",\"Xbox Game Studios\",\"0\",\"0\",\"88\"\n" +
                "\"119\",\"10\",\"Nuclear Throne\",\"Dec 5 2015\",\"11.99\",\"500000 .. 1000000\",\"Vlambeer\",\"Vlambeer\",\"4\",\"1\",\"88\"\n" +
                "\"120\",\"10\",\"Sid Meier’s Civilization VI\",\"Oct 20 2016\",\"59.99\",\"2000000 .. 5000000\",\"Firaxis Games Aspyr (Mac) Aspyr (Linux)\",\"2K Aspyr (Mac) Aspyr (Linux)\",\"783\",\"646\",\"88\"\n" +
                "\"121\",\"12\",\"XCOM 2\",\"Feb 4 2016\",\"59.99\",\"1000000 .. 2000000\",\"Firaxis Games Feral Interactive (Mac) Feral Interactive (Linux)\",\"2K Feral Interactive (Mac) Feral Interactive (Linux)\",\"561\",\"557\",\"88\"\n" +
                "\"122\",\"13\",\"Ori and the Blind Forest: Definitive Edition\",\"Apr 27 2016\",\"19.99\",\"1000000 .. 2000000\",\"Moon Studios GmbH\",\"Xbox Game Studios\",\"92\",\"57\",\"88\"\n" +
                "\"123\",\"11\",\"Owlboy\",\"Nov 1 2016\",\"24.99\",\"200000 .. 500000\",\"D-Pad Studio\",\"D-Pad Studio\",\"0\",\"0\",\"88\"\n" +
                "\"124\",\"10\",\"Cuphead\",\"Sep 29 2017\",\"19.99\",\"1000000 .. 2000000\",\"Studio MDHR Entertainment Inc.\",\"Studio MDHR Entertainment Inc.\",\"32\",\"14\",\"88\"\n" +
                "\"125\",\"11\",\"Night in the Woods\",\"Feb 21 2017\",\"19.99\",\"200000 .. 500000\",\"Infinite Fall\",\"Finji\",\"0\",\"0\",\"88\"\n" +
                "\"126\",\"12\",\"Shogo: Mobile Armor Division\",\"Apr 14 2017\",\"6.99\",\"0 .. 20000\",\"Monolith Productions\",\"Interplay Entertainment Corp.\",\"0\",\"0\",\"88\"\n" +
                "\"127\",\"6\",\"MONSTER HUNTER: WORLD\",\"Aug 9 2018\",\"59.99\",\"5000000 .. 10000000\",\"CAPCOM Co. Ltd.\",\"CAPCOM Co. Ltd.\",\"914\",\"286\",\"88\"\n" +
                "\"128\",\"7\",\"Celeste\",\"Jan 25 2018\",\"19.99\",\"200000 .. 500000\",\"Matt Makes Games Inc.\",\"Matt Makes Games Inc.\",\"40\",\"26\",\"88\"\n" +
                "\"129\",\"8\",\"Pillars of Eternity II: Deadfire\",\"May 8 2018\",\"49.99\",\"200000 .. 500000\",\"Obsidian Entertainment\",\"Versus Evil Obsidian Entertainment\",\"0\",\"0\",\"88\"\n" +
                "\"130\",\"5\",\"DUSK\",\"Dec 10 2018\",\"20\",\"100000 .. 200000\",\"David Szymanski\",\"New Blood Interactive\",\"0\",\"0\",\"88\"\n" +
                "\"131\",\"4\",\"DOOM 3\",\"Aug 3 2004\",\"4.99\",\"500000 .. 1000000\",\"id Software\",\"id Software\",\"0\",\"0\",\"87\"\n" +
                "\"132\",\"5\",\"Brothers in Arms: Road to Hill 30\",\"Mar 15 2005\",\"9.99\",\"100000 .. 200000\",\"Gearbox Software\",\"Ubisoft\",\"0\",\"0\",\"87\"\n" +
                "\"133\",\"5\",\"Half-Life 2: Episode One\",\"Jun 1 2006\",\"7.99\",\"5000000 .. 10000000\",\"Valve\",\"Valve\",\"12\",\"4\",\"87\"\n" +
                "\"134\",\"3\",\"Psychonauts\",\"Oct 11 2006\",\"9.99\",\"2000000 .. 5000000\",\"Double Fine Productions\",\"Double Fine Productions\",\"0\",\"0\",\"87\"\n" +
                "\"135\",\"4\",\"Call of Duty: United Offensive\",\"Oct 13 2006\",\"19.99\",\"200000 .. 500000\",\"Gray Matter Studios\",\"Activision\",\"0\",\"0\",\"87\"\n" +
                "\"136\",\"12\",\"Company of Heroes: Opposing Fronts\",\"Sep 24 2007\",\"19.99\",\"2000000 .. 5000000\",\"Relic Entertainment\",\"SEGA\",\"0\",\"0\",\"87\"\n" +
                "\"137\",\"11\",\"Warhammer 40000: Dawn of War - Dark Crusade\",\"Aug 7 2007\",\"3.24\",\"1000000 .. 2000000\",\"Relic Entertainment\",\"SEGA\",\"113\",\"37\",\"87\"\n" +
                "\"138\",\"86\",\"Sam & Max: Season One\",\"Nov 2 2007\",\"19.99\",\"0 .. 20000\",\"Telltale Games\",\"Telltale Games\",\"0\",\"0\",\"87\"\n" +
                "\"139\",\"12\",\"Brothers in Arms: Road to Hill 30\",\"May 13 2008\",\"9.99\",\"100000 .. 200000\",\"Gearbox Software\",\"Ubisoft\",\"0\",\"0\",\"87\"\n" +
                "\"140\",\"15\",\"Burnout Paradise: The Ultimate Box\",\"Mar 12 2009\",\"19.99\",\"2000000 .. 5000000\",\"Criterion Games\",\"Electronic Arts\",\"0\",\"0\",\"87\"\n" +
                "\"141\",\"14\",\"Plants vs. Zombies GOTY Edition\",\"May 5 2009\",\"4.99\",\"1000000 .. 2000000\",\"PopCap Games Inc.\",\"PopCap Games Inc.\",\"56\",\"61\",\"87\"\n" +
                "\"142\",\"10\",\"Super Meat Boy\",\"Nov 30 2010\",\"14.99\",\"2000000 .. 5000000\",\"Team Meat\",NA,\"0\",\"0\",\"87\"\n" +
                "\"143\",\"12\",\"Battlefield: Bad Company 2\",\"Mar 2 2010\",\"19.99\",\"2000000 .. 5000000\",\"DICE\",\"Electronic Arts\",\"38\",\"12\",\"87\"\n" +
                "\"144\",\"9\",\"Serious Sam Classic: The First Encounter\",\"Mar 22 2010\",NA,\"500000 .. 1000000\",\"Croteam\",\"Devolver Digital\",\"0\",\"0\",\"87\"\n" +
                "\"145\",\"11\",\"Monkey Island 2 Special Edition: LeChuck’s Revenge\",\"Jul 7 2010\",\"9.99\",\"200000 .. 500000\",\"LucasArts\",\"LucasArts Lucasfilm Disney Interactive\",\"16\",\"5\",\"87\"\n" +
                "\"146\",\"9\",\"Dead Space 2\",\"Jan 25 2011\",\"19.99\",\"1000000 .. 2000000\",\"Visceral Games\",\"Electronic Arts\",\"0\",\"0\",\"87\"\n" +
                "\"147\",\"10\",\"Sins of a Solar Empire: Trinity\",\"Nov 16 2011\",\"19.99\",\"200000 .. 500000\",\"Ironclad Games Stardock Entertainment\",\"Stardock Entertainment\",\"0\",\"0\",\"87\"\n" +
                "\"148\",\"10\",\"Max Payne 3\",\"May 31 2012\",\"19.99\",\"1000000 .. 2000000\",\"Rockstar Studios\",\"Rockstar Games\",\"75\",\"49\",\"87\"\n" +
                "\"149\",\"10\",\"Europa Universalis IV\",\"Aug 13 2013\",\"39.99\",\"1000000 .. 2000000\",\"Paradox Development Studio\",\"Paradox Interactive\",\"1331\",\"817\",\"87\"\n" +
                "\"150\",\"11\",\"The Swapper\",\"May 30 2013\",\"14.99\",\"500000 .. 1000000\",\"Olli Harjola Otto Hantula Tom Jubert Carlo Castellano\",\"Facepalm Games\",\"0\",\"0\",\"87\"\n" +
                "\"151\",\"7\",\"Divinity: Original Sin (Classic)\",\"Jun 30 2014\",NA,\"1000000 .. 2000000\",\"Larian Studios\",\"Larian Studios\",\"0\",\"0\",\"87\"\n" +
                "\"152\",\"5\",\"Shadowrun: Dragonfall - Director's Cut\",\"Sep 18 2014\",\"14.99\",\"500000 .. 1000000\",\"Harebrained Schemes\",\"Paradox Interactive\",\"0\",\"0\",\"87\"\n" +
                "\"153\",\"6\",\"Wasteland 2: Director's Cut\",\"Sep 18 2014\",\"29.99\",\"500000 .. 1000000\",\"inXile Entertainment\",\"inXile Entertainment\",\"0\",\"0\",\"87\"\n" +
                "\"154\",\"8\",\"TowerFall Ascension\",\"Mar 11 2014\",\"14.99\",\"200000 .. 500000\",\"Matt Thorson\",\"Matt Makes Games Inc.\",\"0\",\"0\",\"87\"\n" +
                "\"155\",\"9\",\"Year Walk\",\"Mar 6 2014\",\"5.99\",\"100000 .. 200000\",\"Simogo\",\"Simogo\",\"0\",\"0\",\"87\"\n" +
                "\"156\",\"11\",\"Dying Light\",\"Jan 26 2015\",\"39.99\",\"2000000 .. 5000000\",\"Techland\",\"Techland Publishing\",\"137\",\"185\",\"87\"\n" +
                "\"157\",\"12\",\"Crypt of the NecroDancer\",\"Apr 23 2015\",\"14.99\",\"1000000 .. 2000000\",\"Brace Yourself Games\",\"Brace Yourself Games Klei Entertainment\",\"116\",\"122\",\"87\"\n" +
                "\"158\",\"13\",\"Oddworld: New 'n' Tasty\",\"Feb 25 2015\",\"19.99\",\"200000 .. 500000\",\"Just Add Water (Developments) Ltd.\",\"Oddworld Inhabitants Inc.\",\"0\",\"0\",\"87\"\n" +
                "\"159\",\"15\",\"INSIDE\",\"Jul 7 2016\",\"19.99\",\"1000000 .. 2000000\",\"Playdead\",\"Playdead\",\"29\",\"9\",\"87\"\n" +
                "\"160\",\"16\",\"The Witness\",\"Jan 26 2016\",\"39.99\",\"500000 .. 1000000\",\"Thekla Inc.\",\"Thekla Inc.\",\"0\",\"0\",\"87\"\n" +
                "\"161\",\"17\",\"HEX: Shards of Fate\",\"Apr 19 2016\",NA,\"200000 .. 500000\",\"Hex Entertainment\",\"Hex Entertainment\",\"0\",\"0\",\"87\"\n" +
                "\"162\",\"14\",\"STEINS;GATE\",\"Sep 8 2016\",\"29.99\",\"100000 .. 200000\",\"MAGES. Inc.\",\"Spike Chunsoft Co. Ltd.\",\"0\",\"0\",\"87\"\n" +
                "\"163\",\"13\",\"Total War: WARHAMMER II\",\"Sep 28 2017\",\"59.99\",\"2000000 .. 5000000\",\"CREATIVE ASSEMBLY Feral Interactive (Mac) Feral Interactive (Linux)\",\"SEGA Feral Interactive (Mac) Feral Interactive (Linux)\",\"396\",\"64\",\"87\"\n" +
                "\"164\",\"14\",\"NBA 2K18\",\"Sep 14 2017\",\"59.99\",\"1000000 .. 2000000\",\"Visual Concepts\",\"2K\",\"77\",\"25\",\"87\"\n" +
                "\"165\",\"16\",\"Orcs Must Die! Unchained\",\"Apr 19 2017\",NA,\"1000000 .. 2000000\",\"Robot Entertainment\",\"Robot Entertainment\",\"0\",\"0\",\"87\"\n" +
                "\"166\",\"18\",\"Hollow Knight\",\"Feb 24 2017\",\"14.99\",\"1000000 .. 2000000\",\"Team Cherry\",\"Team Cherry\",\"685\",\"1177\",\"87\"\n" +
                "\"167\",\"17\",\"West of Loathing\",\"Aug 10 2017\",\"10.99\",\"200000 .. 500000\",\"Asymmetric\",\"Asymmetric\",\"0\",\"0\",\"87\"\n" +
                "\"168\",\"15\",\"Raw Data\",\"Oct 5 2017\",\"39.99\",\"50000 .. 100000\",\"Survios\",\"Survios\",\"0\",\"0\",\"87\"\n" +
                "\"169\",\"10\",\"Subnautica\",\"Jan 23 2018\",\"24.99\",\"2000000 .. 5000000\",\"Unknown Worlds Entertainment\",\"Unknown Worlds Entertainment\",\"17\",\"11\",\"87\"\n" +
                "\"170\",\"11\",\"Iconoclasts\",\"Jan 23 2018\",\"19.99\",\"50000 .. 100000\",\"Joakim Sandberg\",\"Bifrost Entertainment DANGEN Entertainment Gamera Game INTRAGAMES CO. LTD.\",\"0\",\"0\",\"87\"\n" +
                "\"171\",\"9\",\"Unavowed\",\"Aug 8 2018\",\"14.99\",\"20000 .. 50000\",\"Wadjet Eye Games\",\"Wadjet Eye Games\",\"0\",\"0\",\"87\"\n" +
                "\"172\",\"12\",\"Hellblade: Senua's Sacrifice VR Edition\",\"Jul 31 2018\",\"29.99\",\"0 .. 20000\",\"Ninja Theory\",\"Ninja Theory\",\"14\",\"4\",\"87\"\n" +
                "\"173\",\"13\",\"Inside\",\"Oct 25 2018\",\"0.99\",\"0 .. 20000\",\"Garnudo Games\",\"Garnudo Games\",\"0\",\"0\",\"87\"\n" +
                "\"174\",\"8118\",\"Story of Eve - A Hero's Study\",\"Oct 16 2018\",\"2.99\",\"0 .. 20000\",\"SmallSqurriel\",\"SmallSqurriel\",\"0\",\"0\",\"87\"")
                .split("\n"))
                .map(i -> i.split(","))
                .map(i -> new Game(
                        i[2].replaceAll("\"", ""),
                        i[3].replaceAll("\"", ""),
                        !i[4].replaceAll("\"", "").equals("NA") ? Double.parseDouble(i[4].replaceAll("\"", "")) : 0.0,
                        i[6].replaceAll("\"", ""),
                        i[7].replaceAll("\"", ""),
                        !i[10].replaceAll("\"", "").equals("NA") ? Integer.parseInt(i[10].replaceAll("\"", "")) : 0
                        ))
                .toList();
    }

    public List<Game> getGames() {
        return games;
    }

    public Set<String> getPublishers() {
        return games.stream().map(i -> i.getPublisher()).collect(Collectors.toSet());
    }

    public Set<String> getDevelopers() {
        return games.stream().map(i -> i.getDeveloper()).collect(Collectors.toSet());
    }
}
