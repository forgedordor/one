package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bpkc extends dqpd implements dqpf {
    public MessageIdType a = bary.a;
    public String b;
    public String c;

    protected bpkc() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "ExtensionMessagesTable [message_id: %s,\n  extension_id: %s,\n  extension_package_name: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        MessageIdType messageIdType = this.a;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bary.a(this.a)));
        }
        dqru.v(contentValues, "extension_id", this.b);
        dqru.v(contentValues, "extension_package_name", this.c);
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bpkt bpktVar = (bpkt) ((bpkp) dqqjVar);
        aC();
        this.cN = bpktVar.cV();
        if (bpktVar.dj(0)) {
            this.a = bpktVar.c();
            fN(0);
        }
        if (bpktVar.dj(1)) {
            this.b = bpktVar.e();
            fN(1);
        }
        if (bpktVar.dj(2)) {
            this.c = bpktVar.f();
            fN(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bpkc)) {
            return false;
        }
        bpkc bpkcVar = (bpkc) obj;
        return super.aE(bpkcVar.cN) && Objects.equals(this.a, bpkcVar.a) && Objects.equals(this.b, bpkcVar.b) && Objects.equals(this.c, bpkcVar.c);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "extension_messages", dqru.m(new String[]{"message_id", "extension_id", "extension_package_name"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "extension_messages";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, this.c, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r8, java.util.List r9) {
        /*
            r7 = this;
            bpkb r0 = new bpkb
            r0.<init>(r7)
            java.lang.Object r0 = r0.get()
            java.lang.String r1 = r7.b
            java.lang.String r2 = r7.c
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
        L1e:
            if (r5 >= r3) goto L55
            r0 = r4[r5]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L2e
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L4d
        L2e:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L45
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r6 = 12
            if (r2 >= r6) goto L45
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r8.append(r0)
            goto L4d
        L45:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L4d:
            r0 = 44
            r8.append(r0)
            int r5 = r5 + 1
            goto L1e
        L55:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpkc.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "ExtensionMessagesTable -- REDACTED") : a();
    }
}
