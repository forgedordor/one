package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class botp extends dqpd implements dqpf {
    public ConversationIdType a = barn.a;
    public String b;

    protected botp() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "CustodianRcsGroupIdsTable [conversation_id: %s,\n  rcs_group_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        ConversationIdType conversationIdType = this.a;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(barn.a(this.a)));
        }
        dqru.v(contentValues, "rcs_group_id", this.b);
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        boud boudVar = (boud) ((boua) dqqjVar);
        aC();
        this.cN = boudVar.cV();
        if (boudVar.dj(0)) {
            this.a = boudVar.c();
            fN(0);
        }
        if (boudVar.dj(1)) {
            this.b = boudVar.e();
            fN(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof botp)) {
            return false;
        }
        botp botpVar = (botp) obj;
        return super.aE(botpVar.cN) && Objects.equals(this.a, botpVar.a) && Objects.equals(this.b, botpVar.b);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "custodian_rcs_group_ids", dqru.m(new String[]{"conversation_id", "rcs_group_id"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "custodian_rcs_group_ids";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r8, java.util.List r9) {
        /*
            r7 = this;
            boto r0 = new boto
            r0.<init>(r7)
            java.lang.Object r0 = r0.get()
            java.lang.String r1 = r7.b
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 40
            r8.append(r0)
        L19:
            if (r4 >= r2) goto L50
            r0 = r3[r4]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L29
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L48
        L29:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L40
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r5 = r1.length()
            r6 = 12
            if (r5 >= r6) goto L40
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r8.append(r0)
            goto L48
        L40:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L48:
            r0 = 44
            r8.append(r0)
            int r4 = r4 + 1
            goto L19
        L50:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.botp.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "CustodianRcsGroupIdsTable -- REDACTED") : a();
    }
}
