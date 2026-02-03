package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crqr extends crqq {
    private final int b;
    private final crqp c;
    private final crny d;
    private final cmum e;
    private final crqu f;

    public crqr(Context context, crqp crqpVar, crny crnyVar, cmum cmumVar, int i, crqu crquVar) {
        super(context);
        this.c = crqpVar;
        this.d = crnyVar;
        this.e = cmumVar;
        this.b = i;
        this.f = crquVar;
    }

    private final void t(crqv crqvVar, String str, int i, boolean z, crqv crqvVar2) {
        Resources resources = this.a.getResources();
        boolean zQ = crqvVar.q(str, z);
        if (zQ != z) {
            crqvVar2.h(resources.getString(i), zQ);
        }
    }

    private final void u(crqv crqvVar, String str, int i, String str2, crqv crqvVar2) {
        Resources resources = this.a.getResources();
        String strF = crqvVar.f(str, str2);
        if (TextUtils.equals(strF, str2)) {
            return;
        }
        crqvVar2.l(resources.getString(i), strF);
    }

    @Override // defpackage.crqv
    public final String a() {
        return "buglesub_" + this.b;
    }

    @Override // defpackage.crqq
    protected final void b(String str) {
        cqaz.k(str.startsWith("buglesub_"));
    }

    @Override // defpackage.crqv
    public final void c(int i) throws Throwable {
        if (i == -1) {
            cmum cmumVar = this.e;
            int i2 = this.b;
            crqp crqpVar = this.c;
            cmuh cmuhVarA = cmumVar.a(i2);
            t(crqpVar, "delivery_reports", R.string.delivery_reports_pref_key, cmuhVarA.s(), this);
            t(crqpVar, "auto_retrieve_mms", R.string.auto_retrieve_mms_pref_key, cmuhVarA.n(), this);
            t(crqpVar, "auto_retrieve_mms_when_roaming", R.string.auto_retrieve_mms_when_roaming_pref_key, cmuhVarA.o(), this);
            t(crqpVar, "group_messaging", R.string.group_mms_pref_key, cmuhVarA.l(), this);
            if (this.d.a() == 1) {
                u(crqpVar, "mms_phone_number", R.string.mms_phone_number_pref_key, null, this);
                return;
            }
            return;
        }
        if (i != 1) {
            return;
        }
        Context context = this.a;
        Resources resources = context.getApplicationContext().getResources();
        crqu crquVar = this.f;
        int i3 = this.b;
        crqv crqvVarA = crquVar.a(i3);
        boolean z = resources.getBoolean(R.bool.enable_rcs_pref_default);
        crqp crqpVar2 = this.c;
        t(crqvVarA, "buglesub_enable_rcs", R.string.enable_rcs_pref_key, z, crqpVar2);
        t(crquVar.a(i3), "buglesub_send_seen_report_rcs", R.string.send_seen_report_rcs_pref_key, resources.getBoolean(R.bool.send_seen_report_rcs_pref_default), crqpVar2);
        t(crquVar.a(i3), "buglesub_share_typing_status_rcs", R.string.share_typing_status_rcs_pref_key, resources.getBoolean(R.bool.share_typing_status_rcs_pref_default), crqpVar2);
        crqv crqvVarA2 = crquVar.a(i3);
        Resources resources2 = context.getResources();
        if (crqvVarA2.p("buglesub_rcs_fallback_type")) {
            crqpVar2.j(resources2.getString(R.string.rcs_fallback_type_pref_key), crqvVarA2.d("buglesub_rcs_fallback_type", 0));
        }
        crqv crqvVarA3 = crquVar.a(i3);
        Resources resources3 = context.getResources();
        int iD = crqvVarA3.d("buglesub_rcs_default_sharing_method", -1);
        if (iD != -1) {
            crqpVar2.j(resources3.getString(R.string.rcs_default_sharing_method_key), iD);
        }
        u(crquVar.a(i3), "buglesub_rcs_mobile_data_auto_download_limit", R.string.rcs_mobile_data_auto_download_limit_pref_key, resources.getString(R.string.rcs_mobile_data_auto_download_limit_default_entry), crqpVar2);
    }
}
