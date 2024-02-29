package com.example.secondworkshop;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class CourseListActivity extends ListActivity {
    ArrayList <Map<String,Object>> list = new ArrayList<Map<String, Object>>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = this.getIntent();
        ArrayList<String> courseName = intent.getStringArrayListExtra("CourseName");
        ArrayList<String> teachers = intent.getStringArrayListExtra("Teachers");

        for (int i=0; i< courseName.size(); i++ ){
            Map<String,Object> map = new Map<String, Object>() {
                @Override
                public int size() {
                    return 0;
                }

                @Override
                public boolean isEmpty() {
                    return false;
                }

                @Override
                public boolean containsKey(@Nullable Object key) {
                    return false;
                }

                @Override
                public boolean containsValue(@Nullable Object value) {
                    return false;
                }

                @Nullable
                @Override
                public Object get(@Nullable Object key) {
                    return null;
                }

                @Nullable
                @Override
                public Object put(String key, Object value) {
                    return null;
                }

                @Nullable
                @Override
                public Object remove(@Nullable Object key) {
                    return null;
                }

                @Override
                public void putAll(@NonNull Map<? extends String, ?> m) {

                }

                @Override
                public void clear() {

                }

                @NonNull
                @Override
                public Set<String> keySet() {
                    return null;
                }

                @NonNull
                @Override
                public Collection<Object> values() {
                    return null;
                }

                @NonNull
                @Override
                public Set<Entry<String, Object>> entrySet() {
                    return null;
                }
            };
            map.put("CourseName",courseName.get(i));
            map.put("Teachers",teachers.get(i));
            list.add(map);
        }

        SimpleAdapter adapter=new SimpleAdapter(this,list,R.layout.course_list_item,new String[]{"CourseName","Teachers"},new int[]{R.id.coursename,R.id.teachers});
        setListAdapter(adapter);

    }
}