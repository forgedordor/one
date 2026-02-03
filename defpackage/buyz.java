package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class buyz extends dqpd implements dqpf {
    public String a;

    protected buyz() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "VerifiedSmsBlacklistedSendersTable [sender_id: %s\n]\n", String.valueOf(this.a));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        dqru.v(contentValues, "sender_id", this.a);
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        buzj buzjVar = (buzj) ((buzh) dqqjVar);
        aC();
        this.cN = buzjVar.cV();
        if (buzjVar.dj(0)) {
            this.a = buzjVar.c();
            super.fN(0);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof buyz)) {
            return false;
        }
        buyz buyzVar = (buyz) obj;
        return super.aE(buyzVar.cN) && Objects.equals(this.a, buyzVar.a);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "verified_sms_blacklisted_senders", dqru.m(new String[]{"sender_id"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "verified_sms_blacklisted_senders";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r7, java.util.List r8) {
        /*
            r6 = this;
            java.lang.String r0 = r6.a
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 40
            r7.append(r0)
        Ld:
            if (r2 > 0) goto L44
            r0 = r1[r2]
            boolean r3 = r0 instanceof java.lang.Number
            if (r3 == 0) goto L1d
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.append(r0)
            goto L3c
        L1d:
            boolean r3 = r0 instanceof java.lang.String
            if (r3 == 0) goto L34
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r3.length()
            r5 = 12
            if (r4 >= r5) goto L34
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r3)
            r7.append(r0)
            goto L3c
        L34:
            r8.add(r0)
            r0 = 63
            r7.append(r0)
        L3c:
            r0 = 44
            r7.append(r0)
            int r2 = r2 + 1
            goto Ld
        L44:
            int r8 = r7.length()
            int r8 = r8 + (-1)
            r7.setLength(r8)
            r8 = 41
            r7.append(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.buyz.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "VerifiedSmsBlacklistedSendersTable -- REDACTED") : a();
    }
}
