package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.time.Instant;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btip extends dqpd implements dqpf {
    public String a;
    public String b;
    public String d;
    public byte[] f;
    public boolean c = false;
    public Instant e = bart.b(0);
    public long g = 0;
    public Instant h = bart.b(0);
    public boolean i = false;

    protected btip() {
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
        return String.format(locale, "RemoteInstancesTable [_id: %s,\n  remote_instance_id: %s,\n  etouffee: %s,\n  tachyon_id: %s,\n  last_modified_timestamp: %s,\n  identity_key: %s,\n  updated_at_hash: %s,\n  guaranteed_fresh_as_of_timestamp: %s,\n  is_updated_at_hash_valid: %s\n]\n", strValueOf, strValueOf2, strValueOf3, strValueOf4, strValueOf5, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = btkh.c().intValue();
        dqru.v(contentValues, "remote_instance_id", this.b);
        contentValues.put("etouffee", Boolean.valueOf(this.c));
        dqru.v(contentValues, "tachyon_id", this.d);
        if (iIntValue >= 35040) {
            Instant instant = this.e;
            if (instant == null) {
                contentValues.putNull("last_modified_timestamp");
            } else {
                contentValues.put("last_modified_timestamp", Long.valueOf(bart.a(instant)));
            }
        }
        if (iIntValue >= 38010) {
            contentValues.put("identity_key", this.f);
        }
        if (iIntValue >= 39040) {
            contentValues.put("updated_at_hash", Long.valueOf(this.g));
        }
        if (iIntValue >= 40010) {
            Instant instant2 = this.h;
            if (instant2 == null) {
                contentValues.putNull("guaranteed_fresh_as_of_timestamp");
            } else {
                contentValues.put("guaranteed_fresh_as_of_timestamp", Long.valueOf(bart.a(instant2)));
            }
        }
        if (iIntValue >= 40030) {
            contentValues.put("is_updated_at_hash_valid", Boolean.valueOf(this.i));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        btjx btjxVar = (btjx) ((btjn) dqqjVar);
        aC();
        this.cN = btjxVar.cV();
        if (btjxVar.dj(0)) {
            this.a = btjxVar.l();
            fN(0);
        }
        if (btjxVar.dj(1)) {
            this.b = btjxVar.g();
            fN(1);
        }
        if (btjxVar.dj(2)) {
            this.c = btjxVar.i();
            fN(2);
        }
        if (btjxVar.dj(3)) {
            this.d = btjxVar.h();
            fN(3);
        }
        if (btjxVar.dj(4)) {
            this.e = btjxVar.f();
            fN(4);
        }
        if (btjxVar.dj(5)) {
            this.f = btjxVar.k();
            fN(5);
        }
        if (btjxVar.dj(6)) {
            this.g = btjxVar.c();
            fN(6);
        }
        if (btjxVar.dj(7)) {
            this.h = btjxVar.e();
            fN(7);
        }
        if (btjxVar.dj(8)) {
            this.i = btjxVar.j();
            fN(8);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof btip)) {
            return false;
        }
        btip btipVar = (btip) obj;
        return super.aE(btipVar.cN) && Objects.equals(this.a, btipVar.a) && Objects.equals(this.b, btipVar.b) && this.c == btipVar.c && Objects.equals(this.d, btipVar.d) && Objects.equals(this.e, btipVar.e) && Arrays.equals(this.f, btipVar.f) && this.g == btipVar.g && Objects.equals(this.h, btipVar.h) && this.i == btipVar.i;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "remote_instances", dqru.m(new String[]{"remote_instance_id", "etouffee", "tachyon_id", "last_modified_timestamp", "identity_key", "updated_at_hash", "guaranteed_fresh_as_of_timestamp", "is_updated_at_hash_valid"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "remote_instances";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, Boolean.valueOf(this.c), this.d, this.e, Integer.valueOf(Arrays.hashCode(this.f)), Long.valueOf(this.g), this.h, Boolean.valueOf(this.i), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r12, java.util.List r13) {
        /*
            r11 = this;
            java.lang.String r0 = r11.b
            boolean r1 = r11.c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = r11.d
            j$.time.Instant r3 = r11.e
            long r3 = defpackage.bart.a(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            byte[] r4 = r11.f
            long r5 = r11.g
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            j$.time.Instant r6 = r11.h
            long r6 = defpackage.bart.a(r6)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            boolean r7 = r11.i
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
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
        L4d:
            if (r10 >= r8) goto L84
            r0 = r9[r10]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L5d
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r12.append(r0)
            goto L7c
        L5d:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L74
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L74
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r12.append(r0)
            goto L7c
        L74:
            r13.add(r0)
            r0 = 63
            r12.append(r0)
        L7c:
            r0 = 44
            r12.append(r0)
            int r10 = r10 + 1
            goto L4d
        L84:
            int r13 = r12.length()
            int r13 = r13 + (-1)
            r12.setLength(r13)
            r13 = 41
            r12.append(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btip.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "RemoteInstancesTable -- REDACTED") : a();
    }
}
