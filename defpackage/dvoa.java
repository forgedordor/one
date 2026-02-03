package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class dvoa implements Runnable {
    public final /* synthetic */ dvop a;

    public /* synthetic */ dvoa(dvop dvopVar) {
        this.a = dvopVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jA = fbfa.a.get().a();
        final long jA2 = fbfa.a();
        final dvop dvopVar = this.a;
        eork.l(new Runnable() { // from class: dvob
            @Override // java.lang.Runnable
            public final void run() {
                dvopVar.u(jA2);
            }
        }, dvopVar.c);
        dvopVar.m.postDelayed(new dvoa(dvopVar), jA);
    }
}
