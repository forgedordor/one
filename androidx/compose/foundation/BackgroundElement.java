package androidx.compose.foundation;

import defpackage.dkn;
import defpackage.fctr;
import defpackage.fcts;
import defpackage.fdbq;
import defpackage.icr;
import defpackage.iiy;
import defpackage.ije;
import defpackage.ikp;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class BackgroundElement extends jdy<dkn> {
    private final long a;
    private final iiy b;
    private final float c;
    private final ikp d;

    public /* synthetic */ BackgroundElement(long j, iiy iiyVar, float f, ikp ikpVar, int i) {
        j = (i & 1) != 0 ? ije.h : j;
        iiyVar = (i & 2) != 0 ? null : iiyVar;
        this.a = j;
        this.b = iiyVar;
        this.c = f;
        this.d = ikpVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new dkn(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        dkn dknVar = (dkn) icrVar;
        dknVar.a = this.a;
        dknVar.b = this.b;
        dknVar.c = this.c;
        dknVar.d = this.d;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        if (backgroundElement == null) {
            return false;
        }
        long j = this.a;
        long j2 = backgroundElement.a;
        long j3 = ije.a;
        return fcts.a(j, j2) && fdbq.f(this.b, backgroundElement.b) && this.c == backgroundElement.c && fdbq.f(this.d, backgroundElement.d);
    }

    public final int hashCode() {
        long j = ije.a;
        iiy iiyVar = this.b;
        return (((((fctr.a(this.a) * 31) + (iiyVar != null ? iiyVar.hashCode() : 0)) * 31) + Float.floatToIntBits(this.c)) * 31) + this.d.hashCode();
    }
}
