package defpackage;

import android.content.Intent;
import com.google.android.apps.messaging.welcome.v1.SignedInWelcomeActivity;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daus implements ehay {
    final /* synthetic */ Callable a;
    final /* synthetic */ daut b;

    public daus(Callable callable, daut dautVar) {
        this.a = callable;
        this.b = dautVar;
    }

    @Override // defpackage.ehay
    public final void a(Throwable th) throws Exception {
        this.a.call();
        ekrw ekrwVarI = daut.b.i();
        ekrwVarI.X(eksq.a, "BugleWelcome");
        ((ekrd) ((ekrd) ekrwVarI).g(th).h("com/google/android/apps/messaging/welcome/v1/WelcomeFlowV1EntryPointImpl$registerMixinCallbacks$1", "onLoadError", 92, "WelcomeFlowV1EntryPointImpl.kt")).q("Failed to load Welcome Flow launchData.");
    }

    @Override // defpackage.ehay
    public final /* bridge */ /* synthetic */ void b(Object obj) throws Exception {
        daui dauiVar = (daui) obj;
        dauh dauhVar = dauiVar.a;
        if (dauhVar == dauh.a) {
            ekrw ekrwVarH = daut.b.h();
            ekrwVarH.X(eksq.a, "BugleWelcome");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/welcome/v1/WelcomeFlowV1EntryPointImpl$registerMixinCallbacks$1", "onLoaded", 83, "WelcomeFlowV1EntryPointImpl.kt")).q("notifies that the OOBE won't launch and allows showing Popups on app startup");
            this.a.call();
            return;
        }
        final daut dautVar = this.b;
        ekrw ekrwVarH2 = daut.b.h();
        ekrwVarH2.X(eksq.a, "BugleWelcome");
        ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/welcome/v1/WelcomeFlowV1EntryPointImpl", "launchActivityInWelcomePathIfApplicable", 186, "WelcomeFlowV1EntryPointImpl.kt")).t("Welcome flow launch path is: %s", dauhVar);
        int iOrdinal = dauhVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                return;
            }
            final ctcj ctcjVar = dauiVar.b;
            final int i = true != dauiVar.c ? 8 : 7;
            Optional optional = (Optional) dautVar.h.b();
            final fdap fdapVar = new fdap() { // from class: dauk
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    ((acbn) obj2).getClass();
                    daut dautVar2 = dautVar;
                    davn davnVar = (davn) dautVar2.j.b();
                    ctcj ctcjVar2 = ctcjVar;
                    davnVar.a(ctcjVar2);
                    dautVar2.e.fg().getIntent().putExtra("EXPRESS_SIGN_IN_FLOW_KEY", i).putExtra("INTENT_EXTRA_WELCOME_FLOW_TRIGGER_SOURCE", ctcjVar2.g);
                    acbn.a((efxf) dautVar2.g.b());
                    return fctx.a;
                }
            };
            optional.ifPresent(new Consumer() { // from class: daul
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    fdapVar.invoke(obj2);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        ctcj ctcjVar2 = dauiVar.b;
        ea eaVar = dautVar.e;
        Intent intent = new Intent(eaVar.A(), (Class<?>) SignedInWelcomeActivity.class);
        efyp.c(intent, dautVar.d);
        intent.putExtra("INTENT_EXTRA_WELCOME_FLOW_TRIGGER_SOURCE", ctcjVar2.g);
        ((davn) dautVar.j.b()).a(ctcjVar2);
        eilp.a(eaVar, intent);
    }
}
