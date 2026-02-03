package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class brns extends dqpd implements dqpf {
    public ConversationIdType a = barn.a;
    public akbk b = akbk.a;

    protected brns() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "ParentDisallowedConversationsTable [conversation_id: %s,\n  conversation_parent_supervision_state: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = bros.c().intValue();
        ConversationIdType conversationIdType = this.a;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(barn.a(this.a)));
        }
        if (iIntValue >= 60790) {
            akbk akbkVar = this.b;
            if (akbkVar == null) {
                contentValues.putNull("conversation_parent_supervision_state");
            } else {
                contentValues.put("conversation_parent_supervision_state", Integer.valueOf(akbkVar.ordinal()));
            }
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        brog brogVar = (brog) ((brod) dqqjVar);
        aC();
        this.cN = brogVar.cV();
        if (brogVar.dj(0)) {
            this.a = brogVar.e();
            fN(0);
        }
        if (brogVar.dj(1)) {
            this.b = brogVar.c();
            fN(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof brns)) {
            return false;
        }
        brns brnsVar = (brns) obj;
        return super.aE(brnsVar.cN) && Objects.equals(this.a, brnsVar.a) && this.b == brnsVar.b;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "parent_disallowed_conversations", dqru.m(new String[]{"conversation_id", "conversation_parent_supervision_state"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "parent_disallowed_conversations";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        ConversationIdType conversationIdType = this.a;
        akbk akbkVar = this.b;
        return Objects.hash(dqqeVar2, conversationIdType, Integer.valueOf(akbkVar == null ? 0 : akbkVar.ordinal()), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r8, java.util.List r9) {
        /*
            r7 = this;
            brnr r0 = new brnr
            r0.<init>(r7)
            java.lang.Object r0 = r0.get()
            akbk r1 = r7.b
            r2 = 0
            if (r1 != 0) goto L13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            goto L1b
        L13:
            int r1 = r1.ordinal()
            java.lang.String r1 = java.lang.String.valueOf(r1)
        L1b:
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r2] = r0
            r0 = 1
            r4[r0] = r1
            r0 = 40
            r8.append(r0)
        L28:
            if (r2 >= r3) goto L5f
            r0 = r4[r2]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L38
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L57
        L38:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L4f
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r5 = r1.length()
            r6 = 12
            if (r5 >= r6) goto L4f
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r8.append(r0)
            goto L57
        L4f:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L57:
            r0 = 44
            r8.append(r0)
            int r2 = r2 + 1
            goto L28
        L5f:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brns.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final akbk k() {
        aA(1, "conversation_parent_supervision_state");
        return this.b;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "ParentDisallowedConversationsTable -- REDACTED") : a();
    }
}
