package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dss extends icr implements eui, jbd, jcb {
    public dwm a;
    public final dyk b;
    public boolean c;
    public dsj d;
    public ivy f;
    public boolean g;
    public boolean h;
    public boolean j;
    public final dsg e = new dsg();
    public long i = 0;

    public dss(dwm dwmVar, dyk dykVar, boolean z, dsj dsjVar) {
        this.a = dwmVar;
        this.b = dykVar;
        this.c = z;
        this.d = dsjVar;
    }

    private final dsj n() {
        dsj dsjVar = this.d;
        return dsjVar == null ? (dsj) jbe.a(this, dsm.a) : dsjVar;
    }

    public final float a(dsj dsjVar) {
        float f;
        Object obj;
        int iCompare;
        if (kjg.e(this.i, 0L)) {
            return 0.0f;
        }
        hum humVar = this.e.a;
        int i = humVar.b - 1;
        Object[] objArr = humVar.a;
        if (i < objArr.length) {
            obj = null;
            while (true) {
                if (i < 0) {
                    f = 0.0f;
                    break;
                }
                Object objInvoke = ((dsn) objArr[i]).a.invoke();
                if (objInvoke != null) {
                    long jB = ((ihu) objInvoke).b();
                    long jD = kjh.d(this.i);
                    f = 0.0f;
                    int iOrdinal = this.a.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jB & 4294967295L)), Float.intBitsToFloat((int) (jD & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            throw new fctg();
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jB >> 32)), Float.intBitsToFloat((int) (jD >> 32)));
                    }
                    if (iCompare <= 0) {
                        obj = objInvoke;
                    } else if (obj == null) {
                        obj = objInvoke;
                    }
                }
                i--;
            }
        } else {
            f = 0.0f;
            obj = null;
        }
        if (obj == null) {
            Object objF = this.g ? f() : null;
            if (objF == null) {
                return f;
            }
            obj = objF;
        }
        long jD2 = kjh.d(this.i);
        int iOrdinal2 = this.a.ordinal();
        if (iOrdinal2 == 0) {
            ihu ihuVar = (ihu) obj;
            float f2 = ihuVar.c;
            return dsjVar.a(f2, ihuVar.e - f2, Float.intBitsToFloat((int) (jD2 & 4294967295L)));
        }
        if (iOrdinal2 != 1) {
            throw new fctg();
        }
        ihu ihuVar2 = (ihu) obj;
        float f3 = ihuVar2.b;
        return dsjVar.a(f3, ihuVar2.d - f3, Float.intBitsToFloat((int) (jD2 >> 32)));
    }

    @Override // defpackage.icr
    public final boolean dN() {
        return false;
    }

    public final long e(ihu ihuVar, long j) {
        long jFloatToRawIntBits;
        long j2;
        long jD = kjh.d(j);
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 0) {
            dsj dsjVarN = n();
            float f = ihuVar.c;
            float fA = dsjVarN.a(f, ihuVar.e - f, Float.intBitsToFloat((int) (jD & 4294967295L)));
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fA);
            j2 = jFloatToRawIntBits2 << 32;
        } else {
            if (iOrdinal != 1) {
                throw new fctg();
            }
            dsj dsjVarN2 = n();
            float f2 = ihuVar.b;
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(dsjVarN2.a(f2, ihuVar.d - f2, Float.intBitsToFloat((int) (jD >> 32))));
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j2 = jFloatToRawIntBits3 << 32;
        }
        return j2 | (jFloatToRawIntBits & 4294967295L);
    }

    public final ihu f() {
        if (this.C) {
            ivy ivyVarB = jbg.b(this);
            ivy ivyVar = this.f;
            if (ivyVar != null) {
                if (true != ivyVar.u()) {
                    ivyVar = null;
                }
                if (ivyVar != null) {
                    return ivyVarB.o(ivyVar, false);
                }
            }
        }
        return null;
    }

    public final void g() {
        dsj dsjVarN = n();
        if (this.j) {
            ebs.d("launchAnimation called when previous animation was running");
        }
        fdil.d(E(), null, fdjz.d, new dsr(this, new dzx(dsi.a), dsjVarN, null), 1);
    }

    @Override // defpackage.jcb
    public final void i(long j) {
        long j2;
        long j3;
        ihu ihuVarF;
        long j4 = this.i;
        this.i = j;
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 0) {
            j2 = j & 4294967295L;
            j3 = 4294967295L & j4;
        } else {
            if (iOrdinal != 1) {
                throw new fctg();
            }
            j2 = j >> 32;
            j3 = j4 >> 32;
        }
        if (fdbq.a((int) j2, (int) j3) >= 0 || this.j || this.g || (ihuVarF = f()) == null || !j(ihuVarF, j4)) {
            return;
        }
        this.h = true;
    }

    public final boolean j(ihu ihuVar, long j) {
        long jE = e(ihuVar, j);
        return Math.abs(Float.intBitsToFloat((int) (jE >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jE & 4294967295L))) <= 0.5f;
    }

    @Override // defpackage.jcb
    public final /* synthetic */ void ea(ivy ivyVar) {
    }
}
