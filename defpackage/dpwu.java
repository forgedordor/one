package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.compose.ui.rendering.container.RendererContainer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpwu extends ea implements dpcg {
    public static final ekrg a = ekrg.c("com/google/android/libraries/compose/ui/rendering/renderer/RendererFragment");
    public Integer b;
    public RendererContainer c;

    public dpwu() {
        this.Z.c(new dpwt());
    }

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.renderer_root, viewGroup, false);
    }

    public final void a(final dpxo dpxoVar, dpux dpuxVar) {
        final fr frVarI = I();
        frVarI.getClass();
        dpuy.a(dpuxVar, frVarI, false, new fdap() { // from class: dpws
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                gg ggVar = (gg) obj;
                ggVar.getClass();
                dpxo dpxoVar2 = dpxoVar;
                ea eaVarH = frVarI.h(dpxoVar2.t().name());
                if (eaVarH == null) {
                    ggVar.t(R.id.renderer_root, dpxoVar2, dpxoVar2.t().name());
                } else if (fdbq.f(eaVarH, dpxoVar2)) {
                    ggVar.q(dpxoVar2);
                } else {
                    ggVar.x(R.id.renderer_root, dpxoVar2, dpxoVar2.t().name());
                }
                return fctx.a;
            }
        });
    }

    @Override // defpackage.ea
    public final void ap(View view, Bundle bundle) {
        view.getClass();
        this.c = (RendererContainer) view;
        if (bundle != null && bundle.getBoolean("is_hidden")) {
            cg cgVar = new cg(J());
            cgVar.l(this);
            cgVar.j();
        }
        Integer num = this.b;
        if (num != null) {
            int iIntValue = num.intValue();
            RendererContainer rendererContainer = this.c;
            if (rendererContainer == null) {
                fdbq.c("root");
                rendererContainer = null;
            }
            rendererContainer.b(iIntValue, false);
        }
    }

    @Override // defpackage.ea
    public final void k(Bundle bundle) {
        bundle.putBoolean("is_hidden", aG());
    }
}
