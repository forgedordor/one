package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class buxp extends dqpd implements dqpf {
    public String a;
    public MessageIdType b = bary.a;
    public long c;
    public long d;

    protected buxp() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "UserReferenceTable [_id: %s,\n  message_id: %s,\n  user_ref_id: %s,\n  user_ref_datetime: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        MessageIdType messageIdType = this.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bary.a(this.b)));
        }
        dqru.u(contentValues, "user_ref_id", this.c);
        contentValues.put("user_ref_datetime", Long.valueOf(this.d));
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        buyk buykVar = (buyk) ((buyf) dqqjVar);
        aC();
        this.cN = buykVar.cV();
        if (buykVar.dj(0)) {
            this.a = buykVar.g();
            super.fN(0);
        }
        if (buykVar.dj(1)) {
            this.b = buykVar.f();
            super.fN(1);
        }
        if (buykVar.dj(2)) {
            this.c = buykVar.c();
            super.fN(2);
        }
        if (buykVar.dj(3)) {
            this.d = buykVar.e();
            super.fN(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof buxp)) {
            return false;
        }
        buxp buxpVar = (buxp) obj;
        return super.aE(buxpVar.cN) && Objects.equals(this.a, buxpVar.a) && Objects.equals(this.b, buxpVar.b) && this.c == buxpVar.c && this.d == buxpVar.d;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "user_references", dqru.m(new String[]{"message_id", "user_ref_id", "user_ref_datetime"}));
    }

    @Override // defpackage.dqpd
    public final void fN(int i) {
        super.fN(0);
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "user_references";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, Long.valueOf(this.c), Long.valueOf(this.d), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r8, java.util.List r9) {
        /*
            r7 = this;
            buxo r0 = new buxo
            r0.<init>(r7)
            java.lang.Object r0 = r0.get()
            long r1 = r7.c
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            long r2 = r7.d
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
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
        L26:
            if (r5 >= r3) goto L5d
            r0 = r4[r5]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L36
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L55
        L36:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L4d
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r6 = 12
            if (r2 >= r6) goto L4d
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r8.append(r0)
            goto L55
        L4d:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L55:
            r0 = 44
            r8.append(r0)
            int r5 = r5 + 1
            goto L26
        L5d:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.buxp.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final long k() {
        aA(2, "user_ref_id");
        return this.c;
    }

    public final long m() {
        aA(3, "user_ref_datetime");
        return this.d;
    }

    public final MessageIdType n() {
        aA(1, "message_id");
        return this.b;
    }

    public final /* synthetic */ void o(Long l) {
        if (l.longValue() >= 0) {
            this.a = String.valueOf(l);
            super.fN(0);
        }
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "UserReferenceTable -- REDACTED") : a();
    }
}
