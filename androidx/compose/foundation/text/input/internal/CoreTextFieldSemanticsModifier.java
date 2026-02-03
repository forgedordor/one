package androidx.compose.foundation.text.input.internal;

import defpackage.faj;
import defpackage.fdae;
import defpackage.fdbq;
import defpackage.feu;
import defpackage.ffi;
import defpackage.fmx;
import defpackage.icr;
import defpackage.igr;
import defpackage.jdy;
import defpackage.jfz;
import defpackage.jyo;
import defpackage.kdy;
import defpackage.kel;
import defpackage.kew;
import defpackage.kfm;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class CoreTextFieldSemanticsModifier extends jdy<ffi> {
    private final kfm a;
    private final kew b;
    private final faj c;
    private final boolean d = false;
    private final boolean f;
    private final boolean g;
    private final kel h;
    private final fmx i;
    private final kdy j;
    private final igr k;

    public CoreTextFieldSemanticsModifier(kfm kfmVar, kew kewVar, faj fajVar, boolean z, boolean z2, kel kelVar, fmx fmxVar, kdy kdyVar, igr igrVar) {
        this.a = kfmVar;
        this.b = kewVar;
        this.c = fajVar;
        this.f = z;
        this.g = z2;
        this.h = kelVar;
        this.i = fmxVar;
        this.j = kdyVar;
        this.k = igrVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new ffi(this.a, this.b, this.c, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        final ffi ffiVar = (ffi) icrVar;
        boolean z = ffiVar.d;
        boolean z2 = ffiVar.e;
        kdy kdyVar = ffiVar.h;
        fmx fmxVar = ffiVar.g;
        ffiVar.a = this.a;
        kew kewVar = this.b;
        ffiVar.b = kewVar;
        ffiVar.c = this.c;
        boolean z3 = this.f;
        ffiVar.d = z3;
        ffiVar.f = this.h;
        fmx fmxVar2 = this.i;
        ffiVar.g = fmxVar2;
        kdy kdyVar2 = this.j;
        ffiVar.h = kdyVar2;
        ffiVar.i = this.k;
        if (z3 != z || !fdbq.f(kdyVar2, kdyVar) || this.g != z2 || !jyo.i(kewVar.c)) {
            jfz.a(ffiVar);
        }
        if (fdbq.f(fmxVar2, fmxVar)) {
            return;
        }
        fmxVar2.g = new fdae() { // from class: fev
            @Override // defpackage.fdae
            public final Object invoke() {
                jbg.i(ffiVar);
                return fctx.a;
            }
        };
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreTextFieldSemanticsModifier)) {
            return false;
        }
        CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier = (CoreTextFieldSemanticsModifier) obj;
        if (!fdbq.f(this.a, coreTextFieldSemanticsModifier.a) || !fdbq.f(this.b, coreTextFieldSemanticsModifier.b) || !fdbq.f(this.c, coreTextFieldSemanticsModifier.c)) {
            return false;
        }
        boolean z = coreTextFieldSemanticsModifier.d;
        return this.f == coreTextFieldSemanticsModifier.f && this.g == coreTextFieldSemanticsModifier.g && fdbq.f(this.h, coreTextFieldSemanticsModifier.h) && fdbq.f(this.i, coreTextFieldSemanticsModifier.i) && fdbq.f(this.j, coreTextFieldSemanticsModifier.j) && fdbq.f(this.k, coreTextFieldSemanticsModifier.k);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        kel kelVar = this.h;
        boolean z = this.g;
        return (((((((((((((iHashCode * 31) + feu.a(false)) * 31) + feu.a(this.f)) * 31) + feu.a(z)) * 31) + kelVar.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode();
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.a + ", value=" + this.b + ", state=" + this.c + ", readOnly=false, enabled=" + this.f + ", isPassword=" + this.g + ", offsetMapping=" + this.h + ", manager=" + this.i + ", imeOptions=" + this.j + ", focusRequester=" + this.k + ')';
    }
}
