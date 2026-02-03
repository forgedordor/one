package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtle extends lji {
    public final dtli f;
    private final View g;
    private final Rect h;
    private final String i;

    public dtle(dtli dtliVar, View view) {
        super(dtliVar);
        this.h = new Rect();
        this.f = dtliVar;
        this.g = view;
        this.i = dtliVar.getResources().getString(R.string.libraries_material_featurehighlight_dismiss);
    }

    @Override // defpackage.lji
    protected final void k(List list) {
        int i = dtli.J;
        dtkj dtkjVar = this.f.g;
        if (dtkjVar.A()) {
            list.add(1);
        }
        if (dtkjVar.y()) {
            list.add(2);
        }
        if (dtkjVar.z()) {
            list.add(3);
        }
        list.add(4);
        list.add(5);
    }

    @Override // defpackage.lji
    protected final void l(int i, AccessibilityEvent accessibilityEvent) {
        if (i == 1) {
            dtli dtliVar = this.f;
            int i2 = dtli.J;
            accessibilityEvent.setContentDescription(dtliVar.g.g());
            return;
        }
        if (i == 2) {
            dtli dtliVar2 = this.f;
            int i3 = dtli.J;
            accessibilityEvent.setContentDescription(dtliVar2.g.e());
        } else if (i == 3) {
            dtli dtliVar3 = this.f;
            int i4 = dtli.J;
            accessibilityEvent.setContentDescription(dtliVar3.g.f());
        } else if (i == 4) {
            View view = this.g;
            accessibilityEvent.setContentDescription(view.getContentDescription());
            accessibilityEvent.setClassName(view.getAccessibilityClassName());
        } else if (i == 5) {
            accessibilityEvent.setContentDescription(this.i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    @Override // defpackage.lji
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void n(int r5, defpackage.lhg r6) {
        /*
            r4 = this;
            r0 = 1
            java.lang.String r1 = "android.widget.TextView"
            if (r5 == r0) goto Laf
            r0 = 2
            if (r5 == r0) goto L97
            r0 = 3
            r1 = 16
            if (r5 == r0) goto L7a
            r0 = 4
            java.lang.String r2 = ""
            if (r5 == r0) goto L39
            r0 = 5
            if (r5 == r0) goto L1f
            android.graphics.Rect r5 = r4.h
            r5.setEmpty()
            r6.w(r2)
            goto Lc6
        L1f:
            android.graphics.Rect r5 = r4.h
            dtli r0 = r4.f
            int r2 = r0.getWidth()
            int r0 = r0.getHeight()
            r3 = 0
            r5.set(r3, r3, r2, r0)
            java.lang.String r5 = r4.i
            r6.w(r5)
            r6.h(r1)
            goto Lc6
        L39:
            android.graphics.Rect r5 = r4.h
            dtli r0 = r4.f
            int r3 = defpackage.dtli.J
            android.graphics.Rect r0 = r0.a
            r5.set(r0)
            android.view.View r5 = r4.g
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 == 0) goto L5d
            r0 = r5
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.CharSequence r0 = r0.getText()
            r6.S(r0)
            if (r0 == 0) goto L5d
            int r0 = r0.length()
            if (r0 == 0) goto L5d
            goto L68
        L5d:
            java.lang.CharSequence r0 = r5.getContentDescription()
            if (r0 != 0) goto L64
            goto L65
        L64:
            r2 = r0
        L65:
            r6.w(r2)
        L68:
            java.lang.CharSequence r0 = r5.getAccessibilityClassName()
            r6.s(r0)
            boolean r5 = r5.isClickable()
            r6.t(r5)
            r6.h(r1)
            goto Lc6
        L7a:
            android.graphics.Rect r5 = r4.h
            dtli r0 = r4.f
            int r2 = defpackage.dtli.J
            android.graphics.Rect r2 = r0.d
            r5.set(r2)
            dtkj r5 = r0.g
            java.lang.CharSequence r5 = r5.f()
            r6.S(r5)
            java.lang.String r5 = "android.widget.Button"
            r6.s(r5)
            r6.h(r1)
            goto Lc6
        L97:
            android.graphics.Rect r5 = r4.h
            dtli r0 = r4.f
            int r2 = defpackage.dtli.J
            android.graphics.Rect r2 = r0.c
            r5.set(r2)
            dtkj r5 = r0.g
            java.lang.CharSequence r5 = r5.e()
            r6.S(r5)
            r6.s(r1)
            goto Lc6
        Laf:
            android.graphics.Rect r5 = r4.h
            dtli r0 = r4.f
            int r2 = defpackage.dtli.J
            android.graphics.Rect r2 = r0.b
            r5.set(r2)
            dtkj r5 = r0.g
            java.lang.CharSequence r5 = r5.g()
            r6.S(r5)
            r6.s(r1)
        Lc6:
            android.graphics.Rect r5 = r4.h
            r6.o(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtle.n(int, lhg):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r4 == 3) goto L14;
     */
    @Override // defpackage.lji
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s(int r4, int r5) {
        /*
            r3 = this;
            r0 = 16
            r1 = 0
            if (r5 != r0) goto L24
            r5 = 4
            r0 = 1
            if (r4 != r5) goto L11
            dtli r4 = r3.f
            int r5 = defpackage.dtli.J
            r4.e()
            return r0
        L11:
            r5 = 5
            r2 = 3
            if (r4 == r5) goto L18
            if (r4 != r2) goto L24
            goto L1b
        L18:
            if (r4 != r5) goto L1b
            goto L1c
        L1b:
            r1 = r2
        L1c:
            dtli r4 = r3.f
            int r5 = defpackage.dtli.J
            r4.d(r1)
            return r0
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtle.s(int, int):boolean");
    }
}
