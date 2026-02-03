package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.time.Instant;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bria extends dqpd implements dqpf {
    public Instant a = Instant.EPOCH;
    public ejqq b;

    protected bria() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "P13nNormalizedFeatureValuesTable [date: %s,\n  features: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        Instant instant = this.a;
        if (instant == null || instant.equals(Instant.EPOCH)) {
            contentValues.putNull("date");
        } else {
            contentValues.put("date", Long.valueOf(barq.a(this.a)));
        }
        ejqq ejqqVar = this.b;
        contentValues.put("features", ejqqVar == null ? null : ejqqVar.toByteArray());
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        brip bripVar = (brip) ((brim) dqqjVar);
        aC();
        this.cN = bripVar.cV();
        if (bripVar.dj(0)) {
            this.a = bripVar.e();
            fN(0);
        }
        if (bripVar.dj(1)) {
            this.b = bripVar.c();
            fN(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bria)) {
            return false;
        }
        bria briaVar = (bria) obj;
        return super.aE(briaVar.cN) && Objects.equals(this.a, briaVar.a) && Objects.equals(this.b, briaVar.b);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "smarts_personalization_normalized_feature_values", dqru.m(new String[]{"date", "features"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "smarts_personalization_normalized_feature_values";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r8, java.util.List r9) {
        /*
            r7 = this;
            brhz r0 = new brhz
            r0.<init>(r7)
            java.lang.Object r0 = r0.get()
            ejqq r1 = r7.b
            if (r1 != 0) goto Lf
            r1 = 0
            goto L13
        Lf:
            byte[] r1 = r1.toByteArray()
        L13:
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 40
            r8.append(r0)
        L21:
            if (r4 >= r2) goto L58
            r0 = r3[r4]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L31
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L50
        L31:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L48
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r5 = r1.length()
            r6 = 12
            if (r5 >= r6) goto L48
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r8.append(r0)
            goto L50
        L48:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L50:
            r0 = 44
            r8.append(r0)
            int r4 = r4 + 1
            goto L21
        L58:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bria.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "P13nNormalizedFeatureValuesTable -- REDACTED") : a();
    }
}
