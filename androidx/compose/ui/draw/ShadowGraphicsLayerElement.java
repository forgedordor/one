package androidx.compose.ui.draw;

import defpackage.fctr;
import defpackage.fcts;
import defpackage.fdbq;
import defpackage.icr;
import defpackage.ifk;
import defpackage.iiv;
import defpackage.ije;
import defpackage.ikp;
import defpackage.jdy;
import defpackage.kir;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ShadowGraphicsLayerElement extends jdy<iiv> {
    public final float a;
    public final ikp b;
    public final boolean c;
    public final long d;
    public final long f;

    public ShadowGraphicsLayerElement(float f, ikp ikpVar, boolean z, long j, long j2) {
        this.a = f;
        this.b = ikpVar;
        this.c = z;
        this.d = j;
        this.f = j2;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new iiv(new ifk(this));
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        iiv iivVar = (iiv) icrVar;
        iivVar.a = new ifk(this);
        iivVar.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        if (!kir.b(this.a, shadowGraphicsLayerElement.a) || !fdbq.f(this.b, shadowGraphicsLayerElement.b) || this.c != shadowGraphicsLayerElement.c) {
            return false;
        }
        long j = this.d;
        long j2 = shadowGraphicsLayerElement.d;
        long j3 = ije.a;
        return fcts.a(j, j2) && fcts.a(this.f, shadowGraphicsLayerElement.f);
    }

    public final int hashCode() {
        int iFloatToIntBits = (Float.floatToIntBits(this.a) * 31) + this.b.hashCode();
        long j = ije.a;
        return (((((iFloatToIntBits * 31) + (true != this.c ? 1237 : 1231)) * 31) + fctr.a(this.d)) * 31) + fctr.a(this.f);
    }

    public final String toString() {
        return "ShadowGraphicsLayerElement(elevation=" + ((Object) kir.a(this.a)) + ", shape=" + this.b + ", clip=" + this.c + ", ambientColor=" + ((Object) ije.g(this.d)) + ", spotColor=" + ((Object) ije.g(this.f)) + ')';
    }
}
