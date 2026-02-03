package defpackage;

import android.R;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.gaia.signoutaccount.SignOutAccountActivity;
import com.google.android.apps.messaging.gaia.signoutaccount.SignOutAccountArguments;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acct implements efzm {
    final /* synthetic */ accu a;

    public acct(accu accuVar) {
        this.a = accuVar;
    }

    @Override // defpackage.efzm
    public final void a(efzk efzkVar) {
        if (fdbq.f(efzkVar.b(), "pseudonymous")) {
            ekrw ekrwVarH = accu.a.h();
            ekrwVarH.X(eksq.a, "BugleAccountSignOut");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/gaia/signoutaccount/SignOutAccountActivityPeer$SignOutAccountActivityPeerAccountUiCallbacks", "onAccountChanged", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "SignOutAccountActivityPeer.kt")).q("Switched to pseudonymous account, finishing sign out");
            SignOutAccountActivity signOutAccountActivity = this.a.b;
            signOutAccountActivity.setResult(-1);
            signOutAccountActivity.finishAfterTransition();
            return;
        }
        accu accuVar = this.a;
        SignOutAccountActivity signOutAccountActivity2 = accuVar.b;
        Intent intent = signOutAccountActivity2.getIntent();
        intent.getClass();
        efwo efwoVar = (efwo) (Build.VERSION.SDK_INT > 33 ? (Parcelable) intent.getParcelableExtra("EXTRA_CURRENT_ACCOUNT_ID", efwo.class) : intent.getParcelableExtra("EXTRA_CURRENT_ACCOUNT_ID"));
        if (efwoVar != null && !fdbq.f(efzkVar.a(), efwoVar)) {
            ekrw ekrwVarH2 = accu.a.h();
            ekrwVarH2.X(eksq.a, "BugleAccountSignOut");
            ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/gaia/signoutaccount/SignOutAccountActivityPeer$SignOutAccountActivityPeerAccountUiCallbacks", "onAccountChanged", 113, "SignOutAccountActivityPeer.kt")).q("Switched to another account, finishing sign out");
            signOutAccountActivity2.finishAfterTransition();
        }
        signOutAccountActivity2.getIntent().putExtra("EXTRA_CURRENT_ACCOUNT_ID", efzkVar.a());
        efwo efwoVarA = efzkVar.a();
        efwoVarA.getClass();
        efwo efwoVarA2 = accuVar.a();
        acdj acdjVar = new acdj();
        eyhj.e(acdjVar);
        ehok.b(acdjVar, efwoVarA);
        Bundle bundle = acdjVar.m;
        if (bundle != null) {
            bundle.putParcelable("sign_out_account_arguments", new SignOutAccountArguments(efwoVarA2));
        }
        cg cgVar = new cg(signOutAccountActivity2.a());
        cgVar.s(R.id.content, acdjVar);
        cgVar.c();
    }

    @Override // defpackage.efzm
    public final void c(efyg efygVar) {
        accu accuVar = this.a;
        ((abxv) accuVar.d.b()).a(efygVar);
        SignOutAccountActivity signOutAccountActivity = accuVar.b;
        signOutAccountActivity.setResult(0);
        signOutAccountActivity.finish();
    }

    @Override // defpackage.efzm
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.efzm
    public final /* synthetic */ void d() {
    }
}
