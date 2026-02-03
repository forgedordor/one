package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwyf {
    public cwye a;
    public final cwxx b;
    public final fcsu c;
    public final fcsu d;
    private final fcsu g;
    public final AtomicReference f = new AtomicReference(Optional.empty());
    public final cpdt e = new cpdt("enable_google_tos_banner", new fdae() { // from class: cwya
        @Override // defpackage.fdae
        public final Object invoke() {
            return Boolean.valueOf(dfpi.F());
        }
    });

    static {
        ekgb.t(Integer.valueOf(R.string.fast_track_positive_button_text_experiment), Integer.valueOf(R.string.rcs_setup_accept), Integer.valueOf(R.string.google_tos_positive_button_continue));
        ekgb.t(Integer.valueOf(R.string.conversation_list_guest_cloud_onboarding_negative_link_text_v2), Integer.valueOf(R.string.google_tos_negative_link_text), Integer.valueOf(R.string.new_fast_track_negative_button_text));
    }

    public cwyf(cwxx cwxxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.b = cwxxVar;
        this.g = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        cwxxVar.p(false);
    }

    final void a(final cwye cwyeVar) {
        this.a = cwyeVar;
        if (dfpi.F()) {
            AtomicReference atomicReference = this.f;
            if (((Optional) atomicReference.get()).isPresent()) {
                cwyeVar.k((Optional) atomicReference.get());
            }
        }
        if (((Boolean) this.g.b()).booleanValue()) {
            cwxx cwxxVar = this.b;
            cwxxVar.N().findViewById(R.id.conversation_list_google_tos_popup_positive_button).setOnClickListener(new View.OnClickListener() { // from class: cwxy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    cwyeVar.j(this.a.b.fg());
                }
            });
            cwxxVar.N().findViewById(R.id.conversation_list_google_tos_popup_negative_button).setOnClickListener(new View.OnClickListener() { // from class: cwxz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    cwyeVar.i(this.a.b.fg());
                }
            });
        }
    }
}
