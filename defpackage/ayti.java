package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ayti extends dqpd implements dqpf {
    public long a;
    public int c;
    public boolean d;
    public boolean f;
    public ConversationIdType b = barn.a;
    public auej e = auej.b(0);

    protected ayti() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "BackupConversationParticipantsTable [_id: %s,\n  conversation_id: %s,\n  participant_id: %s,\n  is_normalized: %s,\n  rcs_group_join_status: %s,\n  is_c2p_only: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = ayuu.c().intValue();
        contentValues.put("_id", Long.valueOf(this.a));
        ConversationIdType conversationIdType = this.b;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(barn.a(this.b)));
        }
        contentValues.put("participant_id", Integer.valueOf(this.c));
        contentValues.put("is_normalized", Boolean.valueOf(this.d));
        auej auejVar = this.e;
        if (auejVar == null) {
            contentValues.putNull("rcs_group_join_status");
        } else {
            contentValues.put("rcs_group_join_status", Integer.valueOf(auejVar.e));
        }
        if (iIntValue >= 70) {
            contentValues.put("is_c2p_only", Boolean.valueOf(this.f));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        ayuj ayujVar = (ayuj) ((ayuc) dqqjVar);
        aC();
        this.cN = ayujVar.cV();
        if (ayujVar.dj(0)) {
            this.a = ayujVar.e();
            fN(0);
        }
        if (ayujVar.dj(1)) {
            this.b = ayujVar.g();
            fN(1);
        }
        if (ayujVar.dj(2)) {
            this.c = ayujVar.c();
            fN(2);
        }
        if (ayujVar.dj(3)) {
            this.d = ayujVar.i();
            fN(3);
        }
        if (ayujVar.dj(4)) {
            this.e = ayujVar.f();
            fN(4);
        }
        if (ayujVar.dj(5)) {
            this.f = ayujVar.h();
            fN(5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ayti)) {
            return false;
        }
        ayti aytiVar = (ayti) obj;
        return super.aE(aytiVar.cN) && this.a == aytiVar.a && Objects.equals(this.b, aytiVar.b) && this.c == aytiVar.c && this.d == aytiVar.d && this.e == aytiVar.e && this.f == aytiVar.f;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversation_participants_backup", dqru.m(new String[]{"_id", "conversation_id", "participant_id", "is_normalized", "rcs_group_join_status", "is_c2p_only"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "conversation_participants_backup";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Long.valueOf(this.a), this.b, Integer.valueOf(this.c), Boolean.valueOf(this.d), this.e, Boolean.valueOf(this.f), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r10, java.util.List r11) {
        /*
            r9 = this;
            long r0 = r9.a
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            ayth r1 = new ayth
            r1.<init>(r9)
            java.lang.Object r1 = r1.get()
            int r2 = r9.c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r3 = r9.d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            auej r4 = r9.e
            r5 = 0
            if (r4 != 0) goto L25
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            goto L2b
        L25:
            int r4 = r4.e
            java.lang.String r4 = java.lang.String.valueOf(r4)
        L2b:
            boolean r6 = r9.f
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
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
        L4a:
            if (r5 >= r7) goto L81
            r0 = r8[r5]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L5a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r10.append(r0)
            goto L79
        L5a:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L71
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L71
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r10.append(r0)
            goto L79
        L71:
            r11.add(r0)
            r0 = 63
            r10.append(r0)
        L79:
            r0 = 44
            r10.append(r0)
            int r5 = r5 + 1
            goto L4a
        L81:
            int r11 = r10.length()
            int r11 = r11 + (-1)
            r10.setLength(r11)
            r11 = 41
            r10.append(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayti.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "BackupConversationParticipantsTable -- REDACTED") : a();
    }
}
