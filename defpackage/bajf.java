package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.DeviceData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class bajf implements bajb {
    private final fcsu a;
    private ejxr b = ejxx.a(new ejxr() { // from class: bajd
        @Override // defpackage.ejxr
        public final Object get() {
            return InvalidConversationId.a;
        }
    });
    protected final bajh c;
    public bbtk d;
    protected final fcsu e;
    public final fcsu f;

    /* compiled from: PG */
    public interface a {
        bajh bA();

        fcsu gh();

        fcsu gj();

        fcsu gs();
    }

    public bajf() {
        a aVar = (a) cqtf.a(a.class);
        this.a = aVar.gj();
        this.f = aVar.gh();
        this.e = aVar.gs();
        this.c = aVar.bA();
        String[] strArr = bdxk.a;
        dqpg dqpgVar = new dqpg(bdxk.d());
        ConversationIdType conversationIdType = barn.a;
        bcvs.a(conversationIdType, new cnqj(), bvdp.NAME_IS_AUTOMATIC, bvdk.UNARCHIVED, avoe.b(0), basb.b(-1L), new cbqz(0L), bary.a, basd.a, aonp.VMT_STATUS_UNKNOWN, conversationIdType, dqpgVar);
        String[] strArr2 = bcve.a;
        dqpg dqpgVar2 = new dqpg(bcve.e());
        ConversationIdType conversationIdType2 = barn.a;
        this.d = bbtm.a(conversationIdType2, new cnqj(), bvdp.NAME_IS_AUTOMATIC, bvdk.UNARCHIVED, avoe.b(0), basb.b(-1L), new cbqz(0L), bary.a, basd.a, aonp.VMT_STATUS_UNKNOWN, conversationIdType2, dqpgVar2);
    }

    public abstract boolean D();

    public final int E() {
        bbtk bbtkVar = this.d;
        bbtkVar.aA(30, "conv_type");
        return bbtkVar.E;
    }

    public final int F() {
        bbtk bbtkVar = this.d;
        bbtkVar.aA(58, "sub_id");
        return bbtkVar.ag;
    }

    public final long G() {
        bbtk bbtkVar = this.d;
        bbtkVar.aA(15, "sort_timestamp");
        return bbtkVar.p;
    }

    public final ConversationId H() {
        ConversationId conversationId = (ConversationId) this.b.get();
        ejwl.a(conversationId != InvalidConversationId.a);
        return conversationId;
    }

    public final akbl I() {
        bbtk bbtkVar = this.d;
        bbtkVar.aA(76, "conversation_id");
        return bbtkVar.ay.b() ? akbl.b : akbl.c;
    }

    public final ConversationIdType J() {
        return this.d.h();
    }

    public final bvdk K() {
        bbtk bbtkVar = this.d;
        bbtkVar.aA(14, "archive_status");
        return bbtkVar.o;
    }

    public final void L(final bbtk bbtkVar) {
        this.d = bbtkVar;
        if (bbtkVar.h().b()) {
            return;
        }
        this.b = ejxx.a(new ejxr() { // from class: baje
            @Override // defpackage.ejxr
            public final Object get() {
                ajsn ajsnVar = (ajsn) this.a.f.b();
                bbtk bbtkVar2 = bbtkVar;
                return ajsnVar.a(bbtkVar2.h(), bbtkVar2.m(), bbtkVar2.n());
            }
        });
    }

    public final void M(bcut bcutVar) {
        L((bbtk) bcutVar.cQ());
    }

    public final boolean N() {
        bbtk bbtkVar = this.d;
        bbtkVar.aA(43, "has_been_e2ee");
        return bbtkVar.R;
    }

    public final boolean O() {
        bbtk bbtkVar = this.d;
        bbtkVar.aA(26, "include_email_addr");
        return bbtkVar.A;
    }

    public final boolean P() {
        return this.d.n();
    }

    public final boolean Q() {
        return bvdi.b(E());
    }

    public final boolean R() {
        bbtk bbtkVar = this.d;
        bbtkVar.aA(44, "marked_as_unread");
        return bbtkVar.S;
    }

    public final boolean S() {
        if (R()) {
            return false;
        }
        return !this.d.aG("unread_message_count") || Integer.parseInt(this.d.az("unread_message_count")) == 0 || y() || A();
    }

    public abstract int a();

    public abstract int d();

    public abstract long e();

    public abstract SelfIdentityId f();

    public abstract MessageUsageStatisticsData h(elny elnyVar, DeviceData deviceData, long j);

    public abstract MessageIdType i();

    public abstract cnqj j();

    public abstract String n();

    public abstract String r();

    public abstract String s();

    public abstract String u(String str);

    public abstract boolean x();
}
