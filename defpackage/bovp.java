package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bovp extends dqpd implements dqpf {
    public long a;
    public String b;
    public long c = 0;

    protected bovp() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "DataUsageTable [_id: %s,\n  phone_number: %s,\n  data_size: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        dqru.v(contentValues, "phone_number", this.b);
        contentValues.put("data_size", Long.valueOf(this.c));
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bowf bowfVar = (bowf) ((bowb) dqqjVar);
        aC();
        this.cN = bowfVar.cV();
        if (bowfVar.dj(0)) {
            this.a = bowfVar.e();
            fN(0);
        }
        if (bowfVar.dj(1)) {
            this.b = bowfVar.f();
            fN(1);
        }
        if (bowfVar.dj(2)) {
            this.c = bowfVar.c();
            fN(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bovp)) {
            return false;
        }
        bovp bovpVar = (bovp) obj;
        return super.aE(bovpVar.cN) && this.a == bovpVar.a && Objects.equals(this.b, bovpVar.b) && this.c == bovpVar.c;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "data_usage", dqru.m(new String[]{"phone_number", "data_size"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "data_usage";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Long.valueOf(this.a), this.b, Long.valueOf(this.c), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r8, java.util.List r9) {
        /*
            r7 = this;
            java.lang.String r0 = r7.b
            long r1 = r7.c
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 40
            r8.append(r0)
        L16:
            if (r4 >= r2) goto L4d
            r0 = r3[r4]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L26
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L45
        L26:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L3d
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r5 = r1.length()
            r6 = 12
            if (r5 >= r6) goto L3d
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r8.append(r0)
            goto L45
        L3d:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L45:
            r0 = 44
            r8.append(r0)
            int r4 = r4 + 1
            goto L16
        L4d:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bovp.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "DataUsageTable -- REDACTED") : a();
    }
}
