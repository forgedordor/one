package defpackage;

import android.util.ArrayMap;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjj {
    public final Set a;
    public int b;
    public boolean c;
    public List d;
    public blk e;
    public bib f;
    private boolean g;
    private bli h;

    public bjj() {
        this.a = new HashSet();
        this.h = bli.a();
        this.b = -1;
        this.c = false;
        this.d = new ArrayList();
        this.g = false;
        this.e = blk.a();
    }

    public final Range a() {
        return (Range) this.h.n(bjl.c, bms.h);
    }

    public final bjl b() {
        ArrayList arrayList = new ArrayList(this.a);
        blo bloVarF = blo.f(this.h);
        int i = this.b;
        boolean z = this.c;
        ArrayList arrayList2 = new ArrayList(this.d);
        boolean z2 = this.g;
        blk blkVar = this.e;
        bmx bmxVar = bmx.a;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : blkVar.d()) {
            arrayMap.put(str, blkVar.c(str));
        }
        return new bjl(arrayList, bloVarF, i, z, arrayList2, z2, new bmx(arrayMap), this.f);
    }

    public final void c(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            d((bhr) it.next());
        }
    }

    public final void d(bhr bhrVar) {
        if (this.d.contains(bhrVar)) {
            return;
        }
        this.d.add(bhrVar);
    }

    public final void e(bjo bjoVar, Object obj) {
        this.h.c(bjoVar, obj);
    }

    public final void f(bjq bjqVar) {
        for (bjo bjoVar : bjqVar.s()) {
            Object objN = this.h.n(bjoVar, null);
            Object objM = bjqVar.m(bjoVar);
            if (objN instanceof blh) {
                throw null;
            }
            if (objM instanceof blh) {
                objM = ((blh) objM).clone();
            }
            this.h.d(bjoVar, bjqVar.i(bjoVar), objM);
        }
    }

    public final void g(bjz bjzVar) {
        this.a.add(bjzVar);
    }

    public final void h(String str, Object obj) {
        this.e.b(str, obj);
    }

    public final void i() {
        this.a.clear();
    }

    public final void j(Range range) {
        e(bjl.c, range);
    }

    public final void k(bjq bjqVar) {
        this.h = bli.b(bjqVar);
    }

    public final void l(int i) {
        if (i != 0) {
            e(bni.z, Integer.valueOf(i));
        }
    }

    public final void m(int i) {
        if (i != 0) {
            e(bni.A, Integer.valueOf(i));
        }
    }

    public final void n() {
        this.g = true;
    }

    public bjj(bjl bjlVar) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.h = bli.a();
        this.b = -1;
        this.c = false;
        this.d = new ArrayList();
        this.g = false;
        this.e = blk.a();
        hashSet.addAll(bjlVar.d);
        this.h = bli.b(bjlVar.e);
        this.b = bjlVar.f;
        this.d.addAll(bjlVar.h);
        this.g = bjlVar.i;
        bmx bmxVar = bjlVar.j;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : bmxVar.d()) {
            arrayMap.put(str, bmxVar.c(str));
        }
        this.e = new blk(arrayMap);
        this.c = bjlVar.g;
    }
}
