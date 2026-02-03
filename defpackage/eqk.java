package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eqk implements hyk, hyb {
    public final cva a;
    private final hyk b;
    private final hyb c;

    public eqk(final hyk hykVar, Map map, hyb hybVar) {
        fdap fdapVar = new fdap() { // from class: eqg
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                hyk hykVar2 = hykVar;
                return Boolean.valueOf(hykVar2 != null ? hykVar2.d(obj) : true);
            }
        };
        hpt hptVar = hyo.a;
        this.b = new hym(map, fdapVar);
        this.c = hybVar;
        int i = cvs.a;
        this.a = new cva((byte[]) null);
    }

    @Override // defpackage.hyk
    public final Object a(String str) {
        return this.b.a(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    @Override // defpackage.hyk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map b() {
        /*
            r15 = this;
            cva r0 = r15.a
            java.lang.Object[] r1 = r0.b
            long[] r0 = r0.a
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L53
            r3 = 0
            r4 = r3
        Ld:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L4e
            int r7 = r4 - r2
            r8 = r3
        L20:
            int r9 = ~r7
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            if (r8 >= r9) goto L4c
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r5
            r13 = 128(0x80, double:6.32E-322)
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 >= 0) goto L48
            int r9 = r4 << 3
            int r9 = r9 + r8
            r9 = r1[r9]
            hyb r11 = r15.c
            hyi r11 = (defpackage.hyi) r11
            cuz r12 = r11.c
            java.lang.Object r12 = r12.b(r9)
            if (r12 != 0) goto L48
            java.util.Map r11 = r11.b
            r11.remove(r9)
        L48:
            long r5 = r5 >> r10
            int r8 = r8 + 1
            goto L20
        L4c:
            if (r9 != r10) goto L53
        L4e:
            if (r4 == r2) goto L53
            int r4 = r4 + 1
            goto Ld
        L53:
            hyk r0 = r15.b
            java.util.Map r0 = r0.b()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqk.b():java.util.Map");
    }

    @Override // defpackage.hyb
    public final void c(final Object obj, final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-858296452);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(obj) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(this) ? 128 : 256;
        }
        if (hmlVarC.J((i2 & 147) != 146, i2 & 1)) {
            this.c.c(obj, fdatVar, hmlVarC, i2 & 126);
            boolean zF = hmlVarC.F(this) | hmlVarC.F(obj);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zF || objS == hmk.a) {
                objS = new fdap() { // from class: eqe
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        eqk eqkVar = this.a;
                        cva cvaVar = eqkVar.a;
                        Object obj3 = obj;
                        cvaVar.b(obj3);
                        return new eqj(eqkVar, obj3);
                    }
                };
                hmwVar.af(objS);
            }
            hob.c(obj, (fdap) objS, hmlVarC);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: eqf
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    eqk eqkVar = this.a;
                    Object obj4 = obj;
                    int i4 = i;
                    eqkVar.c(obj4, fdatVar, (hml) obj2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    @Override // defpackage.hyk
    public final boolean d(Object obj) {
        return this.b.d(obj);
    }

    @Override // defpackage.hyk
    public final hyl e(String str, fdae fdaeVar) {
        return this.b.e(str, fdaeVar);
    }
}
