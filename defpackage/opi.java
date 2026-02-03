package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class opi extends oun implements ouq, oqy {
    private final owd g;
    private final Object h;
    private int i;
    private int j;
    private int k;
    private int l;
    private final orc m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public opi(owd owdVar, fdjx fdjxVar, fdjq fdjqVar, fdjq fdjqVar2, ouj oujVar, owb owbVar, Object obj) {
        super(owdVar, fdjxVar, fdjqVar, new our(), oujVar);
        owbVar.getClass();
        this.g = owdVar;
        this.h = obj;
        this.k = Alert.DURATION_SHOW_INDEFINITELY;
        this.l = Integer.MIN_VALUE;
        our ourVar = this.c;
        ourVar.getClass();
        this.m = new orc(fdjxVar, oujVar, owdVar, fdjqVar, fdjqVar2, this, ourVar);
        our ourVar2 = this.c;
        int i = owbVar.e;
        int i2 = i != Integer.MIN_VALUE ? i : 0;
        int i3 = owbVar.f;
        int i4 = i3 != Integer.MIN_VALUE ? i3 : 0;
        boolean z = (i == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE) ? false : true;
        ourVar2.b = i2;
        List list = ourVar2.a;
        list.clear();
        list.add(owbVar);
        ourVar2.c = i4;
        ourVar2.d = 0;
        List list2 = owbVar.b;
        ourVar2.f = list2.size();
        ourVar2.e = z;
        ourVar2.g = list2.size() / 2;
        e(ourVar2.f());
    }

    @Override // defpackage.oun
    public final owd a() {
        return this.g;
    }

    @Override // defpackage.oun
    public final Object b() {
        Object objB;
        ouj oujVar = this.d;
        oujVar.getClass();
        our ourVar = this.c;
        List list = ourVar.a;
        owe oweVar = list.isEmpty() ? null : new owe(fcva.ao(list), Integer.valueOf(ourVar.b()), new ouv(oujVar.a, oujVar.b, true, oujVar.c, Alert.DURATION_SHOW_INDEFINITELY, 0, 32), ourVar.b);
        return (oweVar == null || (objB = this.g.b(oweVar)) == null) ? this.h : objB;
    }

    @Override // defpackage.oun
    public final void c(fdat fdatVar) {
        ouk oukVar = this.m.d;
        fdatVar.a(orr.a, oukVar.b);
        fdatVar.a(orr.b, oukVar.c);
        fdatVar.a(orr.c, oukVar.d);
    }

    @Override // defpackage.oun
    public final void d(int i) {
        our ourVar = this.c;
        int i2 = this.d.b;
        int i3 = ourVar.b;
        int i4 = i2 - (i - i3);
        int i5 = i3 + ourVar.f;
        int i6 = i2 + i;
        int iMax = Math.max(i4, this.i);
        this.i = iMax;
        if (iMax > 0) {
            orc orcVar = this.m;
            orp orpVar = orcVar.d.c;
            if ((orpVar instanceof oro) && !orpVar.c) {
                orcVar.d();
            }
        }
        int iMax2 = Math.max((i6 + 1) - i5, this.j);
        this.j = iMax2;
        if (iMax2 > 0) {
            orc orcVar2 = this.m;
            orp orpVar2 = orcVar2.d.d;
            if ((orpVar2 instanceof oro) && !orpVar2.c) {
                orcVar2.c();
            }
        }
        this.k = Math.min(this.k, i);
        this.l = Math.max(this.l, i);
    }

    @Override // defpackage.ouq
    public final void e(int i) {
        s(0, i);
        our ourVar = this.c;
        if (ourVar.b <= 0) {
            int i2 = ourVar.c;
        }
    }

    @Override // defpackage.ouq
    public final void f(int i, int i2, int i3) {
        r(i, i2);
        s(i + i2, i3);
    }

    @Override // defpackage.ouq
    public final void g(int i, int i2, int i3) {
        r(i, i2);
        s(0, i3);
        this.k += i3;
        this.l += i3;
    }

    @Override // defpackage.oqy
    public final void h(orr orrVar, orp orpVar) {
        fdil.d(this.a, this.b, null, new oum(this, orrVar, orpVar, null), 2);
    }

    @Override // defpackage.oun
    public final void i(orr orrVar, orp orpVar) {
        orrVar.getClass();
        this.m.d.b(orrVar, orpVar);
    }

    @Override // defpackage.oun
    public final boolean j() {
        return this.m.e();
    }

    @Override // defpackage.oqy
    public final boolean k(orr orrVar, owb owbVar) {
        orrVar.getClass();
        owbVar.getClass();
        m();
        our ourVar = this.c;
        int i = ourVar.b;
        int i2 = ourVar.f;
        List list = owbVar.b;
        if (orrVar == orr.c) {
            int size = list.size();
            if (size != 0) {
                ourVar.a.add(owbVar);
                ourVar.f += size;
                int iMin = Math.min(ourVar.c, size);
                int i3 = size - iMin;
                if (iMin != 0) {
                    ourVar.c -= iMin;
                } else {
                    iMin = 0;
                }
                f((ourVar.b + ourVar.f) - size, iMin, i3);
            }
            int size2 = this.j - list.size();
            this.j = size2;
            return size2 > 0 && !list.isEmpty();
        }
        if (orrVar != orr.b) {
            Objects.toString(orrVar);
            throw new IllegalArgumentException("unexpected result type ".concat(orrVar.toString()));
        }
        int size3 = list.size();
        if (size3 != 0) {
            ourVar.a.add(0, owbVar);
            ourVar.f += size3;
            int iMin2 = Math.min(ourVar.b, size3);
            int i4 = size3 - iMin2;
            if (iMin2 != 0) {
                ourVar.b -= iMin2;
            } else {
                iMin2 = 0;
            }
            ourVar.d -= i4;
            g(ourVar.b, iMin2, i4);
        }
        int size4 = this.i - list.size();
        this.i = size4;
        return size4 > 0 && !list.isEmpty();
    }
}
