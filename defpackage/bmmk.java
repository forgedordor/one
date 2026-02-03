package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bmmk extends dqpd implements dqpf {
    public long a;
    public long b;
    public long c;
    public long d;

    protected bmmk() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "CmsBackupDependencyCacheTable [_id: %s,\n  dependent_id: %s,\n  dependency_id: %s,\n  inserted_at_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        contentValues.put("dependent_id", Long.valueOf(this.b));
        contentValues.put("dependency_id", Long.valueOf(this.c));
        contentValues.put("inserted_at_timestamp", Long.valueOf(this.d));
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bmnd bmndVar = (bmnd) ((bmmy) dqqjVar);
        aC();
        this.cN = bmndVar.cV();
        if (bmndVar.dj(0)) {
            this.a = bmndVar.f();
            fN(0);
        }
        if (bmndVar.dj(1)) {
            this.b = bmndVar.e();
            fN(1);
        }
        if (bmndVar.dj(2)) {
            this.c = bmndVar.c();
            fN(2);
        }
        if (bmndVar.dj(3)) {
            this.d = bmndVar.g();
            fN(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bmmk)) {
            return false;
        }
        bmmk bmmkVar = (bmmk) obj;
        return super.aE(bmmkVar.cN) && this.a == bmmkVar.a && this.b == bmmkVar.b && this.c == bmmkVar.c && this.d == bmmkVar.d;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "cms_backup_dependency_cache_table", dqru.m(new String[]{"dependent_id", "dependency_id", "inserted_at_timestamp"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "cms_backup_dependency_cache_table";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r8, java.util.List r9) {
        /*
            r7 = this;
            long r0 = r7.b
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r1 = r7.c
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            long r2 = r7.d
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
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
        L23:
            if (r5 >= r3) goto L5a
            r0 = r4[r5]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L33
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L52
        L33:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L4a
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r6 = 12
            if (r2 >= r6) goto L4a
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r8.append(r0)
            goto L52
        L4a:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L52:
            r0 = 44
            r8.append(r0)
            int r5 = r5 + 1
            goto L23
        L5a:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmmk.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "CmsBackupDependencyCacheTable -- REDACTED") : a();
    }
}
