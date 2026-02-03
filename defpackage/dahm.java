package defpackage;

import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;
import com.google.android.apps.messaging.ui.search.resultsview.ZeroStateSearchResultsView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dahm extends dahn {
    public final dagd a;
    public final LinearLayoutManager b;
    public final dagi c;
    public final LinearLayoutManager d;
    public dafd e;
    public dagz f;
    public daez g;
    public daev h;
    public final LinearLayoutManager i;
    public daeh j;
    public final LinearLayoutManager k;
    public dadk l;
    public final LinearLayoutManager m;
    public dahl n;
    public daey o;
    public final ZeroStateSearchResultsView p;
    public final fcsu q;
    public final fcsu r;
    public final fcsu s;
    public final fcsu t;
    public final fcsu u;
    public final fcsu v;
    public final fcsu w;
    public final fcsu x;
    public final fcsu y;

    public dahm(ZeroStateSearchResultsView zeroStateSearchResultsView, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11) {
        this.p = zeroStateSearchResultsView;
        this.q = fcsuVar;
        this.r = fcsuVar2;
        this.s = fcsuVar3;
        this.t = fcsuVar6;
        this.v = fcsuVar8;
        this.u = fcsuVar7;
        this.w = fcsuVar9;
        this.x = fcsuVar10;
        this.y = fcsuVar11;
        zeroStateSearchResultsView.aK();
        zeroStateSearchResultsView.getContext();
        this.b = new LinearLayoutManager();
        this.a = ((dage) fcsuVar4.b()).a(zeroStateSearchResultsView.getContext());
        this.c = ((dagj) fcsuVar5.b()).a(zeroStateSearchResultsView.getContext());
        zeroStateSearchResultsView.getContext();
        this.d = new LinearLayoutManager();
        zeroStateSearchResultsView.getContext();
        this.i = new LinearLayoutManager();
        zeroStateSearchResultsView.getContext();
        this.k = new LinearLayoutManager();
        zeroStateSearchResultsView.getContext();
        this.m = new LinearLayoutManager();
    }

    public final void a(int i) {
        Parcelable parcelable;
        wb wbVar;
        dahl dahlVar = this.n;
        if (dahlVar == null || dahlVar.a != i || (parcelable = dahlVar.b) == null || (wbVar = this.p.o) == null) {
            this.n = null;
        } else {
            wbVar.Z(parcelable);
            this.n = null;
        }
    }

    public final boolean b() {
        int i = 0;
        while (true) {
            ZeroStateSearchResultsView zeroStateSearchResultsView = this.p;
            if (i >= zeroStateSearchResultsView.e()) {
                return false;
            }
            if (zeroStateSearchResultsView.h(i) instanceof daez) {
                return true;
            }
            i++;
        }
    }
}
