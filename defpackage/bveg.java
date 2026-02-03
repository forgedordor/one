package defpackage;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public interface bveg {
    MessageCoreData a();

    MessageCoreData b(Parcel parcel);

    MessageCoreData c(MessagesTable.BindData bindData, List list);

    MessageCoreData d(String str, ConversationIdType conversationIdType, String str2, SelfIdentityId selfIdentityId, String str3, String str4, long j, long j2, boolean z, boolean z2, int i, String str5);

    MessageCoreData e(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, String str, String str2, boolean z);

    MessageCoreData f(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, String str);

    MessageCoreData g(int i, ConversationIdType conversationIdType, SelfIdentityId selfIdentityId);

    MessageCoreData h(String str, String str2, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, boolean z, int i, String str3, String str4, int i2, String str5, boolean z2, boolean z3, long j, int i3, long j2, long j3, long j4, String str6, bvdz bvdzVar, long j5);

    MessageCoreData i(Uri uri, ConversationIdType conversationIdType, String str, SelfIdentityId selfIdentityId, String str2, String str3, long j, long j2, boolean z, boolean z2, long j3);

    MessageCoreData j(String str, String str2, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, boolean z, boolean z2, long j, long j2, String str3);

    MessageCoreData k(String str, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, long j, String str2);

    MessageCoreData l(ConversationIdType conversationIdType, int i, long j, MessageIdType messageIdType);

    MessageCoreData m(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, aubq aubqVar, String str, String str2);

    MessageCoreData n(String str, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, long j, long j2, String str2, baro baroVar);

    MessageCoreData o(String str, long j, long j2, basd basdVar, String str2, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, int i2, boolean z, boolean z2, long j3, long j4, String str3, String str4);

    MessageCoreData q(SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, long j, clmw clmwVar, baro baroVar);

    MessageCoreData r(SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, long j, String str, baro baroVar);

    MessageCoreData s(basd basdVar, String str, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, int i2, String str2, boolean z, boolean z2, long j, long j2);

    MessageCoreData t(ConversationIdType conversationIdType, String str, aubq aubqVar);

    MessageCoreData u(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, String str);
}
