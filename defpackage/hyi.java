package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyi implements hyb {
    public static final hyr a = new hyu(new fdat() { // from class: hyf
        /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
        @Override // defpackage.fdat
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(java.lang.Object r19, java.lang.Object r20) {
            /*
                r18 = this;
                r0 = r19
                hya r0 = (defpackage.hya) r0
                r0 = r20
                hyi r0 = (defpackage.hyi) r0
                java.util.Map r1 = r0.b
                cuz r2 = r0.c
                java.lang.Object[] r3 = r2.b
                java.lang.Object[] r4 = r2.c
                long[] r2 = r2.a
                int r5 = r2.length
                int r5 = r5 + (-2)
                if (r5 < 0) goto L55
                r6 = 0
                r7 = r6
            L19:
                r8 = r2[r7]
                long r10 = ~r8
                r12 = 7
                long r10 = r10 << r12
                long r10 = r10 & r8
                r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r10 = r10 & r12
                int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r10 == 0) goto L50
                int r10 = r7 - r5
                r11 = r6
            L2c:
                int r12 = ~r10
                int r12 = r12 >>> 31
                r13 = 8
                int r12 = 8 - r12
                if (r11 >= r12) goto L4e
                r14 = 255(0xff, double:1.26E-321)
                long r14 = r14 & r8
                r16 = 128(0x80, double:6.32E-322)
                int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r12 >= 0) goto L4a
                int r12 = r7 << 3
                int r12 = r12 + r11
                r14 = r3[r12]
                r12 = r4[r12]
                hyk r12 = (defpackage.hyk) r12
                r0.a(r12, r1, r14)
            L4a:
                long r8 = r8 >> r13
                int r11 = r11 + 1
                goto L2c
            L4e:
                if (r12 != r13) goto L55
            L50:
                if (r7 == r5) goto L55
                int r7 = r7 + 1
                goto L19
            L55:
                boolean r0 = r1.isEmpty()
                if (r0 == 0) goto L5d
                r0 = 0
                return r0
            L5d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.hyf.a(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }, new fdap() { // from class: hyg
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            return new hyi((Map) obj);
        }
    });
    public final Map b;
    public final cuz c;
    public hyk d;
    private final fdap e;

    public hyi() {
        this((byte[]) null);
    }

    public final void a(hyk hykVar, Map map, Object obj) {
        Map mapB = hykVar.b();
        if (mapB.isEmpty()) {
            map.remove(obj);
        } else {
            map.put(obj, mapB);
        }
    }

    @Override // defpackage.hyb
    public final void c(final Object obj, final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(533563200);
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
            hmlVarC.K(obj);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj2 = hmk.a;
            if (objS == obj2) {
                fdap fdapVar = this.e;
                if (!((Boolean) fdapVar.invoke(obj)).booleanValue()) {
                    throw new IllegalArgumentException(a.h(obj, "Type of the key ", " is not supported. On Android you can only use types which can be stored inside the Bundle."));
                }
                Map map = (Map) this.b.get(obj);
                hpt hptVar = hyo.a;
                hyq hyqVar = new hyq(new hym(map, fdapVar));
                hmwVar.af(hyqVar);
                objS = hyqVar;
            }
            final hyq hyqVar2 = (hyq) objS;
            hnj.b(new hpu[]{hyo.a.c(hyqVar2), pjg.a.c(hyqVar2)}, fdatVar, hmlVarC, (i2 & 112) | 8);
            fctx fctxVar = fctx.a;
            boolean zF = hmlVarC.F(this) | hmlVarC.F(obj) | hmlVarC.F(hyqVar2);
            Object objS2 = hmwVar.S();
            if (zF || objS2 == obj2) {
                objS2 = new fdap() { // from class: hyd
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        hyi hyiVar = this.a;
                        cuz cuzVar = hyiVar.c;
                        Object obj4 = obj;
                        if (cuzVar.g(obj4)) {
                            throw new IllegalArgumentException(a.h(obj4, "Key ", " was used multiple times "));
                        }
                        hyq hyqVar3 = hyqVar2;
                        hyiVar.b.remove(obj4);
                        cuzVar.e(obj4, hyqVar3);
                        return new hyh(hyiVar, obj4, hyqVar3);
                    }
                };
                hmwVar.af(objS2);
            }
            hob.c(fctxVar, (fdap) objS2, hmlVarC);
            hmlVarC.q();
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: hye
                @Override // defpackage.fdat
                public final Object a(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    hyi hyiVar = this.a;
                    Object obj5 = obj;
                    int i4 = i;
                    hyiVar.c(obj5, fdatVar, (hml) obj3, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public hyi(Map map) {
        this.b = map;
        long[] jArr = cvp.a;
        this.c = new cuz((byte[]) null);
        this.e = new fdap() { // from class: hyc
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                hyk hykVar = this.a.d;
                return Boolean.valueOf(hykVar != null ? hykVar.d(obj) : true);
            }
        };
    }

    public /* synthetic */ hyi(byte[] bArr) {
        this(new LinkedHashMap());
    }
}
