package com.rapitskyi.flashcards;

import com.rapitskyi.flashcards.entity.FlashCard;
import com.rapitskyi.flashcards.repository.FlashCardRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class FlashCardsApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlashCardsApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner commandLineRunner(FlashCardRepository flashCardRepository){
//        return args -> {
//            String str = "a/an, ability, able, about, above, abroad, absent, absolutely, accent, accept, acceptable, access, accommodation, accompany, according to, account, accident, accountant, accurate, ache, achieve, achievement, across, act, action, active, activity, actor, actress, actually, ad, add, addition, address, admire, admission, admit, admit, adult, advance, advanced, advantage, adventure, advert, advertise, advertisement, advice, advise, aeroplane, affect, afford, afraid, after, afternoon, afterwards, again, against, age, aged, agency, ages, ago, agree, ahead, aim, air, air conditioning, air force, airline, airport, alarm, alarm clock, album, alike, alive, all, all right, allow, almost, alone, along, aloud, alphabet, already, also, although, altogether, always, a.m., amazed, amazing, ambition, ambulance, among, amount, amusing, an, ancient, and, angry, animal, ankle, anniversary, announce, announcement, annoy, annual, another, answer, answerphone, ant, antique, anxious, any, anybody, anymore, anyone, anything, anyway, anywhere, apart, apart from, apartment, apartment building, apologise, apology, app, appear, appearance, apple, application, apply, appointment, approach, approve, approximately, architect, architecture, area, argue, argument, arm, armchair, army, around, arrange, arrangement, arrest, arrival, arrive, art, article, artist, as, ashamed, ask, asleep, as long as, aspirin, assist, assistant, astronaut, as well as, at, at all, at first, athlete, athletics, at last, at least, atmosphere, at once, at present, attach, attack, attempt, attend, attention, at the same time, attitude, attract, attraction, attractive, audience, aunt, author, autumn, available, average, avoid, awake, away, awesome, awful";
//            String uastr = "a/an, здатність, здатний, близько, вище, за кордоном, відсутній, абсолютно, акцент, прийняти, прийнятний, доступ, розміщення, супроводжувати, відповідно до, рахунок, нещасний випадок, бухгалтер, точний, боліти, досягти, досягнення, через , дію, дія, активний, діяльність, актор, актриса, власне, реклама, додати, доповнення, адреса, захоплюватися, допуск, визнати, визнати, дорослий, заздалегідь, просунутий, перевага, пригода, рекламувати, рекламувати, реклама, порада, радити , літак, впливати, дозволити собі, боятися, після, після обіду, згодом, знову, проти, вік, у віці, агентство, віки, тому, згоден, попереду, мета, повітря, кондиціонер, повітряні сили, авіакомпанія, аеропорт, тривога, тривога годинник, альбом, однаково, живий, усе, гаразд, дозволити, майже, поодинці, вздовж, вголос, алфавіт, уже, також, хоч, узагалі, завжди, а.м., вражений, дивовижний, амбіції, швидка допомога, серед, кількість, забавний , an, давній, і, сердитий, тварина, щиколотка, річниця, оголосити, оголошення, дратувати, річний, інший, відповідь, автовідповідач, мураха, старовинний, тривожний, будь-який, будь-хто, більше, будь-хто, будь-що, будь-де, будь-де, окремо , крім, квартира, багатоквартирний будинок, вибачення, вибачення, додаток, з'явитися, поява, яблуко, заява, застосувати, призначення, підійти, затвердити, приблизно, архітектор, архітектура, площа, сперечатися, аргумент, рука, крісло, армія, навколо , організувати, домовленість, арешт, приїзд, прибути, мистецтво, стаття, митець, як, соромно, запитати, спить, поки, аспірин, сприяти, помічник, космонавт, а також, при, зовсім, спочатку, спортсмен , легка атлетика, нарешті, принаймні, атмосфера, відразу, зараз, прикріпити, атакувати, спробувати, відвідати, увага, водночас, ставлення, приваблювати, атракціон, привабливий, аудиторія, тітка, автор, осінь, наявний, середній, уникнути, прокинутися, геть, дивовижний, жахливий";
//            List<String> words = List.of(str.split(","));
//            List<String> uawords = List.of(uastr.split(","));
//            List<FlashCard> flashCardList = new ArrayList<>();
//            if(words.size()==uawords.size()){
//            for (int i=0;i<uawords.size();i++) {
//                if(!words.get(i).equals(words.get(i<words.size()-1?i+1:i-1))){
//                flashCardList.add(new FlashCard(words.get(i),uawords.get(i)));
//                }else {
//                    System.out.println("It has the duplicates of word: " + words.get(i)+" at index "+i);
//                }
//            }
////            flashCardRepository.saveAll(flashCardList).forEach(System.out::println);
//            }else {
//                System.out.println(words.size() + "!="+ uawords.size());
//            }
//        };
//    }

}
