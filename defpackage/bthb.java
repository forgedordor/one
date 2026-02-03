package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bthb extends dqpd implements dqpf {
    public String a;
    public MessageIdType b = bary.a;
    public ConversationIdType c = barn.a;
    public long d = 0;
    public bvdw e = bvdw.SET;

    protected bthb() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "RemindersTable [_id: %s,\n  message_id: %s,\n  conversation_id: %s,\n  trigger_time: %s,\n  status: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = btin.e().intValue();
        MessageIdType messageIdType = this.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bary.a(this.b)));
        }
        if (iIntValue >= 35070) {
            ConversationIdType conversationIdType = this.c;
            if (conversationIdType == null || conversationIdType.equals(barn.a)) {
                contentValues.putNull("conversation_id");
            } else {
                contentValues.put("conversation_id", Long.valueOf(barn.a(this.c)));
            }
        }
        contentValues.put("trigger_time", Long.valueOf(this.d));
        bvdw bvdwVar = this.e;
        if (bvdwVar == null) {
            contentValues.putNull("status");
        } else {
            contentValues.put("status", Integer.valueOf(bvdwVar.ordinal()));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bthz bthzVar = (bthz) ((btht) dqqjVar);
        aC();
        this.cN = bthzVar.cV();
        if (bthzVar.dj(0)) {
            this.a = bthzVar.i();
            fN(0);
        }
        if (bthzVar.dj(1)) {
            this.b = bthzVar.g();
            fN(1);
        }
        if (bthzVar.dj(2)) {
            this.c = bthzVar.f();
            fN(2);
        }
        if (bthzVar.dj(3)) {
            this.d = bthzVar.e();
            fN(3);
        }
        if (bthzVar.dj(4)) {
            this.e = bthzVar.h();
            fN(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bthb)) {
            return false;
        }
        bthb bthbVar = (bthb) obj;
        return super.aE(bthbVar.cN) && Objects.equals(this.a, bthbVar.a) && Objects.equals(this.b, bthbVar.b) && Objects.equals(this.c, bthbVar.c) && this.d == bthbVar.d && this.e == bthbVar.e;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "reminders", dqru.m(new String[]{"message_id", "conversation_id", "trigger_time", "status"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "reminders";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        String str = this.a;
        MessageIdType messageIdType = this.b;
        ConversationIdType conversationIdType = this.c;
        Long lValueOf = Long.valueOf(this.d);
        bvdw bvdwVar = this.e;
        return Objects.hash(dqqeVar2, str, messageIdType, conversationIdType, lValueOf, Integer.valueOf(bvdwVar == null ? 0 : bvdwVar.ordinal()), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r8, java.util.List r9) {
        /*
            r7 = this;
            btgz r0 = new btgz
            r0.<init>(r7)
            java.lang.Object r0 = r0.get()
            btha r1 = new btha
            r1.<init>(r7)
            java.lang.Object r1 = r1.get()
            long r2 = r7.d
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            bvdw r3 = r7.e
            r4 = 0
            if (r3 != 0) goto L22
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            goto L2a
        L22:
            int r3 = r3.ordinal()
            java.lang.String r3 = java.lang.String.valueOf(r3)
        L2a:
            r5 = 4
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r6[r4] = r0
            r0 = 1
            r6[r0] = r1
            r0 = 2
            r6[r0] = r2
            r0 = 3
            r6[r0] = r3
            r0 = 40
            r8.append(r0)
        L3d:
            if (r4 >= r5) goto L74
            r0 = r6[r4]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L4d
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L6c
        L4d:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L64
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L64
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r8.append(r0)
            goto L6c
        L64:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L6c:
            r0 = 44
            r8.append(r0)
            int r4 = r4 + 1
            goto L3d
        L74:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bthb.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final long k() {
        aA(3, "trigger_time");
        return this.d;
    }

    public final ConversationIdType m() {
        aA(2, "conversation_id");
        return this.c;
    }

    public final MessageIdType n() {
        aA(1, "message_id");
        return this.b;
    }

    public final String o() {
        aA(0, "_id");
        return this.a;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "RemindersTable -- REDACTED") : a();
    }
}
