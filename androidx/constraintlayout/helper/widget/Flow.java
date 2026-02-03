package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import defpackage.krz;
import defpackage.ksc;
import defpackage.ksg;
import defpackage.ktt;
import defpackage.ktu;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Flow extends ktu {
    private ksc a;

    public Flow(Context context) {
        super(context);
    }

    @Override // defpackage.ktu, defpackage.ktc
    protected final void a(AttributeSet attributeSet) throws IllegalAccessException, NoSuchFieldException, Resources.NotFoundException, IllegalArgumentException {
        super.a(attributeSet);
        this.a = new ksc();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ktt.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.a.aI = typedArrayObtainStyledAttributes.getInt(0, 0);
                } else if (index == 1) {
                    ksc kscVar = this.a;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
                    kscVar.aN = dimensionPixelSize;
                    kscVar.aO = dimensionPixelSize;
                    kscVar.aP = dimensionPixelSize;
                    kscVar.aQ = dimensionPixelSize;
                } else if (index == 18) {
                    this.a.aj(typedArrayObtainStyledAttributes.getDimensionPixelSize(18, 0));
                } else if (index == 19) {
                    this.a.aQ = typedArrayObtainStyledAttributes.getDimensionPixelSize(19, 0);
                } else if (index == 2) {
                    this.a.aR = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
                } else if (index == 3) {
                    this.a.aN = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
                } else if (index == 4) {
                    this.a.aS = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
                } else if (index == 5) {
                    this.a.aO = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
                } else if (index == 54) {
                    this.a.aG = typedArrayObtainStyledAttributes.getInt(54, 0);
                } else if (index == 44) {
                    this.a.a = typedArrayObtainStyledAttributes.getInt(44, 0);
                } else if (index == 53) {
                    this.a.b = typedArrayObtainStyledAttributes.getInt(53, 0);
                } else if (index == 38) {
                    this.a.c = typedArrayObtainStyledAttributes.getInt(38, 0);
                } else if (index == 46) {
                    this.a.e = typedArrayObtainStyledAttributes.getInt(46, 0);
                } else if (index == 40) {
                    this.a.d = typedArrayObtainStyledAttributes.getInt(40, 0);
                } else if (index == 48) {
                    this.a.f = typedArrayObtainStyledAttributes.getInt(48, 0);
                } else if (index == 42) {
                    this.a.g = typedArrayObtainStyledAttributes.getFloat(42, 0.5f);
                } else if (index == 37) {
                    this.a.i = typedArrayObtainStyledAttributes.getFloat(37, 0.5f);
                } else if (index == 45) {
                    this.a.k = typedArrayObtainStyledAttributes.getFloat(45, 0.5f);
                } else if (index == 39) {
                    this.a.j = typedArrayObtainStyledAttributes.getFloat(39, 0.5f);
                } else if (index == 47) {
                    this.a.aB = typedArrayObtainStyledAttributes.getFloat(47, 0.5f);
                } else if (index == 51) {
                    this.a.h = typedArrayObtainStyledAttributes.getFloat(51, 0.5f);
                } else if (index == 41) {
                    this.a.aE = typedArrayObtainStyledAttributes.getInt(41, 2);
                } else if (index == 50) {
                    this.a.aF = typedArrayObtainStyledAttributes.getInt(50, 2);
                } else if (index == 43) {
                    this.a.aC = typedArrayObtainStyledAttributes.getDimensionPixelSize(43, 0);
                } else if (index == 52) {
                    this.a.aD = typedArrayObtainStyledAttributes.getDimensionPixelSize(52, 0);
                } else if (index == 49) {
                    this.a.aH = typedArrayObtainStyledAttributes.getInt(49, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.i = this.a;
        k();
    }

    @Override // defpackage.ktu
    public final void b(ksg ksgVar, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (ksgVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            ksgVar.b(mode, size, mode2, size2);
            setMeasuredDimension(ksgVar.aU, ksgVar.aV);
        }
    }

    @Override // defpackage.ktc
    public final void c(krz krzVar, boolean z) {
        ksc kscVar = this.a;
        int i = kscVar.aP;
        if (i > 0 || kscVar.aQ > 0) {
            if (z) {
                kscVar.aR = kscVar.aQ;
                kscVar.aS = i;
            } else {
                kscVar.aR = i;
                kscVar.aS = kscVar.aQ;
            }
        }
    }

    @Override // defpackage.ktc, android.view.View
    protected final void onMeasure(int i, int i2) {
        b(this.a, i, i2);
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
