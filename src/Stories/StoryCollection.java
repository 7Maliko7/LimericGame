package Stories;

public class StoryCollection {


    Story[] stories;

    public StoryCollection(){
        Story[] stories = new Story[4];
        DragonStory dragon = new DragonStory();
        CatStory cat = new CatStory();
        PumpkinStory pumpkin = new PumpkinStory();
        RocketStory rocket = new RocketStory();

        stories[0] = dragon;
        stories[1] = cat;
        stories[2] = pumpkin;
        stories[3] = rocket;
        this.stories= stories;
    }

    public Story getUnreadStory(){
        for (Story item: stories)
        {
            if (item.getIsRead()== false){
                return item;
            }
        }
        return null;
    }

}
