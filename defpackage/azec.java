package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class azec extends dqpd implements dqpf {
    public MessageIdType a;
    public MessageIdType b;
    public ahqp c;
    public basd d;

    protected azec() {
        MessageIdType messageIdType = bary.a;
        this.a = messageIdType;
        this.b = messageIdType;
        this.c = ahqp.b(0);
        this.d = basd.a;
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "BackupMessageRepliesTable [message_id: %s,\n  replied_to_message_id: %s,\n  replied_to_message_id_null_reason: %s,\n  replied_to_rcs_message_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        MessageIdType messageIdType = this.a;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bary.a(this.a)));
        }
        MessageIdType messageIdType2 = this.b;
        if (messageIdType2 == null || messageIdType2.equals(bary.a)) {
            contentValues.putNull("replied_to_message_id");
        } else {
            contentValues.put("replied_to_message_id", Long.valueOf(bary.a(this.b)));
        }
        ahqp ahqpVar = this.c;
        if (ahqpVar == null) {
            contentValues.putNull("replied_to_message_id_null_reason");
        } else {
            contentValues.put("replied_to_message_id_null_reason", Integer.valueOf(ahqpVar.a()));
        }
        basd basdVar = this.d;
        if (basdVar == null) {
            contentValues.putNull("replied_to_rcs_message_id");
        } else {
            contentValues.put("replied_to_rcs_message_id", basd.d(basdVar));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        azex azexVar = (azex) ((azes) dqqjVar);
        aC();
        this.cN = azexVar.cV();
        if (azexVar.dj(0)) {
            this.a = azexVar.e();
            fN(0);
        }
        if (azexVar.dj(1)) {
            this.b = azexVar.f();
            fN(1);
        }
        if (azexVar.dj(2)) {
            this.c = azexVar.c();
            fN(2);
        }
        if (azexVar.dj(3)) {
            this.d = azexVar.g();
            fN(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof azec)) {
            return false;
        }
        azec azecVar = (azec) obj;
        return super.aE(azecVar.cN) && Objects.equals(this.a, azecVar.a) && Objects.equals(this.b, azecVar.b) && this.c == azecVar.c && Objects.equals(this.d, azecVar.d);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "message_replies_backup", dqru.m(new String[]{"message_id", "replied_to_message_id", "replied_to_message_id_null_reason", "replied_to_rcs_message_id"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "message_replies_backup";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, this.c, this.d, null);
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
            azea r0 = new azea
            r0.<init>(r7)
            java.lang.Object r0 = r0.get()
            azeb r1 = new azeb
            r1.<init>(r7)
            java.lang.Object r1 = r1.get()
            ahqp r2 = r7.c
            r3 = 0
            if (r2 != 0) goto L1c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            goto L24
        L1c:
            int r2 = r2.a()
            java.lang.String r2 = java.lang.String.valueOf(r2)
        L24:
            basd r4 = r7.d
            java.lang.String r4 = defpackage.basd.d(r4)
            r5 = 4
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r6[r3] = r0
            r0 = 1
            r6[r0] = r1
            r0 = 2
            r6[r0] = r2
            r0 = 3
            r6[r0] = r4
            r0 = 40
            r8.append(r0)
        L3d:
            if (r3 >= r5) goto L74
            r0 = r6[r3]
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
            r4 = 12
            if (r2 >= r4) goto L64
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
            int r3 = r3 + 1
            goto L3d
        L74:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azec.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "BackupMessageRepliesTable -- REDACTED") : a();
    }
}
