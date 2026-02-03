package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.viewpager.widget.ViewPager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ppc extends lcl {
    final /* synthetic */ ViewPager a;

    public ppc(ViewPager viewPager) {
        this.a = viewPager;
    }

    private final boolean j() {
        pou pouVar = this.a.b;
        return pouVar != null && pouVar.j() > 1;
    }

    @Override // defpackage.lcl
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        ViewPager viewPager;
        pou pouVar;
        super.b(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        accessibilityEvent.setScrollable(j());
        if (accessibilityEvent.getEventType() != 4096 || (pouVar = (viewPager = this.a).b) == null) {
            return;
        }
        accessibilityEvent.setItemCount(pouVar.j());
        accessibilityEvent.setFromIndex(viewPager.c);
        accessibilityEvent.setToIndex(viewPager.c);
    }

    @Override // defpackage.lcl
    public final void c(View view, lhg lhgVar) {
        super.c(view, lhgVar);
        lhgVar.s("androidx.viewpager.widget.ViewPager");
        lhgVar.O(j());
        ViewPager viewPager = this.a;
        if (viewPager.canScrollHorizontally(1)) {
            lhgVar.h(4096);
        }
        if (viewPager.canScrollHorizontally(-1)) {
            lhgVar.h(8192);
        }
    }

    @Override // defpackage.lcl
    public final boolean i(View view, int i, Bundle bundle) throws Resources.NotFoundException {
        if (super.i(view, i, bundle)) {
            return true;
        }
        if (i == 4096) {
            ViewPager viewPager = this.a;
            if (!viewPager.canScrollHorizontally(1)) {
                return false;
            }
            viewPager.k(viewPager.c + 1);
            return true;
        }
        if (i != 8192) {
            return false;
        }
        ViewPager viewPager2 = this.a;
        if (!viewPager2.canScrollHorizontally(-1)) {
            return false;
        }
        viewPager2.k(viewPager2.c - 1);
        return true;
    }
}
