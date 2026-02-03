package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.rcs.setup.RcsWelcomeMessageView;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czrt implements agzt {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/ui/rcs/setup/RcsWelcomeMessagePopup");
    public final fcsu b;
    public Optional c = Optional.empty();
    cpdw d;
    private final eosc e;
    private final eosc f;
    private agzy g;

    public czrt(eosc eoscVar, eosc eoscVar2, fcsu fcsuVar) {
        this.e = eoscVar;
        this.f = eoscVar2;
        this.b = fcsuVar;
    }

    @Override // defpackage.agzt
    public final eiju b() {
        return ((cjyi) this.b.b()).c().h(new ejvr() { // from class: czrs
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cjzh cjzhVar = (cjzh) ((Optional) obj).orElse(null);
                if (cjzhVar == null) {
                    ((ekrd) ((ekrd) czrt.a.e()).h("com/google/android/apps/messaging/ui/rcs/setup/RcsWelcomeMessagePopup", "wantsToShowForAllSims", 79, "RcsWelcomeMessagePopup.java")).q("wantsToShowForAllSims: request is null");
                    return false;
                }
                czrt czrtVar = this.a;
                ((ekrd) ((ekrd) czrt.a.e()).h("com/google/android/apps/messaging/ui/rcs/setup/RcsWelcomeMessagePopup", "wantsToShowForAllSims", 83, "RcsWelcomeMessagePopup.java")).t("wantsToShowForAllSims: setting welcome message request for simId: %s", cjzhVar.a);
                czrtVar.c = Optional.of(cjzhVar);
                return true;
            }
        }, this.e);
    }

    @Override // defpackage.agzt
    public final void c(agzy agzyVar, ViewGroup viewGroup) {
        this.g = agzyVar;
        this.d = new cpdw(viewGroup, R.id.conversation_list_rcs_welcome_message_stub, R.id.conversation_list_rcs_welcome_message);
    }

    @Override // defpackage.agzt
    public final void d() {
        this.d.e();
        this.g.b();
        final String str = (String) this.c.map(new Function() { // from class: czrq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((cjzh) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(null);
        if (str == null) {
            ((ekrd) ((ekrd) a.e()).h("com/google/android/apps/messaging/ui/rcs/setup/RcsWelcomeMessagePopup", "hide", 119, "RcsWelcomeMessagePopup.java")).q("hide: simId is null");
        } else {
            eijx.f(new Runnable() { // from class: czrr
                @Override // java.lang.Runnable
                public final void run() {
                    ((cjyi) this.a.b.b()).i(new dggp(str), true);
                }
            }, this.f).k(auvh.b(), eoqg.a);
        }
    }

    @Override // defpackage.agzt
    public final boolean e(Context context, ViewGroup viewGroup, boolean z) {
        if (((cjzh) this.c.orElse(null)) == null) {
            ((ekrd) ((ekrd) a.e()).h("com/google/android/apps/messaging/ui/rcs/setup/RcsWelcomeMessagePopup", "show", 96, "RcsWelcomeMessagePopup.java")).q("show: welcome message is missing");
            return false;
        }
        ((RcsWelcomeMessageView) this.d.b()).H().b = this;
        final cjzh cjzhVar = (cjzh) this.c.orElse(null);
        if (cjzhVar != null) {
            final czrx czrxVarH = ((RcsWelcomeMessageView) this.d.b()).H();
            czrxVarH.c.setText(cjzhVar.b);
            czrxVarH.d.setText(cjzhVar.c);
            RcsWelcomeMessageView rcsWelcomeMessageView = czrxVarH.e;
            TextView textView = (TextView) rcsWelcomeMessageView.findViewById(R.id.rcs_welcome_message_settings_button);
            if (cjzhVar.d) {
                textView.setOnClickListener(new View.OnClickListener() { // from class: czrv
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) throws IOException {
                        ((ekrd) ((ekrd) czrx.a.e()).h("com/google/android/apps/messaging/ui/rcs/setup/RcsWelcomeMessageViewPeer", "navigateToSettings", 88, "RcsWelcomeMessageViewPeer.java")).q("RcsWelcomeMessage: Settings");
                        czrx czrxVar = czrxVarH;
                        aijh aijhVar = (aijh) czrxVar.f.b();
                        RcsWelcomeMessageView rcsWelcomeMessageView2 = czrxVar.e;
                        eiid.o(rcsWelcomeMessageView2.getContext(), aijhVar.n(rcsWelcomeMessageView2.getContext()));
                        czrt czrtVar = czrxVar.b;
                        if (czrtVar != null) {
                            czrtVar.d();
                        }
                        ((cjya) czrxVar.g.b()).h(cjzhVar.a, emfc.RCS_PROVISIONING_WELCOME_MESSAGE_SETTINGS_CLICKED);
                    }
                });
            } else {
                textView.setVisibility(8);
            }
            ((TextView) rcsWelcomeMessageView.findViewById(R.id.rcs_welcome_message_got_it_button)).setOnClickListener(new View.OnClickListener() { // from class: czrw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ((ekrd) ((ekrd) czrx.a.e()).h("com/google/android/apps/messaging/ui/rcs/setup/RcsWelcomeMessageViewPeer", "acceptPopup", 102, "RcsWelcomeMessageViewPeer.java")).q("RcsWelcomeMessage: Accepted");
                    czrx czrxVar = czrxVarH;
                    czrt czrtVar = czrxVar.b;
                    if (czrtVar != null) {
                        czrtVar.d();
                    }
                    ((cjya) czrxVar.g.b()).h(cjzhVar.a, emfc.RCS_PROVISIONING_WELCOME_MESSAGE_ACCEPTED);
                }
            });
            ((cjya) czrxVarH.g.b()).h(cjzhVar.a, emfc.RCS_PROVISIONING_WELCOME_MESSAGE_SEEN);
        }
        this.d.g(0);
        return true;
    }

    @Override // defpackage.agzt
    public final int f() {
        return 5;
    }

    @Override // defpackage.agzt
    public final void g() {
        if (this.d.a() != 8) {
            d();
        }
    }

    @Override // defpackage.agzt
    public final /* synthetic */ int n() {
        return agzs.a();
    }
}
