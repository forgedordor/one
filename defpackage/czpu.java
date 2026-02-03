package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.smartmessaging.expressivetext.impl.ExpressiveTextContext;
import com.google.android.libraries.smartmessaging.expressivetext.impl.opengl.GLTextureView;
import com.google.research.ink.libs.buttons.ColorSelectionButton;
import com.google.research.ink.libs.buttons.PenSelectionButton;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import java.util.HashMap;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czpu implements czot, ebtf {
    public final czpe a;
    public final czov b;
    public final ebtb c;
    public final ebtg d;
    public final AccessibilityManager e;
    public final czor f;
    public final cyuq g;
    public HashMap h;
    public HashMap i;
    public HashMap j;
    public ColorSelectionButton k;
    public EditText l;
    public GLTextureView m;
    public cyqr n;
    public czoq o;
    public Transition v;
    private final daoe w;
    public final aw q = new aw();
    public final aw r = new aw();
    public final aw s = new aw();
    public final aw t = new aw();
    public final aw u = new aw();
    public boolean p = false;

    public czpu(Context context, czpe czpeVar, czov czovVar, ebtb ebtbVar, ebtg ebtgVar, czor czorVar, cyuq cyuqVar, daoe daoeVar) {
        this.e = (AccessibilityManager) context.getSystemService("accessibility");
        this.a = czpeVar;
        this.b = czovVar;
        this.c = ebtbVar;
        this.d = ebtgVar;
        this.f = czorVar;
        this.w = daoeVar;
        this.g = cyuqVar;
    }

    @Override // defpackage.czot
    public final void a(Rect rect) throws Throwable {
        ebtj ebtjVarB = this.c.b();
        ebtjVarB.b.l = rect;
        ExpressiveTextContext expressiveTextContext = ebtjVarB.a;
        if (expressiveTextContext.p()) {
            expressiveTextContext.k(rect.left, rect.top, rect.width(), rect.height());
        }
    }

    @Override // defpackage.czot
    public final boolean b() {
        return this.d.i > 0;
    }

    public final ColorSelectionButton c(int i) {
        ColorSelectionButton colorSelectionButton = (ColorSelectionButton) this.j.get(Integer.valueOf(i));
        if (colorSelectionButton == null) {
            return null;
        }
        if (colorSelectionButton.isActivated()) {
            return colorSelectionButton;
        }
        Collection.EL.stream(this.j.values()).forEach(new Consumer() { // from class: czpk
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ColorSelectionButton colorSelectionButton2 = (ColorSelectionButton) obj;
                colorSelectionButton2.a(false);
                colorSelectionButton2.setActivated(false);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        colorSelectionButton.a(true);
        colorSelectionButton.setActivated(true);
        return colorSelectionButton;
    }

    @Override // defpackage.ebtf
    public final void d(ebtg ebtgVar) {
        Collection.EL.stream(this.i.values()).forEach(new Consumer() { // from class: czpf
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((PenSelectionButton) obj).setActivated(false);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        PenSelectionButton penSelectionButton = (PenSelectionButton) this.i.get(ebtgVar.f);
        ColorSelectionButton colorSelectionButtonC = c(ebtgVar.g);
        String str = colorSelectionButtonC == null ? "" : colorSelectionButtonC.c;
        if (penSelectionButton != null) {
            penSelectionButton.setActivated(true);
            int i = ebtgVar.g;
            int i2 = penSelectionButton.f;
            if (i2 != 0) {
                Drawable drawable = penSelectionButton.c;
                if (drawable != null) {
                    if (i != penSelectionButton.d) {
                        drawable = penSelectionButton.e;
                    }
                    penSelectionButton.setImageDrawable(drawable);
                }
                int i3 = penSelectionButton.g;
                if (i3 == i2) {
                    throw new IllegalArgumentException("constantColor cannot be changedColor.");
                }
                float fRed = Color.red(i);
                float fGreen = Color.green(i);
                float fBlue = Color.blue(i);
                int iRed = Color.red(i3);
                float f = iRed;
                int iGreen = Color.green(i3);
                int iBlue = Color.blue(i3);
                int iRed2 = Color.red(i2) - iRed;
                float f2 = iGreen;
                int iGreen2 = Color.green(i2) - iGreen;
                float f3 = iBlue;
                float f4 = (fRed - f) / iRed2;
                float f5 = (fGreen - f2) / iGreen2;
                float fBlue2 = (fBlue - f3) / (Color.blue(i2) - iBlue);
                penSelectionButton.a = new ColorMatrixColorFilter(new ColorMatrix(new float[]{f4, 0.0f, 0.0f, 0.0f, f * (1.0f - f4), 0.0f, f5, 0.0f, 0.0f, f2 * (1.0f - f5), 0.0f, 0.0f, fBlue2, 0.0f, f3 * (1.0f - fBlue2), 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
                penSelectionButton.setColorFilter(penSelectionButton.isActivated() ? penSelectionButton.a : null);
                penSelectionButton.b = str;
                penSelectionButton.a();
            }
        }
    }

    @Override // defpackage.ebtf
    public final void e(ebtg ebtgVar) {
        ColorSelectionButton colorSelectionButton;
        einf.f(new czpv(), this.a);
        ebte ebteVar = ebtgVar.e;
        if (c(ebteVar == ebte.b ? this.d.g : this.d.h) == null && (colorSelectionButton = this.k) != null) {
            colorSelectionButton.callOnClick();
        }
        f(ebteVar == ebte.c, this.d.m);
        i(ebtgVar);
    }

    public final void f(boolean z, String str) {
        if (!z) {
            this.w.e(this.a.z(), this.l);
            return;
        }
        this.l.setText(str);
        this.l.requestFocus();
        this.l.setSelection(str.length());
        this.w.g(this.a.z(), this.l, true);
    }

    public final void g() {
        czpe czpeVar = this.a;
        eeji eejiVar = new eeji(czpeVar.G());
        eejiVar.k(R.string.confirm_close_message);
        eejiVar.s(czpeVar.G().getString(R.string.discard), new DialogInterface.OnClickListener() { // from class: czpi
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                einf.f(new czou(true), this.a.a);
            }
        });
        eejiVar.n(czpeVar.G().getString(R.string.keep), new DialogInterface.OnClickListener() { // from class: czpj
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                View view = this.a.a.Q;
                view.getClass();
                view.setSystemUiVisibility(1);
            }
        });
        eejiVar.a();
    }

    public final void h() {
        int iA;
        daoe daoeVar = this.w;
        int i = 0;
        if (daoeVar.b && (iA = daoeVar.a()) > 0) {
            i = iA;
        }
        this.q.n(i);
        this.r.n(i);
        this.s.n(i);
        this.t.n(i);
        this.u.n(i);
        i(this.d);
    }

    public final void i(ebtg ebtgVar) {
        int i;
        boolean z;
        czpe czpeVar = this.a;
        View view = czpeVar.Q;
        view.getClass();
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.media_editor_toolbars);
        ebte ebteVar = ebtgVar.e;
        int i2 = ebtgVar.q;
        if (ebteVar == ebte.a && i2 == 1) {
            z = false;
            i = 1;
        } else {
            i = i2;
            z = true;
        }
        einf.f(new czpd(z), czpeVar);
        aw awVar = new aw();
        int iOrdinal = ebteVar.ordinal();
        if (iOrdinal == 0) {
            awVar = i == 1 ? this.q : this.r;
        } else if (iOrdinal == 1) {
            awVar = i == 1 ? this.t : this.u;
        } else if (iOrdinal == 2) {
            awVar = this.s;
        }
        TransitionManager.beginDelayedTransition(constraintLayout, this.v);
        awVar.b(constraintLayout);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean j(View view, MotionEvent motionEvent) {
        czoq czoqVar;
        if (this.c.a().onTouch(view, motionEvent)) {
            if (this.d.e == ebte.a && (czoqVar = this.o) != null) {
                switch (motionEvent.getActionMasked()) {
                    case 0:
                    case 9:
                        czoqVar.d();
                        break;
                    case 1:
                    case 10:
                        czoqVar.c(true, motionEvent.getX(), motionEvent.getY());
                        break;
                    case 2:
                    case 7:
                        if (motionEvent.getPointerCount() == 1) {
                            float x = motionEvent.getX();
                            float y = motionEvent.getY();
                            if (czoqVar.b.f().toEpochMilli() >= czoqVar.f) {
                                czoqVar.h = czoqVar.i;
                                if (czoqVar.e(x, y)) {
                                    czoqVar.i = R.fraction.large_progress;
                                } else {
                                    czoqVar.i = R.fraction.regular_progress;
                                    czoqVar.b();
                                }
                                czoqVar.a();
                                break;
                            }
                        }
                        break;
                    case 3:
                        czoqVar.c(false, motionEvent.getX(), motionEvent.getY());
                        break;
                    case 5:
                        if (motionEvent.getPointerCount() > 1 && czoqVar.i != R.fraction.invisible_progress) {
                            czoqVar.c(false, motionEvent.getX(), motionEvent.getY());
                            break;
                        }
                        break;
                    case 6:
                        if (motionEvent.getPointerCount() == 2 && czoqVar.i == R.fraction.invisible_progress) {
                            czoqVar.d();
                            break;
                        }
                        break;
                }
            }
        } else if (!b()) {
            return false;
        }
        return true;
    }
}
