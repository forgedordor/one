package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adcp extends adct {
    public final Context a;
    public final addh b;
    public final Drawable c;
    public final Paint d;
    public final Canvas e;
    public final RecyclerView f;
    public final wv g;
    public final float h;
    public final float i;
    public final boolean j;
    public final float k;

    public adcp(Context context, addh addhVar, Drawable drawable, Paint paint, Canvas canvas, RecyclerView recyclerView, wv wvVar, float f, float f2, boolean z, float f3) {
        this.a = context;
        this.b = addhVar;
        this.c = drawable;
        this.d = paint;
        this.e = canvas;
        this.f = recyclerView;
        this.g = wvVar;
        this.h = f;
        this.i = f2;
        this.j = z;
        this.k = f3;
    }

    @Override // defpackage.adct
    public final float a() {
        return this.h;
    }

    @Override // defpackage.adct
    public final float b() {
        return this.i;
    }

    @Override // defpackage.adct
    public final float c() {
        return this.k;
    }

    @Override // defpackage.adct
    public final Context d() {
        return this.a;
    }

    @Override // defpackage.adct
    public final Canvas e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adct) {
            adct adctVar = (adct) obj;
            if (this.a.equals(adctVar.d()) && this.b.equals(adctVar.j()) && this.c.equals(adctVar.g()) && this.d.equals(adctVar.f()) && this.e.equals(adctVar.e()) && this.f.equals(adctVar.i()) && this.g.equals(adctVar.h()) && Float.floatToIntBits(this.h) == Float.floatToIntBits(adctVar.a()) && Float.floatToIntBits(this.i) == Float.floatToIntBits(adctVar.b()) && this.j == adctVar.k() && Float.floatToIntBits(this.k) == Float.floatToIntBits(adctVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.adct
    public final Paint f() {
        return this.d;
    }

    @Override // defpackage.adct
    public final Drawable g() {
        return this.c;
    }

    @Override // defpackage.adct
    public final wv h() {
        return this.g;
    }

    public final int hashCode() {
        return ((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ Float.floatToIntBits(this.h)) * 1000003) ^ Float.floatToIntBits(this.i)) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.k);
    }

    @Override // defpackage.adct
    public final RecyclerView i() {
        return this.f;
    }

    @Override // defpackage.adct
    public final addh j() {
        return this.b;
    }

    @Override // defpackage.adct
    public final boolean k() {
        return this.j;
    }

    public final String toString() {
        wv wvVar = this.g;
        RecyclerView recyclerView = this.f;
        Canvas canvas = this.e;
        Paint paint = this.d;
        Drawable drawable = this.c;
        addh addhVar = this.b;
        return "IconDrawParameters{context=" + this.a.toString() + ", iconProvider=" + addhVar.toString() + ", drawable=" + drawable.toString() + ", backgroundPaint=" + paint.toString() + ", canvas=" + canvas.toString() + ", recyclerView=" + recyclerView.toString() + ", viewHolder=" + wvVar.toString() + ", dX=" + this.h + ", dXLast=" + this.i + ", isCurrentlyActive=" + this.j + ", swipeThreshold=" + this.k + "}";
    }
}
