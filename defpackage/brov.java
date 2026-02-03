package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.net.Uri;
import defpackage.dqpd;
import j$.time.Instant;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class brov extends dqpd implements dqpf {
    public int A;
    public String B;
    public int C;
    public int D;
    public String E;
    public boolean F;
    public int G;
    public String H;
    public bvdz I;
    public String J;
    public byte[] K;
    public long L;
    public boolean M;
    public boolean N;
    public String O;
    public cpyi P;
    public anuc V;
    public boolean W;
    public String a;
    public long c;
    public String d;
    public int g;
    public int h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public long n;
    public String o;
    public String p;
    public String q;
    public Uri r;
    public Uri s;
    public long t;
    public String u;
    public int v;
    public int w;
    public int x;
    public boolean y;
    public String z;
    public Instant b = Instant.EPOCH;
    public axcm e = null;
    public axcm f = null;
    public alwm Q = alwm.b(0);
    public bbaj R = bbaj.a;
    public chpq S = chpq.b(0);
    public chpq T = chpq.b(0);
    public chpm U = chpm.b(0);

    protected brov() {
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
        String strValueOf8 = String.valueOf(this.h);
        String strValueOf9 = String.valueOf(this.i);
        String strValueOf10 = String.valueOf(this.j);
        String strValueOf11 = String.valueOf(this.k);
        String strValueOf12 = String.valueOf(this.l);
        String strValueOf13 = String.valueOf(this.m);
        String strValueOf14 = String.valueOf(this.n);
        String strValueOf15 = String.valueOf(this.o);
        String strValueOf16 = String.valueOf(this.p);
        String strValueOf17 = String.valueOf(this.q);
        String strValueOf18 = String.valueOf(this.r);
        String strValueOf19 = String.valueOf(this.s);
        String strValueOf20 = String.valueOf(this.t);
        String strValueOf21 = String.valueOf(this.u);
        String strValueOf22 = String.valueOf(this.v);
        String strValueOf23 = String.valueOf(this.w);
        String strValueOf24 = String.valueOf(this.x);
        String strValueOf25 = String.valueOf(this.y);
        String strValueOf26 = String.valueOf(this.z);
        String strValueOf27 = String.valueOf(this.A);
        String strValueOf28 = String.valueOf(this.B);
        String strValueOf29 = String.valueOf(this.C);
        String strValueOf30 = String.valueOf(this.D);
        String strValueOf31 = String.valueOf(this.E);
        String strValueOf32 = String.valueOf(this.F);
        String strValueOf33 = String.valueOf(this.G);
        String strValueOf34 = String.valueOf(this.H);
        String strValueOf35 = String.valueOf(this.I);
        String strValueOf36 = String.valueOf(this.J);
        byte[] bArr = this.K;
        return String.format(locale, "ParticipantsAuditLogTable [_id: %s,\n  operation_datetime: %s,\n  operation_type: %s,\n  participant_id: %s,\n  my_identity_token: %s,\n  my_identity_token_foreign_key: %s,\n  sub_id: %s,\n  sim_slot_id: %s,\n  normalized_destination: %s,\n  send_destination: %s,\n  display_destination: %s,\n  comparable_destination: %s,\n  country_code: %s,\n  recipient_id: %s,\n  recipient_canonical_address: %s,\n  full_name: %s,\n  first_name: %s,\n  profile_photo_uri: %s,\n  contact_photo_uri: %s,\n  contact_id: %s,\n  lookup_key: %s,\n  color_palette_index: %s,\n  color_type: %s,\n  extended_color: %s,\n  blocked: %s,\n  subscription_name: %s,\n  subscription_color: %s,\n  contact_destination: %s,\n  participant_type: %s,\n  video_reachability: %s,\n  alias: %s,\n  is_spam: %s,\n  is_spam_source: %s,\n  cms_id: %s,\n  latest_verification_status: %s,\n  profile_photo_blob_id: %s,\n  profile_photo_encryption_key: %s,\n  directory_id: %s,\n  is_check_constraint_enabled_via_phenotype: %s,\n  is_valid_phone_number_data: %s,\n  duplicate_of: %s,\n  cms_life_cycle: %s,\n  norm_ui_status: %s,\n  last_modified_by_key: %s,\n  name_source: %s,\n  photo_source: %s,\n  profile_photo_user_preference: %s,\n  contact_metadata: %s,\n  is_enterprise_contact: %s\n]\n", strValueOf, strValueOf2, strValueOf3, strValueOf4, strValueOf5, strValueOf6, strValueOf7, strValueOf8, strValueOf9, strValueOf10, strValueOf11, strValueOf12, strValueOf13, strValueOf14, strValueOf15, strValueOf16, strValueOf17, strValueOf18, strValueOf19, strValueOf20, strValueOf21, strValueOf22, strValueOf23, strValueOf24, strValueOf25, strValueOf26, strValueOf27, strValueOf28, strValueOf29, strValueOf30, strValueOf31, strValueOf32, strValueOf33, strValueOf34, strValueOf35, strValueOf36, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")), String.valueOf(this.L), String.valueOf(this.M), String.valueOf(this.N), String.valueOf(this.O), String.valueOf(this.P), String.valueOf(this.Q), String.valueOf(this.R), String.valueOf(this.S), String.valueOf(this.T), String.valueOf(this.U), String.valueOf(this.V), String.valueOf(this.W));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = brvd.c().intValue();
        Instant instant = this.b;
        if (instant == null) {
            contentValues.putNull("operation_datetime");
        } else {
            contentValues.put("operation_datetime", Long.valueOf(bart.a(instant)));
        }
        contentValues.put("operation_type", Long.valueOf(this.c));
        dqru.v(contentValues, "participant_id", this.d);
        if (iIntValue >= 59930) {
            axcm axcmVar = this.e;
            if (axcmVar == null) {
                contentValues.putNull("my_identity_token");
            } else {
                contentValues.put("my_identity_token", axcn.b(axcmVar));
            }
        }
        if (iIntValue >= 60160) {
            axcm axcmVar2 = this.f;
            if (axcmVar2 == null || axcmVar2.equals(null)) {
                contentValues.putNull("my_identity_token_foreign_key");
            } else {
                contentValues.put("my_identity_token_foreign_key", axcn.b(this.f));
            }
        }
        contentValues.put("sub_id", Integer.valueOf(this.g));
        contentValues.put("sim_slot_id", Integer.valueOf(this.h));
        dqru.v(contentValues, "normalized_destination", this.i);
        dqru.v(contentValues, "send_destination", this.j);
        dqru.v(contentValues, "display_destination", this.k);
        dqru.v(contentValues, "comparable_destination", this.l);
        dqru.v(contentValues, "country_code", this.m);
        contentValues.put("recipient_id", Long.valueOf(this.n));
        dqru.v(contentValues, "recipient_canonical_address", this.o);
        dqru.v(contentValues, "full_name", this.p);
        dqru.v(contentValues, "first_name", this.q);
        Uri uri = this.r;
        if (uri == null) {
            contentValues.putNull("profile_photo_uri");
        } else {
            contentValues.put("profile_photo_uri", uri.toString());
        }
        if (iIntValue >= 59850) {
            Uri uri2 = this.s;
            if (uri2 == null) {
                contentValues.putNull("contact_photo_uri");
            } else {
                contentValues.put("contact_photo_uri", uri2.toString());
            }
        }
        contentValues.put("contact_id", Long.valueOf(this.t));
        dqru.v(contentValues, "lookup_key", this.u);
        contentValues.put("color_palette_index", Integer.valueOf(this.v));
        contentValues.put("color_type", Integer.valueOf(this.w));
        contentValues.put("extended_color", Integer.valueOf(this.x));
        contentValues.put("blocked", Boolean.valueOf(this.y));
        dqru.v(contentValues, "subscription_name", this.z);
        contentValues.put("subscription_color", Integer.valueOf(this.A));
        dqru.v(contentValues, "contact_destination", this.B);
        contentValues.put("participant_type", Integer.valueOf(this.C));
        contentValues.put("video_reachability", Integer.valueOf(this.D));
        dqru.v(contentValues, "alias", this.E);
        contentValues.put("is_spam", Boolean.valueOf(this.F));
        contentValues.put("is_spam_source", Integer.valueOf(this.G));
        dqru.v(contentValues, "cms_id", this.H);
        bvdz bvdzVar = this.I;
        if (bvdzVar == null) {
            contentValues.putNull("latest_verification_status");
        } else {
            contentValues.put("latest_verification_status", Integer.valueOf(bvdzVar.ordinal()));
        }
        dqru.v(contentValues, "profile_photo_blob_id", this.J);
        contentValues.put("profile_photo_encryption_key", this.K);
        contentValues.put("directory_id", Long.valueOf(this.L));
        contentValues.put("is_check_constraint_enabled_via_phenotype", Boolean.valueOf(this.M));
        contentValues.put("is_valid_phone_number_data", Boolean.valueOf(this.N));
        dqru.v(contentValues, "duplicate_of", this.O);
        cpyi cpyiVar = this.P;
        if (cpyiVar == null) {
            contentValues.putNull("cms_life_cycle");
        } else {
            contentValues.put("cms_life_cycle", Integer.valueOf(cpyiVar.ordinal()));
        }
        alwm alwmVar = this.Q;
        if (alwmVar == null) {
            contentValues.putNull("norm_ui_status");
        } else {
            contentValues.put("norm_ui_status", Integer.valueOf(alwmVar.a()));
        }
        if (iIntValue >= 59440) {
            bbaj bbajVar = this.R;
            if (bbajVar == null) {
                contentValues.putNull("last_modified_by_key");
            } else {
                contentValues.put("last_modified_by_key", bbam.c(bbajVar));
            }
        }
        if (iIntValue >= 59550) {
            chpq chpqVar = this.S;
            if (chpqVar == null) {
                contentValues.putNull("name_source");
            } else {
                contentValues.put("name_source", Integer.valueOf(chpqVar.a()));
            }
        }
        if (iIntValue >= 59550) {
            chpq chpqVar2 = this.T;
            if (chpqVar2 == null) {
                contentValues.putNull("photo_source");
            } else {
                contentValues.put("photo_source", Integer.valueOf(chpqVar2.a()));
            }
        }
        if (iIntValue >= 60060) {
            chpm chpmVar = this.U;
            if (chpmVar == null) {
                contentValues.putNull("profile_photo_user_preference");
            } else {
                contentValues.put("profile_photo_user_preference", Integer.valueOf(chpmVar.a()));
            }
        }
        if (iIntValue >= 60070) {
            anuc anucVar = this.V;
            if (anucVar == null) {
                contentValues.putNull("contact_metadata");
            } else {
                contentValues.put("contact_metadata", anucVar.toByteArray());
            }
        }
        if (iIntValue >= 60640) {
            contentValues.put("is_enterprise_contact", Boolean.valueOf(this.W));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bruu bruuVar = (bruu) ((brsw) dqqjVar);
        aC();
        this.cN = bruuVar.cV();
        if (bruuVar.dj(0)) {
            this.a = bruuVar.M();
            fN(0);
        }
        if (bruuVar.dj(1)) {
            this.b = bruuVar.C();
            fN(1);
        }
        if (bruuVar.dj(2)) {
            this.c = bruuVar.o();
            fN(2);
        }
        if (bruuVar.dj(3)) {
            this.d = bruuVar.P();
            fN(3);
        }
        if (bruuVar.dj(4)) {
            this.e = bruuVar.u();
            fN(4);
        }
        if (bruuVar.dj(5)) {
            this.f = bruuVar.v();
            fN(5);
        }
        if (bruuVar.dj(6)) {
            this.g = bruuVar.j();
            fN(6);
        }
        if (bruuVar.dj(7)) {
            this.h = bruuVar.i();
            fN(7);
        }
        if (bruuVar.dj(8)) {
            this.i = bruuVar.O();
            fN(8);
        }
        if (bruuVar.dj(9)) {
            this.j = bruuVar.S();
            fN(9);
        }
        if (bruuVar.dj(10)) {
            this.k = bruuVar.I();
            fN(10);
        }
        if (bruuVar.dj(11)) {
            this.l = bruuVar.F();
            fN(11);
        }
        if (bruuVar.dj(12)) {
            this.m = bruuVar.H();
            fN(12);
        }
        if (bruuVar.dj(13)) {
            this.n = bruuVar.p();
            fN(13);
        }
        if (bruuVar.dj(14)) {
            this.o = bruuVar.R();
            fN(14);
        }
        if (bruuVar.dj(15)) {
            this.p = bruuVar.L();
            fN(15);
        }
        if (bruuVar.dj(16)) {
            this.q = bruuVar.K();
            fN(16);
        }
        if (bruuVar.dj(17)) {
            this.r = bruuVar.r();
            fN(17);
        }
        if (bruuVar.dj(18)) {
            this.s = bruuVar.q();
            fN(18);
        }
        if (bruuVar.dj(19)) {
            this.t = bruuVar.m();
            fN(19);
        }
        if (bruuVar.dj(20)) {
            this.u = bruuVar.N();
            fN(20);
        }
        if (bruuVar.dj(21)) {
            this.v = bruuVar.c();
            fN(21);
        }
        if (bruuVar.dj(22)) {
            this.w = bruuVar.e();
            fN(22);
        }
        if (bruuVar.dj(23)) {
            this.x = bruuVar.f();
            fN(23);
        }
        if (bruuVar.dj(24)) {
            this.y = bruuVar.U();
            fN(24);
        }
        if (bruuVar.dj(25)) {
            this.z = bruuVar.T();
            fN(25);
        }
        if (bruuVar.dj(26)) {
            this.A = bruuVar.k();
            fN(26);
        }
        if (bruuVar.dj(27)) {
            this.B = bruuVar.G();
            fN(27);
        }
        if (bruuVar.dj(28)) {
            this.C = bruuVar.h();
            fN(28);
        }
        if (bruuVar.dj(29)) {
            this.D = bruuVar.l();
            fN(29);
        }
        if (bruuVar.dj(30)) {
            this.E = bruuVar.D();
            fN(30);
        }
        if (bruuVar.dj(31)) {
            this.F = bruuVar.X();
            fN(31);
        }
        if (bruuVar.dj(32)) {
            this.G = bruuVar.g();
            fN(32);
        }
        if (bruuVar.dj(33)) {
            this.H = bruuVar.E();
            fN(33);
        }
        if (bruuVar.dj(34)) {
            this.I = bruuVar.x();
            fN(34);
        }
        if (bruuVar.dj(35)) {
            this.J = bruuVar.Q();
            fN(35);
        }
        if (bruuVar.dj(36)) {
            this.K = bruuVar.Z();
            fN(36);
        }
        if (bruuVar.dj(37)) {
            this.L = bruuVar.n();
            fN(37);
        }
        if (bruuVar.dj(38)) {
            this.M = bruuVar.V();
            fN(38);
        }
        if (bruuVar.dj(39)) {
            this.N = bruuVar.Y();
            fN(39);
        }
        if (bruuVar.dj(40)) {
            this.O = bruuVar.J();
            fN(40);
        }
        if (bruuVar.dj(41)) {
            this.P = bruuVar.B();
            fN(41);
        }
        if (bruuVar.dj(42)) {
            this.Q = bruuVar.s();
            fN(42);
        }
        if (bruuVar.dj(43)) {
            this.R = bruuVar.w();
            fN(43);
        }
        if (bruuVar.dj(44)) {
            this.S = bruuVar.z();
            fN(44);
        }
        if (bruuVar.dj(45)) {
            this.T = bruuVar.A();
            fN(45);
        }
        if (bruuVar.dj(46)) {
            this.U = bruuVar.y();
            fN(46);
        }
        if (bruuVar.dj(47)) {
            this.V = bruuVar.t();
            fN(47);
        }
        if (bruuVar.dj(48)) {
            this.W = bruuVar.W();
            fN(48);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof brov)) {
            return false;
        }
        brov brovVar = (brov) obj;
        return super.aE(brovVar.cN) && Objects.equals(this.a, brovVar.a) && Objects.equals(this.b, brovVar.b) && this.c == brovVar.c && Objects.equals(this.d, brovVar.d) && Objects.equals(this.e, brovVar.e) && Objects.equals(this.f, brovVar.f) && this.g == brovVar.g && this.h == brovVar.h && Objects.equals(this.i, brovVar.i) && Objects.equals(this.j, brovVar.j) && Objects.equals(this.k, brovVar.k) && Objects.equals(this.l, brovVar.l) && Objects.equals(this.m, brovVar.m) && this.n == brovVar.n && Objects.equals(this.o, brovVar.o) && Objects.equals(this.p, brovVar.p) && Objects.equals(this.q, brovVar.q) && Objects.equals(this.r, brovVar.r) && Objects.equals(this.s, brovVar.s) && this.t == brovVar.t && Objects.equals(this.u, brovVar.u) && this.v == brovVar.v && this.w == brovVar.w && this.x == brovVar.x && this.y == brovVar.y && Objects.equals(this.z, brovVar.z) && this.A == brovVar.A && Objects.equals(this.B, brovVar.B) && this.C == brovVar.C && this.D == brovVar.D && Objects.equals(this.E, brovVar.E) && this.F == brovVar.F && this.G == brovVar.G && Objects.equals(this.H, brovVar.H) && this.I == brovVar.I && Objects.equals(this.J, brovVar.J) && Arrays.equals(this.K, brovVar.K) && this.L == brovVar.L && this.M == brovVar.M && this.N == brovVar.N && Objects.equals(this.O, brovVar.O) && this.P == brovVar.P && this.Q == brovVar.Q && Objects.equals(this.R, brovVar.R) && this.S == brovVar.S && this.T == brovVar.T && this.U == brovVar.U && Objects.equals(this.V, brovVar.V) && this.W == brovVar.W;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "participants_audit_log", dqru.m(new String[]{"operation_datetime", "operation_type", "participant_id", "my_identity_token", "my_identity_token_foreign_key", "sub_id", "sim_slot_id", "normalized_destination", "send_destination", "display_destination", "comparable_destination", "country_code", "recipient_id", "recipient_canonical_address", "full_name", "first_name", "profile_photo_uri", "contact_photo_uri", "contact_id", "lookup_key", "color_palette_index", "color_type", "extended_color", "blocked", "subscription_name", "subscription_color", "contact_destination", "participant_type", "video_reachability", "alias", "is_spam", "is_spam_source", "cms_id", "latest_verification_status", "profile_photo_blob_id", "profile_photo_encryption_key", "directory_id", "is_check_constraint_enabled_via_phenotype", "is_valid_phone_number_data", "duplicate_of", "cms_life_cycle", "norm_ui_status", "last_modified_by_key", "name_source", "photo_source", "profile_photo_user_preference", "contact_metadata", "is_enterprise_contact"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "participants_audit_log";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        String str = this.a;
        Instant instant = this.b;
        Long lValueOf = Long.valueOf(this.c);
        String str2 = this.d;
        axcm axcmVar = this.e;
        axcm axcmVar2 = this.f;
        Integer numValueOf = Integer.valueOf(this.g);
        Integer numValueOf2 = Integer.valueOf(this.h);
        String str3 = this.i;
        String str4 = this.j;
        String str5 = this.k;
        String str6 = this.l;
        String str7 = this.m;
        Long lValueOf2 = Long.valueOf(this.n);
        String str8 = this.o;
        dqqe dqqeVar3 = dqqeVar2;
        String str9 = this.p;
        String str10 = this.q;
        Uri uri = this.r;
        Uri uri2 = this.s;
        Long lValueOf3 = Long.valueOf(this.t);
        String str11 = this.u;
        Integer numValueOf3 = Integer.valueOf(this.v);
        Integer numValueOf4 = Integer.valueOf(this.w);
        Integer numValueOf5 = Integer.valueOf(this.x);
        Boolean boolValueOf = Boolean.valueOf(this.y);
        String str12 = this.z;
        Integer numValueOf6 = Integer.valueOf(this.A);
        String str13 = this.B;
        Integer numValueOf7 = Integer.valueOf(this.C);
        Integer numValueOf8 = Integer.valueOf(this.D);
        String str14 = this.E;
        Boolean boolValueOf2 = Boolean.valueOf(this.F);
        Integer numValueOf9 = Integer.valueOf(this.G);
        String str15 = this.H;
        bvdz bvdzVar = this.I;
        Integer numValueOf10 = Integer.valueOf(bvdzVar == null ? 0 : bvdzVar.ordinal());
        String str16 = this.J;
        Integer numValueOf11 = Integer.valueOf(Arrays.hashCode(this.K));
        Long lValueOf4 = Long.valueOf(this.L);
        Boolean boolValueOf3 = Boolean.valueOf(this.M);
        Boolean boolValueOf4 = Boolean.valueOf(this.N);
        String str17 = this.O;
        cpyi cpyiVar = this.P;
        return Objects.hash(dqqeVar3, str, instant, lValueOf, str2, axcmVar, axcmVar2, numValueOf, numValueOf2, str3, str4, str5, str6, str7, lValueOf2, str8, str9, str10, uri, uri2, lValueOf3, str11, numValueOf3, numValueOf4, numValueOf5, boolValueOf, str12, numValueOf6, str13, numValueOf7, numValueOf8, str14, boolValueOf2, numValueOf9, str15, numValueOf10, str16, numValueOf11, lValueOf4, boolValueOf3, boolValueOf4, str17, Integer.valueOf(cpyiVar == null ? 0 : cpyiVar.ordinal()), this.Q, this.R, this.S, this.T, this.U, this.V, Boolean.valueOf(this.W), null);
    }

    @Override // defpackage.dqpf
    public final void i(StringBuilder sb, List list) {
        Long lValueOf = Long.valueOf(bart.a(this.b));
        Long lValueOf2 = Long.valueOf(this.c);
        String str = this.d;
        String strB = axcn.b(this.e);
        Object obj = new brou(this).get();
        Integer numValueOf = Integer.valueOf(this.g);
        Integer numValueOf2 = Integer.valueOf(this.h);
        String str2 = this.i;
        String str3 = this.j;
        String str4 = this.k;
        String str5 = this.l;
        String str6 = this.m;
        Long lValueOf3 = Long.valueOf(this.n);
        String str7 = this.o;
        String str8 = this.p;
        String str9 = this.q;
        Uri uri = this.r;
        String string = uri == null ? null : uri.toString();
        Uri uri2 = this.s;
        String string2 = uri2 == null ? null : uri2.toString();
        Long lValueOf4 = Long.valueOf(this.t);
        String str10 = this.u;
        Integer numValueOf3 = Integer.valueOf(this.v);
        Integer numValueOf4 = Integer.valueOf(this.w);
        Integer numValueOf5 = Integer.valueOf(this.x);
        Integer numValueOf6 = Integer.valueOf(this.y ? 1 : 0);
        String str11 = this.z;
        Integer numValueOf7 = Integer.valueOf(this.A);
        String str12 = this.B;
        Integer numValueOf8 = Integer.valueOf(this.C);
        Integer numValueOf9 = Integer.valueOf(this.D);
        String str13 = this.E;
        Integer numValueOf10 = Integer.valueOf(this.F ? 1 : 0);
        Integer numValueOf11 = Integer.valueOf(this.G);
        String str14 = this.H;
        bvdz bvdzVar = this.I;
        Object objValueOf = bvdzVar == null ? 0 : String.valueOf(bvdzVar.ordinal());
        String str15 = this.J;
        byte[] bArr = this.K;
        Long lValueOf5 = Long.valueOf(this.L);
        Integer numValueOf12 = Integer.valueOf(this.M ? 1 : 0);
        Integer numValueOf13 = Integer.valueOf(this.N ? 1 : 0);
        String str16 = this.O;
        cpyi cpyiVar = this.P;
        Object objValueOf2 = cpyiVar == null ? 0 : String.valueOf(cpyiVar.ordinal());
        alwm alwmVar = this.Q;
        Object objValueOf3 = alwmVar == null ? 0 : String.valueOf(alwmVar.a());
        String strC = bbam.c(this.R);
        chpq chpqVar = this.S;
        Object objValueOf4 = chpqVar == null ? 0 : String.valueOf(chpqVar.a());
        chpq chpqVar2 = this.T;
        Object objValueOf5 = chpqVar2 == null ? 0 : String.valueOf(chpqVar2.a());
        chpm chpmVar = this.U;
        Object objValueOf6 = chpmVar == null ? 0 : String.valueOf(chpmVar.a());
        anuc anucVar = this.V;
        Object[] objArr = {lValueOf, lValueOf2, str, strB, obj, numValueOf, numValueOf2, str2, str3, str4, str5, str6, lValueOf3, str7, str8, str9, string, string2, lValueOf4, str10, numValueOf3, numValueOf4, numValueOf5, numValueOf6, str11, numValueOf7, str12, numValueOf8, numValueOf9, str13, numValueOf10, numValueOf11, str14, objValueOf, str15, bArr, lValueOf5, numValueOf12, numValueOf13, str16, objValueOf2, objValueOf3, strC, objValueOf4, objValueOf5, objValueOf6, anucVar != null ? anucVar.toByteArray() : null, Integer.valueOf(this.W ? 1 : 0)};
        sb.append('(');
        for (int i = 0; i < 48; i++) {
            Object obj2 = objArr[i];
            if (obj2 instanceof Number) {
                sb.append(String.valueOf(obj2));
            } else {
                if (obj2 instanceof String) {
                    String str17 = (String) obj2;
                    if (str17.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str17));
                    }
                }
                list.add(obj2);
                sb.append('?');
                sb.append(',');
            }
            sb.append(',');
        }
        sb.setLength(sb.length() - 1);
        sb.append(')');
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "ParticipantsAuditLogTable -- REDACTED") : a();
    }
}
