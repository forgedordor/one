package androidx.compose.foundation.text.modifiers;

import defpackage.fdbq;
import defpackage.fhj;
import defpackage.icr;
import defpackage.ijh;
import defpackage.jbq;
import defpackage.jci;
import defpackage.jdy;
import defpackage.jfz;
import defpackage.jyq;
import defpackage.kbi;
import defpackage.khx;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TextStringSimpleElement extends jdy<fhj> {
    private final String a;
    private final jyq b;
    private final kbi c;
    private final int d;
    private final boolean f;
    private final int g;
    private final int h;
    private final ijh i;

    public TextStringSimpleElement(String str, jyq jyqVar, kbi kbiVar, int i, boolean z, int i2, int i3, ijh ijhVar) {
        this.a = str;
        this.b = jyqVar;
        this.c = kbiVar;
        this.d = i;
        this.f = z;
        this.g = i2;
        this.h = i3;
        this.i = ijhVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new fhj(this.a, this.b, this.c, this.d, this.f, this.g, this.h, this.i);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        fhj fhjVar = (fhj) icrVar;
        ijh ijhVar = fhjVar.h;
        ijh ijhVar2 = this.i;
        boolean zF = fdbq.f(ijhVar2, ijhVar);
        fhjVar.h = ijhVar2;
        boolean z = false;
        boolean z2 = true;
        boolean z3 = (zF && this.b.w(fhjVar.b)) ? false : true;
        String str = this.a;
        if (!fdbq.f(fhjVar.a, str)) {
            fhjVar.a = str;
            fhjVar.i();
            z = true;
        }
        jyq jyqVar = this.b;
        int i = this.h;
        int i2 = this.g;
        boolean z4 = this.f;
        kbi kbiVar = this.c;
        int i3 = this.d;
        boolean z5 = !fhjVar.b.x(jyqVar);
        fhjVar.b = jyqVar;
        if (fhjVar.g != i) {
            fhjVar.g = i;
            z5 = true;
        }
        if (fhjVar.f != i2) {
            fhjVar.f = i2;
            z5 = true;
        }
        if (fhjVar.e != z4) {
            fhjVar.e = z4;
            z5 = true;
        }
        if (!fdbq.f(fhjVar.c, kbiVar)) {
            fhjVar.c = kbiVar;
            z5 = true;
        }
        if (khx.a(fhjVar.d, i3)) {
            z2 = z5;
        } else {
            fhjVar.d = i3;
        }
        if (z || z2) {
            fhjVar.a().f(fhjVar.a, fhjVar.b, fhjVar.c, fhjVar.d, fhjVar.e, fhjVar.f);
        }
        if (fhjVar.C) {
            if (z || (z3 && fhjVar.i != null)) {
                jfz.a(fhjVar);
            }
            if (z || z2) {
                jci.b(fhjVar);
                jbq.a(fhjVar);
            }
            if (z3) {
                jbq.a(fhjVar);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return fdbq.f(this.i, textStringSimpleElement.i) && fdbq.f(this.a, textStringSimpleElement.a) && fdbq.f(this.b, textStringSimpleElement.b) && fdbq.f(this.c, textStringSimpleElement.c) && khx.a(this.d, textStringSimpleElement.d) && this.f == textStringSimpleElement.f && this.g == textStringSimpleElement.g && this.h == textStringSimpleElement.h;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        ijh ijhVar = this.i;
        return (((((((((iHashCode * 31) + this.d) * 31) + (true != this.f ? 1237 : 1231)) * 31) + this.g) * 31) + this.h) * 31) + (ijhVar != null ? ijhVar.hashCode() : 0);
    }
}
