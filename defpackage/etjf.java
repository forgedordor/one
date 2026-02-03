package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class etjf implements evsv {
    static final evsv a = new etjf();

    private etjf() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        etjg etjgVar;
        switch (i) {
            case 0:
                etjgVar = etjg.PROMO_NOT_SHOWN_UNKNOWN;
                break;
            case 1:
                etjgVar = etjg.PROMO_NOT_SHOWN_INTERNAL_ERROR;
                break;
            case 2:
                etjgVar = etjg.PROMO_NOT_SHOWN_CLIENT_BLOCK;
                break;
            case 3:
                etjgVar = etjg.PROMO_NOT_SHOWN_CONTROL_GROUP;
                break;
            case 4:
                etjgVar = etjg.PROMO_NOT_SHOWN_VIEW_NOT_IN_SCREEN;
                break;
            case 5:
                etjgVar = etjg.PROMO_NOT_SHOWN_KEYBOARD_PRESENT;
                break;
            case 6:
                etjgVar = etjg.PROMO_NOT_SHOWN_VOICE_OVER_ENABLED;
                break;
            case 7:
                etjgVar = etjg.PROMO_NOT_SHOWN_IMAGE_NOT_PREFETCHED;
                break;
            case 8:
                etjgVar = etjg.PROMO_NOT_SHOWN_NO_VALID_SCHEME;
                break;
            case 9:
                etjgVar = etjg.PROMO_NOT_SHOWN_ACCESSIBILITY_ENABLED;
                break;
            case 10:
                etjgVar = etjg.PROMO_NOT_SHOWN_CLIENT_CALLBACK_NOT_REGISTERED;
                break;
            case 11:
                etjgVar = etjg.PROMO_NOT_SHOWN_CLIENT_RETURNED_NULL_ACTIVITY;
                break;
            case 12:
                etjgVar = etjg.PROMO_NOT_SHOWN_CLIENT_RETURNED_NULL_PROMO_RESPONSE;
                break;
            case 13:
                etjgVar = etjg.PROMO_NOT_SHOWN_THEME_NOT_FOUND;
                break;
            case 14:
            default:
                etjgVar = null;
                break;
            case 15:
                etjgVar = etjg.PROMO_NOT_SHOWN_UNSUPPORTED_PROMO_UI;
                break;
            case 16:
                etjgVar = etjg.PROMO_NOT_SHOWN_VIEW_MOSTLY_HIDDEN;
                break;
            case 17:
                etjgVar = etjg.PROMO_NOT_SHOWN_RENDERER_INTERNAL_ERROR;
                break;
            case 18:
                etjgVar = etjg.PROMO_NOT_SHOWN_INVALID_PROMOTION;
                break;
            case 19:
                etjgVar = etjg.PROMO_NOT_SHOWN_PERMISSION_GRANTED;
                break;
            case 20:
                etjgVar = etjg.PROMO_NOT_SHOWN_APPLICATION_IN_BACKGROUND;
                break;
            case 21:
                etjgVar = etjg.PROMO_NOT_SHOWN_ALREADY_PRESENTING;
                break;
            case 22:
                etjgVar = etjg.PROMO_NOT_SHOWN_MODAL_OPEN;
                break;
            case 23:
                etjgVar = etjg.PROMO_NOT_SHOWN_ANOTHER_PROMO_SELECTED;
                break;
            case 24:
                etjgVar = etjg.PROMO_NOT_SHOWN_PENDING_SYNC;
                break;
            case 25:
                etjgVar = etjg.PROMO_NOT_SHOWN_VIEW_MISSING_WINDOW;
                break;
            case 26:
                etjgVar = etjg.PROMO_NOT_SHOWN_VIEW_TRANSPARENT;
                break;
            case 27:
                etjgVar = etjg.PROMO_NOT_SHOWN_VIEW_DISABLED;
                break;
            case 28:
                etjgVar = etjg.PROMO_NOT_SHOWN_VIEW_NOT_LAID_OUT;
                break;
            case 29:
                etjgVar = etjg.PROMO_NOT_SHOWN_NOT_ENOUGH_SPACE;
                break;
            case 30:
                etjgVar = etjg.PROMO_NOT_SHOWN_UNSUPPORTED_CUSTOM_UI_TYPE;
                break;
            case 31:
                etjgVar = etjg.PROMO_NOT_SHOWN_INVALID_CUSTOM_UI_PROTO;
                break;
            case 32:
                etjgVar = etjg.PROMO_NOT_SHOWN_MISSING_ASSETS;
                break;
        }
        return etjgVar != null;
    }
}
