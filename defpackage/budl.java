package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class budl extends dqpd implements dqpf {
    public String a;
    public String b;
    public String c;

    protected budl() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "SqliteStat1 [tbl: %s,\n  idx: %s,\n  stat: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        dqru.v(contentValues, "tbl", this.a);
        dqru.v(contentValues, "idx", this.b);
        dqru.v(contentValues, "stat", this.c);
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bueb buebVar = (bueb) ((budx) dqqjVar);
        aC();
        this.cN = buebVar.cV();
        if (buebVar.dj(0)) {
            this.a = buebVar.f();
            fN(0);
        }
        if (buebVar.dj(1)) {
            this.b = buebVar.c();
            fN(1);
        }
        if (buebVar.dj(2)) {
            this.c = buebVar.e();
            fN(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof budl)) {
            return false;
        }
        budl budlVar = (budl) obj;
        return super.aE(budlVar.cN) && Objects.equals(this.a, budlVar.a) && Objects.equals(this.b, budlVar.b) && Objects.equals(this.c, budlVar.c);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "sqlite_stat1", dqru.m(new String[]{"tbl", "idx", "stat"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "sqlite_stat1";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, this.c, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r8, java.util.List r9) {
        /*
            r7 = this;
            java.lang.String r0 = r7.a
            java.lang.String r1 = r7.b
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
        L17:
            if (r5 >= r3) goto L4e
            r0 = r4[r5]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L27
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L46
        L27:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L3e
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r6 = 12
            if (r2 >= r6) goto L3e
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r8.append(r0)
            goto L46
        L3e:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L46:
            r0 = 44
            r8.append(r0)
            int r5 = r5 + 1
            goto L17
        L4e:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.budl.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "SqliteStat1 -- REDACTED") : a();
    }
}
