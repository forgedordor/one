package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatImageButton;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zf implements op {
    oc a;
    public of b;
    final /* synthetic */ Toolbar c;

    public zf(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // defpackage.op
    public final int a() {
        return 0;
    }

    @Override // defpackage.op
    public final void c(Context context, oc ocVar) {
        of ofVar;
        oc ocVar2 = this.a;
        if (ocVar2 != null && (ofVar = this.b) != null) {
            ocVar2.t(ofVar);
        }
        this.a = ocVar;
    }

    @Override // defpackage.op
    public final Parcelable dG() {
        return null;
    }

    @Override // defpackage.op
    public final void e(oo ooVar) {
        throw null;
    }

    @Override // defpackage.op
    public final void f(boolean z) {
        if (this.b != null) {
            oc ocVar = this.a;
            if (ocVar != null) {
                int size = ocVar.size();
                for (int i = 0; i < size; i++) {
                    if (this.a.getItem(i) == this.b) {
                        return;
                    }
                }
            }
            i(this.b);
        }
    }

    @Override // defpackage.op
    public final boolean g() {
        return false;
    }

    @Override // defpackage.op
    public final boolean h(ox oxVar) {
        return false;
    }

    @Override // defpackage.op
    public final boolean i(of ofVar) {
        Toolbar toolbar = this.c;
        KeyEvent.Callback callback = toolbar.h;
        if (callback instanceof nc) {
            ((nc) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.h);
        toolbar.removeView(toolbar.g);
        toolbar.h = null;
        ArrayList arrayList = toolbar.u;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                arrayList.clear();
                this.b = null;
                toolbar.requestLayout();
                ofVar.h(false);
                toolbar.z();
                return true;
            }
            toolbar.addView((View) arrayList.get(size));
        }
    }

    @Override // defpackage.op
    public final boolean j(of ofVar) {
        Toolbar toolbar = this.c;
        if (toolbar.g == null) {
            toolbar.g = new AppCompatImageButton(toolbar.getContext(), null, R.attr.toolbarNavigationButtonStyle);
            toolbar.g.setImageDrawable(toolbar.e);
            toolbar.g.setContentDescription(toolbar.f);
            zg zgVar = new zg();
            zgVar.a = (toolbar.m & 112) | 8388611;
            zgVar.b = 2;
            toolbar.g.setLayoutParams(zgVar);
            toolbar.g.setOnClickListener(new zd(toolbar));
        }
        ViewParent parent = toolbar.g.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.g);
            }
            toolbar.addView(toolbar.g);
        }
        toolbar.h = ofVar.getActionView();
        this.b = ofVar;
        ViewParent parent2 = toolbar.h.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.h);
            }
            zg zgVar2 = new zg();
            zgVar2.a = 8388611 | (toolbar.m & 112);
            zgVar2.b = 2;
            toolbar.h.setLayoutParams(zgVar2);
            toolbar.addView(toolbar.h);
        }
        int childCount = toolbar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = toolbar.getChildAt(childCount);
            if (((zg) childAt.getLayoutParams()).b != 2 && childAt != toolbar.a) {
                toolbar.removeViewAt(childCount);
                toolbar.u.add(childAt);
            }
        }
        toolbar.requestLayout();
        ofVar.h(true);
        KeyEvent.Callback callback = toolbar.h;
        if (callback instanceof nc) {
            ((nc) callback).onActionViewExpanded();
        }
        toolbar.z();
        return true;
    }

    @Override // defpackage.op
    public final void n(Parcelable parcelable) {
    }

    @Override // defpackage.op
    public final void d(oc ocVar, boolean z) {
    }
}
