package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class escx implements esgu {
    private static final Object a = new Object();
    private volatile Object b = a;
    private volatile esgu c;

    public escx(esgu esguVar) {
        this.c = esguVar;
    }

    @Override // defpackage.esgu
    public final Object a() {
        Object objA;
        Object obj = this.b;
        Object obj2 = a;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            objA = this.b;
            if (objA == obj2) {
                objA = this.c.a();
                this.b = objA;
                this.c = null;
            }
        }
        return objA;
    }
}
