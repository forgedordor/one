package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.time.Instant;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class brgx extends dqpd implements dqpf {
    public bash a = bash.a;
    public basi b = basi.a;
    public Instant c = Instant.EPOCH;

    protected brgx() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "P13nFeaturesTable [feature_id: %s,\n  feature: %s,\n  start_date: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = brhv.c().intValue();
        bash bashVar = this.a;
        if (bashVar == null || bashVar.equals(bash.a)) {
            contentValues.putNull("feature_id");
        } else {
            contentValues.put("feature_id", Long.valueOf(bash.a(this.a)));
        }
        if (iIntValue >= 54060) {
            basi basiVar = this.b;
            if (basiVar == null || basiVar.equals(basi.a)) {
                contentValues.putNull("feature");
            } else {
                contentValues.put("feature", basi.d(this.b));
            }
        }
        Instant instant = this.c;
        if (instant == null) {
            contentValues.putNull("start_date");
        } else {
            contentValues.put("start_date", Long.valueOf(barq.a(instant)));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        brhn brhnVar = (brhn) ((brhj) dqqjVar);
        aC();
        this.cN = brhnVar.cV();
        if (brhnVar.dj(0)) {
            this.a = brhnVar.c();
            super.fN(0);
        }
        if (brhnVar.dj(1)) {
            this.b = brhnVar.e();
            super.fN(1);
        }
        if (brhnVar.dj(2)) {
            this.c = brhnVar.f();
            super.fN(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof brgx)) {
            return false;
        }
        brgx brgxVar = (brgx) obj;
        return super.aE(brgxVar.cN) && Objects.equals(this.a, brgxVar.a) && Objects.equals(this.b, brgxVar.b) && Objects.equals(this.c, brgxVar.c);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "smarts_personalization_features", dqru.m(new String[]{"feature", "start_date"}));
    }

    @Override // defpackage.dqpd
    public final void fN(int i) {
        super.fN(0);
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "feature_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "smarts_personalization_features";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, this.c, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r8, java.util.List r9) {
        /*
            r7 = this;
            brgw r0 = new brgw
            r0.<init>(r7)
            java.lang.Object r0 = r0.get()
            j$.time.Instant r1 = r7.c
            long r1 = defpackage.barq.a(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brgx.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final bash k() {
        aA(0, "feature_id");
        return this.a;
    }

    public final basi m() {
        aA(1, "feature");
        return this.b;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "P13nFeaturesTable -- REDACTED") : a();
    }
}
