package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqou extends dqpd implements dqpf {
    public long a;
    public MessageIdType b = bary.a;
    public ConversationIdType c = barn.a;
    public int d = 0;
    public float e = 0.0f;
    public eoff f = eoff.SPAM;
    public String g = "";
    public long h = 0;
    public eoeo i = eoeo.UNKNOWN_DETECTION_TRIGGER_TYPE;
    public eykc j = eykc.UNKNOWN_SPAM_VERDICT_ENFORCEMENT_ACTION;
    public int k = 0;
    public eofg l = eofg.UNKNOWN_SPAM_ERROR;
    public int m = 0;

    protected bqou() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "MessageSpamTable [_id: %s,\n  message_id: %s,\n  conversation_id: %s,\n  source: %s,\n  score: %s,\n  outcome: %s,\n  ares_initiated_by: %s,\n  classification_timestamp: %s,\n  trigger: %s,\n  action_type: %s,\n  action_contributors: %s,\n  error_code: %s,\n  reclassification_index: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l), String.valueOf(this.m));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = bqrg.c().intValue();
        MessageIdType messageIdType = this.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bary.a(this.b)));
        }
        if (iIntValue >= 59460) {
            ConversationIdType conversationIdType = this.c;
            if (conversationIdType == null || conversationIdType.equals(barn.a)) {
                contentValues.putNull("conversation_id");
            } else {
                contentValues.put("conversation_id", Long.valueOf(barn.a(this.c)));
            }
        }
        contentValues.put("source", Integer.valueOf(this.d));
        if (iIntValue >= 45040) {
            contentValues.put("score", Float.valueOf(this.e));
        }
        if (iIntValue >= 58030) {
            eoff eoffVar = this.f;
            if (eoffVar == null) {
                contentValues.putNull("outcome");
            } else {
                contentValues.put("outcome", Integer.valueOf(eoffVar.a()));
            }
        }
        if (iIntValue >= 58100) {
            dqru.v(contentValues, "ares_initiated_by", this.g);
        }
        if (iIntValue >= 59190) {
            contentValues.put("classification_timestamp", Long.valueOf(this.h));
        }
        if (iIntValue >= 59460) {
            eoeo eoeoVar = this.i;
            if (eoeoVar == null) {
                contentValues.putNull("trigger");
            } else {
                contentValues.put("trigger", Integer.valueOf(eoeoVar.a()));
            }
        }
        if (iIntValue >= 59460) {
            eykc eykcVar = this.j;
            if (eykcVar == null) {
                contentValues.putNull("action_type");
            } else {
                contentValues.put("action_type", Integer.valueOf(eykcVar.a()));
            }
        }
        if (iIntValue >= 59460) {
            contentValues.put("action_contributors", Integer.valueOf(this.k));
        }
        if (iIntValue >= 59460) {
            eofg eofgVar = this.l;
            if (eofgVar == null) {
                contentValues.putNull("error_code");
            } else {
                contentValues.put("error_code", Integer.valueOf(eofgVar.a()));
            }
        }
        if (iIntValue >= 59460) {
            contentValues.put("reclassification_index", Integer.valueOf(this.m));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bqqq bqqqVar = (bqqq) ((bqqc) dqqjVar);
        aC();
        this.cN = bqqqVar.cV();
        if (bqqqVar.dj(0)) {
            this.a = bqqqVar.k();
            fN(0);
        }
        if (bqqqVar.dj(1)) {
            this.b = bqqqVar.m();
            fN(1);
        }
        if (bqqqVar.dj(2)) {
            this.c = bqqqVar.l();
            fN(2);
        }
        if (bqqqVar.dj(3)) {
            this.d = bqqqVar.i();
            fN(3);
        }
        if (bqqqVar.dj(4)) {
            this.e = bqqqVar.f();
            fN(4);
        }
        if (bqqqVar.dj(5)) {
            this.f = bqqqVar.o();
            fN(5);
        }
        if (bqqqVar.dj(6)) {
            this.g = bqqqVar.r();
            fN(6);
        }
        if (bqqqVar.dj(7)) {
            this.h = bqqqVar.j();
            fN(7);
        }
        if (bqqqVar.dj(8)) {
            this.i = bqqqVar.n();
            fN(8);
        }
        if (bqqqVar.dj(9)) {
            this.j = bqqqVar.q();
            fN(9);
        }
        if (bqqqVar.dj(10)) {
            this.k = bqqqVar.g();
            fN(10);
        }
        if (bqqqVar.dj(11)) {
            this.l = bqqqVar.p();
            fN(11);
        }
        if (bqqqVar.dj(12)) {
            this.m = bqqqVar.h();
            fN(12);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bqou)) {
            return false;
        }
        bqou bqouVar = (bqou) obj;
        return super.aE(bqouVar.cN) && this.a == bqouVar.a && Objects.equals(this.b, bqouVar.b) && Objects.equals(this.c, bqouVar.c) && this.d == bqouVar.d && this.e == bqouVar.e && this.f == bqouVar.f && Objects.equals(this.g, bqouVar.g) && this.h == bqouVar.h && this.i == bqouVar.i && this.j == bqouVar.j && this.k == bqouVar.k && this.l == bqouVar.l && this.m == bqouVar.m;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "message_spam", dqru.m(new String[]{"message_id", "conversation_id", "source", "score", "outcome", "ares_initiated_by", "classification_timestamp", "trigger", "action_type", "action_contributors", "error_code", "reclassification_index"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "message_spam";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Long.valueOf(this.a), this.b, this.c, Integer.valueOf(this.d), Float.valueOf(this.e), this.f, this.g, Long.valueOf(this.h), this.i, this.j, Integer.valueOf(this.k), this.l, Integer.valueOf(this.m), null);
    }

    @Override // defpackage.dqpf
    public final void i(StringBuilder sb, List list) {
        Object obj = new bqos(this).get();
        Object obj2 = new bqot(this).get();
        Integer numValueOf = Integer.valueOf(this.d);
        Float fValueOf = Float.valueOf(this.e);
        eoff eoffVar = this.f;
        Object objValueOf = eoffVar == null ? obj : String.valueOf(eoffVar.a());
        String str = this.g;
        Long lValueOf = Long.valueOf(this.h);
        eoeo eoeoVar = this.i;
        Object objValueOf2 = eoeoVar == null ? obj : String.valueOf(eoeoVar.a());
        eykc eykcVar = this.j;
        Object objValueOf3 = eykcVar == null ? obj : String.valueOf(eykcVar.a());
        Integer numValueOf2 = Integer.valueOf(this.k);
        eofg eofgVar = this.l;
        Object[] objArr = {obj, obj2, numValueOf, fValueOf, objValueOf, str, lValueOf, objValueOf2, objValueOf3, numValueOf2, eofgVar != null ? String.valueOf(eofgVar.a()) : 0, Integer.valueOf(this.m)};
        sb.append('(');
        for (int i = 0; i < 12; i++) {
            Object obj3 = objArr[i];
            if (obj3 instanceof Number) {
                sb.append(String.valueOf(obj3));
            } else {
                if (obj3 instanceof String) {
                    String str2 = (String) obj3;
                    if (str2.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str2));
                    }
                }
                list.add(obj3);
                sb.append('?');
                sb.append(',');
            }
            sb.append(',');
        }
        sb.setLength(sb.length() - 1);
        sb.append(')');
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final float k() {
        aA(4, "score");
        return this.e;
    }

    public final int m() {
        aA(10, "action_contributors");
        return this.k;
    }

    public final int n() {
        aA(12, "reclassification_index");
        return this.m;
    }

    public final int o() {
        aA(3, "source");
        return this.d;
    }

    public final long p() {
        aA(7, "classification_timestamp");
        return this.h;
    }

    public final MessageIdType q() {
        aA(1, "message_id");
        return this.b;
    }

    public final eoeo r() {
        aA(8, "trigger");
        return this.i;
    }

    public final eoff s() {
        aA(5, "outcome");
        return this.f;
    }

    public final eofg t() {
        aA(11, "error_code");
        return this.l;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "MessageSpamTable -- REDACTED") : a();
    }

    public final eykc u() {
        aA(9, "action_type");
        return this.j;
    }
}
