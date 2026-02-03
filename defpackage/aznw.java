package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class aznw extends dqpd implements dqpf {
    public long a;
    public long c;
    public MessageIdType b = bary.a;
    public long d = 0;
    public long e = 0;
    public long f = -1;

    protected aznw() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "BackupReadReportsTable [_id: %s,\n  message_id: %s,\n  participant_id: %s,\n  receive_time: %s,\n  read_time: %s,\n  ftd_time: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        MessageIdType messageIdType = this.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bary.a(this.b)));
        }
        dqru.u(contentValues, "participant_id", this.c);
        contentValues.put("receive_time", Long.valueOf(this.d));
        contentValues.put("read_time", Long.valueOf(this.e));
        contentValues.put("ftd_time", Long.valueOf(this.f));
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        azox azoxVar = (azox) ((azoq) dqqjVar);
        aC();
        this.cN = azoxVar.cV();
        if (azoxVar.dj(0)) {
            this.a = azoxVar.e();
            fN(0);
        }
        if (azoxVar.dj(1)) {
            this.b = azoxVar.i();
            fN(1);
        }
        if (azoxVar.dj(2)) {
            this.c = azoxVar.f();
            fN(2);
        }
        if (azoxVar.dj(3)) {
            this.d = azoxVar.h();
            fN(3);
        }
        if (azoxVar.dj(4)) {
            this.e = azoxVar.g();
            fN(4);
        }
        if (azoxVar.dj(5)) {
            this.f = azoxVar.c();
            fN(5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aznw)) {
            return false;
        }
        aznw aznwVar = (aznw) obj;
        return super.aE(aznwVar.cN) && this.a == aznwVar.a && Objects.equals(this.b, aznwVar.b) && this.c == aznwVar.c && this.d == aznwVar.d && this.e == aznwVar.e && this.f == aznwVar.f;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "read_reports_backup", dqru.m(new String[]{"message_id", "participant_id", "receive_time", "read_time", "ftd_time"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "read_reports_backup";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Long.valueOf(this.a), this.b, Long.valueOf(this.c), Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r9, java.util.List r10) {
        /*
            r8 = this;
            aznv r0 = new aznv
            r0.<init>(r8)
            java.lang.Object r0 = r0.get()
            long r1 = r8.c
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            long r2 = r8.d
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r3 = r8.e
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            long r4 = r8.f
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
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
        L38:
            if (r7 >= r5) goto L6f
            r0 = r6[r7]
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
            int r7 = r7 + 1
            goto L38
        L6f:
            int r10 = r9.length()
            int r10 = r10 + (-1)
            r9.setLength(r10)
            r10 = 41
            r9.append(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aznw.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "BackupReadReportsTable -- REDACTED") : a();
    }
}
