package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dyis {
    public abstract dyit a();

    public abstract void b(String str);

    public abstract void c(int i);

    public final dyit d() {
        dyit dyitVarA = a();
        dyik dyikVar = (dyik) dyitVarA;
        ejwl.m((dyikVar.b != -1) ^ (dyikVar.a != null), "Either icon id or icon drawable must be specified");
        return dyitVarA;
    }
}
