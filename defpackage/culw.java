package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class culw extends cupy {
    public cqtj aj;
    private PackageManager ak;
    private Preference al;
    private Preference an;
    private Preference ao;

    public final boolean aY(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (intent.resolveActivity(G().getPackageManager()) == null) {
            return false;
        }
        aQ(intent);
        return true;
    }

    @Override // defpackage.ecdm, defpackage.ea
    public final void ao() throws PackageManager.NameNotFoundException {
        super.ao();
        try {
            this.al.n(this.ak.getPackageInfo(G().getPackageName(), 128).versionName);
            this.an.o = new ozb() { // from class: culu
                @Override // defpackage.ozb
                public final boolean a(Preference preference) {
                    culw culwVar = this.a;
                    return culwVar.aY(culwVar.aj.a());
                }
            };
            this.ao.o = new ozb() { // from class: culv
                @Override // defpackage.ozb
                public final boolean a(Preference preference) {
                    culw culwVar = this.a;
                    return culwVar.aY(culwVar.aj.b());
                }
            };
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Package of a resumed activity doesn't exist", e);
        }
    }

    @Override // defpackage.aiif, defpackage.ozm
    public final void gh(Bundle bundle, String str) {
        super.gh(bundle, str);
        f(R.xml.privacy_terms_preference);
        this.ak = G().getPackageManager();
        this.al = a(Y(R.string.application_version_number));
        this.an = a(Y(R.string.privacy_policy_pref_key));
        this.ao = a(Y(R.string.terms_of_service_pref_key));
    }
}
