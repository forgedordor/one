package defpackage;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rc extends MultiAutoCompleteTextView {
    private static final int[] a = {R.attr.popupBackground};
    private final qn b;
    private final sb c;
    private final qy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.google.android.apps.messaging.R.attr.autoCompleteTextViewStyle);
        yu.a(context);
        ys.d(this, getContext());
        yx yxVarL = yx.l(getContext(), attributeSet, a, com.google.android.apps.messaging.R.attr.autoCompleteTextViewStyle, 0);
        if (yxVarL.q(0)) {
            setDropDownBackgroundDrawable(yxVarL.h(0));
        }
        yxVarL.o();
        qn qnVar = new qn(this);
        this.b = qnVar;
        qnVar.b(attributeSet, com.google.android.apps.messaging.R.attr.autoCompleteTextViewStyle);
        sb sbVar = new sb(this);
        this.c = sbVar;
        sbVar.h(attributeSet, com.google.android.apps.messaging.R.attr.autoCompleteTextViewStyle);
        sbVar.e();
        qy qyVar = new qy(this);
        this.d = qyVar;
        qyVar.b(attributeSet, com.google.android.apps.messaging.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (qy.c(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerD = qy.d(keyListener);
            if (keyListenerD == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerD);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        qn qnVar = this.b;
        if (qnVar != null) {
            qnVar.a();
        }
        sb sbVar = this.c;
        if (sbVar != null) {
            sbVar.e();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        ra.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.d.a(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        qn qnVar = this.b;
        if (qnVar != null) {
            qnVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        qn qnVar = this.b;
        if (qnVar != null) {
            qnVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        sb sbVar = this.c;
        if (sbVar != null) {
            sbVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        sb sbVar = this.c;
        if (sbVar != null) {
            sbVar.e();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(ku.a(getContext(), i));
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(qy.d(keyListener));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        sb sbVar = this.c;
        if (sbVar != null) {
            sbVar.i(context, i);
        }
    }
}
