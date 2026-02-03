package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsbs extends dqye {
    public bsbs() {
        super("participants");
    }

    public final void A(int i) {
        int iIntValue = ParticipantsTable.i().intValue();
        int iIntValue2 = ParticipantsTable.i().intValue();
        if (iIntValue2 < 30000) {
            dqru.x("is_spam_source", iIntValue2);
        }
        if (iIntValue >= 30000) {
            this.a.put("is_spam_source", Integer.valueOf(i));
        }
    }

    public final void B(String str) {
        dqru.v(this.a, "lookup_key", str);
    }

    public final void C() {
        this.a.putNull("lookup_key");
    }

    public final void D(axcm axcmVar) {
        int iIntValue = ParticipantsTable.i().intValue();
        if (ParticipantsTable.i().intValue() >= 59930 && iIntValue >= 59930) {
            this.a.put("my_identity_token", axcn.b(axcmVar));
        }
    }

    public final void E(axcm axcmVar) {
        int iIntValue = ParticipantsTable.i().intValue();
        if (ParticipantsTable.i().intValue() >= 60160 && iIntValue >= 60160) {
            if (axcmVar == null || axcmVar.equals(null)) {
                this.a.putNull("my_identity_token_foreign_key");
            } else {
                this.a.put("my_identity_token_foreign_key", axcn.b(axcmVar));
            }
        }
    }

    public final void F(chpq chpqVar) {
        int iIntValue = ParticipantsTable.i().intValue();
        int iIntValue2 = ParticipantsTable.i().intValue();
        if (iIntValue2 < 59550) {
            dqru.x("name_source", iIntValue2);
        }
        if (iIntValue >= 59550) {
            if (chpqVar == null) {
                this.a.putNull("name_source");
            } else {
                this.a.put("name_source", Integer.valueOf(chpqVar.a()));
            }
        }
    }

    public final void G(alwm alwmVar) {
        int iIntValue = ParticipantsTable.i().intValue();
        int iIntValue2 = ParticipantsTable.i().intValue();
        if (iIntValue2 < 58620) {
            dqru.x("norm_ui_status", iIntValue2);
        }
        if (iIntValue >= 58620) {
            if (alwmVar == null) {
                this.a.putNull("norm_ui_status");
            } else {
                this.a.put("norm_ui_status", Integer.valueOf(alwmVar.a()));
            }
        }
    }

    public final void H(String str) {
        dqru.v(this.a, "normalized_destination", cssb.a(str));
    }

    public final void I(int i) {
        int iIntValue = ParticipantsTable.i().intValue();
        int iIntValue2 = ParticipantsTable.i().intValue();
        if (iIntValue2 < 12001) {
            dqru.x("participant_type", iIntValue2);
        }
        if (iIntValue >= 12001) {
            this.a.put("participant_type", Integer.valueOf(i));
        }
    }

    public final void J(chpq chpqVar) {
        int iIntValue = ParticipantsTable.i().intValue();
        int iIntValue2 = ParticipantsTable.i().intValue();
        if (iIntValue2 < 59550) {
            dqru.x("photo_source", iIntValue2);
        }
        if (iIntValue >= 59550) {
            if (chpqVar == null) {
                this.a.putNull("photo_source");
            } else {
                this.a.put("photo_source", Integer.valueOf(chpqVar.a()));
            }
        }
    }

    public final void K(String str) {
        int iIntValue = ParticipantsTable.i().intValue();
        int iIntValue2 = ParticipantsTable.i().intValue();
        if (iIntValue2 < 33000) {
            dqru.x("profile_photo_blob_id", iIntValue2);
        }
        if (iIntValue >= 33000) {
            dqru.v(this.a, "profile_photo_blob_id", str);
        }
    }

    public final void L(byte[] bArr) {
        int iIntValue = ParticipantsTable.i().intValue();
        int iIntValue2 = ParticipantsTable.i().intValue();
        if (iIntValue2 < 33060) {
            dqru.x("profile_photo_encryption_key", iIntValue2);
        }
        if (iIntValue >= 33060) {
            this.a.put("profile_photo_encryption_key", bArr);
        }
    }

    public final void M(Uri uri) {
        if (uri == null) {
            this.a.putNull("profile_photo_uri");
        } else {
            this.a.put("profile_photo_uri", uri.toString());
        }
    }

    public final void N(String str) {
        dqru.v(this.a, "send_destination", cssb.a(str));
    }

    public final void O(int i) {
        int iIntValue = ParticipantsTable.i().intValue();
        int iIntValue2 = ParticipantsTable.i().intValue();
        if (iIntValue2 < 2000) {
            dqru.x("sim_slot_id", iIntValue2);
        }
        if (iIntValue >= 2000) {
            this.a.put("sim_slot_id", Integer.valueOf(i));
        }
    }

    public final void P(int i) {
        this.a.put("sub_id", Integer.valueOf(i));
    }

    public final void Q(int i) {
        int iIntValue = ParticipantsTable.i().intValue();
        int iIntValue2 = ParticipantsTable.i().intValue();
        if (iIntValue2 < 2000) {
            dqru.x("subscription_color", iIntValue2);
        }
        if (iIntValue >= 2000) {
            this.a.put("subscription_color", Integer.valueOf(i));
        }
    }

    public final void R(String str) {
        int iIntValue = ParticipantsTable.i().intValue();
        int iIntValue2 = ParticipantsTable.i().intValue();
        if (iIntValue2 < 2000) {
            dqru.x("subscription_name", iIntValue2);
        }
        if (iIntValue >= 2000) {
            dqru.v(this.a, "subscription_name", str);
        }
    }

    public final void S(int i) {
        int iIntValue = ParticipantsTable.i().intValue();
        int iIntValue2 = ParticipantsTable.i().intValue();
        if (iIntValue2 < 13050) {
            dqru.x("video_reachability", iIntValue2);
        }
        if (iIntValue >= 13050) {
            this.a.put("video_reachability", Integer.valueOf(i));
        }
    }

    public final void T(bsbx bsbxVar) {
        af(new bsbt(bsbxVar));
    }

    public final void U(Function function) {
        String[] strArr = ParticipantsTable.a;
        af(new bsbt((bsbx) function.apply(new bsbx())));
    }

    public final int a(int i) {
        String[] strArr = ParticipantsTable.a;
        bsbx bsbxVar = new bsbx();
        bsbxVar.v(i);
        return ae(new bsbt(bsbxVar), "participants-buildAndUpdateForSubId");
    }

    public final axcm c() {
        return axcn.a(this.a.getAsString("my_identity_token"));
    }

    @Override // defpackage.dqye
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final bsbr b() {
        ah();
        try {
            if (c() != null) {
                E(c());
            }
            return new bsbr(this.c, this.a, this.b, this.d.g(), this.e.g());
        } catch (Throwable th) {
            throw new dqod(th);
        }
    }

    public final boolean e(String str) {
        String[] strArr = ParticipantsTable.a;
        bsbx bsbxVar = new bsbx();
        bsbxVar.k(str);
        return aj(new bsbt(bsbxVar), "participants-buildAndUpdateForId");
    }

    public final void f(boolean z) {
        this.a.put("blocked", Boolean.valueOf(z));
    }

    public final void g(String str) {
        int iIntValue = ParticipantsTable.i().intValue();
        int iIntValue2 = ParticipantsTable.i().intValue();
        if (iIntValue2 < 31020) {
            dqru.x("cms_id", iIntValue2);
        }
        if (iIntValue >= 31020) {
            dqru.v(this.a, "cms_id", str);
        }
    }

    public final void h() {
        this.a.putNull("cms_id");
    }

    public final void i(cpyi cpyiVar) {
        int iIntValue = ParticipantsTable.i().intValue();
        int iIntValue2 = ParticipantsTable.i().intValue();
        if (iIntValue2 < 58210) {
            dqru.x("cms_life_cycle", iIntValue2);
        }
        if (iIntValue >= 58210) {
            if (cpyiVar == null) {
                this.a.putNull("cms_life_cycle");
            } else {
                this.a.put("cms_life_cycle", Integer.valueOf(cpyiVar.ordinal()));
            }
        }
    }

    public final void j(int i) {
        this.a.put("color_palette_index", Integer.valueOf(i));
    }

    public final void k(int i) {
        int iIntValue = ParticipantsTable.i().intValue();
        int iIntValue2 = ParticipantsTable.i().intValue();
        if (iIntValue2 < 1000) {
            dqru.x("color_type", iIntValue2);
        }
        if (iIntValue >= 1000) {
            this.a.put("color_type", Integer.valueOf(i));
        }
    }

    public final void l(String str) {
        int iIntValue = ParticipantsTable.i().intValue();
        int iIntValue2 = ParticipantsTable.i().intValue();
        if (iIntValue2 < 4000) {
            dqru.x("contact_destination", iIntValue2);
        }
        if (iIntValue >= 4000) {
            dqru.v(this.a, "contact_destination", str);
        }
    }

    public final void m() {
        this.a.putNull("contact_destination");
    }

    public final void n(long j) {
        this.a.put("contact_id", Long.valueOf(j));
    }

    public final void o() {
        this.a.putNull("contact_metadata");
    }

    public final void p() {
        this.a.putNull("contact_photo_uri");
    }

    public final void q(long j) {
        int iIntValue = ParticipantsTable.i().intValue();
        int iIntValue2 = ParticipantsTable.i().intValue();
        if (iIntValue2 < 35010) {
            dqru.x("directory_id", iIntValue2);
        }
        if (iIntValue >= 35010) {
            this.a.put("directory_id", Long.valueOf(j));
        }
    }

    public final void r(String str) {
        dqru.v(this.a, "display_destination", cssb.a(str));
    }

    public final void s(int i) {
        int iIntValue = ParticipantsTable.i().intValue();
        int iIntValue2 = ParticipantsTable.i().intValue();
        if (iIntValue2 < 10027) {
            dqru.x("extended_color", iIntValue2);
        }
        if (iIntValue >= 10027) {
            this.a.put("extended_color", Integer.valueOf(i));
        }
    }

    public final void t(String str) {
        dqru.v(this.a, "first_name", cssq.a(str));
    }

    public final void u() {
        this.a.putNull("first_name");
    }

    public final void v(String str) {
        dqru.v(this.a, "full_name", cssq.a(str));
    }

    public final void w() {
        this.a.putNull("full_name");
    }

    public final void x(boolean z) {
        int iIntValue = ParticipantsTable.i().intValue();
        int iIntValue2 = ParticipantsTable.i().intValue();
        if (iIntValue2 < 55010) {
            dqru.x("is_check_constraint_enabled_via_phenotype", iIntValue2);
        }
        if (iIntValue >= 55010) {
            this.a.put("is_check_constraint_enabled_via_phenotype", Boolean.valueOf(z));
        }
    }

    public final void y() {
        this.a.putNull("is_enterprise_contact");
    }

    public final void z(boolean z) {
        int iIntValue = ParticipantsTable.i().intValue();
        int iIntValue2 = ParticipantsTable.i().intValue();
        if (iIntValue2 < 24060) {
            dqru.x("is_spam", iIntValue2);
        }
        if (iIntValue >= 24060) {
            this.a.put("is_spam", Boolean.valueOf(z));
        }
    }
}
