package defpackage;

import android.view.View;
import com.google.android.apps.messaging.lighterconversation.LighterConversationActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class affc implements View.OnClickListener {
    final /* synthetic */ afey a;

    public affc(afey afeyVar) {
        this.a = afeyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        afex afexVar = this.a.d;
        if (afexVar.G() instanceof LighterConversationActivity) {
            LighterConversationActivity lighterConversationActivity = (LighterConversationActivity) afexVar.G();
            lighterConversationActivity.getClass();
            fr frVarA = lighterConversationActivity.H().b.a();
            cg cgVar = new cg(frVarA);
            ea eaVarH = frVarA.h("LIGHTER_SETTINGS_FRAGMENT");
            eaVarH.getClass();
            cgVar.o(eaVarH);
            cgVar.c();
        }
    }
}
