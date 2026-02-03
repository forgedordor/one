package defpackage;

import android.app.Activity;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doqr {
    private static final ekrg b = ekrg.c("com/google/android/libraries/compose/photos/ui/requirements/MissingPhotosAppRequirementRecovery");
    public final eg a;
    private final dopm c;
    private final fctc d;
    private final adgp e;

    public doqr(Activity activity, dopm dopmVar, adgp adgpVar) {
        dopmVar.getClass();
        this.c = dopmVar;
        this.e = adgpVar;
        if (!(activity instanceof eg)) {
            throw new IllegalStateException("Check failed.");
        }
        this.a = (eg) activity;
        this.d = fctd.a(new fdae() { // from class: doqm
            @Override // defpackage.fdae
            public final Object invoke() {
                Intent launchIntentForPackage = this.a.a.getPackageManager().getLaunchIntentForPackage("com.google.android.apps.photos");
                launchIntentForPackage.getClass();
                return launchIntentForPackage;
            }
        });
    }

    private final Intent d() {
        return (Intent) this.d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r8, int r9, int r10, defpackage.dooy r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.doqo
            if (r0 == 0) goto L13
            r0 = r12
            doqo r0 = (defpackage.doqo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            doqo r0 = new doqo
            r0.<init>(r7, r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.a
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            defpackage.fctl.b(r12)
            goto L56
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L30:
            defpackage.fctl.b(r12)
            eg r12 = r7.a
            java.lang.String r8 = r12.getString(r8)
            r8.getClass()
            java.lang.String r3 = r12.getString(r9)
            r3.getClass()
            java.lang.String r4 = r12.getString(r10)
            r4.getClass()
            r6.c = r2
            r1 = r7
            r2 = r8
            r5 = r11
            java.lang.Object r12 = r1.b(r2, r3, r4, r5, r6)
            if (r12 != r0) goto L56
            return r0
        L56:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            r12.booleanValue()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.doqr.a(int, int, int, dooy, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(final java.lang.String r8, java.lang.String r9, java.lang.String r10, defpackage.dooy r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.doqp
            if (r0 == 0) goto L13
            r0 = r12
            doqp r0 = (defpackage.doqp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            doqp r0 = new doqp
            r0.<init>(r7, r12)
        L18:
            r5 = r0
            java.lang.Object r12 = r5.a
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.c
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            dooy r11 = r5.d
            defpackage.fctl.b(r12)
            goto L53
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            defpackage.fctl.b(r12)
            adgp r12 = r7.e
            doqb r1 = new doqb
            r1.<init>(r11)
            r12.c(r1)
            eg r1 = r7.a
            doqn r4 = new doqn
            r4.<init>()
            r5.d = r11
            r5.c = r2
            r6 = 4
            r2 = r9
            r3 = r10
            java.lang.Object r12 = defpackage.dphc.a(r1, r2, r3, r4, r5, r6)
            if (r12 == r0) goto L72
        L53:
            r8 = r12
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L67
            adgp r8 = r7.e
            dopz r9 = new dopz
            r9.<init>(r11)
            r8.c(r9)
            return r12
        L67:
            adgp r8 = r7.e
            doqa r9 = new doqa
            r9.<init>(r11)
            r8.c(r9)
            return r12
        L72:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.doqr.b(java.lang.String, java.lang.String, java.lang.String, dooy, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bf, code lost:
    
        if (defpackage.dpgw.b(r15, r14, r6) == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0115, code lost:
    
        if (defpackage.dpgw.b(r15, r14, r6) == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0165, code lost:
    
        if (defpackage.dpgw.a(r15, "com.google.android.apps.photos", r6) != r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0175, code lost:
    
        if (r15 == r0) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.dlsu r13, defpackage.dooy r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.doqr.c(dlsu, dooy, fcxy):java.lang.Object");
    }
}
