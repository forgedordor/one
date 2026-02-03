package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bvbb extends dqpd implements dqpf {
    public String a;
    public String b;

    protected bvbb() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "VerifiedSmsSendersTable [sender_id: %s,\n  brand_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        dqru.v(contentValues, "sender_id", this.a);
        dqru.v(contentValues, "brand_id", this.b);
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bvbo bvboVar = (bvbo) ((bvbl) dqqjVar);
        aC();
        this.cN = bvboVar.cV();
        if (bvboVar.dj(0)) {
            this.a = bvboVar.e();
            fN(0);
        }
        if (bvboVar.dj(1)) {
            this.b = bvboVar.c();
            fN(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bvbb)) {
            return false;
        }
        bvbb bvbbVar = (bvbb) obj;
        return super.aE(bvbbVar.cN) && Objects.equals(this.a, bvbbVar.a) && Objects.equals(this.b, bvbbVar.b);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "verified_sms_senders", dqru.m(new String[]{"sender_id", "brand_id"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "verified_sms_senders";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
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
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 40
            r8.append(r0)
        L12:
            if (r4 >= r2) goto L49
            r0 = r3[r4]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L22
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L41
        L22:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L39
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r5 = r1.length()
            r6 = 12
            if (r5 >= r6) goto L39
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r8.append(r0)
            goto L41
        L39:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L41:
            r0 = 44
            r8.append(r0)
            int r4 = r4 + 1
            goto L12
        L49:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvbb.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "VerifiedSmsSendersTable -- REDACTED") : a();
    }
}
