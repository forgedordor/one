package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.compose.ui.views.RoundedImageView;
import defpackage.dohs;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class donr<T extends dohs<?, ?>> extends wv {
    public static final ekrg s = ekrg.c("com/google/android/libraries/compose/media/ui/holder/MediaViewHolder");
    private final dngc A;
    private final String B;
    private final String C;
    private fdlr D;
    public final Activity t;
    public final donx u;
    public final RoundedImageView v;
    public final String w;
    public dons x;
    public final Context y;
    private final fdjx z;

    public donr(Activity activity, fdjx fdjxVar, donx donxVar, dngc dngcVar, View view, RoundedImageView roundedImageView, String str, String str2, String str3, dons donsVar) {
        super(view);
        this.t = activity;
        this.z = fdjxVar;
        this.u = donxVar;
        this.A = dngcVar;
        this.v = roundedImageView;
        this.w = str;
        this.B = str2;
        this.C = str3;
        this.x = donsVar;
        this.y = activity.getBaseContext();
    }

    public static /* synthetic */ void G(final donr donrVar, final dohs dohsVar, final fdap fdapVar, final donn donnVar, Integer num, String str, int i) throws Resources.NotFoundException {
        if ((i & 2) != 0) {
            fdapVar = new fdap() { // from class: donl
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ((dohs) obj).getClass();
                    return fctx.a;
                }
            };
        }
        if ((i & 4) != 0) {
            donnVar = new donn() { // from class: donm
                @Override // defpackage.donn
                public final boolean a(Object obj, PointF pointF) {
                    return false;
                }
            };
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        dohsVar.getClass();
        fdapVar.getClass();
        donnVar.getClass();
        ((ekrd) s.f().h("com/google/android/libraries/compose/media/ui/holder/MediaViewHolder", "bind", 98, "MediaViewHolder.kt")).I("Rendering %s with configuration %s", donrVar.w, dohsVar, donrVar.x);
        dofn dofnVar = donrVar.x.a;
        if (dofnVar != null) {
            donrVar.v.c(dofnVar);
        }
        ImageView.ScaleType scaleType = donrVar.x.b;
        if (scaleType != null) {
            donrVar.v.setScaleType(scaleType);
        }
        Context context = donrVar.y;
        rbv rbvVarC = raw.c(context);
        rbvVarC.getClass();
        final dohq dohqVarD = donrVar.D(dohsVar);
        rbr rbrVarA = rbvVarC.c().k(dohqVarD.o() != null ? new rlc(dohqVarD.f(), new rld() { // from class: donh
            @Override // defpackage.rld
            public final Map a() {
                return dohqVarD.o();
            }
        }) : dohqVarD.f()).a(new dono(donrVar, dohsVar, dohsVar));
        rbrVarA.getClass();
        rbr rbrVarC = donrVar.C(dohsVar, rbrVarA);
        RoundedImageView roundedImageView = donrVar.v;
        rbrVarC.v(roundedImageView);
        View view = donrVar.a;
        dngc dngcVar = donrVar.A;
        view.setOnClickListener(dngcVar.a(donrVar.B, new View.OnClickListener() { // from class: doni
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ekrd ekrdVar = (ekrd) donr.s.h().h("com/google/android/libraries/compose/media/ui/holder/MediaViewHolder", "bind$lambda$12", 145, "MediaViewHolder.kt");
                String str2 = this.a.w;
                dohs dohsVar2 = dohsVar;
                ekrdVar.D("%s clicked with media=%s", str2, dohsVar2);
                fdapVar.invoke(dohsVar2);
            }
        }));
        if (donrVar.x.c) {
            final GestureDetector gestureDetector = new GestureDetector(context, new donq(donrVar, dohsVar, donnVar));
            view.setOnTouchListener(new View.OnTouchListener() { // from class: donj
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    gestureDetector.onTouchEvent(motionEvent);
                    return false;
                }
            });
        } else {
            view.setOnLongClickListener(dngcVar.b(donrVar.C, new View.OnLongClickListener() { // from class: donk
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    ekrd ekrdVar = (ekrd) donr.s.h().h("com/google/android/libraries/compose/media/ui/holder/MediaViewHolder", "bind$lambda$14", 175, "MediaViewHolder.kt");
                    String str2 = this.a.w;
                    dohs dohsVar2 = dohsVar;
                    ekrdVar.D("%s long clicked with media=%s", str2, dohsVar2);
                    return donnVar.a(dohsVar2, null);
                }
            }));
        }
        donx donxVar = donrVar.u;
        ViewGroup viewGroup = (ViewGroup) view;
        boolean z = donxVar.a;
        donxVar.a = true;
        if (num != null || donxVar.b.b()) {
            Object objA = ((dngs) donxVar.b.a()).a(viewGroup, roundedImageView);
            if (!z) {
                viewGroup.animate().cancel();
                TextView textView = (TextView) objA;
                textView.animate().cancel();
                if (num == null) {
                    ((View) objA).setVisibility(8);
                    donx.c(viewGroup, textView, 1.0f, 0.0f);
                } else {
                    donx.b(textView, num.intValue());
                    donx.c(viewGroup, textView, 0.88f, 1.0f);
                    ((View) objA).setVisibility(0);
                }
            } else if (num == null) {
                final TextView textView2 = (TextView) objA;
                donx.a(viewGroup, textView2, 1.0f, 0.0f, new fdae() { // from class: donw
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        int i2 = donx.c;
                        textView2.setVisibility(8);
                        return fctx.a;
                    }
                });
            } else {
                TextView textView3 = (TextView) objA;
                donx.b(textView3, num.intValue());
                donx.a(viewGroup, textView3, 0.88f, 1.0f, null);
            }
        }
        if (str != null) {
            view.setContentDescription(str);
        }
    }

    public static /* synthetic */ void H(donr donrVar, fdap fdapVar, fdap fdapVar2, donn donnVar) {
        fdlr fdlrVar = donrVar.D;
        if (fdlrVar != null) {
            if (true != fdlrVar.v()) {
                fdlrVar = null;
            }
            if (fdlrVar != null) {
                fdlrVar.t(null);
            }
        }
        donrVar.D = fdil.d(donrVar.z, null, null, new donp(donrVar, fdapVar, fdapVar2, donnVar, null), 3);
    }

    protected abstract rbr C(dohs dohsVar, rbr rbrVar);

    protected abstract dohq D(dohs dohsVar);

    public void E() {
        View view = this.a;
        view.setOnClickListener(null);
        view.setClickable(false);
        this.v.b();
    }
}
