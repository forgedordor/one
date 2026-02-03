package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ejk {
    public static /* synthetic */ void a(eio eioVar, final Object obj, fdau fdauVar, int i) {
        if (1 == (i & 1)) {
            obj = null;
        }
        eioVar.a.b(1, new eik(obj != null ? new fdap() { // from class: eil
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                ((Integer) obj2).intValue();
                return obj;
            }
        } : null, new fdap() { // from class: eim
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                ((Integer) obj2).intValue();
                return null;
            }
        }, new hxd(-857469575, true, new ein(fdauVar))));
    }

    public static /* synthetic */ void b(eio eioVar, int i, fdap fdapVar, fdav fdavVar, int i2) {
        if ((i2 & 2) != 0) {
            fdapVar = null;
        }
        eioVar.a(i, fdapVar, ejl.a, fdavVar);
    }
}
