package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class enh extends icr implements jac, iuo, jcd {
    private static final enf e = new enf();
    public eni a;
    public enc b;
    public boolean c;
    public dwm d;

    public enh(eni eniVar, enc encVar, boolean z, dwm dwmVar) {
        this.a = eniVar;
        this.b = encVar;
        this.c = z;
        this.d = dwmVar;
    }

    private final boolean j(int i) {
        if (iun.a(i, 1)) {
            return false;
        }
        if (iun.a(i, 2)) {
            return true;
        }
        if (iun.a(i, 5)) {
            return this.c;
        }
        if (iun.a(i, 6)) {
            return !this.c;
        }
        if (iun.a(i, 3)) {
            int iOrdinal = jbg.h(this).ordinal();
            if (iOrdinal == 0) {
                return this.c;
            }
            if (iOrdinal == 1) {
                return !this.c;
            }
            throw new fctg();
        }
        if (!iun.a(i, 4)) {
            end.a();
            throw new fcta();
        }
        int iOrdinal2 = jbg.h(this).ordinal();
        if (iOrdinal2 == 0) {
            return !this.c;
        }
        if (iOrdinal2 == 1) {
            return this.c;
        }
        throw new fctg();
    }

    @Override // defpackage.iuo
    public final Object a(int i, fdap fdapVar) {
        if (this.a.b() <= 0 || !this.a.e() || !this.C) {
            return fdapVar.invoke(e);
        }
        int iC = j(i) ? this.a.c() : this.a.a();
        fdci fdciVar = new fdci();
        fdciVar.a = this.b.a(iC, iC);
        int iD = this.a.d();
        int iG = fddu.g(iD + iD, this.a.b());
        Object objInvoke = null;
        for (int i2 = 0; objInvoke == null && i((enb) fdciVar.a, i) && i2 < iG; i2++) {
            enb enbVar = (enb) fdciVar.a;
            int i3 = enbVar.a;
            int i4 = enbVar.b;
            if (j(i)) {
                i4++;
            } else {
                i3--;
            }
            enb enbVarA = this.b.a(i3, i4);
            this.b.b((enb) fdciVar.a);
            fdciVar.a = enbVarA;
            jci.d(this);
            objInvoke = fdapVar.invoke(new eng(this, fdciVar, i));
        }
        this.b.b((enb) fdciVar.a);
        jci.d(this);
        return objInvoke;
    }

    @Override // defpackage.jcd
    public final ixn b(ixp ixpVar, ixk ixkVar, long j) {
        final iyl iylVarE = ixkVar.e(j);
        return ixpVar.ej(iylVarE.a, iylVarE.b, fcvp.a, new fdap() { // from class: ene
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((iyk) obj).s(iylVarE, 0, 0, 0.0f);
                return fctx.a;
            }
        });
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int e(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.a(this, ivuVar, ivtVar, i);
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int f(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.b(this, ivuVar, ivtVar, i);
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int g(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.c(this, ivuVar, ivtVar, i);
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int h(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.d(this, ivuVar, ivtVar, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(defpackage.enb r5, int r6) {
        /*
            r4 = this;
            r0 = 5
            boolean r0 = defpackage.iun.a(r6, r0)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L3e
            r0 = 6
            boolean r0 = defpackage.iun.a(r6, r0)
            if (r0 == 0) goto L11
            goto L3e
        L11:
            r0 = 3
            boolean r0 = defpackage.iun.a(r6, r0)
            if (r0 != 0) goto L37
            r0 = 4
            boolean r0 = defpackage.iun.a(r6, r0)
            if (r0 == 0) goto L20
            goto L37
        L20:
            boolean r0 = defpackage.iun.a(r6, r2)
            if (r0 != 0) goto L44
            r0 = 2
            boolean r0 = defpackage.iun.a(r6, r0)
            if (r0 == 0) goto L2e
            goto L44
        L2e:
            defpackage.end.a()
            fcta r5 = new fcta
            r5.<init>()
            throw r5
        L37:
            dwm r0 = r4.d
            dwm r3 = defpackage.dwm.a
            if (r0 != r3) goto L44
            goto L5c
        L3e:
            dwm r0 = r4.d
            dwm r3 = defpackage.dwm.b
            if (r0 == r3) goto L5c
        L44:
            boolean r6 = r4.j(r6)
            if (r6 == 0) goto L57
            int r5 = r5.b
            eni r6 = r4.a
            int r6 = r6.b()
            int r6 = r6 + (-1)
            if (r5 >= r6) goto L5c
            return r2
        L57:
            int r5 = r5.a
            if (r5 <= 0) goto L5c
            return r2
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enh.i(enb, int):boolean");
    }

    @Override // defpackage.jac
    public final jaa p() {
        return jad.a(new fcti(iuq.a, this));
    }

    @Override // defpackage.jaf
    public final /* synthetic */ Object q(izw izwVar) {
        return jab.a(this, izwVar);
    }
}
