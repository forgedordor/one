package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dqpd;
import j$.util.Objects;
import j$.util.Optional;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class azgs extends dqpd implements dqpf {
    public String A;
    public cpyi B;
    public String C;
    public long D;
    public int d;
    public boolean e;
    public boolean f;
    public int h;
    public String i;
    public String j;
    public int k;
    public String l;
    public long m;
    public long n;
    public int o;
    public int p;
    public int q;
    public String r;
    public String s;
    public String u;
    public String v;
    public String w;
    public boolean x;
    public eyga z;
    public MessageIdType a = bary.a;
    public Optional b = basg.a;
    public axcm c = null;
    public ConversationIdType g = barn.a;
    public int t = -1;
    public basd y = basd.a;

    protected azgs() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "BackupMessagesTable [_id: %s,\n  message_persistence_id: %s,\n  my_identity: %s,\n  message_status: %s,\n  seen: %s,\n  read: %s,\n  conversation_id: %s,\n  sender_participant_id: %s,\n  sender_send_destination: %s,\n  msisdn_receiving_rcs_message: %s,\n  self_participant_id: %s,\n  mms_subject: %s,\n  received_timestamp: %s,\n  sent_timestamp: %s,\n  protocol: %s,\n  message_priority: %s,\n  rcs_encryption_status: %s,\n  cloud_sync_id: %s,\n  correlation_id: %s,\n  sms_error_code: %s,\n  sms_error_desc_map_name: %s,\n  mms_transaction_id: %s,\n  mms_content_location: %s,\n  is_hidden: %s,\n  rcs_message_id: %s,\n  custom_headers: %s,\n  cms_id: %s,\n  cms_life_cycle: %s,\n  cms_correlation_id: %s,\n  cms_last_mod_seq: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l), String.valueOf(this.m), String.valueOf(this.n), String.valueOf(this.o), String.valueOf(this.p), String.valueOf(this.q), String.valueOf(this.r), String.valueOf(this.s), String.valueOf(this.t), String.valueOf(this.u), String.valueOf(this.v), String.valueOf(this.w), String.valueOf(this.x), String.valueOf(this.y), String.valueOf(this.z), String.valueOf(this.A), String.valueOf(this.B), String.valueOf(this.C), String.valueOf(this.D));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = azlc.c().intValue();
        MessageIdType messageIdType = this.a;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            contentValues.putNull("_id");
        } else {
            contentValues.put("_id", Long.valueOf(bary.a(this.a)));
        }
        if (iIntValue >= 120) {
            Optional optional = this.b;
            if (optional == null || optional.equals(basg.a)) {
                contentValues.putNull("message_persistence_id");
            } else {
                contentValues.put("message_persistence_id", basg.b(this.b));
            }
        }
        if (iIntValue >= 110) {
            axcm axcmVar = this.c;
            if (axcmVar == null || axcmVar.equals(null)) {
                contentValues.putNull("my_identity");
            } else {
                contentValues.put("my_identity", axcn.b(this.c));
            }
        }
        contentValues.put("message_status", Integer.valueOf(this.d));
        contentValues.put("seen", Boolean.valueOf(this.e));
        contentValues.put("read", Boolean.valueOf(this.f));
        ConversationIdType conversationIdType = this.g;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(barn.a(this.g)));
        }
        contentValues.put("sender_participant_id", Integer.valueOf(this.h));
        if (iIntValue >= 80) {
            dqru.v(contentValues, "sender_send_destination", this.i);
        }
        if (iIntValue >= 80) {
            dqru.v(contentValues, "msisdn_receiving_rcs_message", this.j);
        }
        contentValues.put("self_participant_id", Integer.valueOf(this.k));
        dqru.v(contentValues, "mms_subject", this.l);
        contentValues.put("received_timestamp", Long.valueOf(this.m));
        contentValues.put("sent_timestamp", Long.valueOf(this.n));
        contentValues.put("protocol", Integer.valueOf(this.o));
        contentValues.put("message_priority", Integer.valueOf(this.p));
        contentValues.put("rcs_encryption_status", Integer.valueOf(this.q));
        dqru.v(contentValues, "cloud_sync_id", this.r);
        dqru.v(contentValues, "correlation_id", this.s);
        contentValues.put("sms_error_code", Integer.valueOf(this.t));
        dqru.v(contentValues, "sms_error_desc_map_name", this.u);
        dqru.v(contentValues, "mms_transaction_id", this.v);
        dqru.v(contentValues, "mms_content_location", this.w);
        contentValues.put("is_hidden", Boolean.valueOf(this.x));
        basd basdVar = this.y;
        if (basdVar == null) {
            contentValues.putNull("rcs_message_id");
        } else {
            contentValues.put("rcs_message_id", basd.d(basdVar));
        }
        if (iIntValue >= 50) {
            eyga eygaVar = this.z;
            if (eygaVar == null) {
                contentValues.putNull("custom_headers");
            } else {
                contentValues.put("custom_headers", eygaVar.toByteArray());
            }
        }
        dqru.v(contentValues, "cms_id", this.A);
        cpyi cpyiVar = this.B;
        if (cpyiVar == null) {
            contentValues.putNull("cms_life_cycle");
        } else {
            contentValues.put("cms_life_cycle", Integer.valueOf(cpyiVar.ordinal()));
        }
        dqru.v(contentValues, "cms_correlation_id", this.C);
        contentValues.put("cms_last_mod_seq", Long.valueOf(this.D));
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        azkp azkpVar = (azkp) ((azjk) dqqjVar);
        aC();
        this.cN = azkpVar.cV();
        if (azkpVar.dj(0)) {
            this.a = azkpVar.p();
            fN(0);
        }
        if (azkpVar.dj(1)) {
            this.b = azkpVar.t();
            fN(1);
        }
        if (azkpVar.dj(2)) {
            this.c = azkpVar.n();
            fN(2);
        }
        if (azkpVar.dj(3)) {
            this.d = azkpVar.e();
            fN(3);
        }
        if (azkpVar.dj(4)) {
            this.e = azkpVar.G();
            fN(4);
        }
        if (azkpVar.dj(5)) {
            this.f = azkpVar.F();
            fN(5);
        }
        if (azkpVar.dj(6)) {
            this.g = azkpVar.o();
            fN(6);
        }
        if (azkpVar.dj(7)) {
            this.h = azkpVar.i();
            fN(7);
        }
        if (azkpVar.dj(8)) {
            this.i = azkpVar.C();
            fN(8);
        }
        if (azkpVar.dj(9)) {
            this.j = azkpVar.B();
            fN(9);
        }
        if (azkpVar.dj(10)) {
            this.k = azkpVar.h();
            fN(10);
        }
        if (azkpVar.dj(11)) {
            this.l = azkpVar.z();
            fN(11);
        }
        if (azkpVar.dj(12)) {
            this.m = azkpVar.l();
            fN(12);
        }
        if (azkpVar.dj(13)) {
            this.n = azkpVar.m();
            fN(13);
        }
        if (azkpVar.dj(14)) {
            this.o = azkpVar.f();
            fN(14);
        }
        if (azkpVar.dj(15)) {
            this.p = azkpVar.c();
            fN(15);
        }
        if (azkpVar.dj(16)) {
            this.q = azkpVar.g();
            fN(16);
        }
        if (azkpVar.dj(17)) {
            this.r = azkpVar.u();
            fN(17);
        }
        if (azkpVar.dj(18)) {
            this.s = azkpVar.x();
            fN(18);
        }
        if (azkpVar.dj(19)) {
            this.t = azkpVar.j();
            fN(19);
        }
        if (azkpVar.dj(20)) {
            this.u = azkpVar.D();
            fN(20);
        }
        if (azkpVar.dj(21)) {
            this.v = azkpVar.A();
            fN(21);
        }
        if (azkpVar.dj(22)) {
            this.w = azkpVar.y();
            fN(22);
        }
        if (azkpVar.dj(23)) {
            this.x = azkpVar.E();
            fN(23);
        }
        if (azkpVar.dj(24)) {
            this.y = azkpVar.q();
            fN(24);
        }
        if (azkpVar.dj(25)) {
            this.z = azkpVar.s();
            fN(25);
        }
        if (azkpVar.dj(26)) {
            this.A = azkpVar.w();
            fN(26);
        }
        if (azkpVar.dj(27)) {
            this.B = azkpVar.r();
            fN(27);
        }
        if (azkpVar.dj(28)) {
            this.C = azkpVar.v();
            fN(28);
        }
        if (azkpVar.dj(29)) {
            this.D = azkpVar.k();
            fN(29);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof azgs)) {
            return false;
        }
        azgs azgsVar = (azgs) obj;
        return super.aE(azgsVar.cN) && Objects.equals(this.a, azgsVar.a) && Objects.equals(this.b, azgsVar.b) && Objects.equals(this.c, azgsVar.c) && this.d == azgsVar.d && this.e == azgsVar.e && this.f == azgsVar.f && Objects.equals(this.g, azgsVar.g) && this.h == azgsVar.h && Objects.equals(this.i, azgsVar.i) && Objects.equals(this.j, azgsVar.j) && this.k == azgsVar.k && Objects.equals(this.l, azgsVar.l) && this.m == azgsVar.m && this.n == azgsVar.n && this.o == azgsVar.o && this.p == azgsVar.p && this.q == azgsVar.q && Objects.equals(this.r, azgsVar.r) && Objects.equals(this.s, azgsVar.s) && this.t == azgsVar.t && Objects.equals(this.u, azgsVar.u) && Objects.equals(this.v, azgsVar.v) && Objects.equals(this.w, azgsVar.w) && this.x == azgsVar.x && Objects.equals(this.y, azgsVar.y) && Objects.equals(this.z, azgsVar.z) && Objects.equals(this.A, azgsVar.A) && this.B == azgsVar.B && Objects.equals(this.C, azgsVar.C) && this.D == azgsVar.D;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "messages_backup", dqru.m(new String[]{"_id", "message_persistence_id", "my_identity", "message_status", "seen", "read", "conversation_id", "sender_participant_id", "sender_send_destination", "msisdn_receiving_rcs_message", "self_participant_id", "mms_subject", "received_timestamp", "sent_timestamp", "protocol", "message_priority", "rcs_encryption_status", "cloud_sync_id", "correlation_id", "sms_error_code", "sms_error_desc_map_name", "mms_transaction_id", "mms_content_location", "is_hidden", "rcs_message_id", "custom_headers", "cms_id", "cms_life_cycle", "cms_correlation_id", "cms_last_mod_seq"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "messages_backup";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        MessageIdType messageIdType = this.a;
        Optional optional = this.b;
        axcm axcmVar = this.c;
        Integer numValueOf = Integer.valueOf(this.d);
        Boolean boolValueOf = Boolean.valueOf(this.e);
        Boolean boolValueOf2 = Boolean.valueOf(this.f);
        ConversationIdType conversationIdType = this.g;
        Integer numValueOf2 = Integer.valueOf(this.h);
        String str = this.i;
        String str2 = this.j;
        Integer numValueOf3 = Integer.valueOf(this.k);
        String str3 = this.l;
        Long lValueOf = Long.valueOf(this.m);
        dqqe dqqeVar3 = dqqeVar2;
        Long lValueOf2 = Long.valueOf(this.n);
        Integer numValueOf4 = Integer.valueOf(this.o);
        Integer numValueOf5 = Integer.valueOf(this.p);
        Integer numValueOf6 = Integer.valueOf(this.q);
        String str4 = this.r;
        String str5 = this.s;
        Integer numValueOf7 = Integer.valueOf(this.t);
        String str6 = this.u;
        String str7 = this.v;
        String str8 = this.w;
        Boolean boolValueOf3 = Boolean.valueOf(this.x);
        basd basdVar = this.y;
        eyga eygaVar = this.z;
        String str9 = this.A;
        cpyi cpyiVar = this.B;
        return Objects.hash(dqqeVar3, messageIdType, optional, axcmVar, numValueOf, boolValueOf, boolValueOf2, conversationIdType, numValueOf2, str, str2, numValueOf3, str3, lValueOf, lValueOf2, numValueOf4, numValueOf5, numValueOf6, str4, str5, numValueOf7, str6, str7, str8, boolValueOf3, basdVar, eygaVar, str9, Integer.valueOf(cpyiVar == null ? 0 : cpyiVar.ordinal()), this.C, Long.valueOf(this.D), null);
    }

    @Override // defpackage.dqpf
    public final void i(StringBuilder sb, List list) {
        Object obj = new azgo(this).get();
        Object obj2 = new azgp(this).get();
        Object obj3 = new azgq(this).get();
        Integer numValueOf = Integer.valueOf(this.d);
        Integer numValueOf2 = Integer.valueOf(this.e ? 1 : 0);
        Integer numValueOf3 = Integer.valueOf(this.f ? 1 : 0);
        Object obj4 = new azgr(this).get();
        Integer numValueOf4 = Integer.valueOf(this.h);
        String str = this.i;
        String str2 = this.j;
        Integer numValueOf5 = Integer.valueOf(this.k);
        String str3 = this.l;
        Long lValueOf = Long.valueOf(this.m);
        Long lValueOf2 = Long.valueOf(this.n);
        Integer numValueOf6 = Integer.valueOf(this.o);
        Integer numValueOf7 = Integer.valueOf(this.p);
        Integer numValueOf8 = Integer.valueOf(this.q);
        String str4 = this.r;
        String str5 = this.s;
        Integer numValueOf9 = Integer.valueOf(this.t);
        String str6 = this.u;
        String str7 = this.v;
        String str8 = this.w;
        Integer numValueOf10 = Integer.valueOf(this.x ? 1 : 0);
        String strD = basd.d(this.y);
        eyga eygaVar = this.z;
        byte[] byteArray = eygaVar == null ? null : eygaVar.toByteArray();
        String str9 = this.A;
        cpyi cpyiVar = this.B;
        Object[] objArr = {obj, obj2, obj3, numValueOf, numValueOf2, numValueOf3, obj4, numValueOf4, str, str2, numValueOf5, str3, lValueOf, lValueOf2, numValueOf6, numValueOf7, numValueOf8, str4, str5, numValueOf9, str6, str7, str8, numValueOf10, strD, byteArray, str9, cpyiVar == null ? 0 : String.valueOf(cpyiVar.ordinal()), this.C, Long.valueOf(this.D)};
        sb.append('(');
        for (int i = 0; i < 30; i++) {
            Object obj5 = objArr[i];
            if (obj5 instanceof Number) {
                sb.append(String.valueOf(obj5));
            } else {
                if (obj5 instanceof String) {
                    String str10 = (String) obj5;
                    if (str10.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str10));
                    }
                }
                list.add(obj5);
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
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "BackupMessagesTable -- REDACTED") : a();
    }
}
