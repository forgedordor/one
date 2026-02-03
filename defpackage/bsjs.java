package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bsjs extends dqpd implements dqpf {
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public long g;
    public long h;
    public String i;
    public int j;
    public long k;
    public bvdv l;
    public eyga m;
    public boolean n;
    public String o;
    public String p;
    public basd a = basd.a;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;

    protected bsjs() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "PendingIncomingRcsMessageTable [rcs_message_id: %s,\n  remote_user_id: %s,\n  self_identity: %s,\n  raw_text: %s,\n  content_type: %s,\n  remote_instance: %s,\n  sent_timestamp: %s,\n  received_timestamp: %s,\n  sip_alias: %s,\n  spam_verdict: %s,\n  session_id: %s,\n  message_status: %s,\n  custom_headers: %s,\n  is_group: %s,\n  conversation_id: %s,\n  conference_uri: %s,\n  is_delivery_report_requested: %s,\n  is_display_report_requested: %s,\n  is_negative_delivery_report_requested: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l), String.valueOf(this.m), String.valueOf(this.n), String.valueOf(this.o), String.valueOf(this.p), String.valueOf(this.q), String.valueOf(this.r), String.valueOf(this.s));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = bsmv.c().intValue();
        basd basdVar = this.a;
        if (basdVar == null || basdVar.equals(basd.a)) {
            contentValues.putNull("rcs_message_id");
        } else {
            contentValues.put("rcs_message_id", basd.d(this.a));
        }
        dqru.v(contentValues, "remote_user_id", this.b);
        if (iIntValue >= 59410) {
            dqru.v(contentValues, "self_identity", this.c);
        }
        dqru.v(contentValues, "raw_text", this.d);
        dqru.v(contentValues, "content_type", this.e);
        dqru.v(contentValues, "remote_instance", this.f);
        contentValues.put("sent_timestamp", Long.valueOf(this.g));
        contentValues.put("received_timestamp", Long.valueOf(this.h));
        dqru.v(contentValues, "sip_alias", this.i);
        contentValues.put("spam_verdict", Integer.valueOf(this.j));
        contentValues.put("session_id", Long.valueOf(this.k));
        bvdv bvdvVar = this.l;
        if (bvdvVar == null) {
            contentValues.putNull("message_status");
        } else {
            contentValues.put("message_status", Integer.valueOf(bvdvVar.ordinal()));
        }
        if (iIntValue >= 44020) {
            eyga eygaVar = this.m;
            if (eygaVar == null) {
                contentValues.putNull("custom_headers");
            } else {
                contentValues.put("custom_headers", eygaVar.toByteArray());
            }
        }
        if (iIntValue >= 58820) {
            contentValues.put("is_group", Boolean.valueOf(this.n));
        }
        if (iIntValue >= 58820) {
            dqru.v(contentValues, "conversation_id", this.o);
        }
        if (iIntValue >= 58820) {
            dqru.v(contentValues, "conference_uri", this.p);
        }
        if (iIntValue >= 58870) {
            contentValues.put("is_delivery_report_requested", Boolean.valueOf(this.q));
        }
        if (iIntValue >= 58870) {
            contentValues.put("is_display_report_requested", Boolean.valueOf(this.r));
        }
        if (iIntValue >= 60560) {
            contentValues.put("is_negative_delivery_report_requested", Boolean.valueOf(this.s));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bsmh bsmhVar = (bsmh) ((bsln) dqqjVar);
        aC();
        this.cN = bsmhVar.cV();
        if (bsmhVar.dj(0)) {
            this.a = bsmhVar.c();
            fN(0);
        }
        if (bsmhVar.dj(1)) {
            this.b = bsmhVar.q();
            fN(1);
        }
        if (bsmhVar.dj(2)) {
            this.c = bsmhVar.r();
            fN(2);
        }
        if (bsmhVar.dj(3)) {
            this.d = bsmhVar.o();
            fN(3);
        }
        if (bsmhVar.dj(4)) {
            this.e = bsmhVar.m();
            fN(4);
        }
        if (bsmhVar.dj(5)) {
            this.f = bsmhVar.p();
            fN(5);
        }
        if (bsmhVar.dj(6)) {
            this.g = bsmhVar.h();
            fN(6);
        }
        if (bsmhVar.dj(7)) {
            this.h = bsmhVar.g();
            fN(7);
        }
        if (bsmhVar.dj(8)) {
            this.i = bsmhVar.s();
            fN(8);
        }
        if (bsmhVar.dj(9)) {
            this.j = bsmhVar.f();
            fN(9);
        }
        if (bsmhVar.dj(10)) {
            this.k = bsmhVar.i();
            fN(10);
        }
        if (bsmhVar.dj(11)) {
            this.l = bsmhVar.j();
            fN(11);
        }
        if (bsmhVar.dj(12)) {
            this.m = bsmhVar.k();
            fN(12);
        }
        if (bsmhVar.dj(13)) {
            this.n = bsmhVar.v();
            fN(13);
        }
        if (bsmhVar.dj(14)) {
            this.o = bsmhVar.n();
            fN(14);
        }
        if (bsmhVar.dj(15)) {
            this.p = bsmhVar.l();
            fN(15);
        }
        if (bsmhVar.dj(16)) {
            this.q = bsmhVar.t();
            fN(16);
        }
        if (bsmhVar.dj(17)) {
            this.r = bsmhVar.u();
            fN(17);
        }
        if (bsmhVar.dj(18)) {
            this.s = bsmhVar.w();
            fN(18);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bsjs)) {
            return false;
        }
        bsjs bsjsVar = (bsjs) obj;
        return super.aE(bsjsVar.cN) && Objects.equals(this.a, bsjsVar.a) && Objects.equals(this.b, bsjsVar.b) && Objects.equals(this.c, bsjsVar.c) && Objects.equals(this.d, bsjsVar.d) && Objects.equals(this.e, bsjsVar.e) && Objects.equals(this.f, bsjsVar.f) && this.g == bsjsVar.g && this.h == bsjsVar.h && Objects.equals(this.i, bsjsVar.i) && this.j == bsjsVar.j && this.k == bsjsVar.k && this.l == bsjsVar.l && Objects.equals(this.m, bsjsVar.m) && this.n == bsjsVar.n && Objects.equals(this.o, bsjsVar.o) && Objects.equals(this.p, bsjsVar.p) && this.q == bsjsVar.q && this.r == bsjsVar.r && this.s == bsjsVar.s;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "pending_incoming_message_rcs_table", dqru.m(new String[]{"rcs_message_id", "remote_user_id", "self_identity", "raw_text", "content_type", "remote_instance", "sent_timestamp", "received_timestamp", "sip_alias", "spam_verdict", "session_id", "message_status", "custom_headers", "is_group", "conversation_id", "conference_uri", "is_delivery_report_requested", "is_display_report_requested", "is_negative_delivery_report_requested"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "pending_incoming_message_rcs_table";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        basd basdVar = this.a;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.e;
        String str5 = this.f;
        Long lValueOf = Long.valueOf(this.g);
        Long lValueOf2 = Long.valueOf(this.h);
        String str6 = this.i;
        Integer numValueOf = Integer.valueOf(this.j);
        Long lValueOf3 = Long.valueOf(this.k);
        bvdv bvdvVar = this.l;
        return Objects.hash(dqqeVar2, basdVar, str, str2, str3, str4, str5, lValueOf, lValueOf2, str6, numValueOf, lValueOf3, Integer.valueOf(bvdvVar == null ? 0 : bvdvVar.ordinal()), this.m, Boolean.valueOf(this.n), this.o, this.p, Boolean.valueOf(this.q), Boolean.valueOf(this.r), Boolean.valueOf(this.s), null);
    }

    @Override // defpackage.dqpf
    public final void i(StringBuilder sb, List list) {
        Object obj = new bsjr(this).get();
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.e;
        String str5 = this.f;
        Long lValueOf = Long.valueOf(this.g);
        Long lValueOf2 = Long.valueOf(this.h);
        String str6 = this.i;
        Integer numValueOf = Integer.valueOf(this.j);
        Long lValueOf3 = Long.valueOf(this.k);
        bvdv bvdvVar = this.l;
        Object objValueOf = bvdvVar == null ? 0 : String.valueOf(bvdvVar.ordinal());
        eyga eygaVar = this.m;
        Object[] objArr = {obj, str, str2, str3, str4, str5, lValueOf, lValueOf2, str6, numValueOf, lValueOf3, objValueOf, eygaVar == null ? null : eygaVar.toByteArray(), Integer.valueOf(this.n ? 1 : 0), this.o, this.p, Integer.valueOf(this.q ? 1 : 0), Integer.valueOf(this.r ? 1 : 0), Integer.valueOf(this.s ? 1 : 0)};
        sb.append('(');
        for (int i = 0; i < 19; i++) {
            Object obj2 = objArr[i];
            if (obj2 instanceof Number) {
                sb.append(String.valueOf(obj2));
            } else {
                if (obj2 instanceof String) {
                    String str7 = (String) obj2;
                    if (str7.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str7));
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

    public final basd k() {
        aA(0, "rcs_message_id");
        return this.a;
    }

    public final String m() {
        aA(4, "content_type");
        return this.e;
    }

    public final String n() {
        aA(3, "raw_text");
        return this.d;
    }

    public final String o() {
        aA(1, "remote_user_id");
        return this.b;
    }

    public final String p() {
        aA(2, "self_identity");
        return this.c;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "PendingIncomingRcsMessageTable -- REDACTED") : a();
    }
}
