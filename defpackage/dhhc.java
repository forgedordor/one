package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.ims.provisioning.config.Configuration;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhhc extends dhhe {
    public dhhc(Context context, dexy dexyVar) {
        super(context, context.getContentResolver(), bxme.a, dexyVar);
    }

    public static final String d(String str, ewpa ewpaVar) {
        return g("phone_number_record_by_sim_and_msisdn_source_", str + "_" + ewpaVar.d);
    }

    public final dgiq a(String str) {
        String strH = h("provisioning_engine_rcs_configuration_".concat(String.valueOf(str)), "", "bugle");
        try {
            try {
                return (dgiq) new esyd().i(ejwk.b(strH), Configuration.class);
            } catch (Throwable th) {
                dhja.i(th, "Error while parsing RCS Configuration from JSON", new Object[0]);
                return null;
            }
        } catch (Exception e) {
            dhja.i(e, "Error while creating Gson object", new Object[0]);
            return null;
        }
    }

    public final String b(String str) {
        return h("rcs_user_id_".concat(String.valueOf(str)), str, "bugle");
    }

    public final UUID c() {
        try {
            return UUID.fromString(h("rcs_provisioning_rcs_default_on_server_update_time_key", "", "bugle"));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final void e(String str) throws dhhd {
        Bundle bundleL = dhhe.l("is_fi_device_".concat(str), "bugle");
        bundleL.putBoolean("preference_value", true);
        super.f("PUT", "BOOLEAN", bundleL);
    }
}
