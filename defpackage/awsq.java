package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class awsq extends dqpd implements dqpf {
    public String a;
    public int b;
    public int c = -1;

    protected awsq() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "ActiveSimsTable [sim_serial_number: %s,\n  active_sub_id: %s,\n  sim_slot_index: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        dqru.v(contentValues, "sim_serial_number", this.a);
        contentValues.put("active_sub_id", Integer.valueOf(this.b));
        contentValues.put("sim_slot_index", Integer.valueOf(this.c));
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        awti awtiVar = (awti) ((awte) dqqjVar);
        aC();
        this.cN = awtiVar.cV();
        if (awtiVar.dj(0)) {
            this.a = awtiVar.f();
            fN(0);
        }
        if (awtiVar.dj(1)) {
            this.b = awtiVar.c();
            fN(1);
        }
        if (awtiVar.dj(2)) {
            this.c = awtiVar.e();
            fN(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof awsq)) {
            return false;
        }
        awsq awsqVar = (awsq) obj;
        return super.aE(awsqVar.cN) && Objects.equals(this.a, awsqVar.a) && this.b == awsqVar.b && this.c == awsqVar.c;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "active_sims", dqru.m(new String[]{"sim_serial_number", "active_sub_id", "sim_slot_index"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "active_sims";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r8, java.util.List r9) {
        /*
            r7 = this;
            java.lang.String r0 = r7.a
            int r1 = r7.b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r7.c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r1
            r0 = 2
            r4[r0] = r2
            r0 = 40
            r8.append(r0)
        L1f:
            if (r5 >= r3) goto L56
            r0 = r4[r5]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L2f
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L4e
        L2f:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L46
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r6 = 12
            if (r2 >= r6) goto L46
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r8.append(r0)
            goto L4e
        L46:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L4e:
            r0 = 44
            r8.append(r0)
            int r5 = r5 + 1
            goto L1f
        L56:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awsq.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "ActiveSimsTable -- REDACTED") : a();
    }
}
