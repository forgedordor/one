package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyh {
    final /* synthetic */ dyk a;

    public dyh(dyk dykVar) {
        this.a = dykVar;
    }

    public final long a(long j, int i) {
        dyk dykVar = this.a;
        dykVar.i = i;
        dop dopVar = dykVar.b;
        return (dopVar == null || !dykVar.j()) ? dykVar.d(dykVar.j, j, i) : dopVar.a(j, dykVar.i, dykVar.l);
    }

    public final long b(long j) {
        dyk dykVar = this.a;
        return dykVar.d(dykVar.j, j, 1);
    }
}
