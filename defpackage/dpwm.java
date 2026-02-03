package defpackage;

import com.google.android.libraries.compose.ui.rendering.container.RendererContainer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dpwm extends fdbo implements fdap {
    public dpwm(Object obj) {
        super(1, obj, dpwq.class, "detachContainer", "detachContainer(Lcom/google/android/libraries/compose/ui/rendering/container/RendererContainer;)V", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        RendererContainer rendererContainer = (RendererContainer) obj;
        rendererContainer.getClass();
        dpwq dpwqVar = (dpwq) this.g;
        ekrg ekrgVar = dpwq.b;
        ((ekrd) dpwq.b.h().h("com/google/android/libraries/compose/ui/rendering/renderer/Renderer", "detachContainer", 170, "Renderer.kt")).t("Detaching to container %s from anchor", rendererContainer);
        dpvh dpvhVar = dpwqVar.f;
        if (dpvhVar != null) {
            dpvhVar.f(false);
        }
        rendererContainer.removeOnLayoutChangeListener(dpwqVar.i);
        if (!dpwqVar.d.h) {
            dpwqVar.h.b();
        }
        return fctx.a;
    }
}
