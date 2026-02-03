package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cigi extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        emfo emfoVar = (emfo) obj;
        int iOrdinal = emfoVar.ordinal();
        if (iOrdinal == 0) {
            return ciut.UNKNOWN_PARSE_ERROR;
        }
        if (iOrdinal == 1) {
            return ciut.NO_RECIPIENT_IDS_FOR_THREAD_ID;
        }
        if (iOrdinal == 2) {
            return ciut.MULTIPLE_RECIPIENT_IDS_RETURNED;
        }
        if (iOrdinal == 3) {
            return ciut.MULTIPLE_RECIPIENTS_PARSED;
        }
        if (iOrdinal == 4) {
            return ciut.INVALID_RECIPIENT_ADDRESS_FORMAT;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(emfoVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        ciut ciutVar = (ciut) obj;
        int iOrdinal = ciutVar.ordinal();
        if (iOrdinal == 0) {
            return emfo.UNKNOWN_RCS_GROUP_TELEPHONY_DATA_FAILURE_REASON;
        }
        if (iOrdinal == 1) {
            return emfo.NO_RECIPIENT_IDS_FOR_THREAD_ID;
        }
        if (iOrdinal == 2) {
            return emfo.MULTIPLE_RECIPIENT_IDS_RETURNED;
        }
        if (iOrdinal == 3) {
            return emfo.MULTIPLE_RECIPIENTS_PARSED;
        }
        if (iOrdinal == 4) {
            return emfo.INVALID_RECIPIENT_ADDRESS_FORMAT;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(ciutVar.toString()));
    }
}
