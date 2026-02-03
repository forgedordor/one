package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class criw implements fdap {
    final /* synthetic */ criz a;
    final /* synthetic */ ConversationIdType b;

    public criw(criz crizVar, ConversationIdType conversationIdType) {
        this.a = crizVar;
        this.b = conversationIdType;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        SuggestionData suggestionData = (SuggestionData) obj;
        suggestionData.getClass();
        ((bxlc) this.a.c.b()).l(this.b, suggestionData.w(), new String[0]);
        return fctx.a;
    }
}
