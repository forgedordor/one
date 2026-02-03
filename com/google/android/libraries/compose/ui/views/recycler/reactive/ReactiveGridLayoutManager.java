package com.google.android.libraries.compose.ui.views.recycler.reactive;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.compose.ui.views.recycler.reactive.ReactiveGridLayoutManager;
import defpackage.dqai;
import defpackage.dqan;
import defpackage.dqao;
import defpackage.dqas;
import defpackage.dqat;
import defpackage.dqau;
import defpackage.dqay;
import defpackage.fctc;
import defpackage.fctd;
import defpackage.fdae;
import defpackage.fdap;
import defpackage.fdbv;
import defpackage.fdcj;
import defpackage.fdcz;
import defpackage.fdeh;
import defpackage.wj;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ReactiveGridLayoutManager extends GridLayoutManager {
    static final /* synthetic */ fdeh[] J;
    public static final /* synthetic */ int M = 0;
    public final dqay K;
    public RecyclerView L;
    private final dqao N;
    private final fctc O;
    private final fdcz P;

    static {
        fdbv fdbvVar = new fdbv(ReactiveGridLayoutManager.class, "observer", "getObserver()Lcom/google/android/libraries/compose/ui/views/recycler/reactive/LayoutManagerSizeObserver;", 0);
        int i = fdcj.a;
        J = new fdeh[]{fdbvVar};
    }

    public ReactiveGridLayoutManager(dqao dqaoVar, final int i, dqay dqayVar) {
        super(1, 1);
        this.N = dqaoVar;
        this.K = dqayVar;
        this.O = fctd.a(new fdae() { // from class: dqap
            @Override // defpackage.fdae
            public final Object invoke() {
                int i2 = ReactiveGridLayoutManager.M;
                return new dqai(i);
            }
        });
        this.P = new dqau();
        dqat dqatVar = (dqat) dqayVar.b;
        if (dqatVar != null) {
            this.g = new dqas(dqatVar, this);
        }
    }

    private final dqai bD() {
        return (dqai) this.O.a();
    }

    private final void bE(dqan dqanVar) {
        this.P.d(J[0], dqanVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.wb
    public final void X(RecyclerView recyclerView, wj wjVar) {
        wjVar.getClass();
        bD().b(recyclerView);
        this.L = null;
        bE((dqan) null);
    }

    @Override // defpackage.wb
    public final void aS(RecyclerView recyclerView) {
        this.L = recyclerView;
        bD().a(recyclerView);
        bE(this.N.a(recyclerView, this, new fdap() { // from class: dqaq
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return Integer.valueOf(this.a.k);
            }
        }, new fdap() { // from class: dqar
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                Integer num = (Integer) obj;
                num.getClass();
                int iIntValue = num.intValue();
                ReactiveGridLayoutManager reactiveGridLayoutManager = this.a;
                reactiveGridLayoutManager.r(reactiveGridLayoutManager.K.a.a(iIntValue));
                return fctx.a;
            }
        }));
    }
}
