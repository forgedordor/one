package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btwc extends dqpd implements dqpf {
    public MessageIdType a = bary.a;
    public clmt b = clmt.HELP_NOT_LONGER_NEED;

    protected btwc() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "SatelliteEmergencyDetailsTable [message_id: %s,\n  help_state: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        MessageIdType messageIdType = this.a;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bary.a(this.a)));
        }
        clmt clmtVar = this.b;
        if (clmtVar == null) {
            contentValues.putNull("help_state");
        } else {
            contentValues.put("help_state", Integer.valueOf(clmtVar.a()));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        btwq btwqVar = (btwq) ((btwn) dqqjVar);
        aC();
        this.cN = btwqVar.cV();
        if (btwqVar.dj(0)) {
            this.a = btwqVar.c();
            fN(0);
        }
        if (btwqVar.dj(1)) {
            this.b = btwqVar.e();
            fN(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof btwc)) {
            return false;
        }
        btwc btwcVar = (btwc) obj;
        return super.aE(btwcVar.cN) && Objects.equals(this.a, btwcVar.a) && this.b == btwcVar.b;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "satellite_emergency_details", dqru.m(new String[]{"message_id", "help_state"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "satellite_emergency_details";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r8, java.util.List r9) {
        /*
            r7 = this;
            btwb r0 = new btwb
            r0.<init>(r7)
            java.lang.Object r0 = r0.get()
            clmt r1 = r7.b
            r2 = 0
            if (r1 != 0) goto L13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            goto L1b
        L13:
            int r1 = r1.a()
            java.lang.String r1 = java.lang.String.valueOf(r1)
        L1b:
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r2] = r0
            r0 = 1
            r4[r0] = r1
            r0 = 40
            r8.append(r0)
        L28:
            if (r2 >= r3) goto L5f
            r0 = r4[r2]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L38
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L57
        L38:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L4f
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r5 = r1.length()
            r6 = 12
            if (r5 >= r6) goto L4f
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r8.append(r0)
            goto L57
        L4f:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L57:
            r0 = 44
            r8.append(r0)
            int r2 = r2 + 1
            goto L28
        L5f:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btwc.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "SatelliteEmergencyDetailsTable -- REDACTED") : a();
    }
}
