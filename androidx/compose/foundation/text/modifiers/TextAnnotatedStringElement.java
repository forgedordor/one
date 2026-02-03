package androidx.compose.foundation.text.modifiers;

import defpackage.fdap;
import defpackage.fdbq;
import defpackage.fgr;
import defpackage.fhb;
import defpackage.icr;
import defpackage.ijh;
import defpackage.jdy;
import defpackage.juo;
import defpackage.jyq;
import defpackage.kbi;
import defpackage.khx;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TextAnnotatedStringElement extends jdy<fhb> {
    private final juo a;
    private final jyq b;
    private final kbi c;
    private final fdap d;
    private final int f;
    private final boolean g;
    private final int h;
    private final int i;
    private final List j;
    private final fdap k;
    private final fgr l = null;
    private final ijh m;
    private final fdap n;

    public TextAnnotatedStringElement(juo juoVar, jyq jyqVar, kbi kbiVar, fdap fdapVar, int i, boolean z, int i2, int i3, List list, fdap fdapVar2, ijh ijhVar, fdap fdapVar3) {
        this.a = juoVar;
        this.b = jyqVar;
        this.c = kbiVar;
        this.d = fdapVar;
        this.f = i;
        this.g = z;
        this.h = i2;
        this.i = i3;
        this.j = list;
        this.k = fdapVar2;
        this.m = ijhVar;
        this.n = fdapVar3;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new fhb(this.a, this.b, this.c, this.d, this.f, this.g, this.h, this.i, this.j, this.k, null, this.m, this.n);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        fhb fhbVar = (fhb) icrVar;
        ijh ijhVar = this.m;
        jyq jyqVar = this.b;
        fhbVar.j(fhbVar.n(ijhVar, jyqVar), fhbVar.o(this.a), fhbVar.p(jyqVar, this.j, this.i, this.h, this.g, this.c, this.f), fhbVar.l(this.d, this.k, null, this.n));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        if (!fdbq.f(this.m, textAnnotatedStringElement.m) || !fdbq.f(this.a, textAnnotatedStringElement.a) || !fdbq.f(this.b, textAnnotatedStringElement.b) || !fdbq.f(this.j, textAnnotatedStringElement.j) || !fdbq.f(this.c, textAnnotatedStringElement.c) || this.d != textAnnotatedStringElement.d || this.n != textAnnotatedStringElement.n || !khx.a(this.f, textAnnotatedStringElement.f) || this.g != textAnnotatedStringElement.g || this.h != textAnnotatedStringElement.h || this.i != textAnnotatedStringElement.i || this.k != textAnnotatedStringElement.k) {
            return false;
        }
        fgr fgrVar = textAnnotatedStringElement.l;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        fdap fdapVar = this.d;
        int iHashCode2 = ((((((((((iHashCode * 31) + (fdapVar != null ? fdapVar.hashCode() : 0)) * 31) + this.f) * 31) + (true != this.g ? 1237 : 1231)) * 31) + this.h) * 31) + this.i) * 31;
        List list = this.j;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        fdap fdapVar2 = this.k;
        int iHashCode4 = iHashCode3 + (fdapVar2 != null ? fdapVar2.hashCode() : 0);
        ijh ijhVar = this.m;
        int iHashCode5 = ((iHashCode4 * 961) + (ijhVar != null ? ijhVar.hashCode() : 0)) * 31;
        fdap fdapVar3 = this.n;
        return iHashCode5 + (fdapVar3 != null ? fdapVar3.hashCode() : 0);
    }
}
