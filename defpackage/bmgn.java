package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.time.Instant;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bmgn extends dqpd implements dqpf {
    public long a;
    public crws b = crws.b(0);
    public Instant c = Instant.EPOCH;
    public crwi d = crwi.b(0);
    public Instant e = Instant.EPOCH;

    protected bmgn() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "A2pConversationSubscriptionsTable [participant_id: %s,\n  conversation_toolstone_state: %s,\n  conversation_toolstone_last_dismiss_timestamp: %s,\n  conversation_subscription_state: %s,\n  last_action_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = bmhw.c().intValue();
        dqru.u(contentValues, "participant_id", this.a);
        crws crwsVar = this.b;
        if (crwsVar == null) {
            contentValues.putNull("conversation_toolstone_state");
        } else {
            contentValues.put("conversation_toolstone_state", Integer.valueOf(crwsVar.a()));
        }
        if (iIntValue >= 61030) {
            Instant instant = this.c;
            if (instant == null) {
                contentValues.putNull("conversation_toolstone_last_dismiss_timestamp");
            } else {
                contentValues.put("conversation_toolstone_last_dismiss_timestamp", Long.valueOf(bart.a(instant)));
            }
        }
        crwi crwiVar = this.d;
        if (crwiVar == null) {
            contentValues.putNull("conversation_subscription_state");
        } else {
            contentValues.put("conversation_subscription_state", Integer.valueOf(crwiVar.a()));
        }
        Instant instant2 = this.e;
        if (instant2 == null) {
            contentValues.putNull("last_action_timestamp");
        } else {
            contentValues.put("last_action_timestamp", Long.valueOf(bart.a(instant2)));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bmhk bmhkVar = (bmhk) ((bmhe) dqqjVar);
        aC();
        this.cN = bmhkVar.cV();
        if (bmhkVar.dj(0)) {
            this.a = bmhkVar.c();
            fN(0);
        }
        if (bmhkVar.dj(1)) {
            this.b = bmhkVar.f();
            fN(1);
        }
        if (bmhkVar.dj(2)) {
            this.c = bmhkVar.g();
            fN(2);
        }
        if (bmhkVar.dj(3)) {
            this.d = bmhkVar.e();
            fN(3);
        }
        if (bmhkVar.dj(4)) {
            this.e = bmhkVar.h();
            fN(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bmgn)) {
            return false;
        }
        bmgn bmgnVar = (bmgn) obj;
        return super.aE(bmgnVar.cN) && this.a == bmgnVar.a && this.b == bmgnVar.b && Objects.equals(this.c, bmgnVar.c) && this.d == bmgnVar.d && Objects.equals(this.e, bmgnVar.e);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "a2p_conversation_subscriptions", dqru.m(new String[]{"participant_id", "conversation_toolstone_state", "conversation_toolstone_last_dismiss_timestamp", "conversation_subscription_state", "last_action_timestamp"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "a2p_conversation_subscriptions";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Long.valueOf(this.a), this.b, this.c, this.d, this.e, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r9, java.util.List r10) {
        /*
            r8 = this;
            long r0 = r8.a
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            crws r1 = r8.b
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            if (r1 != 0) goto L11
            r1 = r3
            goto L19
        L11:
            int r1 = r1.a()
            java.lang.String r1 = java.lang.String.valueOf(r1)
        L19:
            j$.time.Instant r4 = r8.c
            long r4 = defpackage.bart.a(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            crwi r5 = r8.d
            if (r5 != 0) goto L28
            goto L30
        L28:
            int r3 = r5.a()
            java.lang.String r3 = java.lang.String.valueOf(r3)
        L30:
            j$.time.Instant r5 = r8.e
            long r5 = defpackage.bart.a(r5)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 5
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r7[r2] = r0
            r0 = 1
            r7[r0] = r1
            r0 = 2
            r7[r0] = r4
            r0 = 3
            r7[r0] = r3
            r0 = 4
            r7[r0] = r5
            r0 = 40
            r9.append(r0)
        L50:
            if (r2 >= r6) goto L87
            r0 = r7[r2]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L60
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r9.append(r0)
            goto L7f
        L60:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L77
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r1.length()
            r4 = 12
            if (r3 >= r4) goto L77
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r9.append(r0)
            goto L7f
        L77:
            r10.add(r0)
            r0 = 63
            r9.append(r0)
        L7f:
            r0 = 44
            r9.append(r0)
            int r2 = r2 + 1
            goto L50
        L87:
            int r10 = r9.length()
            int r10 = r10 + (-1)
            r9.setLength(r10)
            r10 = 41
            r9.append(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmgn.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "A2pConversationSubscriptionsTable -- REDACTED") : a();
    }
}
