package com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import defpackage.anqd;
import defpackage.bsrq;
import defpackage.bsrs;
import defpackage.bsrt;
import defpackage.bstj;
import defpackage.bstk;
import defpackage.bstl;
import defpackage.bsug;
import defpackage.bsum;
import defpackage.bsun;
import defpackage.bsuq;
import defpackage.bsur;
import defpackage.chpw;
import defpackage.dqpd;
import defpackage.dqpf;
import defpackage.dqqe;
import defpackage.dqqj;
import defpackage.dqru;
import defpackage.dqsf;
import defpackage.dqsg;
import defpackage.dqsh;
import defpackage.dqsi;
import defpackage.dqsy;
import defpackage.dqxa;
import defpackage.ehli;
import defpackage.ejxr;
import defpackage.ekfw;
import defpackage.ekgb;
import defpackage.ekgi;
import defpackage.ekgp;
import defpackage.evrr;
import defpackage.evsn;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ProfilesTable extends dqsi {
    public static final String[] a = {"profiles_table._id", "profiles_table.participant_id", "profiles_table.person_id", "profiles_table.profile_access_token", "profiles_table.sending_self_profile_interaction_state", "profiles_table.self_profile_sharing_metadata", "profiles_table.first_name", "profiles_table.last_name", "profiles_table.display_name", "profiles_table.photo_uri", "profiles_table.sender_last_updated_time", "profiles_table.sender_last_updated_time_from_rcs", "profiles_table.contact_lookup_key", "profiles_table.phone_number", "profiles_table.is_self_profile_shareable", "profiles_table.has_shared_access_token_with_user", "profiles_table.name_timestamp", "profiles_table.photo_timestamp", "profiles_table.belongs_to_self_gaia", "profiles_table.gaia_update_timestamp"};
    public static final ekgp b;
    public static final bstj c;
    public static final int[] d;

    /* compiled from: PG */
    public static abstract class BindData extends dqpd<bstl, bsum, bsun, BindData, bstk> implements Parcelable, dqpf {
        public static final Parcelable.Creator<BindData> CREATOR = new bsrq();
        public long a;
        public long b;
        public String c;
        public String d;
        public chpw f;
        public String g;
        public String h;
        public String i;
        public Uri j;
        public String k;
        public String l;
        public String m;
        public String n;
        public anqd e = anqd.a;
        public boolean o = true;
        public boolean p = false;
        public long q = 0;
        public long r = 0;
        public boolean s = false;
        public long t = 0;

        protected BindData() {
        }

        public final String A() {
            aA(3, "profile_access_token");
            return this.d;
        }

        public final String B() {
            aA(10, "sender_last_updated_time");
            return this.k;
        }

        public final String C() {
            aA(11, "sender_last_updated_time_from_rcs");
            return this.l;
        }

        public final boolean D() {
            aA(18, "belongs_to_self_gaia");
            return this.s;
        }

        public final boolean E() {
            aA(15, "has_shared_access_token_with_user");
            return this.p;
        }

        public final boolean F() {
            aA(14, "is_self_profile_shareable");
            return this.o;
        }

        public final boolean G(final bsuq bsuqVar) {
            final dqsy dqsyVarB = ProfilesTable.b();
            return ((Boolean) dqsyVarB.o(new ejxr() { // from class: bsrn
                @Override // defpackage.ejxr
                public final Object get() {
                    String[] strArr = ProfilesTable.a;
                    bsup bsupVar = new bsup();
                    ContentValues contentValues = bsupVar.a;
                    final ProfilesTable.BindData bindData = this.a;
                    dqru.u(contentValues, "participant_id", bindData.o());
                    bsupVar.c(bindData.y());
                    bsupVar.d(bindData.A());
                    anqd anqdVarR = bindData.r();
                    int iIntValue = ProfilesTable.c().intValue();
                    int iIntValue2 = ProfilesTable.c().intValue();
                    if (iIntValue2 < 60200) {
                        dqru.x("sending_self_profile_interaction_state", iIntValue2);
                    }
                    if (iIntValue >= 60200) {
                        if (anqdVarR == null) {
                            contentValues.putNull("sending_self_profile_interaction_state");
                        } else {
                            contentValues.put("sending_self_profile_interaction_state", Integer.valueOf(anqdVarR.ordinal()));
                        }
                    }
                    chpw chpwVarT = bindData.t();
                    int iIntValue3 = ProfilesTable.c().intValue();
                    int iIntValue4 = ProfilesTable.c().intValue();
                    if (iIntValue4 < 60340) {
                        dqru.x("self_profile_sharing_metadata", iIntValue4);
                    }
                    if (iIntValue3 >= 60340) {
                        if (chpwVarT == null) {
                            contentValues.putNull("self_profile_sharing_metadata");
                        } else {
                            contentValues.put("self_profile_sharing_metadata", chpwVarT.toByteArray());
                        }
                    }
                    dqru.v(contentValues, "first_name", bindData.w());
                    dqru.v(contentValues, "last_name", bindData.x());
                    dqru.v(contentValues, "display_name", bindData.v());
                    Uri uriQ = bindData.q();
                    if (uriQ == null) {
                        contentValues.putNull("photo_uri");
                    } else {
                        contentValues.put("photo_uri", uriQ.toString());
                    }
                    bsupVar.e(bindData.B());
                    bsupVar.f(bindData.C());
                    dqru.v(contentValues, "contact_lookup_key", bindData.u());
                    dqru.v(contentValues, "phone_number", bindData.z());
                    boolean zF = bindData.F();
                    int iIntValue5 = ProfilesTable.c().intValue();
                    int iIntValue6 = ProfilesTable.c().intValue();
                    if (iIntValue6 < 60400) {
                        dqru.x("is_self_profile_shareable", iIntValue6);
                    }
                    if (iIntValue5 >= 60400) {
                        contentValues.put("is_self_profile_shareable", Boolean.valueOf(zF));
                    }
                    boolean zE = bindData.E();
                    int iIntValue7 = ProfilesTable.c().intValue();
                    int iIntValue8 = ProfilesTable.c().intValue();
                    if (iIntValue8 < 60170) {
                        dqru.x("has_shared_access_token_with_user", iIntValue8);
                    }
                    if (iIntValue7 >= 60170) {
                        contentValues.put("has_shared_access_token_with_user", Boolean.valueOf(zE));
                    }
                    contentValues.put("name_timestamp", Long.valueOf(bindData.n()));
                    contentValues.put("photo_timestamp", Long.valueOf(bindData.p()));
                    boolean zD = bindData.D();
                    int iIntValue9 = ProfilesTable.c().intValue();
                    int iIntValue10 = ProfilesTable.c().intValue();
                    if (iIntValue10 < 59940) {
                        dqru.x("belongs_to_self_gaia", iIntValue10);
                    }
                    if (iIntValue9 >= 59940) {
                        contentValues.put("belongs_to_self_gaia", Boolean.valueOf(zD));
                    }
                    long jK = bindData.k();
                    int iIntValue11 = ProfilesTable.c().intValue();
                    int iIntValue12 = ProfilesTable.c().intValue();
                    if (iIntValue12 < 59940) {
                        dqru.x("gaia_update_timestamp", iIntValue12);
                    }
                    if (iIntValue11 >= 59940) {
                        contentValues.put("gaia_update_timestamp", Long.valueOf(jK));
                    }
                    bsuq bsuqVar2 = bsuqVar;
                    bsupVar.al();
                    bsupVar.af(bsuqVar2);
                    bsupVar.an(new dqsb("profiles_table", "-updateOrInsert-update"));
                    if (bsupVar.a().e() != 0) {
                        return true;
                    }
                    final dqsy dqsyVar = dqsyVarB;
                    return Boolean.valueOf(dqru.b(ProfilesTable.b(), "profiles_table", bindData, new Function() { // from class: bsro
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return Long.valueOf(dqsyVar.O("profiles_table", (dqst) obj));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Consumer() { // from class: bsrp
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            Long l = (Long) obj;
                            if (l.longValue() >= 0) {
                                ProfilesTable.BindData bindData2 = bindData;
                                bindData2.a = l.longValue();
                                bindData2.fN(0);
                            }
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }) != -1);
                }
            })).booleanValue();
        }

        public final boolean H(Function function) {
            String[] strArr = ProfilesTable.a;
            return G(new bsuq((bsur) function.apply(new bsur())));
        }

        @Override // defpackage.dqpd
        public final String a() {
            return String.format(Locale.US, "ProfilesTable [_id: %s,\n  participant_id: %s,\n  person_id: %s,\n  profile_access_token: %s,\n  sending_self_profile_interaction_state: %s,\n  self_profile_sharing_metadata: %s,\n  first_name: %s,\n  last_name: %s,\n  display_name: %s,\n  photo_uri: %s,\n  sender_last_updated_time: %s,\n  sender_last_updated_time_from_rcs: %s,\n  contact_lookup_key: %s,\n  phone_number: %s,\n  is_self_profile_shareable: %s,\n  has_shared_access_token_with_user: %s,\n  name_timestamp: %s,\n  photo_timestamp: %s,\n  belongs_to_self_gaia: %s,\n  gaia_update_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l), String.valueOf(this.m), String.valueOf(this.n), String.valueOf(this.o), String.valueOf(this.p), String.valueOf(this.q), String.valueOf(this.r), String.valueOf(this.s), String.valueOf(this.t));
        }

        @Override // defpackage.dqpd
        public final void b(ContentValues contentValues) {
            int iIntValue = ProfilesTable.c().intValue();
            dqru.u(contentValues, "participant_id", this.b);
            if (iIntValue >= 60170) {
                dqru.v(contentValues, "person_id", this.c);
            }
            if (iIntValue >= 60170) {
                dqru.v(contentValues, "profile_access_token", this.d);
            }
            if (iIntValue >= 60200) {
                anqd anqdVar = this.e;
                if (anqdVar == null) {
                    contentValues.putNull("sending_self_profile_interaction_state");
                } else {
                    contentValues.put("sending_self_profile_interaction_state", Integer.valueOf(anqdVar.ordinal()));
                }
            }
            if (iIntValue >= 60340) {
                chpw chpwVar = this.f;
                if (chpwVar == null) {
                    contentValues.putNull("self_profile_sharing_metadata");
                } else {
                    contentValues.put("self_profile_sharing_metadata", chpwVar.toByteArray());
                }
            }
            dqru.v(contentValues, "first_name", this.g);
            dqru.v(contentValues, "last_name", this.h);
            dqru.v(contentValues, "display_name", this.i);
            Uri uri = this.j;
            if (uri == null) {
                contentValues.putNull("photo_uri");
            } else {
                contentValues.put("photo_uri", uri.toString());
            }
            if (iIntValue >= 60170) {
                dqru.v(contentValues, "sender_last_updated_time", this.k);
            }
            if (iIntValue >= 60200) {
                dqru.v(contentValues, "sender_last_updated_time_from_rcs", this.l);
            }
            dqru.v(contentValues, "contact_lookup_key", this.m);
            dqru.v(contentValues, "phone_number", this.n);
            if (iIntValue >= 60400) {
                contentValues.put("is_self_profile_shareable", Boolean.valueOf(this.o));
            }
            if (iIntValue >= 60170) {
                contentValues.put("has_shared_access_token_with_user", Boolean.valueOf(this.p));
            }
            contentValues.put("name_timestamp", Long.valueOf(this.q));
            contentValues.put("photo_timestamp", Long.valueOf(this.r));
            if (iIntValue >= 59940) {
                contentValues.put("belongs_to_self_gaia", Boolean.valueOf(this.s));
            }
            if (iIntValue >= 59940) {
                contentValues.put("gaia_update_timestamp", Long.valueOf(this.t));
            }
        }

        @Override // defpackage.dqpd
        protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
            bsug bsugVar = (bsug) ((bstl) dqqjVar);
            aC();
            this.cN = bsugVar.cV();
            if (bsugVar.dj(0)) {
                this.a = bsugVar.f();
                fN(0);
            }
            if (bsugVar.dj(1)) {
                this.b = bsugVar.h();
                fN(1);
            }
            if (bsugVar.dj(2)) {
                this.c = bsugVar.q();
                fN(2);
            }
            if (bsugVar.dj(3)) {
                this.d = bsugVar.s();
                fN(3);
            }
            if (bsugVar.dj(4)) {
                this.e = bsugVar.k();
                fN(4);
            }
            if (bsugVar.dj(5)) {
                this.f = bsugVar.l();
                fN(5);
            }
            if (bsugVar.dj(6)) {
                this.g = bsugVar.o();
                fN(6);
            }
            if (bsugVar.dj(7)) {
                this.h = bsugVar.p();
                fN(7);
            }
            if (bsugVar.dj(8)) {
                this.i = bsugVar.n();
                fN(8);
            }
            if (bsugVar.dj(9)) {
                this.j = bsugVar.j();
                fN(9);
            }
            if (bsugVar.dj(10)) {
                this.k = bsugVar.t();
                fN(10);
            }
            if (bsugVar.dj(11)) {
                this.l = bsugVar.u();
                fN(11);
            }
            if (bsugVar.dj(12)) {
                this.m = bsugVar.m();
                fN(12);
            }
            if (bsugVar.dj(13)) {
                this.n = bsugVar.r();
                fN(13);
            }
            if (bsugVar.dj(14)) {
                this.o = bsugVar.x();
                fN(14);
            }
            if (bsugVar.dj(15)) {
                this.p = bsugVar.w();
                fN(15);
            }
            if (bsugVar.dj(16)) {
                this.q = bsugVar.g();
                fN(16);
            }
            if (bsugVar.dj(17)) {
                this.r = bsugVar.i();
                fN(17);
            }
            if (bsugVar.dj(18)) {
                this.s = bsugVar.v();
                fN(18);
            }
            if (bsugVar.dj(19)) {
                this.t = bsugVar.e();
                fN(19);
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BindData)) {
                return false;
            }
            BindData bindData = (BindData) obj;
            return super.aE(bindData.cN) && this.a == bindData.a && this.b == bindData.b && Objects.equals(this.c, bindData.c) && Objects.equals(this.d, bindData.d) && this.e == bindData.e && Objects.equals(this.f, bindData.f) && Objects.equals(this.g, bindData.g) && Objects.equals(this.h, bindData.h) && Objects.equals(this.i, bindData.i) && Objects.equals(this.j, bindData.j) && Objects.equals(this.k, bindData.k) && Objects.equals(this.l, bindData.l) && Objects.equals(this.m, bindData.m) && Objects.equals(this.n, bindData.n) && this.o == bindData.o && this.p == bindData.p && this.q == bindData.q && this.r == bindData.r && this.s == bindData.s && this.t == bindData.t;
        }

        @Override // defpackage.dqpf
        public final String f() {
            return String.format(Locale.US, "INTO %s (%s) VALUES ", "profiles_table", dqru.m(new String[]{"participant_id", "person_id", "profile_access_token", "sending_self_profile_interaction_state", "self_profile_sharing_metadata", "first_name", "last_name", "display_name", "photo_uri", "sender_last_updated_time", "sender_last_updated_time_from_rcs", "contact_lookup_key", "phone_number", "is_self_profile_shareable", "has_shared_access_token_with_user", "name_timestamp", "photo_timestamp", "belongs_to_self_gaia", "gaia_update_timestamp"}));
        }

        @Override // defpackage.dqpd
        protected final void fD(Parcel parcel) {
            chpw chpwVar;
            this.a = parcel.readLong();
            this.b = parcel.readLong();
            this.c = parcel.readString();
            this.d = parcel.readString();
            anqd[] anqdVarArrValues = anqd.values();
            int i = parcel.readInt();
            if (i >= 0) {
                if (i >= anqdVarArrValues.length) {
                    throw new IllegalArgumentException();
                }
                this.e = anqdVarArrValues[i];
            }
            byte[] bArrCreateByteArray = parcel.createByteArray();
            if (bArrCreateByteArray == null) {
                chpwVar = null;
            } else {
                try {
                    chpwVar = (chpw) evsn.parseFrom(chpw.a, bArrCreateByteArray, evrr.a());
                } catch (Throwable unused) {
                    this.f = null;
                }
            }
            this.f = chpwVar;
            this.g = parcel.readString();
            this.h = parcel.readString();
            this.i = parcel.readString();
            String string = parcel.readString();
            this.j = string != null ? Uri.parse(string) : null;
            this.k = parcel.readString();
            this.l = parcel.readString();
            this.m = parcel.readString();
            this.n = parcel.readString();
            this.o = parcel.readInt() == 1;
            this.p = parcel.readInt() == 1;
            this.q = parcel.readLong();
            this.r = parcel.readLong();
            this.s = parcel.readInt() == 1;
            this.t = parcel.readLong();
        }

        @Override // defpackage.dqpd
        protected final void fE(Parcel parcel) {
            parcel.writeLong(this.a);
            parcel.writeLong(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            anqd anqdVar = this.e;
            parcel.writeInt(anqdVar == null ? -1 : anqdVar.ordinal());
            chpw chpwVar = this.f;
            parcel.writeByteArray(chpwVar == null ? null : chpwVar.toByteArray());
            parcel.writeString(this.g);
            parcel.writeString(this.h);
            parcel.writeString(this.i);
            Uri uri = this.j;
            parcel.writeString(uri != null ? uri.toString() : null);
            parcel.writeString(this.k);
            parcel.writeString(this.l);
            parcel.writeString(this.m);
            parcel.writeString(this.n);
            parcel.writeInt(this.o ? 1 : 0);
            parcel.writeInt(this.p ? 1 : 0);
            parcel.writeLong(this.q);
            parcel.writeLong(this.r);
            parcel.writeInt(this.s ? 1 : 0);
            parcel.writeLong(this.t);
        }

        @Override // defpackage.dqpf
        public final String g() {
            return "_id";
        }

        @Override // defpackage.dqpf
        public final String h() {
            return "profiles_table";
        }

        public final int hashCode() {
            dqqe dqqeVar = this.cN;
            dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
            Long lValueOf = Long.valueOf(this.a);
            Long lValueOf2 = Long.valueOf(this.b);
            String str = this.c;
            String str2 = this.d;
            anqd anqdVar = this.e;
            return Objects.hash(dqqeVar2, lValueOf, lValueOf2, str, str2, Integer.valueOf(anqdVar == null ? 0 : anqdVar.ordinal()), this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, Boolean.valueOf(this.o), Boolean.valueOf(this.p), Long.valueOf(this.q), Long.valueOf(this.r), Boolean.valueOf(this.s), Long.valueOf(this.t), null);
        }

        @Override // defpackage.dqpf
        public final void i(StringBuilder sb, List list) {
            Long lValueOf = Long.valueOf(this.b);
            String str = this.c;
            String str2 = this.d;
            anqd anqdVar = this.e;
            Object objValueOf = anqdVar == null ? 0 : String.valueOf(anqdVar.ordinal());
            chpw chpwVar = this.f;
            byte[] byteArray = chpwVar == null ? null : chpwVar.toByteArray();
            String str3 = this.g;
            String str4 = this.h;
            String str5 = this.i;
            Uri uri = this.j;
            Object[] objArr = {lValueOf, str, str2, objValueOf, byteArray, str3, str4, str5, uri != null ? uri.toString() : null, this.k, this.l, this.m, this.n, Integer.valueOf(this.o ? 1 : 0), Integer.valueOf(this.p ? 1 : 0), Long.valueOf(this.q), Long.valueOf(this.r), Integer.valueOf(this.s ? 1 : 0), Long.valueOf(this.t)};
            sb.append('(');
            for (int i = 0; i < 19; i++) {
                Object obj = objArr[i];
                if (obj instanceof Number) {
                    sb.append(String.valueOf(obj));
                } else {
                    if (obj instanceof String) {
                        String str6 = (String) obj;
                        if (str6.length() < 12) {
                            sb.append(DatabaseUtils.sqlEscapeString(str6));
                        }
                    }
                    list.add(obj);
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

        public final long k() {
            aA(19, "gaia_update_timestamp");
            return this.t;
        }

        public final long m() {
            aA(0, "_id");
            return this.a;
        }

        public final long n() {
            aA(16, "name_timestamp");
            return this.q;
        }

        public final long o() {
            aA(1, "participant_id");
            return this.b;
        }

        public final long p() {
            aA(17, "photo_timestamp");
            return this.r;
        }

        public final Uri q() {
            aA(9, "photo_uri");
            return this.j;
        }

        public final anqd r() {
            aA(4, "sending_self_profile_interaction_state");
            return this.e;
        }

        public final bsrs s() {
            bsrt bsrtVar = new bsrt();
            BitSet bitSet = this.cL;
            bsrtVar.az = bitSet == null ? null : (BitSet) bitSet.clone();
            BitSet bitSet2 = bsrtVar.az;
            if (bitSet2 == null || bitSet2.get(0)) {
                bsrtVar.a = m();
            }
            BitSet bitSet3 = bsrtVar.az;
            if (bitSet3 == null || bitSet3.get(1)) {
                bsrtVar.b = o();
            }
            BitSet bitSet4 = bsrtVar.az;
            if (bitSet4 == null || bitSet4.get(2)) {
                bsrtVar.c = y();
            }
            BitSet bitSet5 = bsrtVar.az;
            if (bitSet5 == null || bitSet5.get(3)) {
                bsrtVar.d = A();
            }
            BitSet bitSet6 = bsrtVar.az;
            if (bitSet6 == null || bitSet6.get(4)) {
                bsrtVar.e = r();
            }
            BitSet bitSet7 = bsrtVar.az;
            if (bitSet7 == null || bitSet7.get(5)) {
                bsrtVar.f = t();
            }
            BitSet bitSet8 = bsrtVar.az;
            if (bitSet8 == null || bitSet8.get(6)) {
                bsrtVar.g = w();
            }
            BitSet bitSet9 = bsrtVar.az;
            if (bitSet9 == null || bitSet9.get(7)) {
                bsrtVar.h = x();
            }
            BitSet bitSet10 = bsrtVar.az;
            if (bitSet10 == null || bitSet10.get(8)) {
                bsrtVar.i = v();
            }
            BitSet bitSet11 = bsrtVar.az;
            if (bitSet11 == null || bitSet11.get(9)) {
                bsrtVar.j = q();
            }
            BitSet bitSet12 = bsrtVar.az;
            if (bitSet12 == null || bitSet12.get(10)) {
                bsrtVar.k = B();
            }
            BitSet bitSet13 = bsrtVar.az;
            if (bitSet13 == null || bitSet13.get(11)) {
                bsrtVar.l = C();
            }
            BitSet bitSet14 = bsrtVar.az;
            if (bitSet14 == null || bitSet14.get(12)) {
                bsrtVar.m = u();
            }
            BitSet bitSet15 = bsrtVar.az;
            if (bitSet15 == null || bitSet15.get(13)) {
                bsrtVar.n = z();
            }
            BitSet bitSet16 = bsrtVar.az;
            if (bitSet16 == null || bitSet16.get(14)) {
                bsrtVar.o = F();
            }
            BitSet bitSet17 = bsrtVar.az;
            if (bitSet17 == null || bitSet17.get(15)) {
                bsrtVar.p = E();
            }
            BitSet bitSet18 = bsrtVar.az;
            if (bitSet18 == null || bitSet18.get(16)) {
                bsrtVar.q = n();
            }
            BitSet bitSet19 = bsrtVar.az;
            if (bitSet19 == null || bitSet19.get(17)) {
                bsrtVar.r = p();
            }
            BitSet bitSet20 = bsrtVar.az;
            if (bitSet20 == null || bitSet20.get(18)) {
                bsrtVar.s = D();
            }
            BitSet bitSet21 = bsrtVar.az;
            if (bitSet21 != null && !bitSet21.get(19)) {
                return bsrtVar;
            }
            bsrtVar.t = k();
            return bsrtVar;
        }

        public final chpw t() {
            aA(5, "self_profile_sharing_metadata");
            return this.f;
        }

        public final String toString() {
            return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "ProfilesTable -- REDACTED") : a();
        }

        public final String u() {
            aA(12, "contact_lookup_key");
            return this.m;
        }

        public final String v() {
            aA(8, "display_name");
            return this.i;
        }

        public final String w() {
            aA(6, "first_name");
            return this.g;
        }

        public final String x() {
            aA(7, "last_name");
            return this.h;
        }

        public final String y() {
            aA(2, "person_id");
            return this.c;
        }

        public final String z() {
            aA(13, "phone_number");
            return this.n;
        }

        protected BindData(Parcel parcel) {
            aB(parcel);
        }
    }

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("profiles_table.person_id", 60170);
        ekgiVar.i("profiles_table.profile_access_token", 60170);
        ekgiVar.i("profiles_table.sending_self_profile_interaction_state", 60200);
        ekgiVar.i("profiles_table.self_profile_sharing_metadata", 60340);
        ekgiVar.i("profiles_table.sender_last_updated_time", 60170);
        ekgiVar.i("profiles_table.sender_last_updated_time_from_rcs", 60200);
        ekgiVar.i("profiles_table.is_self_profile_shareable", 60400);
        ekgiVar.i("profiles_table.has_shared_access_token_with_user", 60170);
        ekgiVar.i("profiles_table.belongs_to_self_gaia", 59940);
        ekgiVar.i("profiles_table.gaia_update_timestamp", 59940);
        b = ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("participant_id", "index_profiles_table_participant_id");
        ekgiVar2.i("contact_lookup_key", "index_profiles_table_contact_lookup_key");
        ekgiVar2.i("phone_number", "index_profiles_table_phone_number");
        ekgiVar2.c();
        c = new bstj();
        d = new int[]{59710, 59730, 59940, 60170, 60200, 60340, 60400};
    }

    public static final bsun a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("profiles_table._id");
            ekfwVar.h("profiles_table.participant_id");
            if (numC.intValue() >= 60170) {
                ekfwVar.h("profiles_table.person_id");
            }
            if (numC.intValue() >= 60170) {
                ekfwVar.h("profiles_table.profile_access_token");
            }
            if (numC.intValue() >= 60200) {
                ekfwVar.h("profiles_table.sending_self_profile_interaction_state");
            }
            if (numC.intValue() >= 60340) {
                ekfwVar.h("profiles_table.self_profile_sharing_metadata");
            }
            ekfwVar.h("profiles_table.first_name");
            ekfwVar.h("profiles_table.last_name");
            ekfwVar.h("profiles_table.display_name");
            ekfwVar.h("profiles_table.photo_uri");
            if (numC.intValue() >= 60170) {
                ekfwVar.h("profiles_table.sender_last_updated_time");
            }
            if (numC.intValue() >= 60200) {
                ekfwVar.h("profiles_table.sender_last_updated_time_from_rcs");
            }
            ekfwVar.h("profiles_table.contact_lookup_key");
            ekfwVar.h("profiles_table.phone_number");
            if (numC.intValue() >= 60400) {
                ekfwVar.h("profiles_table.is_self_profile_shareable");
            }
            if (numC.intValue() >= 60170) {
                ekfwVar.h("profiles_table.has_shared_access_token_with_user");
            }
            ekfwVar.h("profiles_table.name_timestamp");
            ekfwVar.h("profiles_table.photo_timestamp");
            if (numC.intValue() >= 59940) {
                ekfwVar.h("profiles_table.belongs_to_self_gaia");
            }
            if (numC.intValue() >= 59940) {
                ekfwVar.h("profiles_table.gaia_update_timestamp");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new bsun(strArr);
    }

    public static dqsy b() {
        return dqru.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(f().a());
    }

    public static Object d(String str, dqsh dqshVar, dqsf dqsfVar, dqsg dqsgVar) {
        return dqru.g(b(), str, dqshVar, dqsfVar, dqsgVar);
    }

    public static void e(dqsy dqsyVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_id INTEGER REFERENCES participants(_id) ON DELETE CASCADE ");
        if (i >= 60170) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("person_id TEXT");
        }
        if (i >= 60170) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("profile_access_token TEXT");
        }
        if (i >= 60200) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("sending_self_profile_interaction_state INTEGER DEFAULT(0)");
        }
        if (i >= 60340) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("self_profile_sharing_metadata BLOB");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("first_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("display_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("photo_uri TEXT");
        if (i >= 60170) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("sender_last_updated_time TEXT");
        }
        if (i >= 60200) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("sender_last_updated_time_from_rcs TEXT");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("contact_lookup_key TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("phone_number TEXT NOT NULL");
        if (i >= 60400) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("is_self_profile_shareable INT DEFAULT(1)");
        }
        if (i >= 60170) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("has_shared_access_token_with_user INTEGER DEFAULT(0)");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("name_timestamp INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("photo_timestamp INT DEFAULT(0)");
        if (i >= 59940) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("belongs_to_self_gaia INT DEFAULT(0)");
        }
        if (i >= 59940) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("gaia_update_timestamp INT DEFAULT(0)");
        }
        sb.insert(0, "CREATE TABLE profiles_table (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_profiles_table_contact_lookup_key");
        arrayList.add("CREATE INDEX index_profiles_table_contact_lookup_key ON profiles_table(contact_lookup_key) WHERE contact_lookup_key NOT NULL;");
        arrayList.add("DROP INDEX IF EXISTS index_profiles_table_phone_number");
        arrayList.add("CREATE INDEX index_profiles_table_phone_number ON profiles_table(phone_number);");
        if (i >= 59730) {
            arrayList.add("DROP INDEX IF EXISTS index_profiles_table_participant_id");
            arrayList.add("CREATE INDEX index_profiles_table_participant_id ON profiles_table(participant_id) WHERE participant_id NOT NULL;");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }

    public static dqxa f() {
        return b().M();
    }
}
