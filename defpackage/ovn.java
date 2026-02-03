package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ovn {
    private final owz a;
    public final fcyh b;
    public oxe c;
    public ouc d;
    public final ory e;
    public final oxu f;
    public volatile boolean g;
    public volatile int h;
    public final fduf i;
    public final fdvc j;
    public final fdue k;
    public osi l;

    public ovn(fcyh fcyhVar, oux ouxVar) {
        ouc oucVar;
        osd osdVarA;
        fcyhVar.getClass();
        this.b = fcyhVar;
        this.c = new ovi();
        ouc oucVar2 = ouc.a;
        osd osdVarA2 = ouxVar != null ? ouxVar.a() : null;
        if (osdVarA2 != null) {
            oucVar = new ouc(osdVarA2);
        } else {
            oucVar = ouc.a;
            oucVar.getClass();
        }
        this.d = oucVar;
        ory oryVar = new ory();
        if (ouxVar != null && (osdVarA = ouxVar.a()) != null) {
            oryVar.c(osdVarA.f);
        }
        this.e = oryVar;
        oxu oxuVar = new oxu();
        this.f = oxuVar;
        this.a = new owz(null);
        this.i = fdvf.a(false);
        this.j = oryVar.c;
        this.k = fdun.d(0, 64, 2);
        oxuVar.a(new fdae() { // from class: ovh
            @Override // defpackage.fdae
            public final Object invoke() {
                fdue fdueVar = this.a.k;
                fctx fctxVar = fctx.a;
                fdueVar.h(fctxVar);
                return fctxVar;
            }
        });
    }

    public abstract Object a(ovg ovgVar, fcxy fcxyVar);

    public final oqx b() {
        ouc oucVar = this.d;
        int i = oucVar.d;
        int i2 = oucVar.e;
        List list = oucVar.b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fcva.y(arrayList, ((oxd) it.next()).c);
        }
        return new oqx(i, i2, arrayList);
    }

    public final Object c(oux ouxVar, fcxy fcxyVar) throws Throwable {
        Object objA = this.a.a(new ovl(this, ouxVar, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    public final Object d(int i) {
        fduf fdufVar;
        Object objC;
        Object objC2;
        do {
            fdufVar = this.i;
            objC = fdufVar.c();
            ((Boolean) objC).booleanValue();
        } while (!fdufVar.g(objC, true));
        this.g = true;
        this.h = i;
        if (ovs.a(2)) {
            ovs.b(2, "Accessing item index[" + i + ']');
        }
        osi osiVar = this.l;
        if (osiVar != null) {
            osiVar.a(this.d.h(i));
        }
        ouc oucVar = this.d;
        if (i < 0 || i >= oucVar.f()) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + oucVar.f());
        }
        int i2 = i - oucVar.d;
        Object objI = null;
        if (i2 >= 0 && i2 < oucVar.c) {
            objI = oucVar.i(i2);
        }
        do {
            objC2 = fdufVar.c();
            ((Boolean) objC2).booleanValue();
        } while (!fdufVar.g(objC2, false));
        return objI;
    }

    public final void e() {
        if (ovs.a(3)) {
            ovs.b(3, "Refresh signal received");
        }
        this.c.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.util.List r6, int r7, int r8, boolean r9, defpackage.orq r10, defpackage.osi r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ovn.g(java.util.List, int, int, boolean, orq, osi, fcxy):java.lang.Object");
    }
}
