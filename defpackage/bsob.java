package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.time.Instant;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bsob extends dqpd implements dqpf {
    public long a;
    public Instant b = bart.b(0);
    public String c;
    public String d;

    protected bsob() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "PiiHashTable [_id: %s,\n  timestamp: %s,\n  hash_value: %s,\n  hash_key: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        Instant instant = this.b;
        if (instant == null) {
            contentValues.putNull("timestamp");
        } else {
            contentValues.put("timestamp", Long.valueOf(bart.a(instant)));
        }
        dqru.v(contentValues, "hash_value", this.c);
        dqru.v(contentValues, "hash_key", this.d);
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bsou bsouVar = (bsou) ((bsop) dqqjVar);
        aC();
        this.cN = bsouVar.cV();
        if (bsouVar.dj(0)) {
            this.a = bsouVar.f();
            fN(0);
        }
        if (bsouVar.dj(1)) {
            this.b = bsouVar.g();
            fN(1);
        }
        if (bsouVar.dj(2)) {
            this.c = bsouVar.e();
            fN(2);
        }
        if (bsouVar.dj(3)) {
            this.d = bsouVar.c();
            fN(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bsob)) {
            return false;
        }
        bsob bsobVar = (bsob) obj;
        return super.aE(bsobVar.cN) && this.a == bsobVar.a && Objects.equals(this.b, bsobVar.b) && Objects.equals(this.c, bsobVar.c) && Objects.equals(this.d, bsobVar.d);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "pii_hash", dqru.m(new String[]{"timestamp", "hash_value", "hash_key"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "pii_hash";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Long.valueOf(this.a), this.b, this.c, this.d, null);
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
            j$.time.Instant r0 = r7.b
            long r0 = defpackage.bart.a(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = r7.c
            java.lang.String r2 = r7.d
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsob.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "PiiHashTable -- REDACTED") : a();
    }
}
