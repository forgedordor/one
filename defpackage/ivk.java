package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ivk implements iul {
    private final iyo[] a;
    private final izs b;
    private final ivj c;
    private final izs d;
    private final ivj e;
    private final iyo f;
    private final iyo g;

    public ivk(iyo... iyoVarArr) {
        this.a = iyoVarArr;
        int length = iyoVarArr.length;
        izs[] izsVarArr = new izs[length];
        for (int i = 0; i < length; i++) {
            izsVarArr[i] = this.a[i].e();
        }
        this.b = new izs(new izq(izsVarArr));
        int length2 = this.a.length;
        ivj[] ivjVarArr = new ivj[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            ivjVarArr[i2] = this.a[i2].b();
        }
        this.c = new ivj(new ivh(ivjVarArr));
        int length3 = this.a.length;
        izs[] izsVarArr2 = new izs[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            izsVarArr2[i3] = this.a[i3].f();
        }
        this.d = new izs(new izr(izsVarArr2));
        int length4 = this.a.length;
        ivj[] ivjVarArr2 = new ivj[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            ivjVarArr2[i4] = this.a[i4].a();
        }
        this.e = new ivj(new ivi(ivjVarArr2));
        toString();
        String strConcat = toString().concat(" source");
        int length5 = this.a.length;
        iyo[] iyoVarArr2 = new iyo[length5];
        for (int i5 = 0; i5 < length5; i5++) {
            iyo iyoVarC = this.a[i5];
            if (iyoVarC instanceof iul) {
                iyoVarC = ((iul) iyoVarC).c();
            }
            iyoVarArr2[i5] = iyoVarC;
        }
        this.f = new ivp(strConcat);
        toString();
        String strConcat2 = toString().concat(" target");
        int length6 = this.a.length;
        iyo[] iyoVarArr3 = new iyo[length6];
        for (int i6 = 0; i6 < length6; i6++) {
            iyo iyoVarD = this.a[i6];
            if (iyoVarD instanceof iul) {
                iyoVarD = ((iul) iyoVarD).d();
            }
            iyoVarArr3[i6] = iyoVarD;
        }
        this.g = new ivp(strConcat2);
    }

    @Override // defpackage.iyo
    public final ivj a() {
        return this.e;
    }

    @Override // defpackage.iyo
    public final ivj b() {
        return this.c;
    }

    @Override // defpackage.iul
    public final iyo c() {
        return this.f;
    }

    @Override // defpackage.iul
    public final iyo d() {
        return this.g;
    }

    @Override // defpackage.iyo
    public final izs e() {
        return this.b;
    }

    @Override // defpackage.iyo
    public final izs f() {
        return this.d;
    }

    public final String toString() {
        return fcur.S(this.a, ",", "InnerInsetsRulers(", ")", 56);
    }
}
