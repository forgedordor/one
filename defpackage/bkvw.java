package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.time.Instant;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bkvw extends dqpd {
    private String a;
    private String b;
    private String c;
    private byte[] h;
    private boolean d = false;
    private boolean e = false;
    private basa f = new basa(0);
    private Instant g = bart.b(0);
    private long i = 0;
    private Instant j = bart.b(0);
    private boolean k = false;

    protected bkvw() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        Locale locale = Locale.US;
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.c);
        String strValueOf4 = String.valueOf(this.d);
        String strValueOf5 = String.valueOf(this.e);
        String strValueOf6 = String.valueOf(this.f);
        String strValueOf7 = String.valueOf(this.g);
        byte[] bArr = this.h;
        return String.format(locale, "RemoteInstancesView [remote_user_id_to_registration_id.remote_user_id_to_registration_id_remote_user_id: %s,\n  remote_user_id_to_registration_id.remote_user_id_to_registration_id_tachyon_registration_id: %s,\n  remote_registrations_table.remote_registrations_table_tachyon_registration_id: %s,\n  remote_registrations_table.remote_registrations_table_etouffee: %s,\n  remote_registrations_table.remote_registrations_table_better_etouffee: %s,\n  remote_registrations_table.remote_registrations_table_messages_feature_hash: %s,\n  remote_registrations_table.remote_registrations_table_last_modified_timestamp: %s,\n  remote_registrations_table.remote_registrations_table_identity_key: %s,\n  remote_registrations_table.remote_registrations_table_updated_at_hash: %s,\n  remote_registrations_table.remote_registrations_table_guaranteed_fresh_as_of_timestamp: %s,\n  remote_registrations_table.remote_registrations_table_is_updated_at_hash_valid: %s\n]\n", strValueOf, strValueOf2, strValueOf3, strValueOf4, strValueOf5, strValueOf6, strValueOf7, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        bkxc.c().intValue();
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bkwx bkwxVar = (bkwx) dqqjVar;
        aC();
        this.cN = bkwxVar.cV();
        if (bkwxVar.dj(0)) {
            this.a = bkwxVar.getString(bkwxVar.cO(0, bkxc.a));
            fN(0);
        }
        if (bkwxVar.dj(1)) {
            this.b = bkwxVar.getString(bkwxVar.cO(1, bkxc.a));
            fN(1);
        }
        if (bkwxVar.dj(2)) {
            this.c = bkwxVar.getString(bkwxVar.cO(2, bkxc.a));
            fN(2);
        }
        if (bkwxVar.dj(3)) {
            this.d = bkwxVar.getInt(bkwxVar.cO(3, bkxc.a)) == 1;
            fN(3);
        }
        if (bkwxVar.dj(4)) {
            this.e = bkwxVar.getInt(bkwxVar.cO(4, bkxc.a)) == 1;
            fN(4);
        }
        if (bkwxVar.dj(5)) {
            this.f = new basa(bkwxVar.getLong(bkwxVar.cO(5, bkxc.a)));
            fN(5);
        }
        if (bkwxVar.dj(6)) {
            this.g = bart.b(bkwxVar.getLong(bkwxVar.cO(6, bkxc.a)));
            fN(6);
        }
        if (bkwxVar.dj(7)) {
            this.h = bkwxVar.c();
            fN(7);
        }
        if (bkwxVar.dj(8)) {
            this.i = bkwxVar.getLong(bkwxVar.cO(8, bkxc.a));
            fN(8);
        }
        if (bkwxVar.dj(9)) {
            this.j = bart.b(bkwxVar.getLong(bkwxVar.cO(9, bkxc.a)));
            fN(9);
        }
        if (bkwxVar.dj(10)) {
            this.k = bkwxVar.getInt(bkwxVar.cO(10, bkxc.a)) == 1;
            fN(10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bkvw)) {
            return false;
        }
        bkvw bkvwVar = (bkvw) obj;
        return super.aE(bkvwVar.cN) && Objects.equals(this.a, bkvwVar.a) && Objects.equals(this.b, bkvwVar.b) && Objects.equals(this.c, bkvwVar.c) && this.d == bkvwVar.d && this.e == bkvwVar.e && Objects.equals(this.f, bkvwVar.f) && Objects.equals(this.g, bkvwVar.g) && Arrays.equals(this.h, bkvwVar.h) && this.i == bkvwVar.i && Objects.equals(this.j, bkvwVar.j) && this.k == bkvwVar.k;
    }

    public final long f() {
        aA(8, "updated_at_hash");
        return this.i;
    }

    public final String g() {
        aA(0, "remote_user_id");
        return this.a;
    }

    public final String h() {
        aA(2, "tachyon_registration_id");
        return this.c;
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f, this.g, Integer.valueOf(Arrays.hashCode(this.h)), Long.valueOf(this.i), this.j, Boolean.valueOf(this.k), null);
    }

    public final String i() {
        aA(1, "tachyon_registration_id");
        return this.b;
    }

    public final boolean j() {
        aA(3, "etouffee");
        return this.d;
    }

    public final boolean k() {
        aA(4, "better_etouffee");
        return this.e;
    }

    public final boolean l() {
        aA(10, "is_updated_at_hash_valid");
        return this.k;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "RemoteInstancesView -- REDACTED") : a();
    }
}
