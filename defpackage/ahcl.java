package defpackage;

import android.widget.TextView;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahcl implements ehay {
    final /* synthetic */ ahco a;

    public ahcl(ahco ahcoVar) {
        this.a = ahcoVar;
    }

    @Override // defpackage.ehay
    public final void a(Throwable th) {
        ekrw ekrwVarJ = ahco.a.j();
        ekrwVarJ.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarJ).g(th).h("com/google/android/apps/messaging/privacy/identitydetails/IdentityDetailsFragmentPeer$onLoadSecurityKey$1", "onLoadError", 89, "IdentityDetailsFragmentPeer.kt")).q("Failed to load identity details");
        this.a.a().setVisibility(4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ehay
    public final /* synthetic */ void b(Object obj) {
        Optional optional = (Optional) obj;
        String str = (String) (optional.isPresent() ? optional.get() : null);
        if (str == null) {
            ekrw ekrwVarH = ahco.a.h();
            ekrwVarH.X(eksq.a, "Bugle");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/privacy/identitydetails/IdentityDetailsFragmentPeer$onLoadSecurityKey$1", "onLoaded", 83, "IdentityDetailsFragmentPeer.kt")).q("Identity details not loaded or not present");
            this.a.a().setVisibility(4);
            return;
        }
        ahco ahcoVar = this.a;
        List list = ahco.b;
        int i = ((ekoe) list).c;
        int length = str.length();
        if (length != 0) {
            if (length % i == 0) {
                int i2 = length / i;
                ekqh it = ((ekgb) list).iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    TextView textView = (TextView) ahcoVar.c.N().findViewById(((Number) it.next()).intValue());
                    int iG = fddu.g(i3 + i2, length);
                    String strSubstring = str.substring(i3, iG);
                    strSubstring.getClass();
                    textView.setText(strSubstring);
                    if (iG >= length) {
                        break;
                    } else {
                        i3 = iG;
                    }
                }
            } else {
                ekrw ekrwVarJ = ahco.a.j();
                ekrwVarJ.X(eksq.a, "Bugle");
                ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/privacy/identitydetails/IdentityDetailsFragmentPeer", "setIdentityDetailsText", 150, "IdentityDetailsFragmentPeer.kt")).r("Unexpected security key length: %d", length);
            }
        } else {
            ekrw ekrwVarJ2 = ahco.a.j();
            ekrwVarJ2.X(eksq.a, "Bugle");
            ((ekrd) ekrwVarJ2.h("com/google/android/apps/messaging/privacy/identitydetails/IdentityDetailsFragmentPeer", "setIdentityDetailsText", 146, "IdentityDetailsFragmentPeer.kt")).q("Identity details found with 0 length; skipping");
        }
        ahcoVar.a().setVisibility(0);
    }
}
