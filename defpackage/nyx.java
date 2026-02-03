package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nyx implements nze {
    private mau a;
    private mfy b;
    private nox c;

    public nyx(String str) {
        mat matVar = new mat();
        matVar.a("video/mp2t");
        matVar.c(str);
        this.a = new mau(matVar);
    }

    @Override // defpackage.nze
    public final void a(mfr mfrVar) {
        mee.g(this.b);
        String str = mgb.a;
        long jE = this.b.e();
        long jF = this.b.f();
        if (jE == -9223372036854775807L || jF == -9223372036854775807L) {
            return;
        }
        mau mauVar = this.a;
        if (jF != mauVar.t) {
            mat matVar = new mat(mauVar);
            matVar.r = jF;
            mau mauVar2 = new mau(matVar);
            this.a = mauVar2;
            this.c.i(mauVar2);
        }
        int iA = mfrVar.a();
        this.c.m(mfrVar, iA);
        this.c.o(jE, 1, iA, 0, null);
    }

    @Override // defpackage.nze
    public final void b(mfy mfyVar, nnu nnuVar, nzq nzqVar) {
        this.b = mfyVar;
        nzqVar.c();
        nox noxVarP = nnuVar.p(nzqVar.a(), 5);
        this.c = noxVarP;
        noxVarP.i(this.a);
    }
}
