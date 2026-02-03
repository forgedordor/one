package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnsa {
    public final Context a;
    public final ea b;
    public final eosc c;
    public final drob d;
    public final dnsd e;
    public final dnsf f;
    public final fdae g;
    public final fdae h;
    public final dnov i;
    public final boolean j;
    public Object n;
    public final dnrn o;
    private final fdjx p;
    public final dnrz k = new dnrz(this);
    private final fctc q = fctd.a(new fdae() { // from class: dnrq
        @Override // defpackage.fdae
        public final Object invoke() {
            Object systemService = this.a.a.getSystemService("accessibility");
            AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
            boolean z = false;
            if (accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    });
    private final fctc r = fctd.a(new fdae() { // from class: dnrr
        @Override // defpackage.fdae
        public final Object invoke() {
            Optional optionalEmpty = Optional.empty();
            Optional optionalEmpty2 = Optional.empty();
            Optional optionalEmpty3 = Optional.empty();
            dron dronVar = new dron();
            dnsa dnsaVar = this.a;
            return new drov(dronVar, ekgb.r(dnsaVar.e), optionalEmpty, true, dnsaVar.d, dnsaVar.c, true, optionalEmpty2, optionalEmpty3);
        }
    });
    private final fctc s = fctd.a(new fdae() { // from class: dnrs
        @Override // defpackage.fdae
        public final Object invoke() {
            drow drowVar = new drow();
            drowVar.n = 1;
            int i = drowVar.m;
            drowVar.e = 9;
            drowVar.a = -1.0f;
            drowVar.m = i | 419;
            drowVar.d(0);
            drowVar.a(0);
            drowVar.b(0);
            drowVar.m |= 3072;
            drowVar.c(false);
            drowVar.j = -1;
            int i2 = drowVar.m;
            drowVar.h = true;
            drowVar.g = null;
            drowVar.k = true;
            drowVar.l = true;
            drowVar.o = 1;
            drowVar.p = 1;
            drowVar.m = i2 | 123392;
            drowVar.a(18);
            drowVar.f = 1;
            drowVar.m |= 64;
            dnsa dnsaVar = this.a;
            drowVar.d(dnsaVar.a.getResources().getDimensionPixelSize(R.dimen.emoji_tab_height));
            drowVar.b(180);
            drowVar.c(dnsaVar.b());
            dnkf dnkfVar = dnsaVar.i.d;
            drowVar.g = dnkfVar != null ? ((dnjr) dnkfVar).a : null;
            if (drowVar.m == 131071 && drowVar.n != 0 && drowVar.o != 0 && drowVar.p != 0) {
                return new drox(drowVar.a, drowVar.b, drowVar.c, drowVar.d, drowVar.e, drowVar.f, drowVar.g, drowVar.h, drowVar.i, drowVar.j, drowVar.k, drowVar.l);
            }
            StringBuilder sb = new StringBuilder();
            if (drowVar.n == 0) {
                sb.append(" headerLayoutOrientation");
            }
            if ((1 & drowVar.m) == 0) {
                sb.append(" headerIconSelectedOverrideTint");
            }
            if ((drowVar.m & 2) == 0) {
                sb.append(" rows");
            }
            if ((drowVar.m & 4) == 0) {
                sb.append(" rowHeight");
            }
            if ((drowVar.m & 8) == 0) {
                sb.append(" maxRecentCount");
            }
            if ((drowVar.m & 16) == 0) {
                sb.append(" poolSize");
            }
            if ((drowVar.m & 32) == 0) {
                sb.append(" columns");
            }
            if ((drowVar.m & 64) == 0) {
                sb.append(" minRowsPerCategory");
            }
            if ((drowVar.m & 128) == 0) {
                sb.append(" emojiIconBackground");
            }
            if ((drowVar.m & 256) == 0) {
                sb.append(" hideCategoryTitle");
            }
            if ((drowVar.m & 512) == 0) {
                sb.append(" displayEmojiVariants");
            }
            if ((drowVar.m & 1024) == 0) {
                sb.append(" emojiPlaceHolderDrawable");
            }
            if ((drowVar.m & 2048) == 0) {
                sb.append(" customEmojiTypeface");
            }
            if ((drowVar.m & 4096) == 0) {
                sb.append(" popupWindowFocusable");
            }
            if ((drowVar.m & 8192) == 0) {
                sb.append(" categoryIconMinWidth");
            }
            if ((drowVar.m & 16384) == 0) {
                sb.append(" scrollToHeaderPositionOnCategoryChange");
            }
            if ((drowVar.m & 32768) == 0) {
                sb.append(" enableHorizontalCategoryStartMargin");
            }
            if (drowVar.o == 0) {
                sb.append(" highLightSelectedEmojiStatus");
            }
            if (drowVar.p == 0) {
                sb.append(" scrollToInitialEmojiOption");
            }
            if ((drowVar.m & 65536) == 0) {
                sb.append(" useTitleCaseCategoryNames");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
    });
    public final fctc l = fctd.a(new fdae() { // from class: dnrt
        @Override // defpackage.fdae
        public final Object invoke() {
            drot drotVar = new drot();
            drotVar.e = (byte) (drotVar.e | 12);
            drotVar.a(false);
            drotVar.d = null;
            drotVar.b = 9;
            drotVar.e = (byte) (drotVar.e | 2);
            dnsa dnsaVar = this.a;
            drotVar.a = dnsaVar.a.getResources().getDimensionPixelSize(R.dimen.emoji_tab_height);
            drotVar.e = (byte) (drotVar.e | 1);
            drotVar.a(dnsaVar.b());
            dnkf dnkfVar = dnsaVar.i.d;
            drotVar.d = dnkfVar != null ? ((dnjr) dnkfVar).a : null;
            if (drotVar.e == 31) {
                return new drou(drotVar.a, drotVar.b, drotVar.c, drotVar.d);
            }
            StringBuilder sb = new StringBuilder();
            if ((drotVar.e & 1) == 0) {
                sb.append(" rowHeight");
            }
            if ((drotVar.e & 2) == 0) {
                sb.append(" columns");
            }
            if ((drotVar.e & 4) == 0) {
                sb.append(" emojiIconBackground");
            }
            if ((drotVar.e & 8) == 0) {
                sb.append(" emojiPlaceHolderDrawable");
            }
            if ((drotVar.e & 16) == 0) {
                sb.append(" popupWindowFocusable");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
    });
    public final drrc m = new drrc() { // from class: dnru
        @Override // defpackage.drrc
        public final void a(View view, ImageView imageView, View view2, boolean z) {
            Drawable background;
            Drawable background2;
            dnsa dnsaVar = this.a;
            boolean z2 = dnsaVar.j;
            if (z2) {
                Drawable drawable = dnsaVar.a.getDrawable(R.drawable.emoji_screen_selected_category);
                if (drawable == null) {
                    drawable = null;
                } else if (!z) {
                    drawable.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN));
                }
                view.setBackground(drawable);
                if (view2 != null && (background2 = view2.getBackground()) != null) {
                    background2.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN));
                }
            }
            dpgl dpglVar = ((dpux) dnsaVar.h.invoke()).k;
            if (dpglVar != null) {
                int i = z ? dpglVar.b : dpglVar.c;
                if (imageView != null) {
                    imageView.setColorFilter(i);
                }
                if (z2) {
                    view.getBackground().setColorFilter(new PorterDuffColorFilter(z ? dpglVar.g : 0, PorterDuff.Mode.SRC_IN));
                } else {
                    if (view2 == null || (background = view2.getBackground()) == null) {
                        return;
                    }
                    background.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
                }
            }
        }
    };

    public dnsa(Context context, ea eaVar, fdjx fdjxVar, eosc eoscVar, drob drobVar, dnsd dnsdVar, Optional optional, dnsf dnsfVar, fdae fdaeVar, fdae fdaeVar2, dnrn dnrnVar, dnov dnovVar) {
        this.a = context;
        this.b = eaVar;
        this.p = fdjxVar;
        this.c = eoscVar;
        this.d = drobVar;
        this.e = dnsdVar;
        this.f = dnsfVar;
        this.g = fdaeVar;
        this.h = fdaeVar2;
        this.o = dnrnVar;
        this.i = dnovVar;
        this.j = ((Boolean) fdct.a(optional, false)).booleanValue();
        fdil.d(fdjxVar, null, null, new dnrw(this, null), 3);
        fdil.d(fdjxVar, null, null, new dnry(this, null), 3);
    }

    public final void a(boolean z) {
        int i = true != z ? 8 : 0;
        dnsf dnsfVar = this.f;
        dnsfVar.c.setVisibility(i);
        dnsfVar.d.setVisibility((z && this.i.f) ? 0 : 8);
        dnsfVar.b.setVisibility(true != z ? 8 : 0);
    }

    public final boolean b() {
        return ((Boolean) this.q.a()).booleanValue();
    }

    public final void c() {
        Object obj = this.n;
        if (!(obj instanceof drqt)) {
            dnsf dnsfVar = this.f;
            drqt drqtVar = new drqt(dnsfVar.c, dnsfVar.a, this.k, (drrl) this.s.a(), (drqx) this.r.a());
            drqtVar.u = true;
            if (drqtVar.o.isEmpty()) {
                Context context = drqtVar.b;
                ejwm ejwmVar = new ejwm() { // from class: drqe
                    @Override // defpackage.ejwm
                    public final boolean a(Object obj2) {
                        ekrg ekrgVar = drqt.a;
                        return true;
                    }
                };
                drqf drqfVar = new drqf(drqtVar);
                ekgb ekgbVar = drqtVar.i;
                int i = drqtVar.C;
                drqtVar.d.x();
                drqtVar.y = new drrb(context, ejwmVar, drqfVar, ekgbVar, i);
                drqtVar.w.al(drqtVar.y);
            }
            drqtVar.x.al(drqtVar.f());
            drqtVar.j.ifPresent(new Consumer() { // from class: drqg
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    ekrg ekrgVar = drqt.a;
                    ((drsd) obj2).g();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            this.n = drqtVar;
            obj = drqtVar;
        }
        ((drqt) obj).c(this.m);
        a(true);
    }
}
