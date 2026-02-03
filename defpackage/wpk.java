package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wpk {
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/processor/SpatulaProcessor");
    public final fcyh a;
    public final fcsu b;
    private final fdjx d;
    private final efwo e;
    private final fcsu f;

    public wpk(fcyh fcyhVar, fdjx fdjxVar, efwo efwoVar, fcsu fcsuVar, fcsu fcsuVar2) {
        fcyhVar.getClass();
        fdjxVar.getClass();
        efwoVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.a = fcyhVar;
        this.d = fdjxVar;
        this.e = efwoVar;
        this.b = fcsuVar;
        this.f = fcsuVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.wpi
            if (r0 == 0) goto L13
            r0 = r6
            wpi r0 = (defpackage.wpi) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wpi r0 = new wpi
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            defpackage.fctl.b(r6)
            goto L52
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L30:
            defpackage.fctl.b(r6)
            boolean r6 = defpackage.crtr.e()
            if (r6 != 0) goto L3f
            boolean r6 = defpackage.crtr.g()
            if (r6 == 0) goto L59
        L3f:
            fcsu r6 = r5.f
            java.lang.Object r6 = r6.b()
            csmf r6 = (defpackage.csmf) r6
            efwo r2 = r5.e
            r0.c = r4
            java.lang.Object r6 = r6.c(r2, r0)
            if (r6 != r1) goto L52
            return r1
        L52:
            csmb r6 = (defpackage.csmb) r6
            boolean r6 = r6.a
            if (r6 == 0) goto L59
            r3 = r4
        L59:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wpk.a(fcxy):java.lang.Object");
    }

    public final fdkf b(doif doifVar, Uri uri) {
        ekrw ekrwVarG = c.g();
        ekrwVarG.X(eksq.a, "BugleComposeRow2");
        ((ekrd) ekrwVarG.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/processor/SpatulaProcessor", "invokeSpatulaClassification", 83, "SpatulaProcessor.kt")).D("Initiating Spatula classfication for [%s] of mediaType [%s]", uri, doifVar);
        if (fdbq.f(doifVar, doid.a)) {
            if (crtr.e()) {
                fdjx fdjxVar = this.d;
                fcyi fcyiVar = fcyi.a;
                return fdin.b(fdjxVar, eicg.a(fcyiVar), fdjz.a, new wpg(null, this, uri));
            }
        } else if (fdbq.f(doifVar, doie.a) && crtr.g()) {
            fdjx fdjxVar2 = this.d;
            fcyi fcyiVar2 = fcyi.a;
            return fdin.b(fdjxVar2, eicg.a(fcyiVar2), fdjz.a, new wph(null, this, uri));
        }
        return null;
    }
}
