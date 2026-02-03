package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqan {
    static final /* synthetic */ fdeh[] a;
    public static final ekrg b;
    public final RecyclerView c;
    public final wb d;
    public final fdap e;
    public final fdap f;
    private final fdjx g;
    private final fdcz h = new dqam();

    static {
        fdbv fdbvVar = new fdbv(dqan.class, "observerJob", "getObserverJob()Lkotlinx/coroutines/Job;", 0);
        int i = fdcj.a;
        a = new fdeh[]{fdbvVar};
        b = ekrg.c("com/google/android/libraries/compose/ui/views/recycler/reactive/LayoutManagerSizeObserver");
    }

    public dqan(fdjx fdjxVar, RecyclerView recyclerView, wb wbVar, fdap fdapVar, fdap fdapVar2) {
        this.g = fdjxVar;
        this.c = recyclerView;
        this.d = wbVar;
        this.e = fdapVar;
        this.f = fdapVar2;
    }

    public static /* synthetic */ void b(dqan dqanVar) {
        Integer numValueOf = Integer.valueOf(((Number) dqanVar.e.invoke(dqanVar.d)).intValue() == 0 ? dqanVar.c.getHeight() : dqanVar.c.getWidth());
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            dqanVar.f.invoke(Integer.valueOf(numValueOf.intValue()));
        }
        dqanVar.c(fdil.d(dqanVar.g, null, null, new dqal(dqanVar, numValueOf, null), 3));
    }

    private final void c(fdlr fdlrVar) {
        this.h.d(a[0], fdlrVar);
    }

    public final void a() {
        ((ekrd) b.e().h("com/google/android/libraries/compose/ui/views/recycler/reactive/LayoutManagerSizeObserver", "detach", 82, "LayoutManagerSizeObserver.kt")).q("Stopped observing size of RecyclerView");
        c(null);
    }
}
