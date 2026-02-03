package defpackage;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dycv implements View.OnTouchListener {
    public final dydh a;
    public final SelectedAccountDisc b;
    public boolean c;
    final GestureDetector.SimpleOnGestureListener d;
    private final lda e;
    private final dyyb f;

    public dycv(dydh dydhVar, SelectedAccountDisc selectedAccountDisc) {
        dycs dycsVar = new dycs(this);
        this.d = dycsVar;
        this.a = dydhVar;
        this.b = selectedAccountDisc;
        lda ldaVar = new lda(selectedAccountDisc.getContext(), dycsVar);
        this.e = ldaVar;
        ldaVar.a(true);
        this.f = ((dydm) dydhVar).k;
    }

    public static Object c(List list, Object obj, int i, ejwi ejwiVar) {
        Object obj2;
        if (!list.isEmpty()) {
            int i2 = i - 1;
            int i3 = 1;
            if (i2 == 1) {
                i3 = -1;
            } else if (i2 != 2) {
                throw new RuntimeException();
            }
            int iIndexOf = list.indexOf(obj);
            if (iIndexOf != -1) {
                int i4 = iIndexOf;
                do {
                    int i5 = ((ekoe) list).c;
                    i4 = ((i4 + i3) + i5) % i5;
                    if (i4 != iIndexOf) {
                        obj2 = list.get(i4);
                        if (!ejwiVar.g()) {
                            break;
                        }
                    }
                } while (((dybe) ejwiVar.c()).a.a(obj2));
                return obj2;
            }
        }
        return obj;
    }

    public static boolean e(int i) {
        return i == 4 || i == 5;
    }

    public static boolean f(int i) {
        return i == 3 || i == 2;
    }

    public static final ObjectAnimator g(AccountParticleDisc accountParticleDisc, int i) {
        boolean z;
        if (i == 3) {
            z = true;
        } else if (i == 4) {
            i = 4;
            z = true;
        } else {
            z = false;
        }
        boolean zF = f(i);
        return ObjectAnimator.ofFloat(accountParticleDisc, true != zF ? "translationX" : "translationY", (zF ? accountParticleDisc.getMeasuredHeight() : accountParticleDisc.getMeasuredWidth()) * (true != z ? -0.4f : 0.4f)).setDuration(100L);
    }

    public final boolean a(Object obj, Object obj2) {
        dxxk dxxkVar = ((dydm) this.a).c;
        return dxxkVar.b(obj).equals(dxxkVar.b(obj2));
    }

    public final AnimatorSet b(int i, AnimatorListenerAdapter animatorListenerAdapter, Runnable runnable) {
        AccountParticleDisc accountParticleDisc = this.b.c;
        ObjectAnimator duration = ObjectAnimator.ofFloat(accountParticleDisc, "alpha", 1.0f, 0.0f).setDuration(50L);
        duration.setStartDelay(50L);
        ekgb ekgbVarS = ekgb.s(g(accountParticleDisc, i), duration);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ekgbVarS);
        animatorSet.addListener(new dyct(this, runnable, animatorListenerAdapter));
        return animatorSet;
    }

    public final void d(int i) {
        int i2;
        int i3 = i - 1;
        if (i3 != 1) {
            i2 = 2;
            if (i3 == 2) {
                i2 = 5;
            } else if (i3 != 3) {
                i2 = 3;
            }
        } else {
            i2 = 4;
        }
        dyyb dyybVar = this.f;
        dsve dsveVar = new dsve(22);
        evsl evslVar = dsxq.b;
        dsxr dsxrVar = (dsxr) dsxs.a.createBuilder();
        dsxrVar.copyOnWrite();
        dsxs dsxsVar = (dsxs) dsxrVar.instance;
        dsxsVar.c = i2 - 1;
        dsxsVar.b = 1 | dsxsVar.b;
        dsveVar.b(new dsvf(evslVar, (dsxs) dsxrVar.build()));
        dyybVar.f(dsveVar, this.b);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        SelectedAccountDisc selectedAccountDisc = this.b;
        ejwl.m(view == selectedAccountDisc, "View must be the selectedAccountDisc passed on the c'tor.");
        if (motionEvent.getAction() == 0) {
            selectedAccountDisc.requestDisallowInterceptTouchEvent(true);
        }
        return this.e.b(motionEvent);
    }
}
