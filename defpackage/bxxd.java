package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public interface bxxd {
    long a(int i);

    bojh b(ConversationIdType conversationIdType);

    MessagesTable.BindData c(MessageIdType messageIdType);

    ParticipantsTable.BindData d(String str);

    bxut e(bcvd bcvdVar);

    bxut f(String str, bxwf bxwfVar);

    bxut g(String str, bxwf bxwfVar, int i);

    bxut h(ConversationIdType conversationIdType, String str, Collection collection, int i);

    List i(ConversationIdType conversationIdType, String str, bxwf bxwfVar, boolean z);

    List j(ConversationIdType conversationIdType, Collection collection);

    List k(Collection collection, ConversationIdType conversationIdType);

    List l(MessageIdType messageIdType);

    List m(ConversationIdType conversationIdType, String str, bxwf bxwfVar, boolean z, int i);

    Set n(int i, long j, long j2);

    void o(String str, ezds ezdsVar);

    biwf p(ConversationIdType conversationIdType, String str, boolean z);

    biwf q(ConversationIdType conversationIdType, String str, boolean z, int i);

    biwf r(ConversationIdType conversationIdType, String str, boolean z);

    biwf s(ConversationIdType conversationIdType, String str, boolean z, int i);
}
