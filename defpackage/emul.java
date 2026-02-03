package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emul implements evsv {
    static final evsv a = new emul();

    private emul() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        emum emumVar;
        switch (i) {
            case 0:
                emumVar = emum.UNKNOWN_TRIGGER;
                break;
            case 1:
                emumVar = emum.PERIODIC_JOB_BASED_ON_TELEPHONY;
                break;
            case 2:
                emumVar = emum.RECEIVE_SMS_MESSAGE_HELPER;
                break;
            case 3:
                emumVar = emum.PROCESS_DOWNLOADED_MMS_ACTION_THREAD_DATA_RECIPIENTS;
                break;
            case 4:
                emumVar = emum.PROCESS_DOWNLOADED_MMS_ACTION_TELEPHONY_MANAGER_ADDRESSES;
                break;
            case 5:
                emumVar = emum.RECEIVE_MMS_MESSAGE_USE_SENDER_RAW;
                break;
            case 6:
                emumVar = emum.RECEIVE_MMS_MESSAGE_USE_SENDER_NORMALIZED;
                break;
            case 7:
                emumVar = emum.RECEIVE_MMS_MESSAGE_USE_THREAD_DATA_RECIPIENTS;
                break;
            case 8:
                emumVar = emum.RECEIVE_RCS_MESSAGE_ONE_ON_ONE;
                break;
            case 9:
                emumVar = emum.RECEIVE_RCS_MESSAGE_ONE_ON_ONE_LEGACY;
                break;
            case 10:
                emumVar = emum.RECEIVE_RCS_MESSAGE_ONE_ON_ONE_ALTOGETHER;
                break;
            case 11:
                emumVar = emum.PROCESS_DOWNLOADED_MMS_ACTION_MESSAGE_RECIPIENTS;
                break;
            case 12:
                emumVar = emum.GET_OR_CREATE_THREAD_ID_FOR_CONVERSATION;
                break;
            default:
                emumVar = null;
                break;
        }
        return emumVar != null;
    }
}
