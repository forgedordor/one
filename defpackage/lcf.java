package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lcf extends lce {
    private final Object a;

    public lcf(int i) {
        super(i);
        this.a = new Object();
    }

    @Override // defpackage.lce, defpackage.lcd
    public final Object a() {
        Object objA;
        synchronized (this.a) {
            objA = super.a();
        }
        return objA;
    }

    @Override // defpackage.lce, defpackage.lcd
    public final boolean b(Object obj) {
        boolean zB;
        obj.getClass();
        synchronized (this.a) {
            zB = super.b(obj);
        }
        return zB;
    }
}
