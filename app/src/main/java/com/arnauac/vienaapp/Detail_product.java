package com.arnauac.vienaapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class Detail_product extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_product);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

       ;


        String titols = " ";
        String subtitols = " ";
        String descriptions = " ";
        String conclusios = " ";
        String imgs = " ";

        Intent intent = getIntent();
        String text = intent.getStringExtra("nameProduct");
        getSupportActionBar().setTitle(text);

        if (text.equals("Piri Piri")) {
            titols = "Piri Piri";
            subtitols = "La salsa piri-piri aporta un toc picant que embolcalla tota la boca";
            descriptions = "Ens inspirem en la gastronomia de Portugal per apropar-vos una recepta completa que combina la melositat del pollastre amb la salsa piri-piri, una proposta molt saborosa i un punt de picant.";
            conclusios = "Viatgem a Lisboa per presentar-vos el Piri-piri, un entrepà de pollastre, salsa piri-piri, formatge emmental, pebrot escalivat, ceba cuita i compota de poma; ingredients que servim dins el nostre pa rodó d’elaboració pròpia.";
            imgs = "https://www.viena.es/wp-content/uploads/2018/06/E18_Hamb_PiriPiri_1150x690.jpg";

        }else if (text.equals("Oxbridge")) {
            titols = "Oxbridge";
            subtitols = "Recepta anglosaxona reinterpretada al nostre estil";
            descriptions = "És una de les nostres receptes estrella. Elaborada amb 130gr de vedella (coll d’agulla, una de les parts més nobles de la vedella) d’elaboració pròpia, combinada amb bacon a la planxa també d’elaboració pròpia, ou, tomàquet i espinacs. Tots els ingredients s’acompanyen amb maionesa al pebre que aporta un lleuger to picant i atorga amorositat a la recepta.";
            conclusios = "La combinació dels ingredients ofereix un resultat d’allò més gustós i consistent, ideal per a àpats principals.";
            imgs = "https://www.viena.es/wp-content/uploads/2018/10/Viena-hamburguesa-oxbridge-1150x690-1.jpg";

        }else if (text.equals("Cottage")) {
            titols = "Cottage";
            subtitols = "Una recepta senzilla plena de sabor";
            descriptions = "L’hamburguesa Cottage és el resultat de combinar una hamburguesa de 130gr de vedella (coll d’agulla, una de les parts més nobles de la vedella) d’elaboració pròpia amb espinacs frescos, tomàquet i ceba cuita, tot amorosit amb el fos del formatge emmental. La unió d’aquests ingredients ofereix una recepta natural, molt saborosa, fresca i complet";
            conclusios = "El nom de la recepta s’inspira en l’Edat Mitjana, quan a la part rural del Regne Unit hi havia grans granges distribuïdes per tot el país i que amb el pas del temps i la industrialització van anar desapareixent. A dia d’avui encara perdura un element distintiu d’aquestes antigues granges: els cottages; el que entendríem com els habitatges dels masovers.";
            imgs = "https://www.viena.es/wp-content/uploads/2018/03/viena-hamburguesa-cottage-optimitzada.jpg";

        }else if (text.equals("Tartufata")) {
        titols = "Tartufata";
        subtitols = "Il diamante della cucina italiana";
        descriptions = "Aquesta temporada torna la Tartufata, una hamburguesa de vedella acompanyada d’un pa d’elaboració pròpia, crema de tòfona, formatge brie, xampinyons i ceba cuita.";
        conclusios = "Una recepta completa i contundent i alhora molt saborosa i aromàtica, gràcies a l’ingredient estrella del plat: la tòfona negra. La tòfona combina a la perfecció amb el formatge brie, i junts aporten el toc distintiu a l’hamburguesa. A aquests ingredients, s’hi sumen els xampinyons i la ceba cuita que, tot i passar més desapercebuts, ofereixen la textura ideal per al plat.";
        imgs = "https://www.viena.es/wp-content/uploads/2017/11/TARTUFATA_1150x690.jpg";
    }
    else if (text.equals("Strongonov")) {
        titols = "Strongonov";
        subtitols = "L’essència de la gastronomia russa.";
        descriptions = "Reinterpretem la recepta russa per excel·lència, l’estofat Strogonov, on la carn i els bolets són els protagonistes.";
        conclusios = "Viatgem al país més extens d’Europa per presentar-vos la Flauta Strogonov: pa de flauta d’elaboració pròpia, farcit de llom a la planxa i salsa Strogonov. Aquesta salsa està inspirada en la recepta russa que dóna nom a la flauta i que elaborem amb carn, xampinyons, crema i pebre. La salsa, ingredient estrella de la recepta, és molt cremosa i té una aroma que ens recorda un plat d’estofat. Aquests ingredients també es combinen amb formatge emmental, que ofereix melositat, i ceba cuita i xampinyons, que hi donen textura i un toc distintiu.";
        imgs = "https://www.viena.es/wp-content/uploads/2017/09/Flauta_Strogonov_1150-x-690.jpg";
    }
        else if (text.equals("Britània")) {
            titols = "Britània";
            subtitols = "L'essència de Gran Bretanya";
            descriptions = "La Flauta Britània és una recepta freda que té com a ingredient estrella el rosbif d’elaboració pròpia, un ingredient que ofereix cos i textura a la flauta i que combina perfectament amb la resta d’ingredients:  la suavitat del formatge Emmental, la frescor dels espinacs i la tendresa de la ceba cuita. Aquests ingredients es condimenten amb mostassa que aporta el toc final.";
            conclusios = "Una oportunitat per assaborir un dels plats nacionals de Gran Bretanya: el rosbif, un ingredient d’elaboració pròpia que reinterpretem i treballem seguint processos tradicionals.";
            imgs = "https://www.viena.es/wp-content/uploads/2018/03/FLAUTA_BRITANIA-optimitzada.jpg";
        }
        else if (text.equals("Ibèric de glà")) {
            titols = "Ibèric de glà";
            subtitols = "El millor entrepà del món segons The New York Times";
            descriptions = "Aquesta recepta és, sense dubte, l’entrepà amb més reconeixement de la nostra carta. El crític gastronòmic Mark Bittman va publicar un article al diari The New York Times on qualificava el nostre entrepà d’ibèric com, probablement, el millor entrepà del món.";
            conclusios = "Elaborada amb espatlla ibèrica de gla seleccionada a mà, assecada i curada seguint mètodes tradicionals.";
            imgs = "https://www.viena.es/wp-content/uploads/2018/03/viena-flauta-iberic-optimitzat.jpg";
        }
        else if (text.equals("Norvègia")) {
            titols = "Norvègia";
            subtitols = "Combinació de sabors frescos i lleugers";
            descriptions = "Elaborem la flauta Norvègia amb salmó fumat de primera qualitat, d’origen noruec, acompanyat d’ou dur, espinacs i seguint la tradició noruega, amb una salsa de mostassa d’anet que li dóna un toc dolç.";
            conclusios = "Tastar-la és viatjar a Noruega, el país del salmó per excel•lència.";
            imgs = "https://www.viena.es/wp-content/uploads/2018/10/Viena-flauta-norvegia-1150x690.jpg";
        }
        else if (text.equals("Amanida alla Norma")) {
            titols = "Amanida alla Norma";
            subtitols = "Sapori e colori siciliani.";
            descriptions = "Al Viena reinterpretem aquesta recepta al nostre estil. L’elaborem amb una base de pasta garganelli i apostem pel formatge Feta, afegim ou dur tallat a rodanxes i finalment, ho amenitzem tot amb un toc de pebre. El resultat és una combinació molt saborosa on la pasta aporta cos a l’amanida en contrast amb els ingredients més lleugers que ofereixen textura i un toc de frescor. És una recepta ideal per assaborir com a plat principal i gaudir de tot el sabor de la gastronomia siciliana cuidant-vos.";
            conclusios = "El toc final de la recepta l’aporten les nostres vinagretes d’elaboració pròpia. Recomanem combinar-la amb la vinagreta d’olivada que preparem amb oli d’oliva extra amb una picada d’olives negres triturades i sal. Una vinagreta plena de sabor que lliga a la perfecció amb els ingredients mediterranis del plat.";
            imgs = "https://www.viena.es/wp-content/uploads/2018/03/Amanida_Norma_1150x690-1.jpg";
        }
        else if (text.equals("Sucs naturals")) {
            titols = "Sucs naturals";
            subtitols = "Begudes 100% naturals, fresques, plenes de vitamines i sense sucres afegits. ";
            descriptions = "Proposem quatre sucs naturals ideals per assaborir en qualsevol lloc i moment.";
            conclusios = "Els experts recomanen consumir 5 peces de fruita i hortalisses al dia per seguir una dieta saludable. Tot i així, moltes vegades ens trobem que el ritme frenètic del nostre dia a dia no ens permet preparar plats que incloguin totes les dosis recomanades. Per això, al Viena volem posar-vos-ho fàcil i us proposem quatre sucs ideals per prendre en qualsevol lloc i moment.";
            imgs = "https://www.viena.es/wp-content/uploads/2018/10/Viena-sucs-begudes-naturals-1150x690.jpg";
        }
        else if (text.equals("Amanida Xató")) {
            titols = "Amanida Xató";
            subtitols = "Els clàssics mai moren";
            descriptions = "Ideal acompanyant un plat principal, la nova amanida compta amb bacallà, tonyina, tomàquet, olives negres i una barreja d’enciams. El toc final el dóna la nova vinagreta Romesco; una vinagreta d’elaboració pròpia que preparem amb ametlla i avellana torrades, tomàquets i d’altres ingredients. Una vinagreta que lliga a la perfecció amb els ingredients de l’amanida. Tot i així, també podeu maridar l’amanida amb les altres vinagretes que també elaborem: mel i mostassa, olivada i mòdena. Us ho deixem al vostre gust.";
            conclusios = "El bacallà i la vinagreta Romesco d’elaboració pròpia marquen el sabor d’aquesta nova amanida.";
            imgs = "https://www.viena.es/wp-content/uploads/2018/10/Amanida_xato_1150x690.jpg";
        }
        else if (text.equals("Sopa Galets")) {
            titols = "Sopa Galets";
            subtitols = "La clàssica recepta del Nadal";
            descriptions = "La base d’aquesta tradicional sopa és l’elaboració lenta d’un brou d’au acompanyat amb galets, on es concentren tots els sabors i totes les aromes que perfumen l’ambient festiu del Viena. Un sopa servida ben calentona, que reconforta l’esperit a la primera cullerada";
            conclusios = "Un brou calent, molt nutritiu i gustós!";
            imgs = "https://www.viena.es/wp-content/uploads/2018/11/viena-n18-sopa-1150x690.jpg";
        }

        else if (text.equals("Uppsala")) {
            titols = "Uppsala";
            subtitols = "Les patates més sueques";
            descriptions = "La mostassa d’anet és una de les salses més populars de la gastronomia escandinava, i aquest hivern al Viena ens hi inspirem per idear una nova salsa per a les patates patates a grill: la maionesa de mostassa d’anet.";
            conclusios = "Es tracta d’una nova salsa recepta pròpia, cremosa i untuosa com una maionesa, però a la vegada amb el punt especiat propi de l’anet.";
            imgs = "https://www.viena.es/wp-content/uploads/2018/10/Patates_Uppsala_1150x690.jpg";
        }

        else if (text.equals("Alpino")) {
            titols = "Alpino";
            subtitols = "La clàssica recepta del Viena";
            descriptions = "L’ingredient protagonista de la recepta és el joff o porchetta, la carn rostida que elaborem des del Viena seguint els processos tradicionals. Aquest ingredient s’acompanya amb ceba cuita, formatge emmental i salsa alpina d’elaboració pròpia, tot farcint el pa de motlle.";
            conclusios = "La clau de la recepta és el rostit de porc d’elaboració pròpia que combinem amb el nostre romesco. ";
            imgs = "https://www.viena.es/wp-content/uploads/2018/03/viena-receptes-alpino-optimitzada.jpg";
        }
        else if (text.equals("Rémy")) {
            titols = "Rémy";
            subtitols = "La personalitat de tres formatges en una mossegada";
            descriptions = "Al Viena reinterpretem la clàssica recepta del croque madame a través d’un ingredient clau a la gastronomia francesa: el formatge. El Croque Rémy combina tres formatges amb diferents aportacions: el brie proporciona la textura més cremosa a la recepta, el rocafort el sabor més intens i potent mentre que l’emmental ofereix una consistència fosa i filada a cada mossegada. Tots tres es rematen amb l’ou ferrat, que hi suma textura i contundència oferint així una recepta ideal per als paladars que busquen quedar satisfets però fugen dels àpats copiosos.";
            conclusios = "Tastar-lo és viatjar a França, i en concret, als bistrots de París: els punts de trobada de la societat parisenca.";
            imgs = "https://www.viena.es/wp-content/uploads/2018/03/viena-croque-remy-optimitzada.jpg";
        }

        else if (text.equals("Porchetta")) {
            titols = "Portchetta";
            subtitols = "L'art del rostit italià";
            descriptions = "L’ingredient estrella de la coca és la porchetta, un rostit italià que elaborem i interpretem a la nostra manera; panxeta de porc farcida de retall de magre i cap de llom, condimentada amb espècies i rostida al forn.";
            conclusios = "La porchetta aporta cos, un sabor intens a espècies, una aroma a rostit i una textura molt sucosa, característiques fruit d’un procés d’elaboració pròpia, que treballem amb cura i dedicació. Els ingredients que acompanyen la protagonista són: formatge emmental que potencia el sabor rostit de la porchetta; la ceba confitada amb vinagre de Mòdena, que ofereix un equilibri perfecte entre dolç i amarg; i l’albergínia, que atorga textura i amorositat al plat.";
            imgs = "https://www.viena.es/wp-content/uploads/2018/10/Viena-coca-porchetta-1150x690.jpg";
        }
        else if (text.equals("Lorraine")) {
            titols = "Lorraine";
            subtitols = "Cruixent recepta d'origen francès";
            descriptions = "Recuperem la Coca Lorraine, una recepta perfecta per als àpats principals d’aquest hivern. Tot plegat, una combinació d’ingredients que no deixa indiferent al paladar: pollastre rostit, bacon cruixent, ceba cuita, formatge emmental i oli d’herbes aromàtiques; tot acompanyat amb el pa de coca d’elaboració pròpia.";
            conclusios = "Una coca contundent i molt saborosa. ";
            imgs = "https://www.viena.es/wp-content/uploads/2017/02/viena-lorraine-2500x1500.jpg";
        }




        getSupportActionBar().setTitle(titols);

        TextView titol = findViewById(R.id.titol);
        TextView subtitol = findViewById(R.id.subtitol);
        TextView conclusio = findViewById(R.id.conclusio);
        TextView descripcio = findViewById(R.id.descripcio);
        ImageView img = findViewById(R.id.imatge);


        titol.setText(titols);
        subtitol.setText(subtitols);
        conclusio.setText(conclusios);
        descripcio.setText(descriptions);
        Glide
                .with(this)
                .load(imgs)
                .apply(new RequestOptions().override(575,345).fitCenter())
                .into(img);

}
    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        int id = item.getItemId();
        if (id == android.R.id.home){
            this.finish();
        }
        return  super.onOptionsItemSelected(item);
    }
}
