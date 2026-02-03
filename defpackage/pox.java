package defpackage;

import android.content.res.Resources;
import androidx.viewpager.widget.ViewPager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pox implements Runnable {
    final /* synthetic */ ViewPager a;

    public pox(ViewPager viewPager) {
        this.a = viewPager;
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        ViewPager viewPager = this.a;
        viewPager.o(0);
        viewPager.f();
    }
}
