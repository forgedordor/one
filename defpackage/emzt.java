package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emzt {
    public static final /* synthetic */ enbu a(emzy emzyVar) {
        evsn evsnVarBuild = emzyVar.build();
        evsnVarBuild.getClass();
        return (enbu) evsnVarBuild;
    }

    public static final void b(int i, emzy emzyVar) {
        emzyVar.copyOnWrite();
        enbu enbuVar = (enbu) emzyVar.instance;
        enbu enbuVar2 = enbu.a;
        enbuVar.b |= 8;
        enbuVar.h = i;
    }

    public static final void c(int i, emzy emzyVar) {
        emzyVar.copyOnWrite();
        enbu enbuVar = (enbu) emzyVar.instance;
        enbu enbuVar2 = enbu.a;
        enbuVar.b |= 4;
        enbuVar.g = i;
    }

    public static final void d(String str, emzy emzyVar) {
        emzyVar.copyOnWrite();
        enbu enbuVar = (enbu) emzyVar.instance;
        enbu enbuVar2 = enbu.a;
        enbuVar.b |= 2;
        enbuVar.f = str;
    }

    public static final void e(enaq enaqVar, emzy emzyVar) {
        emzyVar.copyOnWrite();
        enbu enbuVar = (enbu) emzyVar.instance;
        enbu enbuVar2 = enbu.a;
        enbuVar.d = enaqVar;
        enbuVar.c = 8;
    }

    public static final void f(enba enbaVar, emzy emzyVar) {
        emzyVar.copyOnWrite();
        enbu enbuVar = (enbu) emzyVar.instance;
        enbu enbuVar2 = enbu.a;
        enbuVar.i = enbaVar.p;
        enbuVar.b |= 16;
    }

    public static final void g(String str, emzy emzyVar) {
        emzyVar.copyOnWrite();
        enbu enbuVar = (enbu) emzyVar.instance;
        enbu enbuVar2 = enbu.a;
        enbuVar.b |= 1;
        enbuVar.e = str;
    }
}
