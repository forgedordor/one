package androidx.compose.ui.draw;

import defpackage.fdap;
import defpackage.icr;
import defpackage.ieu;
import defpackage.iew;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DrawWithCacheElement extends jdy<ieu> {
    private final fdap a;

    public DrawWithCacheElement(fdap fdapVar) {
        this.a = fdapVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new ieu(new iew(), this.a);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        ieu ieuVar = (ieu) icrVar;
        ieuVar.a = this.a;
        ieuVar.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithCacheElement) && this.a == ((DrawWithCacheElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
