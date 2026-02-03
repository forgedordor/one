package defpackage;

import android.content.Context;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djiy implements PointerInputEventHandler {
    final /* synthetic */ fdcf a;
    final /* synthetic */ fdcf b;
    final /* synthetic */ hox c;
    final /* synthetic */ hox d;
    final /* synthetic */ hox e;
    final /* synthetic */ fdap f;
    final /* synthetic */ Context g;
    final /* synthetic */ boolean h;
    final /* synthetic */ fdae i;
    final /* synthetic */ iqa j;

    public djiy(fdcf fdcfVar, fdcf fdcfVar2, hox hoxVar, hox hoxVar2, hox hoxVar3, fdap fdapVar, Context context, boolean z, fdae fdaeVar, iqa iqaVar) {
        this.a = fdcfVar;
        this.b = fdcfVar2;
        this.c = hoxVar;
        this.d = hoxVar2;
        this.e = hoxVar3;
        this.f = fdapVar;
        this.g = context;
        this.h = z;
        this.i = fdaeVar;
        this.j = iqaVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(isn isnVar, fcxy<? super fctx> fcxyVar) {
        final fdcf fdcfVar = this.a;
        final fdcf fdcfVar2 = this.b;
        final hox hoxVar = this.c;
        final hox hoxVar2 = this.d;
        fdap fdapVar = new fdap() { // from class: djiu
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                fdcfVar.a = 0.0f;
                fdcfVar2.a = 0.0f;
                hoxVar.b(false);
                hoxVar2.b(false);
                return fctx.a;
            }
        };
        fdae fdaeVar = new fdae() { // from class: djiv
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        };
        final hox hoxVar3 = this.e;
        final fdap fdapVar2 = this.f;
        final Context context = this.g;
        fdae fdaeVar2 = new fdae() { // from class: djiw
            @Override // defpackage.fdae
            public final Object invoke() {
                hoxVar.b(false);
                hoxVar2.b(false);
                hox hoxVar4 = hoxVar3;
                if (((Boolean) hoxVar4.a()).booleanValue()) {
                    fdapVar2.invoke(context);
                    hoxVar4.b(false);
                }
                return fctx.a;
            }
        };
        final boolean z = this.h;
        final fdae fdaeVar3 = this.i;
        final iqa iqaVar = this.j;
        Object objB = dvn.b(isnVar, new dtx(fdapVar, fdaeVar, fdaeVar2, new fdat() { // from class: djix
            /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
            @Override // defpackage.fdat
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(java.lang.Object r12, java.lang.Object r13) {
                /*
                    r11 = this;
                    ise r12 = (defpackage.ise) r12
                    ihs r13 = (defpackage.ihs) r13
                    r12.getClass()
                    hox r12 = r1
                    java.lang.Object r0 = r12.a()
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto Le0
                    hox r0 = r2
                    java.lang.Object r1 = r0.a()
                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                    boolean r1 = r1.booleanValue()
                    if (r1 != 0) goto Le0
                    hox r1 = r3
                    java.lang.Object r2 = r1.a()
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 != 0) goto L33
                    goto Le0
                L33:
                    boolean r2 = r6
                    fdcf r3 = r5
                    fdcf r4 = r4
                    long r5 = r13.a
                    r13 = 32
                    long r7 = r5 >> r13
                    float r13 = r4.a
                    int r7 = (int) r7
                    float r7 = java.lang.Float.intBitsToFloat(r7)
                    float r13 = r13 + r7
                    r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
                    long r5 = r5 & r7
                    float r7 = r3.a
                    int r5 = (int) r5
                    float r5 = java.lang.Float.intBitsToFloat(r5)
                    float r7 = r7 + r5
                    r5 = 1
                    r6 = 1120403456(0x42c80000, float:100.0)
                    r8 = 0
                    r9 = 0
                    if (r2 == 0) goto L61
                    int r2 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
                    if (r2 >= 0) goto L65
                    goto L67
                L61:
                    int r2 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
                    if (r2 > 0) goto L67
                L65:
                    r2 = r9
                    goto L7a
                L67:
                    float r2 = java.lang.Math.abs(r13)
                    r10 = 1132068864(0x437a0000, float:250.0)
                    int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
                    if (r2 < 0) goto L65
                    float r2 = java.lang.Math.abs(r7)
                    int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                    if (r2 > 0) goto L65
                    r2 = r5
                L7a:
                    fdae r10 = r7
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                    r12.b(r2)
                    int r2 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
                    if (r2 >= 0) goto L9c
                    float r2 = java.lang.Math.abs(r7)
                    r8 = 1125515264(0x43160000, float:150.0)
                    int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                    if (r2 < 0) goto L9c
                    float r2 = java.lang.Math.abs(r13)
                    int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                    if (r2 > 0) goto L9c
                    if (r10 == 0) goto L9c
                    goto L9d
                L9c:
                    r5 = r9
                L9d:
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
                    r0.b(r2)
                    r4.a = r13
                    r3.a = r7
                    java.lang.Object r12 = r12.a()
                    java.lang.Boolean r12 = (java.lang.Boolean) r12
                    boolean r12 = r12.booleanValue()
                    if (r12 == 0) goto Lc8
                    iqa r12 = r10
                    android.content.Context r13 = r9
                    fdap r0 = r8
                    r0.invoke(r13)
                    r12.a(r9)
                    java.lang.Boolean r12 = java.lang.Boolean.valueOf(r9)
                    r1.b(r12)
                    goto Le0
                Lc8:
                    java.lang.Object r12 = r0.a()
                    java.lang.Boolean r12 = (java.lang.Boolean) r12
                    boolean r12 = r12.booleanValue()
                    if (r12 == 0) goto Le0
                    if (r10 == 0) goto Ld9
                    r10.invoke()
                Ld9:
                    java.lang.Boolean r12 = java.lang.Boolean.valueOf(r9)
                    r1.b(r12)
                Le0:
                    fctx r12 = defpackage.fctx.a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.djix.a(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null), fcxyVar);
        fcyl fcylVar = fcyl.a;
        if (objB != fcylVar) {
            objB = fctx.a;
        }
        return objB == fcylVar ? objB : fctx.a;
    }
}
