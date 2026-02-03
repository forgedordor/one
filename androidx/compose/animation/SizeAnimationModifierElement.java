package androidx.compose.animation;

import defpackage.dcw;
import defpackage.dew;
import defpackage.fdat;
import defpackage.fdbq;
import defpackage.iby;
import defpackage.icr;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SizeAnimationModifierElement extends jdy<dcw> {
    private final dew a;
    private final iby b;
    private final fdat c = null;

    public SizeAnimationModifierElement(dew dewVar, iby ibyVar) {
        this.a = dewVar;
        this.b = ibyVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new dcw(this.a, this.b);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        dcw dcwVar = (dcw) icrVar;
        dcwVar.a = this.a;
        dcwVar.b = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeAnimationModifierElement)) {
            return false;
        }
        SizeAnimationModifierElement sizeAnimationModifierElement = (SizeAnimationModifierElement) obj;
        if (!fdbq.f(this.a, sizeAnimationModifierElement.a) || !fdbq.f(this.b, sizeAnimationModifierElement.b)) {
            return false;
        }
        fdat fdatVar = sizeAnimationModifierElement.c;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        return ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
    }

    public final String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.a + ", alignment=" + this.b + ", finishedListener=null)";
    }
}
