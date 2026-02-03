package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhj extends icr implements jcd, jbp, jfy {
    public String a;
    public jyq b;
    public kbi c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public ijh h;
    public fdap i;
    public fhi j;
    private Map k;
    private fgm l;

    public fhj(String str, jyq jyqVar, kbi kbiVar, int i, boolean z, int i2, int i3, ijh ijhVar) {
        this.a = str;
        this.b = jyqVar;
        this.c = kbiVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.h = ijhVar;
    }

    private final fgm k(ivu ivuVar) {
        fgm fgmVarL = l();
        fgmVarL.e(ivuVar);
        return fgmVarL;
    }

    private final fgm l() {
        fgm fgmVar;
        fhi fhiVar = this.j;
        if (fhiVar != null) {
            if (true != fhiVar.b) {
                fhiVar = null;
            }
            if (fhiVar != null && (fgmVar = fhiVar.c) != null) {
                return fgmVar;
            }
        }
        return a();
    }

    public final fgm a() {
        if (this.l == null) {
            this.l = new fgm(this.a, this.b, this.c, this.d, this.e, this.f);
        }
        fgm fgmVar = this.l;
        fgmVar.getClass();
        return fgmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001e  */
    @Override // defpackage.jcd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ixn b(defpackage.ixp r18, defpackage.ixk r19, long r20) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhj.b(ixp, ixk, long):ixn");
    }

    @Override // defpackage.icr
    public final boolean dN() {
        return false;
    }

    @Override // defpackage.jfy
    public final /* synthetic */ boolean dP() {
        return false;
    }

    @Override // defpackage.jfy
    public final void dQ(jto jtoVar) {
        fdap fdapVar = this.i;
        if (fdapVar == null) {
            fdapVar = new fdap() { // from class: fhd
                /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
                @Override // defpackage.fdap
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r30) {
                    /*
                        r29 = this;
                        r0 = r29
                        fhj r1 = r0.a
                        r2 = r30
                        java.util.List r2 = (java.util.List) r2
                        fgm r3 = r1.a()
                        jyq r4 = r1.b
                        ijh r1 = r1.h
                        if (r1 == 0) goto L17
                        long r5 = r1.a()
                        goto L19
                    L17:
                        long r5 = defpackage.ije.h
                    L19:
                        r14 = 0
                        r16 = 16777214(0xfffffe, float:2.3509884E-38)
                        r7 = 0
                        r9 = 0
                        r10 = 0
                        r11 = 0
                        r13 = 0
                        jyq r19 = defpackage.jyq.z(r4, r5, r7, r9, r10, r11, r13, r14, r16)
                        kji r1 = r3.k
                        r4 = 0
                        if (r1 != 0) goto L30
                    L2e:
                        r7 = r4
                        goto L8f
                    L30:
                        kio r5 = r3.f
                        if (r5 != 0) goto L35
                        goto L2e
                    L35:
                        juo r6 = new juo
                        java.lang.String r7 = r3.a
                        r6.<init>(r7)
                        jvi r7 = r3.g
                        if (r7 != 0) goto L41
                        goto L2e
                    L41:
                        jvl r7 = r3.j
                        if (r7 != 0) goto L46
                        goto L2e
                    L46:
                        long r7 = r3.l
                        r9 = -8589934589(0xfffffffe00000003, double:NaN)
                        long r27 = r7 & r9
                        jyi r7 = new jyi
                        jyh r17 = new jyh
                        fcvo r20 = defpackage.fcvo.a
                        int r8 = r3.e
                        boolean r9 = r3.d
                        int r10 = r3.c
                        kbi r11 = r3.b
                        r25 = r1
                        r24 = r5
                        r18 = r6
                        r21 = r8
                        r22 = r9
                        r23 = r10
                        r26 = r11
                        r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
                        r1 = r17
                        r21 = r24
                        jvc r11 = new jvc
                        jvf r17 = new jvf
                        kbi r5 = r3.b
                        r22 = r5
                        r17.<init>(r18, r19, r20, r21, r22)
                        int r15 = r3.e
                        int r5 = r3.c
                        r16 = r5
                        r12 = r17
                        r13 = r27
                        r11.<init>(r12, r13, r15, r16)
                        long r5 = r3.i
                        r7.<init>(r1, r11, r5)
                    L8f:
                        if (r7 == 0) goto L95
                        r2.add(r7)
                        r4 = r7
                    L95:
                        if (r4 == 0) goto L99
                        r1 = 1
                        goto L9a
                    L99:
                        r1 = 0
                    L9a:
                        java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.fhd.invoke(java.lang.Object):java.lang.Object");
                }
            };
            this.i = fdapVar;
        }
        jtk.v(jtoVar, new juo(this.a));
        fhi fhiVar = this.j;
        if (fhiVar != null) {
            jtk.s(jtoVar, fhiVar.b);
            jtk.x(jtoVar, new juo(fhiVar.a));
        }
        jtoVar.e(jsa.k, new jrn(null, new fdap() { // from class: fhe
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                String str = ((juo) obj).b;
                fhj fhjVar = this.a;
                fhi fhiVar2 = fhjVar.j;
                if (fhiVar2 == null) {
                    fhi fhiVar3 = new fhi(fhjVar.a, str);
                    fgm fgmVar = new fgm(str, fhjVar.b, fhjVar.c, fhjVar.d, fhjVar.e, fhjVar.f);
                    fgmVar.e(fhjVar.a().f);
                    fhiVar3.c = fgmVar;
                    fhjVar.j = fhiVar3;
                } else if (!fdbq.f(str, fhiVar2.a)) {
                    fhiVar2.a = str;
                    fgm fgmVar2 = fhiVar2.c;
                    if (fgmVar2 != null) {
                        fgmVar2.f(str, fhjVar.b, fhjVar.c, fhjVar.d, fhjVar.e, fhjVar.f);
                    }
                }
                fhjVar.j();
                return true;
            }
        }));
        jtoVar.e(jsa.l, new jrn(null, new fdap() { // from class: fhf
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                boolean z;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                fhj fhjVar = this.a;
                fhi fhiVar2 = fhjVar.j;
                if (fhiVar2 == null) {
                    z = false;
                } else {
                    fhiVar2.b = zBooleanValue;
                    fhjVar.j();
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }));
        jtoVar.e(jsa.m, new jrn(null, new fdae() { // from class: fhg
            @Override // defpackage.fdae
            public final Object invoke() {
                fhj fhjVar = this.a;
                fhjVar.i();
                fhjVar.j();
                return true;
            }
        }));
        jtoVar.e(jsa.a, new jrn(null, fdapVar));
    }

    @Override // defpackage.jcd
    public final int e(ivu ivuVar, ivt ivtVar, int i) {
        return k(ivuVar).a(i, ivuVar.q());
    }

    @Override // defpackage.jcd
    public final int f(ivu ivuVar, ivt ivtVar, int i) {
        return fbg.a(k(ivuVar).c(ivuVar.q()).a());
    }

    @Override // defpackage.jcd
    public final int g(ivu ivuVar, ivt ivtVar, int i) {
        return k(ivuVar).a(i, ivuVar.q());
    }

    @Override // defpackage.jcd
    public final int h(ivu ivuVar, ivt ivtVar, int i) {
        return fbg.a(k(ivuVar).c(ivuVar.q()).b());
    }

    public final void i() {
        this.j = null;
    }

    public final void j() {
        jfz.a(this);
        jci.b(this);
        jbq.a(this);
    }

    @Override // defpackage.jbp
    public final void r(imw imwVar) {
        if (this.C) {
            fgm fgmVarL = l();
            jvi jviVar = fgmVarL.g;
            if (jviVar == null) {
                ebs.a("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.l + ", textSubstitution=" + this.j + ')');
                throw new fcta();
            }
            ijb ijbVarB = imwVar.t().b();
            boolean z = fgmVarL.h;
            if (z) {
                long j = fgmVarL.i;
                ijbVarB.l();
                ijbVarB.a(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
            }
            try {
                khl khlVarT = this.b.t();
                if (khlVarT == null) {
                    khlVarT = khl.a;
                }
                khl khlVar = khlVarT;
                iko ikoVarK = this.b.k();
                if (ikoVarK == null) {
                    ikoVarK = iko.a;
                }
                iko ikoVar = ikoVarK;
                ina inaVarL = this.b.l();
                if (inaVarL == null) {
                    inaVarL = inc.a;
                }
                ina inaVar = inaVarL;
                iiy iiyVarJ = this.b.j();
                if (iiyVarJ != null) {
                    jviVar.n(ijbVarB, iiyVarJ, this.b.a(), ikoVar, khlVar, inaVar);
                } else {
                    ijh ijhVar = this.h;
                    long jA = ijhVar != null ? ijhVar.a() : ije.h;
                    if (jA == 16) {
                        jA = this.b.f() != 16 ? this.b.f() : ije.a;
                    }
                    jviVar.m(ijbVarB, jA, ikoVar, khlVar, inaVar);
                }
                if (z) {
                    ijbVarB.j();
                }
            } catch (Throwable th) {
                if (z) {
                    ijbVarB.j();
                }
                throw th;
            }
        }
    }

    @Override // defpackage.jfy
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // defpackage.jbp
    public final /* synthetic */ void t() {
    }
}
