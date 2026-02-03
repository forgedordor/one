package defpackage;

import android.content.ContentValues;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import defpackage.dqpd;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class cbdg extends dqpd implements dqpf {
    public long a;
    public String b;
    public byte[] c;
    public int d;
    public long e;
    public String f;
    public String g;
    public boolean h;
    public Optional i = basg.a;
    public Date j = barp.a;
    public String k;

    protected cbdg() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        Locale locale = Locale.US;
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        byte[] bArr = this.c;
        return String.format(locale, "WorkQueueTable [_id: %s,\n  type: %s,\n  rawdata: %s,\n  attempts: %s,\n  timestamp: %s,\n  queue: %s,\n  deduplication_tag: %s,\n  scheduled_in_workmanager: %s,\n  workmanager_id: %s,\n  minimum_start_time: %s,\n  cancellation_tag: %s\n]\n", strValueOf, strValueOf2, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = cbfi.c().intValue();
        dqru.v(contentValues, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, this.b);
        contentValues.put("rawdata", this.c);
        contentValues.put("attempts", Integer.valueOf(this.d));
        contentValues.put("timestamp", Long.valueOf(this.e));
        if (iIntValue >= 41030) {
            dqru.v(contentValues, "queue", this.f);
        }
        if (iIntValue >= 42050) {
            dqru.v(contentValues, "deduplication_tag", this.g);
        }
        if (iIntValue >= 45030) {
            contentValues.put("scheduled_in_workmanager", Boolean.valueOf(this.h));
        }
        if (iIntValue >= 46060) {
            Optional optional = this.i;
            if (optional == null) {
                contentValues.putNull("workmanager_id");
            } else {
                contentValues.put("workmanager_id", basg.b(optional));
            }
        }
        if (iIntValue >= 46070) {
            Date date = this.j;
            if (date == null) {
                contentValues.putNull("minimum_start_time");
            } else {
                contentValues.put("minimum_start_time", Long.valueOf(barp.a(date)));
            }
        }
        if (iIntValue >= 48020) {
            dqru.v(contentValues, "cancellation_tag", this.k);
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        cbeu cbeuVar = (cbeu) ((cbei) dqqjVar);
        aC();
        this.cN = cbeuVar.cV();
        if (cbeuVar.dj(0)) {
            this.a = cbeuVar.i();
            super.fN(0);
        }
        if (cbeuVar.dj(1)) {
            this.b = cbeuVar.f();
            super.fN(1);
        }
        if (cbeuVar.dj(2)) {
            this.c = cbeuVar.n();
            super.fN(2);
        }
        if (cbeuVar.dj(3)) {
            this.d = cbeuVar.h();
            super.fN(3);
        }
        if (cbeuVar.dj(4)) {
            this.e = cbeuVar.c();
            super.fN(4);
        }
        if (cbeuVar.dj(5)) {
            this.f = cbeuVar.e();
            super.fN(5);
        }
        if (cbeuVar.dj(6)) {
            this.g = cbeuVar.l();
            super.fN(6);
        }
        if (cbeuVar.dj(7)) {
            this.h = cbeuVar.m();
            super.fN(7);
        }
        if (cbeuVar.dj(8)) {
            this.i = cbeuVar.j();
            super.fN(8);
        }
        if (cbeuVar.dj(9)) {
            this.j = cbeuVar.g();
            super.fN(9);
        }
        if (cbeuVar.dj(10)) {
            this.k = cbeuVar.k();
            super.fN(10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cbdg)) {
            return false;
        }
        cbdg cbdgVar = (cbdg) obj;
        return super.aE(cbdgVar.cN) && this.a == cbdgVar.a && Objects.equals(this.b, cbdgVar.b) && Arrays.equals(this.c, cbdgVar.c) && this.d == cbdgVar.d && this.e == cbdgVar.e && Objects.equals(this.f, cbdgVar.f) && Objects.equals(this.g, cbdgVar.g) && this.h == cbdgVar.h && Objects.equals(this.i, cbdgVar.i) && Objects.equals(this.j, cbdgVar.j) && Objects.equals(this.k, cbdgVar.k);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "work_queue", dqru.m(new String[]{BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, "rawdata", "attempts", "timestamp", "queue", "deduplication_tag", "scheduled_in_workmanager", "workmanager_id", "minimum_start_time", "cancellation_tag"}));
    }

    @Override // defpackage.dqpd
    public final void fN(int i) {
        super.fN(0);
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "work_queue";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Long.valueOf(this.a), this.b, Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(this.d), Long.valueOf(this.e), this.f, this.g, Boolean.valueOf(this.h), this.i, this.j, this.k, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r14, java.util.List r15) {
        /*
            r13 = this;
            java.lang.String r0 = r13.b
            byte[] r1 = r13.c
            int r2 = r13.d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            long r3 = r13.e
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = r13.f
            java.lang.String r5 = r13.g
            boolean r6 = r13.h
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            j$.util.Optional r7 = r13.i
            java.lang.String r7 = defpackage.basg.b(r7)
            java.util.Date r8 = r13.j
            long r8 = defpackage.barp.a(r8)
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.lang.String r9 = r13.k
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
        L55:
            if (r12 >= r10) goto L8c
            r0 = r11[r12]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L65
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r14.append(r0)
            goto L84
        L65:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L7c
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L7c
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r14.append(r0)
            goto L84
        L7c:
            r15.add(r0)
            r0 = 63
            r14.append(r0)
        L84:
            r0 = 44
            r14.append(r0)
            int r12 = r12 + 1
            goto L55
        L8c:
            int r15 = r14.length()
            int r15 = r15 + (-1)
            r14.setLength(r15)
            r15 = 41
            r14.append(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbdg.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final int k() {
        aA(3, "attempts");
        return this.d;
    }

    public final long m() {
        aA(0, "_id");
        return this.a;
    }

    public final long n() {
        aA(4, "timestamp");
        return this.e;
    }

    public final String o() {
        aA(10, "cancellation_tag");
        return this.k;
    }

    public final String p() {
        aA(6, "deduplication_tag");
        return this.g;
    }

    public final String q() {
        aA(5, "queue");
        return this.f;
    }

    public final String r() {
        aA(1, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
        return this.b;
    }

    public final Date s() {
        aA(9, "minimum_start_time");
        return this.j;
    }

    public final byte[] t() {
        aA(2, "rawdata");
        return this.c;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "WorkQueueTable -- REDACTED") : a();
    }
}
