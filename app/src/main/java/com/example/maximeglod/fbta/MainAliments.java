package com.example.maximeglod.fbta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import android.widget.ImageView;

public class MainAliments extends AppCompatActivity {
//    private ListView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aliments);


        List<Aliments> image_details = getListData();
        final GridView gridView = (GridView) findViewById(R.id.gridView);
        //On utilise notre adapter pour la liste des aliments
        gridView.setAdapter(new CustomGridAdapter(this, image_details));

        // Quand l'utilisateur clique sur un élément de la grid view
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = gridView.getItemAtPosition(position);

                Aliments aliments = (Aliments) o;
        //On renvoie les infos de l'aliment
                Toast.makeText(MainAliments.this, "Selection :"
                        + " " + aliments, Toast.LENGTH_LONG).show();
            }
        });

    }

    //Saisie de tous les aliments en dur

    private List<Aliments> getListData() {
        List<Aliments> list = new ArrayList<Aliments>();
        Aliments ail = new Aliments("Ail", "ail", 5);
        Aliments ailenpoudre = new Aliments("Ail en poudre", "ailenpoudre", 333);
        Aliments amendesblanchiessechees = new Aliments("Amandes Blanchies Séchées", "amandesblanchiessechees",586);
        Aliments amandessechees = new Aliments("Amandes séchées","amandessechees",589);
        Aliments anethfraiche = new Aliments("Aneth Fraiche","anethfraiche",43);
        Aliments anethsechee = new Aliments("Aneth Séchée","anethsechee",253);
        Aliments aromedevanille = new Aliments("Arôme de Vanille","aromedevanille",56);
        Aliments aromedevanillealcool = new Aliments("Arôme de Vanille Alcoolisé","aromedevanillealcool",237);
        Aliments asperges = new Aliments("Asperges","asperges",28);
        Aliments aubergine = new Aliments("Aubergine","aubergine",29);
        Aliments avocat = new Aliments("Avocat","avocat",208);
        Aliments bacon = new Aliments("Bacon","bacon",270);
        Aliments baguette = new Aliments("Baguette","baguette",638);
        Aliments banane = new Aliments("Banane","banane",100);
        Aliments bananesechee = new Aliments("Banane Séchées","bananesechee",292);
        Aliments barloup = new Aliments("Bar Loup","barloup",98);
        Aliments basilicfrais = new Aliments("Basilic Frais","basilicfrais",27);
        Aliments basilicfinesherbes = new Aliments("Basilic Fines Herbes","basilicfinesherbes",251);
        Aliments betaselen = new Aliments("Betaselen","betaselen",0);
        Aliments betteraverouge = new Aliments("Betterave Rouge","betteraverouge",41);
        Aliments beurre = new Aliments("Beurre","beurre",741);
        Aliments biereblonde = new Aliments("Bière Blonde","biereblonde",146);
        Aliments biereordinaire = new Aliments("Bière Ordinaire","biereordinaire",33);
        Aliments bifteckboeuf = new Aliments("Bifteck de Boeuf","bifteckboeuf",174);
        Aliments bifteckcheval = new Aliments("Bifteck de Cheval","bifteckcheval",123);
        Aliments bigmac = new Aliments("BigMac","bigmac",559);
        Aliments bigorneau = new Aliments("Bigorneau","bigorneau",101);
        Aliments biscotte = new Aliments("Biscotte","biscotte",411);
        Aliments biscuitsable = new Aliments("Biscuit Sablé","biscuitsable",457);
        Aliments blancdepoulet = new Aliments("Blanc de Poulet","blancdepoulet",142);
        Aliments blancdoeuf = new Aliments("Blanc d'Oeuf","blancdoeuf",49);
        Aliments boudinblanc = new Aliments("Boudin Blanc","boudinblanc",330);
        Aliments boudinnoir = new Aliments("Boudin Noir","boudinnoir",439);
        Aliments bouillondevolaille = new Aliments("Bouillon de Volaille","bouillondevolaille",307);
        Aliments brie = new Aliments("Brie","brie",10);
        Aliments brochet = new Aliments("Brochet","brochet",10);
        Aliments cabillaud = new Aliments("Cabillaud","cabillaud",10);
        Aliments cacahuettes = new Aliments("Cacahuettes","cacahuettes",10);
        Aliments cafefiltre = new Aliments("Café Filtré","cafefiltre",10);
        Aliments cafenescafe = new Aliments("Café Nescafé","cafenescafe",10);
        Aliments cafenescafe1tasse = new Aliments("Café Nescafé 1 Tasse","cafenescafe1tasse",10);
        Aliments caille = new Aliments("Caille","caille",10);
        Aliments cake = new Aliments("Cake","cake",10);
        Aliments calamarfrit = new Aliments("Calamar Frit","calamarfrit",10);
        Aliments camambert = new Aliments("Camambert","camambert",10);
        Aliments canardroti = new Aliments("Canard Roti","canardroti",10);
        Aliments cannelle = new Aliments("Cannelle","cannelle",10);
        Aliments capresenboite = new Aliments("Câpres en Boite","capresenboite",10);
        Aliments cardamome = new Aliments("Cardamome","cardamome",10);
        Aliments carencyl = new Aliments("Carencyl","carencyl",10);
        Aliments carotte = new Aliments("Carotte","carotte",10);
        Aliments carpe = new Aliments("Carpe","carpe",10);
        Aliments carrelet = new Aliments("Carrelet","carrelet",10);
        Aliments casis = new Aliments("Casis","casis",10);
        Aliments caviar = new Aliments("Caviar","caviar",10);
        Aliments celerifeuille = new Aliments("Céleri en Feuille","celerifeuille",10);
        Aliments celeriracine = new Aliments("Céleri en Racine","celeriracine",10);
        Aliments cerealescropsyfruit = new Aliments("Céréales Cropsy Fruit","cerealescropsyfruit",10);
        Aliments cerealesnature = new Aliments("Céréales Nature","cerealesnature",10);
        Aliments cerfeuille = new Aliments("Cerfeuille","cerfeuille",10);
        Aliments cerises = new Aliments("cerises","cerises",10);
        Aliments chairasaucisse = new Aliments("Chair à Saucisse","chairasaucisse",10);
        Aliments champagne = new Aliments("Champagne","champagne",10);
        Aliments champignons = new Aliments("Champignons","champignons",10);
        Aliments charlottegateau = new Aliments("Charlotte","charlottegateau",10);
        Aliments chataignefraiche = new Aliments("Chataigne Fraiche","chataignefraiche",10);
        Aliments chevalroti = new Aliments("Cheval Rôti","chevalroti",10);
        Aliments chocapic = new Aliments("Chocapic","chocapic",10);
        Aliments chocolatacroquer = new Aliments("Chocolat à Croquer","chocolatacroquer",10);
        Aliments chocolataulait = new Aliments("Chocolat au Lait","chocolataulait",10);
        Aliments chocolatenpoudre = new Aliments("Chocolat en Poudre","chocolatenpoudre",10);
        Aliments choucroutte = new Aliments("Choucroutte","choucroutte",10);
        Aliments choucru = new Aliments("Chou Cru","choucru",10);
        Aliments choufleur = new Aliments("Choufleur","choufleur",10);
        Aliments chouxdebruxelles = new Aliments("Choux De Bruxelles","chouxdebruxelles",10);
        Aliments chrome = new Aliments("Chrome","chrome",10);
        Aliments ciboulettecrue = new Aliments("Ciboulette Crue","ciboulettecrue",10);
        Aliments ciboulettelyophilisee = new Aliments("Ciboulette Lyophiliseee","ciboulettelyophilisee",10);
        Aliments citronjaune = new Aliments("Citron Jaune","citronjaune",10);
        Aliments citronvert = new Aliments("Citron Vert","citronvert",10);
        Aliments citrouille = new Aliments("Citrouille","citrouille",10);
        Aliments clousdegirofle = new Aliments("Clous de Girofle","clousdegirofle",10);
        Aliments calamarnature = new Aliments("Calamar Nature","calmarnature",10);
        Aliments cocacola = new Aliments("Coca-Cola","cocacola",10);
        Aliments cocacolacanette = new Aliments("Coca-Cola Canette","cocacolacanette",10);
        Aliments coeurdeboeuf = new Aliments("Coeur De Boeuf","coeurdeboeuf",10);
        Aliments coing = new Aliments("Coing","coing",10);
        Aliments colinmerlu = new Aliments("Colin Merlu","colinmerlu",10);
        Aliments concombre = new Aliments("Concombre","concombre",10);
        Aliments coneglacecreme = new Aliments("Cône glace crème","coneglacecreme",10);
        Aliments confiture = new Aliments("Confiture","confiture",10);
        Aliments congrepoisson = new Aliments("Congre Poisson","congrepoisson",10);
        Aliments contrexeville = new Aliments("Contrexe Ville","contrexeville",10);
        Aliments coquillestjacques = new Aliments("Coquilles ST-Jacques","coquillestjacques",10);
        Aliments cornflakes = new Aliments("Cornflakes","cornflakes",10);
        Aliments cornichon = new Aliments("Cornichon","cornichon",10);
        Aliments cotedagneau = new Aliments("Cote d'Agneau","cotedagneau",10);
        Aliments cotedeboeufrotie = new Aliments("Cote de boeuf rotie","cotedeboeufrotie",10);
        Aliments cotelettedeporc = new Aliments("Cotelette de porc","cotelettedeporc",10);
        Aliments courgettes = new Aliments("Courgettes","courgettes",10);
        Aliments couscous = new Aliments("Couscous","couscous",10);
        Aliments crabechair = new Aliments("Crabe chair","crabechair",10);
        Aliments cremechantilly = new Aliments("Crème chantilly","cremechantilly",10);
        Aliments cremedasperges = new Aliments("Crème d'Asperges","cremedasperges",10);
        Aliments cremefraiche = new Aliments("Crème fraiche","cremefraiche",10);
        Aliments cresson = new Aliments("Cresson","cresson",10);
        Aliments crevette = new Aliments("Crevette","crevette",10);
        Aliments croissant = new Aliments("Croissant","croissant",10);
        Aliments cuissedegrnouille = new Aliments("Cuisse de grenouille","cuissedegrnouille",10);
        Aliments cuissepouletroti = new Aliments("Cuisse poulet rôti","cuissepouletroti",10);
        Aliments cumin = new Aliments("Cumin","cumin",10);
        Aliments curry = new Aliments("Curry","curry",10);
        Aliments daiquiri = new Aliments("Daiquiri","daiquiri",10);
        Aliments dattes = new Aliments("Dattes","dattes",10);
        Aliments dorade = new Aliments("Dorade","dorade",10);
        Aliments echalote = new Aliments("Echalote","echalote",10);
        Aliments echalotelyophilisees = new Aliments("Echalote lyophilisees","echalotelyophilisees",10);
        Aliments echalotes = new Aliments("Echalotes","echalotes",10);
        Aliments eclairgateau = new Aliments("Eclair","eclairgateau",10);
        Aliments ecrevisse = new Aliments("Ecrevisse","ecrevisse",10);
        Aliments endives = new Aliments("Endives","endives",10);
        Aliments epauleagneaurotie = new Aliments("Epaule d'Agneau Rotie","epauleagneaurotie",10);
        Aliments epinard = new Aliments("Epinard","epinard",10);
        Aliments escalopededinde = new Aliments("Escalope De Dinde","escalopededinde",10);
        Aliments escalopedeveau = new Aliments("Escalope De Veau","escalopedeveau",10);
        Aliments escargot = new Aliments("Escargot","escargot",10);
        Aliments espadon = new Aliments("Espadon","espadon",10);
        Aliments estragon = new Aliments("Estragon","estragon",10);
        Aliments esturgeon = new Aliments("Esturgeon","esturgeon",10);
        Aliments evian = new Aliments("Evian","evian",10);
        Aliments extraitdevanille = new Aliments("Extrait de vanille","extraitdevanille",10);
        Aliments faisan = new Aliments("Faisan","faisan",10);
        Aliments farinedeble = new Aliments("Farine de blé","farinedeble",10);
        Aliments fauxfilet = new Aliments("Faux filet","fauxfilet",10);
        Aliments fenouil = new Aliments("Fenouil","fenouil",10);
        Aliments feuilledecoriandre = new Aliments("feuille de coriandre","feuilledecoriandre",10);
        Aliments feuilledelorier = new Aliments("Feuille de lorier","feuilledelaurier",10);
        Aliments feveseche = new Aliments("Fève seche","feveseche",10);
        Aliments figuesseches = new Aliments("Figues seches","figuesseches",10);
        Aliments filetdeboeuf = new Aliments("Filet de boeuf","filetdeboeuf",10);
        Aliments filetmaquerau = new Aliments("Filet maquerau","filetmaquereau",10);
        Aliments fletan = new Aliments("Fletan","fletan",10);
        Aliments floconsdavoine = new Aliments("Flocons d'avoine","floconsdavoine",10);
        Aliments foiedeveau = new Aliments("Foie de veau","foiedeveau",10);
        Aliments foiegras = new Aliments("Foie gras","foiegras",10);
        Aliments fraise = new Aliments("Fraise","fraise",10);
        Aliments frites = new Aliments("Frites","frites",10);
        Aliments fromageblanc0mg = new Aliments("Fromage blanc 0 mg","fromageblanc0mg",10);
        Aliments fromageblanc20mg = new Aliments("Fromage blanc 20 mg","fromageblanc20mg",10);
        Aliments fromagecantal = new Aliments("Fromage cantal","fromagecantal",10);
        Aliments fromagecheddar = new Aliments("Fromage cheddar","fromagecheddar",10);
        Aliments fromagedechevre = new Aliments("Fromage de chèvre","fromagedechevre",10);
        Aliments fromagegouda = new Aliments("Fromage gouda","fromagegouda",10);
        Aliments fromagemunster = new Aliments("Fromage munster","fromagemunster",10);
        Aliments fruitsausirop = new Aliments("Fruits au sirop","fruitsausirop",10);
        Aliments fruitssecsmelange = new Aliments("Fruits secs mélange","fruitssecsmelange",10);
        Aliments galantine = new Aliments("Galantine","galantine",10);
        Aliments germedeble = new Aliments("Germe de blé","germedeble",10);
        Aliments gigotdemouton = new Aliments("Gigot de mouton","gigotdemouton",10);
        Aliments gin = new Aliments("Gin","gin",10);
        Aliments ginandtonic = new Aliments("Gin and tonic","ginandtonic",10);
        Aliments gingembre = new Aliments("Gingembre","gingembre",10);
        Aliments glacealavanille = new Aliments("Glace à la vanille","glacealavanille",10);
        Aliments glaceauchocolat = new Aliments("Glace au chocolat","glaceauchocolat",10);
        Aliments glaceaucitron = new Aliments("Glace au citron","glaceaucitron",10);
        Aliments goujon = new Aliments("Goujon","goujon",10);
        Aliments goyave = new Aliments("Goyave","goyave",10);
        Aliments grainedanis = new Aliments("Graine d'anis","grainedanis",10);
        Aliments grainedecoriandre = new Aliments("Graine de coriandre","grainedecoriandre",10);
        Aliments grainedefenouil = new Aliments("Graine de fenouil","grainedefenouil",10);
        Aliments grainedepavots = new Aliments("Graine de pavots","grainedepavots",10);
        Aliments grainesdecumin = new Aliments("Graines de cumin","grainesdecumin",10);
        Aliments groseilles = new Aliments("Groseilles","groseilles",10);
        Aliments gruyere = new Aliments("Gruyère","gruyere",10);
        Aliments haddockfume = new Aliments("Haddock fumé","haddockfume",10);
        Aliments haricotsblancs = new Aliments("Haricots blancs","haricotsblancs",10);
        Aliments haricotsrouges = new Aliments("Haricots rouges","haricotsrouges",10);
        Aliments haricotssecs = new Aliments("Haricots secs","haricotssecs",10);
        Aliments haricotsverts = new Aliments("Haricots verts","haricotsverts",10);
        Aliments hareng = new Aliments("Hareng","hareng",10);
        Aliments harengfume = new Aliments("Hareng fumé","harengfume",10);
        Aliments homard = new Aliments("Homard","homard",10);
        Aliments huiledecolza = new Aliments("Huile de colza","huiledecolza",10);
        Aliments huiledegermedeble = new Aliments("Huile de germe de blé","huiledegermedeble",10);
        Aliments huiledesoja = new Aliments("Huile de soja","huiledesoja",10);
        Aliments huledetournesol = new Aliments("Huile de tournesol","huiledetournesol",10);
        Aliments huiledolive = new Aliments("Huile d'olive","huiledolive",10);
        Aliments huitres = new Aliments("huîtres","huitres",10);
        Aliments instantmasssportsystem = new Aliments("Instant mass sport system","instantmasssportsystem",10);
        Aliments jambondedinde = new Aliments("Jambon de dinde","jambondedinde",10);
        Aliments jambonmaigre = new Aliments("Jambon maigre","jambonmaigre",10);
        Aliments jaunedoeuf = new Aliments("Jaune d'oeuf","jaunedoeuf",10);
        Aliments jusdananas = new Aliments("Jus d'ananas","jusdananas",10);
        Aliments jusdecarotte = new Aliments("Jus de carotte","jusdecarotte",10);
        Aliments jusdecitron = new Aliments("Jus de citron","jusdecitron",10);
        Aliments jusdelegumecocktail = new Aliments("Jus de legume cocktail","jusdelegumecocktail",10);
        Aliments jusdepamplemousse = new Aliments("Jus de pamplemousse","jusdepamplemousse",10);
        Aliments jusdepomme = new Aliments("Jus de pomme","jusdepomme",10);
        Aliments jusderaisin = new Aliments("Jus de raisin","jusderaisin",10);
        Aliments jusdetomate = new Aliments("Jus de tomate","jusdetomate",10);
        Aliments jusdorange = new Aliments("Jus d'orange","jusdorange",10);
        Aliments kaki = new Aliments("Kaki","kaki",10);
        Aliments ketchup = new Aliments("Ketchup","ketchup",10);
        Aliments kiwi = new Aliments("Kiwi","kiwi",10);
        Aliments laitdemiecreme = new Aliments("Lait demi écrémé","laitdemiecreme",10);
        Aliments laitdesoja = new Aliments("Lait de soja","laitdesoja",10);
        Aliments laitcremeliquide = new Aliments("Lait crème liquide","laitecremeliquide",10);
        Aliments laitecremepoudre = new Aliments("Lait écrémé poudre","laitecremepoudre",10);
        Aliments laitentierliquide = new Aliments("Lait entier liquide","laitentierliquide",10);
        Aliments laitue = new Aliments("Laitue","laitue",10);
        Aliments langouste = new Aliments("Langouste","langouste",10);
        Aliments languedeboeuf = new Aliments("Langue de boeuf","languedeboeuf",10);
        Aliments lapinchasseur = new Aliments("Lapin chasseur","lapinchasseur",10);
        Aliments lapincuitencivet = new Aliments("Lapin cuit en civet","lapincuitencivet",10);
        Aliments laroscorbineeffervescente = new Aliments("La roscorbine effervescente","laroscorbineeffervescente",10);
        Aliments lentillescrues = new Aliments("Lentilles crues","lentillescrues",10);
        Aliments lentillescuites = new Aliments("Lentilles Cuites","lentillescuites",10);
        Aliments levuredebiere = new Aliments("Levure de bière","levuredebiere",10);
        Aliments lieu = new Aliments("Lieu","lieu",10);
        Aliments lievre = new Aliments("Lièvre","lievre",10);
        Aliments limande = new Aliments("Limande","limande",10);
        Aliments liqueur = new Aliments("Liqueur","liqueur",10);
        Aliments lotte = new Aliments("Lotte","lotte",10);
        Aliments macaroni = new Aliments("Macaroni","macaroni",10);
        Aliments macis = new Aliments("Macis","macis",10);
        Aliments mais = new Aliments("Mais","mais",10);
        Aliments mandarine = new Aliments("Mandarine","mandarine",10);
        Aliments mangue = new Aliments("Mangue","mangue",10);
        Aliments maquereaualapoelee = new Aliments("Maquereau à la poêlée","maquereaualapoelee",10);
        Aliments maquereauenboite = new Aliments("Maquereau en boite","maquereauenboite",10);
        Aliments margarine = new Aliments("Margarine","margarine",10);
        Aliments margarineenboite = new Aliments("Margarine en boite","margarineenboite",10);
        Aliments margarinetartinable = new Aliments("Margarine tartinable","margarinetartinable",10);
        Aliments marjolaine = new Aliments("Marjolaine","marjolaine",10);
        Aliments marronsgrilles = new Aliments("Marrons grillés","marronsgrilles",10);
        Aliments martini = new Aliments("Martini","martini",10);
        Aliments mayonnaise = new Aliments("Mayonnaise","mayonnaise",10);
        Aliments melon = new Aliments("melon","melon",10);
        Aliments merlantfiletnature = new Aliments("Merlan filet nature","merlanfiletnature",10);
        Aliments merlanfrit = new Aliments("Merlan frit","merlanfrit",10);
        Aliments miel = new Aliments("Miel","miel",10);
        Aliments milkeggprotein = new Aliments("Milk egg protein","milkeggprotein",10);
        Aliments milo = new Aliments("Milo","milo",10);
        Aliments mortadelle = new Aliments("Mortadelle","mortadelle",10);
        Aliments moulesnature = new Aliments("Moules nature","moulesnature",10);
        Aliments moulespreparees = new Aliments("Moules préparées","moulespreparees",10);
        Aliments moutarde = new Aliments("Moutarde","moutarde",10);
        Aliments mozarella = new Aliments("Mozarella","mozarella",10);
        Aliments muesli = new Aliments("Muesli","muesli",10);
        Aliments mures = new Aliments("Mûres","mures",10);
        Aliments myrtilles = new Aliments("Myrtilles","myrtilles",10);
        Aliments navet = new Aliments("Navet","navet",10);
        Aliments nectarine = new Aliments("Nectarine","nectarine",10);
        Aliments noisette = new Aliments("Noisette","noisette",10);
        Aliments noixdecoco = new Aliments("Noix de coco","noixdecoco",10);
        Aliments noixdemuscade = new Aliments("Noix de muscade","noixdemuscade",10);
        Aliments oeuf = new Aliments("Oeuf","oeuf",10);
        Aliments oeufauplat = new Aliments("Oeuf au plat","oeufauplat",10);
        Aliments oeufpoche = new Aliments("Oeuf poché","oeufpoche",10);
        Aliments oignon = new Aliments("Oignon","oignon",10);
        Aliments oignonenpoudre = new Aliments("Oignon en poudre","oignonenpoudre",10);
        Aliments oligonatalgrosesse = new Aliments("Oligo natal grosesse","oligonatalgrosesse",10);
        Aliments oliveverte = new Aliments("Olive verte","oliveverte",10);
        Aliments omelette = new Aliments("Omelette","omelette",10);
        Aliments onglet = new Aliments("Onglet","onglet",10);
        Aliments orange = new Aliments("Orange","orange",10);
        Aliments origan = new Aliments("Origan","origan",10);
        Aliments oseille = new Aliments("Oseille","oseille",10);
        Aliments oeufbrouille = new Aliments("Oeuf brouillé","oueufbrouille",10);
        Aliments painauraisin = new Aliments("Pain au raisin","painauraisin",10);
        Aliments painblanc = new Aliments("Pain blanc","painblanc",10);
        Aliments paincomplet = new Aliments("Pain complet","paincomplet",10);
        Aliments paindepices = new Aliments("Pain d'épices","paindepices",10);
        Aliments paindeseigle = new Aliments("Pain de seigle","paindeseigle",10);
        Aliments paingrille = new Aliments("Pain grillés","paingrille",10);
        Aliments pamplemousse = new Aliments("Pamplemousse","pamplemousse",10);
        Aliments papaye = new Aliments("Papaye","papaye",10);
        Aliments paprika = new Aliments("Paprika","paprika",10);
        Aliments parmesan = new Aliments("Parmesan","parmesan",10);
        Aliments pateaugluten = new Aliments("pâte au gluten","pateaugluten",10);
        Aliments patedamandes = new Aliments("pâte d'amandes","patedamandes",10);
        Aliments patedefoie = new Aliments("Pâté de foie","patedefoie",10);
        Aliments pates = new Aliments("Pâtes","pates",10);
        Aliments pavedeboeuf = new Aliments("Pavé de boeuf","pavedeboeuf",10);
        Aliments peche = new Aliments("Pêche","peche",10);
        Aliments perche = new Aliments("Perche","perche",10);
        Aliments perrier = new Aliments("Perrier","perrier",10);
        Aliments persil = new Aliments("Persil","persil",10);
        Aliments persilseche = new Aliments("Persil séchées","persilseche",10);
        Aliments petitspois = new Aliments("Petits pois","petitspois",10);
        Aliments petitsuisse = new Aliments("Petit suisse","petitsuisse",10);
        Aliments pieuvrepoulpe = new Aliments("Pieuvre/Poulpe","pieuvrepoulpe",10);
        Aliments pimentenpoudre = new Aliments("Piment en poudre","pimentenpoudre",10);
        Aliments pissenlit = new Aliments("Pissenlit","pissenlit",10);
        Aliments pizzajambonfromage = new Aliments("Pizza jambon fromage","pizzajambonfromage",10);
        Aliments poire = new Aliments("Poire","poire",10);
        Aliments poireau = new Aliments("Poireau","poireau",10);
        Aliments poiresausiropleger = new Aliments("Poires au sirop léger","poiresausiropleger",10);
        Aliments poiresausiropsucree = new Aliments("Poires au sirop sucrée","poiresausiropsucree",10);
        Aliments poischiche = new Aliments("Pois chiche","poischiche",10);
        Aliments poivre = new Aliments("poivre","poivre",10);
        Aliments poivreblanc = new Aliments("Poivreblanc","poivreblanc",10);
        Aliments poivredejamaique = new Aliments("Poivre de Jamaique","poivredejamaique",10);
        Aliments poivrenoir = new Aliments("Poivre noir","poivrenoir",10);
        Aliments poivrerouge = new Aliments("Poivre rouge","poivrerouge",10);
        Aliments poivron = new Aliments("Poivron","poivron",10);
        Aliments pomme = new Aliments("Pomme","pomme",10);
        Aliments pommedeterre = new Aliments("Pomme de terre","pommedeterre",10);
        Aliments popcorn = new Aliments("Pop-corn","popcorn",10);
        Aliments portsalut = new Aliments("Port-Salut","portsalut",10);
        Aliments prairectustace = new Aliments("Crustacés","prairectustace",10);
        Aliments protiplus = new Aliments("Proti-plus","protiplus",10);
        Aliments prune = new Aliments("Prune","prune",10);
        Aliments pruneau = new Aliments("Pruneau","pruneau",10);
        Aliments pucnh = new Aliments("punch","punch",10);
        Aliments quakeroats = new Aliments("Quake roats","quakeroats",10);
        Aliments radis = new Aliments("Radis","radis",10);
        Aliments ragoutdeboeuf = new Aliments("Ragoût de boeuf","ragoutdeboeuf",10);
        Aliments raie = new Aliments("Raie","raie",10);
        Aliments raisin = new Aliments("Raisin","raisin",10);
        Aliments raisinsec = new Aliments("Raisin sec","raisinsec",10);
        Aliments rhum = new Aliments("Rhum","rhum",10);
        Aliments rilettes = new Aliments("Rilettes","rilettes",10);
        Aliments risthymus = new Aliments("Ris de veau","risthymus",10);
        Aliments rizblanc = new Aliments("Riz blanc","rizblanc",10);
        Aliments rizcomplet = new Aliments("Riz complet","rizcomplet",10);
        Aliments rognondeboeuf = new Aliments("Rognon de boeuf","rognondeboeuf",10);
        Aliments rognondeveau = new Aliments("Rognon de veau","rognonsdeveau",10);
        Aliments romarinseche = new Aliments("Romarin séché","romarinseche",10);
        Aliments roquefort = new Aliments("Roquefort","roquefort",10);
        Aliments rotidedinde = new Aliments("Rôti de dinde ","rotidedinde",10);
        Aliments rotideveau = new Aliments("Rôti de veau","rotideveau",10);
        Aliments roussette = new Aliments("Roussette","roussette",10);
        Aliments rumsteak = new Aliments("Rumsteak","rumsteak",10);
        Aliments safran = new Aliments("Safran","safran",10);
        Aliments safrandesindes = new Aliments("Safran des indes","safrandesindes",10);
        Aliments salademais = new Aliments("Salade mais","saladedemais",10);
        Aliments saladedethon = new Aliments("Salade de thon","saladedethon",10);
        Aliments salsifis = new Aliments("Salsifis","salsifis",10);
        Aliments sandwichjambonbeurre = new Aliments("Sandwich jambon beurre","sandwichjambonbeurre",10);
        Aliments sandwichjambonfromage = new Aliments("Sandwich jambon fromage","sandwichjambonfromage",10);
        Aliments sardine = new Aliments("Sardine","sardine",10);
        Aliments sardinesalhuile = new Aliments("Sardines à l'huile","sardinesalhuile",10);
        Aliments saucesalade = new Aliments("Sauce salade","saucesalade",10);
        Aliments saucespaghettis = new Aliments("Sauce spaghettis","saucespaghettis",10);
        Aliments saucetomate = new Aliments("Sauce tomate","saucetomate",10);
        Aliments saucissedefrancfort = new Aliments("Saucisse de Francfort","saucissedefrancfort",10);
        Aliments saucissonsec = new Aliments("Saucisson sec","saucissonsec",10);
        Aliments sauge = new Aliments("Sauge","sauge",10);
        Aliments saumon = new Aliments("Saumon","saumon",10);
        Aliments seiche = new Aliments("Seiche","seiche",10);
        Aliments sel = new Aliments("Sel","sel",10);
        Aliments selegerme = new Aliments("Sélégerme","selegerme",10);
        Aliments semouledeble = new Aliments("Semoule de blé","semouledeble",10);
        Aliments semouledemais = new Aliments("Semoule de mais","semouledemais",10);
        Aliments seniorssimplexvitall = new Aliments("Seniors simplex vitall","seniorssimplexvitall",10);
        Aliments sojafarine = new Aliments("Soja farine","sojafarine",10);
        Aliments sojagraine = new Aliments("Soja graine","sojagraine",10);
        Aliments sole = new Aliments("Sole","sole",10);
        Aliments soupeauxchampignons = new Aliments("Soupe aux champignons","soupeauxchampignons",10);
        Aliments soupelegumes = new Aliments("Soupe légumes","soupelegumes",10);
        Aliments soupeminestorne = new Aliments("Soupe minestorne","soupeminestorne",10);
        Aliments spaghettis = new Aliments("Spaghettis","spaghettis",10);
        Aliments steackaloyau = new Aliments("Steack aloyau","steackaloyau",10);
        Aliments steackhache = new Aliments("Steack hache","steackhache",10);
        Aliments sucreblanc = new Aliments("Sucre blanc","sucreblanc",10);
        Aliments sucrebrun = new Aliments("Sucre brun","sucrebrun",10);
        Aliments sucreenpoudre = new Aliments("Sucre en poudre","sucreenpoudre",10);
        Aliments supercomplexvitall = new Aliments("Super complex vitall","supercomplexevitall",10);
        Aliments tapioca = new Aliments("Tapioca","tapioca",10);
        Aliments tarteauxcerises = new Aliments("Tarte aux cerises","tarteauxcerises",10);
        Aliments tarteauxfraises = new Aliments("Tarte aux fraises","tarteauxfraises",10);
        Aliments tarteauxpommes = new Aliments("Tarte aux pommes","tarteauxpommes",10);
        Aliments the = new Aliments("Thé","the",10);
        Aliments thoncru = new Aliments("Thon cru","thoncru",10);
        Aliments thonenboite = new Aliments("Thon en boite","thonenboite",10);
        Aliments thymfrais = new Aliments("Thym frais","thymfrais",10);
        Aliments tomate = new Aliments("Tomate","tomate",10);
        Aliments tripes = new Aliments("Tripes","tripes",10);
        Aliments truitedemer = new Aliments("Truite de mer","truitedemer",10);
        Aliments truiteplat = new Aliments("Truite plat","truiteplat",10);
        Aliments turbot = new Aliments("Turbot","turbot",10);
        Aliments vichystyorre = new Aliments("Vichy st-Yorre","vichystyorre",10);
        Aliments vinaigre = new Aliments("Vinaigre","vinaigre",10);
        Aliments vinrose = new Aliments("Vin rosé","vinrose",10);
        Aliments vinrouge = new Aliments("Vin rouge","vinrouge",10);
        Aliments vittelgrandesource = new Aliments("Vittel grande source","vittelgrandesource",10);
        Aliments vittelhepard = new Aliments("Vittel hépard","vittelhepard",10);
        Aliments vodka = new Aliments("Vodka","vodka",10);
        Aliments volvic = new Aliments("Volvic","volvic",10);
        Aliments whisky = new Aliments("Whisky","whisky",10);
        Aliments yaourtbifidusactif = new Aliments("Yaourt bifidus actif","yaourtbifidusactif",10);
        Aliments yaourtbulgare = new Aliments("Yaourt bulgare","yaourtbulgare",10);
        Aliments yaourtmaigre = new Aliments("Yaourt maigre","yaourtmaigre",10);
        Aliments yaourtnature = new Aliments("Yaourt nature","yaourtnature",10);
        Aliments yoplaitauxfruits = new Aliments("Yoplait aux fruits","yoplaitauxfruits",10);








        list.add(ail);
        list.add(ailenpoudre);
        list.add(amendesblanchiessechees);
        list.add(amandessechees);
        list.add(anethfraiche);
        list.add(anethsechee);
        list.add(aromedevanille);
        list.add(aromedevanillealcool);
        list.add(asperges);
        list.add(aubergine);
        list.add(avocat);
        list.add(bacon);
        list.add(baguette);
        list.add(banane);
        list.add(bananesechee);
        list.add(barloup);
        list.add(basilicfinesherbes);
        list.add(basilicfrais);
        list.add(betaselen);
        list.add(betteraverouge);
        list.add(beurre);
        list.add(biereblonde);
        list.add(biereordinaire);
        list.add(bifteckboeuf);
        list.add(bifteckcheval);
        list.add(bigmac);
        list.add(bigorneau);
        list.add(biscotte);
        list.add(biscuitsable);
        list.add(blancdepoulet);
        list.add(blancdoeuf);
        list.add(boudinblanc);
        list.add(boudinnoir);
        list.add(bouillondevolaille);
        list.add(brie);
        list.add(brochet);
        list.add(cabillaud);
        list.add(cacahuettes);
        list.add(cafefiltre);
        list.add(cafenescafe);
        list.add(cafenescafe1tasse);
        list.add(caille);
        list.add(cake);
        list.add(calamarfrit);
        list.add(calamarnature);
        list.add(camambert);
        list.add(canardroti);
        list.add(cannelle);
        list.add(capresenboite);
        list.add(cardamome);
        list.add(carencyl);
        list.add(carotte);
        list.add(carpe);
        list.add(carrelet);
        list.add(casis);
        list.add(caviar);
        list.add(celerifeuille);
        list.add(celeriracine);
        list.add(cerealescropsyfruit);
        list.add(cerealesnature);
        list.add(cerfeuille);
        list.add(cerises);
        list.add(chairasaucisse);
        list.add(champagne);
        list.add(champignons);
        list.add(charlottegateau);
        list.add(chataignefraiche);
        list.add(chevalroti);
        list.add(chocapic);
        list.add(chocolatacroquer);
        list.add(chocolataulait);
        list.add(chocolatenpoudre);
        list.add(choucroutte);
        list.add(choucru);
        list.add(choufleur);
        list.add(chouxdebruxelles);
        list.add(chrome);
        list.add(ciboulettecrue);
        list.add(ciboulettelyophilisee);
        list.add(citronjaune);
        list.add(citronvert);
        list.add(citrouille);
        list.add(clousdegirofle);
        list.add(cocacola);
        list.add(cocacolacanette);
        list.add(coeurdeboeuf);
        list.add(coing);
        list.add(colinmerlu);
        list.add(concombre);
        list.add(coneglacecreme);
        list.add(confiture);
        list.add(congrepoisson);
        list.add(contrexeville);
        list.add(coquillestjacques);
        list.add(cornflakes);
        list.add(cornichon);
        list.add(cotedagneau);
        list.add(cotedeboeufrotie);
        list.add(cotelettedeporc);
        list.add(courgettes);
        list.add(couscous);
        list.add(crabechair);
        list.add(cremechantilly);
        list.add(cremedasperges);
        list.add(cremefraiche);
        list.add(cresson);
        list.add(crevette);
        list.add(croissant);
        list.add(cuissedegrnouille);
        list.add(cuissepouletroti);
        list.add(cumin);
        list.add(curry);
        list.add(daiquiri);
        list.add(dattes);
        list.add(dorade);
        list.add(echalote);
        list.add(echalotelyophilisees);
        list.add(echalotes);
        list.add(eclairgateau);
        list.add(ecrevisse);
        list.add(endives);
        list.add(epauleagneaurotie);
        list.add(epinard);
        list.add(escalopededinde);
        list.add(escalopedeveau);
        list.add(escargot);
        list.add(espadon);
        list.add(estragon);
        list.add(esturgeon);
        list.add(evian);
        list.add(extraitdevanille);
        list.add(faisan);
        list.add(farinedeble);
        list.add(fauxfilet);
        list.add(fenouil);
        list.add(feuilledecoriandre);
        list.add(feuilledelorier);
        list.add(feveseche);
        list.add(figuesseches);
        list.add(filetdeboeuf);
        list.add(filetmaquerau);
        list.add(fletan);
        list.add(floconsdavoine);
        list.add(foiedeveau);
        list.add(foiegras);
        list.add(fraise);
        list.add(frites);
        list.add(fromageblanc0mg);
        list.add(fromageblanc20mg);
        list.add(fromagecantal);
        list.add(fromagecheddar);
        list.add(fromagedechevre);
        list.add(fromagegouda);
        list.add(fromagemunster);
        list.add(fruitsausirop);
        list.add(fruitssecsmelange);
        list.add(galantine);
        list.add(germedeble);
        list.add(gigotdemouton);
        list.add(gin);
        list.add(ginandtonic);
        list.add(gingembre);
        list.add(glacealavanille);
        list.add(glaceauchocolat);
        list.add(glaceaucitron);
        list.add(goujon);
        list.add(goyave);
        list.add(grainedanis);
        list.add(grainedecoriandre);
        list.add(grainedefenouil);
        list.add(grainedepavots);
        list.add(grainesdecumin);
        list.add(groseilles);
        list.add(gruyere);
        list.add(haddockfume);
        list.add(haricotsblancs);
        list.add(haricotsrouges);
        list.add(haricotssecs);
        list.add(haricotsverts);
        list.add(hareng);
        list.add(harengfume);
        list.add(homard);
        list.add(huiledecolza);
        list.add(huiledegermedeble);
        list.add(huiledesoja);
        list.add(huledetournesol);
        list.add(huiledolive);
        list.add(huitres);
        list.add(instantmasssportsystem);
        list.add(jambondedinde);
        list.add(jambonmaigre);
        list.add(jaunedoeuf);
        list.add(jusdananas);
        list.add(jusdecarotte);
        list.add(jusdecitron);
        list.add(jusdelegumecocktail);
        list.add(jusdepamplemousse);
        list.add(jusdepomme);
        list.add(jusderaisin);
        list.add(jusdetomate);
        list.add(jusdorange);
        list.add(kaki);
        list.add(ketchup);
        list.add(kiwi);
        list.add(laitdemiecreme);
        list.add(laitdesoja);
        list.add(laitcremeliquide);
        list.add(laitecremepoudre);
        list.add(laitentierliquide);
        list.add(laitue);
        list.add(langouste);
        list.add(languedeboeuf);
        list.add(lapinchasseur);
        list.add(lapincuitencivet);
        list.add(laroscorbineeffervescente);
        list.add(lentillescrues);
        list.add(lentillescuites);
        list.add(levuredebiere);
        list.add(lieu);
        list.add(lievre);
        list.add(limande);
        list.add(liqueur);
        list.add(lotte);
        list.add(macaroni);
        list.add(macis);
        list.add(mais);
        list.add(mandarine);
        list.add(mangue);
        list.add(maquereaualapoelee);
        list.add(maquereauenboite);
        list.add(margarine);
        list.add(margarineenboite);
        list.add(margarinetartinable);
        list.add(marjolaine);
        list.add(marronsgrilles);
        list.add(martini);
        list.add(mayonnaise);
        list.add(melon);
        list.add(merlantfiletnature);
        list.add(merlanfrit);
        list.add(miel);
        list.add(milkeggprotein);
        list.add(milo);
        list.add(mortadelle);
        list.add(moulesnature);
        list.add(moulespreparees);
        list.add(moutarde);
        list.add(mozarella);
        list.add(muesli);
        list.add(mures);
        list.add(myrtilles);
        list.add(navet);
        list.add(nectarine);
        list.add(noisette);
        list.add(noixdecoco);
        list.add(noixdemuscade);
        list.add(oeuf);
        list.add(oeufauplat);
        list.add(oeufpoche);
        list.add(oignon);
        list.add(oignonenpoudre);
        list.add(oligonatalgrosesse);
        list.add(oliveverte);
        list.add(omelette);
        list.add(onglet);
        list.add(orange);
        list.add(origan);
        list.add(oseille);
        list.add(oeufbrouille);
        list.add(painauraisin);
        list.add(painblanc);
        list.add(paincomplet);
        list.add(paindepices);
        list.add(paindeseigle);
        list.add(paingrille);
        list.add(pamplemousse);
        list.add(papaye);
        list.add(paprika);
        list.add(parmesan);
        list.add(pateaugluten);
        list.add(patedamandes);
        list.add(patedefoie);
        list.add(pates);
        list.add(pavedeboeuf);
        list.add(peche);
        list.add(perche);
        list.add(perrier);
        list.add(persil);
        list.add(persilseche);
        list.add(petitspois);
        list.add(petitsuisse);
        list.add(pieuvrepoulpe);
        list.add(pimentenpoudre);
        list.add(pissenlit);
        list.add(pizzajambonfromage);
        list.add(poire);
        list.add(poireau);
        list.add(poiresausiropleger);
        list.add(poiresausiropsucree);
        list.add(poischiche);
        list.add(poivre);
        list.add(poivreblanc);
        list.add(poivredejamaique);
        list.add(poivrenoir);
        list.add(poivrerouge);
        list.add(poivron);
        list.add(pomme);
        list.add(pommedeterre);
        list.add(popcorn);
        list.add(portsalut);
        list.add(prairectustace);
        list.add(protiplus);
        list.add(prune);
        list.add(pruneau);
        list.add(pucnh);
        list.add(quakeroats);
        list.add(radis);
        list.add(ragoutdeboeuf);
        list.add(raie);
        list.add(raisin);
        list.add(raisinsec);
        list.add(rhum);
        list.add(rilettes);
        list.add(risthymus);
        list.add(rizblanc);
        list.add(rizcomplet);
        list.add(rognondeboeuf);
        list.add(rognondeveau);
        list.add(romarinseche);
        list.add(roquefort);
        list.add(rotidedinde);
        list.add(rotideveau);
        list.add(roussette);
        list.add(rumsteak);
        list.add(safran);
        list.add(safrandesindes);
        list.add(salademais);
        list.add(saladedethon);
        list.add(salsifis);
        list.add(sandwichjambonbeurre);
        list.add(sandwichjambonfromage);
        list.add(sardine);
        list.add(sardinesalhuile);
        list.add(saucesalade);
        list.add(saucespaghettis);
        list.add(saucetomate);
        list.add(saucissedefrancfort);
        list.add(saucissonsec);
        list.add(sauge);
        list.add(saumon);
        list.add(seiche);
        list.add(sel);
        list.add(selegerme);
        list.add(semouledeble);
        list.add(semouledemais);
        list.add(seniorssimplexvitall);
        list.add(sojafarine);
        list.add(sojagraine);
        list.add(sole);
        list.add(soupeauxchampignons);
        list.add(soupelegumes);
        list.add(soupeminestorne);
        list.add(spaghettis);
        list.add(steackaloyau);
        list.add(steackhache);
        list.add(sucreblanc);
        list.add(sucrebrun);
        list.add(sucreenpoudre);
        list.add(supercomplexvitall);
        list.add(tapioca);
        list.add(tarteauxcerises);
        list.add(tarteauxfraises);
        list.add(tarteauxpommes);
        list.add(the);
        list.add(thoncru);
        list.add(thonenboite);
        list.add(thymfrais);
        list.add(tomate);
        list.add(tripes);
        list.add(truitedemer);
        list.add(truiteplat);
        list.add(turbot);
        list.add(vichystyorre);
        list.add(vinaigre);
        list.add(vinrose);
        list.add(vinrouge);
        list.add(vittelgrandesource);
        list.add(vittelhepard);
        list.add(vodka);
        list.add(volvic);
        list.add(whisky);
        list.add(yaourtbifidusactif);
        list.add(yaourtbulgare);
        list.add(yaourtmaigre);
        list.add(yaourtnature);
        list.add(yoplaitauxfruits);




//Passage de la list a la view
        return list;

    }

    public void recupcal(View v){

    }

    //Méthode appelé au clic du button + (Pour la quantité)
    public void add(View v) {
        ImageView add = (ImageView) v;
        //On récupère la quantité
        TextView qte = this.findViewById(R.id.textView_qte);
        // TextView qte = (TextView) findViewById(R.id.textView_qte);
        //On récupère le champ du total des calories du jour
        TextView totalcalories = this.findViewById(R.id.totalcalories);
        //On récupère les calories
        TextView calorie = this.findViewById(R.id.textView_calories);
        //Conversion des string en int et calcul du total calorique de l'aliment
        int b = Integer.parseInt(calorie.getText().toString());
        int a = Integer.parseInt(qte.getText().toString())+1;
        int c = a*b;
        int qtecalorie = c;
        //Affichage des variables de calcul dans un toast
        //Toast.makeText(getApplicationContext(),"Calorie:"+b+"qte: "+a+"prod"+c,Toast.LENGTH_LONG).show();
        //Mise à jour du champ de total calorique
        totalcalories.setText(Integer.toString(qtecalorie));
        // totalcalories.setText(Integer.toString(qtecalorie));
        //on récupère la position à l'aide du tag défini dans la class
//      int position2 = Integer.parseInt(add.getTag().toString());
//    View parentRow = (View) v.getParent();
//    GridView listView = (GridView) parentRow.getParent();
//    final int position = listView.getPositionForView(parentRow);

        if (add.isClickable()) {
//
//            if (Integer.parseInt(qte.getText().toString()) > 0){
//                TextView calorie = this.findViewById(R.id.textView_calories);
//                int b = Integer.parseInt(calorie.getText().toString());
//                int a = Integer.parseInt(qte.getText().toString());
//                int c = a*b;
//                int calorie2=(c);
//
//                calorie.setText(Integer.toString(calorie2));
//
//            }else {
//
//            }
            //Augmentation de +1 de la quantité
            int qte2=Integer.parseInt(qte.getText().toString())+1;
            qte.setText(Integer.toString(qte2));

        } else {
    //on ne fais rien
        }
    }
    //Méthode appelé au clic du button - (Pour la quantité)
    public void rm(View v) {
        //Récupération des champs nécessaire au traitement
        ImageView rm = (ImageView) v;
        TextView qte = this.findViewById(R.id.textView_qte);
        // TextView qte = (TextView) findViewById(R.id.textView_qte);
        TextView totalcalories = this.findViewById(R.id.totalcalories);
        TextView calorie = this.findViewById(R.id.textView_calories);
        int b = Integer.parseInt(calorie.getText().toString());
        int a = Integer.parseInt(qte.getText().toString())-1;
        int c = a*b;
        int qtecalorie = c;
        int total = (qtecalorie)+Integer.parseInt(totalcalories.getText().toString());
       //Boucle permetant de ne pas avoir de total négatif quand on retire des quantités
        if (qtecalorie<0){
        }
        else{
            totalcalories.setText(Integer.toString(qtecalorie));
        }
        //on récupère la position à l'aide du tag défini dans la class MyListAdapter
//     int position = Integer.parseInt(rm.getTag().toString());
//      View o = list.getChildAt(position).findViewById(R.id.imageView_add);
        //On change la couleur
        if (rm.isClickable()) {
//            TextView qte = findViewById(R.id.textView_qte);

//On enlève 1 à la quantité seulement si elle n'est pas null
if (Integer.parseInt(qte.getText().toString()) > 0){
            int qte2=Integer.parseInt(qte.getText().toString())-1;
    qte.setText(Integer.toString(qte2));}
            else {
            }

          // Toast.makeText(getApplicationContext(),,Toast.LENGTH_LONG).show();

        } else {

        }
    }


}