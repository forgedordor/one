package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kre {
    public static final Object a = new String("FIXED_DIMENSION");
    public static final Object b = new String("WRAP_DIMENSION");
    public static final Object c = new String("SPREAD_DIMENSION");
    public static final Object d = new String("PARENT_DIMENSION");
    public static final Object e = new String("PERCENT_DIMENSION");
    public static final Object f = new String("RATIO_DIMENSION");
    int g;
    int h;
    float i;
    int j;
    String k;
    Object l;
    boolean m;

    private kre() {
        this.g = 0;
        this.h = Alert.DURATION_SHOW_INDEFINITELY;
        this.i = 1.0f;
        this.j = 0;
        this.k = null;
        this.l = b;
        this.m = false;
    }

    public static kre a(int i) {
        kre kreVar = new kre(a);
        kreVar.l = null;
        kreVar.j = i;
        return kreVar;
    }

    public static kre b(Object obj) {
        kre kreVar = new kre(a);
        kreVar.l = obj;
        return kreVar;
    }

    public static kre c(Object obj) {
        kre kreVar = new kre();
        kreVar.f(obj);
        return kreVar;
    }

    public final void d(krz krzVar, int i) {
        String str = this.k;
        if (str != null) {
            krzVar.z(str);
        }
        int i2 = 0;
        if (i == 0) {
            if (this.m) {
                krzVar.ab(3);
                Object obj = this.l;
                if (obj == b) {
                    i2 = 1;
                } else if (obj == e) {
                    i2 = 2;
                }
                krzVar.D(i2, this.g, this.h, this.i);
                return;
            }
            int i3 = this.g;
            if (i3 > 0) {
                krzVar.K(i3);
            }
            int i4 = this.h;
            if (i4 < Integer.MAX_VALUE) {
                krzVar.I(i4);
            }
            Object obj2 = this.l;
            if (obj2 == b) {
                krzVar.ab(2);
                return;
            }
            if (obj2 == d) {
                krzVar.ab(4);
                return;
            } else {
                if (obj2 == null) {
                    krzVar.ab(1);
                    krzVar.N(this.j);
                    return;
                }
                return;
            }
        }
        if (this.m) {
            krzVar.ac(3);
            Object obj3 = this.l;
            if (obj3 == b) {
                i2 = 1;
            } else if (obj3 == e) {
                i2 = 2;
            }
            krzVar.L(i2, this.g, this.h, this.i);
            return;
        }
        int i5 = this.g;
        if (i5 > 0) {
            krzVar.J(i5);
        }
        int i6 = this.h;
        if (i6 < Integer.MAX_VALUE) {
            krzVar.H(i6);
        }
        Object obj4 = this.l;
        if (obj4 == b) {
            krzVar.ac(2);
            return;
        }
        if (obj4 == d) {
            krzVar.ac(4);
        } else if (obj4 == null) {
            krzVar.ac(1);
            krzVar.C(this.j);
        }
    }

    public final void e(int i) {
        if (i >= 0) {
            this.g = i;
        }
    }

    public final void f(Object obj) {
        this.l = obj;
        this.m = true;
    }

    public kre(Object obj) {
        this.g = 0;
        this.h = Alert.DURATION_SHOW_INDEFINITELY;
        this.i = 1.0f;
        this.j = 0;
        this.k = null;
        this.m = false;
        this.l = obj;
    }
}
