package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekod extends ekfk {
    public static final ekod a = new ekod();
    final transient Object[] c;
    public final transient ekod d;
    private final transient Object e;
    private final transient int f;
    private final transient int g;

    private ekod() {
        this.e = null;
        this.c = new Object[0];
        this.f = 0;
        this.g = 0;
        this.d = this;
    }

    @Override // defpackage.ekfk
    public final ekfk a() {
        return this.d;
    }

    @Override // defpackage.ekgp
    public final ekhx f() {
        return new ekog(this, this.c, this.f, this.g);
    }

    @Override // defpackage.ekgp
    public final ekhx g() {
        return new ekoh(this, new ekoi(this.c, this.f, this.g));
    }

    @Override // defpackage.ekgp, java.util.Map
    public final Object get(Object obj) {
        Object objY = ekoj.y(this.e, this.c, this.g, this.f, obj);
        if (objY == null) {
            return null;
        }
        return objY;
    }

    @Override // defpackage.ekgp
    public final boolean hs() {
        return false;
    }

    @Override // java.util.Map
    public final int size() {
        return this.g;
    }

    @Override // defpackage.ekfk, defpackage.ekgp
    public Object writeReplace() {
        return super.writeReplace();
    }

    private ekod(Object obj, Object[] objArr, int i, ekod ekodVar) {
        this.e = obj;
        this.c = objArr;
        this.f = 1;
        this.g = i;
        this.d = ekodVar;
    }

    public ekod(Object[] objArr, int i) {
        this.c = objArr;
        this.g = i;
        this.f = 0;
        int iD = i >= 2 ? ekhx.d(i) : 0;
        this.e = ekoj.x(objArr, i, iD, 0);
        this.d = new ekod(ekoj.x(objArr, i, iD, 1), objArr, i, this);
    }
}
