package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btrc extends dqpd implements dqpf {
    public long a;
    public long b;
    public aiad c;
    public btsp d;
    public btso e;

    protected btrc() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "RestoreWorkflowFilesTable [_id: %s,\n  workflow_execution_id: %s,\n  backup_file: %s,\n  file_type: %s,\n  status: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        dqru.u(contentValues, "workflow_execution_id", this.b);
        aiad aiadVar = this.c;
        if (aiadVar == null) {
            contentValues.putNull("backup_file");
        } else {
            contentValues.put("backup_file", aiadVar.toByteArray());
        }
        btsp btspVar = this.d;
        if (btspVar == null) {
            contentValues.putNull("file_type");
        } else {
            contentValues.put("file_type", Integer.valueOf(btspVar.ordinal()));
        }
        btso btsoVar = this.e;
        if (btsoVar == null) {
            contentValues.putNull("status");
        } else {
            contentValues.put("status", Integer.valueOf(btsoVar.ordinal()));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        btsb btsbVar = (btsb) ((btrv) dqqjVar);
        aC();
        this.cN = btsbVar.cV();
        if (btsbVar.dj(0)) {
            this.a = btsbVar.c();
            fN(0);
        }
        if (btsbVar.dj(1)) {
            this.b = btsbVar.e();
            fN(1);
        }
        if (btsbVar.dj(2)) {
            this.c = btsbVar.f();
            fN(2);
        }
        if (btsbVar.dj(3)) {
            this.d = btsbVar.h();
            fN(3);
        }
        if (btsbVar.dj(4)) {
            this.e = btsbVar.g();
            fN(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof btrc)) {
            return false;
        }
        btrc btrcVar = (btrc) obj;
        return super.aE(btrcVar.cN) && this.a == btrcVar.a && this.b == btrcVar.b && Objects.equals(this.c, btrcVar.c) && this.d == btrcVar.d && this.e == btrcVar.e;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "restore_workflow_files", dqru.m(new String[]{"workflow_execution_id", "backup_file", "file_type", "status"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "restore_workflow_files";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        Long lValueOf = Long.valueOf(this.a);
        Long lValueOf2 = Long.valueOf(this.b);
        aiad aiadVar = this.c;
        btsp btspVar = this.d;
        Integer numValueOf = Integer.valueOf(btspVar == null ? 0 : btspVar.ordinal());
        btso btsoVar = this.e;
        return Objects.hash(dqqeVar2, lValueOf, lValueOf2, aiadVar, numValueOf, Integer.valueOf(btsoVar == null ? 0 : btsoVar.ordinal()), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
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
            aiad r1 = r7.c
            if (r1 != 0) goto Lc
            r1 = 0
            goto L10
        Lc:
            byte[] r1 = r1.toByteArray()
        L10:
            btsp r2 = r7.d
            r3 = 0
            if (r2 != 0) goto L1a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            goto L22
        L1a:
            int r2 = r2.ordinal()
            java.lang.String r2 = java.lang.String.valueOf(r2)
        L22:
            btso r4 = r7.e
            if (r4 != 0) goto L2b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            goto L33
        L2b:
            int r4 = r4.ordinal()
            java.lang.String r4 = java.lang.String.valueOf(r4)
        L33:
            r5 = 4
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r6[r3] = r0
            r0 = 1
            r6[r0] = r1
            r0 = 2
            r6[r0] = r2
            r0 = 3
            r6[r0] = r4
            r0 = 40
            r8.append(r0)
        L46:
            if (r3 >= r5) goto L7d
            r0 = r6[r3]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L56
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L75
        L56:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L6d
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r4 = 12
            if (r2 >= r4) goto L6d
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r8.append(r0)
            goto L75
        L6d:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L75:
            r0 = 44
            r8.append(r0)
            int r3 = r3 + 1
            goto L46
        L7d:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btrc.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final long k() {
        aA(0, "_id");
        return this.a;
    }

    public final aiad m() {
        aA(2, "backup_file");
        return this.c;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "RestoreWorkflowFilesTable -- REDACTED") : a();
    }
}
