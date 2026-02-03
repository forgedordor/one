package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enuu {
    public static final /* synthetic */ encn a(enbz enbzVar) {
        evsn evsnVarBuild = enbzVar.build();
        evsnVarBuild.getClass();
        return (encn) evsnVarBuild;
    }

    public static final void b(long j, enbz enbzVar) {
        enbzVar.copyOnWrite();
        encn encnVar = (encn) enbzVar.instance;
        evsy evsyVar = encn.a;
        encnVar.c |= 1;
        encnVar.d = j;
    }

    public static final void c(int i, enbz enbzVar) {
        enbzVar.copyOnWrite();
        encn encnVar = (encn) enbzVar.instance;
        evsy evsyVar = encn.a;
        encnVar.e = i - 1;
        encnVar.c |= 2;
    }

    public static final void d(int i, enbz enbzVar) {
        enbzVar.copyOnWrite();
        encn encnVar = (encn) enbzVar.instance;
        evsy evsyVar = encn.a;
        encnVar.g = i - 1;
        encnVar.c |= 8;
    }

    public static final void e(int i, enbz enbzVar) {
        enbzVar.copyOnWrite();
        encn encnVar = (encn) enbzVar.instance;
        evsy evsyVar = encn.a;
        encnVar.f = i - 1;
        encnVar.c |= 4;
    }

    public static final void f(int i, enbz enbzVar) {
        enbzVar.copyOnWrite();
        encn encnVar = (encn) enbzVar.instance;
        evsy evsyVar = encn.a;
        encnVar.h = i - 1;
        encnVar.c |= 16;
    }

    public static final void g(enbz enbzVar) {
        enbzVar.copyOnWrite();
        encn encnVar = (encn) enbzVar.instance;
        evsy evsyVar = encn.a;
        encnVar.l = 1;
        encnVar.c |= 64;
    }
}
