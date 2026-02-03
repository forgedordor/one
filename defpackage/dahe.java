package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;
import com.google.android.apps.messaging.ui.search.resultsview.ResultsFilterView;
import com.google.android.apps.messaging.ui.search.resultsview.ZeroStateSearchMultipleResultsView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dahe extends dahf {
    public final TextView A;
    public RecyclerView B;
    public daev C;
    public final TextView D;
    public final TextView E;
    public RecyclerView F;
    public daeh G;
    public final TextView H;
    public final TextView I;
    public RecyclerView J;
    public dadk K;
    public final TextView L;
    public final TextView M;
    public daey N;
    private final fcsu P;
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final ZeroStateSearchMultipleResultsView h;
    public final fcsu i;
    public dacp j;
    public final ResultsFilterView k;
    public final RecyclerView l;
    public final dagd m;
    public final TextView n;
    public final TextView o;
    public final RecyclerView p;
    public final dagi q;
    public final TextView r;
    public final TextView s;
    public RecyclerView t;
    public dafd u;
    public final TextView v;
    public final TextView w;
    public RecyclerView x;
    public dagz y;
    public final TextView z;

    public dahe(ZeroStateSearchMultipleResultsView zeroStateSearchMultipleResultsView, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11) {
        this.h = zeroStateSearchMultipleResultsView;
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fcsuVar4;
        this.e = fcsuVar7;
        this.f = fcsuVar8;
        this.g = fcsuVar9;
        this.P = fcsuVar10;
        this.i = fcsuVar11;
        this.k = (ResultsFilterView) zeroStateSearchMultipleResultsView.findViewById(R.id.zero_state_search_results_filter);
        this.n = (TextView) zeroStateSearchMultipleResultsView.findViewById(R.id.zero_state_search_chat_header);
        TextView textView = (TextView) zeroStateSearchMultipleResultsView.findViewById(R.id.zero_state_search_chat_see_all);
        this.o = textView;
        c(textView, 1);
        RecyclerView recyclerView = (RecyclerView) zeroStateSearchMultipleResultsView.findViewById(R.id.zero_state_search_chat_results);
        this.l = recyclerView;
        recyclerView.setNestedScrollingEnabled(false);
        zeroStateSearchMultipleResultsView.getContext();
        recyclerView.ao(new LinearLayoutManager());
        dagd dagdVarA = ((dage) fcsuVar6.b()).a(zeroStateSearchMultipleResultsView.getContext());
        this.m = dagdVarA;
        recyclerView.al(new cvja(dagdVarA, 3));
        this.r = (TextView) zeroStateSearchMultipleResultsView.findViewById(R.id.zero_state_search_starred_text_header);
        TextView textView2 = (TextView) zeroStateSearchMultipleResultsView.findViewById(R.id.zero_state_search_starred_text_see_all);
        this.s = textView2;
        c(textView2, 7);
        RecyclerView recyclerView2 = (RecyclerView) zeroStateSearchMultipleResultsView.findViewById(R.id.zero_state_search_starred_text_results);
        this.p = recyclerView2;
        recyclerView2.setNestedScrollingEnabled(false);
        dagi dagiVarA = ((dagj) fcsuVar5.b()).a(zeroStateSearchMultipleResultsView.getContext());
        this.q = dagiVarA;
        zeroStateSearchMultipleResultsView.getContext();
        recyclerView2.ao(new LinearLayoutManager());
        recyclerView2.al(new cvja(dagiVarA, 3));
        this.v = (TextView) zeroStateSearchMultipleResultsView.findViewById(R.id.zero_state_search_photo_header);
        TextView textView3 = (TextView) zeroStateSearchMultipleResultsView.findViewById(R.id.zero_state_search_photo_see_all);
        this.w = textView3;
        c(textView3, 2);
        this.z = (TextView) zeroStateSearchMultipleResultsView.findViewById(R.id.zero_state_search_video_header);
        TextView textView4 = (TextView) zeroStateSearchMultipleResultsView.findViewById(R.id.zero_state_search_video_see_all);
        this.A = textView4;
        c(textView4, 3);
        this.D = (TextView) zeroStateSearchMultipleResultsView.findViewById(R.id.zero_state_search_locations_header);
        TextView textView5 = (TextView) zeroStateSearchMultipleResultsView.findViewById(R.id.zero_state_search_locations_see_all);
        this.E = textView5;
        c(textView5, 5);
        this.H = (TextView) zeroStateSearchMultipleResultsView.findViewById(R.id.zero_state_search_links_header);
        TextView textView6 = (TextView) zeroStateSearchMultipleResultsView.findViewById(R.id.zero_state_search_links_see_all);
        this.I = textView6;
        c(textView6, 4);
        this.L = (TextView) zeroStateSearchMultipleResultsView.findViewById(R.id.zero_state_search_contact_header);
        TextView textView7 = (TextView) zeroStateSearchMultipleResultsView.findViewById(R.id.zero_state_search_contact_see_all);
        this.M = textView7;
        c(textView7, 6);
    }

    private final void c(View view, final int i) {
        view.setOnClickListener(new View.OnClickListener() { // from class: dahd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                dahe daheVar = this.a;
                dabm dabmVar = (dabm) daheVar.b.b();
                int i2 = i;
                dabmVar.a("Bugle.Search.Result.See.All.Clicked", i2);
                ((dabl) daheVar.g.b()).e(5, i2);
                daheVar.j.h(((dach) daheVar.a.b()).b(new SearchQuery.ContentSearchFilter(i2)));
            }
        });
    }

    public final void a(RecyclerView recyclerView) {
        recyclerView.v(((dadn) this.P.b()).a(eehg.b(recyclerView, R.attr.colorSurface), r0.getDimensionPixelSize(R.dimen.containment_decoration_corner_radius_large), r0.getDimensionPixelSize(R.dimen.containment_decoration_corner_radius_small), this.h.getContext().getResources().getDimensionPixelSize(R.dimen.containment_decoration_item_offset), new dado() { // from class: dahc
            @Override // defpackage.dado
            public final boolean a(wv wvVar) {
                return (wvVar instanceof dadj) || (wvVar instanceof dagc) || (wvVar instanceof dagh);
            }
        }));
    }

    public final void b(RecyclerView recyclerView, View view, TextView textView, boolean z, int i) {
        int iA;
        boolean z2;
        if (recyclerView == null || view == null || textView == null) {
            return;
        }
        if (!z) {
            recyclerView.setVisibility(8);
            view.setVisibility(8);
            textView.setVisibility(8);
            return;
        }
        recyclerView.setVisibility(0);
        view.setVisibility(0);
        vo voVar = recyclerView.n;
        int iA2 = voVar == null ? 0 : voVar.a();
        if (voVar instanceof cvja) {
            cvja cvjaVar = (cvja) voVar;
            int i2 = cvjaVar.d;
            iA = cvjaVar.a.a();
            z2 = iA > i2;
            if (z2) {
                textView.setText(R.string.zero_state_search_see_all_v2);
            }
        } else {
            iA = iA2;
            z2 = false;
        }
        textView.setVisibility(true == z2 ? 0 : 8);
        fcsu fcsuVar = this.b;
        ((dabm) fcsuVar.b()).g(i);
        ((dabm) fcsuVar.b()).f(i, iA);
    }
}
