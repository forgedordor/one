package defpackage;

import android.graphics.Rect;
import android.util.ArrayMap;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhzw extends TouchDelegate {
    public static final /* synthetic */ int c = 0;
    public final Map a;
    public TouchDelegate b;

    public dhzw(View view, TouchDelegate touchDelegate) {
        super(new Rect(), view);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.a = linkedHashMap;
        if (!(touchDelegate instanceof dhzw)) {
            this.b = touchDelegate;
            return;
        }
        dhzw dhzwVar = (dhzw) touchDelegate;
        this.b = dhzwVar.b;
        linkedHashMap.putAll(dhzwVar.a);
    }

    private static boolean a(MotionEvent motionEvent, TouchDelegate touchDelegate) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        boolean zOnTouchEvent = touchDelegate.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
        return zOnTouchEvent;
    }

    @Override // android.view.TouchDelegate
    public final AccessibilityNodeInfo.TouchDelegateInfo getTouchDelegateInfo() {
        Map map = this.a;
        ArrayMap arrayMap = new ArrayMap(map.size());
        for (View view : map.keySet()) {
            AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo = ((TouchDelegate) map.get(view)).getTouchDelegateInfo();
            boolean z = true;
            ejwl.l(!(r4 instanceof dhzw));
            if (touchDelegateInfo.getRegionCount() != 1) {
                z = false;
            }
            ejwl.l(z);
            arrayMap.put(touchDelegateInfo.getRegionAt(0), view);
        }
        return new AccessibilityNodeInfo.TouchDelegateInfo(arrayMap);
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TouchDelegate touchDelegate = this.b;
        if (touchDelegate != null && a(motionEvent, touchDelegate)) {
            return true;
        }
        Map map = this.a;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            TouchDelegate touchDelegate2 = (TouchDelegate) map.get((View) it.next());
            touchDelegate2.getClass();
            if (a(motionEvent, touchDelegate2)) {
                return true;
            }
        }
        return false;
    }
}
