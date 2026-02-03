package defpackage;

import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rhz implements rgn, rff {
    private final rgm a;
    private final rgo b;
    private int c;
    private int d = -1;
    private res e;
    private List f;
    private int g;
    private volatile rlp h;
    private File i;
    private ria j;

    public rhz(rgo rgoVar, rgm rgmVar) {
        this.b = rgoVar;
        this.a = rgmVar;
    }

    private final boolean d() {
        return this.g < this.f.size();
    }

    @Override // defpackage.rgn
    public final void a() {
        rlp rlpVar = this.h;
        if (rlpVar != null) {
            rlpVar.c.d();
        }
    }

    @Override // defpackage.rgn
    public final boolean b() {
        List arrayList;
        rgo rgoVar = this.b;
        List listE = rgoVar.e();
        boolean z = false;
        if (listE.isEmpty()) {
            return false;
        }
        rbn rbnVarA = rgoVar.c.a();
        Class<?> cls = rgoVar.d.getClass();
        Class cls2 = rgoVar.g;
        Class cls3 = rgoVar.j;
        rsv rsvVar = rbnVarA.f;
        rvh rvhVar = (rvh) rsvVar.a.getAndSet(null);
        if (rvhVar == null) {
            rvhVar = new rvh(cls, cls2, cls3);
        } else {
            rvhVar.a(cls, cls2, cls3);
        }
        csq csqVar = rsvVar.b;
        synchronized (csqVar) {
            arrayList = (List) csqVar.get(rvhVar);
        }
        rsvVar.a.set(rvhVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            Iterator it = rbnVarA.a.a(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : rbnVarA.c.b((Class) it.next(), cls2)) {
                    if (!rbnVarA.e.b(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            rsv rsvVar2 = rbnVarA.f;
            List listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
            csq csqVar2 = rsvVar2.b;
            synchronized (csqVar2) {
                csqVar2.put(new rvh(cls, cls2, cls3), listUnmodifiableList);
            }
        }
        if (arrayList.isEmpty()) {
            rgo rgoVar2 = this.b;
            if (File.class.equals(rgoVar2.j)) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + String.valueOf(rgoVar2.d.getClass()) + " to " + String.valueOf(rgoVar2.j));
        }
        while (true) {
            if (this.f != null && d()) {
                this.h = null;
                while (!z && d()) {
                    List list = this.f;
                    int i = this.g;
                    this.g = i + 1;
                    rlq rlqVar = (rlq) list.get(i);
                    File file = this.i;
                    rgo rgoVar3 = this.b;
                    this.h = rlqVar.a(file, rgoVar3.e, rgoVar3.f, rgoVar3.h);
                    if (this.h != null && rgoVar3.h(this.h.c.a())) {
                        this.h.c.g(rgoVar3.n, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 >= arrayList.size()) {
                int i3 = this.c + 1;
                this.c = i3;
                if (i3 >= listE.size()) {
                    return false;
                }
                this.d = 0;
            }
            res resVar = (res) listE.get(this.c);
            Class cls5 = (Class) arrayList.get(this.d);
            rgo rgoVar4 = this.b;
            this.j = new ria(rgoVar4.c(), resVar, rgoVar4.m, rgoVar4.e, rgoVar4.f, rgoVar4.a(cls5), cls5, rgoVar4.h);
            File fileA = rgoVar4.d().a(this.j);
            this.i = fileA;
            if (fileA != null) {
                this.e = resVar;
                this.f = rgoVar4.g(fileA);
                this.g = 0;
            }
        }
    }

    @Override // defpackage.rff
    public final void c(Object obj) {
        this.a.d(this.e, obj, this.h.c, reb.RESOURCE_DISK_CACHE, this.j);
    }

    @Override // defpackage.rff
    public final void f(Exception exc) {
        this.a.c(this.j, exc, this.h.c, reb.RESOURCE_DISK_CACHE);
    }
}
