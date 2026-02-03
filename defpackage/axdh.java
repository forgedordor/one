package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class axdh extends dqpd implements dqpf {
    public int a;
    public String b;
    public String c;
    public axcm d = null;
    public axcm e = null;

    protected axdh() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "SubscriptionsTable [sub_id: %s,\n  sim_serial_number: %s,\n  telephony_phone_number: %s,\n  my_identity_token: %s,\n  my_identity_token_with_foreign_key: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = axer.c().intValue();
        contentValues.put("sub_id", Integer.valueOf(this.a));
        dqru.v(contentValues, "sim_serial_number", this.b);
        dqru.v(contentValues, "telephony_phone_number", this.c);
        if (iIntValue >= 59450) {
            axcm axcmVar = this.d;
            if (axcmVar == null) {
                contentValues.putNull("my_identity_token");
            } else {
                contentValues.put("my_identity_token", axcn.b(axcmVar));
            }
        }
        if (iIntValue >= 60160) {
            axcm axcmVar2 = this.e;
            if (axcmVar2 == null || axcmVar2.equals(null)) {
                contentValues.putNull("my_identity_token_with_foreign_key");
            } else {
                contentValues.put("my_identity_token_with_foreign_key", axcn.b(this.e));
            }
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        axeg axegVar = (axeg) ((axea) dqqjVar);
        aC();
        this.cN = axegVar.cV();
        if (axegVar.dj(0)) {
            this.a = axegVar.e();
            fN(0);
        }
        if (axegVar.dj(1)) {
            this.b = axegVar.h();
            fN(1);
        }
        if (axegVar.dj(2)) {
            this.c = axegVar.i();
            fN(2);
        }
        if (axegVar.dj(3)) {
            this.d = axegVar.f();
            fN(3);
        }
        if (axegVar.dj(4)) {
            this.e = axegVar.g();
            fN(4);
        }
    }

    public final int d() {
        aA(0, "sub_id");
        return this.a;
    }

    public final axcm e() {
        aA(3, "my_identity_token");
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof axdh)) {
            return false;
        }
        axdh axdhVar = (axdh) obj;
        return super.aE(axdhVar.cN) && this.a == axdhVar.a && Objects.equals(this.b, axdhVar.b) && Objects.equals(this.c, axdhVar.c) && Objects.equals(this.d, axdhVar.d) && Objects.equals(this.e, axdhVar.e);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "subscriptions", dqru.m(new String[]{"sub_id", "sim_serial_number", "telephony_phone_number", "my_identity_token", "my_identity_token_with_foreign_key"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "subscriptions";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Integer.valueOf(this.a), this.b, this.c, this.d, this.e, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r9, java.util.List r10) {
        /*
            r8 = this;
            int r0 = r8.a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = r8.b
            java.lang.String r2 = r8.c
            axcm r3 = r8.d
            java.lang.String r3 = defpackage.axcn.b(r3)
            axdg r4 = new axdg
            r4.<init>(r8)
            java.lang.Object r4 = r4.get()
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
        L30:
            if (r7 >= r5) goto L67
            r0 = r6[r7]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L40
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r9.append(r0)
            goto L5f
        L40:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L57
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L57
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r9.append(r0)
            goto L5f
        L57:
            r10.add(r0)
            r0 = 63
            r9.append(r0)
        L5f:
            r0 = 44
            r9.append(r0)
            int r7 = r7 + 1
            goto L30
        L67:
            int r10 = r9.length()
            int r10 = r10 + (-1)
            r9.setLength(r10)
            r10 = 41
            r9.append(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axdh.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String k() {
        aA(2, "telephony_phone_number");
        return this.c;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "SubscriptionsTable -- REDACTED") : a();
    }
}
