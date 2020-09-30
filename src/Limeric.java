import Stories.*;
import java.util.Scanner;


public class Limeric {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        StoryCollection storyCollection = new StoryCollection();
        Boolean isContinue = false;

        do{
            Story story = storyCollection.getUnreadStory();
            if(story == null){
                 break;
            }
            System.out.println("To start the game, answer the following questions:");

            Vocabulary vocabulary =  new Vocabulary();

            Word[] words = story.getWordArr();
            for(Word word:words){
                System.out.println(word.getPartSentence());
                word.setValue(scan.nextLine());
                String w = vocabulary.censore(word.getValue());
                word.setValue(w);
            }
            story.updateWordArr(words);

            System.out.println(story.getStory());
            story.setIsRead(true);
            isContinue = playAgain();


        }  while (isContinue);


        System.out.println("Unfortunately, we ran out of stories. If you want to play again, you can create your own story and send it to this address  : 7maliko7maliko7@gmail.com");

        }


        public static Boolean playAgain (){
            System.out.println("Do you want to play again? (Yes or No)");
            Scanner scan = new Scanner(System.in);
            String play = scan.nextLine();

               switch(play){
                   case ("Yes"):
                       return true;
                   case ("No"):
                    return false;
                   default:
                       break;
               }

           return true;

        }


    }








