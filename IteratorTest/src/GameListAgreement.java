import java.util.ArrayList;
import java.util.Comparator;

class GameListAggregate implements Aggregate {
    private ArrayList<Game> list = new ArrayList<Game>();
    private int numberOfStock;

    @Override
    public Iterator createIterator() {
        return new GameListIterator(this);
    }
    public void add(Game game) {
        //list[numberOfStock] = game;
        list.add(game);
        numberOfStock += 1;
    }
    public Object getAt(int number) {
        //return list[number];
        return(list.get(number));
    }
    public int getNumberOfStock() {
        return numberOfStock;
    }

    public void  sort() {
    	 Comparator<Game> compare = Comparator.comparing(Game::getPrice);
         list.sort(compare);
    }

}

