package defpackage;

import android.content.ContentValues;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqsq extends dqpd<bqtk, bqtx, bqty, bqsq, bqtj> implements dqpf<Long> {
    public long a;
    public String b;
    public long c = 0;
    public int d = 0;
    public aiwt e;
    public String f;

    protected bqsq() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "MessageStatusTable [_id: %s,\n  message_id: %s,\n  timestamp: %s,\n  status: %s,\n  custom_status: %s,\n  data: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        dqru.v(contentValues, "message_id", this.b);
        contentValues.put("timestamp", Long.valueOf(this.c));
        contentValues.put("status", Integer.valueOf(this.d));
        aiwt aiwtVar = this.e;
        if (aiwtVar == null) {
            contentValues.putNull("custom_status");
        } else {
            contentValues.put("custom_status", Integer.valueOf(aiwtVar.ordinal()));
        }
        dqru.v(contentValues, GroupManagementRequest.DATA_TAG, this.f);
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bqtr bqtrVar = (bqtr) ((bqtk) dqqjVar);
        aC();
        this.cN = bqtrVar.cV();
        if (bqtrVar.dj(0)) {
            this.a = bqtrVar.i();
            fN(0);
        }
        if (bqtrVar.dj(1)) {
            this.b = bqtrVar.h();
            fN(1);
        }
        if (bqtrVar.dj(2)) {
            this.c = bqtrVar.e();
            fN(2);
        }
        if (bqtrVar.dj(3)) {
            this.d = bqtrVar.c();
            fN(3);
        }
        if (bqtrVar.dj(4)) {
            this.e = bqtrVar.f();
            fN(4);
        }
        if (bqtrVar.dj(5)) {
            this.f = bqtrVar.g();
            fN(5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bqsq)) {
            return false;
        }
        bqsq bqsqVar = (bqsq) obj;
        return super.aE(bqsqVar.cN) && this.a == bqsqVar.a && Objects.equals(this.b, bqsqVar.b) && this.c == bqsqVar.c && this.d == bqsqVar.d && this.e == bqsqVar.e && Objects.equals(this.f, bqsqVar.f);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "message_status", dqru.m(new String[]{"message_id", "timestamp", "status", "custom_status", GroupManagementRequest.DATA_TAG}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "message_status";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        Long lValueOf = Long.valueOf(this.a);
        String str = this.b;
        Long lValueOf2 = Long.valueOf(this.c);
        Integer numValueOf = Integer.valueOf(this.d);
        aiwt aiwtVar = this.e;
        return Objects.hash(dqqeVar2, lValueOf, str, lValueOf2, numValueOf, Integer.valueOf(aiwtVar == null ? 0 : aiwtVar.ordinal()), this.f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r9, java.util.List r10) {
        /*
            r8 = this;
            java.lang.String r0 = r8.b
            long r1 = r8.c
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            int r2 = r8.d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            aiwt r3 = r8.e
            r4 = 0
            if (r3 != 0) goto L18
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            goto L20
        L18:
            int r3 = r3.ordinal()
            java.lang.String r3 = java.lang.String.valueOf(r3)
        L20:
            java.lang.String r5 = r8.f
            r6 = 5
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r7[r4] = r0
            r0 = 1
            r7[r0] = r1
            r0 = 2
            r7[r0] = r2
            r0 = 3
            r7[r0] = r3
            r0 = 4
            r7[r0] = r5
            r0 = 40
            r9.append(r0)
        L38:
            if (r4 >= r6) goto L6f
            r0 = r7[r4]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L48
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r9.append(r0)
            goto L67
        L48:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L5f
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L5f
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r9.append(r0)
            goto L67
        L5f:
            r10.add(r0)
            r0 = 63
            r9.append(r0)
        L67:
            r0 = 44
            r9.append(r0)
            int r4 = r4 + 1
            goto L38
        L6f:
            int r10 = r9.length()
            int r10 = r10 + (-1)
            r9.setLength(r10)
            r10 = 41
            r9.append(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqsq.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "MessageStatusTable -- REDACTED") : a();
    }
}
