package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_MessageReceipt;
import com.google.android.rcs.client.messaging.data.MessageReceipt;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccqf implements cbud {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/e2ee/mls/incoming/MlsIncomingImdnProcessor");
    public final awlc b;
    public final ccaq c;
    public final ccrj d;
    public final arnr e;
    private final ccpm f;
    private final cbun g;
    private final fcyh h;

    public ccqf(ccpm ccpmVar, cbun cbunVar, awlc awlcVar, ccaq ccaqVar, ccer ccerVar, ccrj ccrjVar, arnr arnrVar, fcyh fcyhVar) {
        ccpmVar.getClass();
        cbunVar.getClass();
        awlcVar.getClass();
        ccerVar.getClass();
        ccrjVar.getClass();
        fcyhVar.getClass();
        this.f = ccpmVar;
        this.g = cbunVar;
        this.b = awlcVar;
        this.c = ccaqVar;
        this.d = ccrjVar;
        this.e = arnrVar;
        this.h = fcyhVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final evqs e(atys atysVar) {
        eyga eygaVar = ((atuy) atysVar).a.l;
        if (eygaVar == null) {
            eygaVar = eyga.a;
        }
        eygaVar.getClass();
        String str = civa.MLS_NAMESPACE.q;
        if (!eygaVar.b(str)) {
            return null;
        }
        eyge eygeVar = eyge.a;
        str.getClass();
        evub evubVar = eygaVar.b;
        if (evubVar.containsKey(str)) {
            eygeVar = (eyge) evubVar.get(str);
        }
        if (eygeVar == null || !eygeVar.b("MLS-Derived-Content-Signature")) {
            return null;
        }
        evub evubVar2 = eygeVar.b;
        String str2 = evubVar2.containsKey("MLS-Derived-Content-Signature") ? (String) evubVar2.get("MLS-Derived-Content-Signature") : "";
        if (str2 == null || str2.length() == 0) {
            return null;
        }
        return evqs.x(eldz.e.k(str2));
    }

    @Override // defpackage.cbud
    public final Object a(atys atysVar, MessageReceipt messageReceipt, fcxy fcxyVar) {
        String str = ((atuy) atysVar).a.j;
        str.getClass();
        aubx aubxVar = atysVar.e().c;
        if (aubxVar == null) {
            aubxVar = aubx.a;
        }
        aubxVar.getClass();
        ekrg ekrgVar = a;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "BugleE2eeMls");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrz ekrzVar2 = cqnc.e;
        ekrdVar.X(ekrzVar2, str);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/mls/incoming/MlsIncomingImdnProcessor", "process", 73, "MlsIncomingImdnProcessor.kt")).t("Processing an incoming MLS IMDN message with content type: %s", aubxVar);
        AutoValue_MessageReceipt autoValue_MessageReceipt = (AutoValue_MessageReceipt) messageReceipt;
        efkk efkkVar = autoValue_MessageReceipt.a;
        efkj efkjVar = efkj.INCORRECT_ERA;
        efki efkiVar = efki.MESSAGE_FROM_NON_MEMBER;
        int iOrdinal = efkkVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return b(messageReceipt, atysVar, str, fcxyVar);
            }
            ekrw ekrwVarJ = ekrgVar.j();
            ekrwVarJ.X(ekrzVar, "BugleE2eeMls");
            ekrd ekrdVar2 = (ekrd) ekrwVarJ;
            ekrdVar2.X(ekrzVar2, str);
            ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/e2ee/mls/incoming/MlsIncomingImdnProcessor", "process", 83, "MlsIncomingImdnProcessor.kt")).t("Processing an incoming MLS IMDN message with unsupported receipt type %s. Drops it.", efkkVar.name());
            if (this.e.a()) {
                ccrj.c(this.d, str, efkkVar, atav.FAIL_NO_RETRY, autoValue_MessageReceipt.b, 0, null, 0, 2, 112);
            }
            return atav.FAIL_NO_RETRY;
        }
        String str2 = autoValue_MessageReceipt.c;
        if (str2.equals("delivered")) {
            return d(messageReceipt, atysVar, str, fcxyVar);
        }
        if (str2.equals("failed")) {
            return c(messageReceipt, atysVar, str, fcxyVar);
        }
        ekrw ekrwVarJ2 = ekrgVar.j();
        ekrwVarJ2.X(ekrzVar, "BugleE2eeMls");
        ekrd ekrdVar3 = (ekrd) ekrwVarJ2;
        ekrdVar3.X(ekrzVar2, str);
        ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/e2ee/mls/incoming/MlsIncomingImdnProcessor", "processImdnDeliveryMessage", 114, "MlsIncomingImdnProcessor.kt")).t("Received an incoming MLS delivery IMDN with an invalid status. Status: %s. Drops it.", str2);
        if (this.e.a()) {
            ccrj.c(this.d, str, efkkVar, atav.FAIL_NO_RETRY, autoValue_MessageReceipt.b, 0, null, 0, 3, 112);
        }
        return atav.FAIL_NO_RETRY;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.google.android.rcs.client.messaging.data.MessageReceipt r18, defpackage.atys r19, java.lang.String r20, defpackage.fcxy r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccqf.b(com.google.android.rcs.client.messaging.data.MessageReceipt, atys, java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.android.rcs.client.messaging.data.MessageReceipt r17, defpackage.atys r18, java.lang.String r19, defpackage.fcxy r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccqf.c(com.google.android.rcs.client.messaging.data.MessageReceipt, atys, java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.google.android.rcs.client.messaging.data.MessageReceipt r19, defpackage.atys r20, java.lang.String r21, defpackage.fcxy r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccqf.d(com.google.android.rcs.client.messaging.data.MessageReceipt, atys, java.lang.String, fcxy):java.lang.Object");
    }
}
