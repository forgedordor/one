package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acoe implements acod {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/home/ConversationListRootFragmentPeerDelegate");
    private final ea b;
    private final efwo c;

    public acoe(ea eaVar, efwo efwoVar) {
        this.b = eaVar;
        this.c = efwoVar;
    }

    @Override // defpackage.acod
    public final ea a() {
        ea eaVarH = this.b.I().h("home_fragment_tag");
        if ((eaVarH instanceof acom) && ((acom) eaVarH).aF()) {
            return eaVarH;
        }
        return null;
    }

    @Override // defpackage.acod
    public final void b() {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "ConversationListRootFragmentPeerDelegate");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/home/ConversationListRootFragmentPeerDelegate", "attachNewHomeFragment", 32, "ConversationListRootFragmentPeerDelegate.kt")).q("Adding a new home fragment");
        acom acomVarA = acom.a(this.c);
        cg cgVar = new cg(this.b.I());
        cgVar.x(R.id.home_fragment_container, acomVarA, "home_fragment_tag");
        cgVar.c();
    }

    @Override // defpackage.acod
    public final void c() {
        ea eaVarA = a();
        if (eaVarA != null) {
            cg cgVar = new cg(this.b.I());
            cgVar.o(eaVarA);
            cgVar.c();
        }
        this.b.I().al();
    }
}
