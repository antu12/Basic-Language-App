/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> numbers = new ArrayList<Word>();

        numbers.add(new Word("One", "এক"));
        numbers.add(new Word("Two", "দুই"));
        numbers.add(new Word("Three", "তিন"));
        numbers.add(new Word("Four", "চার"));
        numbers.add(new Word("Five", "পাঁচ"));
        numbers.add(new Word("Six", "ছয়"));
        numbers.add(new Word("Seven", "সাত"));
        numbers.add(new Word("Eight", "আট"));
        numbers.add(new Word("Nine", "নয়"));
        numbers.add(new Word("Ten", "দশ"));

        //LinearLayout rootView = (LinearLayout) findViewById(R.id.rootview);

        WordAdapter itemsAdapter = new WordAdapter(this, numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }
}
