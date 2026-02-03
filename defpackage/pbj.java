package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pbj extends pcw implements pcl {
    public final pby b;
    public final pbi c;
    public final pbh d;
    public pch e;
    public final pcm a = new pcm();
    private final List f = new ArrayList(1);

    public pbj(pby pbyVar) {
        lcg.a(true);
        lcg.a(true);
        lcg.a(true);
        lcg.a(true);
        lcg.a(true);
        this.b = pbyVar;
        this.c = new pbi(this);
        this.d = new pbh(this);
    }

    @Override // defpackage.pcw
    public final void a(pcv pcvVar) {
        lcg.a(pcvVar != null);
        this.f.add(pcvVar);
    }

    public final void b() {
        pcm pcmVar = this.a;
        Iterator it = pcmVar.b.iterator();
        while (it.hasNext()) {
            d(it.next(), false);
        }
        pcmVar.b();
    }

    public final void c() {
        this.e = null;
        b();
    }

    public final void d(Object obj, boolean z) {
        lcg.a(obj != null);
        List list = this.f;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((pcv) list.get(size)).a(obj, z);
            }
        }
    }

    public final void e() {
        List list = this.f;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
        }
    }

    final void f() {
        pcm pcmVar = this.a;
        if (pcmVar.d()) {
            Log.d("DefaultSelectionTracker", "Ignoring onDataSetChange. No active selection.");
            return;
        }
        pcmVar.b();
        List list = this.f;
        for (int size = list.size() - 1; size >= 0; size--) {
        }
        Iterator it = pcmVar.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.b.a(next) != -1) {
                for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                    ((pcv) list.get(size2)).a(next, true);
                }
            } else {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(next);
            }
        }
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i = 0; i < size3; i++) {
                m(arrayList.get(i));
            }
        }
        e();
    }

    @Override // defpackage.pcl
    public final void g() {
        h();
        this.e = null;
    }

    @Override // defpackage.pcw
    public final boolean h() {
        if (!i()) {
            return false;
        }
        b();
        if (i()) {
            this.e = null;
            pcm pcmVar = new pcm();
            if (i()) {
                pcm pcmVar2 = this.a;
                Set set = pcmVar.a;
                set.clear();
                Set set2 = pcmVar2.a;
                set.addAll(set2);
                Set set3 = pcmVar.b;
                set3.clear();
                set3.addAll(pcmVar2.b);
                set2.clear();
            }
            Iterator it = pcmVar.a.iterator();
            while (it.hasNext()) {
                d(it.next(), false);
            }
            Iterator it2 = pcmVar.b.iterator();
            while (it2.hasNext()) {
                d(it2.next(), false);
            }
            e();
        }
        Iterator it3 = this.f.iterator();
        while (it3.hasNext()) {
            ((pcv) it3.next()).b();
        }
        return true;
    }

    @Override // defpackage.pcw
    public final boolean i() {
        return !this.a.d();
    }

    @Override // defpackage.pcw
    public final boolean j() {
        return this.e != null;
    }

    @Override // defpackage.pcl
    public final boolean k() {
        return i() || j();
    }

    @Override // defpackage.pcw
    public final boolean l(Object obj) {
        return this.a.c(obj);
    }

    @Override // defpackage.pcw
    public final void m(Object obj) {
        lcg.a(obj != null);
        pcm pcmVar = this.a;
        if (pcmVar.c(obj)) {
            pcmVar.a.remove(obj);
            d(obj, false);
            e();
            if (pcmVar.d() && j()) {
                c();
            }
        }
    }
}
