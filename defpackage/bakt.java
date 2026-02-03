package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantCoreColor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public interface bakt {
    ekgb A();

    ekgb B(ekgb ekgbVar);

    ekgp C(ekgb ekgbVar);

    ekhx D(String str);

    ekhx E(List list);

    Optional F(ConversationIdType conversationIdType);

    Optional G(ConversationIdType conversationIdType);

    Optional H(ConversationIdType conversationIdType);

    String I(ConversationIdType conversationIdType);

    @Deprecated
    ArrayList J(cmtz cmtzVar, int i);

    List K(ConversationIdType conversationIdType);

    List L(ConversationIdType conversationIdType, boolean z);

    @Deprecated
    List M(cnqj cnqjVar);

    void N(ConversationIdType conversationIdType);

    void O();

    void P(ConversationIdType conversationIdType);

    void Q(Set set);

    void R(String str);

    void S(ArrayList arrayList);

    void T(ConversationIdType conversationIdType);

    void U(ConversationIdType conversationIdType, MessageCoreData messageCoreData, boolean z);

    void V(ConversationIdType conversationIdType, String str, int i, boolean z);

    void W(ConversationIdType conversationIdType, bote boteVar);

    void X(String str, ParticipantCoreColor participantCoreColor);

    void Y(Set set, String str, String str2);

    void Z(Set set, ParticipantsTable.BindData bindData);

    int a(ConversationIdType conversationIdType);

    boolean aa(Optional optional, ParticipantsTable.BindData bindData, barg bargVar, ConversationIdType conversationIdType, boolean z, boolean z2);

    boolean ab(ConversationIdType conversationIdType);

    boolean ac(ConversationIdType conversationIdType);

    boolean ad(ConversationIdType conversationIdType);

    boolean ae(long j);

    boolean af(String str);

    boolean ag(ConversationIdType conversationIdType, String str);

    boolean ah(ConversationIdType conversationIdType);

    boolean ai(ParticipantsTable.BindData bindData, ConversationIdType conversationIdType, boolean z);

    boolean aj(ConversationIdType conversationIdType, bote boteVar);

    boolean ak(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId);

    boolean al(ConversationIdType conversationIdType, String str, barg bargVar);

    boolean am(SelfIdentityId selfIdentityId, bote boteVar);

    boolean an(ParticipantsTable.BindData bindData, ConversationIdType conversationIdType);

    boolean ao(List list, ConversationIdType conversationIdType);

    boolean ap(Optional optional, List list, ConversationIdType conversationIdType, boolean z);

    @Deprecated
    ConversationIdType aq(long j, bvdk bvdkVar, List list, int i, String str, long j2);

    @Deprecated
    ConversationIdType ar(long j, bvdk bvdkVar, List list);

    @Deprecated
    baqv as(cmmp cmmpVar, long j, bvdk bvdkVar, List list, long j2);

    boolean at(List list, ConversationIdType conversationIdType);

    int b(ConversationIdType conversationIdType);

    int c(ConversationIdType conversationIdType);

    int d(ConversationIdType conversationIdType);

    int e(List list, boolean z);

    long f(ConversationIdType conversationIdType);

    long g(ConversationIdType conversationIdType);

    long h(ConversationIdType conversationIdType);

    SelfIdentityId i(ConversationIdType conversationIdType);

    baqv j(bara baraVar);

    baqv k(bara baraVar, boolean z);

    ConversationIdType l(bara baraVar);

    @Deprecated
    ConversationIdType m(long j);

    ConversationIdType n(cnqj cnqjVar);

    @Deprecated
    ConversationIdType o(cmmp cmmpVar, long j);

    ConversationIdType p(cmmp cmmpVar, cnqj cnqjVar);

    ConversationIdType q(long j);

    bojh r(ConversationIdType conversationIdType);

    bvdk s(ConversationIdType conversationIdType);

    cpyi t(ConversationIdType conversationIdType);

    ekgb u();

    ekgb v(cnqj cnqjVar);

    ekgb w(cmmp cmmpVar, cnqj cnqjVar);

    ekgb x(ConversationIdType conversationIdType);

    @Deprecated
    ekgb y(Optional optional, ConversationIdType conversationIdType);

    ekgb z(Optional optional, ConversationIdType conversationIdType, int i);
}
