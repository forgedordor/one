package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bmsr extends dqpd implements dqpf {
    public long a;
    public long b;
    public long c;
    public String d;
    public long e;
    public long f;
    public long g;

    protected bmsr() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "CmsIncrementalEventsTable [_id: %s,\n  table_type: %s,\n  operation: %s,\n  bugle_id: %s,\n  attempt_count: %s,\n  create_timestamp: %s,\n  last_attempt_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        contentValues.put("table_type", Long.valueOf(this.b));
        contentValues.put("operation", Long.valueOf(this.c));
        dqru.v(contentValues, "bugle_id", this.d);
        contentValues.put("attempt_count", Long.valueOf(this.e));
        contentValues.put("create_timestamp", Long.valueOf(this.f));
        contentValues.put("last_attempt_timestamp", Long.valueOf(this.g));
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bmtt bmttVar = (bmtt) ((bmtl) dqqjVar);
        aC();
        this.cN = bmttVar.cV();
        if (bmttVar.dj(0)) {
            this.a = bmttVar.f();
            fN(0);
        }
        if (bmttVar.dj(1)) {
            this.b = bmttVar.i();
            fN(1);
        }
        if (bmttVar.dj(2)) {
            this.c = bmttVar.h();
            fN(2);
        }
        if (bmttVar.dj(3)) {
            this.d = bmttVar.j();
            fN(3);
        }
        if (bmttVar.dj(4)) {
            this.e = bmttVar.c();
            fN(4);
        }
        if (bmttVar.dj(5)) {
            this.f = bmttVar.e();
            fN(5);
        }
        if (bmttVar.dj(6)) {
            this.g = bmttVar.g();
            fN(6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bmsr)) {
            return false;
        }
        bmsr bmsrVar = (bmsr) obj;
        return super.aE(bmsrVar.cN) && this.a == bmsrVar.a && this.b == bmsrVar.b && this.c == bmsrVar.c && Objects.equals(this.d, bmsrVar.d) && this.e == bmsrVar.e && this.f == bmsrVar.f && this.g == bmsrVar.g;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "cms_incremental_events", dqru.m(new String[]{"table_type", "operation", "bugle_id", "attempt_count", "create_timestamp", "last_attempt_timestamp"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "cms_incremental_events";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), this.d, Long.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r10, java.util.List r11) {
        /*
            r9 = this;
            long r0 = r9.b
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r1 = r9.c
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = r9.d
            long r3 = r9.e
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            long r4 = r9.f
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmsr.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "CmsIncrementalEventsTable -- REDACTED") : a();
    }
}
