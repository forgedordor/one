package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xgm implements xgc {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/cameragallery/SelfieGifUiAdapterImpl");
    public final fdjx b;
    public final Context c;
    public final dmdo d;
    public final ahax e;
    public final dmcd f;
    public final fcsu g;
    public ahat h;
    public boolean i;
    public boolean j;
    public final zud k;
    private final fcyh l;
    private final crma m;
    private final afzc n;

    public xgm(fdjx fdjxVar, fcyh fcyhVar, Context context, dmdo dmdoVar, ahax ahaxVar, dmcd dmcdVar, fcsu fcsuVar, crma crmaVar, afzc afzcVar, zud zudVar) {
        fdjxVar.getClass();
        fcyhVar.getClass();
        context.getClass();
        dmdoVar.getClass();
        ahaxVar.getClass();
        fcsuVar.getClass();
        crmaVar.getClass();
        afzcVar.getClass();
        zudVar.getClass();
        this.b = fdjxVar;
        this.l = fcyhVar;
        this.c = context;
        this.d = dmdoVar;
        this.e = ahaxVar;
        this.f = dmcdVar;
        this.g = fcsuVar;
        this.m = crmaVar;
        this.n = afzcVar;
        this.k = zudVar;
    }

    @Override // defpackage.xgc
    public final Object a(int i, fcxy fcxyVar) {
        return fdin.a(this.l, new xgk(this, i, null), fcxyVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        if (c(r8, com.google.android.apps.messaging.R.string.selfie_gif_camera_permission_denied_text, r0) != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.xgd
            if (r0 == 0) goto L13
            r0 = r8
            xgd r0 = (defpackage.xgd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            xgd r0 = new xgd
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            defpackage.fctl.b(r8)
            goto L6b
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            defpackage.fctl.b(r8)
            goto L55
        L37:
            defpackage.fctl.b(r8)
            crma r8 = r7.m
            boolean r8 = r8.e()
            if (r8 == 0) goto L44
        L42:
            r3 = r5
            goto L6b
        L44:
            afzc r8 = r7.n
            agff r2 = new agff
            crmc r6 = defpackage.crmc.CAMERA_PERMISSIONS
            r2.<init>(r6)
            r0.c = r5
            java.lang.Object r8 = r8.f(r2, r0)
            if (r8 == r1) goto L70
        L55:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L5e
            goto L42
        L5e:
            android.content.Context r8 = r7.c
            r0.c = r4
            r2 = 2132087367(0x7f151247, float:1.9814987E38)
            java.lang.Object r8 = r7.c(r8, r2, r0)
            if (r8 == r1) goto L70
        L6b:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xgm.b(fcxy):java.lang.Object");
    }

    public final Object c(Context context, int i, fcxy fcxyVar) {
        Object objA = fdin.a(this.b.hE(), new xgl(context, i, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }
}
