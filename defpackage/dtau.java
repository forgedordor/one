package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public final class dtau {
    private final dswb a;
    private final dsvh b;

    public dtau(dswb dswbVar, dsvh dsvhVar) {
        this.a = dswbVar;
        this.b = dsvhVar;
    }

    public final dtar a(dn dnVar) {
        ejwl.m(((lvn) dnVar.P()).c == lvb.b, "Must be called in onCreate");
        return new dtar(this.a, this.b, dnVar);
    }
}
