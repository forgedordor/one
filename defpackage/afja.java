package defpackage;

import com.google.android.apps.messaging.main.MainActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afja extends abs {
    final /* synthetic */ afjl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afja(afjl afjlVar) {
        super(false);
        this.a = afjlVar;
    }

    @Override // defpackage.abs
    public final void b() {
        afjl afjlVar = this.a;
        cqce cqceVar = afjlVar.z;
        cqceVar.p("handleBackPressed");
        ea eaVarC = afjlVar.c();
        if (eaVarC == null || !eaVarC.aF()) {
            cqceVar.m("Conversation Root fragment is not attached; ignoring back press.");
            return;
        }
        boolean zC = afjlVar.n().c();
        boolean zD = afjlVar.n().d();
        if (!zC && !zD) {
            throw new IllegalArgumentException("expecting either the contact picker or the conversation fragment to be shown");
        }
        if (zC && zD) {
            afjlVar.E();
            this.a.z.p("handled back press by delegating to conversation fragment");
            return;
        }
        afjlVar.E();
        if (!zC) {
            afjlVar.C();
        }
        if (afjlVar.J || afjlVar.b.getIntent().getBooleanExtra("should_launch_home_on_back", false)) {
            afjlVar.N = 2;
        }
        MainActivity mainActivity = afjlVar.b;
        if (!afic.a(mainActivity, afjlVar.h.a) && !afjlVar.n().b()) {
            afjl afjlVar2 = this.a;
            afjlVar2.b();
            afjlVar2.z.p("handled back press by finishing conversation");
            return;
        }
        try {
            h(false);
            mainActivity.c().d();
        } catch (IllegalStateException e) {
            ekrw ekrwVarI = afjl.a.i();
            ekrwVarI.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarI).g(e).h("com/google/android/apps/messaging/main/MainActivityPeer$LegacyDelegatingBackPressedCallback", "handleOnBackPressed", 2662, "MainActivityPeer.kt")).q("MainActivity: FragmentActivity.OnBackPressed threw IllegalStateException - continuing");
        }
    }
}
