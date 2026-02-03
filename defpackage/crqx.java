package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crqx {
    public final crqv a;
    public final Resources b;
    public final crre c;
    public final eosc d;
    private final cogw e;

    public crqx(crqv crqvVar, Context context, cogw cogwVar, crre crreVar, eosc eoscVar) {
        this.a = crqvVar;
        this.b = context.getResources();
        this.e = cogwVar;
        this.c = crreVar;
        this.d = eoscVar;
    }

    public final long a() {
        return this.a.e(this.b.getString(R.string.link_preview_tombstone_first_shown_millis_pref_key), -1L);
    }

    public final String b() {
        crqv crqvVar = this.a;
        String strF = crqvVar.f("provisioning_session_id", "");
        if (!TextUtils.isEmpty(strF)) {
            return strF;
        }
        String string = UUID.randomUUID().toString();
        crqvVar.l("provisioning_session_id", string);
        return string;
    }

    public final void c() {
        this.a.g(this.b.getString(R.string.link_preview_enabled_pref_key), true);
        if (a() == -1) {
            d(this.e.f().toEpochMilli());
        }
        p();
    }

    public final void d(long j) {
        this.a.k(this.b.getString(R.string.link_preview_tombstone_first_shown_millis_pref_key), j);
    }

    public final boolean e() {
        return this.b.getBoolean(R.bool.link_preview_enabled_pref_default);
    }

    public final boolean f() {
        Resources resources = this.b;
        return this.a.q(resources.getString(R.string.rich_cards_settings_enable_all_pref_key), resources.getBoolean(R.bool.rich_cards_settings_enable_all_pref_default));
    }

    public final boolean g() {
        Resources resources = this.b;
        return this.a.q(resources.getString(R.string.assistant_enabled_pref_key), resources.getBoolean(R.bool.assistant_enabled_pref_default));
    }

    public final boolean h() {
        return i(e());
    }

    public final boolean i(boolean z) {
        return this.a.q(this.b.getString(R.string.link_preview_enabled_pref_key), z);
    }

    public final boolean j() {
        if (!crbf.d()) {
            return false;
        }
        crqv crqvVar = this.a;
        Resources resources = this.b;
        return crqvVar.q(resources.getString(R.string.mc_enabled_pref_key), resources.getBoolean(R.bool.mc_enabled_pref_default));
    }

    public final boolean k() {
        Resources resources = this.b;
        return this.a.q(resources.getString(R.string.link_preview_wifi_only_pref_key), resources.getBoolean(R.bool.link_preview_wifi_only_pref_default));
    }

    public final boolean l() {
        Resources resources = this.b;
        return this.a.q(resources.getString(R.string.share_typing_status_rcs_pref_key), resources.getBoolean(R.bool.share_typing_status_rcs_pref_default));
    }

    public final boolean m() {
        Resources resources = this.b;
        return this.a.q(resources.getString(R.string.smart_actions_enabled_pref_key), resources.getBoolean(R.bool.smart_actions_enabled_pref_default));
    }

    public final boolean n() {
        Resources resources = this.b;
        return this.a.q(resources.getString(R.string.p2p_conversation_suggestions_enabled_pref_key), resources.getBoolean(R.bool.p2p_conversation_suggestions_enabled_pref_default));
    }

    public final boolean o() {
        if (!((Boolean) crbf.q.e()).booleanValue()) {
            return n();
        }
        crqv crqvVar = this.a;
        Resources resources = this.b;
        return crqvVar.q(resources.getString(R.string.suggested_stickers_enabled_pref_key), resources.getBoolean(R.bool.suggested_stickers_enabled_pref_default));
    }

    public final void p() {
        this.a.h(this.b.getString(R.string.link_preview_tombstone_seen_pref_key), true);
    }

    public final int q() {
        int iA = eluu.a(this.a.d("rcs_onboarding_progress", 0));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int r() {
        int iA = eluw.a(this.a.d("rcs_provisioning_status_pev2", 0));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final void s(int i) {
        crqv crqvVar = this.a;
        int i2 = i - 1;
        if (crqvVar.d("fast_track_onboarding_progress", 0) < i2) {
            crqvVar.j("fast_track_onboarding_progress", i2);
        }
    }
}
