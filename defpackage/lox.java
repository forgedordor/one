package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lox extends qx {
    private loy a;
    private boolean b;

    public lox(Context context) {
        super(context);
        e(null, 0);
    }

    private final loy d() {
        if (this.a == null) {
            this.a = new loy(this);
        }
        return this.a;
    }

    private final void e(AttributeSet attributeSet, int i) {
        if (this.b) {
            return;
        }
        this.b = true;
        int integer = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, lob.a, i, 0);
            integer = typedArrayObtainStyledAttributes.getInteger(0, Alert.DURATION_SHOW_INDEFINITELY);
            typedArrayObtainStyledAttributes.recycle();
        }
        d().b(integer);
        setKeyListener(super.getKeyListener());
    }

    @Override // defpackage.qx, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return d().a(super.onCreateInputConnection(editorInfo), editorInfo);
    }

    @Override // defpackage.qx, android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        if (keyListener != null) {
            d();
            keyListener = loy.c(keyListener);
        }
        super.setKeyListener(keyListener);
    }

    public lox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e(attributeSet, R.attr.editTextStyle);
    }

    public lox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e(attributeSet, i);
    }
}
