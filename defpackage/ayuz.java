package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ayuz extends dqpd implements dqpf {
    public long a;
    public ConversationIdType b = barn.a;
    public boolean c;

    protected ayuz() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "BackupConversationPinTable [_id: %s,\n  conversation_id: %s,\n  pin_status: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        contentValues.put("_id", Long.valueOf(this.a));
        ConversationIdType conversationIdType = this.b;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(barn.a(this.b)));
        }
        contentValues.put("pin_status", Boolean.valueOf(this.c));
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        ayvq ayvqVar = (ayvq) ((ayvm) dqqjVar);
        aC();
        this.cN = ayvqVar.cV();
        if (ayvqVar.dj(0)) {
            this.a = ayvqVar.c();
            fN(0);
        }
        if (ayvqVar.dj(1)) {
            this.b = ayvqVar.e();
            fN(1);
        }
        if (ayvqVar.dj(2)) {
            this.c = ayvqVar.f();
            fN(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ayuz)) {
            return false;
        }
        ayuz ayuzVar = (ayuz) obj;
        return super.aE(ayuzVar.cN) && this.a == ayuzVar.a && Objects.equals(this.b, ayuzVar.b) && this.c == ayuzVar.c;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversation_pins_backup", dqru.m(new String[]{"_id", "conversation_id", "pin_status"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "conversation_pins_backup";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Long.valueOf(this.a), this.b, Boolean.valueOf(this.c), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r8, java.util.List r9) {
        /*
            r7 = this;
            long r0 = r7.a
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            ayuy r1 = new ayuy
            r1.<init>(r7)
            java.lang.Object r1 = r1.get()
            boolean r2 = r7.c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r1
            r0 = 2
            r4[r0] = r2
            r0 = 40
            r8.append(r0)
        L26:
            if (r5 >= r3) goto L5d
            r0 = r4[r5]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L36
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L55
        L36:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L4d
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r6 = 12
            if (r2 >= r6) goto L4d
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r8.append(r0)
            goto L55
        L4d:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L55:
            r0 = 44
            r8.append(r0)
            int r5 = r5 + 1
            goto L26
        L5d:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayuz.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "BackupConversationPinTable -- REDACTED") : a();
    }
}
