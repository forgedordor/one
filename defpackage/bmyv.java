package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bmyv extends dqpd implements dqpf {
    public long a;
    public long b;
    public String c;
    public String d;
    public long e = 0;
    public avbk f;
    public String g;
    public long h;

    protected bmyv() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "CmsStatusTable [_id: %s,\n  table_type: %s,\n  item_id: %s,\n  cms_id: %s,\n  timestamp: %s,\n  event_type: %s,\n  status: %s,\n  attempt_number: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        contentValues.put("table_type", Long.valueOf(this.b));
        dqru.v(contentValues, "item_id", this.c);
        dqru.v(contentValues, "cms_id", this.d);
        contentValues.put("timestamp", Long.valueOf(this.e));
        avbk avbkVar = this.f;
        if (avbkVar == null) {
            contentValues.putNull("event_type");
        } else {
            contentValues.put("event_type", Integer.valueOf(avbkVar.ordinal()));
        }
        dqru.v(contentValues, "status", this.g);
        contentValues.put("attempt_number", Long.valueOf(this.h));
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bnaa bnaaVar = (bnaa) ((bmzr) dqqjVar);
        aC();
        this.cN = bnaaVar.cV();
        if (bnaaVar.dj(0)) {
            this.a = bnaaVar.e();
            fN(0);
        }
        if (bnaaVar.dj(1)) {
            this.b = bnaaVar.f();
            fN(1);
        }
        if (bnaaVar.dj(2)) {
            this.c = bnaaVar.j();
            fN(2);
        }
        if (bnaaVar.dj(3)) {
            this.d = bnaaVar.i();
            fN(3);
        }
        if (bnaaVar.dj(4)) {
            this.e = bnaaVar.g();
            fN(4);
        }
        if (bnaaVar.dj(5)) {
            this.f = bnaaVar.h();
            fN(5);
        }
        if (bnaaVar.dj(6)) {
            this.g = bnaaVar.k();
            fN(6);
        }
        if (bnaaVar.dj(7)) {
            this.h = bnaaVar.c();
            fN(7);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bmyv)) {
            return false;
        }
        bmyv bmyvVar = (bmyv) obj;
        return super.aE(bmyvVar.cN) && this.a == bmyvVar.a && this.b == bmyvVar.b && Objects.equals(this.c, bmyvVar.c) && Objects.equals(this.d, bmyvVar.d) && this.e == bmyvVar.e && this.f == bmyvVar.f && Objects.equals(this.g, bmyvVar.g) && this.h == bmyvVar.h;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "cms_status", dqru.m(new String[]{"table_type", "item_id", "cms_id", "timestamp", "event_type", "status", "attempt_number"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "cms_status";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        Long lValueOf = Long.valueOf(this.a);
        Long lValueOf2 = Long.valueOf(this.b);
        String str = this.c;
        String str2 = this.d;
        Long lValueOf3 = Long.valueOf(this.e);
        avbk avbkVar = this.f;
        return Objects.hash(dqqeVar2, lValueOf, lValueOf2, str, str2, lValueOf3, Integer.valueOf(avbkVar == null ? 0 : avbkVar.ordinal()), this.g, Long.valueOf(this.h), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r11, java.util.List r12) {
        /*
            r10 = this;
            long r0 = r10.b
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = r10.c
            java.lang.String r2 = r10.d
            long r3 = r10.e
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            avbk r4 = r10.f
            r5 = 0
            if (r4 != 0) goto L1a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            goto L22
        L1a:
            int r4 = r4.ordinal()
            java.lang.String r4 = java.lang.String.valueOf(r4)
        L22:
            java.lang.String r6 = r10.g
            long r7 = r10.h
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r8 = 7
            java.lang.Object[] r9 = new java.lang.Object[r8]
            r9[r5] = r0
            r0 = 1
            r9[r0] = r1
            r0 = 2
            r9[r0] = r2
            r0 = 3
            r9[r0] = r3
            r0 = 4
            r9[r0] = r4
            r0 = 5
            r9[r0] = r6
            r0 = 6
            r9[r0] = r7
            r0 = 40
            r11.append(r0)
        L46:
            if (r5 >= r8) goto L7d
            r0 = r9[r5]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L56
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r11.append(r0)
            goto L75
        L56:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L6d
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L6d
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r11.append(r0)
            goto L75
        L6d:
            r12.add(r0)
            r0 = 63
            r11.append(r0)
        L75:
            r0 = 44
            r11.append(r0)
            int r5 = r5 + 1
            goto L46
        L7d:
            int r12 = r11.length()
            int r12 = r12 + (-1)
            r11.setLength(r12)
            r12 = 41
            r11.append(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmyv.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "CmsStatusTable -- REDACTED") : a();
    }
}
