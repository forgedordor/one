package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface ajln {
    eiju A(ConversationId conversationId, akbl akblVar);

    eiju B(ConversationId conversationId, Recipient recipient, crvz crvzVar);

    eiju C(ConversationId conversationId, elka elkaVar);

    eiju D(ConversationId conversationId, Recipient recipient, crwz crwzVar, String str, boolean z, crvz crvzVar);

    eiju E(ConversationId conversationId, Uri uri);

    eiju F(ConversationId conversationId);

    eiju G(ConversationId conversationId, elka elkaVar);

    anpj H(int i);

    eiju I(ekgb ekgbVar, int i);

    eiju J(ekgb ekgbVar, int i);

    Conversation a(ConversationId conversationId, ajlm ajlmVar);

    ConversationId b(akln aklnVar);

    ConversationId c(byte[] bArr);

    eiju d(ConversationId conversationId, elka elkaVar);

    eiju e(ConversationId conversationId);

    eiju f(aoer aoerVar, ConversationId conversationId);

    eiju g(aoer aoerVar, ConversationId conversationId);

    eiju h(akzk akzkVar);

    eiju i(awjl awjlVar);

    @Deprecated
    eiju j(ekgb ekgbVar);

    eiju k();

    eiju l(ConversationId conversationId);

    @Deprecated
    eiju m(ekgb ekgbVar, String str);

    eiju n(awjl awjlVar, aoer aoerVar, ajsm ajsmVar);

    eiju o(Optional optional, ekgb ekgbVar, String str);

    eiju p(Optional optional, ekgb ekgbVar, String str, Uri uri);

    eiju q(ConversationId conversationId, akcy akcyVar, Recipient recipient);

    eiju r(ConversationId conversationId);

    eiju s(ekgb ekgbVar);

    eiju t(ConversationId conversationId, cgrc cgrcVar, cgra cgraVar);

    eiju u(ConversationId conversationId, akcy akcyVar);

    eiju v(Recipient recipient);

    eiju w(ConversationId conversationId, String str);

    eiju x(ConversationId conversationId, aoer aoerVar);

    eiju y(ConversationId conversationId, String str, String str2, amsv amsvVar);

    eiju z(ConversationId conversationId, String str, Uri uri);
}
