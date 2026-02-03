package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class azry extends dqpd implements dqpf {
    public long a;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public boolean h;
    public boolean i;
    public int j;
    public boolean k;
    public int l;
    public String m;
    public String q;
    public cpyi r;
    public axcm b = null;
    public int n = -1;
    public int o = 0;
    public int p = 0;

    protected azry() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "BackupParticipantsTable [_id: %s,\n  my_identity_token_foreign_key: %s,\n  normalized_destination: %s,\n  send_destination: %s,\n  display_destination: %s,\n  first_name: %s,\n  full_name: %s,\n  is_self: %s,\n  blocked: %s,\n  participant_type: %s,\n  is_spam: %s,\n  is_spam_source: %s,\n  country_code: %s,\n  color_palette_index: %s,\n  color_type: %s,\n  extended_color: %s,\n  cms_id: %s,\n  cms_life_cycle: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l), String.valueOf(this.m), String.valueOf(this.n), String.valueOf(this.o), String.valueOf(this.p), String.valueOf(this.q), String.valueOf(this.r));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = azut.c().intValue();
        contentValues.put("_id", Long.valueOf(this.a));
        if (iIntValue >= 110) {
            axcm axcmVar = this.b;
            if (axcmVar == null || axcmVar.equals(null)) {
                contentValues.putNull("my_identity_token_foreign_key");
            } else {
                contentValues.put("my_identity_token_foreign_key", axcn.b(this.b));
            }
        }
        dqru.v(contentValues, "normalized_destination", this.c);
        dqru.v(contentValues, "send_destination", this.d);
        dqru.v(contentValues, "display_destination", this.e);
        dqru.v(contentValues, "first_name", this.f);
        dqru.v(contentValues, "full_name", this.g);
        contentValues.put("is_self", Boolean.valueOf(this.h));
        contentValues.put("blocked", Boolean.valueOf(this.i));
        contentValues.put("participant_type", Integer.valueOf(this.j));
        contentValues.put("is_spam", Boolean.valueOf(this.k));
        contentValues.put("is_spam_source", Integer.valueOf(this.l));
        dqru.v(contentValues, "country_code", this.m);
        contentValues.put("color_palette_index", Integer.valueOf(this.n));
        contentValues.put("color_type", Integer.valueOf(this.o));
        contentValues.put("extended_color", Integer.valueOf(this.p));
        dqru.v(contentValues, "cms_id", this.q);
        cpyi cpyiVar = this.r;
        if (cpyiVar == null) {
            contentValues.putNull("cms_life_cycle");
        } else {
            contentValues.put("cms_life_cycle", Integer.valueOf(cpyiVar.ordinal()));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        azui azuiVar = (azui) ((aztp) dqqjVar);
        aC();
        this.cN = azuiVar.cV();
        if (azuiVar.dj(0)) {
            this.a = azuiVar.i();
            fN(0);
        }
        if (azuiVar.dj(1)) {
            this.b = azuiVar.j();
            fN(1);
        }
        if (azuiVar.dj(2)) {
            this.c = azuiVar.q();
            fN(2);
        }
        if (azuiVar.dj(3)) {
            this.d = azuiVar.r();
            fN(3);
        }
        if (azuiVar.dj(4)) {
            this.e = azuiVar.n();
            fN(4);
        }
        if (azuiVar.dj(5)) {
            this.f = azuiVar.o();
            fN(5);
        }
        if (azuiVar.dj(6)) {
            this.g = azuiVar.p();
            fN(6);
        }
        if (azuiVar.dj(7)) {
            this.h = azuiVar.t();
            fN(7);
        }
        if (azuiVar.dj(8)) {
            this.i = azuiVar.s();
            fN(8);
        }
        if (azuiVar.dj(9)) {
            this.j = azuiVar.h();
            fN(9);
        }
        if (azuiVar.dj(10)) {
            this.k = azuiVar.u();
            fN(10);
        }
        if (azuiVar.dj(11)) {
            this.l = azuiVar.g();
            fN(11);
        }
        if (azuiVar.dj(12)) {
            this.m = azuiVar.m();
            fN(12);
        }
        if (azuiVar.dj(13)) {
            this.n = azuiVar.c();
            fN(13);
        }
        if (azuiVar.dj(14)) {
            this.o = azuiVar.e();
            fN(14);
        }
        if (azuiVar.dj(15)) {
            this.p = azuiVar.f();
            fN(15);
        }
        if (azuiVar.dj(16)) {
            this.q = azuiVar.l();
            fN(16);
        }
        if (azuiVar.dj(17)) {
            this.r = azuiVar.k();
            fN(17);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof azry)) {
            return false;
        }
        azry azryVar = (azry) obj;
        return super.aE(azryVar.cN) && this.a == azryVar.a && Objects.equals(this.b, azryVar.b) && Objects.equals(this.c, azryVar.c) && Objects.equals(this.d, azryVar.d) && Objects.equals(this.e, azryVar.e) && Objects.equals(this.f, azryVar.f) && Objects.equals(this.g, azryVar.g) && this.h == azryVar.h && this.i == azryVar.i && this.j == azryVar.j && this.k == azryVar.k && this.l == azryVar.l && Objects.equals(this.m, azryVar.m) && this.n == azryVar.n && this.o == azryVar.o && this.p == azryVar.p && Objects.equals(this.q, azryVar.q) && this.r == azryVar.r;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "participants_backup", dqru.m(new String[]{"_id", "my_identity_token_foreign_key", "normalized_destination", "send_destination", "display_destination", "first_name", "full_name", "is_self", "blocked", "participant_type", "is_spam", "is_spam_source", "country_code", "color_palette_index", "color_type", "extended_color", "cms_id", "cms_life_cycle"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "participants_backup";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        Long lValueOf = Long.valueOf(this.a);
        axcm axcmVar = this.b;
        String str = this.c;
        String str2 = this.d;
        String str3 = this.e;
        String str4 = this.f;
        String str5 = this.g;
        Boolean boolValueOf = Boolean.valueOf(this.h);
        Boolean boolValueOf2 = Boolean.valueOf(this.i);
        Integer numValueOf = Integer.valueOf(this.j);
        Boolean boolValueOf3 = Boolean.valueOf(this.k);
        Integer numValueOf2 = Integer.valueOf(this.l);
        String str6 = this.m;
        Integer numValueOf3 = Integer.valueOf(this.n);
        dqqe dqqeVar3 = dqqeVar2;
        Integer numValueOf4 = Integer.valueOf(this.o);
        Integer numValueOf5 = Integer.valueOf(this.p);
        String str7 = this.q;
        cpyi cpyiVar = this.r;
        return Objects.hash(dqqeVar3, lValueOf, axcmVar, str, str2, str3, str4, str5, boolValueOf, boolValueOf2, numValueOf, boolValueOf3, numValueOf2, str6, numValueOf3, numValueOf4, numValueOf5, str7, Integer.valueOf(cpyiVar == null ? 0 : cpyiVar.ordinal()), null);
    }

    @Override // defpackage.dqpf
    public final void i(StringBuilder sb, List list) {
        Long lValueOf = Long.valueOf(this.a);
        Object obj = new azrx(this).get();
        String str = this.c;
        String str2 = this.d;
        String str3 = this.e;
        String str4 = this.f;
        String str5 = this.g;
        Integer numValueOf = Integer.valueOf(this.h ? 1 : 0);
        Integer numValueOf2 = Integer.valueOf(this.i ? 1 : 0);
        Integer numValueOf3 = Integer.valueOf(this.j);
        Integer numValueOf4 = Integer.valueOf(this.k ? 1 : 0);
        Integer numValueOf5 = Integer.valueOf(this.l);
        String str6 = this.m;
        Integer numValueOf6 = Integer.valueOf(this.n);
        Integer numValueOf7 = Integer.valueOf(this.o);
        Integer numValueOf8 = Integer.valueOf(this.p);
        String str7 = this.q;
        cpyi cpyiVar = this.r;
        Object[] objArr = {lValueOf, obj, str, str2, str3, str4, str5, numValueOf, numValueOf2, numValueOf3, numValueOf4, numValueOf5, str6, numValueOf6, numValueOf7, numValueOf8, str7, cpyiVar == null ? 0 : String.valueOf(cpyiVar.ordinal())};
        sb.append('(');
        for (int i = 0; i < 18; i++) {
            Object obj2 = objArr[i];
            if (obj2 instanceof Number) {
                sb.append(String.valueOf(obj2));
            } else {
                if (obj2 instanceof String) {
                    String str8 = (String) obj2;
                    if (str8.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str8));
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
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "BackupParticipantsTable -- REDACTED") : a();
    }
}
