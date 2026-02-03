package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class albt implements alff {
    public final String a;
    public final MessageId b;
    public final String c;
    private final alfd d;

    public albt(aldp aldpVar) {
        SmartSuggestionItemSuggestionData smartSuggestionItemSuggestionData = (SmartSuggestionItemSuggestionData) aldpVar;
        this.a = smartSuggestionItemSuggestionData.a;
        this.b = new CoreBugleMessageId(smartSuggestionItemSuggestionData.w(), -1L);
        ezgi ezgiVar = smartSuggestionItemSuggestionData.c;
        String str = (ezgiVar.c == 27 ? (ezfn) ezgiVar.d : ezfn.a).b;
        str.getClass();
        this.c = str;
        this.d = alfd.w;
    }

    @Override // defpackage.alff
    public final alfd a() {
        return this.d;
    }

    @Override // defpackage.alff
    public final String b() {
        return this.a;
    }
}
