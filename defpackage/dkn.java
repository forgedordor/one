package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkn extends icr implements jbp, jew {
    public long a;
    public iiy b;
    public float c;
    public ikp d;
    public ijz e;
    private long f = 9205357640488583168L;
    private kji g;
    private ijz h;
    private ikp i;

    public dkn(long j, iiy iiyVar, float f, ikp ikpVar) {
        this.a = j;
        this.b = iiyVar;
        this.c = f;
        this.d = ikpVar;
    }

    @Override // defpackage.jew
    public final void n() {
        this.f = 9205357640488583168L;
        this.g = null;
        this.h = null;
        this.i = null;
        jbq.a(this);
    }

    @Override // defpackage.jbp
    public final void r(final imw imwVar) {
        ijz ijzVar;
        if (this.d == ikj.a) {
            if (!fcts.a(this.a, ije.h)) {
                imwVar.r(this.a, 0L, (126 & 4) != 0 ? imy.c(imwVar.b(), 0L) : 0L, (126 & 8) != 0 ? 1.0f : 0.0f, (126 & 16) != 0 ? inc.a : null, (126 & 32) != 0 ? null : null, (126 & 64) != 0 ? 3 : 0);
            }
            iiy iiyVar = this.b;
            if (iiyVar != null) {
                imy.i(imwVar, iiyVar, 0L, 0L, this.c, null, 0, 118);
            }
        } else {
            if (ihz.f(imwVar.b(), this.f) && imwVar.q() == this.g && fdbq.f(this.i, this.d)) {
                ijzVar = this.h;
                ijzVar.getClass();
            } else {
                jex.a(this, new fdae() { // from class: dkm
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        imw imwVar2 = imwVar;
                        dkn dknVar = this.a;
                        dknVar.e = dknVar.d.a(imwVar2.b(), imwVar2.q(), imwVar2);
                        return fctx.a;
                    }
                });
                ijzVar = this.e;
                this.e = null;
            }
            this.h = ijzVar;
            this.f = imwVar.b();
            this.g = imwVar.q();
            this.i = this.d;
            ijzVar.getClass();
            if (!fcts.a(this.a, ije.h)) {
                ika.c(imwVar, ijzVar, this.a);
            }
            iiy iiyVar2 = this.b;
            if (iiyVar2 != null) {
                ika.b(imwVar, ijzVar, iiyVar2, this.c);
            }
        }
        imwVar.p();
    }

    @Override // defpackage.jbp
    public final /* synthetic */ void t() {
    }
}
