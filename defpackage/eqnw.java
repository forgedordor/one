package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqnw extends evsf implements evui {
    public eqnw() {
        super(eqny.a);
    }

    public final void a(eqkm eqkmVar) {
        copyOnWrite();
        eqny eqnyVar = (eqny) this.instance;
        eqny eqnyVar2 = eqny.a;
        eqkmVar.getClass();
        evsx evsxVar = eqnyVar.g;
        if (!evsxVar.c()) {
            eqnyVar.g = evsn.mutableCopy(evsxVar);
        }
        eqnyVar.g.h(eqkmVar.a());
    }
}
