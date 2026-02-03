package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebxc extends pou {
    public WindowInsets a;
    private final ViewPager b;
    private SparseArray c = new SparseArray();
    private ebxi d;
    private final ebxh e;

    public ebxc(ViewPager viewPager, ebxh ebxhVar) {
        this.b = viewPager;
        this.e = ebxhVar;
    }

    @Override // defpackage.pou
    public final Parcelable a() {
        ViewPager viewPager = this.b;
        int childCount = viewPager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewPager.getChildAt(i);
            if (childAt.isSaveFromParentEnabled()) {
                childAt.saveHierarchyState(this.c);
            }
        }
        Bundle bundle = new Bundle();
        bundle.putSparseParcelableArray("viewStates", this.c);
        return bundle;
    }

    @Override // defpackage.pou
    public final Object c(ViewGroup viewGroup, int i) {
        View ebvvVar;
        Context context = viewGroup.getContext();
        if (i == 0) {
            ebvvVar = new ebvv(context, this.e);
            ebvvVar.setId(i);
        } else {
            if (i != 1) {
                throw new IllegalStateException(a.g(i, "Unknown page position: "));
            }
            ebvvVar = new ebwj(context, this.e);
            ebvvVar.setId(i);
        }
        ebvvVar.restoreHierarchyState(this.c);
        viewGroup.addView(ebvvVar);
        WindowInsets windowInsets = this.a;
        if (windowInsets != null) {
            ebvvVar.dispatchApplyWindowInsets(windowInsets);
        }
        return ebvvVar;
    }

    @Override // defpackage.pou
    public final void d(ViewGroup viewGroup, int i, Object obj) {
        View view = (View) obj;
        view.saveHierarchyState(this.c);
        viewGroup.removeView(view);
    }

    @Override // defpackage.pou
    public final void e(Parcelable parcelable, ClassLoader classLoader) {
        Bundle bundle = (Bundle) parcelable;
        bundle.setClassLoader(classLoader);
        this.c = bundle.getSparseParcelableArray("viewStates");
    }

    @Override // defpackage.pou
    public final void f(ViewGroup viewGroup, int i, Object obj) {
        ebxi ebxiVar = this.d;
        if (obj == ebxiVar) {
            return;
        }
        if (ebxiVar != null) {
            ebxiVar.c();
        }
        ebxi ebxiVar2 = (ebxi) obj;
        this.d = ebxiVar2;
        ebxiVar2.b();
    }

    @Override // defpackage.pou
    public final boolean h(View view, Object obj) {
        return view == obj;
    }

    @Override // defpackage.pou
    public final int j() {
        return 2;
    }

    @Override // defpackage.pou
    public final CharSequence k(int i) {
        Context context = this.b.getContext();
        if (i == 0) {
            return context.getString(R.string.sticker_gallery_view_pager_browse_label);
        }
        if (i == 1) {
            return context.getString(R.string.sticker_gallery_view_pager_favorite_label);
        }
        throw new IllegalStateException(a.g(i, "Unknown page position: "));
    }
}
