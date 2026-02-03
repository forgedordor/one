package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bujr extends dqpd implements dqpf {
    public int a;
    public String b;
    public buku c;

    protected bujr() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "SuperSortLabelsTable [_id: %s,\n  name: %s,\n  status: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        contentValues.put("_id", Integer.valueOf(this.a));
        dqru.v(contentValues, "name", this.b);
        buku bukuVar = this.c;
        if (bukuVar == null) {
            contentValues.putNull("status");
        } else {
            contentValues.put("status", Integer.valueOf(bukuVar.ordinal()));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bukj bukjVar = (bukj) ((bukf) dqqjVar);
        aC();
        this.cN = bukjVar.cV();
        if (bukjVar.dj(0)) {
            this.a = bukjVar.c();
            fN(0);
        }
        if (bukjVar.dj(1)) {
            this.b = bukjVar.f();
            fN(1);
        }
        if (bukjVar.dj(2)) {
            this.c = bukjVar.e();
            fN(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bujr)) {
            return false;
        }
        bujr bujrVar = (bujr) obj;
        return super.aE(bujrVar.cN) && this.a == bujrVar.a && Objects.equals(this.b, bujrVar.b) && this.c == bujrVar.c;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "supersort_labels", dqru.m(new String[]{"_id", "name", "status"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "supersort_labels";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        Integer numValueOf = Integer.valueOf(this.a);
        String str = this.b;
        buku bukuVar = this.c;
        return Objects.hash(dqqeVar2, numValueOf, str, Integer.valueOf(bukuVar == null ? 0 : bukuVar.ordinal()), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r8, java.util.List r9) {
        /*
            r7 = this;
            int r0 = r7.a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = r7.b
            buku r2 = r7.c
            r3 = 0
            if (r2 != 0) goto L12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            goto L1a
        L12:
            int r2 = r2.ordinal()
            java.lang.String r2 = java.lang.String.valueOf(r2)
        L1a:
            r4 = 3
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r3] = r0
            r0 = 1
            r5[r0] = r1
            r0 = 2
            r5[r0] = r2
            r0 = 40
            r8.append(r0)
        L2a:
            if (r3 >= r4) goto L61
            r0 = r5[r3]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L3a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L59
        L3a:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L51
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r6 = 12
            if (r2 >= r6) goto L51
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r8.append(r0)
            goto L59
        L51:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L59:
            r0 = 44
            r8.append(r0)
            int r3 = r3 + 1
            goto L2a
        L61:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bujr.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "SuperSortLabelsTable -- REDACTED") : a();
    }
}
