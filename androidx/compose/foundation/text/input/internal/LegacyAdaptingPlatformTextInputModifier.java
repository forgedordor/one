package androidx.compose.foundation.text.input.internal;

import defpackage.faj;
import defpackage.fdbq;
import defpackage.ffv;
import defpackage.ffy;
import defpackage.fmx;
import defpackage.icr;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LegacyAdaptingPlatformTextInputModifier extends jdy<ffv> {
    private final ffy a;
    private final faj b;
    private final fmx c;

    public LegacyAdaptingPlatformTextInputModifier(ffy ffyVar, faj fajVar, fmx fmxVar) {
        this.a = ffyVar;
        this.b = fajVar;
        this.c = fmxVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new ffv(this.a, this.b, this.c);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        ffv ffvVar = (ffv) icrVar;
        if (ffvVar.C) {
            ffvVar.a.f();
            ffvVar.a.l(ffvVar);
        }
        ffvVar.a = this.a;
        if (ffvVar.C) {
            ffvVar.a.k(ffvVar);
        }
        ffvVar.b = this.b;
        ffvVar.c = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        return fdbq.f(this.a, legacyAdaptingPlatformTextInputModifier.a) && fdbq.f(this.b, legacyAdaptingPlatformTextInputModifier.b) && fdbq.f(this.c, legacyAdaptingPlatformTextInputModifier.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.a + ", legacyTextFieldState=" + this.b + ", textFieldSelectionManager=" + this.c + ')';
    }
}
