package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btbw extends dqpd implements dqpf {
    public basd a = basd.a;
    public String b;

    protected btbw() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "ReceivedMessagePhoneNumbersTable [rcs_message_id: %s,\n  self_msisdn: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        basd basdVar = this.a;
        if (basdVar == null || basdVar.equals(basd.a)) {
            contentValues.putNull("rcs_message_id");
        } else {
            contentValues.put("rcs_message_id", basd.d(this.a));
        }
        dqru.v(contentValues, "self_msisdn", this.b);
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        btcj btcjVar = (btcj) ((btcg) dqqjVar);
        aC();
        this.cN = btcjVar.cV();
        if (btcjVar.dj(0)) {
            this.a = btcjVar.c();
            fN(0);
        }
        if (btcjVar.dj(1)) {
            this.b = btcjVar.e();
            fN(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof btbw)) {
            return false;
        }
        btbw btbwVar = (btbw) obj;
        return super.aE(btbwVar.cN) && Objects.equals(this.a, btbwVar.a) && Objects.equals(this.b, btbwVar.b);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "received_message_phone_numbers", dqru.m(new String[]{"rcs_message_id", "self_msisdn"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "received_message_phone_numbers";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r8, java.util.List r9) {
        /*
            r7 = this;
            btbv r0 = new btbv
            r0.<init>(r7)
            java.lang.Object r0 = r0.get()
            java.lang.String r1 = r7.b
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 40
            r8.append(r0)
        L19:
            if (r4 >= r2) goto L50
            r0 = r3[r4]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L29
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L48
        L29:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L40
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r5 = r1.length()
            r6 = 12
            if (r5 >= r6) goto L40
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r8.append(r0)
            goto L48
        L40:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L48:
            r0 = 44
            r8.append(r0)
            int r4 = r4 + 1
            goto L19
        L50:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btbw.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "ReceivedMessagePhoneNumbersTable -- REDACTED") : a();
    }
}
