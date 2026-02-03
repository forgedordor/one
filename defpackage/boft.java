package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.dqpd;
import j$.time.Instant;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class boft extends dqpd implements dqpf {
    public long a;
    public long c;
    public long e;
    public Instant b = Instant.EPOCH;
    public ConversationIdType d = barn.a;
    public auej f = auej.UNKNOWN_STATE;
    public bbaj g = bbaj.a;

    protected boft() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "ConversationToParticipantsAuditLogTable [_id: %s,\n  operation_datetime: %s,\n  operation_type: %s,\n  conversation_id: %s,\n  participant_id: %s,\n  rcs_group_join_status: %s,\n  last_modified_by_key: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        Instant instant = this.b;
        if (instant == null) {
            contentValues.putNull("operation_datetime");
        } else {
            contentValues.put("operation_datetime", Long.valueOf(bart.a(instant)));
        }
        contentValues.put("operation_type", Long.valueOf(this.c));
        ConversationIdType conversationIdType = this.d;
        if (conversationIdType == null) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(barn.a(conversationIdType)));
        }
        contentValues.put("participant_id", Long.valueOf(this.e));
        auej auejVar = this.f;
        if (auejVar == null) {
            contentValues.putNull("rcs_group_join_status");
        } else {
            contentValues.put("rcs_group_join_status", Integer.valueOf(auejVar.e));
        }
        bbaj bbajVar = this.g;
        if (bbajVar == null) {
            contentValues.putNull("last_modified_by_key");
        } else {
            contentValues.put("last_modified_by_key", bbam.c(bbajVar));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bogv bogvVar = (bogv) ((bogn) dqqjVar);
        aC();
        this.cN = bogvVar.cV();
        if (bogvVar.dj(0)) {
            this.a = bogvVar.c();
            fN(0);
        }
        if (bogvVar.dj(1)) {
            this.b = bogvVar.j();
            fN(1);
        }
        if (bogvVar.dj(2)) {
            this.c = bogvVar.e();
            fN(2);
        }
        if (bogvVar.dj(3)) {
            this.d = bogvVar.h();
            fN(3);
        }
        if (bogvVar.dj(4)) {
            this.e = bogvVar.f();
            fN(4);
        }
        if (bogvVar.dj(5)) {
            this.f = bogvVar.g();
            fN(5);
        }
        if (bogvVar.dj(6)) {
            this.g = bogvVar.i();
            fN(6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof boft)) {
            return false;
        }
        boft boftVar = (boft) obj;
        return super.aE(boftVar.cN) && this.a == boftVar.a && Objects.equals(this.b, boftVar.b) && this.c == boftVar.c && Objects.equals(this.d, boftVar.d) && this.e == boftVar.e && this.f == boftVar.f && Objects.equals(this.g, boftVar.g);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversation_to_participants_audit_log", dqru.m(new String[]{"operation_datetime", "operation_type", "conversation_id", "participant_id", "rcs_group_join_status", "last_modified_by_key"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "conversation_to_participants_audit_log";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Long.valueOf(this.a), this.b, Long.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, this.g, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r10, java.util.List r11) {
        /*
            r9 = this;
            j$.time.Instant r0 = r9.b
            long r0 = defpackage.bart.a(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r1 = r9.c
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r2 = r9.d
            long r2 = defpackage.barn.a(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r3 = r9.e
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            auej r4 = r9.f
            r5 = 0
            if (r4 != 0) goto L2a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            goto L30
        L2a:
            int r4 = r4.e
            java.lang.String r4 = java.lang.String.valueOf(r4)
        L30:
            bbaj r6 = r9.g
            java.lang.String r6 = defpackage.bbam.c(r6)
            r7 = 6
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r8[r5] = r0
            r0 = 1
            r8[r0] = r1
            r0 = 2
            r8[r0] = r2
            r0 = 3
            r8[r0] = r3
            r0 = 4
            r8[r0] = r4
            r0 = 5
            r8[r0] = r6
            r0 = 40
            r10.append(r0)
        L4f:
            if (r5 >= r7) goto L86
            r0 = r8[r5]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L5f
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r10.append(r0)
            goto L7e
        L5f:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L76
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L76
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r10.append(r0)
            goto L7e
        L76:
            r11.add(r0)
            r0 = 63
            r10.append(r0)
        L7e:
            r0 = 44
            r10.append(r0)
            int r5 = r5 + 1
            goto L4f
        L86:
            int r11 = r10.length()
            int r11 = r11 + (-1)
            r10.setLength(r11)
            r11 = 41
            r10.append(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.boft.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "ConversationToParticipantsAuditLogTable -- REDACTED") : a();
    }
}
