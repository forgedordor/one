package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bmvl extends dqpd implements dqpf {
    public String a;
    public long b;
    public String c;
    public String d;
    public String e;
    public String f;
    public long g = 0;
    public long h = 0;

    protected bmvl() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "CmsNotificationsTable [cms_id: %s,\n  cms_last_mod_seq: %s,\n  cms_correlation_id: %s,\n  from_address: %s,\n  to_address: %s,\n  correlation_text: %s,\n  modified_at_timestamp: %s,\n  message_received_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = bmxa.c().intValue();
        dqru.v(contentValues, "cms_id", this.a);
        contentValues.put("cms_last_mod_seq", Long.valueOf(this.b));
        dqru.v(contentValues, "cms_correlation_id", this.c);
        dqru.v(contentValues, "from_address", this.d);
        dqru.v(contentValues, "to_address", this.e);
        dqru.v(contentValues, "correlation_text", this.f);
        contentValues.put("modified_at_timestamp", Long.valueOf(this.g));
        if (iIntValue >= 46040) {
            contentValues.put("message_received_timestamp", Long.valueOf(this.h));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bmwq bmwqVar = (bmwq) ((bmwh) dqqjVar);
        aC();
        this.cN = bmwqVar.cV();
        if (bmwqVar.dj(0)) {
            this.a = bmwqVar.f();
            fN(0);
        }
        if (bmwqVar.dj(1)) {
            this.b = bmwqVar.c();
            fN(1);
        }
        if (bmwqVar.dj(2)) {
            this.c = bmwqVar.h();
            fN(2);
        }
        if (bmwqVar.dj(3)) {
            this.d = bmwqVar.j();
            fN(3);
        }
        if (bmwqVar.dj(4)) {
            this.e = bmwqVar.k();
            fN(4);
        }
        if (bmwqVar.dj(5)) {
            this.f = bmwqVar.i();
            fN(5);
        }
        if (bmwqVar.dj(6)) {
            this.g = bmwqVar.g();
            fN(6);
        }
        if (bmwqVar.dj(7)) {
            this.h = bmwqVar.e();
            fN(7);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bmvl)) {
            return false;
        }
        bmvl bmvlVar = (bmvl) obj;
        return super.aE(bmvlVar.cN) && Objects.equals(this.a, bmvlVar.a) && this.b == bmvlVar.b && Objects.equals(this.c, bmvlVar.c) && Objects.equals(this.d, bmvlVar.d) && Objects.equals(this.e, bmvlVar.e) && Objects.equals(this.f, bmvlVar.f) && this.g == bmvlVar.g && this.h == bmvlVar.h;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "cms_notifications", dqru.m(new String[]{"cms_id", "cms_last_mod_seq", "cms_correlation_id", "from_address", "to_address", "correlation_text", "modified_at_timestamp", "message_received_timestamp"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "cms_notifications";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, Long.valueOf(this.b), this.c, this.d, this.e, this.f, Long.valueOf(this.g), Long.valueOf(this.h), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r12, java.util.List r13) {
        /*
            r11 = this;
            java.lang.String r0 = r11.a
            long r1 = r11.b
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = r11.c
            java.lang.String r3 = r11.d
            java.lang.String r4 = r11.e
            java.lang.String r5 = r11.f
            long r6 = r11.g
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            long r7 = r11.h
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r8 = 8
            java.lang.Object[] r9 = new java.lang.Object[r8]
            r10 = 0
            r9[r10] = r0
            r0 = 1
            r9[r0] = r1
            r0 = 2
            r9[r0] = r2
            r0 = 3
            r9[r0] = r3
            r0 = 4
            r9[r0] = r4
            r0 = 5
            r9[r0] = r5
            r0 = 6
            r9[r0] = r6
            r0 = 7
            r9[r0] = r7
            r0 = 40
            r12.append(r0)
        L3d:
            if (r10 >= r8) goto L74
            r0 = r9[r10]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L4d
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r12.append(r0)
            goto L6c
        L4d:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L64
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L64
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r12.append(r0)
            goto L6c
        L64:
            r13.add(r0)
            r0 = 63
            r12.append(r0)
        L6c:
            r0 = 44
            r12.append(r0)
            int r10 = r10 + 1
            goto L3d
        L74:
            int r13 = r12.length()
            int r13 = r13 + (-1)
            r12.setLength(r13)
            r13 = 41
            r12.append(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmvl.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "CmsNotificationsTable -- REDACTED") : a();
    }
}
