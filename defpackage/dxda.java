package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxda extends xz {
    private final int p;
    private final long q;
    private final ArrayList e = new ArrayList();
    private final ArrayList f = new ArrayList();
    private final ArrayList g = new ArrayList();
    private final ArrayList l = new ArrayList();
    private final ArrayList m = new ArrayList();
    private final ArrayList n = new ArrayList();
    private final ArrayList o = new ArrayList();
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();

    public dxda(Context context) {
        u();
        this.i = 217L;
        this.h = 217L;
        this.p = context.getResources().getDimensionPixelSize(R.dimen.message_bubble_initial_offset);
        dvhn.a();
        this.q = System.currentTimeMillis();
    }

    static final void k(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                try {
                    ((wv) list.get(size)).a.animate().cancel();
                } catch (IndexOutOfBoundsException unused) {
                }
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
            dxcy dxcyVar = (dxcy) list.get(size);
            if (x(dxcyVar, wvVar) && dxcyVar.a == null && dxcyVar.b == null) {
                list.remove(dxcyVar);
            }
        }
    }

    private final void w(dxcy dxcyVar) {
        wv wvVar = dxcyVar.a;
        if (wvVar != null) {
            x(dxcyVar, wvVar);
        }
        wv wvVar2 = dxcyVar.b;
        if (wvVar2 != null) {
            x(dxcyVar, wvVar2);
        }
    }

    private final boolean x(dxcy dxcyVar, wv wvVar) {
        if (dxcyVar.b == wvVar) {
            dxcyVar.b = null;
        } else {
            if (dxcyVar.a != wvVar) {
                return false;
            }
            dxcyVar.a = null;
        }
        View view = wvVar.a;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        l(wvVar);
        return true;
    }

    private final boolean y(wv wvVar) {
        dvhn.a();
        if (System.currentTimeMillis() - this.q >= 1000) {
            return false;
        }
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
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((dxcz) arrayList.get(size)).a == wvVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                l(wvVar);
                arrayList.remove(size);
            }
        }
        v(this.l, wvVar);
        if (this.e.remove(wvVar)) {
            view.setAlpha(1.0f);
            l(wvVar);
        }
        if (this.f.remove(wvVar)) {
            view.setAlpha(1.0f);
            l(wvVar);
        }
        ArrayList arrayList2 = this.o;
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
        ArrayList arrayList4 = this.n;
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
                if (((dxcz) arrayList5.get(size4)).a == wvVar) {
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
        ArrayList arrayList6 = this.m;
        int size5 = arrayList6.size();
        while (true) {
            size5--;
            if (size5 < 0) {
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
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            wv wvVar = ((dxcz) arrayList.get(size)).a;
            View view = wvVar.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            l(wvVar);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.e;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            l((wv) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f;
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
        ArrayList arrayList4 = this.l;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            } else {
                w((dxcy) arrayList4.get(size4));
            }
        }
        arrayList4.clear();
        if (!i()) {
            return;
        }
        ArrayList arrayList5 = this.n;
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
                    wv wvVar3 = ((dxcz) arrayList6.get(size6)).a;
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
        ArrayList arrayList7 = this.m;
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
        ArrayList arrayList9 = this.o;
        int size9 = arrayList9.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                k(this.c);
                k(this.b);
                k(this.a);
                k(this.d);
                m();
                return;
            }
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            int size10 = arrayList10.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    w((dxcy) arrayList10.get(size10));
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
        }
    }

    @Override // defpackage.vv
    public final void d() {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            wv wvVar = (wv) arrayList.get(i);
            View view = wvVar.a;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            this.c.add(wvVar);
            viewPropertyAnimatorAnimate.setDuration(this.i).alpha(0.0f).setListener(new dxct(this, wvVar, viewPropertyAnimatorAnimate, view)).start();
        }
        ArrayList arrayList2 = this.g;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            dxcz dxczVar = (dxcz) arrayList2.get(i2);
            wv wvVar2 = dxczVar.a;
            int i3 = dxczVar.b;
            int i4 = dxczVar.c;
            int i5 = dxczVar.d;
            int i6 = dxczVar.e;
            View view2 = wvVar2.a;
            int i7 = i5 - i3;
            int i8 = i6 - i4;
            if (i7 != 0) {
                view2.animate().translationX(0.0f);
            }
            if (i8 != 0) {
                view2.animate().translationY(0.0f);
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view2.animate();
            if (i7 != 0) {
                viewPropertyAnimatorAnimate2.translationX(0.0f);
            }
            if (i8 != 0) {
                viewPropertyAnimatorAnimate2.translationY(0.0f);
            }
            this.b.add(wvVar2);
            viewPropertyAnimatorAnimate2.setDuration(250L).setInterpolator(new lud()).setListener(new dxcv(this, wvVar2, i7, view2, i8, viewPropertyAnimatorAnimate2)).start();
        }
        ArrayList arrayList3 = this.l;
        int size3 = arrayList3.size();
        for (int i9 = 0; i9 < size3; i9++) {
            dxcy dxcyVar = (dxcy) arrayList3.get(i9);
            wv wvVar3 = dxcyVar.a;
            View view3 = wvVar3 == null ? null : wvVar3.a;
            wv wvVar4 = dxcyVar.b;
            View view4 = wvVar4 != null ? wvVar4.a : null;
            if (view3 != null) {
                ViewPropertyAnimator duration = view3.animate().setDuration(250L);
                this.d.add(dxcyVar.a);
                duration.translationX(dxcyVar.e - dxcyVar.c);
                duration.translationY(dxcyVar.f - dxcyVar.d);
                duration.alpha(0.0f).setListener(new dxcw(this, dxcyVar, duration, view3)).start();
            }
            if (view4 != null) {
                ArrayList arrayList4 = this.d;
                ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                arrayList4.add(dxcyVar.b);
                viewPropertyAnimatorAnimate3.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new dxcx(this, dxcyVar, viewPropertyAnimatorAnimate3, view4)).start();
            }
        }
        ArrayList arrayList5 = this.f;
        int size4 = arrayList5.size();
        for (int i10 = 0; i10 < size4; i10++) {
            wv wvVar5 = (wv) arrayList5.get(i10);
            View view5 = wvVar5.a;
            ViewPropertyAnimator viewPropertyAnimatorAnimate4 = view5.animate();
            this.a.add(wvVar5);
            viewPropertyAnimatorAnimate4.setInterpolator(new lud()).translationX(0.0f).translationY(0.0f).setDuration(this.h).setListener(new dxcu(this, wvVar5, view5, viewPropertyAnimatorAnimate4)).start();
        }
        arrayList.clear();
        arrayList2.clear();
        arrayList3.clear();
        arrayList5.clear();
    }

    @Override // defpackage.xz
    public final boolean e(wv wvVar) {
        b(wvVar);
        if (y(wvVar)) {
            return false;
        }
        View view = wvVar.a;
        view.setTranslationY(view.getHeight());
        if (view instanceof dxbx) {
            view.setTranslationX(-this.p);
        }
        this.f.add(wvVar);
        return true;
    }

    @Override // defpackage.xz
    public final boolean f(wv wvVar, wv wvVar2, int i, int i2, int i3, int i4) {
        if (wvVar == wvVar2) {
            return g(wvVar, i, i2, i3, i4);
        }
        View view = wvVar.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        b(wvVar);
        float f = (i3 - i) - translationX;
        float f2 = (i4 - i2) - translationY;
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        if (wvVar2 != null) {
            b(wvVar2);
            View view2 = wvVar2.a;
            view2.setTranslationX(-((int) f));
            view2.setTranslationY(-((int) f2));
            view2.setAlpha(0.0f);
        }
        this.l.add(new dxcy(wvVar, wvVar2, i, i2, i3, i4));
        return true;
    }

    @Override // defpackage.xz
    public final boolean g(wv wvVar, int i, int i2, int i3, int i4) {
        int i5 = 0;
        if (y(wvVar)) {
            return false;
        }
        View view = wvVar.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) view.getTranslationY());
        b(wvVar);
        int i6 = i3 - translationX;
        int i7 = i4 - translationY;
        if (i6 != 0) {
            i5 = i6;
        } else if (i7 == 0) {
            l(wvVar);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i7 != 0) {
            view.setTranslationY(-i7);
        }
        this.g.add(new dxcz(wvVar, translationX, translationY, i3, i4));
        return true;
    }

    @Override // defpackage.vv
    public final boolean h(wv wvVar, List list) {
        return !list.isEmpty() || r(wvVar);
    }

    @Override // defpackage.vv
    public final boolean i() {
        return (this.f.isEmpty() && this.l.isEmpty() && this.g.isEmpty() && this.e.isEmpty() && this.b.isEmpty() && this.c.isEmpty() && this.a.isEmpty() && this.d.isEmpty() && this.n.isEmpty() && this.m.isEmpty() && this.o.isEmpty()) ? false : true;
    }

    @Override // defpackage.xz
    public final void j(wv wvVar) {
        b(wvVar);
        this.e.add(wvVar);
    }

    @Override // defpackage.xz, defpackage.vv
    public final boolean q(wv wvVar, vu vuVar, vu vuVar2) {
        int i = vuVar.a;
        int i2 = vuVar2.a;
        if (i != i2 || vuVar.b != vuVar2.b) {
            return g(wvVar, i, vuVar.b, i2, vuVar2.b);
        }
        l(wvVar);
        return false;
    }
}
