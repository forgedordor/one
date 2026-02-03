package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class plw extends pmx {
    private static final String[] v = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property w = new plo(PointF.class);
    private static final Property x = new plp(PointF.class);
    private static final Property y = new plq(PointF.class);
    private static final Property z = new plr(PointF.class);
    private static final Property A = new pls(PointF.class);

    private static final void f(pnh pnhVar) {
        View view = pnhVar.b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        Map map = pnhVar.a;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", pnhVar.b.getParent());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    @Override // defpackage.pmx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator a(android.view.ViewGroup r20, defpackage.pnh r21, defpackage.pnh r22) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.plw.a(android.view.ViewGroup, pnh, pnh):android.animation.Animator");
    }

    @Override // defpackage.pmx
    public final void b(pnh pnhVar) {
        f(pnhVar);
    }

    @Override // defpackage.pmx
    public final void c(pnh pnhVar) {
        f(pnhVar);
    }

    @Override // defpackage.pmx
    public final boolean d() {
        return true;
    }

    @Override // defpackage.pmx
    public final String[] e() {
        return v;
    }
}
