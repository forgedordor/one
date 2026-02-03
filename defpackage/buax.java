package defpackage;

import android.content.ContentValues;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class buax extends dqpd implements dqpf {
    public long a;
    public String b;
    public String c;
    public byte[] d;
    public long e = 0;

    protected buax() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        Locale locale = Locale.US;
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.c);
        byte[] bArr = this.d;
        return String.format(locale, "SettingsTable [_id: %s,\n  key: %s,\n  sub_key: %s,\n  data: %s,\n  last_modified_timestamp: %s\n]\n", strValueOf, strValueOf2, strValueOf3, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")), String.valueOf(this.e));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        dqru.v(contentValues, "key", this.b);
        dqru.v(contentValues, "sub_key", this.c);
        contentValues.put(GroupManagementRequest.DATA_TAG, this.d);
        contentValues.put("last_modified_timestamp", Long.valueOf(this.e));
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bubt bubtVar = (bubt) ((bubn) dqqjVar);
        aC();
        this.cN = bubtVar.cV();
        if (bubtVar.dj(0)) {
            this.a = bubtVar.c();
            fN(0);
        }
        if (bubtVar.dj(1)) {
            this.b = bubtVar.f();
            fN(1);
        }
        if (bubtVar.dj(2)) {
            this.c = bubtVar.g();
            fN(2);
        }
        if (bubtVar.dj(3)) {
            this.d = bubtVar.h();
            fN(3);
        }
        if (bubtVar.dj(4)) {
            this.e = bubtVar.e();
            fN(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof buax)) {
            return false;
        }
        buax buaxVar = (buax) obj;
        return super.aE(buaxVar.cN) && this.a == buaxVar.a && Objects.equals(this.b, buaxVar.b) && Objects.equals(this.c, buaxVar.c) && Arrays.equals(this.d, buaxVar.d) && this.e == buaxVar.e;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "settings", dqru.m(new String[]{"key", "sub_key", GroupManagementRequest.DATA_TAG, "last_modified_timestamp"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "settings";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Long.valueOf(this.a), this.b, this.c, Integer.valueOf(Arrays.hashCode(this.d)), Long.valueOf(this.e), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r8, java.util.List r9) {
        /*
            r7 = this;
            java.lang.String r0 = r7.b
            java.lang.String r1 = r7.c
            byte[] r2 = r7.d
            long r3 = r7.e
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
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
        L20:
            if (r6 >= r4) goto L57
            r0 = r5[r6]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L30
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L4f
        L30:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L47
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L47
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r8.append(r0)
            goto L4f
        L47:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L4f:
            r0 = 44
            r8.append(r0)
            int r6 = r6 + 1
            goto L20
        L57:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.buax.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String k() {
        aA(2, "sub_key");
        return this.c;
    }

    public final byte[] m() {
        aA(3, GroupManagementRequest.DATA_TAG);
        return this.d;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "SettingsTable -- REDACTED") : a();
    }
}
