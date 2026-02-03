package androidx.emoji.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.inputmethodservice.ExtractEditText;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.car.app.model.Alert;
import defpackage.lip;
import defpackage.lob;
import defpackage.loy;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EmojiExtractEditText extends ExtractEditText {
    private loy a;
    private boolean b;

    public EmojiExtractEditText(Context context) {
        super(context);
        b(null, 0, 0);
    }

    private final loy a() {
        if (this.a == null) {
            this.a = new loy(this);
        }
        return this.a;
    }

    private final void b(AttributeSet attributeSet, int i, int i2) {
        if (this.b) {
            return;
        }
        this.b = true;
        int integer = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, lob.a, i, i2);
            integer = typedArrayObtainStyledAttributes.getInteger(0, Alert.DURATION_SHOW_INDEFINITELY);
            typedArrayObtainStyledAttributes.recycle();
        }
        a().b(integer);
        setKeyListener(super.getKeyListener());
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return a().a(super.onCreateInputConnection(editorInfo), editorInfo);
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(lip.b(this, callback));
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        if (keyListener != null) {
            a();
            keyListener = loy.c(keyListener);
        }
        super.setKeyListener(keyListener);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(attributeSet, R.attr.editTextStyle, 0);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(attributeSet, i, 0);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        b(attributeSet, i, i2);
    }
}
