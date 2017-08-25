package com.markantoni.gofinandroid;

import android.app.SearchManager;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.EditorInfo;

import com.markantoni.gofinandroid.interfaces.IMainPresenter;
import com.markantoni.gofinandroid.interfaces.IMainView;
import com.markantoni.gofinandroid.interfaces.IPatternPresenter;
import com.markantoni.gofinandroid.patterns.behavioral.chainofresponsibility.ChainOfResponsibilityPresenter;
import com.markantoni.gofinandroid.patterns.behavioral.command.CommandPresenter;
import com.markantoni.gofinandroid.patterns.behavioral.interpreter.InterpreterPresenter;
import com.markantoni.gofinandroid.patterns.behavioral.iterator.IteratorPresenter;
import com.markantoni.gofinandroid.patterns.behavioral.mediator.MediatorPresenter;
import com.markantoni.gofinandroid.patterns.behavioral.memento.MementoPresenter;
import com.markantoni.gofinandroid.patterns.behavioral.observer.ObserverPresenter;
import com.markantoni.gofinandroid.patterns.behavioral.state.StatePresenter;
import com.markantoni.gofinandroid.patterns.behavioral.strategy.StrategyPresenter;
import com.markantoni.gofinandroid.patterns.behavioral.templatemethod.TemplateMethodPresenter;
import com.markantoni.gofinandroid.patterns.behavioral.visitor.VisitorPresenter;
import com.markantoni.gofinandroid.patterns.creational.abstractfactory.AbstractFactoryPresenter;
import com.markantoni.gofinandroid.patterns.creational.builder.BuilderPresenter;
import com.markantoni.gofinandroid.patterns.creational.factorymethod.FactoryMethodPresenter;
import com.markantoni.gofinandroid.patterns.creational.prototype.PrototypePresenter;
import com.markantoni.gofinandroid.patterns.creational.singleton.SingletonPresenter;
import com.markantoni.gofinandroid.patterns.structural.adapter.AdapterPresenter;
import com.markantoni.gofinandroid.patterns.structural.bridge.BridgePresenter;
import com.markantoni.gofinandroid.patterns.structural.composite.CompositePresenter;
import com.markantoni.gofinandroid.patterns.structural.decorator.DecoratorPresenter;
import com.markantoni.gofinandroid.patterns.structural.facade.FacadePresenter;
import com.markantoni.gofinandroid.patterns.structural.flyweight.FlyweightPresenter;
import com.markantoni.gofinandroid.patterns.structural.proxy.ProxyPresenter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements IMainView, NavigationView.OnNavigationItemSelectedListener,
        SearchView.OnQueryTextListener, SearchAdapter.OnSearchSuggestionClickListener {

    private IMainPresenter mMainPresenter;

    private DrawerLayout mDrawerLayout;
    private ViewPager mViewPager;
    private PatternsPagerAdapter mPagerAdapter;

    private SearchView mSearchView;
    private SearchAdapter mSearchAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ((NavigationView) findViewById(R.id.navigationView))
                .setNavigationItemSelectedListener(this);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        mViewPager = (ViewPager) findViewById(R.id.viewPager);

        mMainPresenter = new MainPresenter(this);
    }

    @Override
    public void showPattern(IPatternPresenter patternPresenter) {
        mViewPager.setCurrentItem(mPagerAdapter.findPosition(patternPresenter.getClass().getSimpleName()));
    }

    @Override
    public void setPatternsList(List<IPatternPresenter> patterns) {
        mPagerAdapter = new PatternsPagerAdapter(getSupportFragmentManager(), patterns);
        mViewPager.setAdapter(mPagerAdapter);
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        boolean isFirstRun = sharedPreferences.getBoolean(key.firstrun, false);
        if (!isFirstRun) {
            sharedPreferences.edit().putBoolean(key.firstrun, true).apply();
            showHint();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        mMainPresenter.onBindView(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        mMainPresenter.onUnbindView();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Class<? extends IPatternPresenter> type;
        mDrawerLayout.closeDrawers();

        switch (item.getItemId()) {
            case R.id.singleton:
                type = SingletonPresenter.class;
                break;
            case R.id.abstractFactory:
                type = AbstractFactoryPresenter.class;
                break;
            case R.id.builder:
                type = BuilderPresenter.class;
                break;
            case R.id.factory_method:
                type = FactoryMethodPresenter.class;
                break;
            case R.id.prototype:
                type = PrototypePresenter.class;
                break;
            case R.id.adapter:
                type = AdapterPresenter.class;
                break;
            case R.id.bridge:
                type = BridgePresenter.class;
                break;
            case R.id.composite:
                type = CompositePresenter.class;
                break;
            case R.id.decorator:
                type = DecoratorPresenter.class;
                break;
            case R.id.facade:
                type = FacadePresenter.class;
                break;
            case R.id.flyweight:
                type = FlyweightPresenter.class;
                break;
            case R.id.proxy:
                type = ProxyPresenter.class;
                break;
            case R.id.chain_of_resp:
                type = ChainOfResponsibilityPresenter.class;
                break;
            case R.id.command:
                type = CommandPresenter.class;
                break;
            case R.id.interpreter:
                type = InterpreterPresenter.class;
                break;
            case R.id.iterator:
                type = IteratorPresenter.class;
                break;
            case R.id.mediator:
                type = MediatorPresenter.class;
                break;
            case R.id.memento:
                type = MementoPresenter.class;
                break;
            case R.id.observer:
                type = ObserverPresenter.class;
                break;
            case R.id.state:
                type = StatePresenter.class;
                break;
            case R.id.strategy:
                type = StrategyPresenter.class;
                break;
            case R.id.template_method:
                type = TemplateMethodPresenter.class;
                break;
            case R.id.visitor:
                type = VisitorPresenter.class;
                break;
            default:
                return false;
        }

        mMainPresenter.onPatternSelected(type);
        return true;
    }

    private void showHint() {
        Snackbar.make(mDrawerLayout, R.string.toggle_code_visibility, Snackbar.LENGTH_INDEFINITE)
                .setAction(android.R.string.ok, new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                    }
                })
                .show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        SearchManager searchManager = (SearchManager)
                getSystemService(SEARCH_SERVICE);

        mSearchView = (SearchView) MenuItemCompat.getActionView(menu.findItem(R.id.search));
        mSearchView.setImeOptions(EditorInfo.IME_FLAG_NO_EXTRACT_UI);
        mSearchView.setSearchableInfo(searchManager.
                getSearchableInfo(getComponentName()));

        mSearchView.setSubmitButtonEnabled(true);
        mSearchView.setOnQueryTextListener(this);

        mSearchAdapter = SearchAdapter.create(this);
        mSearchAdapter.setOnSearchSuggestionClickListener(this);
        mSearchView.setSuggestionsAdapter(mSearchAdapter);

        return true;
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        performSearch(query);
        return true;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        mSearchAdapter.filterSuggestions(newText);
        return true;
    }

    @Override
    public void onSuggestionClicked(String value) {
        performSearch(value);
    }

    private void performSearch(String value) {
        mViewPager.setCurrentItem(mPagerAdapter.findPosition(value));
        mSearchView.setQuery("", false);
        mSearchView.setIconified(true);
    }
}
