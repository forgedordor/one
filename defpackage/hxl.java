package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxl implements hqs {
    public hum a;
    public final hum b;
    public final hum c;
    public cva d;
    private Set e;
    private final hum f;
    private final cva g;
    private cva h;
    private final List i;
    private final cug j;
    private final cug k;
    private final List l;
    private final cug m;
    private final cug n;
    private ibk o;

    public hxl() {
        hum humVar = new hum(new hqu[16]);
        this.f = humVar;
        int i = cvs.a;
        cva cvaVar = new cva((byte[]) null);
        this.g = cvaVar;
        this.a = humVar;
        this.h = cvaVar;
        this.b = new hum(new Object[16]);
        this.c = new hum(new fdae[16]);
        this.i = new ArrayList();
        this.j = new cug((byte[]) null);
        this.k = new cug((byte[]) null);
        this.l = new ArrayList();
        this.m = new cug((byte[]) null);
        this.n = new cug((byte[]) null);
    }

    private final void h(int i) {
        List list = this.i;
        if (list.isEmpty()) {
            return;
        }
        List list2 = this.l;
        cug cugVar = this.m;
        cug cugVar2 = this.n;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            try {
                cug cugVar3 = this.k;
                if (i3 >= cugVar3.b) {
                    break;
                }
                if (i <= cugVar3.a(i3)) {
                    Object objRemove = list.remove(i3);
                    int iC = cugVar3.c(i3);
                    int iC2 = this.j.c(i3);
                    list2.add(objRemove);
                    cugVar.f(iC);
                    cugVar2.f(iC2);
                } else {
                    i3++;
                }
            } finally {
                list2.clear();
                cugVar.d();
                cugVar2.d();
            }
        }
        if (!list2.isEmpty()) {
            int size = list2.size() - 1;
            while (i2 < size) {
                int i4 = i2 + 1;
                int size2 = list2.size();
                for (int i5 = i4; i5 < size2; i5++) {
                    int iA = cugVar.a(i2);
                    int iA2 = cugVar.a(i5);
                    if (iA < iA2 || (iA2 == iA && cugVar2.a(i2) < cugVar2.a(i5))) {
                        Object obj = list2.get(i2);
                        list2.set(i2, list2.get(i5));
                        list2.set(i5, obj);
                        hxm.a(cugVar2, i2, i5);
                        hxm.a(cugVar, i2, i5);
                    }
                }
                i2 = i4;
            }
            hum humVar = this.b;
            humVar.p(humVar.b, list2);
        }
    }

    @Override // defpackage.hqs
    public final void a(hqu hquVar, int i, int i2, int i3) {
        if (this.h.j(hquVar)) {
            this.h.i(hquVar);
            this.a.m(hquVar);
            Set set = this.e;
            if (set == null) {
                return;
            } else {
                set.add(hquVar.a);
            }
        }
        f(hquVar, i, i2, i3);
    }

    @Override // defpackage.hqs
    public final void b(hqu hquVar) {
        this.a.n(hquVar);
        this.h.g(hquVar);
    }

    public final void c() {
        this.e = null;
        this.o = null;
        hum humVar = this.f;
        humVar.g();
        cva cvaVar = this.g;
        cvaVar.a();
        this.a = humVar;
        this.h = cvaVar;
        this.b.g();
        this.c.g();
        this.d = null;
        this.i.clear();
        this.j.d();
        this.k.d();
    }

    public final void d() {
        Set set = this.e;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            cvc cvcVar = new cvc((cvd) set);
            while (cvcVar.hasNext()) {
                hqt hqtVar = (hqt) cvcVar.next();
                cvcVar.remove();
                hqtVar.g();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void e() {
        Set set = this.e;
        if (set == null) {
            return;
        }
        h(Integer.MIN_VALUE);
        hum humVar = this.b;
        if (humVar.b != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                cva cvaVar = this.d;
                int i = humVar.b;
                while (true) {
                    i--;
                    if (i < 0) {
                        break;
                    }
                    Object obj = humVar.a[i];
                    try {
                        if (obj instanceof hqu) {
                            hqt hqtVar = ((hqu) obj).a;
                            set.remove(hqtVar);
                            hqtVar.h();
                        }
                        if (obj instanceof hmh) {
                            if (cvaVar == null || !cvaVar.j(obj)) {
                                ((hmh) obj).b();
                            } else {
                                ((hmh) obj).c();
                            }
                        }
                    } catch (Throwable th) {
                        ibk ibkVar = this.o;
                        if (ibkVar != null) {
                            ibkVar.b(th, obj);
                        }
                        throw th;
                    }
                }
            } finally {
            }
        }
        hum humVar2 = this.f;
        if (humVar2.b != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = this.e;
                if (set2 != null) {
                    Object[] objArr = humVar2.a;
                    int i2 = humVar2.b;
                    for (int i3 = 0; i3 < i2; i3++) {
                        hqu hquVar = (hqu) objArr[i3];
                        hqt hqtVar2 = hquVar.a;
                        set2.remove(hqtVar2);
                        try {
                            hqtVar2.i();
                        } catch (Throwable th2) {
                            ibk ibkVar2 = this.o;
                            if (ibkVar2 != null) {
                                ibkVar2.b(th2, hquVar);
                            }
                            throw th2;
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final void f(Object obj, int i, int i2, int i3) {
        h(i);
        if (i3 < 0 || i3 >= i) {
            this.b.n(obj);
            return;
        }
        this.i.add(obj);
        this.j.f(i2);
        this.k.f(i3);
    }

    public final void g(Set set, ibk ibkVar) {
        c();
        this.e = set;
        this.o = ibkVar;
    }
}
