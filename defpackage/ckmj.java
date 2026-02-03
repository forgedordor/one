package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckmj {
    public static final /* synthetic */ ckmi a(ckmh ckmhVar) {
        evsn evsnVarBuild = ckmhVar.build();
        evsnVarBuild.getClass();
        return (ckmi) evsnVarBuild;
    }

    public static final void b(ckly cklyVar, ckmh ckmhVar) {
        ckmhVar.copyOnWrite();
        ckmi ckmiVar = (ckmi) ckmhVar.instance;
        ckmi ckmiVar2 = ckmi.a;
        ckmiVar.c = cklyVar;
        ckmiVar.b |= 1;
    }

    public static final void c(String str, ckmh ckmhVar) {
        ckmhVar.copyOnWrite();
        ckmi ckmiVar = (ckmi) ckmhVar.instance;
        ckmi ckmiVar2 = ckmi.a;
        ckmiVar.b |= 8;
        ckmiVar.f = str;
    }

    public static final void d(fhaz fhazVar, ckmh ckmhVar) {
        ckmhVar.copyOnWrite();
        ckmi ckmiVar = (ckmi) ckmhVar.instance;
        ckmi ckmiVar2 = ckmi.a;
        ckmiVar.e = fhazVar;
        ckmiVar.b |= 4;
    }
}
