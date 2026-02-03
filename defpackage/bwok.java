package defpackage;

import com.google.communication.synapse.security.scytale.ReceiptError;

/* compiled from: PG */
/* loaded from: classes7.dex */
abstract class bwok extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        bwow bwowVar = (bwow) obj;
        ReceiptError receiptError = ReceiptError.UNKNOWN;
        int iOrdinal = bwowVar.ordinal();
        if (iOrdinal == 0) {
            return ReceiptError.UNKNOWN;
        }
        if (iOrdinal == 1) {
            return ReceiptError.SUCCESS;
        }
        if (iOrdinal == 2) {
            return ReceiptError.FAILED_TO_DECRYPT;
        }
        if (iOrdinal == 3) {
            return ReceiptError.OTK_NOT_TARGETED_TO_ME;
        }
        if (iOrdinal == 4) {
            return c();
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(bwowVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        ReceiptError receiptError = (ReceiptError) obj;
        int iOrdinal = receiptError.ordinal();
        if (iOrdinal == 0) {
            return bwow.UNKNOWN_RECEIPT_ERROR;
        }
        if (iOrdinal == 1) {
            return bwow.SUCCESS;
        }
        if (iOrdinal == 2) {
            return bwow.FAILED_TO_DECRYPT;
        }
        if (iOrdinal == 3) {
            return bwow.OTK_NOT_TARGETED_TO_ME;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(receiptError.toString()));
    }

    public abstract ReceiptError c();
}
