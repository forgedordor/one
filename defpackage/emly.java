package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emly {
    public static final /* synthetic */ emcz a(emcy emcyVar) {
        evsn evsnVarBuild = emcyVar.build();
        evsnVarBuild.getClass();
        return (emcz) evsnVarBuild;
    }

    public static final void b(boolean z, emcy emcyVar) {
        emcyVar.copyOnWrite();
        emcz emczVar = (emcz) emcyVar.instance;
        emcz emczVar2 = emcz.a;
        emczVar.b |= 32;
        emczVar.h = z;
    }

    public static final void c(double d, emcy emcyVar) {
        emcyVar.copyOnWrite();
        emcz emczVar = (emcz) emcyVar.instance;
        emcz emczVar2 = emcz.a;
        emczVar.b |= 8;
        emczVar.f = d;
    }

    public static final void d(long j, emcy emcyVar) {
        emcyVar.copyOnWrite();
        emcz emczVar = (emcz) emcyVar.instance;
        emcz emczVar2 = emcz.a;
        emczVar.b |= 4;
        emczVar.e = j;
    }

    public static final void e(emec emecVar, emcy emcyVar) {
        emecVar.getClass();
        emcyVar.copyOnWrite();
        emcz emczVar = (emcz) emcyVar.instance;
        emcz emczVar2 = emcz.a;
        emczVar.g = emecVar.s;
        emczVar.b |= 16;
    }

    public static final void f(int i, emcy emcyVar) {
        emcyVar.copyOnWrite();
        emcz emczVar = (emcz) emcyVar.instance;
        emcz emczVar2 = emcz.a;
        emczVar.b |= 2;
        emczVar.d = i;
    }

    public static final void g(int i, emcy emcyVar) {
        emcyVar.copyOnWrite();
        emcz emczVar = (emcz) emcyVar.instance;
        emcz emczVar2 = emcz.a;
        emczVar.c = i - 1;
        emczVar.b |= 1;
    }
}
