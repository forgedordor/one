package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpgw {
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        if (defpackage.dphg.a(r6, r7, new defpackage.dphd(), r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(final defpackage.eg r6, final java.lang.String r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof defpackage.dpgt
            if (r0 == 0) goto L13
            r0 = r8
            dpgt r0 = (defpackage.dpgt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dpgt r0 = new dpgt
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r8)
            goto L64
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.a
            defpackage.fctl.b(r8)
            goto L50
        L38:
            defpackage.fctl.b(r8)
            lvc r8 = r6.P()
            lva r2 = defpackage.lva.ON_PAUSE
            dpgs r5 = new dpgs
            r5.<init>()
            r0.a = r6
            r0.c = r4
            java.lang.Object r7 = defpackage.dphg.a(r8, r2, r5, r0)
            if (r7 == r1) goto L67
        L50:
            hl r6 = (defpackage.hl) r6
            lvc r6 = r6.P()
            lva r7 = defpackage.lva.ON_RESUME
            r8 = 0
            r0.a = r8
            r0.c = r3
            java.lang.Object r6 = defpackage.dphg.b(r6, r7, r0)
            if (r6 != r1) goto L64
            goto L67
        L64:
            fctx r6 = defpackage.fctx.a
            return r6
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpgw.a(eg, java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        if (defpackage.dphg.a(r6, r7, new defpackage.dphd(), r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(final defpackage.eg r6, final android.content.Intent r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof defpackage.dpgu
            if (r0 == 0) goto L13
            r0 = r8
            dpgu r0 = (defpackage.dpgu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dpgu r0 = new dpgu
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r8)
            goto L64
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.a
            defpackage.fctl.b(r8)
            goto L50
        L38:
            defpackage.fctl.b(r8)
            lvc r8 = r6.P()
            lva r2 = defpackage.lva.ON_PAUSE
            dpgr r5 = new dpgr
            r5.<init>()
            r0.a = r6
            r0.c = r4
            java.lang.Object r7 = defpackage.dphg.a(r8, r2, r5, r0)
            if (r7 == r1) goto L67
        L50:
            hl r6 = (defpackage.hl) r6
            lvc r6 = r6.P()
            lva r7 = defpackage.lva.ON_RESUME
            r8 = 0
            r0.a = r8
            r0.c = r3
            java.lang.Object r6 = defpackage.dphg.b(r6, r7, r0)
            if (r6 != r1) goto L64
            goto L67
        L64:
            fctx r6 = defpackage.fctx.a
            return r6
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpgw.b(eg, android.content.Intent, fcxy):java.lang.Object");
    }

    public static final fctx c(eg egVar, String str) {
        try {
            egVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(a.v(str, "market://details?id="))));
        } catch (ActivityNotFoundException unused) {
            egVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=".concat(String.valueOf(str)))));
        }
        return fctx.a;
    }

    public static /* synthetic */ Object d(eg egVar, String str, adx adxVar, Object obj, fcxy fcxyVar) {
        fdiu fdiuVar = new fdiu(fcym.c(fcxyVar), 1);
        fdiuVar.B();
        egVar.h.b(str, adxVar, new dpgv(fdiuVar)).a(obj, null);
        Object objM = fdiuVar.m();
        if (objM == fcyl.a) {
            fcxyVar.getClass();
        }
        return objM;
    }
}
