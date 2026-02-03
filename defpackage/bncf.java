package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.net.Uri;
import defpackage.dqpd;
import j$.time.Instant;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bncf extends dqpd<bndx, bnez, bnfb, bncf, bndw> implements dqpf<Long> {
    public long a;
    public long b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public Uri h;
    public Uri i;
    public String j;
    public String k;
    public Instant l = Instant.EPOCH;
    public String m;
    public String n;
    public long o;
    public long p;
    public String q;
    public String r;
    public String s;

    protected bncf() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "ContactsTable [cp2_id: %s,\n  contact_id: %s,\n  lookup_key: %s,\n  phone_number: %s,\n  display_name: %s,\n  given_name: %s,\n  family_name: %s,\n  photo: %s,\n  thumbnail: %s,\n  birthday: %s,\n  anniversary: %s,\n  last_updated_timestamp: %s,\n  sort_key: %s,\n  phonebook_label: %s,\n  phonebook_bucket: %s,\n  contact_type: %s,\n  type_label: %s,\n  display_destination: %s,\n  contact_fingerprint: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l), String.valueOf(this.m), String.valueOf(this.n), String.valueOf(this.o), String.valueOf(this.p), String.valueOf(this.q), String.valueOf(this.r), String.valueOf(this.s));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = bnfe.c().intValue();
        dqru.u(contentValues, "cp2_id", this.a);
        contentValues.put("contact_id", Long.valueOf(this.b));
        dqru.v(contentValues, "lookup_key", this.c);
        dqru.v(contentValues, "phone_number", this.d);
        dqru.v(contentValues, "display_name", this.e);
        dqru.v(contentValues, "given_name", this.f);
        dqru.v(contentValues, "family_name", this.g);
        Uri uri = this.h;
        if (uri == null) {
            contentValues.putNull("photo");
        } else {
            contentValues.put("photo", uri.toString());
        }
        Uri uri2 = this.i;
        if (uri2 == null) {
            contentValues.putNull("thumbnail");
        } else {
            contentValues.put("thumbnail", uri2.toString());
        }
        dqru.v(contentValues, "birthday", this.j);
        dqru.v(contentValues, "anniversary", this.k);
        Instant instant = this.l;
        if (instant == null) {
            contentValues.putNull("last_updated_timestamp");
        } else {
            contentValues.put("last_updated_timestamp", Long.valueOf(bart.a(instant)));
        }
        if (iIntValue >= 59070) {
            dqru.v(contentValues, "sort_key", this.m);
        }
        if (iIntValue >= 59070) {
            dqru.v(contentValues, "phonebook_label", this.n);
        }
        if (iIntValue >= 59070) {
            contentValues.put("phonebook_bucket", Long.valueOf(this.o));
        }
        if (iIntValue >= 59080) {
            contentValues.put("contact_type", Long.valueOf(this.p));
        }
        if (iIntValue >= 60150) {
            dqru.v(contentValues, "type_label", this.q);
        }
        if (iIntValue >= 59120) {
            dqru.v(contentValues, "display_destination", this.r);
        }
        if (iIntValue >= 60690) {
            dqru.v(contentValues, "contact_fingerprint", this.s);
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bner bnerVar = (bner) ((bndx) dqqjVar);
        aC();
        this.cN = bnerVar.cV();
        if (bnerVar.dj(0)) {
            this.a = bnerVar.j();
            fN(0);
        }
        if (bnerVar.dj(1)) {
            this.b = bnerVar.c();
            fN(1);
        }
        if (bnerVar.dj(2)) {
            this.c = bnerVar.g();
            fN(2);
        }
        if (bnerVar.dj(3)) {
            this.d = bnerVar.t();
            fN(3);
        }
        if (bnerVar.dj(4)) {
            this.e = bnerVar.f();
            fN(4);
        }
        if (bnerVar.dj(5)) {
            this.f = bnerVar.s();
            fN(5);
        }
        if (bnerVar.dj(6)) {
            this.g = bnerVar.r();
            fN(6);
        }
        if (bnerVar.dj(7)) {
            this.h = bnerVar.e();
            fN(7);
        }
        if (bnerVar.dj(8)) {
            this.i = bnerVar.l();
            fN(8);
        }
        if (bnerVar.dj(9)) {
            this.j = bnerVar.o();
            fN(9);
        }
        if (bnerVar.dj(10)) {
            this.k = bnerVar.n();
            fN(10);
        }
        if (bnerVar.dj(11)) {
            this.l = bnerVar.m();
            fN(11);
        }
        if (bnerVar.dj(12)) {
            this.m = bnerVar.u();
            fN(12);
        }
        if (bnerVar.dj(13)) {
            this.n = bnerVar.h();
            fN(13);
        }
        if (bnerVar.dj(14)) {
            this.o = bnerVar.k();
            fN(14);
        }
        if (bnerVar.dj(15)) {
            this.p = bnerVar.i();
            fN(15);
        }
        if (bnerVar.dj(16)) {
            this.q = bnerVar.v();
            fN(16);
        }
        if (bnerVar.dj(17)) {
            this.r = bnerVar.q();
            fN(17);
        }
        if (bnerVar.dj(18)) {
            this.s = bnerVar.p();
            fN(18);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bncf)) {
            return false;
        }
        bncf bncfVar = (bncf) obj;
        return super.aE(bncfVar.cN) && this.a == bncfVar.a && this.b == bncfVar.b && Objects.equals(this.c, bncfVar.c) && Objects.equals(this.d, bncfVar.d) && Objects.equals(this.e, bncfVar.e) && Objects.equals(this.f, bncfVar.f) && Objects.equals(this.g, bncfVar.g) && Objects.equals(this.h, bncfVar.h) && Objects.equals(this.i, bncfVar.i) && Objects.equals(this.j, bncfVar.j) && Objects.equals(this.k, bncfVar.k) && Objects.equals(this.l, bncfVar.l) && Objects.equals(this.m, bncfVar.m) && Objects.equals(this.n, bncfVar.n) && this.o == bncfVar.o && this.p == bncfVar.p && Objects.equals(this.q, bncfVar.q) && Objects.equals(this.r, bncfVar.r) && Objects.equals(this.s, bncfVar.s);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "contacts", dqru.m(new String[]{"cp2_id", "contact_id", "lookup_key", "phone_number", "display_name", "given_name", "family_name", "photo", "thumbnail", "birthday", "anniversary", "last_updated_timestamp", "sort_key", "phonebook_label", "phonebook_bucket", "contact_type", "type_label", "display_destination", "contact_fingerprint"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "contacts";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Long.valueOf(this.a), Long.valueOf(this.b), this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, Long.valueOf(this.o), Long.valueOf(this.p), this.q, this.r, this.s, null);
    }

    @Override // defpackage.dqpf
    public final void i(StringBuilder sb, List list) {
        Long lValueOf = Long.valueOf(this.a);
        Long lValueOf2 = Long.valueOf(this.b);
        String str = this.c;
        String str2 = this.d;
        String str3 = this.e;
        String str4 = this.f;
        String str5 = this.g;
        Uri uri = this.h;
        String string = uri == null ? null : uri.toString();
        Uri uri2 = this.i;
        Object[] objArr = {lValueOf, lValueOf2, str, str2, str3, str4, str5, string, uri2 != null ? uri2.toString() : null, this.j, this.k, Long.valueOf(bart.a(this.l)), this.m, this.n, Long.valueOf(this.o), Long.valueOf(this.p), this.q, this.r, this.s};
        sb.append('(');
        for (int i = 0; i < 19; i++) {
            Object obj = objArr[i];
            if (obj instanceof Number) {
                sb.append(String.valueOf(obj));
            } else {
                if (obj instanceof String) {
                    String str6 = (String) obj;
                    if (str6.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str6));
                    }
                }
                list.add(obj);
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

    public final Uri k() {
        aA(7, "photo");
        return this.h;
    }

    public final String m() {
        aA(2, "lookup_key");
        return this.c;
    }

    public final String n() {
        aA(3, "phone_number");
        return this.d;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "ContactsTable -- REDACTED") : a();
    }
}
