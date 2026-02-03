package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emlz {
    public static final /* synthetic */ emdz a(emdy emdyVar) {
        evsn evsnVarBuild = emdyVar.build();
        evsnVarBuild.getClass();
        return (emdz) evsnVarBuild;
    }

    public static final void b(String str, emdy emdyVar) {
        str.getClass();
        emdyVar.copyOnWrite();
        emdz emdzVar = (emdz) emdyVar.instance;
        emdz emdzVar2 = emdz.a;
        emdzVar.b |= 1;
        emdzVar.c = str;
    }

    public static final void c(int i, emdy emdyVar) {
        emdyVar.copyOnWrite();
        emdz emdzVar = (emdz) emdyVar.instance;
        emdz emdzVar2 = emdz.a;
        emdzVar.b |= 4;
        emdzVar.e = i;
    }

    public static final void d(int i, emdy emdyVar) {
        emdyVar.copyOnWrite();
        emdz emdzVar = (emdz) emdyVar.instance;
        emdz emdzVar2 = emdz.a;
        emdzVar.b |= 8;
        emdzVar.f = i;
    }

    public static final void e(int i, emdy emdyVar) {
        emdyVar.copyOnWrite();
        emdz emdzVar = (emdz) emdyVar.instance;
        emdz emdzVar2 = emdz.a;
        emdzVar.b |= 2;
        emdzVar.d = i;
    }

    public static final /* synthetic */ void f(Iterable iterable, emdy emdyVar) {
        emdyVar.copyOnWrite();
        emdz emdzVar = (emdz) emdyVar.instance;
        emdz emdzVar2 = emdz.a;
        evtg evtgVar = emdzVar.g;
        if (!evtgVar.c()) {
            emdzVar.g = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, emdzVar.g);
    }
}
