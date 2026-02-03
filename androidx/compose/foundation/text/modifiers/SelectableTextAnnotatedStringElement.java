package androidx.compose.foundation.text.modifiers;

import defpackage.fbd;
import defpackage.fdap;
import defpackage.fdbq;
import defpackage.fgn;
import defpackage.fgr;
import defpackage.fhb;
import defpackage.icr;
import defpackage.ijh;
import defpackage.jci;
import defpackage.jdy;
import defpackage.juo;
import defpackage.jyq;
import defpackage.kbi;
import defpackage.khx;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SelectableTextAnnotatedStringElement extends jdy<fgn> {
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
    private final fgr l;
    private final ijh m;
    private final fbd n = null;

    public SelectableTextAnnotatedStringElement(juo juoVar, jyq jyqVar, kbi kbiVar, fdap fdapVar, int i, boolean z, int i2, int i3, List list, fdap fdapVar2, fgr fgrVar, ijh ijhVar) {
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
        this.l = fgrVar;
        this.m = ijhVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new fgn(this.a, this.b, this.c, this.d, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        fgn fgnVar = (fgn) icrVar;
        fhb fhbVar = fgnVar.b;
        ijh ijhVar = this.m;
        jyq jyqVar = this.b;
        fdap fdapVar = this.d;
        fdap fdapVar2 = this.k;
        fgr fgrVar = this.l;
        fhbVar.j(fhbVar.n(ijhVar, jyqVar), fhbVar.o(this.a), fhbVar.p(jyqVar, this.j, this.i, this.h, this.g, this.c, this.f), fhbVar.l(fdapVar, fdapVar2, fgrVar, null));
        fgnVar.a = fgrVar;
        jci.b(fgnVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        if (!fdbq.f(this.m, selectableTextAnnotatedStringElement.m) || !fdbq.f(this.a, selectableTextAnnotatedStringElement.a) || !fdbq.f(this.b, selectableTextAnnotatedStringElement.b) || !fdbq.f(this.j, selectableTextAnnotatedStringElement.j) || !fdbq.f(this.c, selectableTextAnnotatedStringElement.c)) {
            return false;
        }
        fbd fbdVar = selectableTextAnnotatedStringElement.n;
        return fdbq.f(null, null) && this.d == selectableTextAnnotatedStringElement.d && khx.a(this.f, selectableTextAnnotatedStringElement.f) && this.g == selectableTextAnnotatedStringElement.g && this.h == selectableTextAnnotatedStringElement.h && this.i == selectableTextAnnotatedStringElement.i && this.k == selectableTextAnnotatedStringElement.k && fdbq.f(this.l, selectableTextAnnotatedStringElement.l);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        fdap fdapVar = this.d;
        int iHashCode2 = ((((((((((iHashCode * 31) + (fdapVar != null ? fdapVar.hashCode() : 0)) * 31) + this.f) * 31) + (true != this.g ? 1237 : 1231)) * 31) + this.h) * 31) + this.i) * 31;
        List list = this.j;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        fdap fdapVar2 = this.k;
        int iHashCode4 = ((iHashCode3 + (fdapVar2 != null ? fdapVar2.hashCode() : 0)) * 31) + this.l.hashCode();
        ijh ijhVar = this.m;
        return (iHashCode4 * 961) + (ijhVar != null ? ijhVar.hashCode() : 0);
    }
}
