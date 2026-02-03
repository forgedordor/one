package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.time.Instant;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class cckv extends dqpd implements dqpf {
    public String a;
    public String c;
    public byte[] d;
    public ccnk e;
    public basd b = basd.a;
    public Instant f = Instant.EPOCH;

    protected cckv() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        Locale locale = Locale.US;
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.c);
        byte[] bArr = this.d;
        return String.format(locale, "MlsProcessedResultsTable [self_identity: %s,\n  rcs_message_id: %s,\n  remote_user_id: %s,\n  raw_content: %s,\n  stage: %s,\n  sort_timestamp: %s\n]\n", strValueOf, strValueOf2, strValueOf3, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")), String.valueOf(this.e), String.valueOf(this.f));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        dqru.v(contentValues, "self_identity", this.a);
        basd basdVar = this.b;
        if (basdVar == null) {
            contentValues.putNull("rcs_message_id");
        } else {
            contentValues.put("rcs_message_id", basd.d(basdVar));
        }
        dqru.v(contentValues, "remote_user_id", this.c);
        contentValues.put("raw_content", this.d);
        ccnk ccnkVar = this.e;
        if (ccnkVar == null) {
            contentValues.putNull("stage");
        } else {
            contentValues.put("stage", Integer.valueOf(ccnkVar.ordinal()));
        }
        Instant instant = this.f;
        if (instant == null) {
            contentValues.putNull("sort_timestamp");
        } else {
            contentValues.put("sort_timestamp", Long.valueOf(bart.a(instant)));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        cclw cclwVar = (cclw) ((cclp) dqqjVar);
        aC();
        this.cN = cclwVar.cV();
        if (cclwVar.dj(0)) {
            this.a = cclwVar.i();
            fN(0);
        }
        if (cclwVar.dj(1)) {
            this.b = cclwVar.e();
            fN(1);
        }
        if (cclwVar.dj(2)) {
            this.c = cclwVar.h();
            fN(2);
        }
        if (cclwVar.dj(3)) {
            this.d = cclwVar.j();
            fN(3);
        }
        if (cclwVar.dj(4)) {
            this.e = cclwVar.f();
            fN(4);
        }
        if (cclwVar.dj(5)) {
            this.f = cclwVar.g();
            fN(5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cckv)) {
            return false;
        }
        cckv cckvVar = (cckv) obj;
        return super.aE(cckvVar.cN) && Objects.equals(this.a, cckvVar.a) && Objects.equals(this.b, cckvVar.b) && Objects.equals(this.c, cckvVar.c) && Arrays.equals(this.d, cckvVar.d) && this.e == cckvVar.e && Objects.equals(this.f, cckvVar.f);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "mls_processed_results", dqru.m(new String[]{"self_identity", "rcs_message_id", "remote_user_id", "raw_content", "stage", "sort_timestamp"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "mls_processed_results";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        String str = this.a;
        basd basdVar = this.b;
        String str2 = this.c;
        Integer numValueOf = Integer.valueOf(Arrays.hashCode(this.d));
        ccnk ccnkVar = this.e;
        return Objects.hash(dqqeVar2, str, basdVar, str2, numValueOf, Integer.valueOf(ccnkVar == null ? 0 : ccnkVar.ordinal()), this.f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r10, java.util.List r11) {
        /*
            r9 = this;
            java.lang.String r0 = r9.a
            basd r1 = r9.b
            java.lang.String r1 = defpackage.basd.d(r1)
            java.lang.String r2 = r9.c
            byte[] r3 = r9.d
            ccnk r4 = r9.e
            r5 = 0
            if (r4 != 0) goto L16
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            goto L1e
        L16:
            int r4 = r4.ordinal()
            java.lang.String r4 = java.lang.String.valueOf(r4)
        L1e:
            j$.time.Instant r6 = r9.f
            long r6 = defpackage.bart.a(r6)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r7 = 6
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r8[r5] = r0
            r0 = 1
            r8[r0] = r1
            r0 = 2
            r8[r0] = r2
            r0 = 3
            r8[r0] = r3
            r0 = 4
            r8[r0] = r4
            r0 = 5
            r8[r0] = r6
            r0 = 40
            r10.append(r0)
        L41:
            if (r5 >= r7) goto L78
            r0 = r8[r5]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L51
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r10.append(r0)
            goto L70
        L51:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L68
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L68
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r10.append(r0)
            goto L70
        L68:
            r11.add(r0)
            r0 = 63
            r10.append(r0)
        L70:
            r0 = 44
            r10.append(r0)
            int r5 = r5 + 1
            goto L41
        L78:
            int r11 = r10.length()
            int r11 = r11 + (-1)
            r10.setLength(r11)
            r11 = 41
            r10.append(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cckv.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "MlsProcessedResultsTable -- REDACTED") : a();
    }
}
