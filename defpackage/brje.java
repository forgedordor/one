package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class brje extends dqpd implements dqpf {
    public String a;
    public MessageIdType b = bary.a;
    public long c = 0;
    public elqn d = elqn.b(0);
    public emig e = emig.b(0);
    public ezac f = ezac.b(0);
    public eyzv g = eyzv.b(0);
    public int h;
    public int i;
    public String j;
    public String k;
    public String l;

    protected brje() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "P2pConversationSuggestionEventTable [id: %s,\n  message_id: %s,\n  timestamp: %s,\n  event_type: %s,\n  reply_mode: %s,\n  rejection_reason: %s,\n  action_source: %s,\n  num_of_items: %s,\n  click_index: %s,\n  impression_id: %s,\n  suggestion_types: %s,\n  model_output_label: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = brlh.c().intValue();
        if (iIntValue >= 51030) {
            MessageIdType messageIdType = this.b;
            if (messageIdType == null || messageIdType.equals(bary.a)) {
                contentValues.putNull("message_id");
            } else {
                contentValues.put("message_id", Long.valueOf(bary.a(this.b)));
            }
        }
        contentValues.put("timestamp", Long.valueOf(this.c));
        elqn elqnVar = this.d;
        if (elqnVar == null) {
            contentValues.putNull("event_type");
        } else {
            contentValues.put("event_type", Integer.valueOf(elqnVar.i));
        }
        emig emigVar = this.e;
        if (emigVar == null) {
            contentValues.putNull("reply_mode");
        } else {
            contentValues.put("reply_mode", Integer.valueOf(emigVar.d));
        }
        ezac ezacVar = this.f;
        if (ezacVar == null) {
            contentValues.putNull("rejection_reason");
        } else {
            contentValues.put("rejection_reason", Integer.valueOf(ezacVar.a()));
        }
        eyzv eyzvVar = this.g;
        if (eyzvVar == null) {
            contentValues.putNull("action_source");
        } else {
            contentValues.put("action_source", Integer.valueOf(eyzvVar.a()));
        }
        contentValues.put("num_of_items", Integer.valueOf(this.h));
        contentValues.put("click_index", Integer.valueOf(this.i));
        dqru.v(contentValues, "impression_id", this.j);
        dqru.v(contentValues, "suggestion_types", this.k);
        if (iIntValue >= 42030) {
            dqru.v(contentValues, "model_output_label", this.l);
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        brkw brkwVar = (brkw) ((brkj) dqqjVar);
        aC();
        this.cN = brkwVar.cV();
        if (brkwVar.dj(0)) {
            this.a = brkwVar.l();
            fN(0);
        }
        if (brkwVar.dj(1)) {
            this.b = brkwVar.g();
            fN(1);
        }
        if (brkwVar.dj(2)) {
            this.c = brkwVar.f();
            fN(2);
        }
        if (brkwVar.dj(3)) {
            this.d = brkwVar.h();
            fN(3);
        }
        if (brkwVar.dj(4)) {
            this.e = brkwVar.i();
            fN(4);
        }
        if (brkwVar.dj(5)) {
            this.f = brkwVar.k();
            fN(5);
        }
        if (brkwVar.dj(6)) {
            this.g = brkwVar.j();
            fN(6);
        }
        if (brkwVar.dj(7)) {
            this.h = brkwVar.e();
            fN(7);
        }
        if (brkwVar.dj(8)) {
            this.i = brkwVar.c();
            fN(8);
        }
        if (brkwVar.dj(9)) {
            this.j = brkwVar.m();
            fN(9);
        }
        if (brkwVar.dj(10)) {
            this.k = brkwVar.o();
            fN(10);
        }
        if (brkwVar.dj(11)) {
            this.l = brkwVar.n();
            fN(11);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof brje)) {
            return false;
        }
        brje brjeVar = (brje) obj;
        return super.aE(brjeVar.cN) && Objects.equals(this.a, brjeVar.a) && Objects.equals(this.b, brjeVar.b) && this.c == brjeVar.c && this.d == brjeVar.d && this.e == brjeVar.e && this.f == brjeVar.f && this.g == brjeVar.g && this.h == brjeVar.h && this.i == brjeVar.i && Objects.equals(this.j, brjeVar.j) && Objects.equals(this.k, brjeVar.k) && Objects.equals(this.l, brjeVar.l);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "p2p_conversation_suggestion_event", dqru.m(new String[]{"message_id", "timestamp", "event_type", "reply_mode", "rejection_reason", "action_source", "num_of_items", "click_index", "impression_id", "suggestion_types", "model_output_label"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "p2p_conversation_suggestion_event";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, Long.valueOf(this.c), this.d, this.e, this.f, this.g, Integer.valueOf(this.h), Integer.valueOf(this.i), this.j, this.k, this.l, null);
    }

    @Override // defpackage.dqpf
    public final void i(StringBuilder sb, List list) {
        Object obj = new brjd(this).get();
        Long lValueOf = Long.valueOf(this.c);
        elqn elqnVar = this.d;
        Object objValueOf = elqnVar == null ? obj : String.valueOf(elqnVar.i);
        emig emigVar = this.e;
        Object objValueOf2 = emigVar == null ? obj : String.valueOf(emigVar.d);
        ezac ezacVar = this.f;
        Object objValueOf3 = ezacVar == null ? obj : String.valueOf(ezacVar.a());
        eyzv eyzvVar = this.g;
        Object[] objArr = {obj, lValueOf, objValueOf, objValueOf2, objValueOf3, eyzvVar != null ? String.valueOf(eyzvVar.a()) : 0, Integer.valueOf(this.h), Integer.valueOf(this.i), this.j, this.k, this.l};
        sb.append('(');
        for (int i = 0; i < 11; i++) {
            Object obj2 = objArr[i];
            if (obj2 instanceof Number) {
                sb.append(String.valueOf(obj2));
            } else {
                if (obj2 instanceof String) {
                    String str = (String) obj2;
                    if (str.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str));
                    }
                }
                list.add(obj2);
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

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "P2pConversationSuggestionEventTable -- REDACTED") : a();
    }
}
