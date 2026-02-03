package com.google.android.ims.rcsservice.chatsession.message;

import android.text.TextUtils;
import defpackage.dhic;
import defpackage.dhja;
import defpackage.esyd;
import defpackage.esye;
import defpackage.esyr;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ConversationSuggestionsJsonParser {
    private esyd parser;

    public ConversationSuggestionsJsonParser() {
        esye esyeVar = new esye();
        esyeVar.b();
        this.parser = esyeVar.a();
    }

    public ArrayList<ConversationSuggestion> parse(String str) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList<>();
        }
        try {
            ConversationSuggestionsContainer conversationSuggestionsContainer = (ConversationSuggestionsContainer) this.parser.i(str, ConversationSuggestionsContainer.class);
            ArrayList<ConversationSuggestion> arrayList = conversationSuggestionsContainer.suggestions;
            if (dhic.a(arrayList)) {
                dhja.q("No suggestions found in suggested chip list.", new Object[0]);
                return new ArrayList<>();
            }
            dhja.c("Parsed %d suggestions from suggested chip list.", Integer.valueOf(conversationSuggestionsContainer.suggestions.size()));
            if (!dhic.a(arrayList)) {
                arrayList.removeAll(Collections.singleton(null));
            }
            return arrayList;
        } catch (esyr e) {
            dhja.i(e, "Unable to parse incoming suggested chip list.", new Object[0]);
            return new ArrayList<>();
        }
    }
}
