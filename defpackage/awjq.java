package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class awjq extends dqpd implements dqpf {
    public awjl a = null;
    public String b;
    public awja c;

    protected awjq() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "DestinationsTable [token: %s,\n  address: %s,\n  address_type: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        awjl awjlVar = this.a;
        if (awjlVar == null || awjlVar.equals(null)) {
            contentValues.putNull("token");
        } else {
            contentValues.put("token", awjm.b(this.a));
        }
        dqru.v(contentValues, "address", this.b);
        awja awjaVar = this.c;
        if (awjaVar == null) {
            contentValues.putNull("address_type");
        } else {
            contentValues.put("address_type", Integer.valueOf(awjaVar.ordinal()));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        awkg awkgVar = (awkg) ((awkc) dqqjVar);
        aC();
        this.cN = awkgVar.cV();
        if (awkgVar.dj(0)) {
            this.a = awkgVar.e();
            fN(0);
        }
        if (awkgVar.dj(1)) {
            this.b = awkgVar.f();
            fN(1);
        }
        if (awkgVar.dj(2)) {
            this.c = awkgVar.c();
            fN(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof awjq)) {
            return false;
        }
        awjq awjqVar = (awjq) obj;
        return super.aE(awjqVar.cN) && Objects.equals(this.a, awjqVar.a) && Objects.equals(this.b, awjqVar.b) && this.c == awjqVar.c;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "destinations", dqru.m(new String[]{"token", "address", "address_type"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "destinations";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        awjl awjlVar = this.a;
        String str = this.b;
        awja awjaVar = this.c;
        return Objects.hash(dqqeVar2, awjlVar, str, Integer.valueOf(awjaVar == null ? 0 : awjaVar.ordinal()), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r8, java.util.List r9) {
        /*
            r7 = this;
            awjp r0 = new awjp
            r0.<init>(r7)
            java.lang.Object r0 = r0.get()
            java.lang.String r1 = r7.b
            awja r2 = r7.c
            r3 = 0
            if (r2 != 0) goto L15
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            goto L1d
        L15:
            int r2 = r2.ordinal()
            java.lang.String r2 = java.lang.String.valueOf(r2)
        L1d:
            r4 = 3
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r3] = r0
            r0 = 1
            r5[r0] = r1
            r0 = 2
            r5[r0] = r2
            r0 = 40
            r8.append(r0)
        L2d:
            if (r3 >= r4) goto L64
            r0 = r5[r3]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L3d
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L5c
        L3d:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L54
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r6 = 12
            if (r2 >= r6) goto L54
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r8.append(r0)
            goto L5c
        L54:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L5c:
            r0 = 44
            r8.append(r0)
            int r3 = r3 + 1
            goto L2d
        L64:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awjq.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "DestinationsTable -- REDACTED") : a();
    }
}
