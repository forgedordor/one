package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eupc implements euoz {
    private final ekyo a;

    public eupc(ekyo ekyoVar) {
        this.a = ekyoVar;
    }

    @Override // defpackage.euoz
    public final boolean a(double d, double d2, double d3) {
        ekxi ekxiVar;
        double dAsin;
        ekyj ekyjVarE = ekyb.c(d, d2).e();
        ekyo ekyoVar = this.a;
        boolean z = true;
        if (ekyoVar.e(ekyjVarE)) {
            return true;
        }
        double d4 = 0.0d;
        if (d3 <= 0.0d) {
            return false;
        }
        if (ekyoVar.e(ekyjVarE)) {
            ekxiVar = new ekxi(0.0d);
        } else {
            double d5 = 3.141592653589793d;
            ekxi ekxiVar2 = new ekxi(3.141592653589793d);
            int i = 0;
            while (i < ekyoVar.a()) {
                ekyh ekyhVarB = ekyoVar.b(i);
                ekyj ekyjVarM = ekyj.m(ekyjVarE);
                ekxi ekxiVar3 = new ekxi(d5);
                int i2 = 0;
                while (i2 < ekyhVarB.c) {
                    ekyj ekyjVarD = ekyhVarB.d(i2);
                    i2++;
                    boolean z2 = z;
                    ekyj ekyjVarD2 = ekyhVarB.d(i2);
                    double d6 = ekxv.a;
                    double d7 = d4;
                    ejwl.f(ekxm.d(ekyjVarM), "S2Point not normalized: %s", ekyjVarM);
                    ejwl.f(ekxm.d(ekyjVarD), "S2Point not normalized: %s", ekyjVarD);
                    ejwl.f(ekxm.d(ekyjVarD2), "S2Point not normalized: %s", ekyjVarD2);
                    ekyj ekyjVarA = ekzo.a(ekyjVarD, ekyjVarD2);
                    if (ekyj.f(ekyjVarD, ekyjVarM, ekyjVarA) <= d7 || ekyj.f(ekyjVarD2, ekyjVarA, ekyjVarM) <= d7) {
                        double dAsin2 = Math.asin(Math.min(1.0d, Math.sqrt(Math.min(ekxv.a(ekyjVarM, ekyjVarD), ekxv.a(ekyjVarM, ekyjVarD2))) * 0.5d));
                        dAsin = dAsin2 + dAsin2;
                    } else {
                        dAsin = Math.asin(Math.min(1.0d, Math.abs(ekyjVarM.a(ekyjVarA)) / ekyjVarA.d()));
                    }
                    ekxiVar3 = ekxi.c(ekxiVar3, new ekxi(dAsin));
                    z = z2;
                    d4 = d7;
                }
                ekxiVar2 = ekxi.c(ekxiVar2, ekxiVar3);
                i++;
                d5 = 3.141592653589793d;
            }
            ekxiVar = ekxiVar2;
        }
        boolean z3 = z;
        if (ekxiVar.c * 6371010.0d < d3) {
            return z3;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r11 >= 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        if (r6.l() == false) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x01c4, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        r3.a(defpackage.ekxw.LOOP_NOT_ENOUGH_VERTICES, "Non-empty, non-full loops must have at least 3 vertices", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        if (r7 >= r11) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        r12 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        if (r6.d(r7).p(r6.d(r12)) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        r3.a(defpackage.ekxw.DUPLICATE_VERTICES, defpackage.a.e(r7, "Edge ", " is degenerate (duplicate vertex)."), new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008d, code lost:
    
        r7 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0097, code lost:
    
        if (r1.b(r5).k() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        r3.a(defpackage.ekxw.POLYGON_EMPTY_LOOP, defpackage.a.e(r5, "Loop ", ": empty loops are not allowed."), new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00af, code lost:
    
        if (r1.b(r5).m() == false) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b5, code lost:
    
        if (r1.a() <= 1) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b7, code lost:
    
        r3.a(defpackage.ekxw.POLYGON_EXCESS_FULL_LOOP, defpackage.a.e(r5, "Loop ", ": full loop appears in non-full polygon (more than one loop)."), new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c9, code lost:
    
        r3.a(defpackage.ekxw.NOT_UNIT_LENGTH, "Invalid loop bound, possibly due to vertices that are not unit length.", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d2, code lost:
    
        r3.a(r3.a, "Loop " + r5 + ": " + r3.b, new java.lang.Object[0]);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x052d A[SYNTHETIC] */
    @Override // defpackage.euoz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eupc.b():boolean");
    }
}
