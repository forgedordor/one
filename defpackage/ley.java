package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.messaging.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ley {
    private static WeakHashMap b = null;
    private static Field c = null;
    private static boolean d = false;
    public static final int[] a = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    private static final lej e = new lej();

    private static void A(int i, View view) {
        List listI = i(view);
        for (int i2 = 0; i2 < listI.size(); i2++) {
            if (((lhd) listI.get(i2)).a() == i) {
                listI.remove(i2);
                return;
            }
        }
    }

    private static void B(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static View.AccessibilityDelegate a(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return les.a(view);
        }
        if (d) {
            return null;
        }
        if (c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                d = true;
                return null;
            }
        }
        Object obj = c.get(view);
        if (obj instanceof View.AccessibilityDelegate) {
            return (View.AccessibilityDelegate) obj;
        }
        return null;
    }

    public static View b(View view, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) ler.b(view, i);
        }
        View viewFindViewById = view.findViewById(i);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    public static lcl c(View view) {
        View.AccessibilityDelegate accessibilityDelegateA = a(view);
        if (accessibilityDelegateA == null) {
            return null;
        }
        return accessibilityDelegateA instanceof lck ? ((lck) accessibilityDelegateA).a : new lcl(accessibilityDelegateA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static lcw d(View view, lcw lcwVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + lcwVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return leu.a(view, lcwVar);
        }
        ldo ldoVar = (ldo) view.getTag(R.id.tag_on_receive_content_listener);
        if (ldoVar == null) {
            return view.b(lcwVar);
        }
        lcw lcwVarA = ldoVar.a(view, lcwVar);
        if (lcwVarA == null) {
            return null;
        }
        return view.b(lcwVarA);
    }

    @Deprecated
    public static lfn e(View view) {
        if (b == null) {
            b = new WeakHashMap();
        }
        lfn lfnVar = (lfn) b.get(view);
        if (lfnVar != null) {
            return lfnVar;
        }
        lfn lfnVar2 = new lfn(view);
        b.put(view, lfnVar2);
        return lfnVar2;
    }

    public static lgt f(View view, lgt lgtVar) {
        WindowInsets windowInsetsE = lgtVar.e();
        if (windowInsetsE != null) {
            WindowInsets windowInsetsA = Build.VERSION.SDK_INT >= 30 ? let.a(view, windowInsetsE) : lel.a(view, windowInsetsE);
            if (!windowInsetsA.equals(windowInsetsE)) {
                return lgt.p(windowInsetsA, view);
            }
        }
        return lgtVar;
    }

    public static lgt g(View view, lgt lgtVar) {
        WindowInsets windowInsetsE = lgtVar.e();
        if (windowInsetsE != null) {
            WindowInsets windowInsetsB = lel.b(view, windowInsetsE);
            if (!windowInsetsB.equals(windowInsetsE)) {
                return lgt.p(windowInsetsB, view);
            }
        }
        return lgtVar;
    }

    public static CharSequence h(View view) {
        return (CharSequence) new leg(CharSequence.class).d(view);
    }

    public static List i(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static void j(View view, lhd lhdVar) {
        l(view);
        A(lhdVar.a(), view);
        i(view).add(lhdVar);
        m(view, 0);
    }

    public static void k(ViewGroup viewGroup, View view) {
        viewGroup.getOverlay().add(view);
        View view2 = (View) view.getParent();
        view2.getClass();
        view2.setTag(R.id.view_tree_disjoint_parent, viewGroup);
    }

    public static void l(View view) {
        lcl lclVarC = c(view);
        if (lclVarC == null) {
            lclVarC = new lcl();
        }
        p(view, lclVarC);
    }

    static void m(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = false;
            if (h(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
                z = true;
            }
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                int i2 = true != z ? 2048 : 32;
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(i2);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(h(view));
                    B(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", String.valueOf(view.getParent().getClass().getSimpleName()).concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(32);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(h(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static void n(View view, int i) {
        A(i, view);
        m(view, 0);
    }

    public static void o(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            les.b(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    public static void p(View view, lcl lclVar) {
        if (lclVar == null && (a(view) instanceof lck)) {
            lclVar = new lcl();
        }
        B(view);
        view.setAccessibilityDelegate(lclVar == null ? null : lclVar.G);
    }

    public static void q(View view, boolean z) {
        new lei(Boolean.class).e(view, Boolean.valueOf(z));
    }

    public static void r(View view, CharSequence charSequence) {
        new leg(CharSequence.class).e(view, charSequence);
        if (charSequence == null) {
            lej lejVar = e;
            lejVar.a.remove(view);
            view.removeOnAttachStateChangeListener(lejVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(lejVar);
            return;
        }
        lej lejVar2 = e;
        WeakHashMap weakHashMap = lejVar2.a;
        boolean z = false;
        if (view.isShown() && view.getWindowVisibility() == 0) {
            z = true;
        }
        weakHashMap.put(view, Boolean.valueOf(z));
        view.addOnAttachStateChangeListener(lejVar2);
        if (view.isAttachedToWindow()) {
            lejVar2.a(view);
        }
    }

    public static void s(View view, String[] strArr, ldo ldoVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            leu.b(view, strArr, ldoVar);
            return;
        }
        String[] strArr2 = null;
        if (strArr == null || strArr.length == 0) {
            strArr = null;
        }
        boolean z = true;
        if (ldoVar != null) {
            lcg.b(strArr != null, "When the listener is set, MIME types must also be set");
        }
        if (strArr != null) {
            int i = 0;
            while (true) {
                if (i >= strArr.length) {
                    break;
                }
                if (strArr[i].startsWith("*")) {
                    z = false;
                    break;
                }
                i++;
            }
            lcg.b(z, "A MIME type set here must not start with *: ".concat(String.valueOf(Arrays.toString(strArr))));
            strArr2 = strArr;
        }
        view.setTag(R.id.tag_on_receive_content_mime_types, strArr2);
        view.setTag(R.id.tag_on_receive_content_listener, ldoVar);
    }

    public static void t(View view, ldr ldrVar) {
        lep.a(view, ldrVar.a);
    }

    public static void u(View view, CharSequence charSequence) {
        new leh(CharSequence.class).e(view, charSequence);
    }

    static boolean v(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        lex lexVarC = lex.c(view);
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = lexVarC.b;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = lex.a;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (lexVarC.b == null) {
                        lexVarC.b = new WeakHashMap();
                    }
                    int size = arrayList.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        View view2 = (View) ((WeakReference) arrayList.get(size)).get();
                        if (view2 == null) {
                            arrayList.remove(size);
                        } else {
                            lexVarC.b.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                lexVarC.b.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View viewB = lexVarC.b(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewB != null && !KeyEvent.isModifierKey(keyCode)) {
                lexVarC.a().put(keyCode, new WeakReference(viewB));
            }
        }
        return viewB != null;
    }

    public static boolean w(View view, KeyEvent keyEvent) {
        int iIndexOfKey;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        lex lexVarC = lex.c(view);
        WeakReference weakReference = lexVarC.c;
        if (weakReference != null && weakReference.get() == keyEvent) {
            return false;
        }
        lexVarC.c = new WeakReference(keyEvent);
        SparseArray sparseArrayA = lexVarC.a();
        WeakReference weakReference2 = null;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArrayA.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference2 = (WeakReference) sparseArrayA.valueAt(iIndexOfKey);
            sparseArrayA.removeAt(iIndexOfKey);
        }
        if (weakReference2 == null) {
            weakReference2 = (WeakReference) sparseArrayA.get(keyEvent.getKeyCode());
        }
        if (weakReference2 == null) {
            return false;
        }
        View view2 = (View) weakReference2.get();
        if (view2 == null || !view2.isAttachedToWindow()) {
            return true;
        }
        lex.d(view2);
        return true;
    }

    public static String[] x(View view) {
        return Build.VERSION.SDK_INT >= 31 ? leu.c(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void y(View view, lhd lhdVar, lhs lhsVar) {
        j(view, new lhd(null, lhdVar.p, null, lhsVar, lhdVar.q));
    }

    @Deprecated
    public static void z(View view) {
        view.setAccessibilityLiveRegion(1);
    }
}
