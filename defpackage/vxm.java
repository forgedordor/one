package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vxm implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ fdci b;
    final /* synthetic */ vzv c;

    public vxm(fdpm fdpmVar, fdci fdciVar, vzv vzvVar) {
        this.a = fdpmVar;
        this.b = fdciVar;
        this.c = vzvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.vxl
            if (r0 == 0) goto L13
            r0 = r13
            vxl r0 = (defpackage.vxl) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            vxl r0 = new vxl
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.fctl.b(r13)
            goto Ld0
        L28:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L30:
            defpackage.fctl.b(r13)
            fdpm r13 = r11.a
            vzo r12 = (defpackage.vzo) r12
            fdci r2 = r11.b
            java.lang.String r4 = "emit"
            java.lang.String r5 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/api/transportcapability/MapiTransportCapabilityResolver$calculateTransportWithSimpleMessageProperties$$inlined$map$2$2"
            java.lang.String r6 = "BugleComposeRow2"
            java.lang.String r7 = "MapiTransportCapabilityResolver.kt"
            if (r12 == 0) goto L6a
            boolean r8 = r12.a
            if (r8 != r3) goto L6a
            java.lang.Object r12 = r2.a
            vzp r8 = defpackage.vzp.a
            boolean r12 = defpackage.fdbq.f(r12, r8)
            if (r12 != 0) goto Lc0
            ekrg r12 = defpackage.vzk.a
            ekrw r12 = r12.g()
            ekrz r9 = defpackage.eksq.a
            r12.X(r9, r6)
            r6 = 245(0xf5, float:3.43E-43)
            ekrw r12 = r12.h(r5, r4, r6, r7)
            ekrd r12 = (defpackage.ekrd) r12
            java.lang.String r4 = "Upgrading to MMS due to length of draft text."
            r12.q(r4)
            goto Lc0
        L6a:
            vzv r8 = r11.c
            boolean r8 = r8 instanceof defpackage.vzs
            r9 = 0
            if (r8 == 0) goto L99
            java.lang.Object r8 = r2.a
            boolean r8 = r8 instanceof defpackage.vzs
            if (r8 != 0) goto L8f
            ekrg r8 = defpackage.vzk.a
            ekrw r8 = r8.g()
            ekrz r10 = defpackage.eksq.a
            r8.X(r10, r6)
            r6 = 250(0xfa, float:3.5E-43)
            ekrw r4 = r8.h(r5, r4, r6, r7)
            ekrd r4 = (defpackage.ekrd) r4
            java.lang.String r5 = "Using mass SMS."
            r4.q(r5)
        L8f:
            vzs r8 = new vzs
            if (r12 == 0) goto L95
            waa r9 = r12.b
        L95:
            r8.<init>(r9)
            goto Lc0
        L99:
            java.lang.Object r8 = r2.a
            boolean r8 = r8 instanceof defpackage.vzt
            if (r8 != 0) goto Lb7
            ekrg r8 = defpackage.vzk.a
            ekrw r8 = r8.g()
            ekrz r10 = defpackage.eksq.a
            r8.X(r10, r6)
            r6 = 257(0x101, float:3.6E-43)
            ekrw r4 = r8.h(r5, r4, r6, r7)
            ekrd r4 = (defpackage.ekrd) r4
            java.lang.String r5 = "Using SMS."
            r4.q(r5)
        Lb7:
            vzt r8 = new vzt
            if (r12 == 0) goto Lbd
            waa r9 = r12.b
        Lbd:
            r8.<init>(r9)
        Lc0:
            r2.a = r8
            java.lang.Object r12 = r2.a
            r12.getClass()
            r0.b = r3
            java.lang.Object r12 = r13.fO(r12, r0)
            if (r12 != r1) goto Ld0
            return r1
        Ld0:
            fctx r12 = defpackage.fctx.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vxm.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
