package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btei extends dqpd implements dqpf {
    public Uri a;
    public Uri b;
    public String c;
    public String d;
    public int e;
    public int f;
    public long g;

    protected btei() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "RecentGifsTable [original_image_url: %s,\n  content_uri: %s,\n  domain: %s,\n  image_search_url: %s,\n  width: %s,\n  height: %s,\n  last_used_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        Uri uri = this.a;
        if (uri == null) {
            contentValues.putNull("original_image_url");
        } else {
            contentValues.put("original_image_url", uri.toString());
        }
        Uri uri2 = this.b;
        if (uri2 == null) {
            contentValues.putNull("content_uri");
        } else {
            contentValues.put("content_uri", uri2.toString());
        }
        dqru.v(contentValues, "domain", this.c);
        dqru.v(contentValues, "image_search_url", this.d);
        contentValues.put("width", Integer.valueOf(this.e));
        contentValues.put("height", Integer.valueOf(this.f));
        contentValues.put("last_used_timestamp", Long.valueOf(this.g));
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        btfk btfkVar = (btfk) ((btfc) dqqjVar);
        aC();
        this.cN = btfkVar.cV();
        if (btfkVar.dj(0)) {
            this.a = btfkVar.h();
            fN(0);
        }
        if (btfkVar.dj(1)) {
            this.b = btfkVar.g();
            fN(1);
        }
        if (btfkVar.dj(2)) {
            this.c = btfkVar.i();
            fN(2);
        }
        if (btfkVar.dj(3)) {
            this.d = btfkVar.j();
            fN(3);
        }
        if (btfkVar.dj(4)) {
            this.e = btfkVar.e();
            fN(4);
        }
        if (btfkVar.dj(5)) {
            this.f = btfkVar.c();
            fN(5);
        }
        if (btfkVar.dj(6)) {
            this.g = btfkVar.f();
            fN(6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof btei)) {
            return false;
        }
        btei bteiVar = (btei) obj;
        return super.aE(bteiVar.cN) && Objects.equals(this.a, bteiVar.a) && Objects.equals(this.b, bteiVar.b) && Objects.equals(this.c, bteiVar.c) && Objects.equals(this.d, bteiVar.d) && this.e == bteiVar.e && this.f == bteiVar.f && this.g == bteiVar.g;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "recent_gifs", dqru.m(new String[]{"original_image_url", "content_uri", "domain", "image_search_url", "width", "height", "last_used_timestamp"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "recent_gifs";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, this.c, this.d, Integer.valueOf(this.e), Integer.valueOf(this.f), Long.valueOf(this.g), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r11, java.util.List r12) {
        /*
            r10 = this;
            android.net.Uri r0 = r10.a
            r1 = 0
            if (r0 != 0) goto L7
            r0 = r1
            goto Lb
        L7:
            java.lang.String r0 = r0.toString()
        Lb:
            android.net.Uri r2 = r10.b
            if (r2 != 0) goto L10
            goto L14
        L10:
            java.lang.String r1 = r2.toString()
        L14:
            java.lang.String r2 = r10.c
            java.lang.String r3 = r10.d
            int r4 = r10.e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r5 = r10.f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            long r6 = r10.g
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r7 = 7
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r9 = 0
            r8[r9] = r0
            r0 = 1
            r8[r0] = r1
            r0 = 2
            r8[r0] = r2
            r0 = 3
            r8[r0] = r3
            r0 = 4
            r8[r0] = r4
            r0 = 5
            r8[r0] = r5
            r0 = 6
            r8[r0] = r6
            r0 = 40
            r11.append(r0)
        L47:
            if (r9 >= r7) goto L7e
            r0 = r8[r9]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L57
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r11.append(r0)
            goto L76
        L57:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L6e
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L6e
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r11.append(r0)
            goto L76
        L6e:
            r12.add(r0)
            r0 = 63
            r11.append(r0)
        L76:
            r0 = 44
            r11.append(r0)
            int r9 = r9 + 1
            goto L47
        L7e:
            int r12 = r11.length()
            int r12 = r12 + (-1)
            r11.setLength(r12)
            r12 = 41
            r11.append(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btei.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final Uri k() {
        aA(1, "content_uri");
        return this.b;
    }

    public final Uri m() {
        aA(0, "original_image_url");
        return this.a;
    }

    public final String n() {
        aA(2, "domain");
        return this.c;
    }

    public final String o() {
        aA(3, "image_search_url");
        return this.d;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "RecentGifsTable -- REDACTED") : a();
    }
}
