package defpackage;

import android.content.Intent;
import com.google.android.gms.auth.UserRecoverableAuthException;

/* compiled from: PG */
/* loaded from: classes3.dex */
class cysa implements egzv<cdjb> {
    final /* synthetic */ cysg a;

    public cysa(cysg cysgVar) {
        this.a = cysgVar;
    }

    @Override // defpackage.egzv
    public final void a(Throwable th) {
        ekrw ekrwVarJ = cysg.a.j();
        ekrwVarJ.X(eksq.a, "BugleGDitto");
        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(th)).h("com/google/android/apps/messaging/ui/gaia/GaiaPairingSettingsFragmentPeer$1", "onError", (char) 208, "GaiaPairingSettingsFragmentPeer.java")).q("Failed to get Gaia auth check result");
    }

    @Override // defpackage.egzv
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        cdjb cdjbVar = (cdjb) obj;
        if (cdjbVar instanceof cdja) {
            cdja cdjaVar = (cdja) cdjbVar;
            efwo efwoVar = cdjaVar.a;
            cysg cysgVar = this.a;
            if (cysgVar.b.equals(efwoVar)) {
                cyrn cyrnVar = cysgVar.c;
                UserRecoverableAuthException userRecoverableAuthException = new UserRecoverableAuthException("Recoverable auth error when loading device pairing page", cdjaVar.b);
                cyrnVar.getClass();
                ea eaVarH = cyrnVar.I().h("GaiaAuthFailureDialogFragment");
                if (eaVarH != null) {
                    cg cgVar = new cg(cyrnVar.I());
                    cgVar.q(eaVarH);
                    cgVar.c();
                } else {
                    int i = cdjn.g;
                    Intent intentA = userRecoverableAuthException.a();
                    intentA.getClass();
                    cdjm.a(intentA, 4).t(cyrnVar.I(), "GaiaAuthFailureDialogFragment");
                }
            }
        }
    }

    @Override // defpackage.egzv
    public final /* synthetic */ void hn() {
    }
}
