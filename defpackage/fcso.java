package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcso extends fcsk {
    private final AtomicInteger l;
    private fbqg m;

    public fcso(fbqa fbqaVar) {
        super(fbqaVar);
        this.l = new AtomicInteger(new Random().nextInt());
        this.m = new fbpz(fbqc.a);
    }

    private final fbqg g(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((fcsi) it.next()).d);
        }
        return new fcsn(arrayList, this.l);
    }

    private final void h(fbnv fbnvVar, fbqg fbqgVar) {
        if (fbnvVar == this.k && fbqgVar.equals(this.m)) {
            return;
        }
        this.h.f(fbnvVar, fbqgVar);
        this.k = fbnvVar;
        this.m = fbqgVar;
    }

    @Override // defpackage.fcsk
    protected final fcsi e(Object obj) {
        return new fcsm(this, obj, this.j);
    }

    @Override // defpackage.fcsk
    protected final void f() {
        ArrayList arrayList = new ArrayList();
        for (fcsi fcsiVar : this.g) {
            if (fcsiVar.c == fbnv.READY) {
                arrayList.add(fcsiVar);
            }
        }
        if (!arrayList.isEmpty()) {
            h(fbnv.READY, g(arrayList));
            return;
        }
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            fbnv fbnvVar = ((fcsi) it.next()).c;
            fbnv fbnvVar2 = fbnv.CONNECTING;
            if (fbnvVar == fbnvVar2 || fbnvVar == fbnv.IDLE) {
                h(fbnvVar2, new fbpz(fbqc.a));
                return;
            }
        }
        h(fbnv.TRANSIENT_FAILURE, g(this.g));
    }
}
