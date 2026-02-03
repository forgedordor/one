package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bukw extends dqpd implements dqpf {
    public bvee a = bvee.b(0);
    public boolean b = false;

    protected bukw() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "TriggerFlagsTable [_id: %s,\n  enabled: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        bvee bveeVar = this.a;
        if (bveeVar == null) {
            contentValues.putNull("_id");
        } else {
            contentValues.put("_id", Integer.valueOf(bveeVar.a()));
        }
        contentValues.put("enabled", Boolean.valueOf(this.b));
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bulj buljVar = (bulj) ((bulg) dqqjVar);
        aC();
        this.cN = buljVar.cV();
        if (buljVar.dj(0)) {
            this.a = buljVar.c();
            fN(0);
        }
        if (buljVar.dj(1)) {
            this.b = buljVar.e();
            fN(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bukw)) {
            return false;
        }
        bukw bukwVar = (bukw) obj;
        return super.aE(bukwVar.cN) && this.a == bukwVar.a && this.b == bukwVar.b;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "trigger_flags", dqru.m(new String[]{"_id", "enabled"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "trigger_flags";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, Boolean.valueOf(this.b), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r8, java.util.List r9) {
        /*
            r7 = this;
            bvee r0 = r7.a
            r1 = 0
            if (r0 != 0) goto La
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L12
        La:
            int r0 = r0.a()
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L12:
            boolean r2 = r7.b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r1] = r0
            r0 = 1
            r4[r0] = r2
            r0 = 40
            r8.append(r0)
        L25:
            if (r1 >= r3) goto L5c
            r0 = r4[r1]
            boolean r2 = r0 instanceof java.lang.Number
            if (r2 == 0) goto L35
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L54
        L35:
            boolean r2 = r0 instanceof java.lang.String
            if (r2 == 0) goto L4c
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            int r5 = r2.length()
            r6 = 12
            if (r5 >= r6) goto L4c
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r2)
            r8.append(r0)
            goto L54
        L4c:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L54:
            r0 = 44
            r8.append(r0)
            int r1 = r1 + 1
            goto L25
        L5c:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bukw.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "TriggerFlagsTable -- REDACTED") : a();
    }
}
