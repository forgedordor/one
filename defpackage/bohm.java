package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.BitSet;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bohm extends dqpd<boie, boip, boiq, bohm, boid> implements dqpf<Long> {
    public long b;
    public ConversationIdType a = barn.a;
    public auej c = auej.UNKNOWN_STATE;
    public bbaj d = bbam.b();

    protected bohm() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "ConversationToParticipantsTable [conversation_id: %s,\n  participant_id: %s,\n  rcs_group_join_status: %s,\n  last_modified_by_key: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        ConversationIdType conversationIdType = this.a;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(barn.a(this.a)));
        }
        dqru.u(contentValues, "participant_id", this.b);
        auej auejVar = this.c;
        if (auejVar == null) {
            contentValues.putNull("rcs_group_join_status");
        } else {
            contentValues.put("rcs_group_join_status", Integer.valueOf(auejVar.e));
        }
        bbaj bbajVar = this.d;
        if (bbajVar == null) {
            contentValues.putNull("last_modified_by_key");
        } else {
            contentValues.put("last_modified_by_key", bbam.c(bbajVar));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        boij boijVar = (boij) ((boie) dqqjVar);
        aC();
        this.cN = boijVar.cV();
        if (boijVar.dj(0)) {
            this.a = boijVar.e();
            fN(0);
        }
        if (boijVar.dj(1)) {
            this.b = boijVar.c();
            fN(1);
        }
        if (boijVar.dj(2)) {
            this.c = boijVar.f();
            fN(2);
        }
        if (boijVar.dj(3)) {
            this.d = boijVar.g();
            fN(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bohm)) {
            return false;
        }
        bohm bohmVar = (bohm) obj;
        return super.aE(bohmVar.cN) && Objects.equals(this.a, bohmVar.a) && this.b == bohmVar.b && this.c == bohmVar.c && Objects.equals(this.d, bohmVar.d);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversation_to_participants", dqru.m(new String[]{"conversation_id", "participant_id", "rcs_group_join_status", "last_modified_by_key"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "conversation_to_participants";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, Long.valueOf(this.b), this.c, this.d, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r8, java.util.List r9) {
        /*
            r7 = this;
            bohl r0 = new bohl
            r0.<init>(r7)
            java.lang.Object r0 = r0.get()
            long r1 = r7.b
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            auej r2 = r7.c
            r3 = 0
            if (r2 != 0) goto L19
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            goto L1f
        L19:
            int r2 = r2.e
            java.lang.String r2 = java.lang.String.valueOf(r2)
        L1f:
            bbaj r4 = r7.d
            java.lang.String r4 = defpackage.bbam.c(r4)
            r5 = 4
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r6[r3] = r0
            r0 = 1
            r6[r0] = r1
            r0 = 2
            r6[r0] = r2
            r0 = 3
            r6[r0] = r4
            r0 = 40
            r8.append(r0)
        L38:
            if (r3 >= r5) goto L6f
            r0 = r6[r3]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L48
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L67
        L48:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L5f
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r4 = 12
            if (r2 >= r4) goto L5f
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r8.append(r0)
            goto L67
        L5f:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L67:
            r0 = 44
            r8.append(r0)
            int r3 = r3 + 1
            goto L38
        L6f:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bohm.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final long k() {
        aA(1, "participant_id");
        return this.b;
    }

    public final auej m() {
        aA(2, "rcs_group_join_status");
        return this.c;
    }

    public final ConversationIdType n() {
        aA(0, "conversation_id");
        return this.a;
    }

    public final bbaj o() {
        aA(3, "last_modified_by_key");
        return this.d;
    }

    public final bohq p() {
        bohr bohrVar = new bohr();
        BitSet bitSet = this.cL;
        bohrVar.az = bitSet == null ? null : (BitSet) bitSet.clone();
        BitSet bitSet2 = bohrVar.az;
        if (bitSet2 == null || bitSet2.get(0)) {
            bohrVar.a = n();
        }
        BitSet bitSet3 = bohrVar.az;
        if (bitSet3 == null || bitSet3.get(1)) {
            bohrVar.b = k();
        }
        BitSet bitSet4 = bohrVar.az;
        if (bitSet4 == null || bitSet4.get(2)) {
            bohrVar.c = m();
        }
        BitSet bitSet5 = bohrVar.az;
        if (bitSet5 != null && !bitSet5.get(3)) {
            return bohrVar;
        }
        bohrVar.d = o();
        return bohrVar;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "ConversationToParticipantsTable -- REDACTED") : a();
    }
}
