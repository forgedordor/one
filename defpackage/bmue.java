package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bmue extends dqpd implements dqpf {
    public long a;
    public String b;
    public String c;
    public cpya d;

    protected bmue() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "CmsMediaNotificationsTable [_id: %s,\n  message_cms_id: %s,\n  blob_id: %s,\n  blob_type: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        dqru.v(contentValues, "message_cms_id", this.b);
        dqru.v(contentValues, "blob_id", this.c);
        cpya cpyaVar = this.d;
        if (cpyaVar == null) {
            contentValues.putNull("blob_type");
        } else {
            contentValues.put("blob_type", Integer.valueOf(cpyaVar.ordinal()));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bmux bmuxVar = (bmux) ((bmus) dqqjVar);
        aC();
        this.cN = bmuxVar.cV();
        if (bmuxVar.dj(0)) {
            this.a = bmuxVar.f();
            fN(0);
        }
        if (bmuxVar.dj(1)) {
            this.b = bmuxVar.g();
            fN(1);
        }
        if (bmuxVar.dj(2)) {
            this.c = bmuxVar.e();
            fN(2);
        }
        if (bmuxVar.dj(3)) {
            this.d = bmuxVar.c();
            fN(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bmue)) {
            return false;
        }
        bmue bmueVar = (bmue) obj;
        return super.aE(bmueVar.cN) && this.a == bmueVar.a && Objects.equals(this.b, bmueVar.b) && Objects.equals(this.c, bmueVar.c) && this.d == bmueVar.d;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "cms_media_notifications", dqru.m(new String[]{"message_cms_id", "blob_id", "blob_type"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "cms_media_notifications";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        Long lValueOf = Long.valueOf(this.a);
        String str = this.b;
        String str2 = this.c;
        cpya cpyaVar = this.d;
        return Objects.hash(dqqeVar2, lValueOf, str, str2, Integer.valueOf(cpyaVar == null ? 0 : cpyaVar.ordinal()), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
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
            cpya r2 = r7.d
            r3 = 0
            if (r2 != 0) goto Le
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            goto L16
        Le:
            int r2 = r2.ordinal()
            java.lang.String r2 = java.lang.String.valueOf(r2)
        L16:
            r4 = 3
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r3] = r0
            r0 = 1
            r5[r0] = r1
            r0 = 2
            r5[r0] = r2
            r0 = 40
            r8.append(r0)
        L26:
            if (r3 >= r4) goto L5d
            r0 = r5[r3]
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
            int r3 = r3 + 1
            goto L26
        L5d:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmue.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "CmsMediaNotificationsTable -- REDACTED") : a();
    }
}
