package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emka {
    public static final /* synthetic */ elrx a(elrw elrwVar) {
        evsn evsnVarBuild = elrwVar.build();
        evsnVarBuild.getClass();
        return (elrx) evsnVarBuild;
    }

    public static final void b(elvs elvsVar, elrw elrwVar) {
        elrwVar.copyOnWrite();
        elrx elrxVar = (elrx) elrwVar.instance;
        elrx elrxVar2 = elrx.a;
        elrxVar.h = elvsVar;
        elrxVar.b |= 64;
    }

    public static final void c(String str, elrw elrwVar) {
        elrwVar.copyOnWrite();
        elrx elrxVar = (elrx) elrwVar.instance;
        elrx elrxVar2 = elrx.a;
        elrxVar.b |= 128;
        elrxVar.i = str;
    }

    public static final void d(emff emffVar, elrw elrwVar) {
        elrwVar.copyOnWrite();
        elrx elrxVar = (elrx) elrwVar.instance;
        elrx elrxVar2 = elrx.a;
        elrxVar.j = emffVar;
        elrxVar.b |= 256;
    }

    public static final void e(elrw elrwVar) {
        elrwVar.copyOnWrite();
        elrx elrxVar = (elrx) elrwVar.instance;
        elrx elrxVar2 = elrx.a;
        elrxVar.c = 11;
        elrxVar.b |= 1;
    }
}
