package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class azcl extends dqpd implements dqpf {
    public long a;
    public MessageIdType b;
    public cklv c;
    public MessageIdType d;
    public ckml e;
    public ckmb f;

    protected azcl() {
        MessageIdType messageIdType = bary.a;
        this.b = messageIdType;
        this.d = messageIdType;
        this.e = ckml.b(0);
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "BackupMessageReactionsTable [_id: %s,\n  message_id: %s,\n  reactions_data: %s,\n  reacted_message_id: %s,\n  reaction: %s,\n  applied_reaction: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        MessageIdType messageIdType = this.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bary.a(this.b)));
        }
        cklv cklvVar = this.c;
        if (cklvVar == null) {
            contentValues.putNull("reactions_data");
        } else {
            contentValues.put("reactions_data", cklvVar.toByteArray());
        }
        MessageIdType messageIdType2 = this.d;
        if (messageIdType2 == null || messageIdType2.equals(bary.a)) {
            contentValues.putNull("reacted_message_id");
        } else {
            contentValues.put("reacted_message_id", Long.valueOf(bary.a(this.d)));
        }
        ckml ckmlVar = this.e;
        if (ckmlVar == null) {
            contentValues.putNull("reaction");
        } else {
            contentValues.put("reaction", Integer.valueOf(ckmlVar.a()));
        }
        ckmb ckmbVar = this.f;
        if (ckmbVar == null) {
            contentValues.putNull("applied_reaction");
        } else {
            contentValues.put("applied_reaction", ckmbVar.toByteArray());
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        azdm azdmVar = (azdm) ((azdf) dqqjVar);
        aC();
        this.cN = azdmVar.cV();
        if (azdmVar.dj(0)) {
            this.a = azdmVar.c();
            fN(0);
        }
        if (azdmVar.dj(1)) {
            this.b = azdmVar.e();
            fN(1);
        }
        if (azdmVar.dj(2)) {
            this.c = azdmVar.g();
            fN(2);
        }
        if (azdmVar.dj(3)) {
            this.d = azdmVar.f();
            fN(3);
        }
        if (azdmVar.dj(4)) {
            this.e = azdmVar.i();
            fN(4);
        }
        if (azdmVar.dj(5)) {
            this.f = azdmVar.h();
            fN(5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof azcl)) {
            return false;
        }
        azcl azclVar = (azcl) obj;
        return super.aE(azclVar.cN) && this.a == azclVar.a && Objects.equals(this.b, azclVar.b) && Objects.equals(this.c, azclVar.c) && Objects.equals(this.d, azclVar.d) && this.e == azclVar.e && Objects.equals(this.f, azclVar.f);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "message_reactions_backup", dqru.m(new String[]{"message_id", "reactions_data", "reacted_message_id", "reaction", "applied_reaction"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "message_reactions_backup";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Long.valueOf(this.a), this.b, this.c, this.d, this.e, this.f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r9, java.util.List r10) {
        /*
            r8 = this;
            azcj r0 = new azcj
            r0.<init>(r8)
            java.lang.Object r0 = r0.get()
            cklv r1 = r8.c
            r2 = 0
            if (r1 != 0) goto L10
            r1 = r2
            goto L14
        L10:
            byte[] r1 = r1.toByteArray()
        L14:
            azck r3 = new azck
            r3.<init>(r8)
            java.lang.Object r3 = r3.get()
            ckml r4 = r8.e
            r5 = 0
            if (r4 != 0) goto L27
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            goto L2f
        L27:
            int r4 = r4.a()
            java.lang.String r4 = java.lang.String.valueOf(r4)
        L2f:
            ckmb r6 = r8.f
            if (r6 != 0) goto L34
            goto L38
        L34:
            byte[] r2 = r6.toByteArray()
        L38:
            r6 = 5
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r7[r5] = r0
            r0 = 1
            r7[r0] = r1
            r0 = 2
            r7[r0] = r3
            r0 = 3
            r7[r0] = r4
            r0 = 4
            r7[r0] = r2
            r0 = 40
            r9.append(r0)
        L4e:
            if (r5 >= r6) goto L85
            r0 = r7[r5]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L5e
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r9.append(r0)
            goto L7d
        L5e:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L75
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L75
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r9.append(r0)
            goto L7d
        L75:
            r10.add(r0)
            r0 = 63
            r9.append(r0)
        L7d:
            r0 = 44
            r9.append(r0)
            int r5 = r5 + 1
            goto L4e
        L85:
            int r10 = r9.length()
            int r10 = r10 + (-1)
            r9.setLength(r10)
            r10 = 41
            r9.append(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azcl.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "BackupMessageReactionsTable -- REDACTED") : a();
    }
}
