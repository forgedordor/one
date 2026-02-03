package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emae implements evsv {
    static final evsv a = new emae();

    private emae() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        emaf emafVar;
        switch (i) {
            case 0:
                emafVar = emaf.UNKNOWN_TRIGGER_SOURCE;
                break;
            case 1:
                emafVar = emaf.CREATE_GROUP_CHAT_COMPLETE_CALLBACK;
                break;
            case 2:
                emafVar = emaf.GROUP_NOTIFICATION;
                break;
            case 3:
                emafVar = emaf.GROUP_NOTIFICATION_VANILLA_RCS;
                break;
            case 4:
                emafVar = emaf.INCOMING_IS_COMPOSING;
                break;
            case 5:
                emafVar = emaf.INCOMING_GROUP_INVITE_HANDLER;
                break;
            case 6:
                emafVar = emaf.INCOMING_FILE_TRANSFER;
                break;
            case 7:
                emafVar = emaf.INCOMING_FILE_TRANSFER_VANILLA_RCS;
                break;
            case 8:
                emafVar = emaf.INCOMING_MESSAGE;
                break;
            case 9:
                emafVar = emaf.RESET_SESSION_ID_EVENT;
                break;
            case 10:
                emafVar = emaf.GROUP_SESSION_STARTED_EVENT;
                break;
            case 11:
                emafVar = emaf.TACHYGRAM_TO_CHAT_API_INCOMING_MESSAGE_ADAPTER;
                break;
            case 12:
                emafVar = emaf.MESSAGE_SENDING_THREAD_ID_VERIFICATION;
                break;
            case 13:
                emafVar = emaf.TACHYGRAM_GET_ROUTING_TOKEN;
                break;
            case 14:
                emafVar = emaf.GET_OR_CREATE_CONVERSATION_ACTION;
                break;
            case 15:
                emafVar = emaf.DITTO_GET_GROUP_CONVERSATION_ID;
                break;
            default:
                emafVar = null;
                break;
        }
        return emafVar != null;
    }
}
