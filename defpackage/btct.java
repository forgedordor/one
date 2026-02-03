package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btct extends dqpd implements dqpf {
    public String a;
    public Uri b;
    public String c;
    public int d;
    public int e;
    public long f;

    protected btct() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "RecentExpressiveStickersTable [name: %s,\n  content_uri: %s,\n  content_type: %s,\n  width: %s,\n  height: %s,\n  last_used_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        dqru.v(contentValues, "name", this.a);
        Uri uri = this.b;
        if (uri == null) {
            contentValues.putNull("content_uri");
        } else {
            contentValues.put("content_uri", uri.toString());
        }
        dqru.v(contentValues, "content_type", this.c);
        contentValues.put("width", Integer.valueOf(this.d));
        contentValues.put("height", Integer.valueOf(this.e));
        contentValues.put("last_used_timestamp", Long.valueOf(this.f));
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        btds btdsVar = (btds) ((btdl) dqqjVar);
        aC();
        this.cN = btdsVar.cV();
        if (btdsVar.dj(0)) {
            this.a = btdsVar.i();
            fN(0);
        }
        if (btdsVar.dj(1)) {
            this.b = btdsVar.g();
            fN(1);
        }
        if (btdsVar.dj(2)) {
            this.c = btdsVar.h();
            fN(2);
        }
        if (btdsVar.dj(3)) {
            this.d = btdsVar.e();
            fN(3);
        }
        if (btdsVar.dj(4)) {
            this.e = btdsVar.c();
            fN(4);
        }
        if (btdsVar.dj(5)) {
            this.f = btdsVar.f();
            fN(5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof btct)) {
            return false;
        }
        btct btctVar = (btct) obj;
        return super.aE(btctVar.cN) && Objects.equals(this.a, btctVar.a) && Objects.equals(this.b, btctVar.b) && Objects.equals(this.c, btctVar.c) && this.d == btctVar.d && this.e == btctVar.e && this.f == btctVar.f;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "recent_expressive_stickers", dqru.m(new String[]{"name", "content_uri", "content_type", "width", "height", "last_used_timestamp"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "recent_expressive_stickers";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, this.c, Integer.valueOf(this.d), Integer.valueOf(this.e), Long.valueOf(this.f), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r10, java.util.List r11) {
        /*
            r9 = this;
            java.lang.String r0 = r9.a
            android.net.Uri r1 = r9.b
            if (r1 != 0) goto L8
            r1 = 0
            goto Lc
        L8:
            java.lang.String r1 = r1.toString()
        Lc:
            java.lang.String r2 = r9.c
            int r3 = r9.d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r9.e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            long r5 = r9.f
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
        L3a:
            if (r8 >= r6) goto L71
            r0 = r7[r8]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L4a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r10.append(r0)
            goto L69
        L4a:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L61
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L61
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r10.append(r0)
            goto L69
        L61:
            r11.add(r0)
            r0 = 63
            r10.append(r0)
        L69:
            r0 = 44
            r10.append(r0)
            int r8 = r8 + 1
            goto L3a
        L71:
            int r11 = r10.length()
            int r11 = r11 + (-1)
            r10.setLength(r11)
            r11 = 41
            r10.append(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btct.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final Uri k() {
        aA(1, "content_uri");
        return this.b;
    }

    public final String m() {
        aA(0, "name");
        return this.a;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "RecentExpressiveStickersTable -- REDACTED") : a();
    }
}
