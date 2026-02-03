package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fxg extends icr implements jbd, jbp, jcb {
    public final boolean a;
    public final fdae b;
    public fxl c;
    public float d;
    public boolean f;
    public final ebk h;
    private final float i;
    private final ijh j;
    public long e = 0;
    public final cuu g = new cuu((byte[]) null);

    public fxg(ebk ebkVar, boolean z, float f, ijh ijhVar, fdae fdaeVar) {
        this.h = ebkVar;
        this.a = z;
        this.i = f;
        this.j = ijhVar;
        this.b = fdaeVar;
    }

    public abstract void a(ebm ebmVar, long j, float f);

    @Override // defpackage.icr
    public final boolean dN() {
        return false;
    }

    @Override // defpackage.icr
    public final void dU() {
        fdil.d(E(), null, null, new fxf(this, null), 3);
    }

    public abstract void e(imz imzVar);

    public abstract void g();

    @Override // defpackage.jcb
    public final void i(long j) {
        float fEn;
        this.f = true;
        kio kioVarG = jbg.g(this);
        this.e = kjh.d(j);
        float f = this.i;
        if (Float.isNaN(f)) {
            boolean z = this.a;
            long j2 = this.e;
            fEn = ihs.a(iht.a(ihz.c(j2), ihz.a(j2))) / 2.0f;
            if (z) {
                fEn += kioVarG.en(10.0f);
            }
        } else {
            fEn = kioVarG.en(f);
        }
        this.d = fEn;
        cuu cuuVar = this.g;
        Object[] objArr = cuuVar.b;
        int i = cuuVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            k((ebo) objArr[i2]);
        }
        cuuVar.c();
    }

    public final long j() {
        return this.j.a();
    }

    public final void k(ebo eboVar) {
        if (eboVar instanceof ebm) {
            a((ebm) eboVar, this.e, this.d);
            return;
        }
        if (eboVar instanceof ebn) {
            ebm ebmVar = ((ebn) eboVar).a;
            g();
        } else if (eboVar instanceof ebl) {
            ebm ebmVar2 = ((ebl) eboVar).a;
            g();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
    @Override // defpackage.jbp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(defpackage.imw r15) {
        /*
            r14 = this;
            r15.p()
            fxl r0 = r14.c
            if (r0 == 0) goto L7a
            float r4 = r14.d
            long r1 = r14.j()
            ddp r3 = r0.c
            java.lang.Object r3 = r3.d()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 <= 0) goto L7a
            long r2 = defpackage.ije.h(r1, r3)
            boolean r0 = r0.a
            if (r0 == 0) goto L6f
            long r0 = r15.b()
            float r8 = defpackage.ihz.c(r0)
            long r0 = r15.b()
            float r9 = defpackage.ihz.a(r0)
            imt r11 = r15.t()
            long r12 = r11.a()
            ijb r0 = r11.b()
            r0.l()
            imv r5 = r11.c     // Catch: java.lang.Throwable -> L62
            r7 = 0
            r10 = 1
            r6 = 0
            r5.b(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L62
            r8 = 0
            r9 = 124(0x7c, float:1.74E-43)
            r5 = 0
            r7 = 0
            r1 = r15
            defpackage.imy.e(r1, r2, r4, r5, r7, r8, r9)     // Catch: java.lang.Throwable -> L62
            ijb r15 = r11.b()
            r15.j()
            r11.h(r12)
            goto L7b
        L62:
            r0 = move-exception
            r15 = r0
            ijb r0 = r11.b()
            r0.j()
            r11.h(r12)
            throw r15
        L6f:
            r1 = r15
            r8 = 0
            r9 = 124(0x7c, float:1.74E-43)
            r5 = 0
            r7 = 0
            defpackage.imy.e(r1, r2, r4, r5, r7, r8, r9)
            goto L7b
        L7a:
            r1 = r15
        L7b:
            r14.e(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fxg.r(imw):void");
    }

    @Override // defpackage.jbp
    public final /* synthetic */ void t() {
    }

    @Override // defpackage.jcb
    public final /* synthetic */ void ea(ivy ivyVar) {
    }
}
