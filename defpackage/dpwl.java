package defpackage;

import android.view.View;
import com.google.android.libraries.compose.ui.rendering.container.RendererContainer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dpwl extends fdbo implements fdap {
    public dpwl(Object obj) {
        super(1, obj, dpwq.class, "attachContainer", "attachContainer(Lcom/google/android/libraries/compose/ui/rendering/container/RendererContainer;)V", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        RendererContainer rendererContainer = (RendererContainer) obj;
        rendererContainer.getClass();
        final dpwq dpwqVar = (dpwq) this.g;
        ekrg ekrgVar = dpwq.b;
        ((ekrd) dpwq.b.h().h("com/google/android/libraries/compose/ui/rendering/renderer/Renderer", "attachContainer", 161, "Renderer.kt")).t("Attaching to container %s added to anchor", rendererContainer);
        View viewA = rendererContainer.a();
        boolean z = dpwqVar.e;
        int i = z ? 0 : dpwqVar.d.e;
        viewA.getLayoutParams().height = i;
        viewA.setTranslationY(-i);
        viewA.requestLayout();
        rendererContainer.addOnLayoutChangeListener(dpwqVar.i);
        dpvh dpvhVar = null;
        if (dpwqVar.f == null) {
            dpvi dpviVar = dpwqVar.c;
            fdae fdaeVar = new fdae() { // from class: dpwd
                @Override // defpackage.fdae
                public final Object invoke() {
                    dpxo dpxoVar = dpwqVar.g;
                    if (dpxoVar != null) {
                        return dpxoVar.gw();
                    }
                    return null;
                }
            };
            dpum dpumVar = new dpum(new fdae() { // from class: dpwe
                @Override // defpackage.fdae
                public final Object invoke() {
                    return Integer.valueOf(dpwqVar.b());
                }
            }, new fdap() { // from class: dpwf
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    dpwqVar.j(((Integer) obj2).intValue());
                    return fctx.a;
                }
            });
            dpwj dpwjVar = new dpwj(dpwqVar);
            dpux dpuxVar = dpwqVar.d;
            dpwk dpwkVar = new dpwk(dpuxVar);
            View viewA2 = (dpuxVar.e <= 0 || z) ? null : rendererContainer.a();
            eony eonyVar = (eony) dpviVar.a.b();
            eonyVar.getClass();
            dpwqVar.f = new dpvh(eonyVar, rendererContainer, fdaeVar, dpumVar, dpwjVar, dpwkVar, viewA2);
        }
        dpvh dpvhVar2 = dpwqVar.f;
        if (dpvhVar2 == null) {
            fdbq.c("touchListener");
        } else {
            dpvhVar = dpvhVar2;
        }
        dpvhVar.f(true);
        dpxo dpxoVar = dpwqVar.g;
        if (dpxoVar != null && dpwqVar.d(dpxoVar.t()) == null) {
            dpwu dpwuVarC = dpwqVar.c();
            if (dpwuVarC == null) {
                throw new IllegalStateException("RendererFragment wasn't attached");
            }
            dpwuVarC.a(dpxoVar, dpwqVar.d);
        }
        dpwqVar.i(dpwqVar.b(), false);
        return fctx.a;
    }
}
