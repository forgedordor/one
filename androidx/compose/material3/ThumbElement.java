package androidx.compose.material3;

import defpackage.ddq;
import defpackage.dew;
import defpackage.ebk;
import defpackage.fdbq;
import defpackage.gyp;
import defpackage.icr;
import defpackage.jci;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ThumbElement extends jdy<gyp> {
    private final boolean a;
    private final dew b;
    private final ebk c;

    public ThumbElement(ebk ebkVar, boolean z, dew dewVar) {
        this.c = ebkVar;
        this.a = z;
        this.b = dewVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new gyp(this.c, this.a, this.b);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        gyp gypVar = (gyp) icrVar;
        gypVar.h = this.c;
        boolean z = gypVar.a;
        boolean z2 = this.a;
        if (z != z2) {
            jci.b(gypVar);
        }
        gypVar.a = z2;
        gypVar.b = this.b;
        if (gypVar.e == null && !Float.isNaN(gypVar.g)) {
            gypVar.e = ddq.a(gypVar.g);
        }
        if (gypVar.d != null || Float.isNaN(gypVar.f)) {
            return;
        }
        gypVar.d = ddq.a(gypVar.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThumbElement)) {
            return false;
        }
        ThumbElement thumbElement = (ThumbElement) obj;
        return fdbq.f(this.c, thumbElement.c) && this.a == thumbElement.a && fdbq.f(this.b, thumbElement.b);
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + (true != this.a ? 1237 : 1231)) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.c + ", checked=" + this.a + ", animationSpec=" + this.b + ')';
    }
}
