package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epuw {
    public static final /* synthetic */ epuv a(epuu epuuVar) {
        evsn evsnVarBuild = epuuVar.build();
        evsnVarBuild.getClass();
        return (epuv) evsnVarBuild;
    }

    public static final void b(evqs evqsVar, epuu epuuVar) {
        epuuVar.copyOnWrite();
        epuv epuvVar = (epuv) epuuVar.instance;
        epuv epuvVar2 = epuv.a;
        epuvVar.b |= 16;
        epuvVar.f = evqsVar;
    }

    public static final void c(evqs evqsVar, epuu epuuVar) {
        epuuVar.copyOnWrite();
        epuv epuvVar = (epuv) epuuVar.instance;
        epuv epuvVar2 = epuv.a;
        epuvVar.b |= 2;
        epuvVar.c = evqsVar;
    }

    public static final void d(String str, epuu epuuVar) {
        epuuVar.copyOnWrite();
        epuv epuvVar = (epuv) epuuVar.instance;
        epuv epuvVar2 = epuv.a;
        epuvVar.b |= 4;
        epuvVar.d = str;
    }

    public static final void e(evqs evqsVar, epuu epuuVar) {
        epuuVar.copyOnWrite();
        epuv epuvVar = (epuv) epuuVar.instance;
        epuv epuvVar2 = epuv.a;
        epuvVar.b |= 8;
        epuvVar.e = evqsVar;
    }
}
