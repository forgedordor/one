package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btzd extends dqpd implements dqpf {
    public long a;
    public String c;
    public Uri d;
    public axcm b = null;
    public boolean e = true;
    public boolean f = false;
    public long g = 0;

    protected btzd() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "SelfProfilesTable [_id: %s,\n  my_identity_token: %s,\n  limited_profile_display_name: %s,\n  photo_uri: %s,\n  is_self_profile_shareable: %s,\n  belongs_to_self_gaia: %s,\n  update_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = buat.c().intValue();
        axcm axcmVar = this.b;
        if (axcmVar == null || axcmVar.equals(null)) {
            contentValues.putNull("my_identity_token");
        } else {
            contentValues.put("my_identity_token", axcn.b(this.b));
        }
        dqru.v(contentValues, "limited_profile_display_name", this.c);
        Uri uri = this.d;
        if (uri == null) {
            contentValues.putNull("photo_uri");
        } else {
            contentValues.put("photo_uri", uri.toString());
        }
        if (iIntValue >= 60400) {
            contentValues.put("is_self_profile_shareable", Boolean.valueOf(this.e));
        }
        contentValues.put("belongs_to_self_gaia", Boolean.valueOf(this.f));
        contentValues.put("update_timestamp", Long.valueOf(this.g));
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        buag buagVar = (buag) ((btzy) dqqjVar);
        aC();
        this.cN = buagVar.cV();
        if (buagVar.dj(0)) {
            this.a = buagVar.c();
            fN(0);
        }
        if (buagVar.dj(1)) {
            this.b = buagVar.g();
            fN(1);
        }
        if (buagVar.dj(2)) {
            this.c = buagVar.h();
            fN(2);
        }
        if (buagVar.dj(3)) {
            this.d = buagVar.f();
            fN(3);
        }
        if (buagVar.dj(4)) {
            this.e = buagVar.j();
            fN(4);
        }
        if (buagVar.dj(5)) {
            this.f = buagVar.i();
            fN(5);
        }
        if (buagVar.dj(6)) {
            this.g = buagVar.e();
            fN(6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof btzd)) {
            return false;
        }
        btzd btzdVar = (btzd) obj;
        return super.aE(btzdVar.cN) && this.a == btzdVar.a && Objects.equals(this.b, btzdVar.b) && Objects.equals(this.c, btzdVar.c) && Objects.equals(this.d, btzdVar.d) && this.e == btzdVar.e && this.f == btzdVar.f && this.g == btzdVar.g;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "self_profiles", dqru.m(new String[]{"my_identity_token", "limited_profile_display_name", "photo_uri", "is_self_profile_shareable", "belongs_to_self_gaia", "update_timestamp"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "self_profiles";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Long.valueOf(this.a), this.b, this.c, this.d, Boolean.valueOf(this.e), Boolean.valueOf(this.f), Long.valueOf(this.g), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r10, java.util.List r11) {
        /*
            r9 = this;
            btzc r0 = new btzc
            r0.<init>(r9)
            java.lang.Object r0 = r0.get()
            java.lang.String r1 = r9.c
            android.net.Uri r2 = r9.d
            if (r2 != 0) goto L11
            r2 = 0
            goto L15
        L11:
            java.lang.String r2 = r2.toString()
        L15:
            boolean r3 = r9.e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r4 = r9.f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            long r5 = r9.g
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
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
        L41:
            if (r8 >= r6) goto L78
            r0 = r7[r8]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L51
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r10.append(r0)
            goto L70
        L51:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L68
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L68
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r10.append(r0)
            goto L70
        L68:
            r11.add(r0)
            r0 = 63
            r10.append(r0)
        L70:
            r0 = 44
            r10.append(r0)
            int r8 = r8 + 1
            goto L41
        L78:
            int r11 = r10.length()
            int r11 = r11 + (-1)
            r10.setLength(r11)
            r11 = 41
            r10.append(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btzd.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final long k() {
        aA(0, "_id");
        return this.a;
    }

    public final long m() {
        aA(6, "update_timestamp");
        return this.g;
    }

    public final Uri n() {
        aA(3, "photo_uri");
        return this.d;
    }

    public final axcm o() {
        aA(1, "my_identity_token");
        return this.b;
    }

    public final String p() {
        aA(2, "limited_profile_display_name");
        return this.c;
    }

    public final boolean q() {
        aA(5, "belongs_to_self_gaia");
        return this.f;
    }

    public final boolean r() {
        aA(4, "is_self_profile_shareable");
        return this.e;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "SelfProfilesTable -- REDACTED") : a();
    }
}
