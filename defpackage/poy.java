package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class poy implements ldn {
    final /* synthetic */ ViewPager a;
    private final Rect b = new Rect();

    public poy(ViewPager viewPager) {
        this.a = viewPager;
    }

    @Override // defpackage.ldn
    public final lgt ez(View view, lgt lgtVar) {
        lgt lgtVarG = ley.g(view, lgtVar);
        if (lgtVarG.u()) {
            return lgtVarG;
        }
        Rect rect = this.b;
        rect.left = lgtVarG.b();
        rect.top = lgtVarG.d();
        rect.right = lgtVarG.c();
        rect.bottom = lgtVarG.a();
        ViewPager viewPager = this.a;
        int childCount = viewPager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            lgt lgtVarF = ley.f(viewPager.getChildAt(i), lgtVarG);
            rect.left = Math.min(lgtVarF.b(), rect.left);
            rect.top = Math.min(lgtVarF.d(), rect.top);
            rect.right = Math.min(lgtVarF.c(), rect.right);
            rect.bottom = Math.min(lgtVarF.a(), rect.bottom);
        }
        lgh lggVar = Build.VERSION.SDK_INT >= 34 ? new lgg(lgtVarG) : Build.VERSION.SDK_INT >= 31 ? new lgf(lgtVarG) : Build.VERSION.SDK_INT >= 30 ? new lge(lgtVarG) : Build.VERSION.SDK_INT >= 29 ? new lgd(lgtVarG) : new lgc(lgtVarG);
        lggVar.c(kzc.c(rect));
        return lggVar.a();
    }
}
