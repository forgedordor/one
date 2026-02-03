package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qx extends EditText implements ldp {
    private final qn a;
    private final sb b;
    private final rv c;
    private final liq d;
    private final qy e;
    private qw f;
    private sa g;

    public qx(Context context) {
        this(context, null);
    }

    private final qw d() {
        if (this.f == null) {
            this.f = new qw(this);
        }
        return this.f;
    }

    final sa a() {
        if (this.g == null) {
            this.g = new sa(this, new lbz() { // from class: qv
                @Override // defpackage.lbz
                public final void accept(Object obj) {
                    super/*android.widget.EditText*/.setTypeface((Typeface) obj);
                }
            });
        }
        return this.g;
    }

    @Override // defpackage.ldp
    public final lcw b(lcw lcwVar) {
        return this.d.a(this, lcwVar);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        qn qnVar = this.a;
        if (qnVar != null) {
            qnVar.a();
        }
        sb sbVar = this.b;
        if (sbVar != null) {
            sbVar.e();
        }
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return lip.a(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public final String getFontVariationSettings() {
        return a().b;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public final TextClassifier getTextClassifier() {
        rv rvVar;
        return (Build.VERSION.SDK_INT >= 28 || (rvVar = this.c) == null) ? super.getTextClassifier() : rvVar.a();
    }

    @Override // android.widget.TextView
    public final Typeface getTypeface() {
        return a().a;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrX;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        sb.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        ra.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionOnCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (strArrX = ley.x(this)) != null) {
            editorInfo.contentMimeTypes = strArrX;
            inputConnectionOnCreateInputConnection = lhy.a(inputConnectionOnCreateInputConnection, editorInfo, new lhx() { // from class: lhv
                @Override // defpackage.lhx
                public final boolean a(lia liaVar, int i, Bundle bundle) {
                    if ((i & 1) != 0) {
                        try {
                            liaVar.c();
                            InputContentInfo inputContentInfo = liaVar.a.a;
                            bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                            bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
                        } catch (Exception e) {
                            Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                            return false;
                        }
                    }
                    ClipData clipData = new ClipData(liaVar.a(), new ClipData.Item(liaVar.b()));
                    lcr lcqVar = Build.VERSION.SDK_INT >= 31 ? new lcq(clipData, 2) : new lcs(clipData, 2);
                    View view = this;
                    lcqVar.e(liaVar.a.a.getLinkUri());
                    lcqVar.c(bundle);
                    return ley.d(view, lcp.a(lcqVar)) == null;
                }
            });
        }
        return this.e.a(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT < 30 || Build.VERSION.SDK_INT >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && ley.x(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                toString();
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=".concat(toString()));
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                activity.requestDragAndDropPermissions(dragEvent);
                int offsetForPosition = getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
                beginBatchEdit();
                try {
                    Selection.setSelection((Spannable) getText(), offsetForPosition);
                    ClipData clipData = dragEvent.getClipData();
                    ley.d(this, lcp.a(Build.VERSION.SDK_INT >= 31 ? new lcq(clipData, 3) : new lcs(clipData, 3)));
                    return true;
                } finally {
                    endBatchEdit();
                }
            }
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (Build.VERSION.SDK_INT < 31 && ley.x(this) != null) {
            if (i != 16908322) {
                if (i == 16908337) {
                    i = 16908337;
                }
            }
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                lcr lcqVar = Build.VERSION.SDK_INT >= 31 ? new lcq(primaryClip, 1) : new lcs(primaryClip, 1);
                lcqVar.d(i == 16908322 ? 0 : 1);
                ley.d(this, lcp.a(lcqVar));
            }
            return true;
        }
        return super.onTextContextMenuItem(i);
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

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        sb sbVar = this.b;
        if (sbVar != null) {
            sbVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        sb sbVar = this.b;
        if (sbVar != null) {
            sbVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(lip.b(this, callback));
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return a().b(str);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(qy.d(keyListener));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        sb sbVar = this.b;
        if (sbVar != null) {
            sbVar.i(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(TextClassifier textClassifier) {
        rv rvVar;
        if (Build.VERSION.SDK_INT >= 28 || (rvVar = this.c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            rvVar.a = textClassifier;
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface) {
        a().a(typeface);
    }

    public qx(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        yu.a(context);
        ys.d(this, getContext());
        qn qnVar = new qn(this);
        this.a = qnVar;
        qnVar.b(attributeSet, i);
        sb sbVar = new sb(this);
        this.b = sbVar;
        sbVar.h(attributeSet, i);
        sbVar.e();
        this.c = new rv(this);
        this.d = new liq();
        qy qyVar = new qy(this);
        this.e = qyVar;
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
