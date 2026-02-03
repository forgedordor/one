package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eikf {
    public final eike a;
    public final eike b;
    public final eike c;
    private final ekvu d;

    public eikf(eiev eievVar) {
        if (eievVar.b()) {
            ekvu ekvuVar = ((eikf) eievVar.a()).d;
        }
        this.d = null;
        this.a = new eikb(eievVar.b() ? (ekwe) ((eikf) eievVar.a()).a.b() : null);
        this.b = new eikc(eievVar.b() ? (ekvk) ((eikf) eievVar.a()).b.b() : null);
        this.c = new eikd(eievVar.b() ? (ekvl) ((eikf) eievVar.a()).c.b() : null);
    }
}
