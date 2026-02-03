package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acrz implements eind {
    final /* synthetic */ acrt a;

    public acrz(acrt acrtVar) {
        this.a = acrtVar;
    }

    @Override // defpackage.eind
    public final /* bridge */ /* synthetic */ eine a(einb einbVar) {
        acrt acrtVar = this.a;
        fcsu fcsuVar = acrtVar.p;
        acvz acvzVar = (acvz) einbVar;
        if (!((Optional) fcsuVar.b()).isEmpty()) {
            adbn adbnVar = (adbn) ((Optional) fcsuVar.b()).get();
            efwo efwoVar = acrtVar.am;
            acom acomVar = acrtVar.b;
            efwoVar.getClass();
            acvzVar.getClass();
            boolean zA = ((arvo) adbnVar.a.b()).a();
            adbb adbbVar = new adbb();
            eyhj.e(adbbVar);
            ehok.b(adbbVar, efwoVar);
            int[] iArr = new int[2];
            acvzVar.a.getLocationOnScreen(iArr);
            Bundle bundleC = adbbVar.C();
            ConversationId conversationId = acvzVar.b.b;
            bundleC.putString("conversation_id", conversationId.b());
            bundleC.putIntArray("starting_coordinate", iArr);
            if (zA) {
                bundleC.putParcelable("conversation_id_parcelable", conversationId);
            }
            cg cgVar = new cg(acomVar.I());
            cgVar.x(R.id.mini_cdp_fragment, adbbVar, "HOME_MINICDP_FRAGMENT");
            cgVar.c();
        }
        return eine.a;
    }
}
