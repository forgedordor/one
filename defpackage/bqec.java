package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dqpd;
import j$.time.Instant;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqec extends dqpd implements dqpf {
    public MessageIdType a;
    public MessageIdType b;
    public basd c;
    public Instant d;
    public Instant e;

    protected bqec() {
        MessageIdType messageIdType = bary.a;
        this.a = messageIdType;
        this.b = messageIdType;
        this.c = basd.a;
        this.d = Instant.EPOCH;
        this.e = Instant.EPOCH;
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "MessageEditsTable [message_id: %s,\n  latest_message_id: %s,\n  original_rcs_message_id: %s,\n  edited_at_timestamp_ms: %s,\n  received_at_timestamp_ms: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        MessageIdType messageIdType = this.a;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bary.a(this.a)));
        }
        MessageIdType messageIdType2 = this.b;
        if (messageIdType2 == null || messageIdType2.equals(bary.a)) {
            contentValues.putNull("latest_message_id");
        } else {
            contentValues.put("latest_message_id", Long.valueOf(bary.a(this.b)));
        }
        basd basdVar = this.c;
        if (basdVar == null) {
            contentValues.putNull("original_rcs_message_id");
        } else {
            contentValues.put("original_rcs_message_id", basd.d(basdVar));
        }
        Instant instant = this.d;
        if (instant == null) {
            contentValues.putNull("edited_at_timestamp_ms");
        } else {
            contentValues.put("edited_at_timestamp_ms", Long.valueOf(bart.a(instant)));
        }
        Instant instant2 = this.e;
        if (instant2 == null) {
            contentValues.putNull("received_at_timestamp_ms");
        } else {
            contentValues.put("received_at_timestamp_ms", Long.valueOf(bart.a(instant2)));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bqfc bqfcVar = (bqfc) ((bqew) dqqjVar);
        aC();
        this.cN = bqfcVar.cV();
        if (bqfcVar.dj(0)) {
            this.a = bqfcVar.h();
            fN(0);
        }
        if (bqfcVar.dj(1)) {
            this.b = bqfcVar.c();
            fN(1);
        }
        if (bqfcVar.dj(2)) {
            this.c = bqfcVar.i();
            fN(2);
        }
        if (bqfcVar.dj(3)) {
            this.d = bqfcVar.f();
            fN(3);
        }
        if (bqfcVar.dj(4)) {
            this.e = bqfcVar.g();
            fN(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bqec)) {
            return false;
        }
        bqec bqecVar = (bqec) obj;
        return super.aE(bqecVar.cN) && Objects.equals(this.a, bqecVar.a) && Objects.equals(this.b, bqecVar.b) && Objects.equals(this.c, bqecVar.c) && Objects.equals(this.d, bqecVar.d) && Objects.equals(this.e, bqecVar.e);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "message_edits", dqru.m(new String[]{"message_id", "latest_message_id", "original_rcs_message_id", "edited_at_timestamp_ms", "received_at_timestamp_ms"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "message_edits";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, this.c, this.d, this.e, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r9, java.util.List r10) {
        /*
            r8 = this;
            bqea r0 = new bqea
            r0.<init>(r8)
            java.lang.Object r0 = r0.get()
            bqeb r1 = new bqeb
            r1.<init>(r8)
            java.lang.Object r1 = r1.get()
            basd r2 = r8.c
            java.lang.String r2 = defpackage.basd.d(r2)
            j$.time.Instant r3 = r8.d
            long r3 = defpackage.bart.a(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            j$.time.Instant r4 = r8.e
            long r4 = defpackage.bart.a(r4)
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
        L43:
            if (r7 >= r5) goto L7a
            r0 = r6[r7]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L53
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r9.append(r0)
            goto L72
        L53:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L6a
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L6a
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r9.append(r0)
            goto L72
        L6a:
            r10.add(r0)
            r0 = 63
            r9.append(r0)
        L72:
            r0 = 44
            r9.append(r0)
            int r7 = r7 + 1
            goto L43
        L7a:
            int r10 = r9.length()
            int r10 = r10 + (-1)
            r9.setLength(r10)
            r10 = 41
            r9.append(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqec.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final basd k() {
        aA(2, "original_rcs_message_id");
        return this.c;
    }

    public final Instant m() {
        aA(3, "edited_at_timestamp_ms");
        return this.d;
    }

    public final Instant n() {
        aA(4, "received_at_timestamp_ms");
        return this.e;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "MessageEditsTable -- REDACTED") : a();
    }
}
