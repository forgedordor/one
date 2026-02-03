package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.dqpd;
import j$.time.Instant;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bnyv extends dqpd implements dqpf {
    public String a;
    public long c;
    public String d;
    public long f;
    public boolean g;
    public Instant b = Instant.EPOCH;
    public ConversationIdType e = barn.a;
    public auej h = auej.UNKNOWN_STATE;
    public bbaj i = bbaj.a;

    protected bnyv() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "ConversationParticipantsAuditLogTable [_id: %s,\n  operation_datetime: %s,\n  operation_type: %s,\n  conversation_participants_id: %s,\n  conversation_id: %s,\n  participant_id: %s,\n  is_normalized: %s,\n  rcs_group_join_status: %s,\n  last_modified_by_key: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = boal.c().intValue();
        Instant instant = this.b;
        if (instant == null) {
            contentValues.putNull("operation_datetime");
        } else {
            contentValues.put("operation_datetime", Long.valueOf(bart.a(instant)));
        }
        contentValues.put("operation_type", Long.valueOf(this.c));
        dqru.v(contentValues, "conversation_participants_id", this.d);
        ConversationIdType conversationIdType = this.e;
        if (conversationIdType == null) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(barn.a(conversationIdType)));
        }
        contentValues.put("participant_id", Long.valueOf(this.f));
        contentValues.put("is_normalized", Boolean.valueOf(this.g));
        auej auejVar = this.h;
        if (auejVar == null) {
            contentValues.putNull("rcs_group_join_status");
        } else {
            contentValues.put("rcs_group_join_status", Integer.valueOf(auejVar.e));
        }
        if (iIntValue >= 59440) {
            bbaj bbajVar = this.i;
            if (bbajVar == null) {
                contentValues.putNull("last_modified_by_key");
            } else {
                contentValues.put("last_modified_by_key", bbam.c(bbajVar));
            }
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        boad boadVar = (boad) ((bnzt) dqqjVar);
        aC();
        this.cN = boadVar.cV();
        if (boadVar.dj(0)) {
            this.a = boadVar.k();
            fN(0);
        }
        if (boadVar.dj(1)) {
            this.b = boadVar.i();
            fN(1);
        }
        if (boadVar.dj(2)) {
            this.c = boadVar.c();
            fN(2);
        }
        if (boadVar.dj(3)) {
            this.d = boadVar.j();
            fN(3);
        }
        if (boadVar.dj(4)) {
            this.e = boadVar.g();
            fN(4);
        }
        if (boadVar.dj(5)) {
            this.f = boadVar.e();
            fN(5);
        }
        if (boadVar.dj(6)) {
            this.g = boadVar.l();
            fN(6);
        }
        if (boadVar.dj(7)) {
            this.h = boadVar.f();
            fN(7);
        }
        if (boadVar.dj(8)) {
            this.i = boadVar.h();
            fN(8);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bnyv)) {
            return false;
        }
        bnyv bnyvVar = (bnyv) obj;
        return super.aE(bnyvVar.cN) && Objects.equals(this.a, bnyvVar.a) && Objects.equals(this.b, bnyvVar.b) && this.c == bnyvVar.c && Objects.equals(this.d, bnyvVar.d) && Objects.equals(this.e, bnyvVar.e) && this.f == bnyvVar.f && this.g == bnyvVar.g && this.h == bnyvVar.h && Objects.equals(this.i, bnyvVar.i);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversation_participants_audit_log", dqru.m(new String[]{"operation_datetime", "operation_type", "conversation_participants_id", "conversation_id", "participant_id", "is_normalized", "rcs_group_join_status", "last_modified_by_key"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "conversation_participants_audit_log";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, Long.valueOf(this.c), this.d, this.e, Long.valueOf(this.f), Boolean.valueOf(this.g), this.h, this.i, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r12, java.util.List r13) {
        /*
            r11 = this;
            j$.time.Instant r0 = r11.b
            long r0 = defpackage.bart.a(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r1 = r11.c
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = r11.d
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r3 = r11.e
            long r3 = defpackage.barn.a(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            long r4 = r11.f
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            boolean r5 = r11.g
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            auej r6 = r11.h
            r7 = 0
            if (r6 != 0) goto L32
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            goto L38
        L32:
            int r6 = r6.e
            java.lang.String r6 = java.lang.String.valueOf(r6)
        L38:
            bbaj r8 = r11.i
            java.lang.String r8 = defpackage.bbam.c(r8)
            r9 = 8
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r10[r7] = r0
            r0 = 1
            r10[r0] = r1
            r0 = 2
            r10[r0] = r2
            r0 = 3
            r10[r0] = r3
            r0 = 4
            r10[r0] = r4
            r0 = 5
            r10[r0] = r5
            r0 = 6
            r10[r0] = r6
            r0 = 7
            r10[r0] = r8
            r0 = 40
            r12.append(r0)
        L5e:
            if (r7 >= r9) goto L95
            r0 = r10[r7]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L6e
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r12.append(r0)
            goto L8d
        L6e:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L85
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L85
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r12.append(r0)
            goto L8d
        L85:
            r13.add(r0)
            r0 = 63
            r12.append(r0)
        L8d:
            r0 = 44
            r12.append(r0)
            int r7 = r7 + 1
            goto L5e
        L95:
            int r13 = r12.length()
            int r13 = r13 + (-1)
            r12.setLength(r13)
            r13 = 41
            r12.append(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnyv.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final long k() {
        aA(5, "participant_id");
        return this.f;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "ConversationParticipantsAuditLogTable -- REDACTED") : a();
    }
}
