package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
class atag extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        enxi enxiVar = (enxi) obj;
        int iOrdinal = enxiVar.ordinal();
        if (iOrdinal == 12) {
            return aubi.GROUP_NOT_FOUND;
        }
        if (iOrdinal == 14) {
            return aubi.LOW_PRIORITY_MESSAGE_REJECTED;
        }
        if (iOrdinal == 15) {
            return aubi.TRANSPORT_INTERNAL_ERROR;
        }
        switch (iOrdinal) {
            case 0:
                return aubi.UNKNOWN_CAUSE;
            case 1:
                return aubi.TRANSPORT_GENERIC_ERROR;
            case 2:
                return aubi.NOT_CONNECTED;
            case 3:
                return aubi.GROUP_TOO_FEW_PARTICIPANTS;
            case 4:
                return aubi.GROUP_TOO_MANY_PARTICIPANTS;
            case 5:
                return aubi.USER_NOT_A_GROUP_PARTICIPANT;
            case 6:
                return aubi.INVALID_LOCAL_PARTICIPANT;
            case 7:
                return aubi.INVALID_REMOTE_PARTICIPANT;
            default:
                switch (iOrdinal) {
                    case 19:
                        return aubi.NETWORK_CONNECTION_ERROR;
                    case 20:
                        return aubi.NETWORK_PERMISSION_DENIED;
                    case 21:
                        return aubi.REMOTE_PARTICIPANT_NOT_RCS_CAPABLE;
                    case 22:
                        return aubi.TRANSPORT_UNAVAILABLE;
                    case 23:
                        return aubi.INVALID_REPLY_TO_CHAT_ENDPOINT;
                    case 24:
                        return aubi.INVALID_SELF_CHAT_ENDPOINT;
                    case 25:
                        return aubi.INVALID_OPAQUE_DATA;
                    case 26:
                        return aubi.INVALID_GROUP_TOKEN;
                    case 27:
                        return aubi.INVALID_SENDER_TOKEN;
                    default:
                        throw new IllegalArgumentException("unknown enum value: ".concat(enxiVar.toString()));
                }
        }
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        aubi aubiVar = (aubi) obj;
        switch (aubiVar) {
            case UNKNOWN_CAUSE:
                return enxi.CHAT_API_ERROR_CAUSE_UNKNOWN;
            case NOT_CONNECTED:
                return enxi.CHAT_API_TRANSPORT_NOT_CONNECTED;
            case GROUP_TOO_FEW_PARTICIPANTS:
                return enxi.CHAT_API_GROUP_TOO_FEW_PARTICIPANTS;
            case GROUP_TOO_MANY_PARTICIPANTS:
                return enxi.CHAT_API_GROUP_TOO_MANY_PARTICIPANTS;
            case USER_NOT_A_GROUP_PARTICIPANT:
                return enxi.CHAT_API_USER_NOT_A_GROUP_PARTICIPANT;
            case TRANSPORT_GENERIC_ERROR:
                return enxi.CHAT_API_GENERIC_TRANSPORT_ERROR;
            case INVALID_LOCAL_PARTICIPANT:
                return enxi.CHAT_API_INVALID_LOCAL_PARTICIPANT;
            case INVALID_REMOTE_PARTICIPANT:
                return enxi.CHAT_API_INVALID_REMOTE_PARTICIPANT;
            case GROUP_NOT_FOUND:
                return enxi.CHAT_API_GROUP_NOT_FOUND;
            case LOW_PRIORITY_MESSAGE_REJECTED:
                return enxi.CHAT_API_LOW_PRIORITY_MESSAGE_REJECTED;
            case TRANSPORT_INTERNAL_ERROR:
                return enxi.CHAT_API_TRANSPORT_INTERNAL_ERROR;
            case REMOTE_PARTICIPANT_NOT_RCS_CAPABLE:
                return enxi.CHAT_API_REMOTE_PARTICIPANT_NOT_RCS_CAPABLE;
            case NETWORK_CONNECTION_ERROR:
                return enxi.CHAT_API_NETWORK_CONNECTION_ERROR;
            case NETWORK_PERMISSION_DENIED:
                return enxi.CHAT_API_NETWORK_PERMISSION_DENIED;
            case TRANSPORT_UNAVAILABLE:
                return enxi.CHAT_API_TRANSPORT_UNAVAILABLE;
            case INVALID_REPLY_TO_CHAT_ENDPOINT:
                return enxi.CHAT_API_INVALID_REPLY_TO_CHAT_ENDPOINT;
            case INVALID_SELF_CHAT_ENDPOINT:
                return enxi.CHAT_API_INVALID_SELF_CHAT_ENDPOINT;
            case INVALID_OPAQUE_DATA:
                return enxi.CHAT_API_INVALID_OPAQUE_DATA;
            case INVALID_GROUP_TOKEN:
                return enxi.CHAT_API_INVALID_GROUP_TOKEN;
            case INVALID_SENDER_TOKEN:
                return enxi.CHAT_API_INVALID_SENDER_TOKEN;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(aubiVar.toString()));
        }
    }
}
