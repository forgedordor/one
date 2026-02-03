package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbfa {
    public static final Set a = fcwm.d(ezan.CALENDAR, ezan.DUO_CALL, ezan.REMINDER, ezan.STARRING);
    public static final Set b = fcwm.d(ezan.COPY_OTP, ezan.SCRIPTED_REPLY);
    public static final Set c = fcwm.d(ezan.COPY_OTP, ezan.CALENDAR);

    public static final ezan a(ezan ezanVar) {
        ezanVar.getClass();
        switch (ezanVar.ordinal()) {
            case 0:
            case 8:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 33:
            case 40:
                return ezan.UNKNOWN_SUGGESTION_TYPE;
            case 1:
            case 2:
            case 15:
            case 31:
                return ezan.CATEGORY_TEXT;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
            case 13:
            case 22:
            case 23:
            case 25:
            case 30:
            case 32:
            case 35:
            case 36:
            case 37:
            case 38:
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return ezan.CATEGORY_ACTION;
            case 12:
            case 16:
                return ezan.CATEGORY_EMOTIVE;
            case 34:
                return ezan.BARD;
            default:
                throw new fctg();
        }
    }

    public static final ezan b(SuggestionData suggestionData) {
        SmartSuggestionItemSuggestionData smartSuggestionItemSuggestionData = suggestionData instanceof SmartSuggestionItemSuggestionData ? (SmartSuggestionItemSuggestionData) suggestionData : null;
        return smartSuggestionItemSuggestionData != null ? smartSuggestionItemSuggestionData.l() : ezan.UNKNOWN_SUGGESTION_TYPE;
    }

    public static final boolean c(SuggestionData suggestionData) {
        return a(b(suggestionData)) == ezan.CATEGORY_TEXT;
    }
}
