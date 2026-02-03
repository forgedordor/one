package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eprx {
    public static final /* synthetic */ eprw a(eprv eprvVar) {
        evsn evsnVarBuild = eprvVar.build();
        evsnVarBuild.getClass();
        return (eprw) evsnVarBuild;
    }

    public static final void b(evqs evqsVar, eprv eprvVar) {
        eprvVar.copyOnWrite();
        eprw eprwVar = (eprw) eprvVar.instance;
        eprw eprwVar2 = eprw.a;
        eprwVar.b |= 4;
        eprwVar.g = evqsVar;
    }

    public static final void c(int i, eprv eprvVar) {
        eprvVar.copyOnWrite();
        eprw eprwVar = (eprw) eprvVar.instance;
        eprw eprwVar2 = eprw.a;
        eprwVar.f = eprs.a(i);
        eprwVar.b |= 2;
    }

    public static final void d(eprv eprvVar) {
        eprvVar.copyOnWrite();
        eprw eprwVar = (eprw) eprvVar.instance;
        eprw eprwVar2 = eprw.a;
        eprwVar.e = 1;
        eprwVar.b = 1 | eprwVar.b;
    }
}
