package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emcc implements evsv {
    static final evsv a = new emcc();

    private emcc() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        emcd emcdVar;
        switch (i) {
            case 0:
                emcdVar = emcd.UNSPECIFIED_BACKUP_TYPE;
                break;
            case 1:
                emcdVar = emcd.MESSAGE_BACKUP;
                break;
            case 2:
                emcdVar = emcd.CONVERSATION_BACKUP;
                break;
            case 3:
                emcdVar = emcd.PARTICIPANT_BACKUP;
                break;
            case 4:
                emcdVar = emcd.KEY_BACKUP;
                break;
            case 5:
                emcdVar = emcd.PARTS_UPDATE;
                break;
            case 6:
                emcdVar = emcd.PARTS_RARE_UPDATE;
                break;
            case 7:
                emcdVar = emcd.PARTS_FREQ_UPDATE;
                break;
            case 8:
                emcdVar = emcd.PARTS_CUSTOM_PART_FLAG_URI_UPDATE;
                break;
            case 9:
                emcdVar = emcd.MESSAGE_UPDATE;
                break;
            case 10:
                emcdVar = emcd.CONVERSATION_FREQ_UPDATE;
                break;
            case 11:
                emcdVar = emcd.CONVERSATION_RARE_UPDATE;
                break;
            case 12:
                emcdVar = emcd.PARTICIPANT_RARE_UPDATE;
                break;
            case 13:
                emcdVar = emcd.MESSAGE_DELETE;
                break;
            case 14:
                emcdVar = emcd.CONVERSATION_DELETE;
                break;
            case 15:
                emcdVar = emcd.PARTICIPANT_DELETE;
                break;
            case 16:
                emcdVar = emcd.PARTS_DELETE;
                break;
            case 17:
                emcdVar = emcd.KEY_DELETE;
                break;
            case 18:
                emcdVar = emcd.SELF_PARTICIPANT_BACKUP;
                break;
            case 19:
                emcdVar = emcd.MEDIA_FULL_SIZE_BACKUP;
                break;
            case 20:
                emcdVar = emcd.MEDIA_COMPRESSED_SIZE_BACKUP;
                break;
            case 21:
                emcdVar = emcd.MEDIA_PROFILE_PHOTO_BACKUP;
                break;
            default:
                emcdVar = null;
                break;
        }
        return emcdVar != null;
    }
}
