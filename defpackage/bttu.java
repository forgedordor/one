package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bttu extends dqpd implements dqpf {
    public bvde a;
    public String b;
    public String c;

    protected bttu() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "RestoreWorkflowScratchSuffixTable [which_database: %s,\n  participant_id: %s,\n  destination_suffix: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        bvde bvdeVar = this.a;
        if (bvdeVar == null) {
            contentValues.putNull("which_database");
        } else {
            contentValues.put("which_database", Integer.valueOf(bvdeVar.ordinal()));
        }
        dqru.v(contentValues, "participant_id", this.b);
        dqru.v(contentValues, "destination_suffix", this.c);
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        btuk btukVar = (btuk) ((btug) dqqjVar);
        aC();
        this.cN = btukVar.cV();
        if (btukVar.dj(0)) {
            this.a = btukVar.c();
            fN(0);
        }
        if (btukVar.dj(1)) {
            this.b = btukVar.f();
            fN(1);
        }
        if (btukVar.dj(2)) {
            this.c = btukVar.e();
            fN(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bttu)) {
            return false;
        }
        bttu bttuVar = (bttu) obj;
        return super.aE(bttuVar.cN) && this.a == bttuVar.a && Objects.equals(this.b, bttuVar.b) && Objects.equals(this.c, bttuVar.c);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "restore_workflow_scratch_suffix", dqru.m(new String[]{"which_database", "participant_id", "destination_suffix"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "restore_workflow_scratch_suffix";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        bvde bvdeVar = this.a;
        return Objects.hash(dqqeVar2, Integer.valueOf(bvdeVar == null ? 0 : bvdeVar.ordinal()), this.b, this.c, null);
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
            bvde r0 = r7.a
            r1 = 0
            if (r0 != 0) goto La
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L12
        La:
            int r0 = r0.ordinal()
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L12:
            java.lang.String r2 = r7.b
            java.lang.String r3 = r7.c
            r4 = 3
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r1] = r0
            r0 = 1
            r5[r0] = r2
            r0 = 2
            r5[r0] = r3
            r0 = 40
            r8.append(r0)
        L26:
            if (r1 >= r4) goto L5d
            r0 = r5[r1]
            boolean r2 = r0 instanceof java.lang.Number
            if (r2 == 0) goto L36
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L55
        L36:
            boolean r2 = r0 instanceof java.lang.String
            if (r2 == 0) goto L4d
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r2.length()
            r6 = 12
            if (r3 >= r6) goto L4d
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r2)
            r8.append(r0)
            goto L55
        L4d:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L55:
            r0 = 44
            r8.append(r0)
            int r1 = r1 + 1
            goto L26
        L5d:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bttu.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "RestoreWorkflowScratchSuffixTable -- REDACTED") : a();
    }
}
