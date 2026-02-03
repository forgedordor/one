package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface crif {
    ekgb a(MessageIdType messageIdType);

    ekgb b(MessageIdType messageIdType);

    Optional c(MessageIdType messageIdType);

    Optional d(String str);

    Object e(ConversationIdType conversationIdType, fcxy fcxyVar);

    Object f(ConversationIdType conversationIdType, String str, ezaj ezajVar, fcxy fcxyVar);

    List g(ConversationIdType conversationIdType, long j);

    List h(MessageIdType messageIdType);

    void i(SmartSuggestionItemSuggestionData smartSuggestionItemSuggestionData, ConversationIdType conversationIdType, MessageIdType messageIdType, long j);

    void j(List list, ConversationIdType conversationIdType, MessageIdType messageIdType, long j);

    void k(long j);

    void l();

    void m(List list);

    void n(SuggestionData suggestionData, ezai ezaiVar);

    void o(List list, ezai ezaiVar);

    void p(List list, ezai ezaiVar);
}
