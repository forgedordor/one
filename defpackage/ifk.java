package defpackage;

import androidx.compose.ui.draw.ShadowGraphicsLayerElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ifk extends fdbr implements fdap {
    final /* synthetic */ ShadowGraphicsLayerElement a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifk(ShadowGraphicsLayerElement shadowGraphicsLayerElement) {
        super(1);
        this.a = shadowGraphicsLayerElement;
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = this.a;
        ikl iklVar = (ikl) obj;
        iklVar.z(kin.d(iklVar, shadowGraphicsLayerElement.a));
        iklVar.A(shadowGraphicsLayerElement.b);
        iklVar.r(shadowGraphicsLayerElement.c);
        iklVar.b(shadowGraphicsLayerElement.d);
        iklVar.B(shadowGraphicsLayerElement.f);
        return fctx.a;
    }
}
