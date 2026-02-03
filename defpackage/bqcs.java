package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqcs extends dqpd implements dqpf {
    public long a;
    public UUID b = base.b();
    public bvds c;
    public String d;

    protected bqcs() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "MessageDestinationsTable [_id: %s,\n  message_send_receive_attempt_id: %s,\n  message_destination_type: %s,\n  message_destination_raw: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        UUID uuid = this.b;
        if (uuid == null || uuid.equals(base.b())) {
            contentValues.putNull("message_send_receive_attempt_id");
        } else {
            contentValues.put("message_send_receive_attempt_id", base.a(this.b));
        }
        bvds bvdsVar = this.c;
        if (bvdsVar == null) {
            contentValues.putNull("message_destination_type");
        } else {
            contentValues.put("message_destination_type", Integer.valueOf(bvdsVar.ordinal()));
        }
        dqru.v(contentValues, "message_destination_raw", this.d);
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bqdo bqdoVar = (bqdo) ((bqdj) dqqjVar);
        aC();
        this.cN = bqdoVar.cV();
        if (bqdoVar.dj(0)) {
            this.a = bqdoVar.c();
            fN(0);
        }
        if (bqdoVar.dj(1)) {
            this.b = bqdoVar.g();
            fN(1);
        }
        if (bqdoVar.dj(2)) {
            this.c = bqdoVar.e();
            fN(2);
        }
        if (bqdoVar.dj(3)) {
            this.d = bqdoVar.f();
            fN(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bqcs)) {
            return false;
        }
        bqcs bqcsVar = (bqcs) obj;
        return super.aE(bqcsVar.cN) && this.a == bqcsVar.a && Objects.equals(this.b, bqcsVar.b) && this.c == bqcsVar.c && Objects.equals(this.d, bqcsVar.d);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "message_destinations", dqru.m(new String[]{"message_send_receive_attempt_id", "message_destination_type", "message_destination_raw"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "message_destinations";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        Long lValueOf = Long.valueOf(this.a);
        UUID uuid = this.b;
        bvds bvdsVar = this.c;
        return Objects.hash(dqqeVar2, lValueOf, uuid, Integer.valueOf(bvdsVar == null ? 0 : bvdsVar.ordinal()), this.d, null);
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
            bqcr r0 = new bqcr
            r0.<init>(r7)
            java.lang.Object r0 = r0.get()
            bvds r1 = r7.c
            r2 = 0
            if (r1 != 0) goto L13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            goto L1b
        L13:
            int r1 = r1.ordinal()
            java.lang.String r1 = java.lang.String.valueOf(r1)
        L1b:
            java.lang.String r3 = r7.d
            r4 = 3
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r2] = r0
            r0 = 1
            r5[r0] = r1
            r0 = 2
            r5[r0] = r3
            r0 = 40
            r8.append(r0)
        L2d:
            if (r2 >= r4) goto L64
            r0 = r5[r2]
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
            int r3 = r1.length()
            r6 = 12
            if (r3 >= r6) goto L54
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
            int r2 = r2 + 1
            goto L2d
        L64:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqcs.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "MessageDestinationsTable -- REDACTED") : a();
    }
}
