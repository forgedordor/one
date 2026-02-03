package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgun {
    public static final /* synthetic */ cgtd a(cgta cgtaVar) {
        evsn evsnVarBuild = cgtaVar.build();
        evsnVarBuild.getClass();
        return (cgtd) evsnVarBuild;
    }

    public static final void b(cgta cgtaVar) {
        cgtaVar.copyOnWrite();
        cgtd cgtdVar = (cgtd) cgtaVar.instance;
        cgtd cgtdVar2 = cgtd.a;
        cgtdVar.b &= -2;
        cgtdVar.d = 0;
    }

    public static final void c(cgta cgtaVar) {
        cgtaVar.copyOnWrite();
        cgtd cgtdVar = (cgtd) cgtaVar.instance;
        cgtd cgtdVar2 = cgtd.a;
        cgtdVar.b &= -9;
        cgtdVar.g = cgtd.a.g;
    }

    public static final /* synthetic */ void d(cgta cgtaVar) {
        cgtaVar.copyOnWrite();
        cgtd cgtdVar = (cgtd) cgtaVar.instance;
        cgtd cgtdVar2 = cgtd.a;
        evub evubVar = cgtdVar.h;
        if (!evubVar.b) {
            cgtdVar.h = evubVar.a();
        }
        cgtdVar.h.clear();
    }

    public static final /* synthetic */ void e(cgta cgtaVar) {
        cgtaVar.copyOnWrite();
        cgtd cgtdVar = (cgtd) cgtaVar.instance;
        cgtd cgtdVar2 = cgtd.a;
        cgtdVar.a().clear();
    }
}
