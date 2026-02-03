package com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import defpackage.a;
import defpackage.alwm;
import defpackage.anuc;
import defpackage.axcm;
import defpackage.axcn;
import defpackage.axjs;
import defpackage.bbaj;
import defpackage.bbam;
import defpackage.bban;
import defpackage.brvj;
import defpackage.brvk;
import defpackage.brvp;
import defpackage.brvq;
import defpackage.brzh;
import defpackage.brzi;
import defpackage.brzj;
import defpackage.bsbe;
import defpackage.bsbm;
import defpackage.bsbo;
import defpackage.bsbs;
import defpackage.bsbx;
import defpackage.bvdz;
import defpackage.chpm;
import defpackage.chpq;
import defpackage.cpyi;
import defpackage.dqpd;
import defpackage.dqpf;
import defpackage.dqqe;
import defpackage.dqqj;
import defpackage.dqru;
import defpackage.dqsi;
import defpackage.dqsy;
import defpackage.dqxa;
import defpackage.dqxl;
import defpackage.dqxp;
import defpackage.ehli;
import defpackage.ekfw;
import defpackage.ekgb;
import defpackage.ekgi;
import defpackage.ekgp;
import defpackage.evrr;
import defpackage.evsn;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ParticipantsTable extends dqsi {
    public static final String[] a = {"participants._id", "participants.my_identity_token", "participants.my_identity_token_foreign_key", "participants.sub_id", "participants.sim_slot_id", "participants.normalized_destination", "participants.send_destination", "participants.display_destination", "participants.comparable_destination", "participants.country_code", "participants.recipient_id", "participants.recipient_canonical_address", "participants.full_name", "participants.first_name", "participants.profile_photo_uri", "participants.contact_photo_uri", "participants.contact_id", "participants.lookup_key", "participants.color_palette_index", "participants.color_type", "participants.extended_color", "participants.blocked", "participants.subscription_name", "participants.subscription_color", "participants.contact_destination", "participants.participant_type", "participants.video_reachability", "participants.alias", "participants.is_spam", "participants.is_spam_source", "participants.cms_id", "participants.latest_verification_status", "participants.profile_photo_blob_id", "participants.profile_photo_encryption_key", "participants.directory_id", "participants.is_check_constraint_enabled_via_phenotype", "participants.is_valid_phone_number_data", "participants.duplicate_of", "participants.cms_life_cycle", "participants.norm_ui_status", "participants.last_modified_by_key", "participants.name_source", "participants.photo_source", "participants.profile_photo_user_preference", "participants.contact_metadata", "participants.is_enterprise_contact"};
    public static final ekgp b;
    public static final brzh c;
    public static final int[] d;
    public static final int[] e;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("participants.my_identity_token", 59930);
        ekgiVar.i("participants.my_identity_token_foreign_key", 60160);
        ekgiVar.i("participants.sim_slot_id", 2000);
        ekgiVar.i("participants.comparable_destination", 54040);
        ekgiVar.i("participants.country_code", 54040);
        ekgiVar.i("participants.recipient_id", 58090);
        ekgiVar.i("participants.recipient_canonical_address", 58090);
        ekgiVar.i("participants.contact_photo_uri", 59850);
        ekgiVar.i("participants.color_type", 1000);
        ekgiVar.i("participants.extended_color", 10027);
        ekgiVar.i("participants.subscription_name", 2000);
        ekgiVar.i("participants.subscription_color", 2000);
        ekgiVar.i("participants.contact_destination", 4000);
        ekgiVar.i("participants.participant_type", 12001);
        ekgiVar.i("participants.video_reachability", 13050);
        ekgiVar.i("participants.alias", 20060);
        ekgiVar.i("participants.is_spam", 24060);
        ekgiVar.i("participants.is_spam_source", 30000);
        ekgiVar.i("participants.cms_id", 31020);
        ekgiVar.i("participants.latest_verification_status", 31030);
        ekgiVar.i("participants.profile_photo_blob_id", 33000);
        ekgiVar.i("participants.profile_photo_encryption_key", 33060);
        ekgiVar.i("participants.directory_id", 35010);
        ekgiVar.i("participants.is_check_constraint_enabled_via_phenotype", 55010);
        ekgiVar.i("participants.is_valid_phone_number_data", 55010);
        ekgiVar.i("participants.duplicate_of", 58090);
        ekgiVar.i("participants.cms_life_cycle", 58210);
        ekgiVar.i("participants.norm_ui_status", 58620);
        ekgiVar.i("participants.last_modified_by_key", 59440);
        ekgiVar.i("participants.name_source", 59550);
        ekgiVar.i("participants.photo_source", 59550);
        ekgiVar.i("participants.profile_photo_user_preference", 60060);
        ekgiVar.i("participants.contact_metadata", 60070);
        ekgiVar.i("participants.is_enterprise_contact", 60640);
        b = ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("my_identity_token", "index_participants_my_identity_token");
        ekgiVar2.i("my_identity_token_foreign_key", "index_participants_my_identity_token_foreign_key");
        ekgiVar2.i("sub_id", "index_participants_sub_id");
        ekgiVar2.i("comparable_destination", "index_participants_comparable_destination");
        ekgiVar2.i("recipient_id", "index_participants_recipient_id");
        ekgiVar2.i("blocked", "index_participants_blocked_is_one");
        ekgiVar2.i("cms_id", "index_participants_cms_id");
        ekgiVar2.i("latest_verification_status", "index_participants_latest_verification_status_is_not_zero");
        ekgiVar2.i("duplicate_of", "index_participants_duplicate_of");
        ekgiVar2.i("is_enterprise_contact", "index_participants_is_enterprise_contact");
        ekgiVar2.c();
        c = new brzh();
        d = new int[]{1000, 2000, 4000, 10027, 12001, 13050, 20060, 24060, 29030, 30000, 31020, 31030, 33000, 33060, 35010, 54040, 55010, 58090, 58190, 58200, 58210, 58620, 59160, 59300, 59440, 59550, 59850, 59930, 60060, 60070, 60160, 60640};
        e = new int[]{57070};
    }

    public static BindData a(String str) {
        bsbo bsboVarE = e();
        bsboVarE.A("participants.queryOnCmsId");
        bsboVarE.q();
        bsbx bsbxVar = new bsbx();
        bsbxVar.d(str);
        bsboVarE.g(bsbxVar);
        return (BindData) dqru.c(bsboVarE.b());
    }

    public static BindData b(String str) {
        bsbo bsboVarE = e();
        bsboVarE.A("participants.queryOnId");
        bsboVarE.q();
        bsbx bsbxVar = new bsbx();
        bsbxVar.k(str);
        bsboVarE.g(bsbxVar);
        return (BindData) dqru.c(bsboVarE.b());
    }

    public static BindData c(String str) {
        BindData bindDataB = b(str);
        if (bindDataB != null) {
            return bindDataB;
        }
        throw new IllegalStateException("row not found");
    }

    public static brvp d() {
        brvq brvqVar = new brvq();
        brvqVar.aF();
        return brvqVar;
    }

    public static final bsbo e() {
        String[] strArr;
        Integer numI = i();
        if (numI.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("participants._id");
            if (numI.intValue() >= 59930) {
                ekfwVar.h("participants.my_identity_token");
            }
            if (numI.intValue() >= 60160) {
                ekfwVar.h("participants.my_identity_token_foreign_key");
            }
            ekfwVar.h("participants.sub_id");
            if (numI.intValue() >= 2000) {
                ekfwVar.h("participants.sim_slot_id");
            }
            ekfwVar.h("participants.normalized_destination");
            ekfwVar.h("participants.send_destination");
            ekfwVar.h("participants.display_destination");
            if (numI.intValue() >= 54040) {
                ekfwVar.h("participants.comparable_destination");
            }
            if (numI.intValue() >= 54040) {
                ekfwVar.h("participants.country_code");
            }
            if (numI.intValue() >= 58090) {
                ekfwVar.h("participants.recipient_id");
            }
            if (numI.intValue() >= 58090) {
                ekfwVar.h("participants.recipient_canonical_address");
            }
            ekfwVar.h("participants.full_name");
            ekfwVar.h("participants.first_name");
            ekfwVar.h("participants.profile_photo_uri");
            if (numI.intValue() >= 59850) {
                ekfwVar.h("participants.contact_photo_uri");
            }
            ekfwVar.h("participants.contact_id");
            ekfwVar.h("participants.lookup_key");
            ekfwVar.h("participants.color_palette_index");
            if (numI.intValue() >= 1000) {
                ekfwVar.h("participants.color_type");
            }
            if (numI.intValue() >= 10027) {
                ekfwVar.h("participants.extended_color");
            }
            ekfwVar.h("participants.blocked");
            if (numI.intValue() >= 2000) {
                ekfwVar.h("participants.subscription_name");
            }
            if (numI.intValue() >= 2000) {
                ekfwVar.h("participants.subscription_color");
            }
            if (numI.intValue() >= 4000) {
                ekfwVar.h("participants.contact_destination");
            }
            if (numI.intValue() >= 12001) {
                ekfwVar.h("participants.participant_type");
            }
            if (numI.intValue() >= 13050) {
                ekfwVar.h("participants.video_reachability");
            }
            if (numI.intValue() >= 20060) {
                ekfwVar.h("participants.alias");
            }
            if (numI.intValue() >= 24060) {
                ekfwVar.h("participants.is_spam");
            }
            if (numI.intValue() >= 30000) {
                ekfwVar.h("participants.is_spam_source");
            }
            if (numI.intValue() >= 31020) {
                ekfwVar.h("participants.cms_id");
            }
            if (numI.intValue() >= 31030) {
                ekfwVar.h("participants.latest_verification_status");
            }
            if (numI.intValue() >= 33000) {
                ekfwVar.h("participants.profile_photo_blob_id");
            }
            if (numI.intValue() >= 33060) {
                ekfwVar.h("participants.profile_photo_encryption_key");
            }
            if (numI.intValue() >= 35010) {
                ekfwVar.h("participants.directory_id");
            }
            if (numI.intValue() >= 55010) {
                ekfwVar.h("participants.is_check_constraint_enabled_via_phenotype");
            }
            if (numI.intValue() >= 55010) {
                ekfwVar.h("participants.is_valid_phone_number_data");
            }
            if (numI.intValue() >= 58090) {
                ekfwVar.h("participants.duplicate_of");
            }
            if (numI.intValue() >= 58210) {
                ekfwVar.h("participants.cms_life_cycle");
            }
            if (numI.intValue() >= 58620) {
                ekfwVar.h("participants.norm_ui_status");
            }
            if (numI.intValue() >= 59440) {
                ekfwVar.h("participants.last_modified_by_key");
            }
            if (numI.intValue() >= 59550) {
                ekfwVar.h("participants.name_source");
            }
            if (numI.intValue() >= 59550) {
                ekfwVar.h("participants.photo_source");
            }
            if (numI.intValue() >= 60060) {
                ekfwVar.h("participants.profile_photo_user_preference");
            }
            if (numI.intValue() >= 60070) {
                ekfwVar.h("participants.contact_metadata");
            }
            if (numI.intValue() >= 60640) {
                ekfwVar.h("participants.is_enterprise_contact");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new bsbo(strArr);
    }

    public static bsbs f() {
        bsbs bsbsVar = new bsbs();
        if (i().intValue() >= 59440) {
            bbaj bbajVarB = bbam.b();
            int iIntValue = i().intValue();
            int iIntValue2 = i().intValue();
            if (iIntValue2 < 59440) {
                dqru.x("last_modified_by_key", iIntValue2);
            }
            if (iIntValue >= 59440) {
                bsbsVar.a.put("last_modified_by_key", bbam.c(bbajVarB));
            }
            bsbsVar.e.b().c("last_modified_by_key");
        }
        return bsbsVar;
    }

    public static dqsy g() {
        return dqru.e("$primary");
    }

    public static Optional h(String str) {
        return Optional.ofNullable(b(str));
    }

    public static Integer i() {
        return Integer.valueOf(p().a());
    }

    public static Object j(String str, Function function, Supplier supplier) {
        BindData bindDataA = a(str);
        return bindDataA != null ? function.apply(bindDataA) : supplier.get();
    }

    public static Object k(String str, Function function) {
        BindData bindDataB = b(str);
        if (bindDataB != null) {
            return function.apply(bindDataB);
        }
        return null;
    }

    public static Object l(String str, Function function, Supplier supplier) {
        BindData bindDataB = b(str);
        return bindDataB != null ? function.apply(bindDataB) : supplier.get();
    }

    public static String m(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (i >= 59930) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("my_identity_token TEXT");
        }
        if (i >= 60160) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("my_identity_token_foreign_key TEXT REFERENCES my_identities(token) ON DELETE NO ACTION ON UPDATE CASCADE");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sub_id INT DEFAULT(-2)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sim_slot_id INT DEFAULT(-1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("normalized_destination TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("send_destination TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("display_destination TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("comparable_destination TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("country_code TEXT");
        if (i >= 58090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("recipient_id INTEGER");
        }
        if (i >= 58090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("recipient_canonical_address TEXT");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("full_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("first_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("profile_photo_uri TEXT");
        if (i >= 59850) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("contact_photo_uri TEXT");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("contact_id INT DEFAULT(-1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("lookup_key TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("color_palette_index INT DEFAULT(-1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("color_type INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("extended_color INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("blocked INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("subscription_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("subscription_color INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("contact_destination TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_type INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("video_reachability INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("alias TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_spam INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_rcs_available INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_spam_source INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("latest_verification_status INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("profile_photo_blob_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("profile_photo_encryption_key BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("directory_id INT DEFAULT(-1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_check_constraint_enabled_via_phenotype INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_valid_phone_number_data INT DEFAULT(1)");
        if (i >= 58090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("duplicate_of INTEGER REFERENCES participants(_id)  ");
        }
        if (i >= 58210) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("cms_life_cycle INT DEFAULT(0)");
        }
        if (i >= 58620) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("norm_ui_status INT DEFAULT(1)");
        }
        if (i >= 59440) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("last_modified_by_key TEXT");
        }
        if (i >= 59550) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("name_source INT DEFAULT(1)");
        }
        if (i >= 59550) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("photo_source INT DEFAULT(1)");
        }
        if (i >= 60060) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("profile_photo_user_preference INT DEFAULT(1)");
        }
        if (i >= 60070) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("contact_metadata BLOB");
        }
        if (i >= 60640) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("is_enterprise_contact INT");
        }
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(", UNIQUE(normalized_destination,sub_id) ON CONFLICT FAIL");
        sb.append(", CHECK (" + new dqxl("(NOT $R) OR (NOT $R) OR $R <> -2 OR ( $R IS NOT NULL AND $R IS NOT NULL AND $R IS NOT NULL  AND length($R) > 0 AND length($R) > 0 AND length($R) > 0 )", new Object[]{"is_valid_phone_number_data", "is_check_constraint_enabled_via_phenotype", "sub_id", "normalized_destination", "display_destination", "send_destination", "normalized_destination", "display_destination", "send_destination"}).ai(dqxp.b()) + ")");
        sb.append(");");
        return sb.toString();
    }

    public static void n(dqsy dqsyVar, int i) {
        dqru.K(dqsyVar, "participants", m(i, "TEMP___participants"), a, o(i));
    }

    public static String[] o(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_participants_cms_id");
        arrayList.add("CREATE UNIQUE INDEX index_participants_cms_id ON participants(cms_id);");
        if (i >= 58090) {
            arrayList.add("DROP INDEX IF EXISTS index_participants_comparable_destination");
            arrayList.add("CREATE UNIQUE INDEX index_participants_comparable_destination ON participants(comparable_destination);");
        }
        if (i >= 58090) {
            arrayList.add("DROP INDEX IF EXISTS index_participants_recipient_id");
            arrayList.add("CREATE UNIQUE INDEX index_participants_recipient_id ON participants(recipient_id);");
        }
        if (i >= 58190) {
            arrayList.add("DROP INDEX IF EXISTS index_participants_latest_verification_status_is_not_zero");
            arrayList.add("CREATE INDEX index_participants_latest_verification_status_is_not_zero ON participants(latest_verification_status) WHERE latest_verification_status <> 0;");
        }
        if (i >= 58200) {
            arrayList.add("DROP INDEX IF EXISTS index_participants_blocked_is_one");
            arrayList.add("CREATE INDEX index_participants_blocked_is_one ON participants(blocked) WHERE blocked = 1;");
        }
        if (i >= 59160) {
            arrayList.add("DROP INDEX IF EXISTS index_participants_duplicate_of");
            arrayList.add("CREATE INDEX index_participants_duplicate_of ON participants(duplicate_of) WHERE duplicate_of NOT NULL;");
        }
        if (i >= 59300) {
            arrayList.add("DROP INDEX IF EXISTS index_participants_sub_id");
            arrayList.add("CREATE INDEX index_participants_sub_id ON participants(sub_id);");
        }
        if (i >= 59930) {
            arrayList.add("DROP INDEX IF EXISTS index_participants_my_identity_token");
            arrayList.add("CREATE INDEX index_participants_my_identity_token ON participants(my_identity_token);");
        }
        if (i >= 60160) {
            arrayList.add("DROP INDEX IF EXISTS index_participants_my_identity_token_foreign_key");
            arrayList.add("CREATE INDEX index_participants_my_identity_token_foreign_key ON participants(my_identity_token_foreign_key);");
        }
        if (i >= 60640) {
            arrayList.add("DROP INDEX IF EXISTS index_participants_is_enterprise_contact");
            arrayList.add("CREATE INDEX index_participants_is_enterprise_contact ON participants(is_enterprise_contact);");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static dqxa p() {
        return g().M();
    }

    /* compiled from: PG */
    public static abstract class BindData extends dqpd<brzj, bsbm, bsbo, BindData, brzi> implements Parcelable, dqpf {
        public static final Parcelable.Creator<BindData> CREATOR = new brvj();
        public String B;
        public String E;
        public String G;
        public byte[] H;
        public String L;
        public chpq P;
        public chpq Q;
        public chpm R;
        public anuc S;
        public boolean T;
        public String a;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        public long k;
        public String l;
        public String m;
        public String n;
        public Uri o;
        public Uri p;
        public String r;
        public String w;
        public String y;
        public axcm b = null;
        public axcm c = null;
        public int d = -2;
        public int e = -1;
        public long q = -1;
        public int s = -1;
        public int t = 0;
        public int u = 0;
        public boolean v = false;
        public int x = 0;
        public int z = 0;
        public int A = 0;
        public boolean C = false;
        public int D = 0;
        public bvdz F = bvdz.VERIFICATION_NA;
        public long I = -1;
        public boolean J = axjs.a();
        public boolean K = true;
        public cpyi M = cpyi.UNKNOWN;
        public alwm N = alwm.NOT_MODIFIED;
        public bbaj O = bban.a();

        protected BindData() {
            chpq chpqVar = chpq.PROFILE_CONTACT_SOURCE;
            this.P = chpqVar;
            this.Q = chpqVar;
            this.R = chpm.PREFER_PROFILE_PHOTO;
        }

        public final axcm A() {
            aA(1, "my_identity_token");
            return this.b;
        }

        public final axcm B() {
            aA(2, "my_identity_token_foreign_key");
            return this.c;
        }

        public final brvp C() {
            brvq brvqVar = new brvq();
            BitSet bitSet = this.cL;
            brvqVar.az = bitSet == null ? null : (BitSet) bitSet.clone();
            BitSet bitSet2 = brvqVar.az;
            if (bitSet2 == null || bitSet2.get(0)) {
                brvqVar.a = R();
            }
            BitSet bitSet3 = brvqVar.az;
            if (bitSet3 == null || bitSet3.get(1)) {
                brvqVar.b = A();
            }
            BitSet bitSet4 = brvqVar.az;
            if (bitSet4 == null || bitSet4.get(2)) {
                brvqVar.c = B();
            }
            BitSet bitSet5 = brvqVar.az;
            if (bitSet5 == null || bitSet5.get(3)) {
                brvqVar.d = r();
            }
            BitSet bitSet6 = brvqVar.az;
            if (bitSet6 == null || bitSet6.get(4)) {
                brvqVar.e = q();
            }
            BitSet bitSet7 = brvqVar.az;
            if (bitSet7 == null || bitSet7.get(5)) {
                brvqVar.f = T();
            }
            BitSet bitSet8 = brvqVar.az;
            if (bitSet8 == null || bitSet8.get(6)) {
                brvqVar.g = V();
            }
            BitSet bitSet9 = brvqVar.az;
            if (bitSet9 == null || bitSet9.get(7)) {
                brvqVar.h = O();
            }
            BitSet bitSet10 = brvqVar.az;
            if (bitSet10 == null || bitSet10.get(8)) {
                brvqVar.i = M();
            }
            BitSet bitSet11 = brvqVar.az;
            if (bitSet11 == null || bitSet11.get(9)) {
                aA(9, "country_code");
                brvqVar.j = this.j;
            }
            BitSet bitSet12 = brvqVar.az;
            if (bitSet12 == null || bitSet12.get(10)) {
                aA(10, "recipient_id");
                brvqVar.k = this.k;
            }
            BitSet bitSet13 = brvqVar.az;
            if (bitSet13 == null || bitSet13.get(11)) {
                aA(11, "recipient_canonical_address");
                brvqVar.l = this.l;
            }
            BitSet bitSet14 = brvqVar.az;
            if (bitSet14 == null || bitSet14.get(12)) {
                brvqVar.m = Q();
            }
            BitSet bitSet15 = brvqVar.az;
            if (bitSet15 == null || bitSet15.get(13)) {
                brvqVar.n = P();
            }
            BitSet bitSet16 = brvqVar.az;
            if (bitSet16 == null || bitSet16.get(14)) {
                brvqVar.o = x();
            }
            BitSet bitSet17 = brvqVar.az;
            if (bitSet17 == null || bitSet17.get(15)) {
                brvqVar.p = w();
            }
            BitSet bitSet18 = brvqVar.az;
            if (bitSet18 == null || bitSet18.get(16)) {
                brvqVar.q = u();
            }
            BitSet bitSet19 = brvqVar.az;
            if (bitSet19 == null || bitSet19.get(17)) {
                brvqVar.r = S();
            }
            BitSet bitSet20 = brvqVar.az;
            if (bitSet20 == null || bitSet20.get(18)) {
                brvqVar.s = k();
            }
            BitSet bitSet21 = brvqVar.az;
            if (bitSet21 == null || bitSet21.get(19)) {
                brvqVar.t = m();
            }
            BitSet bitSet22 = brvqVar.az;
            if (bitSet22 == null || bitSet22.get(20)) {
                brvqVar.u = n();
            }
            BitSet bitSet23 = brvqVar.az;
            if (bitSet23 == null || bitSet23.get(21)) {
                brvqVar.v = X();
            }
            BitSet bitSet24 = brvqVar.az;
            if (bitSet24 == null || bitSet24.get(22)) {
                brvqVar.w = W();
            }
            BitSet bitSet25 = brvqVar.az;
            if (bitSet25 == null || bitSet25.get(23)) {
                brvqVar.x = s();
            }
            BitSet bitSet26 = brvqVar.az;
            if (bitSet26 == null || bitSet26.get(24)) {
                brvqVar.y = N();
            }
            BitSet bitSet27 = brvqVar.az;
            if (bitSet27 == null || bitSet27.get(25)) {
                brvqVar.z = p();
            }
            BitSet bitSet28 = brvqVar.az;
            if (bitSet28 == null || bitSet28.get(26)) {
                brvqVar.A = t();
            }
            BitSet bitSet29 = brvqVar.az;
            if (bitSet29 == null || bitSet29.get(27)) {
                brvqVar.B = K();
            }
            BitSet bitSet30 = brvqVar.az;
            if (bitSet30 == null || bitSet30.get(28)) {
                brvqVar.C = aa();
            }
            BitSet bitSet31 = brvqVar.az;
            if (bitSet31 == null || bitSet31.get(29)) {
                brvqVar.D = o();
            }
            BitSet bitSet32 = brvqVar.az;
            if (bitSet32 == null || bitSet32.get(30)) {
                brvqVar.E = L();
            }
            BitSet bitSet33 = brvqVar.az;
            if (bitSet33 == null || bitSet33.get(31)) {
                brvqVar.F = D();
            }
            BitSet bitSet34 = brvqVar.az;
            if (bitSet34 == null || bitSet34.get(32)) {
                brvqVar.G = U();
            }
            BitSet bitSet35 = brvqVar.az;
            if (bitSet35 == null || bitSet35.get(33)) {
                brvqVar.H = ac();
            }
            BitSet bitSet36 = brvqVar.az;
            if (bitSet36 == null || bitSet36.get(34)) {
                brvqVar.I = v();
            }
            BitSet bitSet37 = brvqVar.az;
            if (bitSet37 == null || bitSet37.get(35)) {
                brvqVar.J = Y();
            }
            BitSet bitSet38 = brvqVar.az;
            if (bitSet38 == null || bitSet38.get(36)) {
                brvqVar.K = ab();
            }
            BitSet bitSet39 = brvqVar.az;
            if (bitSet39 == null || bitSet39.get(37)) {
                aA(37, "duplicate_of");
                brvqVar.L = this.L;
            }
            BitSet bitSet40 = brvqVar.az;
            if (bitSet40 == null || bitSet40.get(38)) {
                brvqVar.M = H();
            }
            BitSet bitSet41 = brvqVar.az;
            if (bitSet41 == null || bitSet41.get(39)) {
                brvqVar.N = y();
            }
            BitSet bitSet42 = brvqVar.az;
            if (bitSet42 == null || bitSet42.get(40)) {
                aA(40, "last_modified_by_key");
                brvqVar.O = this.O;
            }
            BitSet bitSet43 = brvqVar.az;
            if (bitSet43 == null || bitSet43.get(41)) {
                brvqVar.P = F();
            }
            BitSet bitSet44 = brvqVar.az;
            if (bitSet44 == null || bitSet44.get(42)) {
                brvqVar.Q = G();
            }
            BitSet bitSet45 = brvqVar.az;
            if (bitSet45 == null || bitSet45.get(43)) {
                brvqVar.R = E();
            }
            BitSet bitSet46 = brvqVar.az;
            if (bitSet46 == null || bitSet46.get(44)) {
                brvqVar.S = z();
            }
            BitSet bitSet47 = brvqVar.az;
            if (bitSet47 != null && !bitSet47.get(45)) {
                return brvqVar;
            }
            brvqVar.T = Z();
            return brvqVar;
        }

        public final bvdz D() {
            aA(31, "latest_verification_status");
            return this.F;
        }

        public final chpm E() {
            aA(43, "profile_photo_user_preference");
            return this.R;
        }

        public final chpq F() {
            aA(41, "name_source");
            return this.P;
        }

        public final chpq G() {
            aA(42, "photo_source");
            return this.Q;
        }

        public final cpyi H() {
            aA(38, "cms_life_cycle");
            return this.M;
        }

        @Deprecated
        public final Long I() {
            final dqsy dqsyVarG = ParticipantsTable.g();
            return Long.valueOf(dqru.b(ParticipantsTable.g(), "participants", this, new Function() { // from class: brvi
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(dqsyVarG.O("participants", (dqst) obj));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Consumer() { // from class: brvf
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    Long l = (Long) obj;
                    if (l.longValue() >= 0) {
                        ParticipantsTable.BindData bindData = this.a;
                        bindData.a = String.valueOf(l);
                        bindData.fN(0);
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }));
        }

        public final Long J() {
            final dqsy dqsyVarG = ParticipantsTable.g();
            return Long.valueOf(dqru.b(ParticipantsTable.g(), "participants", this, new Function() { // from class: brvg
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(dqsyVarG.P("participants", (dqst) obj));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Consumer() { // from class: brvh
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    Long l = (Long) obj;
                    if (l.longValue() >= 0) {
                        ParticipantsTable.BindData bindData = this.a;
                        bindData.a = String.valueOf(l);
                        bindData.fN(0);
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }));
        }

        public final String K() {
            aA(27, "alias");
            return this.B;
        }

        public final String L() {
            aA(30, "cms_id");
            return this.E;
        }

        public final String M() {
            aA(8, "comparable_destination");
            return this.i;
        }

        public final String N() {
            aA(24, "contact_destination");
            return this.y;
        }

        public final String O() {
            aA(7, "display_destination");
            return this.h;
        }

        public final String P() {
            aA(13, "first_name");
            return this.n;
        }

        public final String Q() {
            aA(12, "full_name");
            return this.m;
        }

        public final String R() {
            aA(0, "_id");
            return this.a;
        }

        public final String S() {
            aA(17, "lookup_key");
            return this.r;
        }

        public final String T() {
            aA(5, "normalized_destination");
            return this.f;
        }

        public final String U() {
            aA(32, "profile_photo_blob_id");
            return this.G;
        }

        public final String V() {
            aA(6, "send_destination");
            return this.g;
        }

        public final String W() {
            aA(22, "subscription_name");
            return this.w;
        }

        public final boolean X() {
            aA(21, "blocked");
            return this.v;
        }

        public final boolean Y() {
            aA(35, "is_check_constraint_enabled_via_phenotype");
            return this.J;
        }

        public final boolean Z() {
            aA(45, "is_enterprise_contact");
            return this.T;
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
            byte[] bArr = this.H;
            return String.format(locale, "ParticipantsTable [_id: %s,\n  my_identity_token: %s,\n  my_identity_token_foreign_key: %s,\n  sub_id: %s,\n  sim_slot_id: %s,\n  normalized_destination: %s,\n  send_destination: %s,\n  display_destination: %s,\n  comparable_destination: %s,\n  country_code: %s,\n  recipient_id: %s,\n  recipient_canonical_address: %s,\n  full_name: %s,\n  first_name: %s,\n  profile_photo_uri: %s,\n  contact_photo_uri: %s,\n  contact_id: %s,\n  lookup_key: %s,\n  color_palette_index: %s,\n  color_type: %s,\n  extended_color: %s,\n  blocked: %s,\n  subscription_name: %s,\n  subscription_color: %s,\n  contact_destination: %s,\n  participant_type: %s,\n  video_reachability: %s,\n  alias: %s,\n  is_spam: %s,\n  is_spam_source: %s,\n  cms_id: %s,\n  latest_verification_status: %s,\n  profile_photo_blob_id: %s,\n  profile_photo_encryption_key: %s,\n  directory_id: %s,\n  is_check_constraint_enabled_via_phenotype: %s,\n  is_valid_phone_number_data: %s,\n  duplicate_of: %s,\n  cms_life_cycle: %s,\n  norm_ui_status: %s,\n  last_modified_by_key: %s,\n  name_source: %s,\n  photo_source: %s,\n  profile_photo_user_preference: %s,\n  contact_metadata: %s,\n  is_enterprise_contact: %s\n]\n", strValueOf, strValueOf2, strValueOf3, strValueOf4, strValueOf5, strValueOf6, strValueOf7, strValueOf8, strValueOf9, strValueOf10, strValueOf11, strValueOf12, strValueOf13, strValueOf14, strValueOf15, strValueOf16, strValueOf17, strValueOf18, strValueOf19, strValueOf20, strValueOf21, strValueOf22, strValueOf23, strValueOf24, strValueOf25, strValueOf26, strValueOf27, strValueOf28, strValueOf29, strValueOf30, strValueOf31, strValueOf32, strValueOf33, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")), String.valueOf(this.I), String.valueOf(this.J), String.valueOf(this.K), String.valueOf(this.L), String.valueOf(this.M), String.valueOf(this.N), String.valueOf(this.O), String.valueOf(this.P), String.valueOf(this.Q), String.valueOf(this.R), String.valueOf(this.S), String.valueOf(this.T));
        }

        public final boolean aa() {
            aA(28, "is_spam");
            return this.C;
        }

        public final boolean ab() {
            aA(36, "is_valid_phone_number_data");
            return this.K;
        }

        public final byte[] ac() {
            aA(33, "profile_photo_encryption_key");
            return this.H;
        }

        @Override // defpackage.dqpd
        public final void b(ContentValues contentValues) {
            int iIntValue = ParticipantsTable.i().intValue();
            if (iIntValue >= 59930) {
                axcm axcmVar = this.b;
                if (axcmVar == null) {
                    contentValues.putNull("my_identity_token");
                } else {
                    contentValues.put("my_identity_token", axcn.b(axcmVar));
                }
            }
            if (iIntValue >= 60160) {
                axcm axcmVar2 = this.c;
                if (axcmVar2 == null || axcmVar2.equals(null)) {
                    contentValues.putNull("my_identity_token_foreign_key");
                } else {
                    contentValues.put("my_identity_token_foreign_key", axcn.b(this.c));
                }
            }
            contentValues.put("sub_id", Integer.valueOf(this.d));
            if (iIntValue >= 2000) {
                contentValues.put("sim_slot_id", Integer.valueOf(this.e));
            }
            dqru.v(contentValues, "normalized_destination", this.f);
            dqru.v(contentValues, "send_destination", this.g);
            dqru.v(contentValues, "display_destination", this.h);
            if (iIntValue >= 54040) {
                dqru.v(contentValues, "comparable_destination", this.i);
            }
            if (iIntValue >= 54040) {
                dqru.v(contentValues, "country_code", this.j);
            }
            if (iIntValue >= 58090) {
                dqru.u(contentValues, "recipient_id", this.k);
            }
            if (iIntValue >= 58090) {
                dqru.v(contentValues, "recipient_canonical_address", this.l);
            }
            dqru.v(contentValues, "full_name", this.m);
            dqru.v(contentValues, "first_name", this.n);
            Uri uri = this.o;
            if (uri == null) {
                contentValues.putNull("profile_photo_uri");
            } else {
                contentValues.put("profile_photo_uri", uri.toString());
            }
            if (iIntValue >= 59850) {
                Uri uri2 = this.p;
                if (uri2 == null) {
                    contentValues.putNull("contact_photo_uri");
                } else {
                    contentValues.put("contact_photo_uri", uri2.toString());
                }
            }
            contentValues.put("contact_id", Long.valueOf(this.q));
            dqru.v(contentValues, "lookup_key", this.r);
            contentValues.put("color_palette_index", Integer.valueOf(this.s));
            if (iIntValue >= 1000) {
                contentValues.put("color_type", Integer.valueOf(this.t));
            }
            if (iIntValue >= 10027) {
                contentValues.put("extended_color", Integer.valueOf(this.u));
            }
            contentValues.put("blocked", Boolean.valueOf(this.v));
            if (iIntValue >= 2000) {
                dqru.v(contentValues, "subscription_name", this.w);
            }
            if (iIntValue >= 2000) {
                contentValues.put("subscription_color", Integer.valueOf(this.x));
            }
            if (iIntValue >= 4000) {
                dqru.v(contentValues, "contact_destination", this.y);
            }
            if (iIntValue >= 12001) {
                contentValues.put("participant_type", Integer.valueOf(this.z));
            }
            if (iIntValue >= 13050) {
                contentValues.put("video_reachability", Integer.valueOf(this.A));
            }
            if (iIntValue >= 20060) {
                dqru.v(contentValues, "alias", this.B);
            }
            if (iIntValue >= 24060) {
                contentValues.put("is_spam", Boolean.valueOf(this.C));
            }
            if (iIntValue >= 30000) {
                contentValues.put("is_spam_source", Integer.valueOf(this.D));
            }
            if (iIntValue >= 31020) {
                dqru.v(contentValues, "cms_id", this.E);
            }
            if (iIntValue >= 31030) {
                bvdz bvdzVar = this.F;
                if (bvdzVar == null) {
                    contentValues.putNull("latest_verification_status");
                } else {
                    contentValues.put("latest_verification_status", Integer.valueOf(bvdzVar.ordinal()));
                }
            }
            if (iIntValue >= 33000) {
                dqru.v(contentValues, "profile_photo_blob_id", this.G);
            }
            if (iIntValue >= 33060) {
                contentValues.put("profile_photo_encryption_key", this.H);
            }
            if (iIntValue >= 35010) {
                contentValues.put("directory_id", Long.valueOf(this.I));
            }
            if (iIntValue >= 55010) {
                contentValues.put("is_check_constraint_enabled_via_phenotype", Boolean.valueOf(this.J));
            }
            if (iIntValue >= 55010) {
                contentValues.put("is_valid_phone_number_data", Boolean.valueOf(this.K));
            }
            if (iIntValue >= 58090) {
                dqru.v(contentValues, "duplicate_of", this.L);
            }
            if (iIntValue >= 58210) {
                cpyi cpyiVar = this.M;
                if (cpyiVar == null) {
                    contentValues.putNull("cms_life_cycle");
                } else {
                    contentValues.put("cms_life_cycle", Integer.valueOf(cpyiVar.ordinal()));
                }
            }
            if (iIntValue >= 58620) {
                alwm alwmVar = this.N;
                if (alwmVar == null) {
                    contentValues.putNull("norm_ui_status");
                } else {
                    contentValues.put("norm_ui_status", Integer.valueOf(alwmVar.a()));
                }
            }
            if (iIntValue >= 59440) {
                bbaj bbajVar = this.O;
                if (bbajVar == null) {
                    contentValues.putNull("last_modified_by_key");
                } else {
                    contentValues.put("last_modified_by_key", bbam.c(bbajVar));
                }
            }
            if (iIntValue >= 59550) {
                chpq chpqVar = this.P;
                if (chpqVar == null) {
                    contentValues.putNull("name_source");
                } else {
                    contentValues.put("name_source", Integer.valueOf(chpqVar.a()));
                }
            }
            if (iIntValue >= 59550) {
                chpq chpqVar2 = this.Q;
                if (chpqVar2 == null) {
                    contentValues.putNull("photo_source");
                } else {
                    contentValues.put("photo_source", Integer.valueOf(chpqVar2.a()));
                }
            }
            if (iIntValue >= 60060) {
                chpm chpmVar = this.R;
                if (chpmVar == null) {
                    contentValues.putNull("profile_photo_user_preference");
                } else {
                    contentValues.put("profile_photo_user_preference", Integer.valueOf(chpmVar.a()));
                }
            }
            if (iIntValue >= 60070) {
                anuc anucVar = this.S;
                if (anucVar == null) {
                    contentValues.putNull("contact_metadata");
                } else {
                    contentValues.put("contact_metadata", anucVar.toByteArray());
                }
            }
            if (iIntValue >= 60640) {
                contentValues.put("is_enterprise_contact", Boolean.valueOf(this.T));
            }
        }

        @Override // defpackage.dqpd
        protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
            bsbe bsbeVar = (bsbe) ((brzj) dqqjVar);
            aC();
            this.cN = bsbeVar.cV();
            if (bsbeVar.dj(0)) {
                this.a = bsbeVar.o();
                fN(0);
            }
            if (bsbeVar.dj(1)) {
                this.b = bsbeVar.G();
                fN(1);
            }
            if (bsbeVar.dj(2)) {
                this.c = bsbeVar.H();
                fN(2);
            }
            if (bsbeVar.dj(3)) {
                this.d = bsbeVar.y();
                fN(3);
            }
            if (bsbeVar.dj(4)) {
                this.e = bsbeVar.x();
                fN(4);
            }
            if (bsbeVar.dj(5)) {
                this.f = bsbeVar.p();
                fN(5);
            }
            if (bsbeVar.dj(6)) {
                this.g = bsbeVar.q();
                fN(6);
            }
            if (bsbeVar.dj(7)) {
                this.h = bsbeVar.Q();
                fN(7);
            }
            if (bsbeVar.dj(8)) {
                this.i = bsbeVar.N();
                fN(8);
            }
            if (bsbeVar.dj(9)) {
                this.j = bsbeVar.P();
                fN(9);
            }
            if (bsbeVar.dj(10)) {
                this.k = bsbeVar.C();
                fN(10);
            }
            if (bsbeVar.dj(11)) {
                this.l = bsbeVar.W();
                fN(11);
            }
            if (bsbeVar.dj(12)) {
                this.m = bsbeVar.T();
                fN(12);
            }
            if (bsbeVar.dj(13)) {
                this.n = bsbeVar.S();
                fN(13);
            }
            if (bsbeVar.dj(14)) {
                this.o = bsbeVar.f();
                fN(14);
            }
            if (bsbeVar.dj(15)) {
                this.p = bsbeVar.D();
                fN(15);
            }
            if (bsbeVar.dj(16)) {
                this.q = bsbeVar.e();
                fN(16);
            }
            if (bsbeVar.dj(17)) {
                this.r = bsbeVar.U();
                fN(17);
            }
            if (bsbeVar.dj(18)) {
                this.s = bsbeVar.t();
                fN(18);
            }
            if (bsbeVar.dj(19)) {
                this.t = bsbeVar.u();
                fN(19);
            }
            if (bsbeVar.dj(20)) {
                this.u = bsbeVar.v();
                fN(20);
            }
            if (bsbeVar.dj(21)) {
                this.v = bsbeVar.r();
                fN(21);
            }
            if (bsbeVar.dj(22)) {
                this.w = bsbeVar.X();
                fN(22);
            }
            if (bsbeVar.dj(23)) {
                this.x = bsbeVar.z();
                fN(23);
            }
            if (bsbeVar.dj(24)) {
                this.y = bsbeVar.O();
                fN(24);
            }
            if (bsbeVar.dj(25)) {
                this.z = bsbeVar.w();
                fN(25);
            }
            if (bsbeVar.dj(26)) {
                this.A = bsbeVar.A();
                fN(26);
            }
            if (bsbeVar.dj(27)) {
                this.B = bsbeVar.L();
                fN(27);
            }
            if (bsbeVar.dj(28)) {
                this.C = bsbeVar.s();
                fN(28);
            }
            if (bsbeVar.dj(29)) {
                this.D = bsbeVar.c();
                fN(29);
            }
            if (bsbeVar.dj(30)) {
                this.E = bsbeVar.M();
                fN(30);
            }
            if (bsbeVar.dj(31)) {
                this.F = bsbeVar.g();
                fN(31);
            }
            if (bsbeVar.dj(32)) {
                this.G = bsbeVar.V();
                fN(32);
            }
            if (bsbeVar.dj(33)) {
                this.H = bsbeVar.ab();
                fN(33);
            }
            if (bsbeVar.dj(34)) {
                this.I = bsbeVar.B();
                fN(34);
            }
            if (bsbeVar.dj(35)) {
                this.J = bsbeVar.Y();
                fN(35);
            }
            if (bsbeVar.dj(36)) {
                this.K = bsbeVar.aa();
                fN(36);
            }
            if (bsbeVar.dj(37)) {
                this.L = bsbeVar.R();
                fN(37);
            }
            if (bsbeVar.dj(38)) {
                this.M = bsbeVar.i();
                fN(38);
            }
            if (bsbeVar.dj(39)) {
                this.N = bsbeVar.E();
                fN(39);
            }
            if (bsbeVar.dj(40)) {
                this.O = bsbeVar.I();
                fN(40);
            }
            if (bsbeVar.dj(41)) {
                this.P = bsbeVar.K();
                fN(41);
            }
            if (bsbeVar.dj(42)) {
                this.Q = bsbeVar.h();
                fN(42);
            }
            if (bsbeVar.dj(43)) {
                this.R = bsbeVar.J();
                fN(43);
            }
            if (bsbeVar.dj(44)) {
                this.S = bsbeVar.F();
                fN(44);
            }
            if (bsbeVar.dj(45)) {
                this.T = bsbeVar.Z();
                fN(45);
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
            return super.aE(bindData.cN) && Objects.equals(this.a, bindData.a) && Objects.equals(this.b, bindData.b) && Objects.equals(this.c, bindData.c) && this.d == bindData.d && this.e == bindData.e && Objects.equals(this.f, bindData.f) && Objects.equals(this.g, bindData.g) && Objects.equals(this.h, bindData.h) && Objects.equals(this.i, bindData.i) && Objects.equals(this.j, bindData.j) && this.k == bindData.k && Objects.equals(this.l, bindData.l) && Objects.equals(this.m, bindData.m) && Objects.equals(this.n, bindData.n) && Objects.equals(this.o, bindData.o) && Objects.equals(this.p, bindData.p) && this.q == bindData.q && Objects.equals(this.r, bindData.r) && this.s == bindData.s && this.t == bindData.t && this.u == bindData.u && this.v == bindData.v && Objects.equals(this.w, bindData.w) && this.x == bindData.x && Objects.equals(this.y, bindData.y) && this.z == bindData.z && this.A == bindData.A && Objects.equals(this.B, bindData.B) && this.C == bindData.C && this.D == bindData.D && Objects.equals(this.E, bindData.E) && this.F == bindData.F && Objects.equals(this.G, bindData.G) && Arrays.equals(this.H, bindData.H) && this.I == bindData.I && this.J == bindData.J && this.K == bindData.K && Objects.equals(this.L, bindData.L) && this.M == bindData.M && this.N == bindData.N && Objects.equals(this.O, bindData.O) && this.P == bindData.P && this.Q == bindData.Q && this.R == bindData.R && Objects.equals(this.S, bindData.S) && this.T == bindData.T;
        }

        @Override // defpackage.dqpf
        public final String f() {
            return String.format(Locale.US, "INTO %s (%s) VALUES ", "participants", dqru.m(new String[]{"my_identity_token", "my_identity_token_foreign_key", "sub_id", "sim_slot_id", "normalized_destination", "send_destination", "display_destination", "comparable_destination", "country_code", "recipient_id", "recipient_canonical_address", "full_name", "first_name", "profile_photo_uri", "contact_photo_uri", "contact_id", "lookup_key", "color_palette_index", "color_type", "extended_color", "blocked", "subscription_name", "subscription_color", "contact_destination", "participant_type", "video_reachability", "alias", "is_spam", "is_spam_source", "cms_id", "latest_verification_status", "profile_photo_blob_id", "profile_photo_encryption_key", "directory_id", "is_check_constraint_enabled_via_phenotype", "is_valid_phone_number_data", "duplicate_of", "cms_life_cycle", "norm_ui_status", "last_modified_by_key", "name_source", "photo_source", "profile_photo_user_preference", "contact_metadata", "is_enterprise_contact"}));
        }

        @Override // defpackage.dqpd
        protected final void fD(Parcel parcel) {
            anuc anucVar;
            this.a = parcel.readString();
            this.b = axcn.a(parcel.readString());
            this.c = axcn.a(parcel.readString());
            this.d = parcel.readInt();
            this.e = parcel.readInt();
            this.f = parcel.readString();
            this.g = parcel.readString();
            this.h = parcel.readString();
            this.i = parcel.readString();
            this.j = parcel.readString();
            this.k = parcel.readLong();
            this.l = parcel.readString();
            this.m = parcel.readString();
            this.n = parcel.readString();
            String string = parcel.readString();
            this.o = string == null ? null : Uri.parse(string);
            String string2 = parcel.readString();
            this.p = string2 == null ? null : Uri.parse(string2);
            this.q = parcel.readLong();
            this.r = parcel.readString();
            this.s = parcel.readInt();
            this.t = parcel.readInt();
            this.u = parcel.readInt();
            this.v = parcel.readInt() == 1;
            this.w = parcel.readString();
            this.x = parcel.readInt();
            this.y = parcel.readString();
            this.z = parcel.readInt();
            this.A = parcel.readInt();
            this.B = parcel.readString();
            this.C = parcel.readInt() == 1;
            this.D = parcel.readInt();
            this.E = parcel.readString();
            bvdz[] bvdzVarArrValues = bvdz.values();
            int i = parcel.readInt();
            if (i >= 0) {
                if (i >= bvdzVarArrValues.length) {
                    throw new IllegalArgumentException();
                }
                this.F = bvdzVarArrValues[i];
            }
            this.G = parcel.readString();
            this.H = parcel.createByteArray();
            this.I = parcel.readLong();
            this.J = parcel.readInt() == 1;
            this.K = parcel.readInt() == 1;
            this.L = parcel.readString();
            cpyi[] cpyiVarArrValues = cpyi.values();
            int i2 = parcel.readInt();
            if (i2 >= 0) {
                if (i2 >= cpyiVarArrValues.length) {
                    throw new IllegalArgumentException();
                }
                this.M = cpyiVarArrValues[i2];
            }
            this.N = alwm.b(parcel.readInt());
            this.O = bbam.a(parcel.readString());
            this.P = chpq.b(parcel.readInt());
            this.Q = chpq.b(parcel.readInt());
            this.R = chpm.b(parcel.readInt());
            byte[] bArrCreateByteArray = parcel.createByteArray();
            if (bArrCreateByteArray == null) {
                anucVar = null;
            } else {
                try {
                    anucVar = (anuc) evsn.parseFrom(anuc.a, bArrCreateByteArray, evrr.a());
                } catch (Throwable unused) {
                    this.S = null;
                }
            }
            this.S = anucVar;
            this.T = parcel.readInt() == 1;
        }

        @Override // defpackage.dqpd
        protected final void fE(Parcel parcel) {
            parcel.writeString(this.a);
            parcel.writeString(axcn.b(this.b));
            parcel.writeString(axcn.b(this.c));
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeString(this.f);
            parcel.writeString(this.g);
            parcel.writeString(this.h);
            parcel.writeString(this.i);
            parcel.writeString(this.j);
            parcel.writeLong(this.k);
            parcel.writeString(this.l);
            parcel.writeString(this.m);
            parcel.writeString(this.n);
            Uri uri = this.o;
            parcel.writeString(uri == null ? null : uri.toString());
            Uri uri2 = this.p;
            parcel.writeString(uri2 == null ? null : uri2.toString());
            parcel.writeLong(this.q);
            parcel.writeString(this.r);
            parcel.writeInt(this.s);
            parcel.writeInt(this.t);
            parcel.writeInt(this.u);
            parcel.writeInt(this.v ? 1 : 0);
            parcel.writeString(this.w);
            parcel.writeInt(this.x);
            parcel.writeString(this.y);
            parcel.writeInt(this.z);
            parcel.writeInt(this.A);
            parcel.writeString(this.B);
            parcel.writeInt(this.C ? 1 : 0);
            parcel.writeInt(this.D);
            parcel.writeString(this.E);
            bvdz bvdzVar = this.F;
            parcel.writeInt(bvdzVar == null ? -1 : bvdzVar.ordinal());
            parcel.writeString(this.G);
            parcel.writeByteArray(this.H);
            parcel.writeLong(this.I);
            parcel.writeInt(this.J ? 1 : 0);
            parcel.writeInt(this.K ? 1 : 0);
            parcel.writeString(this.L);
            cpyi cpyiVar = this.M;
            parcel.writeInt(cpyiVar == null ? -1 : cpyiVar.ordinal());
            alwm alwmVar = this.N;
            parcel.writeInt(alwmVar == null ? -1 : alwmVar.a());
            parcel.writeString(bbam.c(this.O));
            chpq chpqVar = this.P;
            parcel.writeInt(chpqVar == null ? -1 : chpqVar.a());
            chpq chpqVar2 = this.Q;
            parcel.writeInt(chpqVar2 == null ? -1 : chpqVar2.a());
            chpm chpmVar = this.R;
            parcel.writeInt(chpmVar != null ? chpmVar.a() : -1);
            anuc anucVar = this.S;
            parcel.writeByteArray(anucVar != null ? anucVar.toByteArray() : null);
            parcel.writeInt(this.T ? 1 : 0);
        }

        @Override // defpackage.dqpf
        public final String g() {
            return "_id";
        }

        @Override // defpackage.dqpf
        public final String h() {
            return "participants";
        }

        public final int hashCode() {
            dqqe dqqeVar = this.cN;
            dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
            String str = this.a;
            axcm axcmVar = this.b;
            axcm axcmVar2 = this.c;
            Integer numValueOf = Integer.valueOf(this.d);
            Integer numValueOf2 = Integer.valueOf(this.e);
            String str2 = this.f;
            String str3 = this.g;
            String str4 = this.h;
            String str5 = this.i;
            String str6 = this.j;
            Long lValueOf = Long.valueOf(this.k);
            String str7 = this.l;
            String str8 = this.m;
            String str9 = this.n;
            dqqe dqqeVar3 = dqqeVar2;
            Uri uri = this.o;
            Uri uri2 = this.p;
            Long lValueOf2 = Long.valueOf(this.q);
            String str10 = this.r;
            Integer numValueOf3 = Integer.valueOf(this.s);
            Integer numValueOf4 = Integer.valueOf(this.t);
            Integer numValueOf5 = Integer.valueOf(this.u);
            Boolean boolValueOf = Boolean.valueOf(this.v);
            String str11 = this.w;
            Integer numValueOf6 = Integer.valueOf(this.x);
            String str12 = this.y;
            Integer numValueOf7 = Integer.valueOf(this.z);
            Integer numValueOf8 = Integer.valueOf(this.A);
            String str13 = this.B;
            Boolean boolValueOf2 = Boolean.valueOf(this.C);
            Integer numValueOf9 = Integer.valueOf(this.D);
            String str14 = this.E;
            bvdz bvdzVar = this.F;
            Integer numValueOf10 = Integer.valueOf(bvdzVar == null ? 0 : bvdzVar.ordinal());
            String str15 = this.G;
            Integer numValueOf11 = Integer.valueOf(Arrays.hashCode(this.H));
            Long lValueOf3 = Long.valueOf(this.I);
            Boolean boolValueOf3 = Boolean.valueOf(this.J);
            Boolean boolValueOf4 = Boolean.valueOf(this.K);
            String str16 = this.L;
            cpyi cpyiVar = this.M;
            return Objects.hash(dqqeVar3, str, axcmVar, axcmVar2, numValueOf, numValueOf2, str2, str3, str4, str5, str6, lValueOf, str7, str8, str9, uri, uri2, lValueOf2, str10, numValueOf3, numValueOf4, numValueOf5, boolValueOf, str11, numValueOf6, str12, numValueOf7, numValueOf8, str13, boolValueOf2, numValueOf9, str14, numValueOf10, str15, numValueOf11, lValueOf3, boolValueOf3, boolValueOf4, str16, Integer.valueOf(cpyiVar == null ? 0 : cpyiVar.ordinal()), this.N, this.O, this.P, this.Q, this.R, this.S, Boolean.valueOf(this.T), null);
        }

        @Override // defpackage.dqpf
        public final void i(StringBuilder sb, List list) {
            String strB = axcn.b(this.b);
            Object obj = new brvk(this).get();
            Integer numValueOf = Integer.valueOf(this.d);
            Integer numValueOf2 = Integer.valueOf(this.e);
            String str = this.f;
            String str2 = this.g;
            String str3 = this.h;
            String str4 = this.i;
            String str5 = this.j;
            Long lValueOf = Long.valueOf(this.k);
            String str6 = this.l;
            String str7 = this.m;
            String str8 = this.n;
            Uri uri = this.o;
            String string = uri == null ? null : uri.toString();
            Uri uri2 = this.p;
            String string2 = uri2 == null ? null : uri2.toString();
            Long lValueOf2 = Long.valueOf(this.q);
            String str9 = this.r;
            Integer numValueOf3 = Integer.valueOf(this.s);
            Integer numValueOf4 = Integer.valueOf(this.t);
            Integer numValueOf5 = Integer.valueOf(this.u);
            Integer numValueOf6 = Integer.valueOf(this.v ? 1 : 0);
            String str10 = this.w;
            Integer numValueOf7 = Integer.valueOf(this.x);
            String str11 = this.y;
            Integer numValueOf8 = Integer.valueOf(this.z);
            Integer numValueOf9 = Integer.valueOf(this.A);
            String str12 = this.B;
            Integer numValueOf10 = Integer.valueOf(this.C ? 1 : 0);
            Integer numValueOf11 = Integer.valueOf(this.D);
            String str13 = this.E;
            bvdz bvdzVar = this.F;
            Object objValueOf = bvdzVar == null ? 0 : String.valueOf(bvdzVar.ordinal());
            String str14 = this.G;
            byte[] bArr = this.H;
            Long lValueOf3 = Long.valueOf(this.I);
            Integer numValueOf12 = Integer.valueOf(this.J ? 1 : 0);
            Integer numValueOf13 = Integer.valueOf(this.K ? 1 : 0);
            String str15 = this.L;
            cpyi cpyiVar = this.M;
            Object objValueOf2 = cpyiVar == null ? 0 : String.valueOf(cpyiVar.ordinal());
            alwm alwmVar = this.N;
            Object objValueOf3 = alwmVar == null ? 0 : String.valueOf(alwmVar.a());
            String strC = bbam.c(this.O);
            chpq chpqVar = this.P;
            Object objValueOf4 = chpqVar == null ? 0 : String.valueOf(chpqVar.a());
            chpq chpqVar2 = this.Q;
            Object objValueOf5 = chpqVar2 == null ? 0 : String.valueOf(chpqVar2.a());
            chpm chpmVar = this.R;
            Object objValueOf6 = chpmVar == null ? 0 : String.valueOf(chpmVar.a());
            anuc anucVar = this.S;
            Object[] objArr = {strB, obj, numValueOf, numValueOf2, str, str2, str3, str4, str5, lValueOf, str6, str7, str8, string, string2, lValueOf2, str9, numValueOf3, numValueOf4, numValueOf5, numValueOf6, str10, numValueOf7, str11, numValueOf8, numValueOf9, str12, numValueOf10, numValueOf11, str13, objValueOf, str14, bArr, lValueOf3, numValueOf12, numValueOf13, str15, objValueOf2, objValueOf3, strC, objValueOf4, objValueOf5, objValueOf6, anucVar != null ? anucVar.toByteArray() : null, Integer.valueOf(this.T ? 1 : 0)};
            sb.append('(');
            for (int i = 0; i < 45; i++) {
                Object obj2 = objArr[i];
                if (obj2 instanceof Number) {
                    sb.append(String.valueOf(obj2));
                } else {
                    if (obj2 instanceof String) {
                        String str16 = (String) obj2;
                        if (str16.length() < 12) {
                            sb.append(DatabaseUtils.sqlEscapeString(str16));
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

        public final int k() {
            aA(18, "color_palette_index");
            return this.s;
        }

        public final int m() {
            aA(19, "color_type");
            return this.t;
        }

        public final int n() {
            aA(20, "extended_color");
            return this.u;
        }

        public final int o() {
            aA(29, "is_spam_source");
            return this.D;
        }

        public final int p() {
            aA(25, "participant_type");
            return this.z;
        }

        public final int q() {
            aA(4, "sim_slot_id");
            return this.e;
        }

        public final int r() {
            aA(3, "sub_id");
            return this.d;
        }

        public final int s() {
            aA(23, "subscription_color");
            return this.x;
        }

        public final int t() {
            aA(26, "video_reachability");
            return this.A;
        }

        public final String toString() {
            return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "ParticipantsTable -- REDACTED") : a();
        }

        public final long u() {
            aA(16, "contact_id");
            return this.q;
        }

        public final long v() {
            aA(34, "directory_id");
            return this.I;
        }

        public final Uri w() {
            aA(15, "contact_photo_uri");
            return this.p;
        }

        public final Uri x() {
            aA(14, "profile_photo_uri");
            return this.o;
        }

        public final alwm y() {
            aA(39, "norm_ui_status");
            return this.N;
        }

        public final anuc z() {
            aA(44, "contact_metadata");
            return this.S;
        }

        protected BindData(Parcel parcel) {
            chpq chpqVar = chpq.PROFILE_CONTACT_SOURCE;
            this.P = chpqVar;
            this.Q = chpqVar;
            this.R = chpm.PREFER_PROFILE_PHOTO;
            aB(parcel);
        }
    }
}
