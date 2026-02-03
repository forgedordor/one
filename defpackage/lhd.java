package defpackage;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lhd {
    public static final lhd a;
    public static final lhd b;
    public static final lhd c;
    public static final lhd d;
    public static final lhd e;
    public static final lhd f;
    public static final lhd g;
    public static final lhd h;
    public static final lhd i;
    public static final lhd j;
    public static final lhd k;
    public static final lhd l;
    public static final lhd m;
    public static final lhd n;
    final Object o;
    public final int p;
    public final Class q;
    public final lhs r;

    static {
        new lhd(1, (CharSequence) null);
        new lhd(2, (CharSequence) null);
        new lhd(4, (CharSequence) null);
        new lhd(8, (CharSequence) null);
        a = new lhd(16, (CharSequence) null);
        new lhd(32, (CharSequence) null);
        b = new lhd(64, (CharSequence) null);
        c = new lhd(128, (CharSequence) null);
        new lhd(256, lhl.class);
        new lhd(512, lhl.class);
        new lhd(1024, lhm.class);
        new lhd(2048, lhm.class);
        d = new lhd(4096, (CharSequence) null);
        e = new lhd(8192, (CharSequence) null);
        new lhd(16384, (CharSequence) null);
        new lhd(32768, (CharSequence) null);
        new lhd(65536, (CharSequence) null);
        new lhd(131072, lhq.class);
        f = new lhd(262144, (CharSequence) null);
        g = new lhd(524288, (CharSequence) null);
        h = new lhd(1048576, (CharSequence) null);
        new lhd(2097152, lhr.class);
        new lhd(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        i = new lhd(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, lho.class);
        j = new lhd(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        k = new lhd(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        l = new lhd(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        m = new lhd(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new lhd(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new lhd(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new lhd(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new lhd(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new lhd(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new lhd(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, lhp.class);
        new lhd(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, lhn.class);
        new lhd(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new lhd(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new lhd(Build.VERSION.SDK_INT >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new lhd(Build.VERSION.SDK_INT >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new lhd(Build.VERSION.SDK_INT >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new lhd(Build.VERSION.SDK_INT >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new lhd(Build.VERSION.SDK_INT >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new lhd(Build.VERSION.SDK_INT >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        n = new lhd(Build.VERSION.SDK_INT >= 34 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public lhd(int i2, CharSequence charSequence) {
        this(null, i2, charSequence, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.o).getId();
    }

    public final CharSequence b() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.o).getLabel();
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof lhd) && this.o.equals(((lhd) obj).o);
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strG = lhg.g(this.p);
        if (strG.equals("ACTION_UNKNOWN") && b() != null) {
            strG = b().toString();
        }
        sb.append(strG);
        return sb.toString();
    }

    private lhd(int i2, Class cls) {
        this(null, i2, null, null, cls);
    }

    public lhd(Object obj, int i2, CharSequence charSequence, lhs lhsVar, Class cls) {
        this.p = i2;
        this.r = lhsVar;
        this.o = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence) : obj;
        this.q = cls;
    }
}
