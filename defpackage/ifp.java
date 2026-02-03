package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ifp extends icr implements ift {
    public fdap a;
    private igx b;

    public ifp(fdap fdapVar) {
        this.a = fdapVar;
    }

    @Override // defpackage.ift
    public final void n(igx igxVar) {
        if (fdbq.f(this.b, igxVar)) {
            return;
        }
        this.b = igxVar;
        this.a.invoke(igxVar);
    }
}
