package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzdv extends View {
    public final Paint a;
    public boolean b;
    private final dzdh c;
    private final Runnable d;
    private final Rect e;
    private final Path f;

    public dzdv(Context context, dzdh dzdhVar, Runnable runnable) {
        super(context);
        this.e = new Rect();
        this.f = new Path();
        Paint paint = new Paint();
        this.a = paint;
        this.c = dzdhVar;
        this.d = runnable;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        if (this.b) {
            canvas.drawPath(this.f, this.a);
        }
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Path path = this.f;
        path.rewind();
        path.addRect(0.0f, 0.0f, i3 - i, i4 - i2, Path.Direction.CW);
        SelectedAccountDisc selectedAccountDisc = (SelectedAccountDisc) this.c;
        Rect rectB = selectedAccountDisc.b();
        float fWidth = rectB.width();
        float fExactCenterX = rectB.exactCenterX();
        float fExactCenterY = rectB.exactCenterY();
        float f = fWidth * 0.6f;
        path.addCircle(fExactCenterX, fExactCenterY, f, Path.Direction.CCW);
        selectedAccountDisc.c.getGlobalVisibleRect(selectedAccountDisc.a);
        float f2 = fExactCenterY - f;
        if (r8.top > f2) {
            path.addRect(fExactCenterX - f, f2, fExactCenterX + f, r8.top, Path.Direction.CW);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            float r0 = r5.getRawX()
            int r0 = java.lang.Math.round(r0)
            float r1 = r5.getRawY()
            int r1 = java.lang.Math.round(r1)
            int r5 = r5.getAction()
            r2 = 1
            if (r5 != 0) goto L44
            dzdh r5 = r4.c
            android.graphics.Rect r3 = r4.e
            com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc r5 = (com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc) r5
            com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc r5 = r5.c
            r5.getGlobalVisibleRect(r3)
            boolean r5 = r3.contains(r0, r1)
            r0 = 0
            if (r5 != 0) goto L33
            r4.performClick()
            boolean r5 = r4.b
            if (r5 != 0) goto L31
            goto L33
        L31:
            r5 = r0
            goto L34
        L33:
            r5 = r2
        L34:
            if (r5 != 0) goto L3b
            r4.b = r0
            r4.invalidate()
        L3b:
            java.lang.Runnable r1 = r4.d
            r1.run()
            if (r5 != 0) goto L43
            return r2
        L43:
            return r0
        L44:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzdv.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
