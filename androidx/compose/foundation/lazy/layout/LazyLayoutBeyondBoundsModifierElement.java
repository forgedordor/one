package androidx.compose.foundation.lazy.layout;

import defpackage.dwm;
import defpackage.enc;
import defpackage.enh;
import defpackage.eni;
import defpackage.fdbq;
import defpackage.icr;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsModifierElement extends jdy<enh> {
    private final eni a;
    private final enc b;
    private final boolean c;
    private final dwm d;

    public LazyLayoutBeyondBoundsModifierElement(eni eniVar, enc encVar, boolean z, dwm dwmVar) {
        this.a = eniVar;
        this.b = encVar;
        this.c = z;
        this.d = dwmVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new enh(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        enh enhVar = (enh) icrVar;
        enhVar.a = this.a;
        enhVar.b = this.b;
        enhVar.c = this.c;
        enhVar.d = this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutBeyondBoundsModifierElement)) {
            return false;
        }
        LazyLayoutBeyondBoundsModifierElement lazyLayoutBeyondBoundsModifierElement = (LazyLayoutBeyondBoundsModifierElement) obj;
        return fdbq.f(this.a, lazyLayoutBeyondBoundsModifierElement.a) && fdbq.f(this.b, lazyLayoutBeyondBoundsModifierElement.b) && this.c == lazyLayoutBeyondBoundsModifierElement.c && this.d == lazyLayoutBeyondBoundsModifierElement.d;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + (true != this.c ? 1237 : 1231)) * 31) + this.d.hashCode();
    }
}
