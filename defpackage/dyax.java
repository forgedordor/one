package defpackage;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyax implements dyau {
    private static final String e = "dyax";
    public boolean c;
    public dyte d;
    private final dxxk i;
    private ekgb j;
    private dxxu k;
    private final CopyOnWriteArrayList f = new CopyOnWriteArrayList();
    private final Object g = new Object();
    private final Map h = new HashMap();
    public boolean a = true;
    public ejwi b = ejud.a;

    public dyax(dxxk dxxkVar) {
        int i = ekgb.d;
        this.j = ekoe.a;
        this.i = dxxkVar;
    }

    private static Object j(dxxu dxxuVar) {
        if (dxxuVar != null) {
            return dxxuVar.c();
        }
        return null;
    }

    private static void k(String str) {
        String str2 = e;
        if (Log.isLoggable(str2, 3)) {
            Log.d(str2, str);
        }
    }

    private final void l() {
        if (this.c) {
            return;
        }
        this.c = true;
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((dyay) it.next()).a();
        }
    }

    private final void m(int i) {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            dyay dyayVar = (dyay) it.next();
            Object objJ = j(this.k);
            dyayVar.b(objJ);
            dyayVar.d(objJ, i);
        }
    }

    @Override // defpackage.dyau
    public final Object a() {
        return j(this.k);
    }

    @Override // defpackage.dyau
    public final void c(dyay dyayVar) {
        this.f.add(dyayVar);
    }

    @Override // defpackage.dyau
    public final void d(dyay dyayVar) {
        this.f.remove(dyayVar);
    }

    @Override // defpackage.dyau
    public final boolean e() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dyau
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final ekgb b() {
        ekgb ekgbVarG;
        ekfw ekfwVar = new ekfw();
        synchronized (this.g) {
            ekqh it = this.j.iterator();
            while (it.hasNext()) {
                ekfwVar.h(((dxxu) it.next()).c());
            }
            ekgbVarG = ekfwVar.g();
        }
        return ekgbVarG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.ekgb r12) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dyax.g(ekgb):void");
    }

    @Deprecated
    public final void h(Object obj) {
        i(obj, 2);
    }

    public final void i(Object obj, int i) {
        dxxu dxxuVar;
        if (obj == null) {
            if (this.k != null) {
                this.k = null;
                m(i);
                return;
            }
            return;
        }
        dxxu dxxuVar2 = this.k;
        dxxk dxxkVar = this.i;
        Object obj2 = this.g;
        String strB = dxxkVar.b(obj);
        synchronized (obj2) {
            dxxuVar = (dxxu) this.h.get(strB);
        }
        ejwl.b(dxxuVar != null, "Selected account must be an available account");
        this.k = dxxuVar;
        if (dxxuVar.equals(dxxuVar2)) {
            return;
        }
        m(i);
    }
}
