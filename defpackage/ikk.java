package defpackage;

import android.graphics.RenderEffect;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ikk {
    private RenderEffect a;

    protected abstract RenderEffect a();

    public final RenderEffect b() {
        RenderEffect renderEffect = this.a;
        if (renderEffect != null) {
            return renderEffect;
        }
        RenderEffect renderEffectA = a();
        this.a = renderEffectA;
        return renderEffectA;
    }
}
