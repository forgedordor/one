package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class crzm extends dqpd implements dqpf {
    public String b;
    public String d;
    public long e;
    public MessageIdType a = bary.a;
    public ConversationIdType c = barn.a;

    protected crzm() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "SpamLoggingIdsTable [message_id: %s,\n  message_logging_id: %s,\n  conversation_id: %s,\n  conversation_logging_id: %s,\n  generation_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        MessageIdType messageIdType = this.a;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bary.a(this.a)));
        }
        dqru.v(contentValues, "message_logging_id", this.b);
        ConversationIdType conversationIdType = this.c;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(barn.a(this.c)));
        }
        dqru.v(contentValues, "conversation_logging_id", this.d);
        contentValues.put("generation_timestamp", Long.valueOf(this.e));
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        csam csamVar = (csam) ((csag) dqqjVar);
        aC();
        this.cN = csamVar.cV();
        if (csamVar.dj(0)) {
            this.a = csamVar.f();
            fN(0);
        }
        if (csamVar.dj(1)) {
            this.b = csamVar.h();
            fN(1);
        }
        if (csamVar.dj(2)) {
            this.c = csamVar.e();
            fN(2);
        }
        if (csamVar.dj(3)) {
            this.d = csamVar.g();
            fN(3);
        }
        if (csamVar.dj(4)) {
            this.e = csamVar.c();
            fN(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof crzm)) {
            return false;
        }
        crzm crzmVar = (crzm) obj;
        return super.aE(crzmVar.cN) && Objects.equals(this.a, crzmVar.a) && Objects.equals(this.b, crzmVar.b) && Objects.equals(this.c, crzmVar.c) && Objects.equals(this.d, crzmVar.d) && this.e == crzmVar.e;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "spam_logging_ids_table", dqru.m(new String[]{"message_id", "message_logging_id", "conversation_id", "conversation_logging_id", "generation_timestamp"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "spam_logging_ids_table";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, this.c, this.d, Long.valueOf(this.e), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r9, java.util.List r10) {
        /*
            r8 = this;
            crzk r0 = new crzk
            r0.<init>(r8)
            java.lang.Object r0 = r0.get()
            java.lang.String r1 = r8.b
            crzl r2 = new crzl
            r2.<init>(r8)
            java.lang.Object r2 = r2.get()
            java.lang.String r3 = r8.d
            long r4 = r8.e
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
        L33:
            if (r7 >= r5) goto L6a
            r0 = r6[r7]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L43
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r9.append(r0)
            goto L62
        L43:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L5a
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L5a
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r9.append(r0)
            goto L62
        L5a:
            r10.add(r0)
            r0 = 63
            r9.append(r0)
        L62:
            r0 = 44
            r9.append(r0)
            int r7 = r7 + 1
            goto L33
        L6a:
            int r10 = r9.length()
            int r10 = r10 + (-1)
            r9.setLength(r10)
            r10 = 41
            r9.append(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crzm.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final MessageIdType k() {
        aA(0, "message_id");
        return this.a;
    }

    public final String m() {
        aA(3, "conversation_logging_id");
        return this.d;
    }

    public final String n() {
        aA(1, "message_logging_id");
        return this.b;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "SpamLoggingIdsTable -- REDACTED") : a();
    }
}
