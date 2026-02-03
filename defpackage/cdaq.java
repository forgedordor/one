package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.time.Instant;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class cdaq extends dqpd implements dqpf {
    public String b;
    public String c;
    public cdap a = cdap.b(0);
    public Instant d = Instant.EPOCH;

    protected cdaq() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "ExternalCapabilitiesTable [external_application: %s,\n  capability_key: %s,\n  capability_value: %s,\n  expiry: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        cdap cdapVar = this.a;
        if (cdapVar == null) {
            contentValues.putNull("external_application");
        } else {
            contentValues.put("external_application", Integer.valueOf(cdapVar.a()));
        }
        dqru.v(contentValues, "capability_key", this.b);
        dqru.v(contentValues, "capability_value", this.c);
        Instant instant = this.d;
        if (instant == null) {
            contentValues.putNull("expiry");
        } else {
            contentValues.put("expiry", Long.valueOf(bart.a(instant)));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        cdbj cdbjVar = (cdbj) ((cdbe) dqqjVar);
        aC();
        this.cN = cdbjVar.cV();
        if (cdbjVar.dj(0)) {
            this.a = cdbjVar.c();
            fN(0);
        }
        if (cdbjVar.dj(1)) {
            this.b = cdbjVar.f();
            fN(1);
        }
        if (cdbjVar.dj(2)) {
            this.c = cdbjVar.g();
            fN(2);
        }
        if (cdbjVar.dj(3)) {
            this.d = cdbjVar.e();
            fN(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cdaq)) {
            return false;
        }
        cdaq cdaqVar = (cdaq) obj;
        return super.aE(cdaqVar.cN) && this.a == cdaqVar.a && Objects.equals(this.b, cdaqVar.b) && Objects.equals(this.c, cdaqVar.c) && Objects.equals(this.d, cdaqVar.d);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "external_capabilities", dqru.m(new String[]{"external_application", "capability_key", "capability_value", "expiry"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "external_capabilities";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, this.c, this.d, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r8, java.util.List r9) {
        /*
            r7 = this;
            cdap r0 = r7.a
            r1 = 0
            if (r0 != 0) goto La
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L12
        La:
            int r0 = r0.a()
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L12:
            java.lang.String r2 = r7.b
            java.lang.String r3 = r7.c
            j$.time.Instant r4 = r7.d
            long r4 = defpackage.bart.a(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 4
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r6[r1] = r0
            r0 = 1
            r6[r0] = r2
            r0 = 2
            r6[r0] = r3
            r0 = 3
            r6[r0] = r4
            r0 = 40
            r8.append(r0)
        L33:
            if (r1 >= r5) goto L6a
            r0 = r6[r1]
            boolean r2 = r0 instanceof java.lang.Number
            if (r2 == 0) goto L43
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L62
        L43:
            boolean r2 = r0 instanceof java.lang.String
            if (r2 == 0) goto L5a
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r2.length()
            r4 = 12
            if (r3 >= r4) goto L5a
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r2)
            r8.append(r0)
            goto L62
        L5a:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L62:
            r0 = 44
            r8.append(r0)
            int r1 = r1 + 1
            goto L33
        L6a:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdaq.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "ExternalCapabilitiesTable -- REDACTED") : a();
    }
}
