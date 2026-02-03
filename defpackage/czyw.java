package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;
import com.google.android.apps.messaging.ui.generic.spannedautocomplete.SpannedMultiAutoCompleteTextView;
import com.google.android.apps.messaging.ui.search.ZeroStateSearchBox;
import com.google.android.apps.messaging.ui.search.homeview.ZeroStateContentGridLayout;
import com.google.android.apps.messaging.ui.search.homeview.ZeroStateSearchHomeView;
import com.google.android.apps.messaging.ui.search.presenter.ContactFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.ContentFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.ConversationFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.ConversationListFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.FreeTextFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.SearchFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.StarFilterDataItem;
import com.google.android.apps.messaging.ui.search.resultsview.ResultsFilterView;
import com.google.android.apps.messaging.ui.search.resultsview.ZeroStateSearchMultipleResultsView;
import com.google.android.apps.messaging.ui.search.resultsview.ZeroStateSearchResultsView;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.material.chip.ChipGroup;
import defpackage.ehol;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czyw extends czya implements ehlg, eyhx, ehlc, ehnw, eifl, einn {
    private czzj a;
    private boolean ah;
    private Context d;
    private final lvn e = new lvn(this);
    private final eino ag = new eino();

    @Deprecated
    public czyw() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return czzj.class;
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            final czzj czzjVarH = H();
            fcsu fcsuVar = czzjVarH.w;
            final View viewInflate = layoutInflater.inflate(((asgw) fcsuVar.b()).a() ? ((askx) czzjVarH.y.b()).a() ? R.layout.zero_state_search_fragment_coolranch_v2 : R.layout.zero_state_search_fragment_coolranch : R.layout.zero_state_search_fragment, viewGroup, false);
            if (!((asgw) fcsuVar.b()).a()) {
                View viewFindViewById = viewInflate.findViewById(R.id.zero_state_search_box_container);
                viewFindViewById.setBackgroundTintList(ColorStateList.valueOf(cuiu.c(viewFindViewById.getContext())));
            }
            czzjVarH.B = (ZeroStateSearchBox) viewInflate.findViewById(R.id.zero_state_search_box);
            final ZeroStateSearchBox zeroStateSearchBox = czzjVarH.B;
            final dacu dacuVar = czzjVarH.c;
            zeroStateSearchBox.e = dacuVar;
            zeroStateSearchBox.f = czzjVarH;
            zeroStateSearchBox.o = new czzt(zeroStateSearchBox.getContext(), dacuVar);
            SpannedMultiAutoCompleteTextView spannedMultiAutoCompleteTextView = zeroStateSearchBox.d;
            czzt czztVar = zeroStateSearchBox.o;
            cyuc cyucVar = spannedMultiAutoCompleteTextView.g;
            if (cyucVar == null) {
                spannedMultiAutoCompleteTextView.g = new cyuc(spannedMultiAutoCompleteTextView);
            } else {
                ListAdapter listAdapter = spannedMultiAutoCompleteTextView.j;
                if (listAdapter != null) {
                    listAdapter.unregisterDataSetObserver(cyucVar);
                }
            }
            spannedMultiAutoCompleteTextView.j = czztVar;
            dahl dahlVar = null;
            if (czztVar != null) {
                spannedMultiAutoCompleteTextView.h = czztVar.b;
                czztVar.registerDataSetObserver(spannedMultiAutoCompleteTextView.g);
            } else {
                spannedMultiAutoCompleteTextView.h = null;
            }
            spannedMultiAutoCompleteTextView.f().a.setAdapter((ListAdapter) czztVar);
            zeroStateSearchBox.d.k = new czyt(dacuVar);
            if (dacuVar.m() == null) {
                zeroStateSearchBox.d.m = new czyi(zeroStateSearchBox);
            }
            zeroStateSearchBox.d.setOnEditorActionListener(new eigd(zeroStateSearchBox.l, new TextView.OnEditorActionListener() { // from class: czyj
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    if (keyEvent == null) {
                        cqca.n("BugleZeroStateSearch", "The event is null");
                        return false;
                    }
                    if (keyEvent.getAction() == 1) {
                        return false;
                    }
                    if (i != 3 && (keyEvent.getKeyCode() != 66 || keyEvent.getAction() != 0)) {
                        return false;
                    }
                    ZeroStateSearchBox zeroStateSearchBox2 = zeroStateSearchBox;
                    cqca.c("BugleZeroStateSearch", "Triggering search since the user tapped on the enter key");
                    if (!zeroStateSearchBox2.o.isEmpty()) {
                        SearchFilterDataItem item = zeroStateSearchBox2.o.getItem(0);
                        if (item instanceof ContentFilterDataItem) {
                            SpannedMultiAutoCompleteTextView spannedMultiAutoCompleteTextView2 = zeroStateSearchBox2.d;
                            spannedMultiAutoCompleteTextView2.j(spannedMultiAutoCompleteTextView2.g(item));
                            return true;
                        }
                    }
                    ((dabm) zeroStateSearchBox2.i.b()).a("Bugle.Search.UI.Filter.Clicked", 1);
                    zeroStateSearchBox2.k.d(7);
                    zeroStateSearchBox2.d.i();
                    zeroStateSearchBox2.i(zeroStateSearchBox2.getContext(), zeroStateSearchBox2);
                    zeroStateSearchBox2.k(3);
                    return true;
                }
            }, "com/google/android/apps/messaging/ui/search/ZeroStateSearchBox", "init", 227, "ZeroStateSearchBox autoCompleteTextView onEditorActionListener"));
            zeroStateSearchBox.d.setOnTouchListener(new View.OnTouchListener() { // from class: czyk
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    List list = (List) dacuVar.e().a();
                    if (list == null || !Collection.EL.stream(list).anyMatch(new Predicate() { // from class: czym
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo538negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return ((SearchFilterDataItem) obj) instanceof ConversationListFilterDataItem;
                        }
                    })) {
                        return false;
                    }
                    zeroStateSearchBox.c();
                    return false;
                }
            });
            SpannedMultiAutoCompleteTextView spannedMultiAutoCompleteTextView2 = zeroStateSearchBox.d;
            final eigp eigpVar = zeroStateSearchBox.l;
            final AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() { // from class: czyl
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                    ZeroStateSearchBox zeroStateSearchBox2 = zeroStateSearchBox;
                    SearchFilterDataItem item = zeroStateSearchBox2.o.getItem(i);
                    if (item instanceof FreeTextFilterDataItem) {
                        cqca.c("BugleZeroStateSearch", "Triggering search since the user tapped free text suggestion");
                        ((dabm) zeroStateSearchBox2.i.b()).b(1);
                        zeroStateSearchBox2.k.f(4, 8);
                        zeroStateSearchBox2.k(3);
                        return;
                    }
                    if (item instanceof ContentFilterDataItem) {
                        int i2 = ((ContentFilterDataItem) item).a().a;
                        ((dabm) zeroStateSearchBox2.i.b()).b(i2);
                        zeroStateSearchBox2.k.e(4, i2);
                    } else if (item instanceof ContactFilterDataItem) {
                        ((dabm) zeroStateSearchBox2.i.b()).b(6);
                        zeroStateSearchBox2.k.f(4, 7);
                    } else if (item instanceof StarFilterDataItem) {
                        ((dabm) zeroStateSearchBox2.i.b()).b(7);
                        zeroStateSearchBox2.k.f(4, 10);
                    }
                }
            };
            spannedMultiAutoCompleteTextView2.i = new AdapterView.OnItemClickListener() { // from class: eifr
                public final /* synthetic */ String b = "com/google/android/apps/messaging/ui/search/ZeroStateSearchBox";
                public final /* synthetic */ String c = "init";
                public final /* synthetic */ String d = "ZeroStateSearchBox autoCompleteTextView onItemClickListener";

                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                    eigp eigpVar2 = eigpVar;
                    String str = this.d;
                    String str2 = this.b;
                    String str3 = this.c;
                    AdapterView.OnItemClickListener onItemClickListener2 = onItemClickListener;
                    eieh eiehVarC = eigpVar2.c(str, str2, str3, 275);
                    try {
                        onItemClickListener2.onItemClick(adapterView, view, i, j);
                        eiehVarC.close();
                    } finally {
                    }
                }
            };
            if (dacuVar.o() instanceof ConversationFilterDataItem) {
                zeroStateSearchBox.d.setHint(R.string.zero_state_search_box_text_hint_in_conversation);
            }
            ea eaVar = czzjVarH.b;
            Bundle bundle2 = eaVar.m;
            int i = 5;
            if (bundle2 != null) {
                String string = bundle2.getString(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY);
                if (string != null && !TextUtils.isEmpty(string)) {
                    czzjVarH.B.d.setText(string, TextView.BufferType.EDITABLE);
                    czzjVarH.B.k(5);
                }
                SearchFilterDataItem searchFilterDataItem = (SearchFilterDataItem) bundle2.getParcelable("search_filter_data_item");
                if (searchFilterDataItem != null) {
                    czzjVarH.B.h(searchFilterDataItem);
                }
            }
            ZeroStateSearchResultsView zeroStateSearchResultsView = czzjVarH.E;
            if (zeroStateSearchResultsView != null) {
                dahm dahmVarH = zeroStateSearchResultsView.H();
                wb wbVar = dahmVarH.p.o;
                if (wbVar != null) {
                    if (wbVar == dahmVarH.b) {
                        i = 1;
                    } else if (wbVar == dahmVarH.k) {
                        i = 4;
                    } else if (wbVar != dahmVarH.i) {
                        if (wbVar == dahmVarH.e.e) {
                            i = 2;
                        } else if (wbVar == dahmVarH.m) {
                            i = 6;
                        } else if (wbVar == dahmVarH.f.e) {
                            i = 3;
                        } else {
                            ejwl.l(wbVar == dahmVarH.d);
                            i = 7;
                        }
                    }
                    dahlVar = new dahl(i, wbVar.Q());
                } else {
                    dahlVar = new dahl(-1, null);
                }
            }
            czzjVarH.E = (ZeroStateSearchResultsView) viewInflate.findViewById(R.id.zero_state_search_results);
            if (!((asgn) czzjVarH.v.b()).a()) {
                viewInflate.setSystemUiVisibility(768);
            }
            viewInflate.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: czzb
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) throws Resources.NotFoundException {
                    View viewFindViewById2 = view.findViewById(R.id.zero_state_search_box_container);
                    if (!viewFindViewById2.isLaidOut()) {
                        viewInflate.requestApplyInsets();
                        return windowInsets;
                    }
                    czzj czzjVar = czzjVarH;
                    ea eaVar2 = czzjVar.b;
                    int dimensionPixelSize = eaVar2.B().getDimensionPixelSize(R.dimen.zero_state_search_box_margin_top);
                    int measuredHeight = view.findViewById(R.id.zero_state_search_box).getMeasuredHeight() + dimensionPixelSize;
                    view.setPadding(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), 0);
                    viewFindViewById2.setTranslationY(windowInsets.getSystemWindowInsetTop() + dimensionPixelSize);
                    fcsu fcsuVar2 = czzjVar.w;
                    if (((asgw) fcsuVar2.b()).a()) {
                        View viewFindViewById3 = view.findViewById(R.id.zero_state_search_box_protection);
                        int i2 = dimensionPixelSize + measuredHeight;
                        viewFindViewById3.setTranslationY(windowInsets.getSystemWindowInsetTop());
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewFindViewById3.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.height = i2;
                            viewFindViewById3.setLayoutParams(layoutParams);
                        }
                    }
                    czzjVar.c(view, windowInsets, measuredHeight, eaVar2.B().getDimensionPixelSize(true != ((asgw) fcsuVar2.b()).a() ? R.dimen.zero_state_search_text_result_start_end_padding : R.dimen.zero_state_search_text_result_start_end_padding_coolranch), R.id.zero_state_search_results, R.dimen.zero_state_search_top_singe_results_margin);
                    czzjVar.c(view, windowInsets, measuredHeight, 0, R.id.zero_state_search_multiple_result_container, R.dimen.zero_state_search_top_multi_results_margin);
                    czzjVar.c(view, windowInsets, measuredHeight, 0, R.id.zero_state_search_home_group, true != ((asgw) fcsuVar2.b()).a() ? R.dimen.zero_state_search_top_margin : R.dimen.zero_state_search_top_margin_coolranch);
                    czzj.e(view, windowInsets, R.id.zero_state_search_results);
                    czzj.e(view, windowInsets, R.id.zero_state_multiple_results_group);
                    czzj.e(view, windowInsets, R.id.zero_state_search_home_group);
                    return windowInsets;
                }
            });
            dahm dahmVarH2 = czzjVarH.E.H();
            lvj lvjVarQ = eaVar.Q();
            dahmVarH2.a.k = dacuVar;
            ZeroStateSearchResultsView zeroStateSearchResultsView2 = dahmVarH2.p;
            dahmVarH2.g = new daez(zeroStateSearchResultsView2.getContext());
            Context context = zeroStateSearchResultsView2.getContext();
            dahl dahlVar2 = dahlVar;
            fcsu fcsuVar2 = dahmVarH2.q;
            fcsu fcsuVar3 = dahmVarH2.v;
            dahmVarH2.e = new dafd(context, fcsuVar2, (dabl) fcsuVar3.b(), (daig) dahmVarH2.r.b());
            dahmVarH2.e.i = dacuVar;
            dahmVarH2.f = ((daha) dahmVarH2.u.b()).a(zeroStateSearchResultsView2.getContext(), lvjVarQ);
            dahmVarH2.f.i = dacuVar;
            Context context2 = zeroStateSearchResultsView2.getContext();
            dabl dablVar = (dabl) fcsuVar3.b();
            fcsu fcsuVar4 = dahmVarH2.x;
            fcsu fcsuVar5 = dahmVarH2.s;
            dahmVarH2.h = new daev(context2, dacuVar, fcsuVar2, dablVar, fcsuVar4, lvjVarQ, (dafl) fcsuVar5.b(), true);
            dahmVarH2.j = new daeh(zeroStateSearchResultsView2.getContext(), lvjVarQ, dacuVar, (dafl) fcsuVar5.b(), fcsuVar2, fcsuVar4, (dabl) fcsuVar3.b(), true);
            dahmVarH2.l = ((dadl) dahmVarH2.t.b()).a();
            dafd dafdVar = dahmVarH2.e;
            dagz dagzVar = dahmVarH2.f;
            dahmVarH2.o = new daey(-1, new daex(dafdVar, dafdVar.e), new daex(dagzVar, dagzVar.e));
            if (((asgw) fcsuVar4.b()).a()) {
                zeroStateSearchResultsView2.v(((dadn) dahmVarH2.w.b()).a(eehg.b(zeroStateSearchResultsView2, R.attr.colorSurface), r5.getDimensionPixelSize(R.dimen.containment_decoration_corner_radius_large), r5.getDimensionPixelSize(R.dimen.containment_decoration_corner_radius_small), zeroStateSearchResultsView2.getContext().getResources().getDimensionPixelSize(R.dimen.containment_decoration_item_offset), new dado() { // from class: dahk
                    @Override // defpackage.dado
                    public final boolean a(wv wvVar) {
                        return (wvVar instanceof dadj) || (wvVar instanceof dagc) || (wvVar instanceof dagh);
                    }
                }));
            }
            czzjVarH.E.H().n = dahlVar2;
            czzjVarH.F = viewInflate.findViewById(R.id.zero_state_search_no_results_group);
            czzjVarH.G = viewInflate.findViewById(R.id.zero_state_search_empty_results_group);
            czzjVarH.C = (ZeroStateSearchHomeView) viewInflate.findViewById(R.id.zero_state_search_home_group);
            ZeroStateSearchHomeView zeroStateSearchHomeView = czzjVarH.C;
            ZeroStateSearchBox zeroStateSearchBox2 = czzjVarH.B;
            zeroStateSearchHomeView.c = (ZeroStateContentGridLayout) zeroStateSearchHomeView.b.b();
            zeroStateSearchHomeView.a.setVisibility(8);
            daap daapVarH = zeroStateSearchHomeView.c.H();
            zeroStateSearchBox2.getClass();
            daapVarH.e = zeroStateSearchBox2;
            czzjVarH.D = (ZeroStateSearchMultipleResultsView) viewInflate.findViewById(R.id.zero_state_multiple_results_group);
            dahe daheVarH = czzjVarH.D.H();
            final ZeroStateSearchBox zeroStateSearchBox3 = czzjVarH.B;
            lvj lvjVarQ2 = eaVar.Q();
            daheVarH.j = zeroStateSearchBox3;
            dagd dagdVar = daheVarH.m;
            if (dagdVar != null) {
                dagdVar.k = dacuVar;
            }
            final daff daffVarH = daheVarH.k.H();
            daffVarH.f = dacuVar;
            ChipGroup chipGroup = (ChipGroup) ((ResultsFilterView) daffVarH.b.b()).findViewById(R.id.chip_group);
            for (int i2 = 0; i2 < chipGroup.getChildCount(); i2++) {
                chipGroup.getChildAt(i2).setOnClickListener(new eifs((eigp) daffVarH.d.b(), "com/google/android/apps/messaging/ui/search/resultsview/ResultsFilterViewPeer", "init", 69, "ResultsFilterViewPeer#setOnClickListener", new View.OnClickListener() { // from class: dafe
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SearchFilterDataItem searchFilterDataItemF;
                        int id = view.getId();
                        daff daffVar = daffVarH;
                        if (id == R.id.starred_chip) {
                            searchFilterDataItemF = ((dach) daffVar.c.b()).f(false);
                            ((dabl) daffVar.e.b()).f(16, 10);
                        } else {
                            Integer num = (Integer) daff.a.get(Integer.valueOf(view.getId()));
                            num.getClass();
                            fcsu fcsuVar6 = daffVar.c;
                            int iIntValue = num.intValue();
                            ContentFilterDataItem contentFilterDataItemB = ((dach) fcsuVar6.b()).b(new SearchQuery.ContentSearchFilter(iIntValue));
                            ((dabl) daffVar.e.b()).e(16, iIntValue);
                            searchFilterDataItemF = contentFilterDataItemB;
                        }
                        zeroStateSearchBox3.h(searchFilterDataItemF);
                    }
                }));
            }
            daffVarH.a();
            ZeroStateSearchMultipleResultsView zeroStateSearchMultipleResultsView = daheVarH.h;
            daez daezVar = new daez(zeroStateSearchMultipleResultsView.getContext());
            daheVarH.t = (RecyclerView) zeroStateSearchMultipleResultsView.findViewById(R.id.zero_state_search_photo_results);
            daheVarH.t.setNestedScrollingEnabled(false);
            daheVarH.t.v(daezVar);
            Context context3 = zeroStateSearchMultipleResultsView.getContext();
            fcsu fcsuVar6 = daheVarH.b;
            fcsu fcsuVar7 = daheVarH.g;
            daheVarH.u = new dafd(context3, fcsuVar6, (dabl) fcsuVar7.b(), (daig) daheVarH.c.b());
            daheVarH.t.ao(daheVarH.u.e);
            dafd dafdVar2 = daheVarH.u;
            int iL = dafdVar2.l();
            cvja cvjaVar = new cvja(dafdVar2, iL + iL);
            daheVarH.t.al(cvjaVar);
            daheVarH.u.i = dacuVar;
            daheVarH.x = (RecyclerView) zeroStateSearchMultipleResultsView.findViewById(R.id.zero_state_search_video_results);
            daheVarH.x.setNestedScrollingEnabled(false);
            daheVarH.x.v(daezVar);
            daheVarH.y = ((daha) daheVarH.f.b()).a(zeroStateSearchMultipleResultsView.getContext(), lvjVarQ2);
            daheVarH.x.ao(daheVarH.y.e);
            dagz dagzVar2 = daheVarH.y;
            int iL2 = dagzVar2.l();
            cvja cvjaVar2 = new cvja(dagzVar2, iL2 + iL2);
            daheVarH.x.al(cvjaVar2);
            daheVarH.y.i = dacuVar;
            daheVarH.B = (RecyclerView) zeroStateSearchMultipleResultsView.findViewById(R.id.zero_state_search_location_results);
            daheVarH.B.setNestedScrollingEnabled(false);
            Context context4 = zeroStateSearchMultipleResultsView.getContext();
            dabl dablVar2 = (dabl) fcsuVar7.b();
            fcsu fcsuVar8 = daheVarH.i;
            fcsu fcsuVar9 = daheVarH.d;
            daheVarH.C = new daev(context4, dacuVar, fcsuVar6, dablVar2, fcsuVar8, lvjVarQ2, (dafl) fcsuVar9.b(), false);
            zeroStateSearchMultipleResultsView.getContext();
            daheVarH.B.ao(new LinearLayoutManager());
            daheVarH.B.al(new cvja(daheVarH.C, 2));
            daheVarH.F = (RecyclerView) zeroStateSearchMultipleResultsView.findViewById(R.id.zero_state_search_link_results);
            daheVarH.F.setNestedScrollingEnabled(false);
            daheVarH.G = new daeh(zeroStateSearchMultipleResultsView.getContext(), lvjVarQ2, dacuVar, (dafl) fcsuVar9.b(), fcsuVar6, fcsuVar8, (dabl) fcsuVar7.b(), false);
            zeroStateSearchMultipleResultsView.getContext();
            daheVarH.F.ao(new LinearLayoutManager());
            daheVarH.F.al(new cvja(daheVarH.G, 2));
            daheVarH.N = new daey(2, new daex(cvjaVar, daheVarH.u.e), new daex(cvjaVar2, daheVarH.y.e));
            daheVarH.J = (RecyclerView) zeroStateSearchMultipleResultsView.findViewById(R.id.zero_state_search_contact_results);
            daheVarH.K = ((dadl) daheVarH.e.b()).a();
            RecyclerView recyclerView = daheVarH.J;
            zeroStateSearchMultipleResultsView.getContext();
            recyclerView.ao(new LinearLayoutManager());
            daheVarH.J.al(new cvja(daheVarH.K, 3));
            if (((asgw) fcsuVar8.b()).a()) {
                daheVarH.a(daheVarH.J);
                daheVarH.a(daheVarH.p);
                daheVarH.a(daheVarH.l);
            }
            czzjVarH.C.setVisibility(8);
            czzjVarH.F.setVisibility(8);
            czzjVarH.G.setVisibility(8);
            czzjVarH.E.setVisibility(8);
            czzjVarH.D.setVisibility(8);
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: czze
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    czzj czzjVar = czzjVarH;
                    ajfo ajfoVar = czzjVar.i;
                    ViewTreeObserver.OnPreDrawListener onPreDrawListener2 = czzjVar.M;
                    ajfoVar.e(dadd.a);
                    if (onPreDrawListener2 == null) {
                        return true;
                    }
                    viewInflate.getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener2);
                    czzjVar.M = null;
                    return true;
                }
            };
            czzjVarH.M = onPreDrawListener;
            viewInflate.getViewTreeObserver().addOnPreDrawListener(onPreDrawListener);
            if (viewInflate == null) {
                czzl.a(this, H());
            }
            eidc.q();
            return viewInflate;
        } finally {
        }
    }

    @Override // defpackage.ea, defpackage.lvj
    public final lvc P() {
        return this.e;
    }

    @Override // defpackage.ea
    public final void aA(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    @Override // defpackage.ea
    public final void aD(Intent intent) {
        if (ehlf.a(intent, z().getApplicationContext())) {
            eiid.n(intent);
        }
        aQ(intent);
    }

    @Override // defpackage.ea
    public final void aQ(Intent intent) {
        if (ehlf.a(intent, z().getApplicationContext())) {
            eiid.n(intent);
        }
        super.aQ(intent);
    }

    @Override // defpackage.czya, defpackage.ecdo, defpackage.ea
    public final void ag(Activity activity) {
        this.c.k();
        try {
            super.ag(activity);
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void ap(View view, Bundle bundle) {
        this.c.k();
        try {
            einc.b(this).b = view;
            H();
            czzl.a(this, H());
            bn(view, bundle);
            final czzj czzjVarH = H();
            if (((asgw) czzjVarH.w.b()).a() && !((askx) czzjVarH.y.b()).a()) {
                view.setBackgroundColor(eehg.b(view, R.attr.colorSurfaceContainer));
            }
            dacu dacuVar = czzjVarH.c;
            lvv lvvVarG = dacuVar.g();
            ea eaVar = czzjVarH.b;
            lvvVarG.f(eaVar.Q(), new eiln(czzjVarH.h, new lvz() { // from class: czyz
                @Override // defpackage.lvz
                public final void a(Object obj) throws Resources.NotFoundException {
                    boolean zIsEmpty;
                    dacj dacjVar = (dacj) obj;
                    int iE = dacjVar.e() - 1;
                    czzj czzjVar = czzjVarH;
                    if (iE == 0) {
                        ekrw ekrwVarH = czzj.a.h();
                        ekrwVarH.X(eksq.a, "Bugle");
                        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/ui/search/ZeroStateSearchFragmentPeer", "showHomeScreen", 562, "ZeroStateSearchFragmentPeer.java")).q("showing zero-state home view");
                        if (czzjVar.d(czzjVar.C)) {
                            ZeroStateSearchBox zeroStateSearchBox = czzjVar.B;
                            ea eaVar2 = czzjVar.b;
                            zeroStateSearchBox.e(eaVar2.G(), czzjVar.C, eaVar2.P());
                            return;
                        }
                        return;
                    }
                    if (iE == 1) {
                        ekrw ekrwVarH2 = czzj.a.h();
                        ekrwVarH2.X(eksq.a, "Bugle");
                        ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/ui/search/ZeroStateSearchFragmentPeer", "showSearching", 570, "ZeroStateSearchFragmentPeer.java")).q("hidding home view while searching");
                        czzjVar.d(null);
                        return;
                    }
                    if (iE == 2) {
                        if (!czzjVar.c.v() || !czzjVar.L) {
                            ekrw ekrwVarH3 = czzj.a.h();
                            ekrwVarH3.X(eksq.a, "Bugle");
                            ((ekrd) ((ekrd) ekrwVarH3).h("com/google/android/apps/messaging/ui/search/ZeroStateSearchFragmentPeer", "showNoResults", 587, "ZeroStateSearchFragmentPeer.java")).q("showing no results view");
                            czzjVar.d(czzjVar.F);
                            czzjVar.g.g(2);
                            return;
                        }
                        ekrw ekrwVarH4 = czzj.a.h();
                        ekrwVarH4.X(eksq.a, "Bugle");
                        ((ekrd) ((ekrd) ekrwVarH4).h("com/google/android/apps/messaging/ui/search/ZeroStateSearchFragmentPeer", "showEmptyResults", 575, "ZeroStateSearchFragmentPeer.java")).q("showing empty results view");
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) czzjVar.G.getLayoutParams();
                        layoutParams.getClass();
                        layoutParams.addRule(3, R.id.zero_state_search_box_container);
                        czzjVar.G.setLayoutParams(layoutParams);
                        if (czzjVar.d(czzjVar.G)) {
                            ZeroStateSearchBox zeroStateSearchBox2 = czzjVar.B;
                            ea eaVar3 = czzjVar.b;
                            zeroStateSearchBox2.e(eaVar3.G(), czzjVar.G, eaVar3.P());
                        }
                        czzjVar.g.g(3);
                        return;
                    }
                    if (iE != 3) {
                        if (bxwt.k(dacjVar.a())) {
                            czzjVar.b(dacjVar.a());
                            return;
                        }
                        ekrw ekrwVarH5 = czzj.a.h();
                        ekrwVarH5.X(eksq.a, "Bugle");
                        ((ekrd) ((ekrd) ekrwVarH5).h("com/google/android/apps/messaging/ui/search/ZeroStateSearchFragmentPeer", "showMultiTypeResults", 593, "ZeroStateSearchFragmentPeer.java")).q("showMultiTypeResults");
                        dahe daheVarH = czzjVar.D.H();
                        bxwt bxwtVarA = dacjVar.a();
                        daheVarH.k.H().a();
                        dagd dagdVar = daheVarH.m;
                        if (dagdVar != null) {
                            dagdVar.F(dacjVar.b());
                            daheVarH.b(daheVarH.l, daheVarH.n, daheVarH.o, !((dabo) r5).b.isEmpty(), 1);
                        }
                        daheVarH.q.F(dacjVar.b());
                        daheVarH.b(daheVarH.p, daheVarH.r, daheVarH.s, !((dabo) dacjVar.b()).a.isEmpty(), 7);
                        dafd dafdVar = daheVarH.u;
                        if (dafdVar != null) {
                            dafdVar.G(bxwtVarA.d());
                            daheVarH.b(daheVarH.t, daheVarH.v, daheVarH.w, !r5.isEmpty(), 2);
                        }
                        dagz dagzVar = daheVarH.y;
                        if (dagzVar != null) {
                            dagzVar.G(bxwtVarA.h());
                            daheVarH.b(daheVarH.x, daheVarH.z, daheVarH.A, !r5.isEmpty(), 3);
                        }
                        daev daevVar = daheVarH.C;
                        if (daevVar != null) {
                            ekgb ekgbVarF = bxwtVarA.f();
                            daevVar.M(dacjVar.d());
                            daheVarH.b(daheVarH.B, daheVarH.D, daheVarH.E, !ekgbVarF.isEmpty(), 5);
                            zIsEmpty = ekgbVarF.isEmpty();
                        } else {
                            zIsEmpty = true;
                        }
                        if (daheVarH.G != null) {
                            List listC = dacjVar.c();
                            daeh daehVar = daheVarH.G;
                            daehVar.f = zIsEmpty;
                            daehVar.M(listC);
                            daheVarH.b(daheVarH.F, daheVarH.H, daheVarH.I, !listC.isEmpty(), 4);
                        }
                        dadk dadkVar = daheVarH.K;
                        if (dadkVar != null) {
                            dadkVar.l(bxwtVarA.c());
                            daheVarH.b(daheVarH.J, daheVarH.L, daheVarH.M, !r1.isEmpty(), 6);
                        }
                        czzjVar.d(czzjVar.D);
                        czzjVar.g.h(5, dacjVar.a());
                        return;
                    }
                    if (bxwt.k(dacjVar.a())) {
                        czzjVar.b(dacjVar.a());
                        return;
                    }
                    ekrw ekrwVarH6 = czzj.a.h();
                    ekrwVarH6.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarH6).h("com/google/android/apps/messaging/ui/search/ZeroStateSearchFragmentPeer", "showSingleTypeResults", 601, "ZeroStateSearchFragmentPeer.java")).q("showing single type results view");
                    dahm dahmVarH = czzjVar.E.H();
                    bxwt bxwtVarA2 = dacjVar.a();
                    boolean zIsEmpty2 = ((dabo) dacjVar.b()).b.isEmpty();
                    int i = R.dimen.zero_state_search_text_result_start_end_padding_coolranch;
                    if (zIsEmpty2) {
                        Cursor cursor = ((bxtv) bxwtVarA2.b()).a;
                        if (cursor.getCount() > 0) {
                            dagi dagiVar = dahmVarH.c;
                            dagiVar.F(dacjVar.b());
                            int count = cursor.getCount();
                            ZeroStateSearchResultsView zeroStateSearchResultsView = dahmVarH.p;
                            if (zeroStateSearchResultsView.n != dagiVar) {
                                if (zeroStateSearchResultsView.e() > 0) {
                                    zeroStateSearchResultsView.ad(dahmVarH.g);
                                }
                                int dimensionPixelSize = zeroStateSearchResultsView.getContext().getResources().getDimensionPixelSize(true != ((asgw) dahmVarH.x.b()).a() ? R.dimen.zero_state_search_text_result_start_end_padding : R.dimen.zero_state_search_text_result_start_end_padding_coolranch);
                                zeroStateSearchResultsView.setPadding(dimensionPixelSize, zeroStateSearchResultsView.getPaddingTop(), dimensionPixelSize, zeroStateSearchResultsView.getPaddingBottom());
                                zeroStateSearchResultsView.al(dagiVar);
                                zeroStateSearchResultsView.ao(dahmVarH.d);
                                dahmVarH.a(1);
                            }
                            fcsu fcsuVar = dahmVarH.q;
                            ((dabm) fcsuVar.b()).g(1);
                            ((dabm) fcsuVar.b()).f(1, count);
                        } else {
                            ekgb ekgbVarD = bxwtVarA2.d();
                            boolean zIsEmpty3 = ekgbVarD.isEmpty();
                            int i2 = R.dimen.zero_state_search_media_edge_margin;
                            if (zIsEmpty3) {
                                ekgb ekgbVarH = bxwtVarA2.h();
                                if (!ekgbVarH.isEmpty()) {
                                    dahmVarH.f.G(ekgbVarH);
                                    int size = ekgbVarH.size();
                                    ZeroStateSearchResultsView zeroStateSearchResultsView2 = dahmVarH.p;
                                    if (zeroStateSearchResultsView2.n != dahmVarH.f) {
                                        if (((askw) dahmVarH.y.b()).a()) {
                                            if (!dahmVarH.b()) {
                                                zeroStateSearchResultsView2.v(dahmVarH.g);
                                            }
                                        } else if (zeroStateSearchResultsView2.e() <= 0) {
                                            zeroStateSearchResultsView2.v(dahmVarH.g);
                                        }
                                        int dimensionPixelSize2 = zeroStateSearchResultsView2.getContext().getResources().getDimensionPixelSize(true != ((asgw) dahmVarH.x.b()).a() ? R.dimen.zero_state_search_media_edge_margin : R.dimen.zero_state_search_text_result_start_end_padding_coolranch);
                                        zeroStateSearchResultsView2.setPadding(dimensionPixelSize2, zeroStateSearchResultsView2.getPaddingTop(), dimensionPixelSize2, zeroStateSearchResultsView2.getPaddingBottom());
                                        zeroStateSearchResultsView2.al(dahmVarH.f);
                                        zeroStateSearchResultsView2.ao(dahmVarH.f.e);
                                        dahmVarH.a(3);
                                    }
                                    fcsu fcsuVar2 = dahmVarH.q;
                                    ((dabm) fcsuVar2.b()).g(3);
                                    ((dabm) fcsuVar2.b()).f(3, size);
                                }
                                ekgb ekgbVarF2 = bxwtVarA2.f();
                                if (!ekgbVarF2.isEmpty()) {
                                    dahmVarH.h.M(dacjVar.d());
                                    int size2 = ekgbVarF2.size();
                                    ZeroStateSearchResultsView zeroStateSearchResultsView3 = dahmVarH.p;
                                    if (zeroStateSearchResultsView3.n != dahmVarH.h) {
                                        if (zeroStateSearchResultsView3.e() > 0) {
                                            zeroStateSearchResultsView3.ad(dahmVarH.g);
                                        }
                                        int dimensionPixelSize3 = zeroStateSearchResultsView3.getContext().getResources().getDimensionPixelSize(true != ((asgw) dahmVarH.x.b()).a() ? R.dimen.zero_state_search_media_edge_margin : R.dimen.zero_state_search_text_result_start_end_padding_coolranch);
                                        zeroStateSearchResultsView3.setPadding(dimensionPixelSize3, zeroStateSearchResultsView3.getPaddingTop(), dimensionPixelSize3, zeroStateSearchResultsView3.getPaddingBottom());
                                        zeroStateSearchResultsView3.al(dahmVarH.h);
                                        zeroStateSearchResultsView3.ao(dahmVarH.i);
                                        dahmVarH.a(5);
                                    }
                                    fcsu fcsuVar3 = dahmVarH.q;
                                    ((dabm) fcsuVar3.b()).g(5);
                                    ((dabm) fcsuVar3.b()).f(5, size2);
                                }
                                List listC2 = dacjVar.c();
                                if (!listC2.isEmpty()) {
                                    dahmVarH.j.M(listC2);
                                    int i3 = ((ekoe) listC2).c;
                                    ZeroStateSearchResultsView zeroStateSearchResultsView4 = dahmVarH.p;
                                    if (zeroStateSearchResultsView4.n != dahmVarH.j) {
                                        if (zeroStateSearchResultsView4.e() > 0) {
                                            zeroStateSearchResultsView4.ad(dahmVarH.g);
                                        }
                                        Resources resources = zeroStateSearchResultsView4.getContext().getResources();
                                        if (true == ((asgw) dahmVarH.x.b()).a()) {
                                            i2 = R.dimen.zero_state_search_text_result_start_end_padding_coolranch;
                                        }
                                        int dimensionPixelSize4 = resources.getDimensionPixelSize(i2);
                                        zeroStateSearchResultsView4.setPadding(dimensionPixelSize4, zeroStateSearchResultsView4.getPaddingTop(), dimensionPixelSize4, zeroStateSearchResultsView4.getPaddingBottom());
                                        zeroStateSearchResultsView4.al(dahmVarH.j);
                                        zeroStateSearchResultsView4.ao(dahmVarH.k);
                                        dahmVarH.a(4);
                                    }
                                    fcsu fcsuVar4 = dahmVarH.q;
                                    ((dabm) fcsuVar4.b()).g(4);
                                    ((dabm) fcsuVar4.b()).f(4, i3);
                                }
                                ekgb ekgbVarC = bxwtVarA2.c();
                                if (!ekgbVarC.isEmpty()) {
                                    dahmVarH.l.l(ekgbVarC);
                                    int size3 = ekgbVarC.size();
                                    ZeroStateSearchResultsView zeroStateSearchResultsView5 = dahmVarH.p;
                                    if (zeroStateSearchResultsView5.n != dahmVarH.l) {
                                        if (zeroStateSearchResultsView5.e() > 0) {
                                            zeroStateSearchResultsView5.ad(dahmVarH.g);
                                        }
                                        Resources resources2 = zeroStateSearchResultsView5.getContext().getResources();
                                        if (true != ((asgw) dahmVarH.x.b()).a()) {
                                            i = R.dimen.zero_state_search_text_result_start_end_padding;
                                        }
                                        int dimensionPixelSize5 = resources2.getDimensionPixelSize(i);
                                        zeroStateSearchResultsView5.setPadding(dimensionPixelSize5, zeroStateSearchResultsView5.getPaddingTop(), dimensionPixelSize5, zeroStateSearchResultsView5.getPaddingBottom());
                                        zeroStateSearchResultsView5.al(dahmVarH.l);
                                        zeroStateSearchResultsView5.ao(dahmVarH.m);
                                        dahmVarH.a(6);
                                    }
                                    fcsu fcsuVar5 = dahmVarH.q;
                                    ((dabm) fcsuVar5.b()).g(6);
                                    ((dabm) fcsuVar5.b()).f(6, size3);
                                }
                            } else {
                                dahmVarH.e.G(ekgbVarD);
                                int size4 = ekgbVarD.size();
                                ZeroStateSearchResultsView zeroStateSearchResultsView6 = dahmVarH.p;
                                if (zeroStateSearchResultsView6.n != dahmVarH.e) {
                                    if (((askw) dahmVarH.y.b()).a()) {
                                        if (!dahmVarH.b()) {
                                            zeroStateSearchResultsView6.v(dahmVarH.g);
                                        }
                                    } else if (zeroStateSearchResultsView6.e() <= 0) {
                                        zeroStateSearchResultsView6.v(dahmVarH.g);
                                    }
                                    Resources resources3 = zeroStateSearchResultsView6.getContext().getResources();
                                    if (true != ((asgw) dahmVarH.x.b()).a()) {
                                        i = R.dimen.zero_state_search_media_edge_margin;
                                    }
                                    int dimensionPixelSize6 = resources3.getDimensionPixelSize(i);
                                    zeroStateSearchResultsView6.setPadding(dimensionPixelSize6, zeroStateSearchResultsView6.getPaddingTop(), dimensionPixelSize6, zeroStateSearchResultsView6.getPaddingBottom());
                                    zeroStateSearchResultsView6.al(dahmVarH.e);
                                    zeroStateSearchResultsView6.ao(dahmVarH.e.e);
                                    dahmVarH.a(2);
                                }
                                fcsu fcsuVar6 = dahmVarH.q;
                                ((dabm) fcsuVar6.b()).g(2);
                                ((dabm) fcsuVar6.b()).f(2, size4);
                            }
                        }
                    } else {
                        dagd dagdVar2 = dahmVarH.a;
                        dagdVar2.F(dacjVar.b());
                        ekgb ekgbVar = ((dabo) dacjVar.b()).b;
                        ZeroStateSearchResultsView zeroStateSearchResultsView7 = dahmVarH.p;
                        int size5 = ekgbVar.size();
                        if (zeroStateSearchResultsView7.n != dagdVar2) {
                            if (zeroStateSearchResultsView7.e() > 0) {
                                zeroStateSearchResultsView7.ad(dahmVarH.g);
                            }
                            int dimensionPixelSize7 = zeroStateSearchResultsView7.getContext().getResources().getDimensionPixelSize(true != ((asgw) dahmVarH.x.b()).a() ? R.dimen.zero_state_search_text_result_start_end_padding : R.dimen.zero_state_search_text_result_start_end_padding_coolranch);
                            zeroStateSearchResultsView7.setPadding(dimensionPixelSize7, zeroStateSearchResultsView7.getPaddingTop(), dimensionPixelSize7, zeroStateSearchResultsView7.getPaddingBottom());
                            zeroStateSearchResultsView7.al(dagdVar2);
                        }
                        zeroStateSearchResultsView7.ao(dahmVarH.b);
                        dahmVarH.a(1);
                        fcsu fcsuVar7 = dahmVarH.q;
                        ((dabm) fcsuVar7.b()).g(1);
                        ((dabm) fcsuVar7.b()).f(1, size5);
                    }
                    czzjVar.d(czzjVar.E);
                    czzjVar.g.h(4, dacjVar.a());
                }
            }, "ZeroStateSearchFragmentPeer#onViewCreated observer"));
            dacuVar.a().f(eaVar.Q(), new lvz() { // from class: czza
                @Override // defpackage.lvz
                public final void a(Object obj) {
                    if (((dstv) obj).a.compareAndSet(false, true)) {
                        final czzj czzjVar = czzjVarH;
                        if (((asky) czzjVar.x.b()).a()) {
                            return;
                        }
                        ekrw ekrwVarH = czzj.a.h();
                        ekrwVarH.X(eksq.a, "Bugle");
                        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/ui/search/ZeroStateSearchFragmentPeer", "onViewCreated", 548, "ZeroStateSearchFragmentPeer.java")).q("hidding content views");
                        czzjVar.K = czzjVar.f.f().toEpochMilli() + czzjVar.C.animate().alpha(0.0f).withEndAction(new Runnable() { // from class: czzd
                            @Override // java.lang.Runnable
                            public final void run() {
                                czzjVar.C.setVisibility(8);
                            }
                        }).getDuration();
                    }
                }
            });
            ((aomv) czzjVarH.m.b()).d();
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.czya
    protected final /* bridge */ /* synthetic */ ehok b() {
        return new ehof(this, true);
    }

    @Override // defpackage.ehlc
    @Deprecated
    public final Context bd() {
        if (this.d == null) {
            this.d = new ehnz(this, super.z());
        }
        return this.d;
    }

    @Override // defpackage.ehnp, defpackage.eifl
    public final eiik bf() {
        return this.c.a;
    }

    @Override // defpackage.ehnw
    public final Locale bg() {
        return ehnv.a(this);
    }

    @Override // defpackage.ehnp, defpackage.eifl
    public final void bh(eiik eiikVar, boolean z) {
        this.c.e(eiikVar, z);
    }

    @Override // defpackage.ehnp, defpackage.eifl
    public final void bi(eiik eiikVar) {
        this.c.b = eiikVar;
    }

    @Override // defpackage.ehlg
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final czzj H() {
        czzj czzjVar = this.a;
        if (czzjVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ah) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return czzjVar;
    }

    @Override // defpackage.czya, defpackage.ehnp, defpackage.ea
    public final void g(Context context) {
        eieu eieuVar;
        this.c.k();
        try {
            if (this.ah) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/ui/search/ZeroStateSearchFragment", 97, czyw.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/ui/search/ZeroStateSearchFragment", 102, czyw.class, "CreatePeer");
                        try {
                            ea eaVar = (ea) ((eyig) ((ahhw) objBb).e).a;
                            ahhe ahheVar = ((ahhw) objBb).d;
                            dacu dacuVarT = ((dacf) ((eyhx) ((ehnu) ahheVar.g.b()).a).bb()).T();
                            dacuVarT.getClass();
                            ahjr ahjrVar = ((ahhw) objBb).b;
                            avmp avmpVar = (avmp) ahjrVar.dx.b();
                            ahkn ahknVar = ((ahhw) objBb).a;
                            ahng ahngVar = ahknVar.b;
                            daoe daoeVar = (daoe) ahngVar.hX.b();
                            cogw cogwVar = (cogw) ahknVar.cD.b();
                            dabl dablVar = (dabl) ahngVar.E.b();
                            eilo eiloVar = (eilo) ((ahhw) objBb).cK.b();
                            ahnh ahnhVar = ahknVar.a;
                            eieuVar = eieuVarG2;
                            try {
                                this.a = new czzj(eaVar, dacuVarT, avmpVar, daoeVar, cogwVar, dablVar, eiloVar, (ajfo) ahnhVar.vh.b(), (egpr) ((ahhw) objBb).f.b(), (tlt) ahheVar.p.b(), ((ahhw) objBb).t, ahjrVar.au, ahjrVar.ap, (efwo) ahjrVar.b.b(), (ehbb) ((ahhw) objBb).n.b(), ((ahhw) objBb).dY, ahngVar.ff, ahngVar.ky, ahnhVar.so, ahnhVar.zO, ahheVar.H, ((ahhw) objBb).c.l, ahnhVar.adE, ahngVar.kz, ahngVar.kA, ahngVar.kB);
                                eieuVar.close();
                                this.Z.c(new ehns(this.c, this.e));
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                try {
                                    eieuVar.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            eieuVar = eieuVarG2;
                        }
                    } finally {
                    }
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            eidc.q();
        } finally {
        }
    }

    @Override // defpackage.ea
    public final LayoutInflater go(Bundle bundle) {
        this.c.k();
        try {
            LayoutInflater layoutInflaterAO = aO();
            LayoutInflater layoutInflaterCloneInContext = layoutInflaterAO.cloneInContext(new ehol.a(layoutInflaterAO, this));
            LayoutInflater layoutInflaterCloneInContext2 = layoutInflaterCloneInContext.cloneInContext(new ehnz(this, layoutInflaterCloneInContext));
            eidc.q();
            return layoutInflaterCloneInContext2;
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void h(Bundle bundle) {
        this.c.k();
        try {
            aX(bundle);
            czzj czzjVarH = H();
            egpr egprVar = czzjVarH.j;
            egprVar.j(czzjVarH.z);
            czzjVarH.A = new czzi(czzjVarH);
            egprVar.j(czzjVarH.A);
            ea eaVar = czzjVarH.b;
            czzjVarH.H = eaVar.B().getInteger(R.integer.zero_state_fade_in_duration);
            czzjVarH.I = eaVar.B().getInteger(R.integer.zero_state_fade_out_duration);
            czzjVarH.J = eaVar.B().getDimension(R.dimen.zero_state_content_in_animation_translation_y);
            czzjVarH.O = true;
            Bundle bundle2 = eaVar.m;
            if (bundle2 != null) {
                SearchFilterDataItem searchFilterDataItem = (SearchFilterDataItem) bundle2.getParcelable("base_search_filter_data_item");
                czzjVarH.L = bundle2.getBoolean("conversation_contain_message");
                czzjVarH.l.a = bundle2.getBoolean("is_bubble_activity", false);
                if (searchFilterDataItem != null) {
                    czzjVarH.c.s(searchFilterDataItem);
                }
            }
            egprVar.j(((aomv) czzjVarH.m.b()).d);
            czzjVarH.k.g(R.id.category_content_data_source, new daad((daae) czzjVarH.p.b()), new czzf(czzjVarH));
            ((afzd) czzjVarH.u.b()).a();
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void i() {
        eifp eifpVarB = this.c.b();
        try {
            aZ();
            if (this.Q == null) {
                this.ag.c();
            }
            eifpVarB.close();
        } catch (Throwable th) {
            try {
                eifpVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdo, defpackage.ea
    public final void j() {
        eifp eifpVarA = this.c.a();
        try {
            bc();
            this.ah = true;
            eifpVarA.close();
        } catch (Throwable th) {
            try {
                eifpVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void l() {
        this.c.k();
        try {
            bl();
            czzj czzjVarH = H();
            dacu dacuVar = czzjVarH.c;
            if (dacuVar != null && !czzjVarH.O) {
                dacuVar.w(5);
            }
            czzjVarH.O = false;
            dabl dablVar = czzjVarH.g;
            dablVar.f = ((aisp) dablVar.d.b()).b(176571, null);
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.einn
    public final eine p(einb einbVar) {
        return this.ag.a(einbVar);
    }

    @Override // defpackage.einn
    public final void q(Class cls, eind eindVar) {
        this.ag.b(cls, eindVar);
    }

    @Override // defpackage.czya, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}
