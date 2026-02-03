package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class poj extends pok {
    final Matrix a;
    final ArrayList b;
    float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    final Matrix j;
    int k;
    public int[] l;
    public String m;

    public poj() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.m = null;
    }

    public final void a() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    @Override // defpackage.pok
    public final boolean b() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((pok) arrayList.get(i)).b()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.pok
    public final boolean c(int[] iArr) {
        int i = 0;
        boolean zC = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return zC;
            }
            zC |= ((pok) arrayList.get(i)).c(iArr);
            i++;
        }
    }

    public String getGroupName() {
        return this.m;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            a();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            a();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            a();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            a();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            a();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            a();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            a();
        }
    }

    public poj(poj pojVar, csq csqVar) {
        pol pohVar;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.m = null;
        this.c = pojVar.c;
        this.d = pojVar.d;
        this.e = pojVar.e;
        this.f = pojVar.f;
        this.g = pojVar.g;
        this.h = pojVar.h;
        this.i = pojVar.i;
        int[] iArr = pojVar.l;
        this.l = null;
        String str = pojVar.m;
        this.m = str;
        int i = pojVar.k;
        this.k = 0;
        if (str != null) {
            csqVar.put(str, this);
        }
        matrix.set(pojVar.j);
        ArrayList arrayList = pojVar.b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = arrayList.get(i2);
            if (obj instanceof poj) {
                this.b.add(new poj((poj) obj, csqVar));
            } else {
                if (obj instanceof poi) {
                    pohVar = new poi((poi) obj);
                } else if (obj instanceof poh) {
                    pohVar = new poh((poh) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.b.add(pohVar);
                Object obj2 = pohVar.n;
                if (obj2 != null) {
                    csqVar.put(obj2, pohVar);
                }
            }
        }
    }
}
