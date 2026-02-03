package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class awzp extends dqpd {
    public String c;
    public awxl e;
    public String f;
    public int[] g;
    public String[] h;
    private String i;
    private long[] j;
    public axcm a = null;
    public axcm b = null;
    public boolean d = false;

    protected awzp() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "MyIdentitySubscriptionQuery [my_identities.my_identities_token: %s,\n  my_identities.my_identities_canonical_token: %s,\n  my_identities.my_identities_provisioning_id_v2: %s,\n  my_identities.my_identities_is_verified_v2: %s,\n  my_identities.my_identities_address_type: %s,\n  my_identities.my_identities_phone_number: %s,\n  my_identities.my_identities_display_name: %s,\n  subscriptions.subscriptions_sub_id: %s,\n  subscriptions.subscriptions_sim_serial_number: %s,\n  subscriptions.subscriptions_rowid: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.i), String.valueOf(this.f), aJ(this.g), aM(this.h), aK(this.j));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        axay.b().intValue();
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        axat axatVar = (axat) dqqjVar;
        aC();
        this.cN = axatVar.cV();
        if (axatVar.dj(0)) {
            this.a = axcn.a(axatVar.getString(axatVar.cO(0, axay.a)));
            fN(0);
        }
        if (axatVar.dj(1)) {
            this.b = axcn.a(axatVar.getString(axatVar.cO(1, axay.a)));
            fN(1);
        }
        if (axatVar.dj(2)) {
            this.c = axatVar.getString(axatVar.cO(2, axay.a));
            fN(2);
        }
        if (axatVar.dj(3)) {
            this.d = axatVar.getInt(axatVar.cO(3, axay.a)) == 1;
            fN(3);
        }
        if (axatVar.dj(4)) {
            awxl[] awxlVarArrValues = awxl.values();
            int i = axatVar.getInt(axatVar.cO(4, axay.a));
            if (i >= awxlVarArrValues.length) {
                throw new IllegalArgumentException();
            }
            this.e = awxlVarArrValues[i];
            fN(4);
        }
        if (axatVar.dj(5)) {
            this.i = axatVar.getString(axatVar.cO(5, axay.a));
            fN(5);
        }
        if (axatVar.dj(6)) {
            this.f = axatVar.getString(axatVar.cO(6, axay.a));
            fN(6);
        }
        if (axatVar.dj(7)) {
            this.g = dqru.A(axat.dt(axatVar.getString(9)), axat.ds(axatVar.getString(axatVar.cO(7, axay.a))));
            fN(7);
        }
        if (axatVar.dj(8)) {
            this.h = (String[]) dqru.D(axat.dt(axatVar.getString(9)), axat.du(axatVar.getString(axatVar.cO(8, axay.a))), new String[0]);
            fN(8);
        }
        if (axatVar.dj(9)) {
            this.j = dqru.C(axat.dt(axatVar.getString(9)), axat.dt(axatVar.getString(axatVar.cO(9, axay.a))));
            fN(9);
        }
    }

    public final String d() {
        aA(5, "phone_number");
        return this.i;
    }

    public final int[] e() {
        aA(7, "sub_id");
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof awzp)) {
            return false;
        }
        awzp awzpVar = (awzp) obj;
        return super.aE(awzpVar.cN) && Objects.equals(this.a, awzpVar.a) && Objects.equals(this.b, awzpVar.b) && Objects.equals(this.c, awzpVar.c) && this.d == awzpVar.d && this.e == awzpVar.e && Objects.equals(this.i, awzpVar.i) && Objects.equals(this.f, awzpVar.f) && Arrays.equals(this.g, awzpVar.g) && Arrays.equals(this.h, awzpVar.h) && Arrays.equals(this.j, awzpVar.j);
    }

    public final String[] f() {
        aA(8, "sim_serial_number");
        return this.h;
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        axcm axcmVar = this.a;
        axcm axcmVar2 = this.b;
        String str = this.c;
        Boolean boolValueOf = Boolean.valueOf(this.d);
        awxl awxlVar = this.e;
        return Objects.hash(dqqeVar2, axcmVar, axcmVar2, str, boolValueOf, Integer.valueOf(awxlVar == null ? 0 : awxlVar.ordinal()), this.i, this.f, Integer.valueOf(Arrays.hashCode(this.g)), Integer.valueOf(Arrays.hashCode(this.h)), Integer.valueOf(Arrays.hashCode(this.j)), null);
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "MyIdentitySubscriptionQuery -- REDACTED") : a();
    }
}
