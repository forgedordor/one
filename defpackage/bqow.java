package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqow extends dqpg {
    public long a;
    public MessageIdType b;
    public ConversationIdType c;
    public int d;
    public float e;
    public eoff f;
    public String g;
    public long h;
    public eoeo i;
    public eykc j;
    public int k;
    public eofg l;
    public int m;

    public bqow() {
        super(bqrg.g());
        this.b = bary.a;
        this.c = barn.a;
        this.d = 0;
        this.e = 0.0f;
        this.f = eoff.SPAM;
        this.g = "";
        this.h = 0L;
        this.i = eoeo.UNKNOWN_DETECTION_TRIGGER_TYPE;
        this.j = eykc.UNKNOWN_SPAM_VERDICT_ENFORCEMENT_ACTION;
        this.k = 0;
        this.l = eofg.UNKNOWN_SPAM_ERROR;
        this.m = 0;
    }

    public final bqou a() {
        bqov bqovVar = new bqov();
        bqovVar.aD(aB());
        bqovVar.a = this.a;
        bqovVar.b = this.b;
        bqovVar.c = this.c;
        bqovVar.d = this.d;
        bqovVar.e = this.e;
        bqovVar.f = this.f;
        bqovVar.g = this.g;
        bqovVar.h = this.h;
        bqovVar.i = this.i;
        bqovVar.j = this.j;
        bqovVar.k = this.k;
        bqovVar.l = this.l;
        bqovVar.m = this.m;
        bqovVar.cM = aC();
        return bqovVar;
    }

    public final void b(int i) {
        int i2 = this.aB;
        if (i2 < 59460) {
            dqru.x("action_contributors", i2);
        }
        aE(10);
        this.k = i;
    }

    public final void c(eykc eykcVar) {
        int i = this.aB;
        if (i < 59460) {
            dqru.x("action_type", i);
        }
        aE(9);
        this.j = eykcVar;
    }

    public final void d(String str) {
        int i = this.aB;
        if (i < 58100) {
            dqru.x("ares_initiated_by", i);
        }
        aE(6);
        this.g = str;
    }

    public final void e(long j) {
        int i = this.aB;
        if (i < 59190) {
            dqru.x("classification_timestamp", i);
        }
        aE(7);
        this.h = j;
    }

    public final void f(ConversationIdType conversationIdType) {
        int i = this.aB;
        if (i < 59460) {
            dqru.x("conversation_id", i);
        }
        aE(2);
        this.c = conversationIdType;
    }

    public final void g(eofg eofgVar) {
        int i = this.aB;
        if (i < 59460) {
            dqru.x("error_code", i);
        }
        aE(11);
        this.l = eofgVar;
    }

    public final void h(MessageIdType messageIdType) {
        aE(1);
        this.b = messageIdType;
    }

    public final void i(eoff eoffVar) {
        int i = this.aB;
        if (i < 58030) {
            dqru.x("outcome", i);
        }
        aE(5);
        this.f = eoffVar;
    }

    public final void j(int i) {
        int i2 = this.aB;
        if (i2 < 59460) {
            dqru.x("reclassification_index", i2);
        }
        aE(12);
        this.m = i;
    }

    public final void k(float f) {
        int i = this.aB;
        if (i < 45040) {
            dqru.x("score", i);
        }
        aE(4);
        this.e = f;
    }

    public final void l(int i) {
        aE(3);
        this.d = i;
    }

    public final void m(eoeo eoeoVar) {
        int i = this.aB;
        if (i < 59460) {
            dqru.x("trigger", i);
        }
        aE(8);
        this.i = eoeoVar;
    }
}
