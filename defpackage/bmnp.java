package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bmnp extends dqpd implements dqpf {
    public long a;
    public String b;
    public String c;

    protected bmnp() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "CmsBlobsPendingDeleteTable [_id: %s,\n  message_id: %s,\n  blob_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        dqru.v(contentValues, "message_id", this.b);
        dqru.v(contentValues, "blob_id", this.c);
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bmof bmofVar = (bmof) ((bmob) dqqjVar);
        aC();
        this.cN = bmofVar.cV();
        if (bmofVar.dj(0)) {
            this.a = bmofVar.e();
            fN(0);
        }
        if (bmofVar.dj(1)) {
            this.b = bmofVar.f();
            fN(1);
        }
        if (bmofVar.dj(2)) {
            this.c = bmofVar.c();
            fN(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bmnp)) {
            return false;
        }
        bmnp bmnpVar = (bmnp) obj;
        return super.aE(bmnpVar.cN) && this.a == bmnpVar.a && Objects.equals(this.b, bmnpVar.b) && Objects.equals(this.c, bmnpVar.c);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "cms_blobs_pending_delete", dqru.m(new String[]{"message_id", "blob_id"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "cms_blobs_pending_delete";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Long.valueOf(this.a), this.b, this.c, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
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
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 40
            r8.append(r0)
        L12:
            if (r4 >= r2) goto L49
            r0 = r3[r4]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L22
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L41
        L22:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L39
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r5 = r1.length()
            r6 = 12
            if (r5 >= r6) goto L39
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r8.append(r0)
            goto L41
        L39:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L41:
            r0 = 44
            r8.append(r0)
            int r4 = r4 + 1
            goto L12
        L49:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmnp.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "CmsBlobsPendingDeleteTable -- REDACTED") : a();
    }
}
