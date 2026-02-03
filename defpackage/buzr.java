package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class buzr extends dqpd implements dqpf {
    public long a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Uri f;
    public String g;

    protected buzr() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "VerifiedSmsBrandsTable [_id: %s,\n  brand_id: %s,\n  name: %s,\n  description: %s,\n  logo_url: %s,\n  logo_uri: %s,\n  version_token: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        dqru.v(contentValues, "brand_id", this.b);
        dqru.v(contentValues, "name", this.c);
        dqru.v(contentValues, "description", this.d);
        dqru.v(contentValues, "logo_url", this.e);
        Uri uri = this.f;
        if (uri == null) {
            contentValues.putNull("logo_uri");
        } else {
            contentValues.put("logo_uri", uri.toString());
        }
        dqru.v(contentValues, "version_token", this.g);
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bvat bvatVar = (bvat) ((bval) dqqjVar);
        aC();
        this.cN = bvatVar.cV();
        if (bvatVar.dj(0)) {
            this.a = bvatVar.c();
            fN(0);
        }
        if (bvatVar.dj(1)) {
            this.b = bvatVar.f();
            fN(1);
        }
        if (bvatVar.dj(2)) {
            this.c = bvatVar.i();
            fN(2);
        }
        if (bvatVar.dj(3)) {
            this.d = bvatVar.g();
            fN(3);
        }
        if (bvatVar.dj(4)) {
            this.e = bvatVar.h();
            fN(4);
        }
        if (bvatVar.dj(5)) {
            this.f = bvatVar.e();
            fN(5);
        }
        if (bvatVar.dj(6)) {
            this.g = bvatVar.j();
            fN(6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof buzr)) {
            return false;
        }
        buzr buzrVar = (buzr) obj;
        return super.aE(buzrVar.cN) && this.a == buzrVar.a && Objects.equals(this.b, buzrVar.b) && Objects.equals(this.c, buzrVar.c) && Objects.equals(this.d, buzrVar.d) && Objects.equals(this.e, buzrVar.e) && Objects.equals(this.f, buzrVar.f) && Objects.equals(this.g, buzrVar.g);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "verified_sms_brands", dqru.m(new String[]{"brand_id", "name", "description", "logo_url", "logo_uri", "version_token"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "verified_sms_brands";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Long.valueOf(this.a), this.b, this.c, this.d, this.e, this.f, this.g, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r10, java.util.List r11) {
        /*
            r9 = this;
            java.lang.String r0 = r9.b
            java.lang.String r1 = r9.c
            java.lang.String r2 = r9.d
            java.lang.String r3 = r9.e
            android.net.Uri r4 = r9.f
            if (r4 != 0) goto Le
            r4 = 0
            goto L12
        Le:
            java.lang.String r4 = r4.toString()
        L12:
            java.lang.String r5 = r9.g
            r6 = 6
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r8 = 0
            r7[r8] = r0
            r0 = 1
            r7[r0] = r1
            r0 = 2
            r7[r0] = r2
            r0 = 3
            r7[r0] = r3
            r0 = 4
            r7[r0] = r4
            r0 = 5
            r7[r0] = r5
            r0 = 40
            r10.append(r0)
        L2e:
            if (r8 >= r6) goto L65
            r0 = r7[r8]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L3e
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r10.append(r0)
            goto L5d
        L3e:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L55
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L55
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r10.append(r0)
            goto L5d
        L55:
            r11.add(r0)
            r0 = 63
            r10.append(r0)
        L5d:
            r0 = 44
            r10.append(r0)
            int r8 = r8 + 1
            goto L2e
        L65:
            int r11 = r10.length()
            int r11 = r11 + (-1)
            r10.setLength(r11)
            r11 = 41
            r10.append(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.buzr.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "VerifiedSmsBrandsTable -- REDACTED") : a();
    }
}
