package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class te extends xz {
    private static TimeInterpolator l;
    private final ArrayList m = new ArrayList();
    private final ArrayList n = new ArrayList();
    private final ArrayList o = new ArrayList();
    private final ArrayList p = new ArrayList();
    final ArrayList a = new ArrayList();
    final ArrayList b = new ArrayList();
    final ArrayList c = new ArrayList();
    final ArrayList d = new ArrayList();
    final ArrayList e = new ArrayList();
    final ArrayList f = new ArrayList();
    final ArrayList g = new ArrayList();

    static final void k(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((wv) list.get(size)).a.animate().cancel();
            }
        }
    }

    private final void v(List list, wv wvVar) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            tc tcVar = (tc) list.get(size);
            if (y(tcVar, wvVar) && tcVar.a == null && tcVar.b == null) {
                list.remove(tcVar);
            }
        }
    }

    private final void w(tc tcVar) {
        wv wvVar = tcVar.a;
        if (wvVar != null) {
            y(tcVar, wvVar);
        }
        wv wvVar2 = tcVar.b;
        if (wvVar2 != null) {
            y(tcVar, wvVar2);
        }
    }

    private final void x(wv wvVar) {
        if (l == null) {
            l = new ValueAnimator().getInterpolator();
        }
        wvVar.a.animate().setInterpolator(l);
        b(wvVar);
    }

    private final boolean y(tc tcVar, wv wvVar) {
        if (tcVar.b == wvVar) {
            tcVar.b = null;
        } else {
            if (tcVar.a != wvVar) {
                return false;
            }
            tcVar.a = null;
        }
        View view = wvVar.a;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        l(wvVar);
        return true;
    }

    final void a() {
        if (i()) {
            return;
        }
        m();
    }

    @Override // defpackage.vv
    public final void b(wv wvVar) {
        View view = wvVar.a;
        view.animate().cancel();
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((td) arrayList.get(size)).a == wvVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                l(wvVar);
                arrayList.remove(size);
            }
        }
        v(this.p, wvVar);
        if (this.m.remove(wvVar)) {
            view.setAlpha(1.0f);
            l(wvVar);
        }
        if (this.n.remove(wvVar)) {
            view.setAlpha(1.0f);
            l(wvVar);
        }
        ArrayList arrayList2 = this.c;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            v(arrayList3, wvVar);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.b;
        int size3 = arrayList4.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (((td) arrayList5.get(size4)).a == wvVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    l(wvVar);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                }
            }
        }
        ArrayList arrayList6 = this.a;
        int size5 = arrayList6.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                this.f.remove(wvVar);
                this.d.remove(wvVar);
                this.g.remove(wvVar);
                this.e.remove(wvVar);
                a();
                return;
            }
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(wvVar)) {
                view.setAlpha(1.0f);
                l(wvVar);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
    }

    @Override // defpackage.vv
    public final void c() {
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            wv wvVar = ((td) arrayList.get(size)).a;
            View view = wvVar.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            l(wvVar);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.m;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            l((wv) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.n;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            wv wvVar2 = (wv) arrayList3.get(size3);
            wvVar2.a.setAlpha(1.0f);
            l(wvVar2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.p;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            } else {
                w((tc) arrayList4.get(size4));
            }
        }
        arrayList4.clear();
        if (!i()) {
            return;
        }
        ArrayList arrayList5 = this.b;
        int size5 = arrayList5.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            int size6 = arrayList6.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    wv wvVar3 = ((td) arrayList6.get(size6)).a;
                    View view2 = wvVar3.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    l(wvVar3);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
        }
        ArrayList arrayList7 = this.a;
        int size7 = arrayList7.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            int size8 = arrayList8.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    wv wvVar4 = (wv) arrayList8.get(size8);
                    wvVar4.a.setAlpha(1.0f);
                    l(wvVar4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
        }
        ArrayList arrayList9 = this.c;
        int size9 = arrayList9.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                k(this.f);
                k(this.e);
                k(this.d);
                k(this.g);
                m();
                return;
            }
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            int size10 = arrayList10.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    w((tc) arrayList10.get(size10));
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
        }
    }

    @Override // defpackage.vv
    public final void d() {
        ArrayList arrayList = this.m;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.o;
        boolean zIsEmpty2 = arrayList2.isEmpty();
        ArrayList arrayList3 = this.p;
        boolean zIsEmpty3 = arrayList3.isEmpty();
        boolean z = !zIsEmpty3;
        ArrayList arrayList4 = this.n;
        boolean zIsEmpty4 = arrayList4.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4) {
            if (zIsEmpty3) {
                return;
            } else {
                z = true;
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            wv wvVar = (wv) arrayList.get(i);
            View view = wvVar.a;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            this.f.add(wvVar);
            viewPropertyAnimatorAnimate.setDuration(this.i).alpha(0.0f).setListener(new sx(this, wvVar, viewPropertyAnimatorAnimate, view)).start();
        }
        arrayList.clear();
        if (!zIsEmpty2) {
            ArrayList arrayList5 = new ArrayList();
            arrayList5.addAll(arrayList2);
            this.b.add(arrayList5);
            arrayList2.clear();
            su suVar = new su(this, arrayList5);
            if (zIsEmpty) {
                suVar.run();
            } else {
                View view2 = ((td) arrayList5.get(0)).a.a;
                long j = this.i;
                int[] iArr = ley.a;
                view2.postOnAnimationDelayed(suVar, j);
            }
        }
        if (z) {
            ArrayList arrayList6 = new ArrayList();
            arrayList6.addAll(arrayList3);
            this.c.add(arrayList6);
            arrayList3.clear();
            sv svVar = new sv(this, arrayList6);
            if (zIsEmpty) {
                svVar.run();
            } else {
                View view3 = ((tc) arrayList6.get(0)).a.a;
                long j2 = this.i;
                int[] iArr2 = ley.a;
                view3.postOnAnimationDelayed(svVar, j2);
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList4);
        this.a.add(arrayList7);
        arrayList4.clear();
        sw swVar = new sw(this, arrayList7);
        if (zIsEmpty && zIsEmpty2 && !z) {
            swVar.run();
            return;
        }
        long jMax = (!zIsEmpty ? this.i : 0L) + Math.max(!zIsEmpty2 ? 250L : 0L, z ? 250L : 0L);
        View view4 = ((wv) arrayList7.get(0)).a;
        int[] iArr3 = ley.a;
        view4.postOnAnimationDelayed(swVar, jMax);
    }

    @Override // defpackage.xz
    public final boolean e(wv wvVar) {
        x(wvVar);
        wvVar.a.setAlpha(0.0f);
        this.n.add(wvVar);
        return true;
    }

    @Override // defpackage.xz
    public boolean f(wv wvVar, wv wvVar2, int i, int i2, int i3, int i4) {
        if (wvVar == wvVar2) {
            return g(wvVar, i, i2, i3, i4);
        }
        View view = wvVar.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        x(wvVar);
        float f = (i3 - i) - translationX;
        float f2 = (i4 - i2) - translationY;
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        if (wvVar2 != null) {
            x(wvVar2);
            View view2 = wvVar2.a;
            view2.setTranslationX(-((int) f));
            view2.setTranslationY(-((int) f2));
            view2.setAlpha(0.0f);
        }
        this.p.add(new tc(wvVar, wvVar2, i, i2, i3, i4));
        return true;
    }

    @Override // defpackage.xz
    public final boolean g(wv wvVar, int i, int i2, int i3, int i4) {
        View view = wvVar.a;
        int translationX = (int) view.getTranslationX();
        int translationY = (int) view.getTranslationY();
        x(wvVar);
        int i5 = i + translationX;
        int i6 = i3 - i5;
        int i7 = i2 + translationY;
        int i8 = i4 - i7;
        if (i6 == 0) {
            i6 = 0;
            if (i8 == 0) {
                l(wvVar);
                return false;
            }
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i8 != 0) {
            view.setTranslationY(-i8);
        }
        this.o.add(new td(wvVar, i5, i7, i3, i4));
        return true;
    }

    @Override // defpackage.vv
    public boolean h(wv wvVar, List list) {
        return !list.isEmpty() || r(wvVar);
    }

    @Override // defpackage.vv
    public final boolean i() {
        return (this.n.isEmpty() && this.p.isEmpty() && this.o.isEmpty() && this.m.isEmpty() && this.e.isEmpty() && this.f.isEmpty() && this.d.isEmpty() && this.g.isEmpty() && this.b.isEmpty() && this.a.isEmpty() && this.c.isEmpty()) ? false : true;
    }

    @Override // defpackage.xz
    public final void j(wv wvVar) {
        x(wvVar);
        this.m.add(wvVar);
    }
}
