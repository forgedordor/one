package defpackage;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qm extends AutoCompleteTextView {
    private static final int[] a = {R.attr.popupBackground};
    private final qn b;
    private final sb c;
    private final qy d;

    public qm(Context context) {
        this(context, null);
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

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return lip.a(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
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

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(lip.b(this, callback));
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

    public qm(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.messaging.R.attr.autoCompleteTextViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        yu.a(context);
        ys.d(this, getContext());
        yx yxVarL = yx.l(getContext(), attributeSet, a, i, 0);
        if (yxVarL.q(0)) {
            setDropDownBackgroundDrawable(yxVarL.h(0));
        }
        yxVarL.o();
        qn qnVar = new qn(this);
        this.b = qnVar;
        qnVar.b(attributeSet, i);
        sb sbVar = new sb(this);
        this.c = sbVar;
        sbVar.h(attributeSet, i);
        sbVar.e();
        qy qyVar = new qy(this);
        this.d = qyVar;
        qyVar.b(attributeSet, i);
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
}
