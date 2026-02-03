package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dano {
    public static String a(SuggestionData suggestionData) {
        if (suggestionData instanceof SmartSuggestionItemSuggestionData) {
            return ejkx.a(((SmartSuggestionItemSuggestionData) suggestionData).c);
        }
        throw new IllegalStateException("Unexpected type of SuggestionData");
    }
}
