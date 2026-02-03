package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bpyn extends dqpd<bpze, bpzr, bpzs, bpyn, bpzd> implements dqpf<Long> {
    public String a;
    public ConversationIdType b = barn.a;
    public MessageIdType c = bary.a;
    public int d = 0;
    public ezds e;

    protected bpyn() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "MessageAnnotationsTable [_id: %s,\n  conversation_id: %s,\n  message_id: %s,\n  annotation_type: %s,\n  annotation_details: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = bpzx.c().intValue();
        ConversationIdType conversationIdType = this.b;
        if (conversationIdType == null) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(barn.a(conversationIdType)));
        }
        if (iIntValue >= 20040) {
            MessageIdType messageIdType = this.c;
            if (messageIdType == null || messageIdType.equals(bary.a)) {
                contentValues.putNull("message_id");
            } else {
                contentValues.put("message_id", Long.valueOf(bary.a(this.c)));
            }
        }
        contentValues.put("annotation_type", Integer.valueOf(this.d));
        ezds ezdsVar = this.e;
        if (ezdsVar == null) {
            contentValues.putNull("annotation_details");
        } else {
            contentValues.put("annotation_details", ezdsVar.toByteArray());
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bpzk bpzkVar = (bpzk) ((bpze) dqqjVar);
        aC();
        this.cN = bpzkVar.cV();
        if (bpzkVar.dj(0)) {
            this.a = bpzkVar.e();
            fN(0);
        }
        if (bpzkVar.dj(1)) {
            this.b = bpzkVar.g();
            fN(1);
        }
        if (bpzkVar.dj(2)) {
            this.c = bpzkVar.h();
            fN(2);
        }
        if (bpzkVar.dj(3)) {
            this.d = bpzkVar.f();
            fN(3);
        }
        if (bpzkVar.dj(4)) {
            this.e = bpzkVar.i();
            fN(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bpyn)) {
            return false;
        }
        bpyn bpynVar = (bpyn) obj;
        return super.aE(bpynVar.cN) && Objects.equals(this.a, bpynVar.a) && Objects.equals(this.b, bpynVar.b) && Objects.equals(this.c, bpynVar.c) && this.d == bpynVar.d && Objects.equals(this.e, bpynVar.e);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "messages_annotations", dqru.m(new String[]{"conversation_id", "message_id", "annotation_type", "annotation_details"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "messages_annotations";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, this.c, Integer.valueOf(this.d), this.e, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r8, java.util.List r9) {
        /*
            r7 = this;
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r0 = r7.b
            long r0 = defpackage.barn.a(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            bpym r1 = new bpym
            r1.<init>(r7)
            java.lang.Object r1 = r1.get()
            int r2 = r7.d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            ezds r3 = r7.e
            if (r3 != 0) goto L1f
            r3 = 0
            goto L23
        L1f:
            byte[] r3 = r3.toByteArray()
        L23:
            r4 = 4
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r6 = 0
            r5[r6] = r0
            r0 = 1
            r5[r0] = r1
            r0 = 2
            r5[r0] = r2
            r0 = 3
            r5[r0] = r3
            r0 = 40
            r8.append(r0)
        L37:
            if (r6 >= r4) goto L6e
            r0 = r5[r6]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L47
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L66
        L47:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L5e
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L5e
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r8.append(r0)
            goto L66
        L5e:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L66:
            r0 = 44
            r8.append(r0)
            int r6 = r6 + 1
            goto L37
        L6e:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpyn.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final int k() {
        aA(3, "annotation_type");
        return this.d;
    }

    public final ConversationIdType m() {
        aA(1, "conversation_id");
        return this.b;
    }

    public final MessageIdType n() {
        aA(2, "message_id");
        return this.c;
    }

    public final ezds o() {
        aA(4, "annotation_details");
        return this.e;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "MessageAnnotationsTable -- REDACTED") : a();
    }
}
