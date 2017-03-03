package com.ls.ui.drawer;

import com.ls.drupalcon.R;
import com.ls.drupalcon.model.Model;
import com.ls.drupalcon.model.UpdateRequest;
import com.ls.drupalcon.model.managers.FavoriteManager;
import com.ls.drupalcon.model.managers.SocialManager;
import com.ls.utils.L;

import java.util.ArrayList;
import java.util.List;

public class SocialStrategy implements DrawerFragmentStrategy {

    @Override
    public List<Long> getDayList() {
        List<Long> dayList = new ArrayList<>();
        SocialManager manager = Model.instance().getSocialManager();
        dayList.addAll(manager.getSocialsDays());
        L.e("dayList = " + dayList);
        return dayList;
    }

    @Override
    public int getTextResId() {
        return R.string.placeholder_social_events;
    }

    @Override
    public int getImageResId() {
        return R.drawable.ic_no_social_events;
    }

    @Override
    public boolean enableOptionMenu() {
        return true;
    }

    @Override
    public boolean updateFavorites() {
        return false;
    }

    @Override
    public boolean update(List<UpdateRequest> requests) {
        return true;
    }
}
