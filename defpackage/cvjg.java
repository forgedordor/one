package defpackage;

import android.graphics.drawable.RippleDrawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvjg extends GestureDetector {
    public static final /* synthetic */ int a = 0;
    private final View b;
    private final cvjh c;
    private final List d;

    public cvjg(View view, final cvjh cvjhVar, View... viewArr) {
        super(view.getContext(), cvjhVar);
        this.b = view;
        this.c = cvjhVar;
        view.setOnTouchListener(new View.OnTouchListener() { // from class: cvje
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return this.a.onTouchEvent(motionEvent);
            }
        });
        view.setOnClickListener(new View.OnClickListener() { // from class: cvjf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i = cvjg.a;
                cvjhVar.a();
            }
        });
        this.d = Arrays.asList(viewArr);
    }

    private final void a(boolean z) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setEnabled(z);
        }
    }

    private final void b(boolean z) {
        View view = this.b;
        if (view.getBackground() instanceof RippleDrawable) {
            RippleDrawable rippleDrawable = (RippleDrawable) view.getBackground();
            rippleDrawable.setHotspot(view.getWidth() / 2, view.getHeight() / 2);
            rippleDrawable.setVisible(true, true);
        }
        view.setPressed(z);
    }

    @Override // android.view.GestureDetector
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            a(false);
            b(true);
            return zOnTouchEvent;
        }
        if (actionMasked == 1) {
            cvjh cvjhVar = this.c;
            if (cvjhVar != null && cvjhVar.a) {
                cvjhVar.b();
            }
        } else if (actionMasked != 3) {
            return zOnTouchEvent;
        }
        a(true);
        b(false);
        return zOnTouchEvent;
    }
}
