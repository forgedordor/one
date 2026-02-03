package androidx.compose.ui.graphics;

import defpackage.fdap;
import defpackage.icr;
import defpackage.iiv;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class BlockGraphicsLayerElement extends jdy<iiv> {
    private final fdap a;

    public BlockGraphicsLayerElement(fdap fdapVar) {
        this.a = fdapVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new iiv(this.a);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        iiv iivVar = (iiv) icrVar;
        iivVar.a = this.a;
        iivVar.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && this.a == ((BlockGraphicsLayerElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
