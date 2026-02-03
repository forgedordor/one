package defpackage;

import android.graphics.Paint;
import android.graphics.Path;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dypz {
    public final Paint a;
    public final Path b;
    public int c;

    public dypz(int i) {
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i);
        this.b = new Path();
    }
}
