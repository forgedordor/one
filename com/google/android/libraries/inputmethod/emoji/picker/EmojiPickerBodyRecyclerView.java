package com.google.android.libraries.inputmethod.emoji.picker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.google.android.apps.messaging.R;
import defpackage.drza;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.wb;
import defpackage.wg;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class EmojiPickerBodyRecyclerView extends drza {
    public static final ekrg ab = ekrg.c("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyRecyclerView");
    public wg ac;
    public int ad;

    public EmojiPickerBodyRecyclerView(Context context) {
        super(context);
    }

    public final void a(boolean z) {
        wb wbVar = this.o;
        if (wbVar instanceof EmojiPickerLayoutManager) {
            ((EmojiPickerLayoutManager) wbVar).J = z;
        } else {
            ((ekrd) ((ekrd) ab.j()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyRecyclerView", "setScrollable", 102, "EmojiPickerBodyRecyclerView.java")).t("Called setScrollable() with %s, but this only works when the LayoutManager of this RecyclerView is an EmojiPickerLayoutManager", wbVar == null ? "null" : wbVar.getClass().getName());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (this.F == 1) {
            motionEvent.setAction(3);
        }
        return zOnTouchEvent;
    }

    public EmojiPickerBodyRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setTag(R.id.default_focus_in_navigation_mode, true);
    }

    public EmojiPickerBodyRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
