package androidx.compose.ui.layout;

import defpackage.fdap;
import defpackage.icr;
import defpackage.iyf;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OnSizeChangedModifier extends jdy<iyf> {
    private final fdap a;

    public OnSizeChangedModifier(fdap fdapVar) {
        this.a = fdapVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new iyf(this.a);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        iyf iyfVar = (iyf) icrVar;
        iyfVar.a = this.a;
        iyfVar.b = -9223372034707292160L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnSizeChangedModifier) && this.a == ((OnSizeChangedModifier) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
