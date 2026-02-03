package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.cardview.widget.CardView;
import com.google.android.apps.messaging.R;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnty extends PopupWindow implements dnth {
    public final Activity a;
    public final FrameLayout b;
    public View c;
    public final ValueAnimator d;
    public final ValueAnimator e;
    public fdap f;
    public final fdap g;
    private final CardView h;
    private final View i;
    private dnst j;
    private final fctc k;
    private final fctc l;
    private final fctc m;
    private final fctc n;
    private final fctc o;
    private int p;
    private final fctc q;
    private final fctc r;
    private final fctc s;
    private final fctc t;
    private final fctc u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnty(Activity activity) {
        super(activity);
        activity.getClass();
        this.a = activity;
        this.k = fctd.a(new fdae() { // from class: dnti
            @Override // defpackage.fdae
            public final Object invoke() {
                return Integer.valueOf(this.a.a.getResources().getDimensionPixelSize(R.dimen.emoji_variant_menu_descender_height));
            }
        });
        this.l = fctd.a(new fdae() { // from class: dntv
            @Override // defpackage.fdae
            public final Object invoke() {
                return Integer.valueOf(this.a.a.getResources().getDimensionPixelSize(R.dimen.emoji_item_default_width));
            }
        });
        this.m = fctd.a(new fdae() { // from class: dntw
            @Override // defpackage.fdae
            public final Object invoke() {
                return Integer.valueOf(this.a.a.getResources().getDimensionPixelSize(R.dimen.emoji_variant_menu_size_margin));
            }
        });
        this.n = fctd.a(new fdae() { // from class: dntx
            @Override // defpackage.fdae
            public final Object invoke() {
                return Long.valueOf(this.a.a.getResources().getInteger(R.integer.short_animation_ms));
            }
        });
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfFloat.setDuration(k());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: dntj
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                valueAnimator.getClass();
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                this.a.f(((Float) animatedValue).floatValue());
            }
        });
        this.d = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat2.setDuration(k());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: dntk
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                valueAnimator.getClass();
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                this.a.f(((Float) animatedValue).floatValue());
            }
        });
        this.e = valueAnimatorOfFloat2;
        this.o = fctd.a(new fdae() { // from class: dntl
            @Override // defpackage.fdae
            public final Object invoke() {
                Rect rect = new Rect();
                this.a.a.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                return Integer.valueOf(rect.top);
            }
        });
        this.g = new fdap() { // from class: dntm
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dnkf dnkfVar = (dnkf) obj;
                dnkfVar.getClass();
                dnty dntyVar = this.a;
                fdap fdapVar = dntyVar.f;
                if (fdapVar != null) {
                    fdapVar.invoke(dnkfVar);
                }
                dntyVar.f = null;
                dntyVar.dismiss();
                return fctx.a;
            }
        };
        setWidth(-1);
        setHeight(-1);
        setBackgroundDrawable(null);
        View viewInflate = LayoutInflater.from(activity).inflate(R.layout.emoji_variant_menu, (ViewGroup) null);
        setContentView(viewInflate);
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: dntn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.dismiss();
            }
        });
        View viewFindViewById = viewInflate.findViewById(R.id.panel);
        viewFindViewById.getClass();
        CardView cardView = (CardView) viewFindViewById;
        this.h = cardView;
        View viewFindViewById2 = viewInflate.findViewById(R.id.descender);
        viewFindViewById2.getClass();
        this.i = viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.emoji_set_view_container);
        viewFindViewById3.getClass();
        this.b = (FrameLayout) viewFindViewById3;
        setAnimationStyle(R.style.VariantMenuAnimation);
        cardView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: dnto
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                dnty dntyVar = this.a;
                if (dntyVar.g()) {
                    dntyVar.d();
                    dntyVar.e();
                }
            }
        });
        setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: dntp
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                dnty dntyVar = this.a;
                dntyVar.d.cancel();
                ValueAnimator valueAnimator = dntyVar.e;
                valueAnimator.cancel();
                valueAnimator.start();
                dntyVar.c = null;
            }
        });
        this.q = fctd.b(1, new fdae() { // from class: dntq
            @Override // defpackage.fdae
            public final Object invoke() {
                dngr dngrVar = dntg.a;
                dnty dntyVar = this.a;
                Activity activity2 = dntyVar.a;
                int iC = dntyVar.c();
                activity2.getClass();
                fdap fdapVar = dntyVar.g;
                fdapVar.getClass();
                dnst dnstVarA = dntg.a(activity2, iC, fdapVar, new fdat() { // from class: dnsu
                    @Override // defpackage.fdat
                    public final Object a(Object obj, Object obj2) {
                        ((Integer) obj).intValue();
                        dnmh dnmhVar = (dnmh) obj2;
                        dngr dngrVar2 = dntg.a;
                        if (dnmhVar != null) {
                            return dnmhVar.a;
                        }
                        return null;
                    }
                }, 1, new fdap() { // from class: dnsw
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        dngr dngrVar2 = dntg.a;
                        return 1;
                    }
                });
                dntyVar.b.addView(dnstVarA);
                return dnstVarA;
            }
        });
        this.r = fctd.b(1, new fdae() { // from class: dntr
            @Override // defpackage.fdae
            public final Object invoke() {
                dngr dngrVar = dntg.a;
                dnty dntyVar = this.a;
                Activity activity2 = dntyVar.a;
                int iC = dntyVar.c();
                activity2.getClass();
                fdap fdapVar = dntyVar.g;
                fdapVar.getClass();
                fctc fctcVar = dnjz.a;
                final int size = dnjy.a().size();
                dnst dnstVarA = dntg.a(activity2, iC, fdapVar, new fdat() { // from class: dntb
                    @Override // defpackage.fdat
                    public final Object a(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj).intValue();
                        dnmi dnmiVar = (dnmi) obj2;
                        dngr dngrVar2 = dntg.a;
                        if (dnmiVar == null) {
                            return null;
                        }
                        Object obj3 = dntg.b.get(iIntValue);
                        obj3.getClass();
                        return dnmiVar.b((dnjz) obj3);
                    }
                }, size, new fdap() { // from class: dntc
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        dngr dngrVar2 = dntg.a;
                        return Integer.valueOf(size);
                    }
                });
                dntyVar.b.addView(dnstVarA);
                return dnstVarA;
            }
        });
        this.s = fctd.b(1, new fdae() { // from class: dnts
            @Override // defpackage.fdae
            public final Object invoke() {
                dngr dngrVar = dntg.a;
                dnty dntyVar = this.a;
                Activity activity2 = dntyVar.a;
                int iC = dntyVar.c();
                activity2.getClass();
                fdap fdapVar = dntyVar.g;
                fdapVar.getClass();
                fdat fdatVar = new fdat() { // from class: dnsx
                    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
                    @Override // defpackage.fdat
                    public final Object a(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj).intValue();
                        dnmg dnmgVar = (dnmg) obj2;
                        dngr dngrVar2 = dntg.a;
                        dnmgVar.getClass();
                        return dnmgVar.b((dnjw) dntg.a.invoke(dnmgVar.c()).get(iIntValue));
                    }
                };
                fctc fctcVar = dnjw.a;
                dnst dnstVarA = dntg.a(activity2, iC, fdapVar, fdatVar, dnjv.a().size(), new fdap() { // from class: dnsy
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        Set setC;
                        dnmg dnmgVar = (dnmg) obj;
                        dngr dngrVar2 = dntg.a;
                        int size = 0;
                        if (dnmgVar != null && (setC = dnmgVar.c()) != null) {
                            size = setC.size();
                        }
                        return Integer.valueOf(size);
                    }
                });
                dntyVar.b.addView(dnstVarA);
                return dnstVarA;
            }
        });
        this.t = fctd.b(1, new fdae() { // from class: dntt
            @Override // defpackage.fdae
            public final Object invoke() {
                dngr dngrVar = dntg.a;
                dnty dntyVar = this.a;
                Activity activity2 = dntyVar.a;
                int iC = dntyVar.c();
                activity2.getClass();
                fdap fdapVar = dntyVar.g;
                fdapVar.getClass();
                dnst dnstVarA = dntg.a(activity2, iC, fdapVar, new fdat() { // from class: dnsz
                    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
                    @Override // defpackage.fdat
                    public final Object a(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj).intValue();
                        dnme dnmeVar = (dnme) obj2;
                        dngr dngrVar2 = dntg.a;
                        dnmeVar.getClass();
                        ?? Invoke = dntg.a.invoke(dnmeVar.c());
                        List list = dntg.b;
                        dnjw dnjwVar = (dnjw) Invoke.get(iIntValue / list.size());
                        Object obj3 = list.get(iIntValue % list.size());
                        obj3.getClass();
                        return dnmeVar.b(dnjwVar, (dnjz) obj3);
                    }
                }, dntg.b.size(), new fdap() { // from class: dnta
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        Set setC;
                        dnme dnmeVar = (dnme) obj;
                        dngr dngrVar2 = dntg.a;
                        int size = 0;
                        if (dnmeVar != null && (setC = dnmeVar.c()) != null) {
                            size = setC.size();
                        }
                        fctc fctcVar = dnjz.a;
                        return Integer.valueOf(size * dnjy.a().size());
                    }
                });
                dntyVar.b.addView(dnstVarA);
                return dnstVarA;
            }
        });
        this.u = fctd.b(1, new fdae() { // from class: dntu
            @Override // defpackage.fdae
            public final Object invoke() {
                dngr dngrVar = dntg.a;
                dnty dntyVar = this.a;
                Activity activity2 = dntyVar.a;
                int iC = dntyVar.c();
                activity2.getClass();
                fdap fdapVar = dntyVar.g;
                fdapVar.getClass();
                final int size = dntg.b.size() - 1;
                dnst dnstVarA = dntg.a(activity2, iC, fdapVar, new fdat() { // from class: dnte
                    @Override // defpackage.fdat
                    public final Object a(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj).intValue();
                        dnmb dnmbVar = (dnmb) obj2;
                        dngr dngrVar2 = dntg.a;
                        dnmbVar.getClass();
                        int i = size;
                        List list = dntg.b;
                        Object obj3 = list.get(i - (iIntValue % i));
                        obj3.getClass();
                        dnjz dnjzVar = (dnjz) obj3;
                        Object obj4 = list.get((iIntValue / i) + 1);
                        obj4.getClass();
                        dnjz dnjzVar2 = (dnjz) obj4;
                        if (true != dnmbVar.e().contains(new fcti(dnjzVar, dnjzVar2))) {
                            dnmbVar = null;
                        }
                        if (dnmbVar != null) {
                            return dnmbVar.d(dnjzVar, dnjzVar2);
                        }
                        return null;
                    }
                }, size, new fdap() { // from class: dnsv
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        dngr dngrVar2 = dntg.a;
                        int i = size;
                        return Integer.valueOf(i * i);
                    }
                });
                dntyVar.b.addView(dnstVarA);
                return dnstVarA;
            }
        });
    }

    private final int h() {
        return ((Number) this.k.a()).intValue();
    }

    private final int i() {
        return ((Number) this.m.a()).intValue();
    }

    private final int j() {
        return ((Number) this.o.a()).intValue();
    }

    private final long k() {
        return ((Number) this.n.a()).longValue();
    }

    private final void l(dnst dnstVar, int i) {
        int iJ = i - j();
        dnstVar.f.d(dnst.a[2], Integer.valueOf(iJ));
    }

    @Override // defpackage.dnth
    public final void a() {
        dismiss();
    }

    @Override // defpackage.dnth
    public final void b(dnmj dnmjVar, View view, dnov dnovVar, fdap fdapVar) {
        dnst dnstVar;
        dnovVar.getClass();
        if (dnmjVar instanceof dnmh) {
            dnstVar = (dnst) this.q.a();
            dnstVar.e(dnmjVar);
        } else if (dnmjVar instanceof dnmi) {
            dnstVar = (dnst) this.r.a();
            dnstVar.e(dnmjVar);
        } else if (dnmjVar instanceof dnmg) {
            dnstVar = (dnst) this.s.a();
            dnstVar.e(dnmjVar);
        } else if (dnmjVar instanceof dnme) {
            dnstVar = (dnst) this.t.a();
            dnstVar.e(dnmjVar);
        } else {
            if (!(dnmjVar instanceof dnmb)) {
                throw new fctg();
            }
            dnstVar = (dnst) this.u.a();
            dnstVar.e(dnmjVar);
        }
        dnstVar.d.d(dnst.a[0], dnovVar);
        l(dnstVar, dphw.a(view).y);
        FrameLayout frameLayout = this.b;
        int childCount = frameLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            frameLayout.getChildAt(i).setVisibility(8);
        }
        this.j = dnstVar;
        dnstVar.setVisibility(0);
        dnstVar.requestFocus();
        this.c = view;
        showAsDropDown(view, 0, 0, 48);
        d();
        if (g()) {
            e();
        }
        ValueAnimator valueAnimator = this.d;
        valueAnimator.cancel();
        this.e.cancel();
        valueAnimator.start();
        getContentView().requestFocus();
        this.f = fdapVar;
    }

    public final int c() {
        return ((Number) this.l.a()).intValue();
    }

    public final void d() {
        View view = this.c;
        if (view == null) {
            return;
        }
        Point pointA = dphw.a(view);
        int i = pointA.x;
        this.p = ((pointA.y - j()) + view.getHeight()) - h();
        View view2 = this.i;
        view2.setTranslationX(i);
        view2.setTranslationY(this.p);
        view2.getLayoutParams().width = view.getWidth();
        view2.requestLayout();
    }

    public final void e() {
        View view = this.c;
        if (view == null) {
            return;
        }
        Point pointA = dphw.a(view);
        int width = pointA.x + (view.getWidth() / 2);
        CardView cardView = this.h;
        int width2 = cardView.getWidth() / 2;
        int i = i();
        Context context = view.getContext();
        context.getClass();
        int i2 = fddu.i(width - width2, i, (dpgx.c(context).x - cardView.getWidth()) - i());
        dnst dnstVar = this.j;
        if (dnstVar != null) {
            l(dnstVar, pointA.y);
        }
        int iJ = ((((pointA.y - j()) + view.getHeight()) - this.i.getHeight()) + i()) - cardView.getHeight();
        cardView.setTranslationX(i2);
        cardView.setTranslationY(iJ);
    }

    public final void f(float f) {
        float f2 = 1.0f - f;
        View view = this.i;
        view.setTranslationY(this.p - (h() * f2));
        view.setAlpha(f);
        View contentView = getContentView();
        contentView.setTranslationY(f2 * h());
        contentView.setAlpha(f);
    }

    public final boolean g() {
        return this.c != null && this.j != null && this.h.getHeight() > 0 && this.i.getHeight() > 0;
    }
}
