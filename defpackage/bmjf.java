package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bmjf extends dqpd implements dqpf {
    public long a;
    public String b;
    public long c;
    public long d;
    public long e;

    protected bmjf() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "BackupIdMapTable [_id: %s,\n  table_name: %s,\n  backup_id: %s,\n  bugle_id: %s,\n  status: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        dqru.v(contentValues, "table_name", this.b);
        contentValues.put("backup_id", Long.valueOf(this.c));
        contentValues.put("bugle_id", Long.valueOf(this.d));
        contentValues.put("status", Long.valueOf(this.e));
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bmkb bmkbVar = (bmkb) ((bmjv) dqqjVar);
        aC();
        this.cN = bmkbVar.cV();
        if (bmkbVar.dj(0)) {
            this.a = bmkbVar.f();
            fN(0);
        }
        if (bmkbVar.dj(1)) {
            this.b = bmkbVar.h();
            fN(1);
        }
        if (bmkbVar.dj(2)) {
            this.c = bmkbVar.c();
            fN(2);
        }
        if (bmkbVar.dj(3)) {
            this.d = bmkbVar.e();
            fN(3);
        }
        if (bmkbVar.dj(4)) {
            this.e = bmkbVar.g();
            fN(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bmjf)) {
            return false;
        }
        bmjf bmjfVar = (bmjf) obj;
        return super.aE(bmjfVar.cN) && this.a == bmjfVar.a && Objects.equals(this.b, bmjfVar.b) && this.c == bmjfVar.c && this.d == bmjfVar.d && this.e == bmjfVar.e;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "backup_id_map", dqru.m(new String[]{"table_name", "backup_id", "bugle_id", "status"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "backup_id_map";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Long.valueOf(this.a), this.b, Long.valueOf(this.c), Long.valueOf(this.d), Long.valueOf(this.e), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
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
            long r2 = r7.d
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r3 = r7.e
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 4
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r6 = 0
            r5[r6] = r0
            r0 = 1
            r5[r0] = r1
            r0 = 2
            r5[r0] = r2
            r0 = 3
            r5[r0] = r3
            r0 = 40
            r8.append(r0)
        L28:
            if (r6 >= r4) goto L5f
            r0 = r5[r6]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L38
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L57
        L38:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L4f
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L4f
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r8.append(r0)
            goto L57
        L4f:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L57:
            r0 = 44
            r8.append(r0)
            int r6 = r6 + 1
            goto L28
        L5f:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmjf.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final long k() {
        aA(3, "bugle_id");
        return this.d;
    }

    public final long l() {
        aA(4, "status");
        return this.e;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "BackupIdMapTable -- REDACTED") : a();
    }
}
