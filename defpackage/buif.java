package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class buif extends dqpd implements dqpf {
    public long a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g = 0;

    protected buif() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "StickersTable [_id: %s,\n  sticker_set_id: %s,\n  sticker_id: %s,\n  icon_uri_static: %s,\n  icon_uri_animated: %s,\n  display_name: %s,\n  display_order: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        dqru.v(contentValues, "sticker_set_id", this.b);
        dqru.v(contentValues, "sticker_id", this.c);
        dqru.v(contentValues, "icon_uri_static", this.d);
        dqru.v(contentValues, "icon_uri_animated", this.e);
        dqru.v(contentValues, "display_name", this.f);
        contentValues.put("display_order", Integer.valueOf(this.g));
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        buji bujiVar = (buji) ((buja) dqqjVar);
        aC();
        this.cN = bujiVar.cV();
        if (bujiVar.dj(0)) {
            this.a = bujiVar.e();
            fN(0);
        }
        if (bujiVar.dj(1)) {
            this.b = bujiVar.j();
            fN(1);
        }
        if (bujiVar.dj(2)) {
            this.c = bujiVar.i();
            fN(2);
        }
        if (bujiVar.dj(3)) {
            this.d = bujiVar.h();
            fN(3);
        }
        if (bujiVar.dj(4)) {
            this.e = bujiVar.g();
            fN(4);
        }
        if (bujiVar.dj(5)) {
            this.f = bujiVar.f();
            fN(5);
        }
        if (bujiVar.dj(6)) {
            this.g = bujiVar.c();
            fN(6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof buif)) {
            return false;
        }
        buif buifVar = (buif) obj;
        return super.aE(buifVar.cN) && this.a == buifVar.a && Objects.equals(this.b, buifVar.b) && Objects.equals(this.c, buifVar.c) && Objects.equals(this.d, buifVar.d) && Objects.equals(this.e, buifVar.e) && Objects.equals(this.f, buifVar.f) && this.g == buifVar.g;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "stickers", dqru.m(new String[]{"sticker_set_id", "sticker_id", "icon_uri_static", "icon_uri_animated", "display_name", "display_order"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "stickers";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Long.valueOf(this.a), this.b, this.c, this.d, this.e, this.f, Integer.valueOf(this.g), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
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
            java.lang.String r4 = r9.f
            int r5 = r9.g
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
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
        L2a:
            if (r8 >= r6) goto L61
            r0 = r7[r8]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L3a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r10.append(r0)
            goto L59
        L3a:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L51
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L51
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r10.append(r0)
            goto L59
        L51:
            r11.add(r0)
            r0 = 63
            r10.append(r0)
        L59:
            r0 = 44
            r10.append(r0)
            int r8 = r8 + 1
            goto L2a
        L61:
            int r11 = r10.length()
            int r11 = r11 + (-1)
            r10.setLength(r11)
            r11 = 41
            r10.append(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.buif.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "StickersTable -- REDACTED") : a();
    }
}
