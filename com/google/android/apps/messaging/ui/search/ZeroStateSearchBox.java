package com.google.android.apps.messaging.ui.search;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageButton;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.generic.spannedautocomplete.SpannedMultiAutoCompleteTextView;
import com.google.android.apps.messaging.ui.search.ZeroStateSearchBox;
import com.google.android.apps.messaging.ui.search.presenter.SearchFilterDataItem;
import defpackage.cqdq;
import defpackage.cyuh;
import defpackage.czxz;
import defpackage.czyq;
import defpackage.czyr;
import defpackage.czys;
import defpackage.czyu;
import defpackage.czzp;
import defpackage.czzt;
import defpackage.dabl;
import defpackage.dacp;
import defpackage.dacu;
import defpackage.daoe;
import defpackage.eigp;
import defpackage.fcsu;
import defpackage.lue;
import defpackage.lvc;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ZeroStateSearchBox extends czxz implements dacp {
    public ImageButton a;
    public ViewPropertyAnimator b;
    public boolean c;
    public SpannedMultiAutoCompleteTextView d;
    public dacu e;
    public czyu f;
    public View g;
    public ViewPropertyAnimator h;
    public fcsu i;
    public daoe j;
    public dabl k;
    public eigp l;
    public fcsu m;
    public boolean n;
    public czzt o;
    private ImageButton p;
    private boolean q;
    private final int r;
    private final AnimatorListenerAdapter s;

    public ZeroStateSearchBox(Context context) {
        super(context);
        this.s = new czys(this);
        this.r = getResources().getInteger(R.integer.zero_state_fade_in_duration);
    }

    @Override // defpackage.dacp
    public final SearchFilterDataItem c() {
        dacu dacuVar = this.e;
        if (dacuVar == null) {
            return null;
        }
        SearchFilterDataItem searchFilterDataItemC = dacuVar.c();
        while (searchFilterDataItemC != null && searchFilterDataItemC.c) {
            searchFilterDataItemC = this.e.c();
        }
        if (searchFilterDataItemC == null) {
            return null;
        }
        Editable editableText = this.d.getEditableText();
        int length = editableText.length();
        editableText.replace(this.d.d.findTokenStart(editableText, length), length, "");
        j(searchFilterDataItemC);
        return searchFilterDataItemC;
    }

    public final void d(boolean z) {
        if (this.q == z || this.g == null) {
            return;
        }
        this.q = z;
        ViewPropertyAnimator viewPropertyAnimator = this.h;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        if (z) {
            this.g.setVisibility(0);
            this.g.setAlpha(0.0f);
        }
        this.h = this.g.animate().alpha(true == z ? 1.0f : 0.0f).setInterpolator(new lue()).setDuration(this.r).setListener(z ? null : this.s);
    }

    public final void e(final Context context, final View view, final lvc lvcVar) {
        cqdq.d(new Runnable() { // from class: czyn
            @Override // java.lang.Runnable
            public final void run() {
                if (((lvn) lvcVar).c.a(lvb.e) && view.getVisibility() == 0) {
                    Context context2 = context;
                    ZeroStateSearchBox zeroStateSearchBox = this.a;
                    zeroStateSearchBox.j.f(context2, zeroStateSearchBox.d);
                }
            }
        }, 100L);
    }

    @Override // defpackage.dacp
    public final boolean f(SearchFilterDataItem searchFilterDataItem) {
        throw null;
    }

    public final boolean g() {
        if (this.d.o()) {
            this.d.i();
            return true;
        }
        if (this.j.b) {
            return this.j.e(getContext(), this.d);
        }
        boolean z = c() != null;
        if (z) {
            this.k.d(9);
        }
        return z;
    }

    @Override // defpackage.dacp
    public final void h(SearchFilterDataItem searchFilterDataItem) {
        dacu dacuVar = this.e;
        if (dacuVar != null && dacuVar.f(searchFilterDataItem)) {
            this.e.b();
            this.d.h(searchFilterDataItem);
        }
    }

    public final void i(Context context, View view) {
        view.requestFocus();
        this.j.e(context, view);
    }

    @Override // defpackage.dacp
    public final void j(SearchFilterDataItem searchFilterDataItem) {
        Editable editableText = this.d.getEditableText();
        cyuh[] cyuhVarArr = (cyuh[]) editableText.getSpans(0, editableText.length(), cyuh.class);
        if (cyuhVarArr == null || (cyuhVarArr.length) == 0) {
            return;
        }
        for (cyuh cyuhVar : cyuhVarArr) {
            if (searchFilterDataItem.equals(cyuhVar.a)) {
                editableText.replace(editableText.getSpanStart(cyuhVar), editableText.getSpanEnd(cyuhVar), "");
                return;
            }
        }
    }

    public final void k(int i) {
        dacu dacuVar = this.e;
        if (dacuVar == null) {
            return;
        }
        dacuVar.w(i);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.p = (ImageButton) findViewById(R.id.zero_state_search_box_back_button);
        this.a = (ImageButton) findViewById(R.id.zero_state_search_box_clear_button);
        SpannedMultiAutoCompleteTextView spannedMultiAutoCompleteTextView = (SpannedMultiAutoCompleteTextView) findViewById(R.id.zero_state_search_box_auto_complete);
        this.d = spannedMultiAutoCompleteTextView;
        spannedMultiAutoCompleteTextView.k(new czzp(getContext(), this.m));
        SpannedMultiAutoCompleteTextView spannedMultiAutoCompleteTextView2 = this.d;
        spannedMultiAutoCompleteTextView2.l = new czyq(this);
        spannedMultiAutoCompleteTextView2.addTextChangedListener(new czyr(this));
        this.a.setOnClickListener(new View.OnClickListener() { // from class: czyf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZeroStateSearchBox zeroStateSearchBox = this.a;
                zeroStateSearchBox.k.d(8);
                Editable text = zeroStateSearchBox.d.getText();
                if (text != null) {
                    text.clear();
                }
            }
        });
        this.p.setOnClickListener(new View.OnClickListener() { // from class: czyg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                czyu czyuVar;
                czzj czzjVar;
                ea eaVar;
                eg egVarG;
                ZeroStateSearchBox zeroStateSearchBox = this.a;
                if (zeroStateSearchBox.d.o()) {
                    zeroStateSearchBox.d.i();
                }
                if (zeroStateSearchBox.j.b) {
                    zeroStateSearchBox.j.e(zeroStateSearchBox.getContext(), zeroStateSearchBox.d);
                }
                if (zeroStateSearchBox.g() || (czyuVar = zeroStateSearchBox.f) == null || (egVarG = (eaVar = (czzjVar = (czzj) czyuVar).b).G()) == null) {
                    return;
                }
                ZeroStateSearchBox zeroStateSearchBox2 = czzjVar.B;
                View view2 = eaVar.Q;
                view2.getClass();
                zeroStateSearchBox2.i(egVarG, view2);
                egVarG.onBackPressed();
            }
        });
    }

    public ZeroStateSearchBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.s = new czys(this);
        this.r = getResources().getInteger(R.integer.zero_state_fade_in_duration);
    }
}
