package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akzz implements alfb {
    private final String a;
    private final alfd b = alfd.g;
    private final String c;
    private final MessageId d;

    public akzz(SuggestionData suggestionData) {
        SmartSuggestionItemSuggestionData smartSuggestionItemSuggestionData = (SmartSuggestionItemSuggestionData) suggestionData;
        this.a = smartSuggestionItemSuggestionData.a;
        this.c = smartSuggestionItemSuggestionData.r();
        this.d = new CoreBugleMessageId(smartSuggestionItemSuggestionData.w(), -1L);
    }

    @Override // defpackage.alff
    public final alfd a() {
        return this.b;
    }

    @Override // defpackage.alff
    public final String b() {
        return this.a;
    }

    @Override // defpackage.alfb
    public final MessageId c() {
        return this.d;
    }

    @Override // defpackage.alfb
    public final String d() {
        return this.c;
    }
}
