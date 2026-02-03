package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elhz implements evsv {
    static final evsv a = new elhz();

    private elhz() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        elia eliaVar;
        switch (i) {
            case 0:
                eliaVar = elia.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_UNKNOWN;
                break;
            case 1:
                eliaVar = elia.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_GENERIC;
                break;
            case 2:
                eliaVar = elia.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_MESSAGES_FAIL_TO_SEND;
                break;
            case 3:
                eliaVar = elia.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_MESSAGES_FAIL_TO_RECEIVE;
                break;
            case 4:
                eliaVar = elia.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_MESSAGES_FAIL_TO_DOWNLOAD;
                break;
            case 5:
                eliaVar = elia.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_MESSAGES_STUCK_IN_SENDING;
                break;
            case 6:
                eliaVar = elia.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_MESSAGES_DUPLICATED;
                break;
            case 7:
                eliaVar = elia.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_MESSAGES_OUT_OF_ORDER;
                break;
            case 8:
                eliaVar = elia.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_MESSAGES_IN_WRONG_CONVERSATION;
                break;
            case 9:
                eliaVar = elia.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_RCS_CONNECTIVITY_LOST;
                break;
            case 10:
                eliaVar = elia.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_RCS_PROVISIONING_FAIL;
                break;
            case 11:
                eliaVar = elia.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_MESSAGES_LOST;
                break;
            default:
                eliaVar = null;
                break;
        }
        return eliaVar != null;
    }
}
