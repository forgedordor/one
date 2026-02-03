package defpackage;

import android.content.ContentValues;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bsys extends dqpd implements dqpf {
    public String a;
    public String b;
    public String c;
    public String d;

    protected bsys() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "RbmBusinessVerifierInfoTable [verifier_id: %s,\n  verifier_name: %s,\n  verifier_logo_image_remote_url: %s,\n  verifier_logo_image_local_uri: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        dqru.v(contentValues, "verifier_id", this.a);
        dqru.v(contentValues, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_NAME, this.b);
        dqru.v(contentValues, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_REMOTE_URL, this.c);
        dqru.v(contentValues, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_LOCAL_URI, this.d);
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bszl bszlVar = (bszl) ((bszg) dqqjVar);
        aC();
        this.cN = bszlVar.cV();
        if (bszlVar.dj(0)) {
            this.a = bszlVar.c();
            fN(0);
        }
        if (bszlVar.dj(1)) {
            this.b = bszlVar.g();
            fN(1);
        }
        if (bszlVar.dj(2)) {
            this.c = bszlVar.f();
            fN(2);
        }
        if (bszlVar.dj(3)) {
            this.d = bszlVar.e();
            fN(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bsys)) {
            return false;
        }
        bsys bsysVar = (bsys) obj;
        return super.aE(bsysVar.cN) && Objects.equals(this.a, bsysVar.a) && Objects.equals(this.b, bsysVar.b) && Objects.equals(this.c, bsysVar.c) && Objects.equals(this.d, bsysVar.d);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "rbm_business_verifier_info", dqru.m(new String[]{"verifier_id", BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_NAME, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_REMOTE_URL, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_LOCAL_URI}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "rbm_business_verifier_info";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, this.c, this.d, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r8, java.util.List r9) {
        /*
            r7 = this;
            java.lang.String r0 = r7.a
            java.lang.String r1 = r7.b
            java.lang.String r2 = r7.c
            java.lang.String r3 = r7.d
            r4 = 4
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r6 = 0
            r5[r6] = r0
            r0 = 1
            r5[r0] = r1
            r0 = 2
            r5[r0] = r2
            r0 = 3
            r5[r0] = r3
            r0 = 40
            r8.append(r0)
        L1c:
            if (r6 >= r4) goto L53
            r0 = r5[r6]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L2c
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L4b
        L2c:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L43
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L43
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r8.append(r0)
            goto L4b
        L43:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L4b:
            r0 = 44
            r8.append(r0)
            int r6 = r6 + 1
            goto L1c
        L53:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsys.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "RbmBusinessVerifierInfoTable -- REDACTED") : a();
    }
}
