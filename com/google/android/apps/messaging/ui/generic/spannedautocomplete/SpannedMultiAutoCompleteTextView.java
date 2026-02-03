package com.google.android.apps.messaging.ui.generic.spannedautocomplete;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.QwertyKeyListener;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Filter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.generic.spannedautocomplete.SpannedMultiAutoCompleteTextView;
import com.google.android.apps.messaging.ui.search.ZeroStateSearchBox;
import com.google.android.apps.messaging.ui.search.presenter.SearchFilterDataItem;
import defpackage.cqaz;
import defpackage.cytw;
import defpackage.cytx;
import defpackage.cyuc;
import defpackage.cyud;
import defpackage.cyue;
import defpackage.cyuf;
import defpackage.cyug;
import defpackage.cyuh;
import defpackage.cyui;
import defpackage.cyuk;
import defpackage.cyum;
import defpackage.czyi;
import defpackage.czyp;
import defpackage.czyq;
import defpackage.czyt;
import defpackage.eebt;
import defpackage.eigi;
import defpackage.eigp;
import defpackage.fcsu;
import defpackage.ley;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SpannedMultiAutoCompleteTextView extends cytw {
    public fcsu a;
    public Parcelable b;
    public cyum c;
    public final cyug d;
    public boolean e;
    public boolean f;
    public cyuc g;
    public Filter h;
    public AdapterView.OnItemClickListener i;
    public ListAdapter j;
    public czyt k;
    public czyq l;
    public czyi m;
    private final int n;
    private SpannedAutoCompleteList o;
    private final cyue p;

    public SpannedMultiAutoCompleteTextView(Context context) {
        this(context, null);
        e();
    }

    public final SpannedAutoCompleteList f() {
        if (this.o == null) {
            SpannedAutoCompleteList spannedAutoCompleteList = (SpannedAutoCompleteList) getRootView().findViewById(this.n);
            this.o = spannedAutoCompleteList;
            spannedAutoCompleteList.a.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: cyua
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                    SpannedMultiAutoCompleteTextView spannedMultiAutoCompleteTextView = this.a;
                    SearchFilterDataItem item = ((czzt) spannedMultiAutoCompleteTextView.j).getItem(i);
                    if (item == null) {
                        return;
                    }
                    AdapterView.OnItemClickListener onItemClickListener = spannedMultiAutoCompleteTextView.i;
                    if (onItemClickListener != null) {
                        onItemClickListener.onItemClick(adapterView, view, i, j);
                    }
                    spannedMultiAutoCompleteTextView.j(spannedMultiAutoCompleteTextView.g(item));
                    spannedMultiAutoCompleteTextView.i();
                }
            });
        }
        return this.o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CharSequence g(Object obj) {
        this.b = obj;
        return this.h.convertResultToString(obj);
    }

    public final void h(Parcelable parcelable) {
        Editable editableText = getEditableText();
        int length = editableText.length();
        cyug cyugVar = this.d;
        int iFindTokenStart = cyugVar.findTokenStart(editableText, length);
        boolean z = true;
        if (iFindTokenStart != editableText.length() && ((cyuh[]) editableText.getSpans(iFindTokenStart, editableText.length(), cyuh.class)).length != 0) {
            z = false;
        }
        cqaz.k(z);
        editableText.replace(iFindTokenStart, iFindTokenStart, cyugVar.terminateToken(g(parcelable)));
        i();
    }

    public final void i() {
        f().a(false);
        this.e = false;
        czyq czyqVar = this.l;
        if (czyqVar != null) {
            czyqVar.b.d(false);
        }
    }

    public final void j(CharSequence charSequence) {
        clearComposingText();
        int selectionEnd = getSelectionEnd();
        cyug cyugVar = this.d;
        int iFindTokenStart = cyugVar.findTokenStart(getText(), selectionEnd);
        Editable text = getText();
        QwertyKeyListener.markAsReplaced(text, iFindTokenStart, selectionEnd, TextUtils.substring(text, iFindTokenStart, selectionEnd));
        text.replace(iFindTokenStart, selectionEnd, cyugVar.terminateToken(charSequence));
    }

    public final void k(cyum cyumVar) {
        cyum cyumVar2 = this.c;
        if (cyumVar2 != null) {
            cyumVar2.b();
        }
        this.c = cyumVar;
        cyumVar.c(this);
    }

    public final void l() {
        ListAdapter adapter;
        this.b = null;
        SpannedAutoCompleteList spannedAutoCompleteListF = f();
        ListView listView = spannedAutoCompleteListF.a;
        if (listView == null || (adapter = listView.getAdapter()) == null || adapter.getCount() == 0) {
            return;
        }
        spannedAutoCompleteListF.a(true);
        spannedAutoCompleteListF.setOverScrollMode(0);
        final czyq czyqVar = this.l;
        if (czyqVar != null) {
            if (!czyqVar.a) {
                ZeroStateSearchBox zeroStateSearchBox = czyqVar.b;
                zeroStateSearchBox.g = zeroStateSearchBox.getRootView().findViewById(R.id.zero_state_search_scrim);
                czyqVar.a = true;
                ley.p(spannedAutoCompleteListF, new czyp(czyqVar));
                zeroStateSearchBox.g.setOnClickListener(new View.OnClickListener() { // from class: czyo
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        czyqVar.b.d.i();
                    }
                });
            }
            czyqVar.b.d(true);
        }
    }

    public final void m(int i) {
        if (getWindowVisibility() == 8) {
            return;
        }
        boolean zN = n();
        if (i <= 0 || !zN) {
            if (o()) {
                i();
                this.e = true;
                return;
            }
            return;
        }
        if (hasFocus() && hasWindowFocus() && this.e) {
            l();
        }
    }

    public final boolean n() {
        Editable text = getText();
        int selectionEnd = getSelectionEnd();
        return selectionEnd >= 0 && selectionEnd - this.d.findTokenStart(text, selectionEnd) >= 2;
    }

    public final boolean o() {
        SpannedAutoCompleteList spannedAutoCompleteListF = f();
        return spannedAutoCompleteListF != null && spannedAutoCompleteListF.getVisibility() == 0;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        eebt.c(this);
    }

    @Override // defpackage.qx, android.view.View
    protected final void onDetachedFromWindow() {
        i();
        this.k = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onDisplayHint(int i) {
        super.onDisplayHint(i);
        if (i == 4) {
            i();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z) {
            return;
        }
        i();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        czyt czytVar = this.k;
        this.k = null;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.b != null) {
            getEditableText().replace(((Integer) savedState.b.first).intValue(), ((Integer) savedState.b.second).intValue(), "");
        }
        ArrayList arrayList = savedState.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            h((Parcelable) arrayList.get(i));
        }
        this.k = czytVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Editable editableText = getEditableText();
        cyuh[] cyuhVarArr = (cyuh[]) editableText.getSpans(0, editableText.length(), cyuh.class);
        if (cyuhVarArr.length <= 0) {
            return parcelableOnSaveInstanceState;
        }
        SavedState savedState = new SavedState(parcelableOnSaveInstanceState);
        for (cyuh cyuhVar : cyuhVarArr) {
            savedState.a.add(cyuhVar.a);
        }
        Editable editableText2 = getEditableText();
        cyuh[] cyuhVarArr2 = (cyuh[]) editableText2.getSpans(0, editableText2.length(), cyuh.class);
        Pair pairCreate = null;
        if (cyuhVarArr2 != null && (cyuhVarArr2.length) != 0) {
            int length = editableText2.length();
            int iMax = 0;
            for (cyuh cyuhVar2 : cyuhVarArr2) {
                length = Math.min(length, editableText2.getSpanStart(cyuhVar2));
                iMax = Math.max(iMax, editableText2.getSpanEnd(cyuhVar2));
            }
            if (length < iMax) {
                pairCreate = Pair.create(Integer.valueOf(length), Integer.valueOf(iMax));
            }
        }
        savedState.b = pairCreate;
        return savedState;
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        int iMin;
        cyuh[] cyuhVarArr;
        int length;
        Editable text = getText();
        if (text != null && (iMin = Math.min(i, i2)) < text.length() && (length = (cyuhVarArr = (cyuh[]) text.getSpans(iMin + 1, text.length(), cyuh.class)).length) > 0) {
            int iMax = 0;
            for (int i3 = 0; i3 < length; i3++) {
                iMax = Math.max(iMax, text.getSpanEnd(cyuhVarArr[i3]));
            }
            if (iMax > iMin) {
                if (i > i2) {
                    setSelection(Math.max(i, iMax), iMax);
                } else {
                    setSelection(iMax, Math.max(i2, iMax));
                }
            }
        }
        super.onSelectionChanged(i, i2);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            return;
        }
        i();
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.p.a = onClickListener;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        Editable editableText = getEditableText();
        super.setText(charSequence, TextView.BufferType.EDITABLE);
        Editable editableText2 = getEditableText();
        if (editableText != null) {
            cqaz.k(editableText != editableText2);
            editableText.clearSpans();
        }
        if (editableText2 != null) {
            editableText2.setSpan(new cyui(this), 0, charSequence.length(), 18);
        }
    }

    public SpannedMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new cyug(this);
        this.e = true;
        cyue cyueVar = new cyue(this);
        this.p = cyueVar;
        k(new cyud(getContext()));
        addTextChangedListener(new eigi((eigp) this.a.b(), new cyuk(this), "com/google/android/apps/messaging/ui/generic/spannedautocomplete/SpannedMultiAutoCompleteTextView", "<init>", 167, "ZeroStateSearchBox TokenTextWatcher"));
        setFocusable(true);
        super.setOnClickListener(cyueVar);
        int inputType = getInputType();
        if ((inputType & 15) == 1) {
            setRawInputType(65536 | inputType);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, cytx.a, 0, 0);
        try {
            this.n = typedArrayObtainStyledAttributes.getResourceId(0, R.id.spanned_autocomplete_list);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* compiled from: PG */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new cyuf();
        final ArrayList a;
        Pair b;

        public SavedState(Parcel parcel) {
            super(parcel);
            ArrayList arrayList = new ArrayList();
            this.a = arrayList;
            boolean[] zArr = new boolean[1];
            parcel.readBooleanArray(zArr);
            parcel.readList(arrayList, getClass().getClassLoader());
            if (zArr[0]) {
                this.b = Pair.create(Integer.valueOf(parcel.readInt()), Integer.valueOf(parcel.readInt()));
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            boolean[] zArr = {this.b != null};
            parcel.writeBooleanArray(zArr);
            parcel.writeList(this.a);
            if (zArr[0]) {
                parcel.writeInt(((Integer) this.b.first).intValue());
                parcel.writeInt(((Integer) this.b.second).intValue());
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.a = new ArrayList();
        }
    }
}
