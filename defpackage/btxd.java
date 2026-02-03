package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btxd extends dqpd implements dqpf {
    public String a;
    public String b;
    public String c;
    public int d;
    public int e;
    public String f;
    public int g = 0;
    public String h;
    public String i;

    protected btxd() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "SelfParticipantsTable [_id: %s,\n  phone_number: %s,\n  sim_serial_number: %s,\n  sim_slot_index: %s,\n  sub_id: %s,\n  subscription_name: %s,\n  subscription_color: %s,\n  participant_id: %s,\n  smsc: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = btyx.c().intValue();
        dqru.v(contentValues, "phone_number", this.b);
        dqru.v(contentValues, "sim_serial_number", this.c);
        contentValues.put("sim_slot_index", Integer.valueOf(this.d));
        contentValues.put("sub_id", Integer.valueOf(this.e));
        dqru.v(contentValues, "subscription_name", this.f);
        contentValues.put("subscription_color", Integer.valueOf(this.g));
        dqru.v(contentValues, "participant_id", this.h);
        if (iIntValue >= 29080) {
            dqru.v(contentValues, "smsc", this.i);
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        btyn btynVar = (btyn) ((btyd) dqqjVar);
        aC();
        this.cN = btynVar.cV();
        if (btynVar.dj(0)) {
            this.a = btynVar.i();
            fN(0);
        }
        if (btynVar.dj(1)) {
            this.b = btynVar.k();
            fN(1);
        }
        if (btynVar.dj(2)) {
            this.c = btynVar.l();
            fN(2);
        }
        if (btynVar.dj(3)) {
            this.d = btynVar.f();
            fN(3);
        }
        if (btynVar.dj(4)) {
            this.e = btynVar.g();
            fN(4);
        }
        if (btynVar.dj(5)) {
            this.f = btynVar.m();
            fN(5);
        }
        if (btynVar.dj(6)) {
            this.g = btynVar.h();
            fN(6);
        }
        if (btynVar.dj(7)) {
            this.h = btynVar.j();
            fN(7);
        }
        if (btynVar.dj(8)) {
            this.i = btynVar.e();
            fN(8);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof btxd)) {
            return false;
        }
        btxd btxdVar = (btxd) obj;
        return super.aE(btxdVar.cN) && Objects.equals(this.a, btxdVar.a) && Objects.equals(this.b, btxdVar.b) && Objects.equals(this.c, btxdVar.c) && this.d == btxdVar.d && this.e == btxdVar.e && Objects.equals(this.f, btxdVar.f) && this.g == btxdVar.g && Objects.equals(this.h, btxdVar.h) && Objects.equals(this.i, btxdVar.i);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "self_participants", dqru.m(new String[]{"phone_number", "sim_serial_number", "sim_slot_index", "sub_id", "subscription_name", "subscription_color", "participant_id", "smsc"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "self_participants";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, this.c, Integer.valueOf(this.d), Integer.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, this.i, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r12, java.util.List r13) {
        /*
            r11 = this;
            java.lang.String r0 = r11.b
            java.lang.String r1 = r11.c
            int r2 = r11.d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r11.e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = r11.f
            int r5 = r11.g
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = r11.h
            java.lang.String r7 = r11.i
            r8 = 8
            java.lang.Object[] r9 = new java.lang.Object[r8]
            r10 = 0
            r9[r10] = r0
            r0 = 1
            r9[r0] = r1
            r0 = 2
            r9[r0] = r2
            r0 = 3
            r9[r0] = r3
            r0 = 4
            r9[r0] = r4
            r0 = 5
            r9[r0] = r5
            r0 = 6
            r9[r0] = r6
            r0 = 7
            r9[r0] = r7
            r0 = 40
            r12.append(r0)
        L3d:
            if (r10 >= r8) goto L74
            r0 = r9[r10]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L4d
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r12.append(r0)
            goto L6c
        L4d:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L64
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L64
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r12.append(r0)
            goto L6c
        L64:
            r13.add(r0)
            r0 = 63
            r12.append(r0)
        L6c:
            r0 = 44
            r12.append(r0)
            int r10 = r10 + 1
            goto L3d
        L74:
            int r13 = r12.length()
            int r13 = r13 + (-1)
            r12.setLength(r13)
            r13 = 41
            r12.append(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btxd.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final int k() {
        aA(3, "sim_slot_index");
        return this.d;
    }

    public final int m() {
        aA(4, "sub_id");
        return this.e;
    }

    public final String n() {
        aA(0, "_id");
        return this.a;
    }

    public final String o() {
        aA(2, "sim_serial_number");
        return this.c;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "SelfParticipantsTable -- REDACTED") : a();
    }
}
