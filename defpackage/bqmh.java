package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqmh extends dqpd implements dqpf {
    public UUID a = base.b();
    public MessageIdType b = bary.a;
    public long c;
    public long d;
    public bvea e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;

    protected bqmh() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "MessageSendReceiveAttemptTable [_id: %s,\n  message_id: %s,\n  timestamp: %s,\n  message_sending_attempt: %s,\n  message_protocol: %s,\n  current_sim_network_country: %s,\n  current_sim_country: %s,\n  current_sim_carrier_country: %s,\n  settings_country: %s,\n  default_sms_sim_country: %s,\n  locale_country: %s,\n  default_sms_sim_network_country: %s,\n  default_sms_sim_carrier_country: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l), String.valueOf(this.m));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        UUID uuid = this.a;
        if (uuid == null) {
            contentValues.putNull("_id");
        } else {
            contentValues.put("_id", base.a(uuid));
        }
        MessageIdType messageIdType = this.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bary.a(this.b)));
        }
        contentValues.put("timestamp", Long.valueOf(this.c));
        contentValues.put("message_sending_attempt", Long.valueOf(this.d));
        bvea bveaVar = this.e;
        if (bveaVar == null) {
            contentValues.putNull("message_protocol");
        } else {
            contentValues.put("message_protocol", Integer.valueOf(bveaVar.ordinal()));
        }
        dqru.v(contentValues, "current_sim_network_country", this.f);
        dqru.v(contentValues, "current_sim_country", this.g);
        dqru.v(contentValues, "current_sim_carrier_country", this.h);
        dqru.v(contentValues, "settings_country", this.i);
        dqru.v(contentValues, "default_sms_sim_country", this.j);
        dqru.v(contentValues, "locale_country", this.k);
        dqru.v(contentValues, "default_sms_sim_network_country", this.l);
        dqru.v(contentValues, "default_sms_sim_carrier_country", this.m);
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bqoe bqoeVar = (bqoe) ((bqnq) dqqjVar);
        aC();
        this.cN = bqoeVar.cV();
        if (bqoeVar.dj(0)) {
            this.a = bqoeVar.q();
            fN(0);
        }
        if (bqoeVar.dj(1)) {
            this.b = bqoeVar.g();
            fN(1);
        }
        if (bqoeVar.dj(2)) {
            this.c = bqoeVar.f();
            fN(2);
        }
        if (bqoeVar.dj(3)) {
            this.d = bqoeVar.e();
            fN(3);
        }
        if (bqoeVar.dj(4)) {
            this.e = bqoeVar.h();
            fN(4);
        }
        if (bqoeVar.dj(5)) {
            this.f = bqoeVar.k();
            fN(5);
        }
        if (bqoeVar.dj(6)) {
            this.g = bqoeVar.j();
            fN(6);
        }
        if (bqoeVar.dj(7)) {
            this.h = bqoeVar.i();
            fN(7);
        }
        if (bqoeVar.dj(8)) {
            this.i = bqoeVar.p();
            fN(8);
        }
        if (bqoeVar.dj(9)) {
            this.j = bqoeVar.m();
            fN(9);
        }
        if (bqoeVar.dj(10)) {
            this.k = bqoeVar.o();
            fN(10);
        }
        if (bqoeVar.dj(11)) {
            this.l = bqoeVar.n();
            fN(11);
        }
        if (bqoeVar.dj(12)) {
            this.m = bqoeVar.l();
            fN(12);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bqmh)) {
            return false;
        }
        bqmh bqmhVar = (bqmh) obj;
        return super.aE(bqmhVar.cN) && Objects.equals(this.a, bqmhVar.a) && Objects.equals(this.b, bqmhVar.b) && this.c == bqmhVar.c && this.d == bqmhVar.d && this.e == bqmhVar.e && Objects.equals(this.f, bqmhVar.f) && Objects.equals(this.g, bqmhVar.g) && Objects.equals(this.h, bqmhVar.h) && Objects.equals(this.i, bqmhVar.i) && Objects.equals(this.j, bqmhVar.j) && Objects.equals(this.k, bqmhVar.k) && Objects.equals(this.l, bqmhVar.l) && Objects.equals(this.m, bqmhVar.m);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "message_send_receive_attempt", dqru.m(new String[]{"_id", "message_id", "timestamp", "message_sending_attempt", "message_protocol", "current_sim_network_country", "current_sim_country", "current_sim_carrier_country", "settings_country", "default_sms_sim_country", "locale_country", "default_sms_sim_network_country", "default_sms_sim_carrier_country"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "message_send_receive_attempt";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        UUID uuid = this.a;
        MessageIdType messageIdType = this.b;
        Long lValueOf = Long.valueOf(this.c);
        Long lValueOf2 = Long.valueOf(this.d);
        bvea bveaVar = this.e;
        return Objects.hash(dqqeVar2, uuid, messageIdType, lValueOf, lValueOf2, Integer.valueOf(bveaVar == null ? 0 : bveaVar.ordinal()), this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, null);
    }

    @Override // defpackage.dqpf
    public final void i(StringBuilder sb, List list) {
        String strA = base.a(this.a);
        Object obj = new bqmg(this).get();
        Long lValueOf = Long.valueOf(this.c);
        Long lValueOf2 = Long.valueOf(this.d);
        bvea bveaVar = this.e;
        Object[] objArr = {strA, obj, lValueOf, lValueOf2, bveaVar == null ? 0 : String.valueOf(bveaVar.ordinal()), this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m};
        sb.append('(');
        for (int i = 0; i < 13; i++) {
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
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "MessageSendReceiveAttemptTable -- REDACTED") : a();
    }
}
