package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emso implements evsv {
    static final evsv a = new emso();

    private emso() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        emsp emspVar;
        switch (i) {
            case 0:
                emspVar = emsp.UNKNOWN_COMPOSE_SCREEN_CATEGORY;
                break;
            case 1:
                emspVar = emsp.ALL;
                break;
            case 2:
                emspVar = emsp.CAMERA_GALLERY;
                break;
            case 3:
                emspVar = emsp.CAMERA;
                break;
            case 4:
                emspVar = emsp.GALLERY;
                break;
            case 5:
                emspVar = emsp.EXTERNAL;
                break;
            case 6:
                emspVar = emsp.EMOJI;
                break;
            case 7:
                emspVar = emsp.GIF;
                break;
            case 8:
                emspVar = emsp.STICKER;
                break;
            case 9:
                emspVar = emsp.LOCATION;
                break;
            case 10:
                emspVar = emsp.SEND_MONEY;
                break;
            case 11:
                emspVar = emsp.REQUEST_MONEY;
                break;
            case 12:
                emspVar = emsp.CONTACT;
                break;
            case 13:
                emspVar = emsp.VOICE;
                break;
            case 14:
                emspVar = emsp.FILE;
                break;
            case 15:
                emspVar = emsp.REACTION;
                break;
            case 16:
                emspVar = emsp.ASSISTANT;
                break;
            case 17:
                emspVar = emsp.REPLY_DRAFT;
                break;
            case 18:
                emspVar = emsp.EMOTIVE;
                break;
            case 19:
                emspVar = emsp.EMOTIFY;
                break;
            case 20:
                emspVar = emsp.SELFIE_GIF;
                break;
            default:
                emspVar = null;
                break;
        }
        return emspVar != null;
    }
}
