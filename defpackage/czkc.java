package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.support.constraint.Guideline;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class czkc {
    protected final Activity a;
    final int b;
    public float c;
    protected final boolean d;
    private final Guideline e;
    private final Guideline f;
    private int g;
    private final int h;
    private final int i;

    public czkc(Activity activity, ViewGroup viewGroup, Guideline guideline, Guideline guideline2, boolean z) {
        this.a = activity;
        this.e = guideline;
        this.f = guideline2;
        this.b = (int) activity.getResources().getDimension(R.dimen.camera_ui_max_edge_spacing);
        this.g = activity.getWindowManager().getDefaultDisplay().getRotation() * 90;
        this.h = Math.min(viewGroup.getWidth(), viewGroup.getHeight());
        this.i = Math.max(viewGroup.getWidth(), viewGroup.getHeight());
        this.d = z;
    }

    private static Point e(float f, int i, int i2) {
        float f2 = i;
        float f3 = i2;
        return f < f2 / f3 ? new Point((int) (f3 * f), i2) : new Point(i, (int) (f2 / f));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r8) throws android.content.res.Resources.NotFoundException {
        /*
            r7 = this;
            int r0 = r7.b(r8)
            int r0 = r0 / 2
            android.app.Activity r1 = r7.a
            int r2 = defpackage.dakl.c(r1)
            int r3 = r7.b
            int r2 = defpackage.cqch.c(r0, r2, r3)
            boolean r4 = r7.d
            boolean r4 = defpackage.craf.e(r1, r4)
            r5 = 0
            if (r4 == 0) goto L1d
            r0 = r5
            goto L25
        L1d:
            int r1 = defpackage.dakl.b(r1)
            int r0 = defpackage.cqch.c(r0, r1, r3)
        L25:
            int r1 = r8 % 180
            int r4 = r7.h
            int r6 = r7.i
            if (r1 == 0) goto L37
            float r1 = r7.c
            android.graphics.Point r1 = e(r1, r6, r4)
            int r1 = r1.x
            int r6 = r6 - r1
            goto L41
        L37:
            float r1 = r7.c
            android.graphics.Point r1 = e(r1, r4, r6)
            int r1 = r1.x
            int r6 = r4 - r1
        L41:
            int r6 = r6 / 2
            java.lang.Math.min(r6, r3)
            if (r8 == 0) goto L66
            r1 = 90
            if (r8 == r1) goto L62
            r1 = 180(0xb4, float:2.52E-43)
            if (r8 == r1) goto L66
            r0 = 270(0x10e, float:3.78E-43)
            if (r8 == r0) goto L5e
            java.lang.String r0 = "Invalid rotation "
            java.lang.String r0 = defpackage.a.g(r8, r0)
            defpackage.cqaz.c(r0)
            goto L69
        L5e:
            r7.d(r2, r5)
            goto L69
        L62:
            r7.d(r2, r5)
            goto L69
        L66:
            r7.d(r2, r0)
        L69:
            r7.g = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czkc.a(int):void");
    }

    final int b(int i) {
        int i2 = this.h;
        int i3 = this.i;
        return i % 180 != 0 ? i2 - e(this.c, i3, i2).y : i3 - e(this.c, i2, i3).y;
    }

    final void c() throws Resources.NotFoundException {
        a(this.g);
    }

    final void d(int i, int i2) {
        Guideline guideline = this.e;
        if (guideline != null) {
            dajh.a(guideline, i);
        }
        Guideline guideline2 = this.f;
        if (guideline2 != null) {
            dajh.b(guideline2, i2);
        }
    }
}
