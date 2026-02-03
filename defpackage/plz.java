package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class plz {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ pmx b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ plz(Runnable runnable, pmx pmxVar, Runnable runnable2) {
        this.a = runnable;
        this.b = pmxVar;
        this.c = runnable2;
    }

    public final void a() {
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
            return;
        }
        Runnable runnable2 = this.c;
        this.b.n();
        runnable2.run();
    }
}
