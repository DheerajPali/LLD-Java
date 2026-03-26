package oops;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.*;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONArray;
import org.json.JSONObject;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Queue<ArrayList<Integer>> requestQueue = new LinkedList<>();

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor()
    }

//    task : id , clientid , status
//    getStatus() : status
//    queue<task> :
//    Threads : will take tasks from queue
//    requestProceed() -> will change the status of task as per business logic
}

