package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bouo extends dqpd implements dqpf {
    public bvdj a = bvdj.b(0);
    public long b = 0;

    protected bouo() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "DataUpgradersTable [_id: %s,\n  last_update_version: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        bvdj bvdjVar = this.a;
        if (bvdjVar == null) {
            contentValues.putNull("_id");
        } else {
            contentValues.put("_id", Integer.valueOf(bvdjVar.a()));
        }
        contentValues.put("last_update_version", Long.valueOf(this.b));
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bovb bovbVar = (bovb) ((bouy) dqqjVar);
        aC();
        this.cN = bovbVar.cV();
        if (bovbVar.dj(0)) {
            this.a = bovbVar.e();
            fN(0);
        }
        if (bovbVar.dj(1)) {
            this.b = bovbVar.c();
            fN(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bouo)) {
            return false;
        }
        bouo bouoVar = (bouo) obj;
        return super.aE(bouoVar.cN) && this.a == bouoVar.a && this.b == bouoVar.b;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "data_upgrade_workers", dqru.m(new String[]{"_id", "last_update_version"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "data_upgrade_workers";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, Long.valueOf(this.b), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r8, java.util.List r9) {
        /*
            r7 = this;
            bvdj r0 = r7.a
            r1 = 0
            if (r0 != 0) goto La
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L12
        La:
            int r0 = r0.a()
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L12:
            long r2 = r7.b
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r1] = r0
            r0 = 1
            r4[r0] = r2
            r0 = 40
            r8.append(r0)
        L25:
            if (r1 >= r3) goto L5c
            r0 = r4[r1]
            boolean r2 = r0 instanceof java.lang.Number
            if (r2 == 0) goto L35
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L54
        L35:
            boolean r2 = r0 instanceof java.lang.String
            if (r2 == 0) goto L4c
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            int r5 = r2.length()
            r6 = 12
            if (r5 >= r6) goto L4c
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r2)
            r8.append(r0)
            goto L54
        L4c:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L54:
            r0 = 44
            r8.append(r0)
            int r1 = r1 + 1
            goto L25
        L5c:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bouo.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final long k() {
        aA(1, "last_update_version");
        return this.b;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "DataUpgradersTable -- REDACTED") : a();
    }
}
