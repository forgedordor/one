package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bvxg extends dqpd {
    private String a;
    private byte[] b;
    private String c;
    private String d;

    protected bvxg() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        Locale locale = Locale.US;
        String strValueOf = String.valueOf(this.a);
        byte[] bArr = this.b;
        return String.format(locale, "IdentityKeyQuery [remote_registrations_table.remote_registrations_table_tachyon_registration_id: %s,\n  remote_registrations_table.remote_registrations_table_identity_key: %s,\n  remote_user_id_to_registration_id.remote_user_id_to_registration_id_remote_user_id: %s,\n  contacts.contacts_lookup_key: %s\n]\n", strValueOf, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bvzr bvzrVar = (bvzr) dqqjVar;
        aC();
        this.cN = bvzrVar.cV();
        if (bvzrVar.dj(0)) {
            this.a = bvzrVar.getString(bvzrVar.cO(0, bvzw.a));
            fN(0);
        }
        if (bvzrVar.dj(1)) {
            this.b = bvzrVar.getBlob(bvzrVar.cO(1, bvzw.a));
            fN(1);
        }
        if (bvzrVar.dj(2)) {
            this.c = bvzrVar.getString(bvzrVar.cO(2, bvzw.a));
            fN(2);
        }
        if (bvzrVar.dj(3)) {
            this.d = bvzrVar.getString(bvzrVar.cO(3, bvzw.a));
            fN(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bvxg)) {
            return false;
        }
        bvxg bvxgVar = (bvxg) obj;
        return super.aE(bvxgVar.cN) && Objects.equals(this.a, bvxgVar.a) && Arrays.equals(this.b, bvxgVar.b) && Objects.equals(this.c, bvxgVar.c) && Objects.equals(this.d, bvxgVar.d);
    }

    public final String f() {
        aA(3, "lookup_key");
        return this.d;
    }

    public final String g() {
        aA(2, "remote_user_id");
        return this.c;
    }

    public final byte[] h() {
        aA(1, "identity_key");
        return this.b;
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, Integer.valueOf(Arrays.hashCode(this.b)), this.c, this.d, null);
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "IdentityKeyQuery -- REDACTED") : a();
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
    }
}
