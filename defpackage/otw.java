package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class otw {
    public final ouv a;
    public final List b;
    public final List c;
    public int d;
    public int e;
    public int f;
    public final fdoa g;
    public final fdoa h;
    public final Map i;
    public final orz j;
    private int k;
    private int l;

    public otw(ouv ouvVar) {
        this.a = ouvVar;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.c = arrayList;
        this.g = fdod.a(-1, 0, 6);
        this.h = fdod.a(-1, 0, 6);
        this.i = new LinkedHashMap();
        orz orzVar = new orz();
        orzVar.d(orr.a, orn.a);
        this.j = orzVar;
    }

    public final int a() {
        if (this.a.c) {
            return this.l;
        }
        return 0;
    }

    public final int b() {
        if (this.a.c) {
            return this.k;
        }
        return 0;
    }

    public final int c() {
        Iterator it = this.c.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((owb) it.next()).b.size();
        }
        return size;
    }

    public final osg d(owb owbVar, orr orrVar) {
        int size;
        owbVar.getClass();
        orrVar.getClass();
        int iOrdinal = orrVar.ordinal();
        if (iOrdinal == 0) {
            size = 0;
        } else if (iOrdinal == 1) {
            size = -this.d;
        } else {
            if (iOrdinal != 2) {
                throw new fctg();
            }
            size = (this.c.size() - this.d) - 1;
        }
        List listB = fcva.b(new oxd(size, owbVar.b));
        int iOrdinal2 = orrVar.ordinal();
        if (iOrdinal2 == 0) {
            osd osdVar = osd.a;
            return new osd(orr.a, listB, b(), a(), this.j.b());
        }
        if (iOrdinal2 == 1) {
            osd osdVar2 = osd.a;
            return new osd(orr.b, listB, b(), -1, this.j.b());
        }
        if (iOrdinal2 != 2) {
            throw new fctg();
        }
        osd osdVar3 = osd.a;
        return new osd(orr.c, listB, -1, a(), this.j.b());
    }

    public final owe e(oxf oxfVar) {
        Integer numValueOf;
        int i;
        List list = this.c;
        List listAo = fcva.ao(list);
        if (oxfVar != null) {
            int iB = b();
            int i2 = -this.d;
            int iE = fcva.e(list) - this.d;
            int i3 = i2;
            while (true) {
                i = oxfVar.a;
                if (i3 >= i) {
                    break;
                }
                iB += i3 > iE ? this.a.a : ((owb) list.get(this.d + i3)).b.size();
                i3++;
            }
            int i4 = iB + oxfVar.b;
            if (i < i2) {
                i4 -= this.a.a;
            }
            numValueOf = Integer.valueOf(i4);
        } else {
            numValueOf = null;
        }
        return new owe(listAo, numValueOf, this.a, b());
    }

    public final void f(int i) {
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        this.l = i;
    }

    public final void g(int i) {
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        this.k = i;
    }

    public final boolean h(int i, orr orrVar, owb owbVar) {
        orrVar.getClass();
        owbVar.getClass();
        int iOrdinal = orrVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new fctg();
                }
                if (this.c.isEmpty()) {
                    throw new IllegalStateException("should've received an init before append");
                }
                if (i != this.f) {
                    return false;
                }
                this.b.add(owbVar);
                int iF = owbVar.f;
                if (iF == Integer.MIN_VALUE) {
                    iF = fddu.f(a() - owbVar.b.size(), 0);
                }
                f(iF);
                this.i.remove(orr.c);
            } else {
                if (this.c.isEmpty()) {
                    throw new IllegalStateException("should've received an init before prepend");
                }
                if (i != this.e) {
                    return false;
                }
                this.b.add(0, owbVar);
                this.d++;
                int iF2 = owbVar.e;
                if (iF2 == Integer.MIN_VALUE) {
                    iF2 = fddu.f(b() - owbVar.b.size(), 0);
                }
                g(iF2);
                this.i.remove(orr.b);
            }
        } else {
            if (!this.c.isEmpty()) {
                throw new IllegalStateException("cannot receive multiple init calls");
            }
            if (i != 0) {
                throw new IllegalStateException("init loadId must be the initial value, 0");
            }
            this.b.add(owbVar);
            this.d = 0;
            f(owbVar.f);
            g(owbVar.e);
        }
        return true;
    }
}
