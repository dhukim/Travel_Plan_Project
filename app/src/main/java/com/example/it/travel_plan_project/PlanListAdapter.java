package com.example.it.travel_plan_project;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.it.travel_plan_project.R;
import com.example.it.travel_plan_project.Travel_Plan_Information;

import java.util.List;

/**
 * Created by Lee on 2017-12-03.
 */

public class PlanListAdapter extends BaseAdapter {
    private Context context;
    private List<Travel_Plan_Information> planList;

    public PlanListAdapter(Context context, List<Travel_Plan_Information> planList) {
        this.context = context;
        this.planList = planList;
    }

    @Override
    public int getCount() {
        return planList.size();
    }

    @Override
    public Object getItem(int i) {
        return planList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = View.inflate(context, R.layout.plan, null);
        TextView start = (TextView) v.findViewById(R.id.start);
        TextView destination = (TextView) v.findViewById(R.id.destination);
        TextView start_date = (TextView) v.findViewById(R.id.start_date);
        TextView finish_date = (TextView) v.findViewById(R.id.finish_date);
        TextView rooms = (TextView) v.findViewById(R.id.rooms);
        TextView course = (TextView) v.findViewById(R.id.course);

        start.setText(planList.get(i).getStart());
        destination.setText(planList.get(i).getDestination());
        start_date.setText(planList.get(i).getStart_date());
        finish_date.setText(planList.get(i).getFinish_date());
        rooms.setText(planList.get(i).getRooms());
        course.setText(planList.get(i).getCourse());

        v.setTag(planList.get(i).getUserid());
        return v;
    }
}
