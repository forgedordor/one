package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emnf implements evsv {
    static final evsv a = new emnf();

    private emnf() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        emng emngVar;
        switch (i) {
            case 0:
                emngVar = emng.BACKUP_TABLE_UNKNOWN;
                break;
            case 1:
                emngVar = emng.BACKUP_TABLE_METADATA;
                break;
            case 2:
                emngVar = emng.BACKUP_TABLE_MY_IDENTITIES;
                break;
            case 3:
                emngVar = emng.BACKUP_TABLE_PARTICIPANTS;
                break;
            case 4:
                emngVar = emng.BACKUP_TABLE_CONVERSATIONS;
                break;
            case 5:
                emngVar = emng.BACKUP_TABLE_CONVERSATION_PARTICIPANTS;
                break;
            case 6:
                emngVar = emng.BACKUP_TABLE_CONVERSATION_PINS;
                break;
            case 7:
                emngVar = emng.BACKUP_TABLE_MESSAGES;
                break;
            case 8:
                emngVar = emng.BACKUP_TABLE_PARTS;
                break;
            case 9:
                emngVar = emng.BACKUP_TABLE_MESSAGE_STARS;
                break;
            case 10:
                emngVar = emng.BACKUP_TABLE_MESSAGE_CAPTIONS;
                break;
            case 11:
                emngVar = emng.BACKUP_TABLE_MESSAGE_REACTIONS;
                break;
            case 12:
                emngVar = emng.BACKUP_TABLE_MESSAGE_REPLIES;
                break;
            case 13:
                emngVar = emng.BACKUP_TABLE_READ_REPORTS;
                break;
            case 14:
                emngVar = emng.BACKUP_TABLE_LINK_PREVIEWS;
                break;
            default:
                emngVar = null;
                break;
        }
        return emngVar != null;
    }
}
