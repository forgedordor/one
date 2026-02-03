package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class awnr extends dqpd implements dqpf {
    public awjl a = null;
    public awjl b = null;

    protected awnr() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "GroupMembersTable [group_token: %s,\n  destination_token: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        awjl awjlVar = this.a;
        if (awjlVar == null || awjlVar.equals(null)) {
            contentValues.putNull("group_token");
        } else {
            contentValues.put("group_token", awjm.b(this.a));
        }
        awjl awjlVar2 = this.b;
        if (awjlVar2 == null || awjlVar2.equals(null)) {
            contentValues.putNull("destination_token");
        } else {
            contentValues.put("destination_token", awjm.b(this.b));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        awog awogVar = (awog) ((awod) dqqjVar);
        aC();
        this.cN = awogVar.cV();
        if (awogVar.dj(0)) {
            this.a = awogVar.e();
            fN(0);
        }
        if (awogVar.dj(1)) {
            this.b = awogVar.c();
            fN(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof awnr)) {
            return false;
        }
        awnr awnrVar = (awnr) obj;
        return super.aE(awnrVar.cN) && Objects.equals(this.a, awnrVar.a) && Objects.equals(this.b, awnrVar.b);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "group_members", dqru.m(new String[]{"group_token", "destination_token"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "group_members";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, null);
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
            awnp r0 = new awnp
            r0.<init>(r7)
            java.lang.Object r0 = r0.get()
            awnq r1 = new awnq
            r1.<init>(r7)
            java.lang.Object r1 = r1.get()
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 40
            r8.append(r0)
        L20:
            if (r4 >= r2) goto L57
            r0 = r3[r4]
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
            int r5 = r1.length()
            r6 = 12
            if (r5 >= r6) goto L47
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
            int r4 = r4 + 1
            goto L20
        L57:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awnr.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "GroupMembersTable -- REDACTED") : a();
    }
}
