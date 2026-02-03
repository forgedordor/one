package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.group.GroupInfo;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public interface chvp {
    long a(long j);

    @Deprecated
    Uri b(MessageCoreData messageCoreData, ceah ceahVar, List list, long j, String str, int i);

    Uri c(MessageCoreData messageCoreData, Uri uri, String str);

    Uri d(MessageCoreData messageCoreData, long j, alqm alqmVar, String str, int i);

    cmtz e(cnqj cnqjVar, String str, String str2, Integer num);

    cnqj f(long j, GroupInfo groupInfo);

    cnqj g(cmtu cmtuVar);

    eiju h(MessageCoreData messageCoreData, ceah ceahVar, List list, long j, String str, int i);

    eiju i(MessageCoreData messageCoreData, Uri uri, String str);

    eiju j(MessageCoreData messageCoreData, Uri uri, String str);

    eiju k(MessageCoreData messageCoreData, Uri uri, String str);

    eiju l(String str, Uri uri, String str2);

    eiju m(MessageCoreData messageCoreData, Uri uri, String str);

    eiju n(MessageCoreData messageCoreData, Uri uri, String str);

    eiju o(MessageCoreData messageCoreData, long j, alqm alqmVar, String str, int i);

    boolean p(ConversationIdType conversationIdType);

    boolean q();
}
