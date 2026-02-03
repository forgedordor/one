package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bppd extends dqpd implements dqpf {
    public String a;
    public int c;
    public String d;
    public String j;
    public int b = 3;
    public int e = -1;
    public boolean f = false;
    public int g = 0;
    public int h = 0;
    public long i = 0;
    public long k = 0;

    protected bppd() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "GenericWorkerQueueTable [_id: %s,\n  worker_type: %s,\n  item_table_type: %s,\n  item_id: %s,\n  account_id: %s,\n  in_flight: %s,\n  retry_count: %s,\n  flags: %s,\n  next_execute_timestamp: %s,\n  trigger_name: %s,\n  enqueued_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = bprf.c().intValue();
        contentValues.put("worker_type", Integer.valueOf(this.b));
        contentValues.put("item_table_type", Integer.valueOf(this.c));
        dqru.v(contentValues, "item_id", this.d);
        if (iIntValue >= 39020) {
            contentValues.put("account_id", Integer.valueOf(this.e));
        }
        contentValues.put("in_flight", Boolean.valueOf(this.f));
        contentValues.put("retry_count", Integer.valueOf(this.g));
        if (iIntValue >= 32000) {
            contentValues.put("flags", Integer.valueOf(this.h));
        }
        if (iIntValue >= 34000) {
            contentValues.put("next_execute_timestamp", Long.valueOf(this.i));
        }
        if (iIntValue >= 59700) {
            dqru.v(contentValues, "trigger_name", this.j);
        }
        if (iIntValue >= 59970) {
            contentValues.put("enqueued_timestamp", Long.valueOf(this.k));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bpqr bpqrVar = (bpqr) ((bpqf) dqqjVar);
        aC();
        this.cN = bpqrVar.cV();
        if (bpqrVar.dj(0)) {
            this.a = bpqrVar.k();
            fN(0);
        }
        if (bpqrVar.dj(1)) {
            this.b = bpqrVar.c();
            fN(1);
        }
        if (bpqrVar.dj(2)) {
            this.c = bpqrVar.g();
            fN(2);
        }
        if (bpqrVar.dj(3)) {
            this.d = bpqrVar.l();
            fN(3);
        }
        if (bpqrVar.dj(4)) {
            this.e = bpqrVar.e();
            fN(4);
        }
        if (bpqrVar.dj(5)) {
            this.f = bpqrVar.n();
            fN(5);
        }
        if (bpqrVar.dj(6)) {
            this.g = bpqrVar.h();
            fN(6);
        }
        if (bpqrVar.dj(7)) {
            this.h = bpqrVar.f();
            fN(7);
        }
        if (bpqrVar.dj(8)) {
            this.i = bpqrVar.j();
            fN(8);
        }
        if (bpqrVar.dj(9)) {
            this.j = bpqrVar.m();
            fN(9);
        }
        if (bpqrVar.dj(10)) {
            this.k = bpqrVar.i();
            fN(10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bppd)) {
            return false;
        }
        bppd bppdVar = (bppd) obj;
        return super.aE(bppdVar.cN) && Objects.equals(this.a, bppdVar.a) && this.b == bppdVar.b && this.c == bppdVar.c && Objects.equals(this.d, bppdVar.d) && this.e == bppdVar.e && this.f == bppdVar.f && this.g == bppdVar.g && this.h == bppdVar.h && this.i == bppdVar.i && Objects.equals(this.j, bppdVar.j) && this.k == bppdVar.k;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "generic_worker_queue", dqru.m(new String[]{"worker_type", "item_table_type", "item_id", "account_id", "in_flight", "retry_count", "flags", "next_execute_timestamp", "trigger_name", "enqueued_timestamp"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "generic_worker_queue";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), this.d, Integer.valueOf(this.e), Boolean.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), Long.valueOf(this.i), this.j, Long.valueOf(this.k), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0084  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r14, java.util.List r15) {
        /*
            r13 = this;
            int r0 = r13.b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r13.c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = r13.d
            int r3 = r13.e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r4 = r13.f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r5 = r13.g
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r6 = r13.h
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            long r7 = r13.i
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            java.lang.String r8 = r13.j
            long r9 = r13.k
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r10 = 10
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r12 = 0
            r11[r12] = r0
            r0 = 1
            r11[r0] = r1
            r0 = 2
            r11[r0] = r2
            r0 = 3
            r11[r0] = r3
            r0 = 4
            r11[r0] = r4
            r0 = 5
            r11[r0] = r5
            r0 = 6
            r11[r0] = r6
            r0 = 7
            r11[r0] = r7
            r0 = 8
            r11[r0] = r8
            r0 = 9
            r11[r0] = r9
            r0 = 40
            r14.append(r0)
        L5d:
            if (r12 >= r10) goto L94
            r0 = r11[r12]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L6d
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r14.append(r0)
            goto L8c
        L6d:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L84
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L84
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r14.append(r0)
            goto L8c
        L84:
            r15.add(r0)
            r0 = 63
            r14.append(r0)
        L8c:
            r0 = 44
            r14.append(r0)
            int r12 = r12 + 1
            goto L5d
        L94:
            int r15 = r14.length()
            int r15 = r15 + (-1)
            r14.setLength(r15)
            r15 = 41
            r14.append(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bppd.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final int k() {
        aA(7, "flags");
        return this.h;
    }

    public final int m() {
        aA(2, "item_table_type");
        return this.c;
    }

    public final int n() {
        aA(6, "retry_count");
        return this.g;
    }

    public final int o() {
        aA(1, "worker_type");
        return this.b;
    }

    public final long p() {
        aA(10, "enqueued_timestamp");
        return this.k;
    }

    public final String q() {
        aA(0, "_id");
        return this.a;
    }

    public final String r() {
        aA(3, "item_id");
        return this.d;
    }

    public final String s() {
        aA(9, "trigger_name");
        return this.j;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "GenericWorkerQueueTable -- REDACTED") : a();
    }
}
