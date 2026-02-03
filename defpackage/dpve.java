package defpackage;

import com.google.android.libraries.compose.ui.rendering.container.RendererContainer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpve extends fdcy {
    final /* synthetic */ dpvh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpve(Object obj, dpvh dpvhVar) {
        super(obj);
        this.a = dpvhVar;
    }

    @Override // defpackage.fdcy
    protected final void a(fdeh fdehVar, Object obj, Object obj2) {
        if (((Boolean) obj2).booleanValue()) {
            dpvh dpvhVar = this.a;
            RendererContainer rendererContainer = dpvhVar.c;
            rendererContainer.a = dpvhVar.m;
            rendererContainer.setOnTouchListener(dpvhVar.n);
            return;
        }
        dpvh dpvhVar2 = this.a;
        dpvhVar2.g();
        RendererContainer rendererContainer2 = dpvhVar2.c;
        rendererContainer2.a = null;
        rendererContainer2.setOnTouchListener(null);
        if (dpvhVar2.q >= 0.0f) {
            dpvhVar2.e();
        }
    }

    @Override // defpackage.fdcy
    protected final boolean b(Object obj, Object obj2) {
        return !fdbq.f(obj, obj2);
    }
}
