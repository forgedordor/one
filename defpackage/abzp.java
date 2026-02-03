package defpackage;

import android.view.ViewTreeObserver;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abzp implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ abzq a;

    public abzp(abzq abzqVar) {
        this.a = abzqVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        abzq abzqVar = this.a;
        ea eaVar = abzqVar.b;
        eg egVarG = eaVar.G();
        if ((egVarG != null ? (SelectedAccountDisc) egVarG.findViewById(R.id.selected_account_disc) : null) != null) {
            eaVar.fg().findViewById(android.R.id.content).getViewTreeObserver().removeOnGlobalLayoutListener(this);
            ekrw ekrwVarE = abzq.a.e();
            ekrwVarE.X(eksq.a, "BugleGaia");
            ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/gaia/autosignin/AutoSignInTooltipPresenterImpl$getOnGlobalLayoutListener$1", "onGlobalLayout", 124, "AutoSignInTooltipPresenterImpl.kt")).q("[Auto sign-in] Account disc found in view tree. Notifying state change");
            abzqVar.c();
        }
    }
}
