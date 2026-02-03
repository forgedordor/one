package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sp extends vo {
    private final sr a;

    @SafeVarargs
    public sp(so soVar, vo... voVarArr) {
        sr srVar;
        int size;
        List listAsList = Arrays.asList(voVarArr);
        this.a = new sr(this, soVar);
        Iterator it = listAsList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                super.B(false);
                return;
            }
            vo voVar = (vo) it.next();
            srVar = this.a;
            size = srVar.e.size();
            if (size < 0 || size > srVar.e.size()) {
                break;
            }
            if (voVar.b) {
                Log.w("ConcatAdapter", "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
            }
            int size2 = srVar.e.size();
            while (true) {
                if (i >= size2) {
                    i = -1;
                    break;
                } else if (((uy) srVar.e.get(i)).b == voVar) {
                    break;
                } else {
                    i++;
                }
            }
            if ((i == -1 ? null : (uy) srVar.e.get(i)) == null) {
                uy uyVar = new uy(voVar, srVar, srVar.b, srVar.f.a);
                srVar.e.add(size, uyVar);
                Iterator it2 = srVar.c.iterator();
                while (it2.hasNext()) {
                    RecyclerView recyclerView = (RecyclerView) ((WeakReference) it2.next()).get();
                    if (recyclerView != null) {
                        voVar.gI(recyclerView);
                    }
                }
                if (uyVar.d > 0) {
                    srVar.a.w(srVar.a(uyVar), uyVar.d);
                }
                srVar.d();
            }
        }
        throw new IndexOutOfBoundsException("Index must be between 0 and " + srVar.e.size() + ". Given:" + size);
    }

    @Override // defpackage.vo
    public final int a() {
        Iterator it = this.a.e.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((uy) it.next()).d;
        }
        return i;
    }

    @Override // defpackage.vo
    public final int dE(vo voVar, wv wvVar, int i) {
        sr srVar = this.a;
        uy uyVar = (uy) srVar.d.get(wvVar);
        if (uyVar == null) {
            return -1;
        }
        int iA = i - srVar.a(uyVar);
        vo voVar2 = uyVar.b;
        int iA2 = voVar2.a();
        if (iA >= 0 && iA < iA2) {
            return voVar2.dE(voVar, wvVar, iA);
        }
        throw new IllegalStateException("Detected inconsistent adapter updates. The local position of the view holder maps to " + iA + " which is out of bounds for the adapter with size " + iA2 + ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:" + wvVar + "adapter:" + voVar);
    }

    @Override // defpackage.vo
    public final int dF(int i) {
        sr srVar = this.a;
        sq sqVarB = srVar.b(i);
        uy uyVar = sqVarB.a;
        int iB = uyVar.a.b(uyVar.b.dF(sqVarB.b));
        srVar.f(sqVarB);
        return iB;
    }

    @Override // defpackage.vo
    public final wv e(ViewGroup viewGroup, int i) {
        uy uyVarA = this.a.b.a(i);
        return uyVarA.b.e(viewGroup, uyVarA.a.a(i));
    }

    @Override // defpackage.vo
    public final void g(wv wvVar, int i) {
        sr srVar = this.a;
        sq sqVarB = srVar.b(i);
        srVar.d.put(wvVar, sqVarB.a);
        uy uyVar = sqVarB.a;
        uyVar.b.o(wvVar, sqVarB.b);
        srVar.f(sqVarB);
    }

    @Override // defpackage.vo
    public final long gH(int i) {
        sr srVar = this.a;
        sq sqVarB = srVar.b(i);
        uy uyVar = sqVarB.a;
        uyVar.b.gH(sqVarB.b);
        yd ydVar = uyVar.e;
        srVar.f(sqVarB);
        return -1L;
    }

    @Override // defpackage.vo
    public final void gI(RecyclerView recyclerView) {
        sr srVar = this.a;
        List list = srVar.c;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == recyclerView) {
                return;
            }
        }
        list.add(new WeakReference(recyclerView));
        Iterator it2 = srVar.e.iterator();
        while (it2.hasNext()) {
            ((uy) it2.next()).b.gI(recyclerView);
        }
    }

    @Override // defpackage.vo
    public final void h(RecyclerView recyclerView) {
        sr srVar = this.a;
        List list = srVar.c;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            WeakReference weakReference = (WeakReference) list.get(size);
            if (weakReference.get() == null) {
                list.remove(size);
            } else if (weakReference.get() == recyclerView) {
                list.remove(size);
                break;
            }
        }
        Iterator it = srVar.e.iterator();
        while (it.hasNext()) {
            ((uy) it.next()).b.h(recyclerView);
        }
    }

    @Override // defpackage.vo
    public final void i(wv wvVar) {
        this.a.c(wvVar).b.i(wvVar);
    }

    @Override // defpackage.vo
    public final void j(wv wvVar) {
        this.a.c(wvVar).b.j(wvVar);
    }

    @Override // defpackage.vo
    public final void k(wv wvVar) {
        sr srVar = this.a;
        IdentityHashMap identityHashMap = srVar.d;
        uy uyVar = (uy) identityHashMap.get(wvVar);
        if (uyVar == null) {
            throw new IllegalStateException(a.i(srVar, wvVar, "Cannot find wrapper for ", ", seems like it is not bound by this adapter: "));
        }
        uyVar.b.k(wvVar);
        identityHashMap.remove(wvVar);
    }

    final void l(int i) {
        super.E(i);
    }

    @Override // defpackage.vo
    public final void m(wv wvVar) {
        sr srVar = this.a;
        IdentityHashMap identityHashMap = srVar.d;
        uy uyVar = (uy) identityHashMap.get(wvVar);
        if (uyVar == null) {
            throw new IllegalStateException(a.i(srVar, wvVar, "Cannot find wrapper for ", ", seems like it is not bound by this adapter: "));
        }
        uyVar.b.m(wvVar);
        identityHashMap.remove(wvVar);
    }
}
