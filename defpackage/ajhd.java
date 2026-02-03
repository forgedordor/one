package defpackage;

import android.app.NotificationChannel;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface ajhd extends dhem {
    public static final long a = TimeUnit.DAYS.toMillis(1);
    public static final long b = TimeUnit.DAYS.toMillis(7);
    public static final long c = TimeUnit.DAYS.toMillis(28);
    public static final cczv d = cdag.c(cdag.b, "conversation_protocol_full_condition_ratio", 1.0d);
    public static final ejxr e = cdag.w(254207979, "enable_message_attachment_size_instrumentation");

    void A(MessageCoreData messageCoreData, String str);

    @Deprecated
    void B(MessageCoreData messageCoreData, int i, elpg elpgVar);

    void C(MessageCoreData messageCoreData, Integer num, int i, elng elngVar);

    void D(ajfg ajfgVar);

    void E(MessageCoreData messageCoreData);

    void F(MessageCoreData messageCoreData, int i);

    void G(MessageCoreData messageCoreData, int i, int i2);

    void H(MessageCoreData messageCoreData, int i, elof elofVar);

    void I(MessageCoreData messageCoreData, int i, long j, ainn ainnVar, elof elofVar);

    void J(int i, int i2, int i3, int i4, long j, int i5, long j2, ConversationIdType conversationIdType);

    void K(ConversationIdType conversationIdType, int i, long j);

    void L(int i);

    void M(ajfh ajfhVar);

    void N(MessageCoreData messageCoreData, int i);

    void O(MessageCoreData messageCoreData, eltm eltmVar);

    void P(int i, int i2);

    void Q(emxt emxtVar, MessageCoreData messageCoreData, int i);

    @Deprecated
    void R(String str, int i, String str2);

    void S(elny elnyVar, fhaz fhazVar, ainn ainnVar);

    void T();

    void U(MessageCoreData messageCoreData);

    void V(boolean z);

    void W();

    void X();

    boolean Y();

    void Z(int i, int i2, int i3, long j, int i4, long j2, ConversationIdType conversationIdType);

    @Override // defpackage.dhem
    void a(ewke ewkeVar);

    void aa(basd basdVar, enxu enxuVar, enyw enywVar);

    void ab(MessageCoreData messageCoreData, Optional optional, enyw enywVar, ainn ainnVar);

    void ac(NotificationChannel notificationChannel, NotificationChannel notificationChannel2);

    int ad();

    @Deprecated
    void ae(int i);

    void af(ConversationIdType conversationIdType, int i);

    void ag(int i, int i2, int i3);

    void ah(MessageCoreData messageCoreData, int i, int i2, int i3, int i4, int i5, enxu enxuVar, int i6, int i7, Optional optional, Optional optional2, Optional optional3);

    void ai(MessageCoreData messageCoreData, int i, long j, boolean z, int i2);

    void aj(elqb elqbVar, int i, List list);

    void ak(int i, int i2, String str);

    @Deprecated
    void al(int i, String str);

    void am(int i, elrk elrkVar, String str);

    void an(MessageCoreData messageCoreData, int i, enyw enywVar, int i2, int i3);

    void ao(int i);

    void ap(int i, int i2);

    void aq();

    void ar(MessageCoreData messageCoreData, Optional optional);

    void as(ConversationIdType conversationIdType, elka elkaVar, int i, boolean z, Boolean bool, boolean z2, boolean z3, int i2, List list, boolean z4, int i3, boolean z5, int i4);

    void at(MessageCoreData messageCoreData, int i, ainn ainnVar, elof elofVar);

    void au(elqb elqbVar);

    void av();

    @Override // defpackage.dhem
    void b(ewkl ewklVar);

    int d();

    ajft e();

    eiju f();

    elul g(long j);

    elul h(String str);

    ListenableFuture i();

    @Deprecated
    String j(Optional optional);

    void k();

    @Deprecated
    void l(String str, int i, String str2, String str3, bvdz bvdzVar);

    @Deprecated
    void m(String str, int i, String str2, String str3, bvdz bvdzVar);

    void n();

    void o(ConversationIdType conversationIdType, elka elkaVar, int i);

    void p(ConversationIdType conversationIdType, eljx eljxVar);

    void q(boolean z, boolean z2);

    void r();

    void s(basd basdVar, int i);

    void t(basd basdVar, MessageCoreData messageCoreData, int i, enyw enywVar);

    void u(basd basdVar, MessageCoreData messageCoreData, int i, enyw enywVar, elny elnyVar);

    void v(basd basdVar, MessageCoreData messageCoreData, int i, enyw enywVar);

    void w(basd basdVar, MessageCoreData messageCoreData, int i, enxu enxuVar, enyw enywVar);

    void x(MessageCoreData messageCoreData, elij elijVar);

    void y(MessageCoreData messageCoreData, elij elijVar);

    void z(MessageCoreData messageCoreData, String str);
}
