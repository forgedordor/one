package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eajd {
    static dcff a(fbtf fbtfVar) {
        Status statusC = Status.c(fbtfVar);
        Status.Code code = Status.Code.OK;
        int iOrdinal = statusC.getCode().ordinal();
        return iOrdinal != 3 ? iOrdinal != 4 ? iOrdinal != 5 ? iOrdinal != 7 ? iOrdinal != 13 ? iOrdinal != 14 ? new dcff(new com.google.android.gms.common.api.Status(13, statusC.getDescription())) : new dcff(new com.google.android.gms.common.api.Status(7, statusC.getDescription())) : new dcff(new com.google.android.gms.common.api.Status(8, statusC.getDescription())) : new dcff(new com.google.android.gms.common.api.Status(9011, statusC.getDescription())) : new dcff(new com.google.android.gms.common.api.Status(9013, statusC.getDescription())) : new dcff(new com.google.android.gms.common.api.Status(15, statusC.getDescription())) : new dcff(new com.google.android.gms.common.api.Status(9012, statusC.getDescription()));
    }

    static dcff b(qzx qzxVar) {
        int i = qzxVar instanceof qzj ? 7 : qzxVar instanceof qzw ? 15 : ((qzxVar instanceof qzv) || (qzxVar instanceof qzm)) ? 8 : qzxVar instanceof qyx ? 9011 : 13;
        qzk qzkVar = qzxVar.a;
        return new dcff(new com.google.android.gms.common.api.Status(i, String.format("Unexpected server error (HTTP Code: %s. Message: %s.)", qzkVar == null ? "N/A" : String.valueOf(qzkVar.a), qzxVar)));
    }
}
