package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btuw extends dqpd implements dqpf {
    public bvde a;
    public String b;
    public long c;
    public long d;

    protected btuw() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "RestoreWorkflowScratchTimestampsTable [which_database: %s,\n  message_id: %s,\n  timestamp_in_seconds: %s,\n  timestamp_mod_1000: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        bvde bvdeVar = this.a;
        if (bvdeVar == null) {
            contentValues.putNull("which_database");
        } else {
            contentValues.put("which_database", Integer.valueOf(bvdeVar.ordinal()));
        }
        dqru.v(contentValues, "message_id", this.b);
        contentValues.put("timestamp_in_seconds", Long.valueOf(this.c));
        contentValues.put("timestamp_mod_1000", Long.valueOf(this.d));
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        btvp btvpVar = (btvp) ((btvk) dqqjVar);
        aC();
        this.cN = btvpVar.cV();
        if (btvpVar.dj(0)) {
            this.a = btvpVar.f();
            fN(0);
        }
        if (btvpVar.dj(1)) {
            this.b = btvpVar.g();
            fN(1);
        }
        if (btvpVar.dj(2)) {
            this.c = btvpVar.c();
            fN(2);
        }
        if (btvpVar.dj(3)) {
            this.d = btvpVar.e();
            fN(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof btuw)) {
            return false;
        }
        btuw btuwVar = (btuw) obj;
        return super.aE(btuwVar.cN) && this.a == btuwVar.a && Objects.equals(this.b, btuwVar.b) && this.c == btuwVar.c && this.d == btuwVar.d;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "restore_workflow_scratch_timestamps", dqru.m(new String[]{"which_database", "message_id", "timestamp_in_seconds", "timestamp_mod_1000"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "restore_workflow_scratch_timestamps";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        bvde bvdeVar = this.a;
        return Objects.hash(dqqeVar2, Integer.valueOf(bvdeVar == null ? 0 : bvdeVar.ordinal()), this.b, Long.valueOf(this.c), Long.valueOf(this.d), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
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
            long r3 = r7.c
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            long r4 = r7.d
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 4
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r6[r1] = r0
            r0 = 1
            r6[r0] = r2
            r0 = 2
            r6[r0] = r3
            r0 = 3
            r6[r0] = r4
            r0 = 40
            r8.append(r0)
        L33:
            if (r1 >= r5) goto L6a
            r0 = r6[r1]
            boolean r2 = r0 instanceof java.lang.Number
            if (r2 == 0) goto L43
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L62
        L43:
            boolean r2 = r0 instanceof java.lang.String
            if (r2 == 0) goto L5a
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r2.length()
            r4 = 12
            if (r3 >= r4) goto L5a
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r2)
            r8.append(r0)
            goto L62
        L5a:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L62:
            r0 = 44
            r8.append(r0)
            int r1 = r1 + 1
            goto L33
        L6a:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btuw.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "RestoreWorkflowScratchTimestampsTable -- REDACTED") : a();
    }
}
