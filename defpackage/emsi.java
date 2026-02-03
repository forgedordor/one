package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emsi implements evsv {
    static final evsv a = new emsi();

    private emsi() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        emsj emsjVar;
        switch (i) {
            case 0:
                emsjVar = emsj.UNKNOWN_OPENING_SOURCE;
                break;
            case 1:
                emsjVar = emsj.PLUS_BUTTON;
                break;
            case 2:
                emsjVar = emsj.CAMERA_GALLERY_BUTTON;
                break;
            case 3:
                emsjVar = emsj.CATEGORY_HEADER;
                break;
            case 4:
                emsjVar = emsj.CATEGORY_OVERFLOW;
                break;
            case 5:
                emsjVar = emsj.SUGGESTION;
                break;
            case 6:
                emsjVar = emsj.EXPAND;
                break;
            case 7:
                emsjVar = emsj.FAVORITES;
                break;
            case 8:
                emsjVar = emsj.QUERY;
                break;
            case 9:
                emsjVar = emsj.CAMERA;
                break;
            case 10:
                emsjVar = emsj.MINI_CAMERA;
                break;
            case 11:
                emsjVar = emsj.DRAFT_END_EMOJI_BUTTON;
                break;
            case 12:
                emsjVar = emsj.MESSAGE_LONG_PRESS;
                break;
            case 13:
                emsjVar = emsj.MESSAGE_BADGE_CLICK;
                break;
            case 14:
                emsjVar = emsj.MESSAGE_REPLY_BUTTON_CLICK;
                break;
            case 15:
                emsjVar = emsj.MESSAGE_REPLY_SWIPE;
                break;
            case 16:
                emsjVar = emsj.ADD_CUSTOM_REACTION_BUTTON_CLICK;
                break;
            default:
                emsjVar = null;
                break;
        }
        return emsjVar != null;
    }
}
