package defpackage;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import androidx.preference.Preference;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cved implements cvdx {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final ozm d;
    public final Intent e;
    private final fdjx f;

    public cved(ea eaVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fdjx fdjxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fdjxVar.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.f = fdjxVar;
        this.d = (ozm) eaVar;
        Intent intentAddFlags = new Intent("com.google.android.gms.spatula.settings.action.OPEN_SPATULA_SETTINGS").addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES).addFlags(32768);
        intentAddFlags.getClass();
        this.e = intentAddFlags;
        auvw.m(fdjxVar, null, new cvec(this, null), 3);
    }

    @Override // defpackage.cvdx
    public final void b() {
        ozm ozmVar = this.d;
        Preference preferenceA = ozmVar.a(ozmVar.Y(R.string.sensitive_content_warnings_pref_key_2025_03_18));
        Preference preferenceA2 = ozmVar.a(ozmVar.Y(R.string.sensitive_content_warnings_body_text_pref_key_2025_03_18));
        if (preferenceA == null || preferenceA2 == null) {
            return;
        }
        if (!crtr.e()) {
            preferenceA.N(false);
            preferenceA2.N(false);
            return;
        }
        Intent intentAddFlags = new Intent("com.google.android.gms.spatula.settings.action.OPEN_SPATULA_SETTINGS").addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        intentAddFlags.getClass();
        ActivityInfo activityInfoResolveActivityInfo = intentAddFlags.resolveActivityInfo(ozmVar.fg().getPackageManager(), 65536);
        if (activityInfoResolveActivityInfo == null || !activityInfoResolveActivityInfo.exported) {
            preferenceA.N(false);
            preferenceA2.N(false);
        } else {
            preferenceA.o = new ozb() { // from class: cvea
                @Override // defpackage.ozb
                public final boolean a(Preference preference) throws IOException {
                    cved cvedVar = this.a;
                    eiid.o(cvedVar.d.A(), cvedVar.e);
                    return true;
                }
            };
            preferenceA2.M(dajs.i(ozmVar.A(), R.string.sensitive_content_pref_learn_more));
            preferenceA2.o = new ozb() { // from class: cveb
                @Override // defpackage.ozb
                public final boolean a(Preference preference) {
                    cved cvedVar = this.a;
                    ((aijh) cvedVar.c.b()).t(cvedVar.d.A(), "https://support.google.com/messages?p=sensitive_message_content");
                    return true;
                }
            };
        }
    }
}
