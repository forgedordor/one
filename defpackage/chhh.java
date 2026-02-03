package defpackage;

import android.os.Bundle;
import com.google.android.rcs.client.messaging.data.ContentType;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chhh implements chgn {
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/shared/pipeline/rcs/send/report/SendRcsReportPipeline");
    public final fcsu a;
    public final fcsu b;
    private final cgxw d;
    private final auau e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final fcsu j;
    private final aryr k;
    private final fcyh l;
    private final atal m;

    public chhh(cgxw cgxwVar, asrh asrhVar, auau auauVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, aryr aryrVar, fcyh fcyhVar) {
        cgxwVar.getClass();
        asrhVar.getClass();
        auauVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcyhVar.getClass();
        this.d = cgxwVar;
        this.e = auauVar;
        this.a = fcsuVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.b = fcsuVar4;
        this.h = fcsuVar5;
        this.i = fcsuVar6;
        this.j = fcsuVar7;
        this.k = aryrVar;
        this.l = fcyhVar;
        this.m = new atal();
    }

    @Override // defpackage.chgn
    public final aubt a(Bundle bundle) {
        String string = bundle.getString("chat.extra.customDeliveryReceiptContentType");
        byte[] byteArray = bundle.getByteArray("chat.extra.customDeliveryReceipt");
        if (string == null && byteArray == null) {
            return null;
        }
        if (string == null || byteArray == null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Object objFM = this.m.fH().fM(ContentType.e(string));
        objFM.getClass();
        ekrw ekrwVarE = c.e();
        ekrwVarE.X(eksq.a, "BugleSending");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/pipeline/rcs/send/report/SendRcsReportPipeline", "getPreSerializedContentFromBundle", 258, "SendRcsReportPipeline.kt")).q("SendRcsReportPipeline: extracted custom delivery receipt from additional message details");
        aubs aubsVar = (aubs) aubt.a.createBuilder();
        aubsVar.getClass();
        aubu.c((aubx) objFM, aubsVar);
        aubu.b(evqs.x(byteArray), aubsVar);
        return aubu.a(aubsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0214 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // defpackage.chgn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r21, defpackage.aubq r22, defpackage.auhk r23, defpackage.elny r24, defpackage.audu r25, android.os.Bundle r26, defpackage.fcxy r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chhh.b(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, aubq, auhk, elny, audu, android.os.Bundle, fcxy):java.lang.Object");
    }

    @Override // defpackage.chgn
    public final Object c(auib auibVar, aubq aubqVar, axcm axcmVar, Instant instant, chbs chbsVar, eyga eygaVar, basd basdVar, boolean z, cbqz cbqzVar, aubt aubtVar, auhk auhkVar, elny elnyVar, Bundle bundle, fcxy fcxyVar) {
        auib auibVar2;
        String str = auibVar != null ? auibVar.c : null;
        if (str == null || str.length() == 0) {
            Object objB = this.f.b();
            objB.getClass();
            fhaz fhazVarA = cqdr.a();
            fhazVarA.getClass();
            auibVar2 = (auib) ejvk.a((ejvj) objB, fhazVarA);
        } else {
            auibVar2 = auibVar;
        }
        if (((aryo) this.j.b()).a()) {
            if (axcmVar == null) {
                throw new IllegalStateException("Required value was null.");
            }
        } else if (aubqVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        return e(new chgt(auibVar2, aubqVar, axcmVar, instant, chbsVar, eygaVar, basdVar, auhkVar, this.e.a(), z, cbqzVar, aubtVar, elnyVar, bundle, null, null), auibVar, basdVar, auhkVar, fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.chhd
            if (r0 == 0) goto L13
            r0 = r7
            chhd r0 = (defpackage.chhd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            chhd r0 = new chhd
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r7)
            goto L69
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fctl.b(r7)
            j$.util.Optional r7 = r6.ah()
            java.lang.Object r7 = defpackage.fdct.b(r7)
            alqm r7 = (defpackage.alqm) r7
            if (r7 == 0) goto L54
            j$.util.Optional r2 = r7.e()
            if (r2 == 0) goto L54
            boolean r2 = r2.isPresent()
            if (r2 == r3) goto L4b
            goto L54
        L4b:
            j$.util.Optional r6 = r7.e()
            java.lang.Object r6 = r6.get()
            return r6
        L54:
            java.lang.String r6 = r6.aB()
            fcyh r7 = r5.l
            chhe r2 = new chhe
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.c = r3
            java.lang.Object r7 = defpackage.eicj.a(r7, r2, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chhh.d(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.chgt r11, defpackage.auib r12, defpackage.basd r13, defpackage.auhk r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chhh.e(chgt, auib, basd, auhk, fcxy):java.lang.Object");
    }
}
