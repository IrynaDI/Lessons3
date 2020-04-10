package ua.kiev.prog;

import java.util.ArrayList;
import java.util.List;

public class JsonMessages {// вспомогат класс
    private final List<Message> list;

    public JsonMessages(List<Message> sourceList, int fromIndex) {//копиров смс от первого до последнего
        this.list = new ArrayList<>();
        for (int i = fromIndex; i < sourceList.size(); i++)
            list.add(sourceList.get(i));
    }
}




