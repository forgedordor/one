package com.google.android.apps.messaging.ui.animation.illustration;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.ui.animation.illustration.IllustrationViewStub;
import defpackage.cqaz;
import defpackage.cqef;
import defpackage.cuku;
import defpackage.cukv;
import defpackage.cukz;
import defpackage.cula;
import j$.util.OptionalInt;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class IllustrationViewStub extends cuku {
    public String a;
    public int b;
    public float c;
    public ImageView.ScaleType d;
    public View e;
    private int f;
    private int g;
    private OptionalInt h;
    private boolean i;

    public IllustrationViewStub(Context context) {
        super(context);
        this.f = -1;
        this.b = -1;
        this.d = ImageView.ScaleType.MATRIX;
        this.g = -1;
        this.h = OptionalInt.empty();
    }

    private final void f(View view, ViewGroup viewGroup) {
        view.setId(getId());
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, iIndexOfChild);
        }
    }

    public final View c() {
        if (this.e == null) {
            cqaz.k(getParent() != null);
            if (this.i) {
                cukz cukzVar = new cukz(getContext());
                if (this.g != -1) {
                    cukzVar.setBackground(getResources().getDrawable(this.g, getContext().getTheme()));
                }
                int i = this.f;
                if (i != -1) {
                    cukzVar.f(i);
                } else {
                    String str = this.a;
                    if (str != null) {
                        cukzVar.g(str);
                    }
                }
                f(cukzVar, (ViewGroup) getParent());
                this.e = cukzVar;
            } else {
                final cukv cukvVar = new cukv(getContext());
                f(cukvVar, (ViewGroup) getParent());
                int i2 = this.b;
                if (i2 != -1) {
                    cukvVar.setImageResource(i2);
                }
                this.h.ifPresent(new IntConsumer() { // from class: cukw
                    @Override // java.util.function.IntConsumer
                    public final void accept(int i3) {
                        cukvVar.setColorFilter(i3);
                    }

                    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                        return IntConsumer$CC.$default$andThen(this, intConsumer);
                    }
                });
                cukvVar.addOnLayoutChangeListener(new cqef(cukvVar, new Runnable() { // from class: cukx
                    @Override // java.lang.Runnable
                    public final void run() {
                        IllustrationViewStub illustrationViewStub = this.a;
                        cukv cukvVar2 = cukvVar;
                        Matrix imageMatrix = cukvVar2.getImageMatrix();
                        cukvVar2.setScaleType(illustrationViewStub.d);
                        float f = illustrationViewStub.c;
                        imageMatrix.setScale(f, f);
                        imageMatrix.postTranslate((cukvVar2.getMeasuredWidth() / 2.0f) - ((cukvVar2.getDrawable().getIntrinsicWidth() * illustrationViewStub.c) / 2.0f), (cukvVar2.getMeasuredHeight() / 2.0f) - ((cukvVar2.getDrawable().getIntrinsicHeight() * illustrationViewStub.c) / 2.0f));
                        cukvVar2.setImageMatrix(imageMatrix);
                    }
                }));
                this.e = cukvVar;
            }
        }
        View view = this.e;
        view.getClass();
        return view;
    }

    public final void d(int i) {
        View viewC = c();
        viewC.requestLayout();
        if (viewC instanceof cukz) {
            cukz cukzVar = (cukz) viewC;
            cukzVar.l(i);
            cukzVar.d();
        }
    }

    public final void e() {
        if (this.e != null) {
            throw new IllegalStateException("Can't change inflation mode after inflation");
        }
        this.i = true;
    }

    public IllustrationViewStub(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IllustrationViewStub(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public IllustrationViewStub(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f = -1;
        this.b = -1;
        this.d = ImageView.ScaleType.MATRIX;
        this.g = -1;
        this.h = OptionalInt.empty();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cula.a);
        this.a = typedArrayObtainStyledAttributes.getString(0);
        this.f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.b = typedArrayObtainStyledAttributes.getResourceId(3, -1);
        this.c = typedArrayObtainStyledAttributes.getFloat(2, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
    }
}
