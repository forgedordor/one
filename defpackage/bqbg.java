package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqbg extends dqpd implements dqpf {
    public long a;
    public MessageIdType b = bary.a;
    public ezah c = ezah.UNKNOWN_CLASSIFICATION_TYPE;
    public ezgd d;

    protected bqbg() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "MessageClassificationsTable [_id: %s,\n  message_id: %s,\n  classification_type: %s,\n  classification_details: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = bqcn.c().intValue();
        MessageIdType messageIdType = this.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bary.a(this.b)));
        }
        ezah ezahVar = this.c;
        if (ezahVar == null) {
            contentValues.putNull("classification_type");
        } else {
            contentValues.put("classification_type", Integer.valueOf(ezahVar.a()));
        }
        if (iIntValue >= 58480) {
            ezgd ezgdVar = this.d;
            contentValues.put("classification_details", ezgdVar == null ? null : ezgdVar.toByteArray());
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bqca bqcaVar = (bqca) ((bqbv) dqqjVar);
        aC();
        this.cN = bqcaVar.cV();
        if (bqcaVar.dj(0)) {
            this.a = bqcaVar.c();
            super.fN(0);
        }
        if (bqcaVar.dj(1)) {
            this.b = bqcaVar.e();
            super.fN(1);
        }
        if (bqcaVar.dj(2)) {
            this.c = bqcaVar.f();
            super.fN(2);
        }
        if (bqcaVar.dj(3)) {
            this.d = bqcaVar.g();
            super.fN(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bqbg)) {
            return false;
        }
        bqbg bqbgVar = (bqbg) obj;
        return super.aE(bqbgVar.cN) && this.a == bqbgVar.a && Objects.equals(this.b, bqbgVar.b) && this.c == bqbgVar.c && Objects.equals(this.d, bqbgVar.d);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "message_classifications_table", dqru.m(new String[]{"message_id", "classification_type", "classification_details"}));
    }

    @Override // defpackage.dqpd
    public final void fN(int i) {
        super.fN(0);
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "message_classifications_table";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Long.valueOf(this.a), this.b, this.c, this.d, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r8, java.util.List r9) {
        /*
            r7 = this;
            bqbf r0 = new bqbf
            r0.<init>(r7)
            java.lang.Object r0 = r0.get()
            ezah r1 = r7.c
            r2 = 0
            if (r1 != 0) goto L13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            goto L1b
        L13:
            int r1 = r1.a()
            java.lang.String r1 = java.lang.String.valueOf(r1)
        L1b:
            ezgd r3 = r7.d
            if (r3 != 0) goto L21
            r3 = 0
            goto L25
        L21:
            byte[] r3 = r3.toByteArray()
        L25:
            r4 = 3
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r2] = r0
            r0 = 1
            r5[r0] = r1
            r0 = 2
            r5[r0] = r3
            r0 = 40
            r8.append(r0)
        L35:
            if (r2 >= r4) goto L6c
            r0 = r5[r2]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L45
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L64
        L45:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L5c
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r1.length()
            r6 = 12
            if (r3 >= r6) goto L5c
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r8.append(r0)
            goto L64
        L5c:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L64:
            r0 = 44
            r8.append(r0)
            int r2 = r2 + 1
            goto L35
        L6c:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqbg.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final ezgd k() {
        aA(3, "classification_details");
        return this.d;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "MessageClassificationsTable -- REDACTED") : a();
    }
}
