package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ryr implements Cloneable {
    public rxj a;
    public boolean b;
    public boolean c;
    public Paint d;
    public Paint e;
    public rwh f;
    public rwh g;
    public boolean h;
    public boolean i;

    public ryr() {
        Paint paint = new Paint();
        this.d = paint;
        paint.setFlags(385);
        this.d.setStyle(Paint.Style.FILL);
        this.d.setTypeface(Typeface.DEFAULT);
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setFlags(385);
        this.e.setStyle(Paint.Style.STROKE);
        this.e.setTypeface(Typeface.DEFAULT);
        this.a = rxj.a();
    }

    protected final Object clone() {
        try {
            ryr ryrVar = (ryr) super.clone();
            ryrVar.a = (rxj) this.a.clone();
            ryrVar.d = new Paint(this.d);
            ryrVar.e = new Paint(this.e);
            return ryrVar;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }
    }
}
