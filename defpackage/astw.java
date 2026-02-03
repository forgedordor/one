package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.time.Instant;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class astw extends dqpd implements dqpf {
    public String a;
    public Instant b = Instant.EPOCH;
    public asva c;

    protected astw() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "RcsRemoteCapabilitiesCacheTable [msisdn: %s,\n  last_refresh_timestamp: %s,\n  rcs_capabilities: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        dqru.v(contentValues, "msisdn", this.a);
        Instant instant = this.b;
        if (instant == null) {
            contentValues.putNull("last_refresh_timestamp");
        } else {
            contentValues.put("last_refresh_timestamp", Long.valueOf(bart.a(instant)));
        }
        asva asvaVar = this.c;
        if (asvaVar == null) {
            contentValues.putNull("rcs_capabilities");
        } else {
            contentValues.put("rcs_capabilities", asvaVar.toByteArray());
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        asum asumVar = (asum) ((asui) dqqjVar);
        aC();
        this.cN = asumVar.cV();
        if (asumVar.dj(0)) {
            this.a = asumVar.f();
            fN(0);
        }
        if (asumVar.dj(1)) {
            this.b = asumVar.e();
            fN(1);
        }
        if (asumVar.dj(2)) {
            this.c = asumVar.c();
            fN(2);
        }
    }

    public final asva d() {
        aA(2, "rcs_capabilities");
        return this.c;
    }

    public final Instant e() {
        aA(1, "last_refresh_timestamp");
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof astw)) {
            return false;
        }
        astw astwVar = (astw) obj;
        return super.aE(astwVar.cN) && Objects.equals(this.a, astwVar.a) && Objects.equals(this.b, astwVar.b) && Objects.equals(this.c, astwVar.c);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "rcs_remote_capabilities_cache", dqru.m(new String[]{"msisdn", "last_refresh_timestamp", "rcs_capabilities"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "rcs_remote_capabilities_cache";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, this.c, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r8, java.util.List r9) {
        /*
            r7 = this;
            java.lang.String r0 = r7.a
            j$.time.Instant r1 = r7.b
            long r1 = defpackage.bart.a(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            asva r2 = r7.c
            if (r2 != 0) goto L12
            r2 = 0
            goto L16
        L12:
            byte[] r2 = r2.toByteArray()
        L16:
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
        L27:
            if (r5 >= r3) goto L5e
            r0 = r4[r5]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L37
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L56
        L37:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L4e
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r6 = 12
            if (r2 >= r6) goto L4e
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r8.append(r0)
            goto L56
        L4e:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L56:
            r0 = 44
            r8.append(r0)
            int r5 = r5 + 1
            goto L27
        L5e:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.astw.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "RcsRemoteCapabilitiesCacheTable -- REDACTED") : a();
    }
}
