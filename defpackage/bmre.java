package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bmre extends dqpd implements dqpf {
    public long a;
    public long b;
    public long c;
    public bmsp d = bmsp.a;
    public long e;

    protected bmre() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "CmsDeletedMessagesBufferTable [_id: %s,\n  message_id: %s,\n  conversation_id: %s,\n  message_deletion_reason: %s,\n  deletion_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        contentValues.put("message_id", Long.valueOf(this.b));
        contentValues.put("conversation_id", Long.valueOf(this.c));
        bmsp bmspVar = this.d;
        if (bmspVar == null) {
            contentValues.putNull("message_deletion_reason");
        } else {
            contentValues.put("message_deletion_reason", Integer.valueOf(bmspVar.ordinal()));
        }
        contentValues.put("deletion_timestamp", Long.valueOf(this.e));
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bmsc bmscVar = (bmsc) ((bmrw) dqqjVar);
        aC();
        this.cN = bmscVar.cV();
        if (bmscVar.dj(0)) {
            this.a = bmscVar.g();
            fN(0);
        }
        if (bmscVar.dj(1)) {
            this.b = bmscVar.h();
            fN(1);
        }
        if (bmscVar.dj(2)) {
            this.c = bmscVar.e();
            fN(2);
        }
        if (bmscVar.dj(3)) {
            this.d = bmscVar.i();
            fN(3);
        }
        if (bmscVar.dj(4)) {
            this.e = bmscVar.f();
            fN(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bmre)) {
            return false;
        }
        bmre bmreVar = (bmre) obj;
        return super.aE(bmreVar.cN) && this.a == bmreVar.a && this.b == bmreVar.b && this.c == bmreVar.c && this.d == bmreVar.d && this.e == bmreVar.e;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "cms_deleted_messages_buffer", dqru.m(new String[]{"message_id", "conversation_id", "message_deletion_reason", "deletion_timestamp"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "cms_deleted_messages_buffer";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        Long lValueOf = Long.valueOf(this.a);
        Long lValueOf2 = Long.valueOf(this.b);
        Long lValueOf3 = Long.valueOf(this.c);
        bmsp bmspVar = this.d;
        return Objects.hash(dqqeVar2, lValueOf, lValueOf2, lValueOf3, Integer.valueOf(bmspVar == null ? 0 : bmspVar.ordinal()), Long.valueOf(this.e), null);
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
            long r0 = r7.b
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r1 = r7.c
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            bmsp r2 = r7.d
            r3 = 0
            if (r2 != 0) goto L16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            goto L1e
        L16:
            int r2 = r2.ordinal()
            java.lang.String r2 = java.lang.String.valueOf(r2)
        L1e:
            long r4 = r7.e
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
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
        L37:
            if (r3 >= r5) goto L6e
            r0 = r6[r3]
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
            r4 = 12
            if (r2 >= r4) goto L5e
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
            int r3 = r3 + 1
            goto L37
        L6e:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmre.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final long k() {
        aA(4, "deletion_timestamp");
        return this.e;
    }

    public final bmsp m() {
        aA(3, "message_deletion_reason");
        return this.d;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "CmsDeletedMessagesBufferTable -- REDACTED") : a();
    }
}
