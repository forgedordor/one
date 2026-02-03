package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqrm extends dqpd implements dqpf {
    public long a;
    public MessageIdType b = bary.a;

    protected bqrm() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "MessageStarTable [_id: %s,\n  message_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        MessageIdType messageIdType = this.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bary.a(this.b)));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bqsa bqsaVar = (bqsa) ((bqrx) dqqjVar);
        aC();
        this.cN = bqsaVar.cV();
        if (bqsaVar.dj(0)) {
            this.a = bqsaVar.c();
            super.fN(0);
        }
        if (bqsaVar.dj(1)) {
            this.b = bqsaVar.e();
            super.fN(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bqrm)) {
            return false;
        }
        bqrm bqrmVar = (bqrm) obj;
        return super.aE(bqrmVar.cN) && this.a == bqrmVar.a && Objects.equals(this.b, bqrmVar.b);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "message_star", dqru.m(new String[]{"message_id"}));
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
        return "message_star";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Long.valueOf(this.a), this.b, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r7, java.util.List r8) {
        /*
            r6 = this;
            bqrl r0 = new bqrl
            r0.<init>(r6)
            java.lang.Object r0 = r0.get()
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 40
            r7.append(r0)
        L14:
            if (r2 > 0) goto L4b
            r0 = r1[r2]
            boolean r3 = r0 instanceof java.lang.Number
            if (r3 == 0) goto L24
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.append(r0)
            goto L43
        L24:
            boolean r3 = r0 instanceof java.lang.String
            if (r3 == 0) goto L3b
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r3.length()
            r5 = 12
            if (r4 >= r5) goto L3b
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r3)
            r7.append(r0)
            goto L43
        L3b:
            r8.add(r0)
            r0 = 63
            r7.append(r0)
        L43:
            r0 = 44
            r7.append(r0)
            int r2 = r2 + 1
            goto L14
        L4b:
            int r8 = r7.length()
            int r8 = r8 + (-1)
            r7.setLength(r8)
            r8 = 41
            r7.append(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqrm.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final MessageIdType k() {
        aA(1, "message_id");
        return this.b;
    }

    public final /* synthetic */ void m(Long l) {
        if (l.longValue() >= 0) {
            this.a = l.longValue();
            super.fN(0);
        }
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "MessageStarTable -- REDACTED") : a();
    }
}
