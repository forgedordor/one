package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ewju implements evsv {
    static final evsv a = new ewju();

    private ewju() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        ewjv ewjvVar;
        switch (i) {
            case 0:
                ewjvVar = ewjv.UNKNOWN_CAPABILITY;
                break;
            case 1:
                ewjvVar = ewjv.RCSE_FILETRANSFER_CAPABILITY;
                break;
            case 2:
                ewjvVar = ewjv.RCSE_IMAGE_SHARE_CAPABILITY;
                break;
            case 3:
                ewjvVar = ewjv.RCSE_VIDEO_SHARE_CAPABILITY;
                break;
            case 4:
                ewjvVar = ewjv.RCSE_SOCIAL_PRESENCE_CAPABILITY;
                break;
            case 5:
                ewjvVar = ewjv.RCSE_CAPABILITY_PRESENCE_CAPABILITY;
                break;
            case 6:
                ewjvVar = ewjv.MMTEL_VOICECALLING_CAPABILITY;
                break;
            case 7:
                ewjvVar = ewjv.VIDEO_CAPABILITY;
                break;
            case 8:
                ewjvVar = ewjv.RCS_IPCALLING_CAPABILITY;
                break;
            case 9:
                ewjvVar = ewjv.RCS_VIDEOCALLINGONLY_CAPABILITY;
                break;
            case 10:
                ewjvVar = ewjv.RCS_FILETRANSFER_THUMBNAIL_CAPABILITY;
                break;
            case 11:
                ewjvVar = ewjv.RCS_LOCATION_PUSH_CAPABILITY;
                break;
            case 12:
                ewjvVar = ewjv.RCS_LOCATION_PULL_CAPABILITY;
                break;
            case 13:
                ewjvVar = ewjv.RCS_LOCATION_PULL_FT_CAPABILITY;
                break;
            case 14:
                ewjvVar = ewjv.BLACKBIRD_FULLY_INTEGRATED_MESSAGING_CAPABILITY;
                break;
            case 15:
                ewjvVar = ewjv.JIBE_STICKERS_CAPABILITY;
                break;
            case 16:
                ewjvVar = ewjv.RCS_POST_CALL_CAPABILITY;
                break;
            case 17:
                ewjvVar = ewjv.RCS_SHARED_MAP_CAPABILITY;
                break;
            case 18:
                ewjvVar = ewjv.RCS_SHARED_SKETCH_CAPABILITY;
                break;
            case 19:
                ewjvVar = ewjv.RCS_MESSAGE_REVOKE_CAPABILITY;
                break;
            case 20:
                ewjvVar = ewjv.RCS_FILE_TRANSFER_VIA_SMS_CAPABILITY;
                break;
            case 21:
                ewjvVar = ewjv.RCS_FILE_TRANSFER_VIA_HTTP_CAPABILITY;
                break;
            case 22:
                ewjvVar = ewjv.RCS_FILE_TRANSFER_VIA_MSRP_CAPABILITY;
                break;
            case 23:
                ewjvVar = ewjv.RCS_LOCATION_VIA_SMS_CAPABILITY;
                break;
            case 24:
                ewjvVar = ewjv.RCS_GROUP_CHAT_CAPABILITY;
                break;
            case 25:
                ewjvVar = ewjv.RCS_RBM_CAPABILITY;
                break;
            case 26:
                ewjvVar = ewjv.RCS_RBM_BOT_CAPABILITY;
                break;
            default:
                ewjvVar = null;
                break;
        }
        return ewjvVar != null;
    }
}
