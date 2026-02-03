package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.time.Instant;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class brfq extends dqpd implements dqpf {
    public bash a = bash.a;
    public Instant b = Instant.EPOCH;
    public float c;

    protected brfq() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "P13nDecayedFeatureValuesTable [feature_id: %s,\n  date: %s,\n  feature_value: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        bash bashVar = this.a;
        if (bashVar == null || bashVar.equals(bash.a)) {
            contentValues.putNull("feature_id");
        } else {
            contentValues.put("feature_id", Long.valueOf(bash.a(this.a)));
        }
        Instant instant = this.b;
        if (instant == null || instant.equals(Instant.EPOCH)) {
            contentValues.putNull("date");
        } else {
            contentValues.put("date", Long.valueOf(barq.a(this.b)));
        }
        contentValues.put("feature_value", Float.valueOf(this.c));
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        brgj brgjVar = (brgj) ((brgf) dqqjVar);
        aC();
        this.cN = brgjVar.cV();
        if (brgjVar.dj(0)) {
            this.a = brgjVar.e();
            fN(0);
        }
        if (brgjVar.dj(1)) {
            this.b = brgjVar.f();
            fN(1);
        }
        if (brgjVar.dj(2)) {
            this.c = brgjVar.c();
            fN(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof brfq)) {
            return false;
        }
        brfq brfqVar = (brfq) obj;
        return super.aE(brfqVar.cN) && Objects.equals(this.a, brfqVar.a) && Objects.equals(this.b, brfqVar.b) && this.c == brfqVar.c;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "smarts_personalization_decayed_feature_values", dqru.m(new String[]{"feature_id", "date", "feature_value"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "smarts_personalization_decayed_feature_values";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, Float.valueOf(this.c), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r8, java.util.List r9) {
        /*
            r7 = this;
            brfo r0 = new brfo
            r0.<init>(r7)
            java.lang.Object r0 = r0.get()
            brfp r1 = new brfp
            r1.<init>(r7)
            java.lang.Object r1 = r1.get()
            float r2 = r7.c
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
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
        L29:
            if (r5 >= r3) goto L60
            r0 = r4[r5]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L39
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L58
        L39:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L50
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r6 = 12
            if (r2 >= r6) goto L50
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r8.append(r0)
            goto L58
        L50:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L58:
            r0 = 44
            r8.append(r0)
            int r5 = r5 + 1
            goto L29
        L60:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brfq.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "P13nDecayedFeatureValuesTable -- REDACTED") : a();
    }
}
