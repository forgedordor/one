package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elgp {
    public static final /* synthetic */ eliz a(eliw eliwVar) {
        evsn evsnVarBuild = eliwVar.build();
        evsnVarBuild.getClass();
        return (eliz) evsnVarBuild;
    }

    public static final void b(int i, eliw eliwVar) {
        eliwVar.copyOnWrite();
        eliz elizVar = (eliz) eliwVar.instance;
        eliz elizVar2 = eliz.a;
        elizVar.c = i - 1;
        elizVar.b |= 1;
    }

    public static final void c(int i, eliw eliwVar) {
        eliwVar.copyOnWrite();
        eliz elizVar = (eliz) eliwVar.instance;
        eliz elizVar2 = eliz.a;
        elizVar.d = i - 1;
        elizVar.b |= 2;
    }
}
