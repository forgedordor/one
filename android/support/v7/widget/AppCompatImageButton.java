package android.support.v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.google.android.apps.messaging.R;
import defpackage.qn;
import defpackage.rb;
import defpackage.ys;
import defpackage.yu;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton {
    private final qn a;
    private final rb b;
    private boolean c;

    public AppCompatImageButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        qn qnVar = this.a;
        if (qnVar != null) {
            qnVar.a();
        }
        rb rbVar = this.b;
        if (rbVar != null) {
            rbVar.b();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return this.b.f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        qn qnVar = this.a;
        if (qnVar != null) {
            qnVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        qn qnVar = this.a;
        if (qnVar != null) {
            qnVar.c(i);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        rb rbVar = this.b;
        if (rbVar != null) {
            rbVar.b();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        rb rbVar = this.b;
        if (rbVar != null && drawable != null && !this.c) {
            rbVar.d(drawable);
        }
        super.setImageDrawable(drawable);
        if (rbVar != null) {
            rbVar.b();
            if (this.c) {
                return;
            }
            rbVar.a();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageLevel(int i) {
        super.setImageLevel(i);
        this.c = true;
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        this.b.e(i);
    }

    @Override // android.widget.ImageView
    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        rb rbVar = this.b;
        if (rbVar != null) {
            rbVar.b();
        }
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        yu.a(context);
        this.c = false;
        ys.d(this, getContext());
        qn qnVar = new qn(this);
        this.a = qnVar;
        qnVar.b(attributeSet, i);
        rb rbVar = new rb(this);
        this.b = rbVar;
        rbVar.c(attributeSet, i);
    }
}
