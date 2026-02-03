package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.time.Instant;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class ccdc extends dqpd implements dqpf {
    public String a;
    public String b;
    public long c;
    public byte[] d;
    public Instant e = Instant.EPOCH;

    protected ccdc() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        Locale locale = Locale.US;
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.c);
        byte[] bArr = this.d;
        return String.format(locale, "MlsEpochRecordsTable [identity_id: %s,\n  group_id: %s,\n  epoch_id: %s,\n  epoch_data: %s,\n  creation_timestamp: %s\n]\n", strValueOf, strValueOf2, strValueOf3, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")), String.valueOf(this.e));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        dqru.v(contentValues, "identity_id", this.a);
        dqru.v(contentValues, "group_id", this.b);
        contentValues.put("epoch_id", Long.valueOf(this.c));
        contentValues.put("epoch_data", this.d);
        Instant instant = this.e;
        if (instant == null) {
            contentValues.putNull("creation_timestamp");
        } else {
            contentValues.put("creation_timestamp", Long.valueOf(bart.a(instant)));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        ccdy ccdyVar = (ccdy) ((ccds) dqqjVar);
        aC();
        this.cN = ccdyVar.cV();
        if (ccdyVar.dj(0)) {
            this.a = ccdyVar.h();
            fN(0);
        }
        if (ccdyVar.dj(1)) {
            this.b = ccdyVar.g();
            fN(1);
        }
        if (ccdyVar.dj(2)) {
            this.c = ccdyVar.e();
            fN(2);
        }
        if (ccdyVar.dj(3)) {
            this.d = ccdyVar.i();
            fN(3);
        }
        if (ccdyVar.dj(4)) {
            this.e = ccdyVar.f();
            fN(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ccdc)) {
            return false;
        }
        ccdc ccdcVar = (ccdc) obj;
        return super.aE(ccdcVar.cN) && Objects.equals(this.a, ccdcVar.a) && Objects.equals(this.b, ccdcVar.b) && this.c == ccdcVar.c && Arrays.equals(this.d, ccdcVar.d) && Objects.equals(this.e, ccdcVar.e);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "mls_epoch_records", dqru.m(new String[]{"identity_id", "group_id", "epoch_id", "epoch_data", "creation_timestamp"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "mls_epoch_records";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, Long.valueOf(this.c), Integer.valueOf(Arrays.hashCode(this.d)), this.e, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r9, java.util.List r10) {
        /*
            r8 = this;
            java.lang.String r0 = r8.a
            java.lang.String r1 = r8.b
            long r2 = r8.c
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            byte[] r3 = r8.d
            j$.time.Instant r4 = r8.e
            long r4 = defpackage.bart.a(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 5
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r7 = 0
            r6[r7] = r0
            r0 = 1
            r6[r0] = r1
            r0 = 2
            r6[r0] = r2
            r0 = 3
            r6[r0] = r3
            r0 = 4
            r6[r0] = r4
            r0 = 40
            r9.append(r0)
        L2d:
            if (r7 >= r5) goto L64
            r0 = r6[r7]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L3d
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r9.append(r0)
            goto L5c
        L3d:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L54
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L54
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r9.append(r0)
            goto L5c
        L54:
            r10.add(r0)
            r0 = 63
            r9.append(r0)
        L5c:
            r0 = 44
            r9.append(r0)
            int r7 = r7 + 1
            goto L2d
        L64:
            int r10 = r9.length()
            int r10 = r10 + (-1)
            r9.setLength(r10)
            r10 = 41
            r9.append(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccdc.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final long k() {
        aA(2, "epoch_id");
        return this.c;
    }

    public final Instant m() {
        aA(4, "creation_timestamp");
        return this.e;
    }

    public final String n() {
        aA(1, "group_id");
        return this.b;
    }

    public final byte[] o() {
        aA(3, "epoch_data");
        return this.d;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "MlsEpochRecordsTable -- REDACTED") : a();
    }
}
