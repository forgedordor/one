package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bpxn extends dqpd implements dqpf {
    public int a;

    protected bpxn() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "LinkedAccountTable [account_id: %s\n]\n", String.valueOf(this.a));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        contentValues.put("account_id", Integer.valueOf(this.a));
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bpxx bpxxVar = (bpxx) ((bpxv) dqqjVar);
        aC();
        this.cN = bpxxVar.cV();
        if (bpxxVar.dj(0)) {
            this.a = bpxxVar.c();
            super.fN(0);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bpxn)) {
            return false;
        }
        bpxn bpxnVar = (bpxn) obj;
        return super.aE(bpxnVar.cN) && this.a == bpxnVar.a;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "linked_account", dqru.m(new String[]{"account_id"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "linked_account";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Integer.valueOf(this.a), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r7, java.util.List r8) {
        /*
            r6 = this;
            int r0 = r6.a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 40
            r7.append(r0)
        L11:
            if (r2 > 0) goto L48
            r0 = r1[r2]
            boolean r3 = r0 instanceof java.lang.Number
            if (r3 == 0) goto L21
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.append(r0)
            goto L40
        L21:
            boolean r3 = r0 instanceof java.lang.String
            if (r3 == 0) goto L38
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r3.length()
            r5 = 12
            if (r4 >= r5) goto L38
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r3)
            r7.append(r0)
            goto L40
        L38:
            r8.add(r0)
            r0 = 63
            r7.append(r0)
        L40:
            r0 = 44
            r7.append(r0)
            int r2 = r2 + 1
            goto L11
        L48:
            int r8 = r7.length()
            int r8 = r8 + (-1)
            r7.setLength(r8)
            r8 = 41
            r7.append(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpxn.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "LinkedAccountTable -- REDACTED") : a();
    }
}
