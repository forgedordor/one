package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emnd {
    public static final /* synthetic */ emnj a(emni emniVar) {
        evsn evsnVarBuild = emniVar.build();
        evsnVarBuild.getClass();
        return (emnj) evsnVarBuild;
    }

    public static final void b(azva azvaVar, emni emniVar) {
        emniVar.copyOnWrite();
        emnj emnjVar = (emnj) emniVar.instance;
        emnj emnjVar2 = emnj.a;
        emnjVar.j = azvaVar.e;
        emnjVar.b |= 64;
    }

    public static final void c(evqs evqsVar, emni emniVar) {
        emniVar.copyOnWrite();
        emnj emnjVar = (emnj) emniVar.instance;
        emnj emnjVar2 = emnj.a;
        emnjVar.b |= 2;
        emnjVar.f = evqsVar;
    }

    public static final void d(emni emniVar) {
        emniVar.copyOnWrite();
        emnj emnjVar = (emnj) emniVar.instance;
        emnj emnjVar2 = emnj.a;
        emnjVar.e = 1;
        emnjVar.b = 1 | emnjVar.b;
    }
}
