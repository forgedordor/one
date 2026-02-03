package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpdw {
    private ViewStub a;
    private View b;
    private final cpdv c;
    private int d;
    private final int e;

    public cpdw(View view, int i, int i2) {
        this(view, i, i2, (cpdv) null);
    }

    public static View c(Class cls, LayoutInflater layoutInflater, View view, int i, int i2, int i3) {
        ViewStub viewStub = (ViewStub) view.findViewById(i);
        viewStub.getClass();
        viewStub.setLayoutResource(i2);
        viewStub.setLayoutInflater(layoutInflater);
        viewStub.setInflatedId(i3);
        View viewInflate = viewStub.inflate();
        viewInflate.getClass();
        boolean z = true;
        if (i3 != -1 && viewInflate.getId() != i3) {
            z = false;
        }
        ejwl.l(z);
        ejwl.l(cls.isInstance(viewInflate));
        View view2 = (View) cls.cast(viewInflate);
        view2.getClass();
        return view2;
    }

    public final int a() {
        View view = this.b;
        if (view != null) {
            return view.getVisibility();
        }
        return 8;
    }

    public final View b() {
        ViewStub viewStub;
        if (this.b == null && (viewStub = this.a) != null) {
            if (viewStub.getParent() != null) {
                View viewInflate = this.a.inflate();
                this.b = viewInflate;
                cpdv cpdvVar = this.c;
                if (cpdvVar != null) {
                    cpdvVar.a(viewInflate);
                }
            }
            this.a = null;
        }
        return this.b;
    }

    public final void d(Consumer consumer) {
        View view = this.b;
        if (view != null) {
            consumer.accept(view);
        }
    }

    public final void e() {
        View view;
        g(8);
        if (this.a != null || (view = this.b) == null || this.d == 0) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            ViewStub viewStub = new ViewStub(viewGroup.getContext(), this.d);
            viewStub.setInflatedId(view.getId());
            int i = this.e;
            if (i != -1) {
                viewStub.setId(i);
            }
            int iIndexOfChild = viewGroup.indexOfChild(view);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            viewGroup.removeViewInLayout(view);
            if (layoutParams == null) {
                viewGroup.addView(viewStub, iIndexOfChild);
            } else {
                viewGroup.addView(viewStub, iIndexOfChild, layoutParams);
            }
            this.a = viewStub;
            this.b = null;
        }
    }

    public final void f(int i) {
        this.d = i;
        ViewStub viewStub = this.a;
        if (viewStub != null) {
            viewStub.setLayoutResource(i);
        }
    }

    public final void g(int i) {
        View viewB;
        if ((this.b == null && i == 8) || (viewB = b()) == null) {
            return;
        }
        viewB.setVisibility(i);
    }

    public final boolean h() {
        return (this.a == null && this.b == null) ? false : true;
    }

    public final boolean i() {
        return this.a == null && this.b != null;
    }

    public cpdw(View view, int i, int i2, int i3) {
        ViewStub viewStub = (ViewStub) view.findViewById(i);
        this.a = viewStub;
        this.d = i3;
        this.c = null;
        if (viewStub != null) {
            viewStub.setLayoutResource(i3);
            this.e = i;
        } else {
            this.b = view.findViewById(i2);
            this.d = 0;
            this.e = -1;
        }
    }

    public cpdw(View view, int i, int i2, cpdv cpdvVar) {
        ViewStub viewStub = (ViewStub) view.findViewById(i);
        this.a = viewStub;
        if (viewStub == null) {
            this.b = view.findViewById(i2);
            this.d = 0;
            this.e = -1;
        } else {
            this.d = viewStub.getLayoutResource();
            this.e = i;
        }
        this.c = cpdvVar;
    }
}
