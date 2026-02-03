package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class azqr extends dqpd implements dqpf {
    public axcm a = null;
    public awxl b;
    public String c;
    public String d;

    protected azqr() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "BackupMyIdentitiesTable [token: %s,\n  address_type: %s,\n  phone_number: %s,\n  display_name: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        axcm axcmVar = this.a;
        if (axcmVar == null) {
            contentValues.putNull("token");
        } else {
            contentValues.put("token", axcn.b(axcmVar));
        }
        awxl awxlVar = this.b;
        if (awxlVar == null) {
            contentValues.putNull("address_type");
        } else {
            contentValues.put("address_type", Integer.valueOf(awxlVar.ordinal()));
        }
        dqru.v(contentValues, "phone_number", this.c);
        dqru.v(contentValues, "display_name", this.d);
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        azrk azrkVar = (azrk) ((azrf) dqqjVar);
        aC();
        this.cN = azrkVar.cV();
        if (azrkVar.dj(0)) {
            this.a = azrkVar.e();
            fN(0);
        }
        if (azrkVar.dj(1)) {
            this.b = azrkVar.c();
            fN(1);
        }
        if (azrkVar.dj(2)) {
            this.c = azrkVar.f();
            fN(2);
        }
        if (azrkVar.dj(3)) {
            this.d = azrkVar.g();
            fN(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof azqr)) {
            return false;
        }
        azqr azqrVar = (azqr) obj;
        return super.aE(azqrVar.cN) && Objects.equals(this.a, azqrVar.a) && this.b == azqrVar.b && Objects.equals(this.c, azqrVar.c) && Objects.equals(this.d, azqrVar.d);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "my_identities_backup", dqru.m(new String[]{"token", "address_type", "phone_number", "display_name"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "my_identities_backup";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        axcm axcmVar = this.a;
        awxl awxlVar = this.b;
        return Objects.hash(dqqeVar2, axcmVar, Integer.valueOf(awxlVar == null ? 0 : awxlVar.ordinal()), this.c, this.d, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r8, java.util.List r9) {
        /*
            r7 = this;
            axcm r0 = r7.a
            java.lang.String r0 = defpackage.axcn.b(r0)
            awxl r1 = r7.b
            r2 = 0
            if (r1 != 0) goto L10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            goto L18
        L10:
            int r1 = r1.ordinal()
            java.lang.String r1 = java.lang.String.valueOf(r1)
        L18:
            java.lang.String r3 = r7.c
            java.lang.String r4 = r7.d
            r5 = 4
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r6[r2] = r0
            r0 = 1
            r6[r0] = r1
            r0 = 2
            r6[r0] = r3
            r0 = 3
            r6[r0] = r4
            r0 = 40
            r8.append(r0)
        L2f:
            if (r2 >= r5) goto L66
            r0 = r6[r2]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L3f
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L5e
        L3f:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L56
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r1.length()
            r4 = 12
            if (r3 >= r4) goto L56
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r8.append(r0)
            goto L5e
        L56:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L5e:
            r0 = 44
            r8.append(r0)
            int r2 = r2 + 1
            goto L2f
        L66:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azqr.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "BackupMyIdentitiesTable -- REDACTED") : a();
    }
}
