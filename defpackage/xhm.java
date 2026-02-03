package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xhm {
    static final /* synthetic */ xhm a = new xhm();
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/ShortcutHandler$Companion");

    private xhm() {
    }

    public static final Object b(lwn lwnVar, String str, afzc afzcVar, String str2, fdae fdaeVar, fcxy fcxyVar) {
        if (!fdbq.f(lwnVar.b(str), true)) {
            return null;
        }
        fdaeVar.invoke();
        lwnVar.d(str, false);
        return afzcVar.f(new agfi(str2), fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.lwn r5, java.lang.String r6, defpackage.afzc r7, java.lang.String r8, defpackage.fdae r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r10 instanceof defpackage.xhl
            if (r0 == 0) goto L13
            r0 = r10
            xhl r0 = (defpackage.xhl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            xhl r0 = new xhl
            r0.<init>(r4, r10)
        L18:
            r10 = r0
            java.lang.Object r0 = r10.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r10.c
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.fctl.b(r0)
            goto L3b
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            defpackage.fctl.b(r0)
            r10.c = r3
            java.lang.Object r0 = b(r5, r6, r7, r8, r9, r10)
            if (r0 == r1) goto L52
        L3b:
            adh r0 = (defpackage.adh) r0
            r5 = 0
            if (r0 == 0) goto L51
            android.content.Intent r6 = r0.b
            if (r6 == 0) goto L51
            int r7 = r0.a
            r8 = -1
            if (r7 != r8) goto L4a
            goto L4b
        L4a:
            r6 = r5
        L4b:
            if (r6 == 0) goto L51
            android.net.Uri r5 = r6.getData()
        L51:
            return r5
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xhm.a(lwn, java.lang.String, afzc, java.lang.String, fdae, fcxy):java.lang.Object");
    }
}
