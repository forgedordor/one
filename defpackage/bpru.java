package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bpru extends dqpd implements dqpf {
    public long a;
    public String c;
    public String d;
    public boolean f;
    public cdpi g;
    public ConversationIdType b = barn.a;
    public boolean e = true;
    public long h = 0;
    public long i = 0;

    protected bpru() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "LighterConversationsTable [_id: %s,\n  conversation_id: %s,\n  business_id: %s,\n  lighter_conversation_id_json: %s,\n  read: %s,\n  is_last_message_outgoing: %s,\n  conversation_status: %s,\n  last_action_timestamp: %s,\n  sync_timestamp_ms: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = bpto.c().intValue();
        ConversationIdType conversationIdType = this.b;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(barn.a(this.b)));
        }
        dqru.v(contentValues, "business_id", this.c);
        dqru.v(contentValues, "lighter_conversation_id_json", this.d);
        if (iIntValue >= 58700) {
            contentValues.put("read", Boolean.valueOf(this.e));
        }
        if (iIntValue >= 58810) {
            contentValues.put("is_last_message_outgoing", Boolean.valueOf(this.f));
        }
        if (iIntValue >= 59030) {
            cdpi cdpiVar = this.g;
            if (cdpiVar == null) {
                contentValues.putNull("conversation_status");
            } else {
                contentValues.put("conversation_status", Integer.valueOf(cdpiVar.ordinal()));
            }
        }
        if (iIntValue >= 59040) {
            contentValues.put("last_action_timestamp", Long.valueOf(this.h));
        }
        if (iIntValue >= 59100) {
            contentValues.put("sync_timestamp_ms", Long.valueOf(this.i));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bptd bptdVar = (bptd) ((bpst) dqqjVar);
        aC();
        this.cN = bptdVar.cV();
        if (bptdVar.dj(0)) {
            this.a = bptdVar.e();
            fN(0);
        }
        if (bptdVar.dj(1)) {
            this.b = bptdVar.h();
            fN(1);
        }
        if (bptdVar.dj(2)) {
            this.c = bptdVar.j();
            fN(2);
        }
        if (bptdVar.dj(3)) {
            this.d = bptdVar.k();
            fN(3);
        }
        if (bptdVar.dj(4)) {
            this.e = bptdVar.m();
            fN(4);
        }
        if (bptdVar.dj(5)) {
            this.f = bptdVar.l();
            fN(5);
        }
        if (bptdVar.dj(6)) {
            this.g = bptdVar.i();
            fN(6);
        }
        if (bptdVar.dj(7)) {
            this.h = bptdVar.f();
            fN(7);
        }
        if (bptdVar.dj(8)) {
            this.i = bptdVar.g();
            fN(8);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bpru)) {
            return false;
        }
        bpru bpruVar = (bpru) obj;
        return super.aE(bpruVar.cN) && this.a == bpruVar.a && Objects.equals(this.b, bpruVar.b) && Objects.equals(this.c, bpruVar.c) && Objects.equals(this.d, bpruVar.d) && this.e == bpruVar.e && this.f == bpruVar.f && this.g == bpruVar.g && this.h == bpruVar.h && this.i == bpruVar.i;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "lighter_conversations_table", dqru.m(new String[]{"conversation_id", "business_id", "lighter_conversation_id_json", "read", "is_last_message_outgoing", "conversation_status", "last_action_timestamp", "sync_timestamp_ms"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "lighter_conversations_table";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        Long lValueOf = Long.valueOf(this.a);
        ConversationIdType conversationIdType = this.b;
        String str = this.c;
        String str2 = this.d;
        Boolean boolValueOf = Boolean.valueOf(this.e);
        Boolean boolValueOf2 = Boolean.valueOf(this.f);
        cdpi cdpiVar = this.g;
        return Objects.hash(dqqeVar2, lValueOf, conversationIdType, str, str2, boolValueOf, boolValueOf2, Integer.valueOf(cdpiVar == null ? 0 : cdpiVar.ordinal()), Long.valueOf(this.h), Long.valueOf(this.i), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r12, java.util.List r13) {
        /*
            r11 = this;
            bprt r0 = new bprt
            r0.<init>(r11)
            java.lang.Object r0 = r0.get()
            java.lang.String r1 = r11.c
            java.lang.String r2 = r11.d
            boolean r3 = r11.e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r4 = r11.f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            cdpi r5 = r11.g
            r6 = 0
            if (r5 != 0) goto L23
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            goto L2b
        L23:
            int r5 = r5.ordinal()
            java.lang.String r5 = java.lang.String.valueOf(r5)
        L2b:
            long r7 = r11.h
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            long r8 = r11.i
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r9 = 8
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r10[r6] = r0
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
            r10[r0] = r7
            r0 = 7
            r10[r0] = r8
            r0 = 40
            r12.append(r0)
        L57:
            if (r6 >= r9) goto L8e
            r0 = r10[r6]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L67
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r12.append(r0)
            goto L86
        L67:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L7e
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L7e
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r12.append(r0)
            goto L86
        L7e:
            r13.add(r0)
            r0 = 63
            r12.append(r0)
        L86:
            r0 = 44
            r12.append(r0)
            int r6 = r6 + 1
            goto L57
        L8e:
            int r13 = r12.length()
            int r13 = r13 + (-1)
            r12.setLength(r13)
            r13 = 41
            r12.append(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpru.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "LighterConversationsTable -- REDACTED") : a();
    }
}
