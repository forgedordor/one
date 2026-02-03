package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emeb implements evsv {
    static final evsv a = new emeb();

    private emeb() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        emec emecVar;
        switch (i) {
            case 0:
                emecVar = emec.UNSPECIFIED_STAGE;
                break;
            case 1:
                emecVar = emec.RESTORE;
                break;
            case 2:
                emecVar = emec.RESTORE_BACKUP_KEY;
                break;
            case 3:
                emecVar = emec.RESTORE_ENCRYPTION_KEY;
                break;
            case 4:
                emecVar = emec.RESTORE_PARTICIPANT;
                break;
            case 5:
                emecVar = emec.RESTORE_CONVERSATION;
                break;
            case 6:
                emecVar = emec.RESTORE_MESSAGE;
                break;
            case 7:
                emecVar = emec.BACKUP;
                break;
            case 8:
                emecVar = emec.BLOCK_ON_INITIAL_BACKUP_PRECONDITIONS;
                break;
            case 9:
                emecVar = emec.OPTIMIZED_RESTORE;
                break;
            case 10:
                emecVar = emec.OPTIMIZED_RESTORE_BACKUP_KEY;
                break;
            case 11:
                emecVar = emec.OPTIMIZED_RESTORE_ENCRYPTION_KEY;
                break;
            case 12:
                emecVar = emec.OPTIMIZED_RESTORE_PARTICIPANT;
                break;
            case 13:
                emecVar = emec.OPTIMIZED_RESTORE_CONVERSATION;
                break;
            case 14:
                emecVar = emec.OPTIMIZED_RESTORE_MESSAGE;
                break;
            case 15:
                emecVar = emec.MEDIA_BACKUP;
                break;
            case 16:
                emecVar = emec.MEDIA_RESTORE;
                break;
            case 17:
                emecVar = emec.OPTIMIZED_BACKUP;
                break;
            default:
                emecVar = null;
                break;
        }
        return emecVar != null;
    }
}
