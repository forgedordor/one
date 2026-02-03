package androidx.compose.ui.graphics;

import defpackage.fctr;
import defpackage.fcts;
import defpackage.fdbq;
import defpackage.icr;
import defpackage.iis;
import defpackage.ije;
import defpackage.ijf;
import defpackage.ijk;
import defpackage.ikk;
import defpackage.ikp;
import defpackage.iks;
import defpackage.iky;
import defpackage.ikz;
import defpackage.jbg;
import defpackage.jdy;
import defpackage.jer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GraphicsLayerElement extends jdy<iks> {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float f;
    private final float g;
    private final float j;
    private final float k;
    private final long l;
    private final ikp m;
    private final boolean n;
    private final long p;
    private final long q;
    private final int r;
    private final float h = 0.0f;
    private final float i = 0.0f;
    private final ikk o = null;
    private final int s = 3;
    private final ijf t = null;

    public GraphicsLayerElement(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, long j, ikp ikpVar, boolean z, long j2, long j3, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.f = f5;
        this.g = f6;
        this.j = f7;
        this.k = f8;
        this.l = j;
        this.m = ikpVar;
        this.n = z;
        this.p = j2;
        this.q = j3;
        this.r = i;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new iks(this.a, this.b, this.c, this.d, this.f, this.g, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        iks iksVar = (iks) icrVar;
        iksVar.a = this.a;
        iksVar.b = this.b;
        iksVar.c = this.c;
        iksVar.d = this.d;
        iksVar.e = this.f;
        iksVar.f = this.g;
        iksVar.g = this.j;
        iksVar.h = this.k;
        iksVar.i = this.l;
        iksVar.j = this.m;
        iksVar.k = this.n;
        iksVar.l = this.p;
        iksVar.m = this.q;
        iksVar.n = this.r;
        iksVar.o = 3;
        jer jerVar = jbg.e(iksVar, 2).w;
        if (jerVar != null) {
            jerVar.az(iksVar.p, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        if (Float.compare(this.a, graphicsLayerElement.a) != 0 || Float.compare(this.b, graphicsLayerElement.b) != 0 || Float.compare(this.c, graphicsLayerElement.c) != 0 || Float.compare(this.d, graphicsLayerElement.d) != 0 || Float.compare(this.f, graphicsLayerElement.f) != 0 || Float.compare(this.g, graphicsLayerElement.g) != 0) {
            return false;
        }
        float f = graphicsLayerElement.h;
        if (Float.compare(0.0f, 0.0f) != 0) {
            return false;
        }
        float f2 = graphicsLayerElement.i;
        if (Float.compare(0.0f, 0.0f) != 0 || Float.compare(this.j, graphicsLayerElement.j) != 0 || Float.compare(this.k, graphicsLayerElement.k) != 0 || !ikz.d(this.l, graphicsLayerElement.l) || !fdbq.f(this.m, graphicsLayerElement.m) || this.n != graphicsLayerElement.n) {
            return false;
        }
        ikk ikkVar = graphicsLayerElement.o;
        if (!fdbq.f(null, null)) {
            return false;
        }
        long j = this.p;
        long j2 = graphicsLayerElement.p;
        long j3 = ije.a;
        if (!fcts.a(j, j2) || !fcts.a(this.q, graphicsLayerElement.q) || !ijk.b(this.r, graphicsLayerElement.r)) {
            return false;
        }
        int i = graphicsLayerElement.s;
        if (!iis.b(3, 3)) {
            return false;
        }
        ijf ijfVar = graphicsLayerElement.t;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        int iFloatToIntBits = (((((((((((((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.f)) * 31) + Float.floatToIntBits(this.g)) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(this.j)) * 31) + Float.floatToIntBits(this.k);
        long j = ikz.a;
        int iA = (((iFloatToIntBits * 31) + iky.a(this.l)) * 31) + this.m.hashCode();
        long j2 = ije.a;
        return ((((((((((iA * 31) + (true != this.n ? 1237 : 1231)) * 961) + fctr.a(this.p)) * 31) + fctr.a(this.q)) * 31) + this.r) * 31) + 3) * 31;
    }

    public final String toString() {
        return "GraphicsLayerElement(scaleX=" + this.a + ", scaleY=" + this.b + ", alpha=" + this.c + ", translationX=" + this.d + ", translationY=" + this.f + ", shadowElevation=" + this.g + ", rotationX=0.0, rotationY=0.0, rotationZ=" + this.j + ", cameraDistance=" + this.k + ", transformOrigin=" + ((Object) ikz.c(this.l)) + ", shape=" + this.m + ", clip=" + this.n + ", renderEffect=null, ambientShadowColor=" + ((Object) ije.g(this.p)) + ", spotShadowColor=" + ((Object) ije.g(this.q)) + ", compositingStrategy=" + ((Object) ijk.a(this.r)) + ", blendMode=" + ((Object) iis.a(3)) + ", colorFilter=null)";
    }
}
