package david.attandenceapp.activities;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

import david.attandenceapp.R;
import david.attandenceapp.models.DrawerItem;


public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private DrawerLayout Drawer;
    private RecyclerView.Adapter mAdapter;
    private ActionBarDrawerToggle mDrawerToggle;
    private List<DrawerItem> navigationItemsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        navigationItemsList = new ArrayList<DrawerItem>();
        addItemsToNavigationList();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void addItemsToNavigationList(){
        navigationItemsList.add(new DrawerItem(getString(R.string.attendance_list), R.drawable.ic_attendance));
        navigationItemsList.add(new DrawerItem(getString(R.string.events_list), R.drawable.ic_add_event));
        navigationItemsList.add(new DrawerItem(getString(R.string.add_attendant), R.drawable.ic_register));
        navigationItemsList.add(new DrawerItem(getString(R.string.add_event), R.drawable.ic_add_event));
        navigationItemsList.add(new DrawerItem(getString(R.string.settings), R.drawable.ic_settings));
    }
}
