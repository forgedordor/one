package defpackage;

import android.content.ContentValues;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bpis extends dqpd implements dqpf {
    public long a;
    public long b = 0;
    public aiwp c = aiwp.b(0);
    public String d;

    protected bpis() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "EventsTable [_id: %s,\n  timestamp: %s,\n  event: %s,\n  data: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        contentValues.put("timestamp", Long.valueOf(this.b));
        aiwp aiwpVar = this.c;
        if (aiwpVar == null) {
            contentValues.putNull("event");
        } else {
            contentValues.put("event", Integer.valueOf(aiwpVar.p));
        }
        dqru.v(contentValues, GroupManagementRequest.DATA_TAG, this.d);
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bpjn bpjnVar = (bpjn) ((bpji) dqqjVar);
        aC();
        this.cN = bpjnVar.cV();
        if (bpjnVar.dj(0)) {
            this.a = bpjnVar.g();
            fN(0);
        }
        if (bpjnVar.dj(1)) {
            this.b = bpjnVar.c();
            fN(1);
        }
        if (bpjnVar.dj(2)) {
            this.c = bpjnVar.e();
            fN(2);
        }
        if (bpjnVar.dj(3)) {
            this.d = bpjnVar.f();
            fN(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bpis)) {
            return false;
        }
        bpis bpisVar = (bpis) obj;
        return super.aE(bpisVar.cN) && this.a == bpisVar.a && this.b == bpisVar.b && this.c == bpisVar.c && Objects.equals(this.d, bpisVar.d);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "events", dqru.m(new String[]{"timestamp", "event", GroupManagementRequest.DATA_TAG}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "events";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Long.valueOf(this.a), Long.valueOf(this.b), this.c, this.d, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r8, java.util.List r9) {
        /*
            r7 = this;
            long r0 = r7.b
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            aiwp r1 = r7.c
            r2 = 0
            if (r1 != 0) goto L10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            goto L16
        L10:
            int r1 = r1.p
            java.lang.String r1 = java.lang.String.valueOf(r1)
        L16:
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
        L28:
            if (r2 >= r4) goto L5f
            r0 = r5[r2]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L38
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L57
        L38:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L4f
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r1.length()
            r6 = 12
            if (r3 >= r6) goto L4f
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r8.append(r0)
            goto L57
        L4f:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L57:
            r0 = 44
            r8.append(r0)
            int r2 = r2 + 1
            goto L28
        L5f:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpis.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "EventsTable -- REDACTED") : a();
    }
}
