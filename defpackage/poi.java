package defpackage;

import android.graphics.Paint;

/* compiled from: PG */
/* loaded from: classes.dex */
final class poi extends pol {
    public int[] a;
    kyk b;
    float c;
    kyk d;
    float e;
    float f;
    float g;
    float h;
    float i;
    Paint.Cap j;
    Paint.Join k;
    float l;

    public poi() {
        this.c = 0.0f;
        this.e = 1.0f;
        this.f = 1.0f;
        this.g = 0.0f;
        this.h = 1.0f;
        this.i = 0.0f;
        this.j = Paint.Cap.BUTT;
        this.k = Paint.Join.MITER;
        this.l = 4.0f;
    }

    @Override // defpackage.pok
    public final boolean b() {
        return this.d.b() || this.b.b();
    }

    @Override // defpackage.pok
    public final boolean c(int[] iArr) {
        return this.b.c(iArr) | this.d.c(iArr);
    }

    float getFillAlpha() {
        return this.f;
    }

    int getFillColor() {
        return this.d.b;
    }

    float getStrokeAlpha() {
        return this.e;
    }

    int getStrokeColor() {
        return this.b.b;
    }

    float getStrokeWidth() {
        return this.c;
    }

    float getTrimPathEnd() {
        return this.h;
    }

    float getTrimPathOffset() {
        return this.i;
    }

    float getTrimPathStart() {
        return this.g;
    }

    void setFillAlpha(float f) {
        this.f = f;
    }

    void setFillColor(int i) {
        this.d.b = i;
    }

    void setStrokeAlpha(float f) {
        this.e = f;
    }

    void setStrokeColor(int i) {
        this.b.b = i;
    }

    void setStrokeWidth(float f) {
        this.c = f;
    }

    void setTrimPathEnd(float f) {
        this.h = f;
    }

    void setTrimPathOffset(float f) {
        this.i = f;
    }

    void setTrimPathStart(float f) {
        this.g = f;
    }

    public poi(poi poiVar) {
        super(poiVar);
        this.c = 0.0f;
        this.e = 1.0f;
        this.f = 1.0f;
        this.g = 0.0f;
        this.h = 1.0f;
        this.i = 0.0f;
        this.j = Paint.Cap.BUTT;
        this.k = Paint.Join.MITER;
        this.l = 4.0f;
        int[] iArr = poiVar.a;
        this.a = null;
        this.b = poiVar.b;
        this.c = poiVar.c;
        this.e = poiVar.e;
        this.d = poiVar.d;
        this.o = poiVar.o;
        this.f = poiVar.f;
        this.g = poiVar.g;
        this.h = poiVar.h;
        this.i = poiVar.i;
        this.j = poiVar.j;
        this.k = poiVar.k;
        this.l = poiVar.l;
    }
}
