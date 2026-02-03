package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jct extends fdbr implements fdap {
    final /* synthetic */ jcu a;
    final /* synthetic */ jbp b;
    final /* synthetic */ fdap c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jct(jcu jcuVar, jbp jbpVar, fdap fdapVar) {
        super(1);
        this.a = jcuVar;
        this.b = jbpVar;
        this.c = fdapVar;
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) throws Throwable {
        jbp jbpVar;
        jcu jcuVar = this.a;
        jbp jbpVar2 = this.b;
        imz imzVar = (imz) obj;
        jbp jbpVar3 = jcuVar.a;
        jcuVar.a = jbpVar2;
        try {
            kio kioVarC = imzVar.t().c();
            kji kjiVarD = imzVar.t().d();
            ijb ijbVarB = imzVar.t().b();
            long jA = imzVar.t().a();
            ini iniVar = imzVar.t().a;
            fdap fdapVar = this.c;
            kio kioVarC2 = jcuVar.t().c();
            kji kjiVarD2 = jcuVar.t().d();
            ijb ijbVarB2 = jcuVar.t().b();
            long jA2 = jcuVar.t().a();
            ini iniVar2 = jcuVar.t().a;
            try {
                imt imtVarT = jcuVar.t();
                imtVarT.f(kioVarC);
                imtVarT.g(kjiVarD);
                imtVarT.e(ijbVarB);
                imtVarT.h(jA);
                imtVarT.a = iniVar;
                ijbVarB.l();
                try {
                    fdapVar.invoke(jcuVar);
                    ijbVarB.j();
                    imt imtVarT2 = jcuVar.t();
                    imtVarT2.f(kioVarC2);
                    imtVarT2.g(kjiVarD2);
                    imtVarT2.e(ijbVarB2);
                    imtVarT2.h(jA2);
                    imtVarT2.a = iniVar2;
                    this.a.a = jbpVar3;
                    return fctx.a;
                } catch (Throwable th) {
                    jbpVar = jbpVar3;
                    try {
                        ijbVarB.j();
                        imt imtVarT3 = jcuVar.t();
                        imtVarT3.f(kioVarC2);
                        imtVarT3.g(kjiVarD2);
                        imtVarT3.e(ijbVarB2);
                        imtVarT3.h(jA2);
                        imtVarT3.a = iniVar2;
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        this.a.a = jbpVar;
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                jbpVar = jbpVar3;
            }
        } catch (Throwable th4) {
            th = th4;
            jbpVar = jbpVar3;
        }
    }
}
