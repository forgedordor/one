package defpackage;

import androidx.car.app.navigation.model.Maneuver;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emfb implements evsv {
    static final evsv a = new emfb();

    private emfb() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        emfc emfcVar;
        switch (i) {
            case 0:
                emfcVar = emfc.RCS_PROVISIONING_UNKNOWN_INTERACTION;
                break;
            case 1:
                emfcVar = emfc.RCS_PROVISIONING_PROMPT_SEEN;
                break;
            case 2:
                emfcVar = emfc.RCS_PROVISIONING_PROMPT_ACCEPTED;
                break;
            case 3:
                emfcVar = emfc.RCS_PROVISIONING_PROMPT_DECLINED;
                break;
            case 4:
                emfcVar = emfc.RCS_PROVISIONING_PROMPT_TERMS_AND_CONDITION_CLICKED;
                break;
            case 5:
                emfcVar = emfc.RCS_PROVISIONING_PROMPT_PRIVACY_AND_POLICY_CLICKED;
                break;
            case 6:
                emfcVar = emfc.RCS_PROVISIONING_RCS_PROMO_SEEN;
                break;
            case 7:
                emfcVar = emfc.RCS_PROVISIONING_RCS_PROMO_TERM_AND_CONDITION_CLICKED;
                break;
            case 8:
                emfcVar = emfc.RCS_PROVISIONING_RCS_PROMO_ACCEPTED;
                break;
            case 9:
                emfcVar = emfc.RCS_PROVISIONING_RCS_PROMO_DECLINED;
                break;
            case 10:
                emfcVar = emfc.RCS_PROVISIONING_RCS_PROMO_LEARNING_MORE_CLICKED;
                break;
            case 11:
                emfcVar = emfc.RCS_PROVISIONING_BOEW_SEEN;
                break;
            case 12:
                emfcVar = emfc.RCS_PROVISIONING_BOEW_ACCEPTED;
                break;
            case 13:
                emfcVar = emfc.RCS_PROVISIONING_BOEW_REJECTED;
                break;
            case 14:
                emfcVar = emfc.RCS_PROVISIONING_SUCCESS_POPUP_SEEN;
                break;
            case 15:
                emfcVar = emfc.RCS_PROVISIONING_SUCCESS_POPUP_DISMISSED;
                break;
            case 16:
                emfcVar = emfc.RCS_PROVISIONING_SUCCESS_POPUP_IGNORED;
                break;
            case 17:
                emfcVar = emfc.RCS_PROVISIONING_DOUBLE_CHECK_DIALOG_ACCEPTED;
                break;
            case 18:
                emfcVar = emfc.RCS_PROVISIONING_DOUBLE_CHECK_DIALOG_REJECTED;
                break;
            case 19:
                emfcVar = emfc.RCS_PROVISIONING_MANUAL_MSISDN_ENTRY_SEEN;
                break;
            case 20:
                emfcVar = emfc.RCS_PROVISIONING_MANUAL_MSISDN_ENTRY_ACCEPTED;
                break;
            case 21:
                emfcVar = emfc.RCS_PROVISIONING_MANUAL_MSISDN_ENTRY_REJECTED;
                break;
            case 22:
                emfcVar = emfc.RCS_PROVISIONING_MANUAL_MSISDN_COUNTRY_CHANGED;
                break;
            case 23:
                emfcVar = emfc.RCS_PROVISIONING_PROMPT_LEARN_MORE_CLICKED;
                break;
            case 24:
                emfcVar = emfc.RCS_PROVISIONING_BACK_BUTTON_CLICKED;
                break;
            case 25:
                emfcVar = emfc.RCS_PROVISIONING_HOME_BUTTON_CLICKED;
                break;
            case 26:
                emfcVar = emfc.RCS_PROVISIONING_PROMPT_TERMS_SUMMARY_CLICKED;
                break;
            case 27:
                emfcVar = emfc.RCS_PROVISIONING_PROMPT_SUPPRESSED;
                break;
            case 28:
                emfcVar = emfc.RCS_PROVISIONING_PROMPT_ELIGIBLE_FOR_SUPPRESSION;
                break;
            case 29:
                emfcVar = emfc.RCS_PROVISIONING_SETTINGS_CHAT_FEATURES_SCREEN_SEEN;
                break;
            case 30:
                emfcVar = emfc.RCS_PROVISIONING_PROMPT_COUNTERFACTUAL_APPLIED;
                break;
            case 31:
                emfcVar = emfc.RCS_PROVISIONING_PHONE_NUMBER_PROMO_PRESENTED;
                break;
            case 32:
                emfcVar = emfc.RCS_PROVISIONING_PHONE_NUMBER_PROMO_ACCEPTED;
                break;
            case 33:
                emfcVar = emfc.RCS_PROVISIONING_PHONE_NUMBER_PROMO_DISMISSED;
                break;
            case 34:
                emfcVar = emfc.RCS_PROVISIONING_GOOGLE_TOS_BANNER_PRESENTED;
                break;
            case 35:
                emfcVar = emfc.RCS_PROVISIONING_GOOGLE_TOS_BANNER_ACCEPTED;
                break;
            case 36:
                emfcVar = emfc.RCS_PROVISIONING_GOOGLE_TOS_BANNER_DISMISSED;
                break;
            case 37:
                emfcVar = emfc.RCS_PROVISIONING_LEGAL_FYI_BOTTOMSHEET_SEEN;
                break;
            case 38:
                emfcVar = emfc.RCS_PROVISIONING_LEGAL_FYI_BANNER_IN_SETTINGS_SEEN;
                break;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                emfcVar = emfc.RCS_PROVISIONING_LEGAL_FYI_BOTTOMSHEET_LEARN_MORE_CLICKED;
                break;
            case 40:
                emfcVar = emfc.RCS_PROVISIONING_LEGAL_FYI_BANNER_IN_SETTINGS_LEARN_MORE_CLICKED;
                break;
            case 41:
                emfcVar = emfc.RCS_PROVISIONING_LEGAL_FYI_BOTTOMSHEET_SETTINGS_CLICKED;
                break;
            case 42:
                emfcVar = emfc.RCS_PROVISIONING_LEGAL_FYI_BOTTOMSHEET_DISMISSED;
                break;
            case 43:
                emfcVar = emfc.RCS_PROVISIONING_WELCOME_MESSAGE_SEEN;
                break;
            case 44:
                emfcVar = emfc.RCS_PROVISIONING_WELCOME_MESSAGE_ACCEPTED;
                break;
            case 45:
                emfcVar = emfc.RCS_PROVISIONING_WELCOME_MESSAGE_SETTINGS_CLICKED;
                break;
            default:
                emfcVar = null;
                break;
        }
        return emfcVar != null;
    }
}
