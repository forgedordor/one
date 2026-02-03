package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class aywg extends dqpd implements dqpf {
    public String c;
    public long e;
    public String f;
    public String g;
    public boolean i;
    public String j;
    public String k;
    public String l;
    public long o;
    public int p;
    public int q;
    public String s;
    public cpyi t;
    public ConversationIdType a = barn.a;
    public axcm b = null;
    public bvdk d = bvdk.UNARCHIVED;
    public bvdp h = bvdp.NAME_IS_AUTOMATIC;
    public cigb m = cigb.b();
    public avoe n = avoe.b(0);
    public int r = 0;

    protected aywg() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "BackupConversationsTable [_id: %s,\n  current_my_identity: %s,\n  snippet_text: %s,\n  archive_status: %s,\n  most_recent_timestamp_ms: %s,\n  subject: %s,\n  name: %s,\n  name_is_automatic: %s,\n  has_rbm_participant: %s,\n  rcs_group_self_msisdn: %s,\n  rcs_group_id: %s,\n  rcs_conference_uri: %s,\n  rcs_group_capabilities: %s,\n  error_state: %s,\n  rcs_subject_change_timestamp_ms: %s,\n  join_state: %s,\n  conversation_type: %s,\n  send_mode: %s,\n  cms_id: %s,\n  cms_life_cycle: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l), String.valueOf(this.m), String.valueOf(this.n), String.valueOf(this.o), String.valueOf(this.p), String.valueOf(this.q), String.valueOf(this.r), String.valueOf(this.s), String.valueOf(this.t));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = ayzh.c().intValue();
        ConversationIdType conversationIdType = this.a;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            contentValues.putNull("_id");
        } else {
            contentValues.put("_id", Long.valueOf(barn.a(this.a)));
        }
        if (iIntValue >= 110) {
            axcm axcmVar = this.b;
            if (axcmVar == null || axcmVar.equals(null)) {
                contentValues.putNull("current_my_identity");
            } else {
                contentValues.put("current_my_identity", axcn.b(this.b));
            }
        }
        dqru.v(contentValues, "snippet_text", this.c);
        bvdk bvdkVar = this.d;
        if (bvdkVar == null) {
            contentValues.putNull("archive_status");
        } else {
            contentValues.put("archive_status", Integer.valueOf(bvdkVar.h));
        }
        contentValues.put("most_recent_timestamp_ms", Long.valueOf(this.e));
        dqru.v(contentValues, "subject", this.f);
        dqru.v(contentValues, "name", this.g);
        bvdp bvdpVar = this.h;
        if (bvdpVar == null) {
            contentValues.putNull("name_is_automatic");
        } else {
            contentValues.put("name_is_automatic", Integer.valueOf(bvdpVar.ordinal()));
        }
        contentValues.put("has_rbm_participant", Boolean.valueOf(this.i));
        dqru.v(contentValues, "rcs_group_self_msisdn", this.j);
        dqru.v(contentValues, "rcs_group_id", this.k);
        dqru.v(contentValues, "rcs_conference_uri", this.l);
        cigb cigbVar = this.m;
        if (cigbVar == null) {
            contentValues.putNull("rcs_group_capabilities");
        } else {
            contentValues.put("rcs_group_capabilities", Long.valueOf(cigbVar.a));
        }
        avoe avoeVar = this.n;
        if (avoeVar == null) {
            contentValues.putNull("error_state");
        } else {
            contentValues.put("error_state", Integer.valueOf(avoeVar.a()));
        }
        contentValues.put("rcs_subject_change_timestamp_ms", Long.valueOf(this.o));
        contentValues.put("join_state", Integer.valueOf(this.p));
        contentValues.put("conversation_type", Integer.valueOf(this.q));
        contentValues.put("send_mode", Integer.valueOf(this.r));
        dqru.v(contentValues, "cms_id", this.s);
        cpyi cpyiVar = this.t;
        if (cpyiVar == null) {
            contentValues.putNull("cms_life_cycle");
        } else {
            contentValues.put("cms_life_cycle", Integer.valueOf(cpyiVar.ordinal()));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        ayyw ayywVar = (ayyw) ((ayyb) dqqjVar);
        aC();
        this.cN = ayywVar.cV();
        if (ayywVar.dj(0)) {
            this.a = ayywVar.k();
            fN(0);
        }
        if (ayywVar.dj(1)) {
            this.b = ayywVar.j();
            fN(1);
        }
        if (ayywVar.dj(2)) {
            this.c = ayywVar.u();
            fN(2);
        }
        if (ayywVar.dj(3)) {
            this.d = ayywVar.l();
            fN(3);
        }
        if (ayywVar.dj(4)) {
            this.e = ayywVar.g();
            fN(4);
        }
        if (ayywVar.dj(5)) {
            this.f = ayywVar.v();
            fN(5);
        }
        if (ayywVar.dj(6)) {
            this.g = ayywVar.q();
            fN(6);
        }
        if (ayywVar.dj(7)) {
            this.h = ayywVar.m();
            fN(7);
        }
        if (ayywVar.dj(8)) {
            this.i = ayywVar.w();
            fN(8);
        }
        if (ayywVar.dj(9)) {
            this.j = ayywVar.t();
            fN(9);
        }
        if (ayywVar.dj(10)) {
            this.k = ayywVar.s();
            fN(10);
        }
        if (ayywVar.dj(11)) {
            this.l = ayywVar.r();
            fN(11);
        }
        if (ayywVar.dj(12)) {
            this.m = ayywVar.n();
            fN(12);
        }
        if (ayywVar.dj(13)) {
            this.n = ayywVar.i();
            fN(13);
        }
        if (ayywVar.dj(14)) {
            this.o = ayywVar.h();
            fN(14);
        }
        if (ayywVar.dj(15)) {
            this.p = ayywVar.e();
            fN(15);
        }
        if (ayywVar.dj(16)) {
            this.q = ayywVar.c();
            fN(16);
        }
        if (ayywVar.dj(17)) {
            this.r = ayywVar.f();
            fN(17);
        }
        if (ayywVar.dj(18)) {
            this.s = ayywVar.p();
            fN(18);
        }
        if (ayywVar.dj(19)) {
            this.t = ayywVar.o();
            fN(19);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aywg)) {
            return false;
        }
        aywg aywgVar = (aywg) obj;
        return super.aE(aywgVar.cN) && Objects.equals(this.a, aywgVar.a) && Objects.equals(this.b, aywgVar.b) && Objects.equals(this.c, aywgVar.c) && this.d == aywgVar.d && this.e == aywgVar.e && Objects.equals(this.f, aywgVar.f) && Objects.equals(this.g, aywgVar.g) && this.h == aywgVar.h && this.i == aywgVar.i && Objects.equals(this.j, aywgVar.j) && Objects.equals(this.k, aywgVar.k) && Objects.equals(this.l, aywgVar.l) && Objects.equals(this.m, aywgVar.m) && this.n == aywgVar.n && this.o == aywgVar.o && this.p == aywgVar.p && this.q == aywgVar.q && this.r == aywgVar.r && Objects.equals(this.s, aywgVar.s) && this.t == aywgVar.t;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversations_backup", dqru.m(new String[]{"_id", "current_my_identity", "snippet_text", "archive_status", "most_recent_timestamp_ms", "subject", "name", "name_is_automatic", "has_rbm_participant", "rcs_group_self_msisdn", "rcs_group_id", "rcs_conference_uri", "rcs_group_capabilities", "error_state", "rcs_subject_change_timestamp_ms", "join_state", "conversation_type", "send_mode", "cms_id", "cms_life_cycle"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "conversations_backup";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        ConversationIdType conversationIdType = this.a;
        axcm axcmVar = this.b;
        String str = this.c;
        bvdk bvdkVar = this.d;
        Long lValueOf = Long.valueOf(this.e);
        String str2 = this.f;
        String str3 = this.g;
        bvdp bvdpVar = this.h;
        Integer numValueOf = Integer.valueOf(bvdpVar == null ? 0 : bvdpVar.ordinal());
        Boolean boolValueOf = Boolean.valueOf(this.i);
        String str4 = this.j;
        String str5 = this.k;
        String str6 = this.l;
        cigb cigbVar = this.m;
        avoe avoeVar = this.n;
        dqqe dqqeVar3 = dqqeVar2;
        Long lValueOf2 = Long.valueOf(this.o);
        Integer numValueOf2 = Integer.valueOf(this.p);
        Integer numValueOf3 = Integer.valueOf(this.q);
        Integer numValueOf4 = Integer.valueOf(this.r);
        String str7 = this.s;
        cpyi cpyiVar = this.t;
        return Objects.hash(dqqeVar3, conversationIdType, axcmVar, str, bvdkVar, lValueOf, str2, str3, numValueOf, boolValueOf, str4, str5, str6, cigbVar, avoeVar, lValueOf2, numValueOf2, numValueOf3, numValueOf4, str7, Integer.valueOf(cpyiVar == null ? 0 : cpyiVar.ordinal()), null);
    }

    @Override // defpackage.dqpf
    public final void i(StringBuilder sb, List list) {
        Object obj = new aywe(this).get();
        Object obj2 = new aywf(this).get();
        String str = this.c;
        bvdk bvdkVar = this.d;
        Object objValueOf = bvdkVar == null ? 0 : String.valueOf(bvdkVar.h);
        Long lValueOf = Long.valueOf(this.e);
        String str2 = this.f;
        String str3 = this.g;
        bvdp bvdpVar = this.h;
        Object objValueOf2 = bvdpVar == null ? 0 : String.valueOf(bvdpVar.ordinal());
        Integer numValueOf = Integer.valueOf(this.i ? 1 : 0);
        String str4 = this.j;
        String str5 = this.k;
        String str6 = this.l;
        Long lValueOf2 = Long.valueOf(this.m.a);
        avoe avoeVar = this.n;
        Object objValueOf3 = avoeVar == null ? 0 : String.valueOf(avoeVar.a());
        Long lValueOf3 = Long.valueOf(this.o);
        Integer numValueOf2 = Integer.valueOf(this.p);
        Integer numValueOf3 = Integer.valueOf(this.q);
        Integer numValueOf4 = Integer.valueOf(this.r);
        String str7 = this.s;
        cpyi cpyiVar = this.t;
        Object[] objArr = {obj, obj2, str, objValueOf, lValueOf, str2, str3, objValueOf2, numValueOf, str4, str5, str6, lValueOf2, objValueOf3, lValueOf3, numValueOf2, numValueOf3, numValueOf4, str7, cpyiVar != null ? String.valueOf(cpyiVar.ordinal()) : 0};
        sb.append('(');
        for (int i = 0; i < 20; i++) {
            Object obj3 = objArr[i];
            if (obj3 instanceof Number) {
                sb.append(String.valueOf(obj3));
            } else {
                if (obj3 instanceof String) {
                    String str8 = (String) obj3;
                    if (str8.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str8));
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

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "BackupConversationsTable -- REDACTED") : a();
    }
}
