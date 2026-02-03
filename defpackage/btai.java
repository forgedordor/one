package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dqpd;
import j$.util.Objects;
import j$.util.Optional;
import java.util.BitSet;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btai extends dqpd implements dqpf {
    public String a;
    public long c;
    public MessageIdType b = bary.a;
    public long d = 0;
    public long e = 0;
    public Optional f = basb.b(-1);

    protected btai() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "ReadReportsTable [_id: %s,\n  message_id: %s,\n  participant_id: %s,\n  receive_time: %s,\n  read_time: %s,\n  ftd_time: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = btbt.d().intValue();
        MessageIdType messageIdType = this.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bary.a(this.b)));
        }
        dqru.u(contentValues, "participant_id", this.c);
        contentValues.put("receive_time", Long.valueOf(this.d));
        contentValues.put("read_time", Long.valueOf(this.e));
        if (iIntValue >= 58880) {
            Optional optional = this.f;
            if (optional == null) {
                contentValues.putNull("ftd_time");
            } else {
                contentValues.put("ftd_time", Long.valueOf(basb.a(optional)));
            }
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        btbj btbjVar = (btbj) ((btbc) dqqjVar);
        aC();
        this.cN = btbjVar.cV();
        if (btbjVar.dj(0)) {
            this.a = btbjVar.i();
            super.fN(0);
        }
        if (btbjVar.dj(1)) {
            this.b = btbjVar.g();
            super.fN(1);
        }
        if (btbjVar.dj(2)) {
            this.c = btbjVar.c();
            super.fN(2);
        }
        if (btbjVar.dj(3)) {
            this.d = btbjVar.f();
            super.fN(3);
        }
        if (btbjVar.dj(4)) {
            this.e = btbjVar.e();
            super.fN(4);
        }
        if (btbjVar.dj(5)) {
            this.f = btbjVar.h();
            super.fN(5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof btai)) {
            return false;
        }
        btai btaiVar = (btai) obj;
        return super.aE(btaiVar.cN) && Objects.equals(this.a, btaiVar.a) && Objects.equals(this.b, btaiVar.b) && this.c == btaiVar.c && this.d == btaiVar.d && this.e == btaiVar.e && Objects.equals(this.f, btaiVar.f);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "read_reports", dqru.m(new String[]{"message_id", "participant_id", "receive_time", "read_time", "ftd_time"}));
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
        return "read_reports";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, Long.valueOf(this.c), Long.valueOf(this.d), Long.valueOf(this.e), this.f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r9, java.util.List r10) {
        /*
            r8 = this;
            btah r0 = new btah
            r0.<init>(r8)
            java.lang.Object r0 = r0.get()
            long r1 = r8.c
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            long r2 = r8.d
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r3 = r8.e
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            j$.util.Optional r4 = r8.f
            long r4 = defpackage.basb.a(r4)
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
        L3c:
            if (r7 >= r5) goto L73
            r0 = r6[r7]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L4c
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r9.append(r0)
            goto L6b
        L4c:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L63
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L63
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r9.append(r0)
            goto L6b
        L63:
            r10.add(r0)
            r0 = 63
            r9.append(r0)
        L6b:
            r0 = 44
            r9.append(r0)
            int r7 = r7 + 1
            goto L3c
        L73:
            int r10 = r9.length()
            int r10 = r10 + (-1)
            r9.setLength(r10)
            r10 = 41
            r9.append(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btai.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final long k() {
        aA(2, "participant_id");
        return this.c;
    }

    public final long m() {
        aA(4, "read_time");
        return this.e;
    }

    public final long n() {
        aA(3, "receive_time");
        return this.d;
    }

    public final MessageIdType o() {
        aA(1, "message_id");
        return this.b;
    }

    public final btak p() {
        btal btalVar = new btal();
        BitSet bitSet = this.cL;
        btalVar.az = bitSet == null ? null : (BitSet) bitSet.clone();
        BitSet bitSet2 = btalVar.az;
        if (bitSet2 == null || bitSet2.get(0)) {
            aA(0, "_id");
            btalVar.a = this.a;
        }
        BitSet bitSet3 = btalVar.az;
        if (bitSet3 == null || bitSet3.get(1)) {
            btalVar.b = o();
        }
        BitSet bitSet4 = btalVar.az;
        if (bitSet4 == null || bitSet4.get(2)) {
            btalVar.c = k();
        }
        BitSet bitSet5 = btalVar.az;
        if (bitSet5 == null || bitSet5.get(3)) {
            btalVar.d = n();
        }
        BitSet bitSet6 = btalVar.az;
        if (bitSet6 == null || bitSet6.get(4)) {
            btalVar.e = m();
        }
        BitSet bitSet7 = btalVar.az;
        if (bitSet7 != null && !bitSet7.get(5)) {
            return btalVar;
        }
        btalVar.f = q();
        return btalVar;
    }

    public final Optional q() {
        aA(5, "ftd_time");
        return this.f;
    }

    public final /* synthetic */ void r(Long l) {
        if (l.longValue() >= 0) {
            this.a = String.valueOf(l);
            super.fN(0);
        }
    }

    public final /* synthetic */ void s(Long l) {
        if (l.longValue() >= 0) {
            this.a = String.valueOf(l);
            super.fN(0);
        }
    }

    public final /* synthetic */ void t(Long l) {
        if (l.longValue() >= 0) {
            this.a = String.valueOf(l);
            super.fN(0);
        }
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "ReadReportsTable -- REDACTED") : a();
    }
}
