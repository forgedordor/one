package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.time.Instant;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class azpm extends dqpd implements dqpf {
    public Instant a = Instant.EPOCH;
    public int b;
    public String c;

    protected azpm() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "BackupMetadataTable [created_timestamp: %s,\n  schema_version: %s,\n  backup_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        Instant instant = this.a;
        if (instant == null) {
            contentValues.putNull("created_timestamp");
        } else {
            contentValues.put("created_timestamp", Long.valueOf(bart.a(instant)));
        }
        contentValues.put("schema_version", Integer.valueOf(this.b));
        dqru.v(contentValues, "backup_id", this.c);
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        azqe azqeVar = (azqe) ((azqa) dqqjVar);
        aC();
        this.cN = azqeVar.cV();
        if (azqeVar.dj(0)) {
            this.a = azqeVar.e();
            fN(0);
        }
        if (azqeVar.dj(1)) {
            this.b = azqeVar.c();
            fN(1);
        }
        if (azqeVar.dj(2)) {
            this.c = azqeVar.f();
            fN(2);
        }
    }

    public final Instant d() {
        aA(0, "created_timestamp");
        return this.a;
    }

    public final String e() {
        aA(2, "backup_id");
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof azpm)) {
            return false;
        }
        azpm azpmVar = (azpm) obj;
        return super.aE(azpmVar.cN) && Objects.equals(this.a, azpmVar.a) && this.b == azpmVar.b && Objects.equals(this.c, azpmVar.c);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "backup_metadata", dqru.m(new String[]{"created_timestamp", "schema_version", "backup_id"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "backup_metadata";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, Integer.valueOf(this.b), this.c, null);
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
            j$.time.Instant r0 = r7.a
            long r0 = defpackage.bart.a(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            int r1 = r7.b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = r7.c
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azpm.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "BackupMetadataTable -- REDACTED") : a();
    }
}
