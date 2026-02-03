package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.time.Instant;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btkn extends dqpd implements dqpf {
    public String a;
    public byte[] f;
    public boolean b = false;
    public boolean c = false;
    public basa d = new basa(0);
    public Instant e = bart.b(0);
    public long g = 0;
    public Instant h = bart.b(0);
    public boolean i = false;

    protected btkn() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        Locale locale = Locale.US;
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.c);
        String strValueOf4 = String.valueOf(this.d);
        String strValueOf5 = String.valueOf(this.e);
        byte[] bArr = this.f;
        return String.format(locale, "RemoteRegistrationsTable [tachyon_registration_id: %s,\n  etouffee: %s,\n  better_etouffee: %s,\n  messages_feature_hash: %s,\n  last_modified_timestamp: %s,\n  identity_key: %s,\n  updated_at_hash: %s,\n  guaranteed_fresh_as_of_timestamp: %s,\n  is_updated_at_hash_valid: %s\n]\n", strValueOf, strValueOf2, strValueOf3, strValueOf4, strValueOf5, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = btmf.c().intValue();
        dqru.v(contentValues, "tachyon_registration_id", this.a);
        contentValues.put("etouffee", Boolean.valueOf(this.b));
        if (iIntValue >= 46000) {
            contentValues.put("better_etouffee", Boolean.valueOf(this.c));
        }
        if (iIntValue >= 58800) {
            basa basaVar = this.d;
            if (basaVar == null) {
                contentValues.putNull("messages_feature_hash");
            } else {
                contentValues.put("messages_feature_hash", Long.valueOf(basaVar.a));
            }
        }
        Instant instant = this.e;
        if (instant == null) {
            contentValues.putNull("last_modified_timestamp");
        } else {
            contentValues.put("last_modified_timestamp", Long.valueOf(bart.a(instant)));
        }
        contentValues.put("identity_key", this.f);
        contentValues.put("updated_at_hash", Long.valueOf(this.g));
        Instant instant2 = this.h;
        if (instant2 == null) {
            contentValues.putNull("guaranteed_fresh_as_of_timestamp");
        } else {
            contentValues.put("guaranteed_fresh_as_of_timestamp", Long.valueOf(bart.a(instant2)));
        }
        contentValues.put("is_updated_at_hash_valid", Boolean.valueOf(this.i));
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        btlv btlvVar = (btlv) ((btll) dqqjVar);
        aC();
        this.cN = btlvVar.cV();
        if (btlvVar.dj(0)) {
            this.a = btlvVar.h();
            fN(0);
        }
        if (btlvVar.dj(1)) {
            this.b = btlvVar.i();
            fN(1);
        }
        if (btlvVar.dj(2)) {
            this.c = btlvVar.j();
            fN(2);
        }
        if (btlvVar.dj(3)) {
            this.d = btlvVar.e();
            fN(3);
        }
        if (btlvVar.dj(4)) {
            this.e = btlvVar.g();
            fN(4);
        }
        if (btlvVar.dj(5)) {
            this.f = btlvVar.l();
            fN(5);
        }
        if (btlvVar.dj(6)) {
            this.g = btlvVar.c();
            fN(6);
        }
        if (btlvVar.dj(7)) {
            this.h = btlvVar.f();
            fN(7);
        }
        if (btlvVar.dj(8)) {
            this.i = btlvVar.k();
            fN(8);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof btkn)) {
            return false;
        }
        btkn btknVar = (btkn) obj;
        return super.aE(btknVar.cN) && Objects.equals(this.a, btknVar.a) && this.b == btknVar.b && this.c == btknVar.c && Objects.equals(this.d, btknVar.d) && Objects.equals(this.e, btknVar.e) && Arrays.equals(this.f, btknVar.f) && this.g == btknVar.g && Objects.equals(this.h, btknVar.h) && this.i == btknVar.i;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "remote_registrations_table", dqru.m(new String[]{"tachyon_registration_id", "etouffee", "better_etouffee", "messages_feature_hash", "last_modified_timestamp", "identity_key", "updated_at_hash", "guaranteed_fresh_as_of_timestamp", "is_updated_at_hash_valid"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "remote_registrations_table";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, Boolean.valueOf(this.b), Boolean.valueOf(this.c), this.d, this.e, Integer.valueOf(Arrays.hashCode(this.f)), Long.valueOf(this.g), this.h, Boolean.valueOf(this.i), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0084  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r13, java.util.List r14) {
        /*
            r12 = this;
            java.lang.String r0 = r12.a
            boolean r1 = r12.b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r2 = r12.c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            basa r3 = r12.d
            long r3 = r3.a
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            j$.time.Instant r4 = r12.e
            long r4 = defpackage.bart.a(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            byte[] r5 = r12.f
            long r6 = r12.g
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            j$.time.Instant r7 = r12.h
            long r7 = defpackage.bart.a(r7)
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            boolean r8 = r12.i
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9 = 9
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r11 = 0
            r10[r11] = r0
            r0 = 1
            r10[r0] = r1
            r0 = 2
            r10[r0] = r2
            r0 = 3
            r10[r0] = r3
            r0 = 4
            r10[r0] = r4
            r0 = 5
            r10[r0] = r5
            r0 = 6
            r10[r0] = r6
            r0 = 7
            r10[r0] = r7
            r0 = 8
            r10[r0] = r8
            r0 = 40
            r13.append(r0)
        L5d:
            if (r11 >= r9) goto L94
            r0 = r10[r11]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L6d
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r13.append(r0)
            goto L8c
        L6d:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L84
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L84
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r13.append(r0)
            goto L8c
        L84:
            r14.add(r0)
            r0 = 63
            r13.append(r0)
        L8c:
            r0 = 44
            r13.append(r0)
            int r11 = r11 + 1
            goto L5d
        L94:
            int r14 = r13.length()
            int r14 = r14 + (-1)
            r13.setLength(r14)
            r14 = 41
            r13.append(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btkn.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final Instant k() {
        aA(7, "guaranteed_fresh_as_of_timestamp");
        return this.h;
    }

    public final Instant m() {
        aA(4, "last_modified_timestamp");
        return this.e;
    }

    public final String n() {
        aA(0, "tachyon_registration_id");
        return this.a;
    }

    public final boolean o() {
        aA(1, "etouffee");
        return this.b;
    }

    public final boolean p() {
        aA(2, "better_etouffee");
        return this.c;
    }

    public final byte[] q() {
        aA(5, "identity_key");
        return this.f;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "RemoteRegistrationsTable -- REDACTED") : a();
    }
}
