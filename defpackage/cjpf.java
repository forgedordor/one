package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjpf implements dggx, dggz, dggw, dgqr {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/rcs/provisioning/RcsProvisioningManagerKt");
    private final dgqp b;
    private final awzf c;
    private final awyu d;

    public cjpf(dgqp dgqpVar, awzf awzfVar, awyu awyuVar) {
        this.b = dgqpVar;
        this.c = awzfVar;
        this.d = awyuVar;
    }

    @Override // defpackage.dggw
    public final dgid a(dggk dggkVar) {
        return this.b.a(dggkVar);
    }

    @Override // defpackage.dggw
    public final dgid b(String str) {
        return this.b.b(str);
    }

    @Override // defpackage.dggw
    @fcsv
    public final dgid c(int i) {
        return this.b.c(i);
    }

    @Override // defpackage.dggw
    public final eiju d(int i) {
        return this.b.d(i);
    }

    @Override // defpackage.dggw
    public final eiju e() {
        return this.b.e();
    }

    @Override // defpackage.dggw
    public final eiju f(String str) {
        return this.b.f(str);
    }

    @Override // defpackage.dggw
    public final ListenableFuture g() {
        return this.b.g();
    }

    @Override // defpackage.dggz
    public final Optional h(dggn dggnVar) {
        return this.b.h(dggnVar);
    }

    @Override // defpackage.dggz
    @fcsv
    public final Optional i(String str) {
        return this.b.i(str);
    }

    @Override // defpackage.dggz
    public final Optional j(dggk dggkVar) {
        return this.b.j(dggkVar);
    }

    @Override // defpackage.dggz
    @fcsv
    public final Optional k(int i) {
        return this.b.k(i);
    }

    @Override // defpackage.dggz
    @fcsv
    public final Optional l() {
        return this.b.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dggx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.axcm r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cjpd
            if (r0 == 0) goto L13
            r0 = r6
            cjpd r0 = (defpackage.cjpd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cjpd r0 = new cjpd
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            axcm r5 = r0.d
            defpackage.fctl.b(r6)
            goto L3e
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = r4.n(r5, r0)
            if (r6 == r1) goto L5c
        L3e:
            if (r6 == 0) goto L49
            dgqp r5 = r4.b
            java.lang.String r6 = (java.lang.String) r6
            dgid r5 = r5.b(r6)
            return r5
        L49:
            java.util.Objects.toString(r5)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "ProvisioningId is empty for myIdentityToken: "
            java.lang.String r5 = r0.concat(r5)
            r6.<init>(r5)
            throw r6
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjpf.m(axcm, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.axcm r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cjpe
            if (r0 == 0) goto L13
            r0 = r7
            cjpe r0 = (defpackage.cjpe) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cjpe r0 = new cjpe
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            axcm r6 = r0.d
            defpackage.fctl.b(r7)
            goto L40
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.fctl.b(r7)
            awzf r7 = r5.c
            r0.d = r6
            r0.c = r3
            java.lang.Object r7 = r7.g(r6, r0)
            if (r7 == r1) goto L79
        L40:
            awyu r0 = r5.d
            awxn r7 = (defpackage.awxn) r7
            awyv r7 = r0.a(r7)
            j$.util.Optional r7 = r7.e()
            r7.getClass()
            java.lang.Object r7 = defpackage.fdct.b(r7)
            r0 = r7
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L78
            ekrg r0 = defpackage.cjpf.a
            ekrw r0 = r0.j()
            ekrz r1 = defpackage.eksq.a
            java.lang.String r2 = "RcsProvisioning"
            r0.X(r1, r2)
            r1 = 115(0x73, float:1.61E-43)
            java.lang.String r2 = "RcsProvisioningManagerKt.kt"
            java.lang.String r3 = "com/google/android/apps/messaging/shared/rcs/provisioning/RcsProvisioningManagerKt"
            java.lang.String r4 = "getProvisioningId"
            ekrw r0 = r0.h(r3, r4, r1, r2)
            ekrd r0 = (defpackage.ekrd) r0
            java.lang.String r1 = "ProvisioningId is empty for myIdentityToken: %s"
            r0.t(r1, r6)
        L78:
            return r7
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjpf.n(axcm, fcxy):java.lang.Object");
    }

    @Override // defpackage.dggw
    @fcsv
    public final Set o() {
        return this.b.o();
    }

    @Override // defpackage.dggw
    public final Set p() {
        return this.b.p();
    }

    @Override // defpackage.dggw
    public final void q(String str, dggv dggvVar, Executor executor) {
        this.b.q(str, dggvVar, executor);
    }

    @Override // defpackage.dgqr
    public final void r(String str, dgid dgidVar) {
        this.b.r(str, dgidVar);
    }

    @Override // defpackage.dgqr
    public final void s(String str, Optional optional) {
        this.b.s(str, optional);
    }

    @Override // defpackage.dggw
    public final void t(dggv dggvVar) {
        this.b.t(dggvVar);
    }

    @Override // defpackage.dggw
    public final boolean u(dggk dggkVar) {
        return this.b.u(dggkVar);
    }

    @Override // defpackage.dggw
    public final boolean v(String str) {
        return this.b.v(str);
    }

    @Override // defpackage.dggw
    public final boolean w(int i) {
        return this.b.w(i);
    }

    @Override // defpackage.dggw
    public final boolean x(int i) {
        return this.b.x(i);
    }
}
