package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class czui extends FrameLayout implements View.OnClickListener {
    protected czuh a;
    protected View b;

    public czui(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected abstract View a();

    protected abstract void b();

    public final void c() {
        if (this.a == null) {
            throw new IllegalStateException("bind() must be called before show the popup.");
        }
        b();
        setVisibility(0);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.b) {
            this.a.i();
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        View viewA = a();
        this.b = viewA;
        if (viewA != null) {
            viewA.setOnClickListener(this);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }
}
