package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyin implements eyik {
    private static final Object a = new Object();
    private volatile eyik b;
    private volatile Object c = a;

    private eyin(eyik eyikVar) {
        this.b = eyikVar;
    }

    public static eyik a(eyik eyikVar) {
        if ((eyikVar instanceof eyin) || (eyikVar instanceof eyie)) {
            return eyikVar;
        }
        eyikVar.getClass();
        return new eyin(eyikVar);
    }

    @Override // defpackage.fcsu
    public final Object b() {
        Object obj = this.c;
        if (obj != a) {
            return obj;
        }
        eyik eyikVar = this.b;
        if (eyikVar == null) {
            return this.c;
        }
        Object objB = eyikVar.b();
        this.c = objB;
        this.b = null;
        return objB;
    }
}
