package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aucf {
    public static final /* synthetic */ auce a(aucd aucdVar) {
        evsn evsnVarBuild = aucdVar.build();
        evsnVarBuild.getClass();
        return (auce) evsnVarBuild;
    }

    public static final void b(String str, aucd aucdVar) {
        str.getClass();
        aucdVar.copyOnWrite();
        auce auceVar = (auce) aucdVar.instance;
        auce auceVar2 = auce.a;
        auceVar.b |= 1;
        auceVar.c = str;
    }

    public static final void c(evqs evqsVar, aucd aucdVar) {
        aucdVar.copyOnWrite();
        auce auceVar = (auce) aucdVar.instance;
        auce auceVar2 = auce.a;
        auceVar.b |= 16;
        auceVar.h = evqsVar;
    }

    public static final void d(aubq aubqVar, aucd aucdVar) {
        aubqVar.getClass();
        aucdVar.copyOnWrite();
        auce auceVar = (auce) aucdVar.instance;
        auce auceVar2 = auce.a;
        auceVar.f = aubqVar;
        auceVar.b |= 8;
    }

    public static final /* synthetic */ void e(Iterable iterable, aucd aucdVar) {
        iterable.getClass();
        aucdVar.a(iterable);
    }
}
