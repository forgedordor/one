package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkjv implements PointerInputEventHandler {
    final /* synthetic */ hox a;
    final /* synthetic */ fdap b;
    final /* synthetic */ fdae c;
    final /* synthetic */ kji d;
    final /* synthetic */ dkkr e;
    final /* synthetic */ boolean f;
    final /* synthetic */ iqa g;

    public dkjv(hox hoxVar, fdap fdapVar, fdae fdaeVar, kji kjiVar, dkkr dkkrVar, boolean z, iqa iqaVar) {
        this.a = hoxVar;
        this.b = fdapVar;
        this.c = fdaeVar;
        this.d = kjiVar;
        this.e = dkkrVar;
        this.f = z;
        this.g = iqaVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(isn isnVar, fcxy<? super fctx> fcxyVar) {
        final fdce fdceVar = new fdce();
        fdap fdapVar = new fdap() { // from class: dkjr
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                fdceVar.a = false;
                return fctx.a;
            }
        };
        final hox hoxVar = this.a;
        final fdap fdapVar2 = this.b;
        final fdae fdaeVar = this.c;
        fdae fdaeVar2 = new fdae() { // from class: dkjs
            @Override // defpackage.fdae
            public final Object invoke() {
                hox hoxVar2 = hoxVar;
                Float fValueOf = Float.valueOf(0.0f);
                hoxVar2.b(fValueOf);
                fdapVar2.invoke(fValueOf);
                fdce fdceVar2 = fdceVar;
                if (fdceVar2.a) {
                    fdaeVar.invoke();
                    fdceVar2.a = false;
                }
                return fctx.a;
            }
        };
        fdae fdaeVar3 = new fdae() { // from class: dkjt
            @Override // defpackage.fdae
            public final Object invoke() {
                fdceVar.a = false;
                return fctx.a;
            }
        };
        final dkkr dkkrVar = this.e;
        final kji kjiVar = this.d;
        final boolean z = this.f;
        final iqa iqaVar = this.g;
        Object objB = dvn.b(isnVar, new dua(fdapVar, new fdat() { // from class: dkju
            /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
            @Override // defpackage.fdat
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(java.lang.Object r10, java.lang.Object r11) {
                /*
                    r9 = this;
                    ise r10 = (defpackage.ise) r10
                    java.lang.Float r11 = (java.lang.Float) r11
                    float r11 = r11.floatValue()
                    r10.getClass()
                    kji r0 = r1
                    kji r1 = defpackage.kji.b
                    if (r0 != r1) goto L12
                    float r11 = -r11
                L12:
                    boolean r0 = r4
                    dkkr r1 = r3
                    hox r2 = r2
                    java.lang.Object r3 = r2.a()
                    java.lang.Number r3 = (java.lang.Number) r3
                    float r3 = r3.floatValue()
                    float r3 = r3 + r11
                    r4 = 0
                    int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                    r6 = 1
                    if (r5 > 0) goto L38
                    boolean r7 = defpackage.dkke.o(r1)
                    if (r7 == 0) goto L38
                    dkkp r7 = r1.v
                    boolean r7 = r7.c
                    if (r7 == 0) goto L58
                    if (r0 == 0) goto L58
                    r0 = r6
                L38:
                    dkgu r7 = r1.y
                    dkgv r7 = r7.b
                    dkgv r8 = defpackage.dkgv.a
                    if (r7 != r8) goto L42
                    if (r5 <= 0) goto L4a
                L42:
                    dkgv r5 = defpackage.dkgv.c
                    if (r7 != r5) goto L5b
                    int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                    if (r4 < 0) goto L5b
                L4a:
                    boolean r4 = defpackage.dkke.o(r1)
                    if (r4 == 0) goto L58
                    dkkp r1 = r1.v
                    boolean r1 = r1.c
                    if (r1 == 0) goto L5b
                    if (r0 == 0) goto L5b
                L58:
                    fctx r10 = defpackage.fctx.a
                    return r10
                L5b:
                    fdce r0 = r5
                    float r1 = java.lang.Math.abs(r3)
                    r4 = 1132068864(0x437a0000, float:250.0)
                    int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                    r4 = 0
                    if (r1 <= 0) goto L83
                    java.lang.Object r10 = r2.a()
                    java.lang.Number r10 = (java.lang.Number) r10
                    float r10 = r10.floatValue()
                    r1 = 1077936128(0x40400000, float:3.0)
                    float r11 = r11 / r1
                    float r3 = r10 + r11
                    boolean r10 = r0.a
                    if (r10 != 0) goto L80
                    iqa r10 = r6
                    r10.a(r4)
                L80:
                    r0.a = r6
                    goto L8d
                L83:
                    int r10 = r10.i
                    boolean r10 = defpackage.ita.b(r10, r6)
                    if (r10 == 0) goto L8d
                    r0.a = r4
                L8d:
                    fdap r10 = r7
                    java.lang.Float r11 = java.lang.Float.valueOf(r3)
                    r2.b(r11)
                    r10.invoke(r11)
                    fctx r10 = defpackage.fctx.a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dkju.a(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, fdaeVar2, fdaeVar3, null), fcxyVar);
        fcyl fcylVar = fcyl.a;
        if (objB != fcylVar) {
            objB = fctx.a;
        }
        return objB == fcylVar ? objB : fctx.a;
    }
}
