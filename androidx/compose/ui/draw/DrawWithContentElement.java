package androidx.compose.ui.draw;

import defpackage.fdap;
import defpackage.icr;
import defpackage.ifd;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DrawWithContentElement extends jdy<ifd> {
    private final fdap a;

    public DrawWithContentElement(fdap fdapVar) {
        this.a = fdapVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new ifd(this.a);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        ((ifd) icrVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithContentElement) && this.a == ((DrawWithContentElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
