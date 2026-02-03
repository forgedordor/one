package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epvd {
    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 2:
                return "ZINNIA_FAILURE_REASON_UNSPECIFIED";
            case 3:
                return "ZINNIA_FAILURE_END_MLS_ONGOING";
            case 4:
                return "ZINNIA_FAILURE_INVALID_EPOCH_COMMIT";
            case 5:
                return "ZINNIA_FAILURE_INVALID_EPOCH_PROPOSAL";
            case 6:
                return "ZINNIA_FAILURE_REPLAYED_COMMIT";
            case 7:
                return "ZINNIA_FAILURE_SELF_HEAL_ONGOING";
            case 8:
                return "ZINNIA_FAILURE_EPOCH_SELF_HEAL_RETRY_LIMIT_REACHED";
            case 9:
                return "ZINNIA_FAILURE_REASON_COMMIT_PROCESSING_ERROR";
            case 10:
                return "ZINNIA_FAILURE_REASON_PROPOSAL_PROCESSING_ERROR";
            case 11:
                return "ZINNIA_FAILURE_DELIVERY_RECEIPT_VALIDATION_ERROR";
            case 12:
                return "ZINNIA_FAILURE_DISPLAY_RECEIPT_VALIDATION_ERROR";
            case 13:
                return "ZINNIA_FAILURE_MESSAGE_CONTENT_NOT_FOUND";
            case 14:
                return "ZINNIA_FAILURE_FTD_RETRY_LIMIT_EXCEEDED";
            case 15:
                return "ZINNIA_FAILURE_SELF_HEAL_FAILED_NO_LONGER_IN_GROUP";
            case 16:
                return "ZINNIA_FAILURE_REPLAYED_MESSAGE";
            case 17:
                return "ZINNIA_FAILURE_GROUP_NOT_FOUND";
            case 18:
                return "ZINNIA_FAILURE_CANNOT_PARSE_MESSAGE";
            case 19:
                return "ZINNIA_FAILURE_CANNOT_PARSE_GROUP_INFO_MESSAGE";
            case 20:
                return "ZINNIA_FAILURE_CANNOT_PARSE_KEY_PACKAGES";
            case 21:
                return "ZINNIA_FAILURE_MLS_SYNC_CANNOT_ADD_MEMBERS";
            case 22:
                return "ZINNIA_FAILURE_CANNOT_PARSE_COMMIT_MESSAGE";
            case 23:
                return "ZINNIA_FAILURE_CANNOT_REVIVE_PLACEHOLDER_GROUP";
            default:
                return "UNRECOGNIZED";
        }
    }

    public static int b(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int c(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            case 12:
                return 14;
            case 13:
                return 15;
            case 14:
                return 16;
            case 15:
                return 17;
            case 16:
                return 18;
            case 17:
                return 19;
            case 18:
                return 20;
            case 19:
                return 21;
            case 20:
                return 22;
            case 21:
                return 23;
            default:
                return 0;
        }
    }
}
