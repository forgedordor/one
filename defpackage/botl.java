package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class botl extends dqyp {
    public final void A() {
        ap(new dqty("conversations.participant_count", 1, 1));
    }

    public final void B(int i) {
        ap(new dqty("conversations.participant_count", 10, Integer.valueOf(i)));
    }

    public final void C(String str) {
        ap(new dqpj("conversations.participant_normalized_destination", 1, String.valueOf(str)));
    }

    public final void D(String str) {
        int iIntValue = botm.g().intValue();
        if (iIntValue < 40050) {
            dqru.x("rcs_conference_uri", iIntValue);
        }
        ap(new dqpj("conversations.rcs_conference_uri", 1, String.valueOf(str)));
    }

    public final void E(String str) {
        int iIntValue = botm.g().intValue();
        if (iIntValue < 40050) {
            dqru.x("rcs_group_id", iIntValue);
        }
        ap(new dqpj("conversations.rcs_group_id", 1, String.valueOf(str)));
    }

    public final void F() {
        int iIntValue = botm.g().intValue();
        if (iIntValue < 40050) {
            dqru.x("rcs_group_id", iIntValue);
        }
        ap(new dqpn("conversations.rcs_group_id", 6));
    }

    public final void G() {
        int iIntValue = botm.g().intValue();
        if (iIntValue < 40050) {
            dqru.x("rcs_group_id", iIntValue);
        }
        ap(new dqpn("conversations.rcs_group_id", 5));
    }

    public final void H() {
        int iIntValue = botm.g().intValue();
        if (iIntValue < 40050) {
            dqru.x("rcs_group_id", iIntValue);
        }
        ap(new dqpj("conversations.rcs_group_id", 2, ""));
    }

    public final void I(String str) {
        int iIntValue = botm.g().intValue();
        if (iIntValue < 58540) {
            dqru.x("rcs_group_self_msisdn", iIntValue);
        }
        ap(new dqpj("conversations.rcs_group_self_msisdn", 1, str));
    }

    public final void J(long j) {
        int iIntValue = botm.g().intValue();
        if (iIntValue < 10000) {
            dqru.x("rcs_session_id", iIntValue);
        }
        ap(new dqty("conversations.rcs_session_id", 1, Long.valueOf(j)));
    }

    public final void K() {
        int iIntValue = botm.g().intValue();
        if (iIntValue < 10000) {
            dqru.x("rcs_session_id", iIntValue);
        }
        ap(new dqty("conversations.rcs_session_id", 2, -1L));
    }

    public final void L(cnqj cnqjVar) {
        ap(new dqpj("conversations.sms_thread_id", 1, Long.valueOf(cnqk.a(cnqjVar))));
    }

    public final void M(int i) {
        int iIntValue = botm.g().intValue();
        if (iIntValue < 8500) {
            dqru.x("source_type", iIntValue);
        }
        ap(new dqty("conversations.source_type", 1, Integer.valueOf(i)));
    }

    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new botf(this);
    }

    public final void b(Function... functionArr) {
        botl[] botlVarArr = new botl[functionArr.length];
        for (int i = 0; i < functionArr.length; i++) {
            Function function = functionArr[i];
            String[] strArr = botm.a;
            botlVarArr[i] = (botl) function.apply(new botl());
        }
        aq(botlVarArr);
    }

    public final void c(bvdk bvdkVar) {
        ap(new dqty("conversations.archive_status", 1, Integer.valueOf(bvdkVar == null ? 0 : bvdkVar.h)));
    }

    public final void d(bvdk bvdkVar) {
        ap(new dqty("conversations.archive_status", 2, Integer.valueOf(bvdkVar == null ? 0 : bvdkVar.h)));
    }

    public final void e(String str) {
        int iIntValue = botm.g().intValue();
        if (iIntValue < 32000) {
            dqru.x("cms_id", iIntValue);
        }
        ap(new dqpj("conversations.cms_id", 1, String.valueOf(str)));
    }

    public final void f() {
        int iIntValue = botm.g().intValue();
        if (iIntValue < 32000) {
            dqru.x("cms_id", iIntValue);
        }
        ap(new dqpn("conversations.cms_id", 6));
    }

    public final void g() {
        int iIntValue = botm.g().intValue();
        if (iIntValue < 32000) {
            dqru.x("cms_id", iIntValue);
        }
        ap(new dqpn("conversations.cms_id", 5));
    }

    public final void h(cpyi... cpyiVarArr) {
        int iIntValue = botm.g().intValue();
        if (iIntValue < 58210) {
            dqru.x("cms_life_cycle", iIntValue);
        }
        ap(new dqpm("conversations.cms_life_cycle", 3, as((Iterable) DesugarArrays.stream(cpyiVarArr).map(new Function() { // from class: botj
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
        }).collect(Collectors.toCollection(new both()))), true));
    }

    public final void i(cpyi cpyiVar) {
        int iIntValue = botm.g().intValue();
        if (iIntValue < 58210) {
            dqru.x("cms_life_cycle", iIntValue);
        }
        ap(new dqty("conversations.cms_life_cycle", 2, Integer.valueOf(cpyiVar == null ? 0 : cpyiVar.ordinal())));
    }

    public final void j(int i) {
        int iIntValue = botm.g().intValue();
        if (iIntValue < 10007) {
            dqru.x("conv_type", iIntValue);
        }
        ap(new dqty("conversations.conv_type", 1, Integer.valueOf(i)));
    }

    public final void k(String str) {
        ap(new dqpj("conversations.current_self_id", 1, String.valueOf(str)));
    }

    public final void l() {
        int iIntValue = botm.g().intValue();
        if (iIntValue < 29020) {
            dqru.x("delete_timestamp", iIntValue);
        }
        ap(new dqty("conversations.delete_timestamp", 1, 0L));
    }

    public final void m(awjl awjlVar) {
        int iIntValue = botm.g().intValue();
        if (iIntValue < 60360) {
            dqru.x("destination_token", iIntValue);
        }
        ap(new dqpj("conversations.destination_token", 1, awjm.b(awjlVar)));
    }

    public final void n(int i) {
        int iIntValue = botm.g().intValue();
        if (iIntValue < 29060) {
            dqru.x("etouffee_default", iIntValue);
        }
        ap(new dqty("conversations.etouffee_default", 1, Integer.valueOf(i)));
    }

    public final void o() {
        ap(new dqpj("conversations.draft_preview_uri", 11, "android.resource%"));
    }

    public final void p(boolean z) {
        int iIntValue = botm.g().intValue();
        if (iIntValue < 59210) {
            dqru.x("has_been_e2ee", iIntValue);
        }
        ap(new dqty("conversations.has_been_e2ee", 1, Integer.valueOf(z ? 1 : 0)));
    }

    public final void q() {
        int iIntValue = botm.g().intValue();
        if (iIntValue < 12001) {
            dqru.x("has_ea2p_bot_recipient", iIntValue);
        }
        ap(new dqty("conversations.has_ea2p_bot_recipient", 1, 0));
    }

    public final void r(ConversationIdType conversationIdType) {
        ap(new dqpj("conversations._id", 1, Long.valueOf(barn.a(conversationIdType))));
    }

    public final void s(long j) {
        ap(new dqty("conversations._id", 7, Long.valueOf(j)));
    }

    public final void t(dqxe dqxeVar) {
        ap(new dqpk("conversations._id", 3, dqxeVar));
    }

    public final void u(Iterable iterable) {
        ekfw ekfwVar = new ekfw();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ekfwVar.h(String.valueOf(barn.a((ConversationIdType) it.next())));
        }
        ap(new dqpm("conversations._id", 3, as(ekfwVar.g()), true));
    }

    public final void v(long j) {
        ap(new dqty("conversations._id", 10, Long.valueOf(j)));
    }

    public final void w(ConversationIdType conversationIdType) {
        ap(new dqpj("conversations._id", 2, Long.valueOf(barn.a(conversationIdType))));
    }

    public final void x(int i) {
        int iIntValue = botm.g().intValue();
        if (iIntValue < 10006) {
            dqru.x("join_state", iIntValue);
        }
        ap(new dqty("conversations.join_state", 1, Integer.valueOf(i)));
    }

    public final void y(int i) {
        int iIntValue = botm.g().intValue();
        if (iIntValue < 10006) {
            dqru.x("join_state", iIntValue);
        }
        ap(new dqty("conversations.join_state", 2, Integer.valueOf(i)));
    }

    public final void z() {
        int iIntValue = botm.g().intValue();
        if (iIntValue < 59220) {
            dqru.x("marked_as_unread", iIntValue);
        }
        ap(new dqty("conversations.marked_as_unread", 1, 1));
    }
}
