package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Date;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class cbht extends dqpd implements dqpf {
    public String a;
    public Optional b = basg.a;
    public Date c;
    public Date d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;

    protected cbht() {
        Date date = barp.a;
        this.c = date;
        this.d = date;
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "WorkQueueWorkManagerTable [queue: %s,\n  workmanager_id: %s,\n  scheduled_at_time: %s,\n  minimum_start_time: %s,\n  requires_network_type: %s,\n  requires_charging: %s,\n  requires_device_idle: %s,\n  requires_battery_not_low: %s,\n  requires_storage_not_low: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        dqru.v(contentValues, "queue", this.a);
        Optional optional = this.b;
        if (optional == null) {
            contentValues.putNull("workmanager_id");
        } else {
            contentValues.put("workmanager_id", basg.b(optional));
        }
        Date date = this.c;
        if (date == null) {
            contentValues.putNull("scheduled_at_time");
        } else {
            contentValues.put("scheduled_at_time", Long.valueOf(barp.a(date)));
        }
        Date date2 = this.d;
        if (date2 == null) {
            contentValues.putNull("minimum_start_time");
        } else {
            contentValues.put("minimum_start_time", Long.valueOf(barp.a(date2)));
        }
        contentValues.put("requires_network_type", Integer.valueOf(this.e));
        contentValues.put("requires_charging", Boolean.valueOf(this.f));
        contentValues.put("requires_device_idle", Boolean.valueOf(this.g));
        contentValues.put("requires_battery_not_low", Boolean.valueOf(this.h));
        contentValues.put("requires_storage_not_low", Boolean.valueOf(this.i));
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        cbjd cbjdVar = (cbjd) ((cbit) dqqjVar);
        aC();
        this.cN = cbjdVar.cV();
        if (cbjdVar.dj(0)) {
            this.a = cbjdVar.f();
            fN(0);
        }
        if (cbjdVar.dj(1)) {
            this.b = cbjdVar.e();
            fN(1);
        }
        if (cbjdVar.dj(2)) {
            this.c = cbjdVar.h();
            fN(2);
        }
        if (cbjdVar.dj(3)) {
            this.d = cbjdVar.g();
            fN(3);
        }
        if (cbjdVar.dj(4)) {
            this.e = cbjdVar.c();
            fN(4);
        }
        if (cbjdVar.dj(5)) {
            this.f = cbjdVar.j();
            fN(5);
        }
        if (cbjdVar.dj(6)) {
            this.g = cbjdVar.k();
            fN(6);
        }
        if (cbjdVar.dj(7)) {
            this.h = cbjdVar.i();
            fN(7);
        }
        if (cbjdVar.dj(8)) {
            this.i = cbjdVar.l();
            fN(8);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cbht)) {
            return false;
        }
        cbht cbhtVar = (cbht) obj;
        return super.aE(cbhtVar.cN) && Objects.equals(this.a, cbhtVar.a) && Objects.equals(this.b, cbhtVar.b) && Objects.equals(this.c, cbhtVar.c) && Objects.equals(this.d, cbhtVar.d) && this.e == cbhtVar.e && this.f == cbhtVar.f && this.g == cbhtVar.g && this.h == cbhtVar.h && this.i == cbhtVar.i;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "work_queue_work_manager_ids", dqru.m(new String[]{"queue", "workmanager_id", "scheduled_at_time", "minimum_start_time", "requires_network_type", "requires_charging", "requires_device_idle", "requires_battery_not_low", "requires_storage_not_low"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "work_queue_work_manager_ids";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, this.c, this.d, Integer.valueOf(this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.g), Boolean.valueOf(this.h), Boolean.valueOf(this.i), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0086  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r13, java.util.List r14) {
        /*
            r12 = this;
            java.lang.String r0 = r12.a
            j$.util.Optional r1 = r12.b
            java.lang.String r1 = defpackage.basg.b(r1)
            java.util.Date r2 = r12.c
            long r2 = defpackage.barp.a(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.util.Date r3 = r12.d
            long r3 = defpackage.barp.a(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            int r4 = r12.e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r5 = r12.f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r6 = r12.g
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r7 = r12.h
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r8 = r12.i
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9 = 9
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r11 = 0
            r10[r11] = r0
            r0 = 1
            r10[r0] = r1
            r0 = 2
            r10[r0] = r2
            r0 = 3
            r10[r0] = r3
            r0 = 4
            r10[r0] = r4
            r0 = 5
            r10[r0] = r5
            r0 = 6
            r10[r0] = r6
            r0 = 7
            r10[r0] = r7
            r0 = 8
            r10[r0] = r8
            r0 = 40
            r13.append(r0)
        L5f:
            if (r11 >= r9) goto L96
            r0 = r10[r11]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L6f
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r13.append(r0)
            goto L8e
        L6f:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L86
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L86
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r13.append(r0)
            goto L8e
        L86:
            r14.add(r0)
            r0 = 63
            r13.append(r0)
        L8e:
            r0 = 44
            r13.append(r0)
            int r11 = r11 + 1
            goto L5f
        L96:
            int r14 = r13.length()
            int r14 = r14 + (-1)
            r13.setLength(r14)
            r14 = 41
            r13.append(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbht.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final Optional k() {
        aA(1, "workmanager_id");
        return this.b;
    }

    public final String m() {
        aA(0, "queue");
        return this.a;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "WorkQueueWorkManagerTable -- REDACTED") : a();
    }
}
