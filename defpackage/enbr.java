package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enbr implements evsv {
    static final evsv a = new enbr();

    private enbr() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        enbs enbsVar;
        switch (i) {
            case 0:
                enbsVar = enbs.UNSPECIFIED;
                break;
            case 1:
                enbsVar = enbs.GENERATE_KEY_PACKAGES;
                break;
            case 2:
                enbsVar = enbs.CREATE_GROUP_AND_ADD_MEMBERS;
                break;
            case 3:
                enbsVar = enbs.ENCRYPT_PLAINTEXT;
                break;
            case 4:
                enbsVar = enbs.ENCRYPT_BYTES;
                break;
            case 5:
                enbsVar = enbs.PROCESS_MESSAGE;
                break;
            case 6:
                enbsVar = enbs.REMOVE_OTHER_MEMBERS_FROM_GROUP;
                break;
            case 7:
                enbsVar = enbs.PROPOSE_REMOVE_SELF;
                break;
            case 8:
                enbsVar = enbs.ADD_MEMBERS_TO_GROUP;
                break;
            case 9:
                enbsVar = enbs.GENERATE_DELIVERY_RECEIPT_SIGNATURE;
                break;
            case 10:
                enbsVar = enbs.PROCESS_POSITIVE_DELIVERY_RECEIPT;
                break;
            case 11:
                enbsVar = enbs.PROCESS_NEGATIVE_DELIVERY_RECEIPT;
                break;
            case 12:
                enbsVar = enbs.GENERATE_DISPLAY_RECEIPT_SIGNATURE;
                break;
            case 13:
                enbsVar = enbs.PROCESS_DISPLAY_RECEIPT;
                break;
            case 14:
                enbsVar = enbs.DELETE_GROUP;
                break;
            case 15:
                enbsVar = enbs.RUN_MAINTENANCE;
                break;
            case 16:
                enbsVar = enbs.APPLY_END_MLS;
                break;
            case 17:
                enbsVar = enbs.GET_GROUP_STATUS;
                break;
            case 18:
                enbsVar = enbs.GET_ZINNIA_STATE_REPRESENTATION;
                break;
            case 19:
                enbsVar = enbs.APPLY_REVIVE_MLS;
                break;
            case 20:
                enbsVar = enbs.MAYBE_REFRESH;
                break;
            case 21:
                enbsVar = enbs.GET_EXPIRED_MEMBERS;
                break;
            case 22:
                enbsVar = enbs.SYNC_MLS_MEMBERSHIP;
                break;
            default:
                enbsVar = null;
                break;
        }
        return enbsVar != null;
    }
}
