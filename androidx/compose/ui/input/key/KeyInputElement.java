package androidx.compose.ui.input.key;

import defpackage.fdap;
import defpackage.icr;
import defpackage.iqm;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class KeyInputElement extends jdy<iqm> {
    private final fdap a;
    private final fdap b;

    public KeyInputElement(fdap fdapVar, fdap fdapVar2) {
        this.a = fdapVar;
        this.b = fdapVar2;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new iqm(this.a, this.b);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        iqm iqmVar = (iqm) icrVar;
        iqmVar.a = this.a;
        iqmVar.b = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return this.a == keyInputElement.a && this.b == keyInputElement.b;
    }

    public final int hashCode() {
        fdap fdapVar = this.a;
        int iHashCode = fdapVar != null ? fdapVar.hashCode() : 0;
        fdap fdapVar2 = this.b;
        return (iHashCode * 31) + (fdapVar2 != null ? fdapVar2.hashCode() : 0);
    }
}
