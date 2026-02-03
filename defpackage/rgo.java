package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rgo {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public rbc c;
    public Object d;
    public int e;
    public int f;
    public Class g;
    public rex h;
    public Map i;
    public Class j;
    public boolean k;
    public boolean l;
    public res m;
    public rbh n;
    public rha o;
    public boolean p;
    public boolean q;
    public rhf r;

    final rfb a(Class cls) {
        rfb rfbVar = (rfb) this.i.get(cls);
        if (rfbVar == null) {
            Iterator it = this.i.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    rfbVar = (rfb) entry.getValue();
                    break;
                }
            }
        }
        if (rfbVar != null) {
            return rfbVar;
        }
        if (this.i.isEmpty() && this.p) {
            throw new IllegalArgumentException(a.I(cls, "Missing transformation for ", ". If you wish to ignore unknown resource types, use the optional transformation methods."));
        }
        return rnm.b;
    }

    final rhv b(Class cls) {
        rhv rhvVar;
        Class cls2;
        Class cls3;
        Class cls4;
        Class cls5 = cls;
        rbn rbnVarA = this.c.a();
        rsu rsuVar = rbnVarA.g;
        AtomicReference atomicReference = rsuVar.c;
        Class cls6 = this.g;
        Class cls7 = this.j;
        rhv rhvVar2 = null;
        rvh rvhVar = (rvh) atomicReference.getAndSet(null);
        if (rvhVar == null) {
            rvhVar = new rvh();
        }
        rvhVar.a(cls5, cls6, cls7);
        csq csqVar = rsuVar.b;
        synchronized (csqVar) {
            rhvVar = (rhv) csqVar.get(rvhVar);
        }
        rsuVar.c.set(rvhVar);
        rsu rsuVar2 = rbnVarA.g;
        rhv rhvVar3 = rsu.a;
        if (rhvVar3.equals(rhvVar)) {
            return null;
        }
        if (rhvVar != null) {
            return rhvVar;
        }
        ArrayList arrayList = new ArrayList();
        rsx rsxVar = rbnVarA.c;
        for (Class cls8 : rsxVar.b(cls5, cls6)) {
            rrj rrjVar = rbnVarA.e;
            for (Class cls9 : rrjVar.b(cls8, cls7)) {
                arrayList.add(new rgu(cls5, cls8, cls9, rsxVar.a(cls5, cls8), rrjVar.a(cls8, cls9), rbnVarA.h));
                cls5 = cls;
                rrjVar = rrjVar;
            }
            cls5 = cls;
        }
        if (arrayList.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            rhvVar2 = new rhv(cls2, cls3, cls4, arrayList, rbnVarA.h);
        }
        csq csqVar2 = rsuVar2.b;
        synchronized (csqVar2) {
            rvh rvhVar2 = new rvh(cls2, cls3, cls4);
            if (rhvVar2 != null) {
                rhvVar3 = rhvVar2;
            }
            csqVar2.put(rvhVar2, rhvVar3);
        }
        return rhvVar2;
    }

    final rig c() {
        return this.c.b;
    }

    final riy d() {
        return this.r.a();
    }

    final List e() {
        if (!this.l) {
            this.l = true;
            List list = this.b;
            list.clear();
            List listF = f();
            int size = listF.size();
            for (int i = 0; i < size; i++) {
                rlp rlpVar = (rlp) listF.get(i);
                res resVar = rlpVar.a;
                if (!list.contains(resVar)) {
                    list.add(resVar);
                }
                int i2 = 0;
                while (true) {
                    List list2 = rlpVar.b;
                    if (i2 < list2.size()) {
                        if (!list.contains(list2.get(i2))) {
                            list.add((res) list2.get(i2));
                        }
                        i2++;
                    }
                }
            }
        }
        return this.b;
    }

    final List f() {
        if (!this.k) {
            this.k = true;
            List list = this.a;
            list.clear();
            List listC = this.c.a().c(this.d);
            int size = listC.size();
            for (int i = 0; i < size; i++) {
                rlp rlpVarA = ((rlq) listC.get(i)).a(this.d, this.e, this.f, this.h);
                if (rlpVarA != null) {
                    list.add(rlpVarA);
                }
            }
        }
        return this.a;
    }

    final List g(File file) {
        return this.c.a().c(file);
    }

    final boolean h(Class cls) {
        return b(cls) != null;
    }
}
