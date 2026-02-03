package defpackage;

import com.google.communication.synapse.security.scytale.ReceiptInfo;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwjh {
    private static final cqce a = cqce.g("BugleE2eeEtouffee", "ReceiptInfos");

    public static ReceiptInfo a(evqs evqsVar) {
        return b((eyfv) evsn.parseFrom(eyfv.a, evqsVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.communication.synapse.security.scytale.ReceiptInfo b(defpackage.eyfv r6) {
        /*
            com.google.communication.synapse.security.scytale.ReceiptInfo r0 = new com.google.communication.synapse.security.scytale.ReceiptInfo
            java.lang.String r1 = r6.c
            int r2 = r6.d
            eyfu r2 = defpackage.eyfu.b(r2)
            if (r2 != 0) goto Le
            eyfu r2 = defpackage.eyfu.UNKNOWN
        Le:
            int r3 = r2.ordinal()
            if (r3 == 0) goto L41
            r4 = 1
            if (r3 == r4) goto L3e
            r4 = 2
            if (r3 == r4) goto L3b
            r4 = 3
            if (r3 == r4) goto L38
            r4 = 4
            if (r3 == r4) goto L41
            cqce r3 = defpackage.bwjh.a
            cqbd r3 = r3.e()
            java.lang.String r4 = "Unknown ReceiptInfo.Error value"
            r3.I(r4)
            int r2 = r2.f
            java.lang.String r4 = "error"
            r3.y(r4, r2)
            r3.r()
            com.google.communication.synapse.security.scytale.ReceiptError r2 = com.google.communication.synapse.security.scytale.ReceiptError.UNKNOWN
            goto L43
        L38:
            com.google.communication.synapse.security.scytale.ReceiptError r2 = com.google.communication.synapse.security.scytale.ReceiptError.OTK_NOT_TARGETED_TO_ME
            goto L43
        L3b:
            com.google.communication.synapse.security.scytale.ReceiptError r2 = com.google.communication.synapse.security.scytale.ReceiptError.FAILED_TO_DECRYPT
            goto L43
        L3e:
            com.google.communication.synapse.security.scytale.ReceiptError r2 = com.google.communication.synapse.security.scytale.ReceiptError.SUCCESS
            goto L43
        L41:
            com.google.communication.synapse.security.scytale.ReceiptError r2 = com.google.communication.synapse.security.scytale.ReceiptError.UNKNOWN
        L43:
            r4 = r2
            evqs r6 = r6.e
            byte[] r5 = r6.I()
            r2 = 0
            r0.<init>(r1, r2, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwjh.b(eyfv):com.google.communication.synapse.security.scytale.ReceiptInfo");
    }
}
