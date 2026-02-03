package androidx.compose.ui.input.rotary;

import defpackage.fdap;
import defpackage.icr;
import defpackage.itu;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class RotaryInputElement extends jdy<itu> {
    private final fdap a;
    private final fdap b = null;

    public RotaryInputElement(fdap fdapVar) {
        this.a = fdapVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new itu(this.a);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        ((itu) icrVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        RotaryInputElement rotaryInputElement = (RotaryInputElement) obj;
        if (this.a != rotaryInputElement.a) {
            return false;
        }
        fdap fdapVar = rotaryInputElement.b;
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
