package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.time.Instant;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class ccga extends dqpd implements dqpf {
    public byte[] a;
    public byte[] b;
    public Instant c = Instant.EPOCH;

    protected ccga() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        Locale locale = Locale.US;
        byte[] bArr = this.a;
        String strConcat = "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL"));
        byte[] bArr2 = this.b;
        return String.format(locale, "MlsKeyPackagesTable [_id: %s,\n  key_package: %s,\n  expiration_timestamp: %s\n]\n", strConcat, "BLOB".concat(String.valueOf(bArr2 != null ? String.valueOf(bArr2.length) : "NULL")), String.valueOf(this.c));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        contentValues.put("_id", this.a);
        contentValues.put("key_package", this.b);
        Instant instant = this.c;
        if (instant == null) {
            contentValues.putNull("expiration_timestamp");
        } else {
            contentValues.put("expiration_timestamp", Long.valueOf(bart.a(instant)));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        ccgq ccgqVar = (ccgq) ((ccgm) dqqjVar);
        aC();
        this.cN = ccgqVar.cV();
        if (ccgqVar.dj(0)) {
            this.a = ccgqVar.e();
            fN(0);
        }
        if (ccgqVar.dj(1)) {
            this.b = ccgqVar.f();
            fN(1);
        }
        if (ccgqVar.dj(2)) {
            this.c = ccgqVar.c();
            fN(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ccga)) {
            return false;
        }
        ccga ccgaVar = (ccga) obj;
        return super.aE(ccgaVar.cN) && Arrays.equals(this.a, ccgaVar.a) && Arrays.equals(this.b, ccgaVar.b) && Objects.equals(this.c, ccgaVar.c);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "mls_key_packages", dqru.m(new String[]{"_id", "key_package", "expiration_timestamp"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "mls_key_packages";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(Arrays.hashCode(this.b)), this.c, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r8, java.util.List r9) {
        /*
            r7 = this;
            byte[] r0 = r7.a
            byte[] r1 = r7.b
            j$.time.Instant r2 = r7.c
            long r2 = defpackage.bart.a(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
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
        L1f:
            if (r5 >= r3) goto L56
            r0 = r4[r5]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L2f
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L4e
        L2f:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L46
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r6 = 12
            if (r2 >= r6) goto L46
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r8.append(r0)
            goto L4e
        L46:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L4e:
            r0 = 44
            r8.append(r0)
            int r5 = r5 + 1
            goto L1f
        L56:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccga.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "MlsKeyPackagesTable -- REDACTED") : a();
    }
}
