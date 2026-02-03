package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class boar extends dqpd<bobl, bobz, boca, boar, bobk> implements dqpf<Long> {
    public String a;
    public long c;
    public ConversationIdType b = barn.a;
    public boolean d = false;
    public auej e = auej.UNKNOWN_STATE;
    public bbaj f = bbam.b();

    protected boar() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "ConversationParticipantsTable [_id: %s,\n  conversation_id: %s,\n  participant_id: %s,\n  is_normalized: %s,\n  rcs_group_join_status: %s,\n  last_modified_by_key: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = bocg.d().intValue();
        ConversationIdType conversationIdType = this.b;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(barn.a(this.b)));
        }
        dqru.u(contentValues, "participant_id", this.c);
        if (iIntValue >= 58090) {
            contentValues.put("is_normalized", Boolean.valueOf(this.d));
        }
        if (iIntValue >= 58570) {
            auej auejVar = this.e;
            if (auejVar == null) {
                contentValues.putNull("rcs_group_join_status");
            } else {
                contentValues.put("rcs_group_join_status", Integer.valueOf(auejVar.e));
            }
        }
        if (iIntValue >= 59440) {
            bbaj bbajVar = this.f;
            if (bbajVar == null) {
                contentValues.putNull("last_modified_by_key");
            } else {
                contentValues.put("last_modified_by_key", bbam.c(bbajVar));
            }
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bobs bobsVar = (bobs) ((bobl) dqqjVar);
        aC();
        this.cN = bobsVar.cV();
        if (bobsVar.dj(0)) {
            this.a = bobsVar.i();
            super.fN(0);
        }
        if (bobsVar.dj(1)) {
            this.b = bobsVar.g();
            super.fN(1);
        }
        if (bobsVar.dj(2)) {
            this.c = bobsVar.e();
            super.fN(2);
        }
        if (bobsVar.dj(3)) {
            this.d = bobsVar.j();
            super.fN(3);
        }
        if (bobsVar.dj(4)) {
            this.e = bobsVar.f();
            super.fN(4);
        }
        if (bobsVar.dj(5)) {
            this.f = bobsVar.h();
            super.fN(5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof boar)) {
            return false;
        }
        boar boarVar = (boar) obj;
        return super.aE(boarVar.cN) && Objects.equals(this.a, boarVar.a) && Objects.equals(this.b, boarVar.b) && this.c == boarVar.c && this.d == boarVar.d && this.e == boarVar.e && Objects.equals(this.f, boarVar.f);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversation_participants", dqru.m(new String[]{"conversation_id", "participant_id", "is_normalized", "rcs_group_join_status", "last_modified_by_key"}));
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
        return "conversation_participants";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, Long.valueOf(this.c), Boolean.valueOf(this.d), this.e, this.f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r9, java.util.List r10) {
        /*
            r8 = this;
            boaq r0 = new boaq
            r0.<init>(r8)
            java.lang.Object r0 = r0.get()
            long r1 = r8.c
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            boolean r2 = r8.d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            auej r3 = r8.e
            r4 = 0
            if (r3 != 0) goto L1f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            goto L25
        L1f:
            int r3 = r3.e
            java.lang.String r3 = java.lang.String.valueOf(r3)
        L25:
            bbaj r5 = r8.f
            java.lang.String r5 = defpackage.bbam.c(r5)
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
        L41:
            if (r4 >= r6) goto L78
            r0 = r7[r4]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L51
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r9.append(r0)
            goto L70
        L51:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L68
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L68
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r9.append(r0)
            goto L70
        L68:
            r10.add(r0)
            r0 = 63
            r9.append(r0)
        L70:
            r0 = 44
            r9.append(r0)
            int r4 = r4 + 1
            goto L41
        L78:
            int r10 = r9.length()
            int r10 = r10 + (-1)
            r9.setLength(r10)
            r10 = 41
            r9.append(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.boar.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final long k() {
        aA(2, "participant_id");
        return this.c;
    }

    public final ConversationIdType m() {
        aA(1, "conversation_id");
        return this.b;
    }

    public final /* synthetic */ void n(Long l) {
        if (l.longValue() >= 0) {
            this.a = String.valueOf(l);
            super.fN(0);
        }
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "ConversationParticipantsTable -- REDACTED") : a();
    }
}
