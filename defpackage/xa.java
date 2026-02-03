package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.apps.messaging.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xa {
    private static xa b;
    private WeakHashMap d;
    private final WeakHashMap e = new WeakHashMap(0);
    private TypedValue f;
    private boolean g;
    private wz h;
    private static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static final wy c = new wy();

    public static synchronized PorterDuffColorFilter b(int i, PorterDuff.Mode mode) {
        wy wyVar = c;
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) wyVar.c(Integer.valueOf(wy.a(i, mode)));
        if (porterDuffColorFilter != null) {
            return porterDuffColorFilter;
        }
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i, mode);
        return porterDuffColorFilter2;
    }

    public static synchronized xa e() {
        if (b == null) {
            b = new xa();
        }
        return b;
    }

    static void h(Drawable drawable, yv yvVar, int[] iArr) {
        ColorStateList colorStateList;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        PorterDuffColorFilter porterDuffColorFilterB = null;
        if (yvVar.d) {
            colorStateList = yvVar.a;
        } else {
            if (!yvVar.c) {
                drawable.clearColorFilter();
                return;
            }
            colorStateList = null;
        }
        PorterDuff.Mode mode = yvVar.c ? yvVar.b : a;
        if (colorStateList != null && mode != null) {
            porterDuffColorFilterB = b(colorStateList.getColorForState(iArr, 0), mode);
        }
        drawable.setColorFilter(porterDuffColorFilterB);
    }

    private final synchronized Drawable i(Context context, long j) {
        WeakReference weakReference;
        ctz ctzVar = (ctz) this.e.get(context);
        if (ctzVar != null && (weakReference = (WeakReference) ctzVar.d(j)) != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            ctzVar.i(j);
        }
        return null;
    }

    private final synchronized void j(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            WeakHashMap weakHashMap = this.e;
            ctz ctzVar = (ctz) weakHashMap.get(context);
            if (ctzVar == null) {
                ctzVar = new ctz();
                weakHashMap.put(context, ctzVar);
            }
            ctzVar.h(j, new WeakReference(constantState));
        }
    }

    final synchronized ColorStateList a(Context context, int i) {
        cvx cvxVar;
        WeakHashMap weakHashMap = this.d;
        ColorStateList colorStateListD = null;
        ColorStateList colorStateList = (weakHashMap == null || (cvxVar = (cvx) weakHashMap.get(context)) == null) ? null : (ColorStateList) cvy.a(cvxVar, i);
        if (colorStateList == null) {
            wz wzVar = this.h;
            if (wzVar != null) {
                if (i == R.drawable.abc_edit_text_material) {
                    colorStateListD = kxj.d(context, R.color.abc_tint_edittext);
                } else if (i == R.drawable.abc_switch_track_mtrl_alpha) {
                    colorStateListD = kxj.d(context, R.color.abc_tint_switch_track);
                } else if (i == R.drawable.abc_switch_thumb_material) {
                    int[][] iArr = new int[3][];
                    int[] iArr2 = new int[3];
                    ColorStateList colorStateListC = ys.c(context, R.attr.colorSwitchThumbNormal);
                    if (colorStateListC == null || !colorStateListC.isStateful()) {
                        iArr[0] = ys.a;
                        iArr2[0] = ys.a(context, R.attr.colorSwitchThumbNormal);
                        iArr[1] = ys.d;
                        iArr2[1] = ys.b(context, R.attr.colorControlActivated);
                        iArr[2] = ys.e;
                        iArr2[2] = ys.b(context, R.attr.colorSwitchThumbNormal);
                    } else {
                        int[] iArr3 = ys.a;
                        iArr[0] = iArr3;
                        iArr2[0] = colorStateListC.getColorForState(iArr3, 0);
                        iArr[1] = ys.d;
                        iArr2[1] = ys.b(context, R.attr.colorControlActivated);
                        iArr[2] = ys.e;
                        iArr2[2] = colorStateListC.getDefaultColor();
                    }
                    colorStateListD = new ColorStateList(iArr, iArr2);
                } else if (i == R.drawable.abc_btn_default_mtrl_shape) {
                    colorStateListD = qt.b(context, ys.b(context, R.attr.colorButtonNormal));
                } else if (i == R.drawable.abc_btn_borderless_material) {
                    colorStateListD = qt.b(context, 0);
                } else if (i == R.drawable.abc_btn_colored_material) {
                    colorStateListD = qt.b(context, ys.b(context, R.attr.colorAccent));
                } else if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                    colorStateListD = kxj.d(context, R.color.abc_tint_spinner);
                } else if (qt.a(((qt) wzVar).b, i)) {
                    colorStateListD = ys.c(context, R.attr.colorControlNormal);
                } else if (qt.a(((qt) wzVar).e, i)) {
                    colorStateListD = kxj.d(context, R.color.abc_tint_default);
                } else if (qt.a(((qt) wzVar).f, i)) {
                    colorStateListD = kxj.d(context, R.color.abc_tint_btn_checkable);
                } else if (i == R.drawable.abc_seekbar_thumb_material) {
                    colorStateListD = kxj.d(context, R.color.abc_tint_seek_thumb);
                    i = R.drawable.abc_seekbar_thumb_material;
                }
            }
            if (colorStateListD != null) {
                if (this.d == null) {
                    this.d = new WeakHashMap();
                }
                cvx cvxVar2 = (cvx) this.d.get(context);
                if (cvxVar2 == null) {
                    cvxVar2 = new cvx();
                    this.d.put(context, cvxVar2);
                }
                int i2 = cvxVar2.d;
                if (i2 == 0 || i > cvxVar2.b[i2 - 1]) {
                    if (cvxVar2.a && i2 >= cvxVar2.b.length) {
                        cvy.b(cvxVar2);
                    }
                    int i3 = cvxVar2.d;
                    int[] iArr4 = cvxVar2.b;
                    if (i3 >= iArr4.length) {
                        int iD = cwe.d(i3 + 1);
                        int[] iArrCopyOf = Arrays.copyOf(iArr4, iD);
                        iArrCopyOf.getClass();
                        cvxVar2.b = iArrCopyOf;
                        Object[] objArrCopyOf = Arrays.copyOf(cvxVar2.c, iD);
                        objArrCopyOf.getClass();
                        cvxVar2.c = objArrCopyOf;
                    }
                    cvxVar2.b[i3] = i;
                    cvxVar2.c[i3] = colorStateListD;
                    cvxVar2.d = i3 + 1;
                } else {
                    cvxVar2.f(i, colorStateListD);
                }
                return colorStateListD;
            }
            colorStateList = colorStateListD;
        }
        return colorStateList;
    }

    public final synchronized Drawable c(Context context, int i) {
        return d(context, i, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018d A[Catch: all -> 0x01b7, TryCatch #0 {, blocks: (B:4:0x0007, B:13:0x002d, B:15:0x0031, B:16:0x0038, B:34:0x00ad, B:36:0x00b3, B:38:0x00b9, B:45:0x00ce, B:83:0x01a8, B:43:0x00ca, B:47:0x00d4, B:51:0x00eb, B:55:0x0119, B:57:0x0143, B:76:0x018d, B:78:0x019e, B:62:0x0155, B:65:0x0162, B:67:0x016f, B:70:0x0177, B:19:0x005c, B:32:0x00a3, B:24:0x0067, B:26:0x0084, B:28:0x008e, B:30:0x0098, B:7:0x000e, B:9:0x0019, B:11:0x001d, B:86:0x01ad, B:87:0x01b6), top: B:91:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final synchronized android.graphics.drawable.Drawable d(android.content.Context r17, int r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xa.d(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public final synchronized void f(Context context) {
        ctz ctzVar = (ctz) this.e.get(context);
        if (ctzVar != null) {
            ctzVar.g();
        }
    }

    public final synchronized void g(wz wzVar) {
        this.h = wzVar;
    }
}
