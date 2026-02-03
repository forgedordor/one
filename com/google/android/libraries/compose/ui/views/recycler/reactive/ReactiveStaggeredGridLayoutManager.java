package com.google.android.libraries.compose.ui.views.recycler.reactive;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import com.google.android.libraries.compose.ui.views.recycler.reactive.ReactiveStaggeredGridLayoutManager;
import defpackage.dobt;
import defpackage.dqai;
import defpackage.dqan;
import defpackage.dqao;
import defpackage.dqay;
import defpackage.dqbc;
import defpackage.dqbd;
import defpackage.fctc;
import defpackage.fctd;
import defpackage.fdae;
import defpackage.fdap;
import defpackage.fdbv;
import defpackage.fdcj;
import defpackage.fdcz;
import defpackage.fdeh;
import defpackage.wd;
import defpackage.wj;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ReactiveStaggeredGridLayoutManager extends StaggeredGridLayoutManager {
    static final /* synthetic */ fdeh[] k;
    public static final /* synthetic */ int m = 0;
    public final dqay l;
    private final dqao n;
    private final fctc o;
    private final wd p;
    private final fdcz q;

    static {
        fdbv fdbvVar = new fdbv(ReactiveStaggeredGridLayoutManager.class, "observer", "getObserver()Lcom/google/android/libraries/compose/ui/views/recycler/reactive/LayoutManagerSizeObserver;", 0);
        int i = fdcj.a;
        k = new fdeh[]{fdbvVar};
    }

    public ReactiveStaggeredGridLayoutManager(dqao dqaoVar, final int i, dqay dqayVar) {
        super(1);
        this.n = dqaoVar;
        this.l = dqayVar;
        this.o = fctd.a(new fdae() { // from class: dqaz
            @Override // defpackage.fdae
            public final Object invoke() {
                int i2 = ReactiveStaggeredGridLayoutManager.m;
                return new dqai(i);
            }
        });
        this.q = new dqbd();
        dobt dobtVar = (dobt) dqayVar.b;
        this.p = dobtVar != null ? new dqbc(dobtVar) : null;
        N();
    }

    private final dqai O() {
        return (dqai) this.o.a();
    }

    private final void R(dqan dqanVar) {
        this.q.d(k[0], dqanVar);
    }

    @Override // android.support.v7.widget.StaggeredGridLayoutManager, defpackage.wb
    public final void X(RecyclerView recyclerView, wj wjVar) {
        wjVar.getClass();
        O().b(recyclerView);
        wd wdVar = this.p;
        if (wdVar != null) {
            recyclerView.af(wdVar);
        }
        R((dqan) null);
        super.X(recyclerView, wjVar);
    }

    @Override // defpackage.wb
    public final void aS(RecyclerView recyclerView) {
        O().a(recyclerView);
        wd wdVar = this.p;
        if (wdVar != null) {
            recyclerView.w(wdVar);
        }
        R(this.n.a(recyclerView, this, new fdap() { // from class: dqba
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return Integer.valueOf(this.a.d);
            }
        }, new fdap() { // from class: dqbb
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                Integer num = (Integer) obj;
                num.getClass();
                int iIntValue = num.intValue();
                ReactiveStaggeredGridLayoutManager reactiveStaggeredGridLayoutManager = this.a;
                reactiveStaggeredGridLayoutManager.J(reactiveStaggeredGridLayoutManager.l.a.a(iIntValue));
                return fctx.a;
            }
        }));
    }
}
