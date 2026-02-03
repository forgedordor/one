package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brec extends dqyp {
    public final void A(boolean z) {
        int iIntValue = MessagesTable.g().intValue();
        if (iIntValue < 30010) {
            dqru.x("is_hidden", iIntValue);
        }
        ap(new dqty("messages.is_hidden", 1, Integer.valueOf(z ? 1 : 0)));
    }

    public final void B(Optional optional) {
        int iIntValue = MessagesTable.g().intValue();
        if (iIntValue < 60370) {
            dqru.x("message_persistence_id", iIntValue);
        }
        ap(new dqpj("messages.message_persistence_id", 1, basg.b(optional)));
    }

    public final void C() {
        int iIntValue = MessagesTable.g().intValue();
        if (iIntValue < 60370) {
            dqru.x("message_persistence_id", iIntValue);
        }
        ap(new dqpn("messages.message_persistence_id", 5));
    }

    public final void D(int i) {
        int iIntValue = MessagesTable.g().intValue();
        if (iIntValue < 13020) {
            dqru.x("message_report_status", iIntValue);
        }
        ap(new dqty("messages.message_report_status", 1, Integer.valueOf(i)));
    }

    public final void E() {
        ap(new dqty("messages.seen", 1, 0));
    }

    public final void F(basd basdVar) {
        int iIntValue = MessagesTable.g().intValue();
        if (iIntValue < 35030) {
            dqru.x("original_rcs_message_id", iIntValue);
        }
        ap(new dqpj("messages.original_rcs_message_id", 1, basd.d(basdVar)));
    }

    public final void G(dqxe dqxeVar) {
        int iIntValue = MessagesTable.g().intValue();
        if (iIntValue < 35030) {
            dqru.x("original_rcs_message_id", iIntValue);
        }
        ap(new dqpk("messages.original_rcs_message_id", 3, dqxeVar));
    }

    public final void H(bvdx bvdxVar) {
        int iIntValue = MessagesTable.g().intValue();
        if (iIntValue < 58720) {
            dqru.x("outgoing_delivery_report_status", iIntValue);
        }
        ap(new dqty("messages.outgoing_delivery_report_status", 1, Integer.valueOf(bvdxVar == null ? 0 : bvdxVar.ordinal())));
    }

    public final void I(bvdx bvdxVar) {
        int iIntValue = MessagesTable.g().intValue();
        if (iIntValue < 58720) {
            dqru.x("outgoing_read_report_status", iIntValue);
        }
        ap(new dqty("messages.outgoing_read_report_status", 1, Integer.valueOf(bvdxVar == null ? 0 : bvdxVar.ordinal())));
    }

    public final void J(int i) {
        ap(new dqty("messages.message_protocol", 1, Integer.valueOf(i)));
    }

    public final void K(int... iArr) {
        ap(new dqpm("messages.message_protocol", 3, at(iArr), true));
    }

    public final void L(int i) {
        ap(new dqty("messages.message_protocol", 2, Integer.valueOf(i)));
    }

    public final void M(int i) {
        int iIntValue = MessagesTable.g().intValue();
        if (iIntValue < 29060) {
            dqru.x("etouffee_status", iIntValue);
        }
        ap(new dqty("messages.etouffee_status", 1, Integer.valueOf(i)));
    }

    public final void N(basd basdVar) {
        int iIntValue = MessagesTable.g().intValue();
        if (iIntValue < 41040) {
            dqru.x("rcs_message_id_with_text_type", iIntValue);
        }
        ap(new dqpj("messages.rcs_message_id_with_text_type", 1, basd.d(basdVar)));
    }

    public final void O(boolean z) {
        ap(new dqty("messages.read", 1, Integer.valueOf(z ? 1 : 0)));
    }

    public final void P(long j) {
        ap(new dqty("messages.received_timestamp", 1, Long.valueOf(j)));
    }

    public final void Q(long j) {
        ap(new dqty("messages.received_timestamp", 7, Long.valueOf(j)));
    }

    public final void R(long j) {
        ap(new dqty("messages.received_timestamp", 9, Long.valueOf(j)));
    }

    public final void S(long j) {
        ap(new dqty("messages.received_timestamp", 8, Long.valueOf(j)));
    }

    public final void T(long j) {
        ap(new dqty("messages.received_timestamp", 10, Long.valueOf(j)));
    }

    public final void U(baro baroVar) {
        int iIntValue = MessagesTable.g().intValue();
        if (iIntValue < 59490) {
            dqru.x("satellite_datagram_id", iIntValue);
        }
        ap(new dqpj("messages.satellite_datagram_id", 1, baro.d(baroVar)));
    }

    public final void V(String str) {
        ap(new dqpj("messages.self_id", 1, str));
    }

    public final void W(String str) {
        ap(new dqpj("messages.sender_id", 1, String.valueOf(str)));
    }

    public final void X(Iterable iterable) {
        int iIntValue = MessagesTable.g().intValue();
        if (iIntValue < 54040) {
            dqru.x("sender_send_destination", iIntValue);
        }
        ap(new dqpm("messages.sender_send_destination", 3, as(iterable), false));
    }

    public final void Y(long j) {
        ap(new dqty("messages.sent_timestamp", 7, Long.valueOf(j)));
    }

    public final void Z(long j) {
        ap(new dqty("messages.sent_timestamp", 9, Long.valueOf(j)));
    }

    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new brdv(this);
    }

    public final void aa(Uri uri) {
        ap(new dqpj("messages.sms_message_uri", 1, uri));
    }

    public final void ab(Iterable iterable) {
        ap(new dqpm("messages.sms_message_uri", 3, as(iterable), false));
    }

    public final void ac() {
        ap(new dqpn("messages.sms_message_uri", 6));
    }

    public final void ad() {
        ap(new dqpn("messages.sms_message_uri", 5));
    }

    public final void ae(int i) {
        ap(new dqty("messages.message_status", 1, Integer.valueOf(i)));
    }

    public final void af() {
        ap(new dqty("messages.message_status", 7, 270));
    }

    public final void ag(int i) {
        ap(new dqty("messages.message_status", 9, Integer.valueOf(i)));
    }

    public final void ah(Iterable iterable) {
        ap(new dqpm("messages.message_status", 3, as(iterable), true));
    }

    public final void ai(int... iArr) {
        ap(new dqpm("messages.message_status", 3, at(iArr), true));
    }

    public final void aj(int i, int i2) {
        ap(new dqwx("messages.message_status", String.valueOf(i), String.valueOf(i2)));
    }

    public final void ak() {
        ap(new dqty("messages.message_status", 8, Integer.valueOf(BasePaymentResult.ERROR_REQUEST_FAILED)));
    }

    public final void al(int i) {
        ap(new dqty("messages.message_status", 10, Integer.valueOf(i)));
    }

    public final void am(Iterable iterable) {
        ap(new dqpm("messages.message_status", 4, as(iterable), true));
    }

    public final void an(int... iArr) {
        ap(new dqpm("messages.message_status", 4, at(iArr), true));
    }

    public final void ao(int i) {
        ap(new dqty("messages.message_status", 2, Integer.valueOf(i)));
    }

    public final void b(Function... functionArr) {
        brec[] brecVarArr = new brec[functionArr.length];
        for (int i = 0; i < functionArr.length; i++) {
            Function function = functionArr[i];
            String[] strArr = MessagesTable.a;
            brecVarArr[i] = (brec) function.apply(new brec());
        }
        aq(brecVarArr);
    }

    public final void c() {
        int iIntValue = MessagesTable.g().intValue();
        if (iIntValue < 49060) {
            dqru.x("awaiting_reverse_sync", iIntValue);
        }
        ap(new dqty("messages.awaiting_reverse_sync", 1, 1));
    }

    public final void d(String str) {
        int iIntValue = MessagesTable.g().intValue();
        if (iIntValue < 8500) {
            dqru.x("cloud_sync_id", iIntValue);
        }
        ap(new dqpj("messages.cloud_sync_id", 1, String.valueOf(str)));
    }

    public final void e() {
        int iIntValue = MessagesTable.g().intValue();
        if (iIntValue < 8500) {
            dqru.x("cloud_sync_id", iIntValue);
        }
        ap(new dqpn("messages.cloud_sync_id", 6));
    }

    public final void f(String str) {
        int iIntValue = MessagesTable.g().intValue();
        if (iIntValue < 31010) {
            dqru.x("cms_id", iIntValue);
        }
        ap(new dqpj("messages.cms_id", 1, String.valueOf(str)));
    }

    public final void g(Iterable iterable) {
        int iIntValue = MessagesTable.g().intValue();
        if (iIntValue < 31010) {
            dqru.x("cms_id", iIntValue);
        }
        ap(new dqpm("messages.cms_id", 3, as(iterable), false));
    }

    public final void h() {
        int iIntValue = MessagesTable.g().intValue();
        if (iIntValue < 31010) {
            dqru.x("cms_id", iIntValue);
        }
        ap(new dqpn("messages.cms_id", 5));
    }

    public final void i(cpyi cpyiVar) {
        int iIntValue = MessagesTable.g().intValue();
        if (iIntValue < 58210) {
            dqru.x("cms_life_cycle", iIntValue);
        }
        ap(new dqty("messages.cms_life_cycle", 1, Integer.valueOf(cpyiVar == null ? 0 : cpyiVar.ordinal())));
    }

    public final void j(Iterable iterable) {
        int iIntValue = MessagesTable.g().intValue();
        if (iIntValue < 58210) {
            dqru.x("cms_life_cycle", iIntValue);
        }
        ap(new dqpm("messages.cms_life_cycle", 3, as((Iterable) ekpo.a(iterable).map(new Function() { // from class: brea
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((cpyi) obj).ordinal());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new brdz()))), true));
    }

    public final void k(cpyi... cpyiVarArr) {
        int iIntValue = MessagesTable.g().intValue();
        if (iIntValue < 58210) {
            dqru.x("cms_life_cycle", iIntValue);
        }
        ap(new dqpm("messages.cms_life_cycle", 3, as((Iterable) DesugarArrays.stream(cpyiVarArr).map(new Function() { // from class: brdx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((cpyi) obj).ordinal());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new brdz()))), true));
    }

    public final void l(cpyi cpyiVar) {
        int iIntValue = MessagesTable.g().intValue();
        if (iIntValue < 58210) {
            dqru.x("cms_life_cycle", iIntValue);
        }
        ap(new dqty("messages.cms_life_cycle", 2, Integer.valueOf(cpyiVar == null ? 0 : cpyiVar.ordinal())));
    }

    public final void m(ConversationIdType conversationIdType) {
        ap(new dqpj("messages.conversation_id", 1, Long.valueOf(barn.a(conversationIdType))));
    }

    public final void n(dqxe dqxeVar) {
        ap(new dqpk("messages.conversation_id", 1, dqxeVar));
    }

    public final void o(Iterable iterable) {
        ekfw ekfwVar = new ekfw();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ekfwVar.h(String.valueOf(barn.a((ConversationIdType) it.next())));
        }
        ap(new dqpm("messages.conversation_id", 3, as(ekfwVar.g()), true));
    }

    public final void p(MessageIdType messageIdType) {
        ap(new dqpj("messages._id", 1, Long.valueOf(bary.a(messageIdType))));
    }

    public final void q(dqxe dqxeVar) {
        ap(new dqpk("messages._id", 1, dqxeVar));
    }

    public final void r(long j) {
        ap(new dqty("messages._id", 7, Long.valueOf(j)));
    }

    public final void s(dqxe dqxeVar) {
        ap(new dqpk("messages._id", 3, dqxeVar));
    }

    public final void t(Iterable iterable) {
        ekfw ekfwVar = new ekfw();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ekfwVar.h(String.valueOf(bary.a((MessageIdType) it.next())));
        }
        ap(new dqpm("messages._id", 3, as(ekfwVar.g()), true));
    }

    public final void u(MessageIdType... messageIdTypeArr) {
        ap(new dqpm("messages._id", 3, as((Iterable) DesugarArrays.stream(messageIdTypeArr).map(new Function() { // from class: brdw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return String.valueOf(bary.a((MessageIdType) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new brdz()))), true));
    }

    public final void v(long j) {
        ap(new dqty("messages._id", 8, Long.valueOf(j)));
    }

    public final void w(long j) {
        ap(new dqty("messages._id", 10, Long.valueOf(j)));
    }

    public final void x(dqxe dqxeVar) {
        ap(new dqpk("messages._id", 4, dqxeVar));
    }

    public final void y(Iterable iterable) {
        ekfw ekfwVar = new ekfw();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ekfwVar.h(String.valueOf(bary.a((MessageIdType) it.next())));
        }
        ap(new dqpm("messages._id", 4, as(ekfwVar.g()), true));
    }

    public final void z(MessageIdType messageIdType) {
        ap(new dqpj("messages._id", 2, Long.valueOf(bary.a(messageIdType))));
    }
}
