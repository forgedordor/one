package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hxx implements fdap {
    final /* synthetic */ hyr a;

    public hxx(hyr hyrVar) {
        this.a = hyrVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object objA;
        hox hoxVar = (hox) obj;
        if (!(hoxVar instanceof hzy)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        hzy hzyVar = (hzy) hoxVar;
        if (hzyVar.a() != null) {
            hyr hyrVar = this.a;
            Object objA2 = hzyVar.a();
            objA2.getClass();
            objA = hyrVar.a(objA2);
        } else {
            objA = null;
        }
        return new hpl(objA, hzyVar.f());
    }
}
