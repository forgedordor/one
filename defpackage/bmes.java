package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bmes extends dqpd {
    private String a;
    private String b;
    private long c;
    private String d;
    private String e;
    private String f;
    private String g;
    private Uri h;
    private String i;

    protected bmes() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "VerifiedSmsSenderQueriesQuery [verified_sms_senders.verified_sms_senders_sender_id: %s,\n  verified_sms_senders.verified_sms_senders_brand_id: %s,\n  verified_sms_brands.verified_sms_brands__id: %s,\n  verified_sms_brands.verified_sms_brands_brand_id: %s,\n  verified_sms_brands.verified_sms_brands_name: %s,\n  verified_sms_brands.verified_sms_brands_description: %s,\n  verified_sms_brands.verified_sms_brands_logo_url: %s,\n  verified_sms_brands.verified_sms_brands_logo_uri: %s,\n  verified_sms_brands.verified_sms_brands_version_token: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i));
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bmfm bmfmVar = (bmfm) dqqjVar;
        aC();
        this.cN = bmfmVar.cV();
        if (bmfmVar.dj(0)) {
            this.a = bmfmVar.getString(bmfmVar.cO(0, bmfr.a));
            fN(0);
        }
        if (bmfmVar.dj(1)) {
            this.b = bmfmVar.getString(bmfmVar.cO(1, bmfr.a));
            fN(1);
        }
        if (bmfmVar.dj(2)) {
            this.c = bmfmVar.getLong(bmfmVar.cO(2, bmfr.a));
            fN(2);
        }
        if (bmfmVar.dj(3)) {
            this.d = bmfmVar.getString(bmfmVar.cO(3, bmfr.a));
            fN(3);
        }
        if (bmfmVar.dj(4)) {
            this.e = bmfmVar.getString(bmfmVar.cO(4, bmfr.a));
            fN(4);
        }
        if (bmfmVar.dj(5)) {
            this.f = bmfmVar.getString(bmfmVar.cO(5, bmfr.a));
            fN(5);
        }
        if (bmfmVar.dj(6)) {
            this.g = bmfmVar.getString(bmfmVar.cO(6, bmfr.a));
            fN(6);
        }
        if (bmfmVar.dj(7)) {
            this.h = bmfmVar.c();
            fN(7);
        }
        if (bmfmVar.dj(8)) {
            this.i = bmfmVar.getString(bmfmVar.cO(8, bmfr.a));
            fN(8);
        }
        Integer.valueOf(bmfr.a().M().a()).getClass();
        bvbd bvbdVarA = bvbu.a();
        aA(0, "sender_id");
        bvbdVarA.c(this.a);
        aA(1, "brand_id");
        bvbdVarA.b(this.b);
        bvbdVarA.a();
        buzt buztVarA = bvaz.a();
        aA(2, "_id");
        buztVarA.d(this.c);
        aA(3, "brand_id");
        buztVarA.b(this.d);
        aA(4, "name");
        buztVarA.g(this.e);
        aA(5, "description");
        buztVarA.c(this.f);
        aA(6, "logo_url");
        buztVarA.f(this.g);
        aA(7, "logo_uri");
        buztVarA.e(this.h);
        aA(8, "version_token");
        buztVarA.h(this.i);
        buztVarA.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bmes)) {
            return false;
        }
        bmes bmesVar = (bmes) obj;
        return super.aE(bmesVar.cN) && Objects.equals(this.a, bmesVar.a) && Objects.equals(this.b, bmesVar.b) && this.c == bmesVar.c && Objects.equals(this.d, bmesVar.d) && Objects.equals(this.e, bmesVar.e) && Objects.equals(this.f, bmesVar.f) && Objects.equals(this.g, bmesVar.g) && Objects.equals(this.h, bmesVar.h) && Objects.equals(this.i, bmesVar.i);
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, Long.valueOf(this.c), this.d, this.e, this.f, this.g, this.h, this.i, null);
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "VerifiedSmsSenderQueriesQuery -- REDACTED") : a();
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
    }
}
