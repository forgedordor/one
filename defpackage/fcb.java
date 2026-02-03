package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcb {
    public final faj a;
    public final fmx b;
    public final kew c;
    public final boolean d = true;
    public final boolean e;
    public final fno f;
    public final kel g;
    public final fdy h;
    public final ezi i;
    public final ezu j;
    public final fdap k;
    public final int l;

    public fcb(faj fajVar, fmx fmxVar, kew kewVar, boolean z, fno fnoVar, kel kelVar, fdy fdyVar, ezi eziVar, ezu ezuVar, fdap fdapVar, int i) {
        this.a = fajVar;
        this.b = fmxVar;
        this.c = kewVar;
        this.e = z;
        this.f = fnoVar;
        this.g = kelVar;
        this.h = fdyVar;
        this.i = eziVar;
        this.j = ezuVar;
        this.k = fdapVar;
        this.l = i;
    }

    public final void a(kdm kdmVar) {
        b(fcva.b(kdmVar));
    }

    public final void b(List list) {
        List listAq = fcva.aq(list);
        listAq.add(0, new kds());
        this.k.invoke(this.a.b.a(listAq));
    }
}
