package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.group.GroupInfo;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public interface chwq extends ccyz, cfsd {
    public static final ejxr a = cdag.v("migrate_telephony_methods_to_rcs_telephony_access");

    boolean A(ConversationIdType conversationIdType);

    boolean B();

    boolean C();

    @Deprecated
    boolean D(int i);

    @Deprecated
    ConversationIdType E(long j, cnqj cnqjVar, GroupInfo groupInfo, Optional optional, int i, Optional optional2, boolean z, int i2, Optional optional3);

    void F(Bundle bundle);

    boolean G(MessageCoreData messageCoreData, int i, int i2, long j);

    void H(MessageCoreData messageCoreData, int i, long j);

    @Deprecated
    int I();

    int d();

    int e(Optional optional);

    ln f(MessageCoreData messageCoreData);

    @Deprecated
    axcy g();

    chwp h();

    chwp i(basd basdVar);

    @Deprecated
    cmtz j(long j, String str, String str2, Integer num);

    @Deprecated
    cmtz k(cnqj cnqjVar, String str, String str2, Integer num);

    @Deprecated
    Optional l();

    Optional m();

    @Deprecated
    String n(String str, String str2);

    String o(ConversationIdType conversationIdType);

    String p();

    @Deprecated
    String q();

    void r();

    void s();

    void t();

    void u(ewfq ewfqVar);

    void v(long j);

    boolean w(ConversationIdType conversationIdType);

    boolean x(chwp chwpVar);

    boolean y(Intent intent);

    boolean z();
}
