package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byin {
    public static final /* synthetic */ byiv a(byiu byiuVar) {
        evsn evsnVarBuild = byiuVar.build();
        evsnVarBuild.getClass();
        return (byiv) evsnVarBuild;
    }

    public static final void b(int i, byiu byiuVar) {
        byiuVar.copyOnWrite();
        byiv byivVar = (byiv) byiuVar.instance;
        byiv byivVar2 = byiv.a;
        byivVar.b |= 1;
        byivVar.c = i;
    }

    public static final void c(int i, byiu byiuVar) {
        byiuVar.copyOnWrite();
        byiv byivVar = (byiv) byiuVar.instance;
        byiv byivVar2 = byiv.a;
        byivVar.b |= 8;
        byivVar.f = i;
    }

    public static final void d(boolean z, byiu byiuVar) {
        byiuVar.copyOnWrite();
        byiv byivVar = (byiv) byiuVar.instance;
        byiv byivVar2 = byiv.a;
        byivVar.b |= 16;
        byivVar.g = z;
    }

    public static final void e(String str, byiu byiuVar) {
        str.getClass();
        byiuVar.copyOnWrite();
        byiv byivVar = (byiv) byiuVar.instance;
        byiv byivVar2 = byiv.a;
        byivVar.b |= 4;
        byivVar.e = str;
    }

    public static final void f(int i, byiu byiuVar) {
        byiuVar.copyOnWrite();
        byiv byivVar = (byiv) byiuVar.instance;
        byiv byivVar2 = byiv.a;
        byivVar.b |= 2;
        byivVar.d = i;
    }
}
