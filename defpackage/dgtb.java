package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.ims.provisioning.config.Configuration;
import j$.time.Instant;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgtb implements dgsz {
    private final Context a;
    private final esyd b;

    public dgtb(Context context, esyd esydVar) {
        this.a = context;
        this.b = esydVar;
    }

    private final SharedPreferences O() {
        return this.a.getSharedPreferences("provisioning_engine_state_cache_common.pref", 0);
    }

    @Override // defpackage.dgsz
    public final void A(String str, String str2) {
        N(str).edit().putString("provisioning_engine_provisioning_session_id_key", str2).commit();
    }

    @Override // defpackage.dgsz
    public final void B(String str, String str2) {
        N(str).edit().putString("provisioning_engine_state_key", str2).commit();
    }

    @Override // defpackage.dgsz
    public final void C(String str, Instant instant) {
        N(str).edit().putLong("retry_time", instant.getEpochSecond()).commit();
    }

    @Override // defpackage.dgsz
    public final void D(String str, epie epieVar) {
        N(str).edit().putInt("provisioning_engine_upi_eligibility_key", epieVar.a()).commit();
    }

    @Override // defpackage.dgsz
    public final void E(String str, boolean z) {
        N(str).edit().putBoolean("work_manager_retry", z).commit();
    }

    @Override // defpackage.dgsz
    public final boolean F() {
        return O().getBoolean("provisioning_engine_bugle_enabled_rcs_from_preference_key", false);
    }

    @Override // defpackage.dgsz
    @Deprecated
    public final boolean G() {
        return O().getBoolean("provisioning_engine_carrier_consent_key", false);
    }

    @Override // defpackage.dgsz
    @Deprecated
    public final boolean H() {
        return O().getBoolean("provisioning_engine_google_tos_consent_key", false);
    }

    @Override // defpackage.dgsz
    public final boolean I(String str) {
        return N(str).getBoolean("provisioning_engine_finished_provisioning_attempt_key", false);
    }

    @Override // defpackage.dgsz
    public final boolean J(String str) {
        return N(str).getBoolean("provisioning_engine_has_provisioned_once_key_v2", false);
    }

    @Override // defpackage.dgsz
    public final boolean K(String str) {
        return N(str).getBoolean("work_manager_retry", false);
    }

    @Override // defpackage.dgsz
    @Deprecated
    public final void L() {
        O().edit().putBoolean("provisioning_engine_carrier_consent_key", true).commit();
    }

    @Override // defpackage.dgsz
    public final void M(String str) {
        N(str).edit().putBoolean("provisioning_engine_has_provisioned_once_key_v2", true).commit();
    }

    public final SharedPreferences N(String str) {
        return this.a.getSharedPreferences(String.format("provisioning_engine_state_cache_%s.pref", str), 0);
    }

    @Override // defpackage.dgsz
    public final int a(String str) {
        return N(str).getInt("provisioning_engine_replay_count_key", 0);
    }

    @Override // defpackage.dgsz
    public final int b(String str) {
        return N(str).getInt("provisioning_engine_retry_count_key", 0);
    }

    @Override // defpackage.dgsz
    public final long c(String str) {
        return N(str).getLong("provisioning_engine_next_retry_time_key", 0L);
    }

    @Override // defpackage.dgsz
    public final long d(String str) {
        return N(str).getLong("provisioning_engine_otp_sms_timeout_key", -1L);
    }

    @Override // defpackage.dgsz
    @Deprecated
    public final dgiq e(String str) {
        return (dgiq) g(str).orElseGet(new Supplier() { // from class: dgta
            @Override // java.util.function.Supplier
            public final Object get() {
                return new Configuration();
            }
        });
    }

    @Override // defpackage.dgsz
    public final epie f(String str) {
        SharedPreferences sharedPreferencesN = N(str);
        epie epieVar = epie.UPI_ELIGIBILITY_UNSPECIFIED;
        int i = sharedPreferencesN.getInt("provisioning_engine_upi_eligibility_key", epieVar.a());
        epie epieVar2 = i != 0 ? i != 1 ? i != 2 ? null : epie.INELIGIBLE : epie.ELIGIBLE : epieVar;
        return epieVar2 != null ? epieVar2 : epieVar;
    }

    @Override // defpackage.dgsz
    @Deprecated
    public final Optional g(String str) {
        dgiq dgiqVar = null;
        String string = N(str).getString("provisioning_engine_rcs_configuration", null);
        if (string != null && !string.equals("null")) {
            try {
                dgiqVar = (dgiq) this.b.i(string, Configuration.class);
            } catch (esyr e) {
                dhja.i(e, "Failed to parse json.", new Object[0]);
            }
        }
        return Optional.ofNullable(dgiqVar);
    }

    @Override // defpackage.dgsz
    public final Optional h(String str) {
        long j = N(str).getLong("retry_time", -1L);
        return j == -1 ? Optional.empty() : Optional.of(Instant.ofEpochSecond(j));
    }

    @Override // defpackage.dgsz
    public final String i(String str) {
        return N(str).getString("provisioning_engine_provisioning_session_id_key", null);
    }

    @Override // defpackage.dgsz
    public final String j(String str) {
        return N(str).getString("provisioning_engine_msisdn_key", null);
    }

    @Override // defpackage.dgsz
    public final String k(String str) {
        if (!I(str)) {
            return N(str).getString("provisioning_engine_provisioning_session_id_key", null);
        }
        dhja.c("Already finished a provisioning attempt so no session ID available.", new Object[0]);
        return null;
    }

    @Override // defpackage.dgsz
    public final String l(String str) {
        return N(str).getString("provisioning_engine_state_key", null);
    }

    @Override // defpackage.dgsz
    public final List m(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = N(str).getStringSet("provisioning_engine_cookies_key", ekon.a).iterator();
        while (it.hasNext()) {
            try {
                arrayList.add((dgif) this.b.i(it.next(), dgif.class));
            } catch (esyr e) {
                dhja.i(e, "Failed to unmarshal SerializableHttpCookie. Excluding from cookie set.", new Object[0]);
            }
        }
        return arrayList;
    }

    @Override // defpackage.dgsz
    public final void n(String str) {
        N(str).edit().putInt("provisioning_engine_replay_count_key", 0).commit();
    }

    @Override // defpackage.dgsz
    public final void o(String str) {
        N(str).edit().putLong("retry_time", -1L).commit();
    }

    @Override // defpackage.dgsz
    public final void p(String str) {
        N(str).edit().putInt("provisioning_engine_retry_count_key", 0).commit();
    }

    @Override // defpackage.dgsz
    public final void q(String str) {
        N(str).edit().putInt("provisioning_engine_replay_count_key", a(str) + 1).commit();
    }

    @Override // defpackage.dgsz
    public final void r(String str) {
        N(str).edit().putInt("provisioning_engine_retry_count_key", b(str) + 1).commit();
    }

    @Override // defpackage.dgsz
    public final void s(String str, List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(this.b.k((dgif) it.next()));
        }
        N(str).edit().putStringSet("provisioning_engine_cookies_key", hashSet).commit();
    }

    @Override // defpackage.dgsz
    @Deprecated
    public final void t(boolean z) {
        O().edit().putBoolean("provisioning_engine_google_tos_consent_key", z).commit();
    }

    @Override // defpackage.dgsz
    public final void u(String str, boolean z) {
        N(str).edit().putBoolean("provisioning_engine_finished_provisioning_attempt_key", z).commit();
    }

    @Override // defpackage.dgsz
    public final void v(String str, String str2) {
        N(str).edit().putString("provisioning_engine_msisdn_key", str2).commit();
    }

    @Override // defpackage.dgsz
    public final void w(String str, long j) {
        N(str).edit().putLong("provisioning_engine_next_retry_time_key", j).commit();
    }

    @Override // defpackage.dgsz
    public final void x(String str, String str2) {
        N(str).edit().putString("provisioning_engine_otp_key", str2).commit();
    }

    @Override // defpackage.dgsz
    public final void y(String str, long j) {
        N(str).edit().putLong("provisioning_engine_otp_sms_timeout_key", j).commit();
    }

    @Override // defpackage.dgsz
    @Deprecated
    public final void z(String str, dgiq dgiqVar) {
        N(str).edit().putString("provisioning_engine_rcs_configuration", this.b.k(dgiqVar)).commit();
    }
}
