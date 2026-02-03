package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.net.Uri;
import defpackage.dqpd;
import j$.time.Instant;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class awqe extends dqpd implements dqpf {
    public awpy b;
    public String c;
    public String d;
    public Uri e;
    public byte[] g;
    public Uri k;
    public awjl a = null;
    public awmu f = awmu.a;
    public cigb h = new cigb(0);
    public Instant i = bart.b(0);
    public Instant j = bart.b(0);

    protected awqe() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        Locale locale = Locale.US;
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.c);
        String strValueOf4 = String.valueOf(this.d);
        String strValueOf5 = String.valueOf(this.e);
        String strValueOf6 = String.valueOf(this.f);
        byte[] bArr = this.g;
        return String.format(locale, "GroupsTable [token: %s,\n  group_type: %s,\n  rcs_conference_uri: %s,\n  name: %s,\n  rcs_icon_url: %s,\n  rcs_group_state: %s,\n  tachygram_group_routing_token: %s,\n  rcs_group_capabilities: %s,\n  rcs_group_last_sync_timestamp: %s,\n  rcs_name_last_change_timestamp: %s,\n  rcs_join_link_url: %s\n]\n", strValueOf, strValueOf2, strValueOf3, strValueOf4, strValueOf5, strValueOf6, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = awse.c().intValue();
        awjl awjlVar = this.a;
        if (awjlVar == null || awjlVar.equals(null)) {
            contentValues.putNull("token");
        } else {
            contentValues.put("token", awjm.b(this.a));
        }
        awpy awpyVar = this.b;
        if (awpyVar == null) {
            contentValues.putNull("group_type");
        } else {
            contentValues.put("group_type", Integer.valueOf(awpyVar.ordinal()));
        }
        dqru.v(contentValues, "rcs_conference_uri", this.c);
        dqru.v(contentValues, "name", this.d);
        Uri uri = this.e;
        if (uri == null) {
            contentValues.putNull("rcs_icon_url");
        } else {
            contentValues.put("rcs_icon_url", uri.toString());
        }
        awmu awmuVar = this.f;
        if (awmuVar == null) {
            contentValues.putNull("rcs_group_state");
        } else {
            contentValues.put("rcs_group_state", Integer.valueOf(awmuVar.ordinal()));
        }
        contentValues.put("tachygram_group_routing_token", this.g);
        cigb cigbVar = this.h;
        if (cigbVar == null) {
            contentValues.putNull("rcs_group_capabilities");
        } else {
            contentValues.put("rcs_group_capabilities", Long.valueOf(cigbVar.a));
        }
        Instant instant = this.i;
        if (instant == null) {
            contentValues.putNull("rcs_group_last_sync_timestamp");
        } else {
            contentValues.put("rcs_group_last_sync_timestamp", Long.valueOf(bart.a(instant)));
        }
        if (iIntValue >= 60850) {
            Instant instant2 = this.j;
            if (instant2 == null) {
                contentValues.putNull("rcs_name_last_change_timestamp");
            } else {
                contentValues.put("rcs_name_last_change_timestamp", Long.valueOf(bart.a(instant2)));
            }
        }
        if (iIntValue >= 60940) {
            Uri uri2 = this.k;
            if (uri2 == null) {
                contentValues.putNull("rcs_join_link_url");
            } else {
                contentValues.put("rcs_join_link_url", uri2.toString());
            }
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        awrv awrvVar = (awrv) ((awrj) dqqjVar);
        aC();
        this.cN = awrvVar.cV();
        if (awrvVar.dj(0)) {
            this.a = awrvVar.f();
            fN(0);
        }
        if (awrvVar.dj(1)) {
            this.b = awrvVar.h();
            fN(1);
        }
        if (awrvVar.dj(2)) {
            this.c = awrvVar.m();
            fN(2);
        }
        if (awrvVar.dj(3)) {
            this.d = awrvVar.l();
            fN(3);
        }
        if (awrvVar.dj(4)) {
            this.e = awrvVar.c();
            fN(4);
        }
        if (awrvVar.dj(5)) {
            this.f = awrvVar.g();
            fN(5);
        }
        if (awrvVar.dj(6)) {
            this.g = awrvVar.n();
            fN(6);
        }
        if (awrvVar.dj(7)) {
            this.h = awrvVar.i();
            fN(7);
        }
        if (awrvVar.dj(8)) {
            this.i = awrvVar.j();
            fN(8);
        }
        if (awrvVar.dj(9)) {
            this.j = awrvVar.k();
            fN(9);
        }
        if (awrvVar.dj(10)) {
            this.k = awrvVar.e();
            fN(10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof awqe)) {
            return false;
        }
        awqe awqeVar = (awqe) obj;
        return super.aE(awqeVar.cN) && Objects.equals(this.a, awqeVar.a) && this.b == awqeVar.b && Objects.equals(this.c, awqeVar.c) && Objects.equals(this.d, awqeVar.d) && Objects.equals(this.e, awqeVar.e) && this.f == awqeVar.f && Arrays.equals(this.g, awqeVar.g) && Objects.equals(this.h, awqeVar.h) && Objects.equals(this.i, awqeVar.i) && Objects.equals(this.j, awqeVar.j) && Objects.equals(this.k, awqeVar.k);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "groups", dqru.m(new String[]{"token", "group_type", "rcs_conference_uri", "name", "rcs_icon_url", "rcs_group_state", "tachygram_group_routing_token", "rcs_group_capabilities", "rcs_group_last_sync_timestamp", "rcs_name_last_change_timestamp", "rcs_join_link_url"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "groups";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        awjl awjlVar = this.a;
        awpy awpyVar = this.b;
        Integer numValueOf = Integer.valueOf(awpyVar == null ? 0 : awpyVar.ordinal());
        String str = this.c;
        String str2 = this.d;
        Uri uri = this.e;
        awmu awmuVar = this.f;
        return Objects.hash(dqqeVar2, awjlVar, numValueOf, str, str2, uri, Integer.valueOf(awmuVar == null ? 0 : awmuVar.ordinal()), Integer.valueOf(Arrays.hashCode(this.g)), this.h, this.i, this.j, this.k, null);
    }

    @Override // defpackage.dqpf
    public final void i(StringBuilder sb, List list) {
        Object obj = new awqd(this).get();
        awpy awpyVar = this.b;
        Object objValueOf = awpyVar == null ? objValueOf : String.valueOf(awpyVar.ordinal());
        String str = this.c;
        String str2 = this.d;
        Uri uri = this.e;
        String string = uri == null ? null : uri.toString();
        awmu awmuVar = this.f;
        objValueOf = awmuVar != null ? String.valueOf(awmuVar.ordinal()) : 0;
        byte[] bArr = this.g;
        Long lValueOf = Long.valueOf(this.h.a);
        Long lValueOf2 = Long.valueOf(bart.a(this.i));
        Long lValueOf3 = Long.valueOf(bart.a(this.j));
        Uri uri2 = this.k;
        Object[] objArr = {obj, objValueOf, str, str2, string, objValueOf, bArr, lValueOf, lValueOf2, lValueOf3, uri2 != null ? uri2.toString() : null};
        sb.append('(');
        for (int i = 0; i < 11; i++) {
            Object obj2 = objArr[i];
            if (obj2 instanceof Number) {
                sb.append(String.valueOf(obj2));
            } else {
                if (obj2 instanceof String) {
                    String str3 = (String) obj2;
                    if (str3.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str3));
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
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "GroupsTable -- REDACTED") : a();
    }
}
