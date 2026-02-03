package com.google.android.libraries.stickers.gallery;

import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.stickers.gallery.StickerSearchView;
import defpackage.ebxo;
import defpackage.ebxp;
import defpackage.ebxq;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class StickerSearchView extends LinearLayout {
    public AutoCompleteTextView a;
    public ImageButton b;
    public String c;
    public ebxq d;
    private final TextWatcher e;
    private final TextView.OnEditorActionListener f;
    private final View.OnFocusChangeListener g;

    public StickerSearchView(Context context) {
        super(context);
        this.e = new ebxo(this);
        this.f = new ebxp(this);
        this.g = new View.OnFocusChangeListener() { // from class: ebxm
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                StickerSearchView stickerSearchView = this.a;
                if (((InputMethodManager) stickerSearchView.getContext().getSystemService("input_method")) == null) {
                    return;
                }
                if (z) {
                    stickerSearchView.b(view);
                } else {
                    stickerSearchView.a();
                }
            }
        };
    }

    public final void a() {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    public final void b(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.showSoftInput(view, 0);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (AutoCompleteTextView) findViewById(R.id.search_view_text);
        this.b = (ImageButton) findViewById(R.id.search_clear_button);
        this.a.setHint(getContext().getString(R.string.search_query_hint));
        this.a.addTextChangedListener(this.e);
        this.a.setOnEditorActionListener(this.f);
        this.a.setOnFocusChangeListener(this.g);
        this.b.setImageResource(R.drawable.quantum_ic_clear_black_24);
        this.b.setOnClickListener(new View.OnClickListener() { // from class: ebxn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StickerSearchView stickerSearchView = this.a;
                stickerSearchView.a.setText("");
                stickerSearchView.b(stickerSearchView.a);
            }
        });
    }

    public StickerSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new ebxo(this);
        this.f = new ebxp(this);
        this.g = new View.OnFocusChangeListener() { // from class: ebxm
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                StickerSearchView stickerSearchView = this.a;
                if (((InputMethodManager) stickerSearchView.getContext().getSystemService("input_method")) == null) {
                    return;
                }
                if (z) {
                    stickerSearchView.b(view);
                } else {
                    stickerSearchView.a();
                }
            }
        };
    }

    public StickerSearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new ebxo(this);
        this.f = new ebxp(this);
        this.g = new View.OnFocusChangeListener() { // from class: ebxm
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                StickerSearchView stickerSearchView = this.a;
                if (((InputMethodManager) stickerSearchView.getContext().getSystemService("input_method")) == null) {
                    return;
                }
                if (z) {
                    stickerSearchView.b(view);
                } else {
                    stickerSearchView.a();
                }
            }
        };
    }
}
