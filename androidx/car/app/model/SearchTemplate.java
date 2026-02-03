package androidx.car.app.model;

import defpackage.cmb;
import defpackage.cpb;
import defpackage.cpe;
import defpackage.cpp;
import j$.util.Objects;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public final class SearchTemplate implements cpp {
    private final ActionStrip mActionStrip;
    private final Action mHeaderAction;
    private final String mInitialSearchText;
    private final boolean mIsLoading;
    private final ItemList mItemList;
    private final cpb mSearchCallbackDelegate;
    private final String mSearchHint;
    private final boolean mShowKeyboardByDefault;

    private SearchTemplate() {
        this.mInitialSearchText = null;
        this.mSearchHint = null;
        this.mIsLoading = false;
        this.mItemList = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mSearchCallbackDelegate = null;
        this.mShowKeyboardByDefault = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchTemplate)) {
            return false;
        }
        SearchTemplate searchTemplate = (SearchTemplate) obj;
        return this.mIsLoading == searchTemplate.mIsLoading && Objects.equals(this.mInitialSearchText, searchTemplate.mInitialSearchText) && Objects.equals(this.mSearchHint, searchTemplate.mSearchHint) && Objects.equals(this.mItemList, searchTemplate.mItemList) && Objects.equals(this.mHeaderAction, searchTemplate.mHeaderAction) && Objects.equals(this.mActionStrip, searchTemplate.mActionStrip) && this.mShowKeyboardByDefault == searchTemplate.mShowKeyboardByDefault;
    }

    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public String getInitialSearchText() {
        return this.mInitialSearchText;
    }

    public ItemList getItemList() {
        return this.mItemList;
    }

    public cpb getSearchCallbackDelegate() {
        cpb cpbVar = this.mSearchCallbackDelegate;
        cpbVar.getClass();
        return cpbVar;
    }

    public String getSearchHint() {
        return this.mSearchHint;
    }

    public int hashCode() {
        return Objects.hash(this.mInitialSearchText, Boolean.valueOf(this.mIsLoading), this.mSearchHint, this.mItemList, Boolean.valueOf(this.mShowKeyboardByDefault), this.mHeaderAction, this.mActionStrip);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public boolean isShowKeyboardByDefault() {
        return this.mShowKeyboardByDefault;
    }

    public String toString() {
        return "SearchTemplate";
    }

    SearchTemplate(cpe cpeVar) {
        String str = cpeVar.b;
        this.mInitialSearchText = null;
        String str2 = cpeVar.c;
        this.mSearchHint = null;
        boolean z = cpeVar.d;
        this.mIsLoading = false;
        ItemList itemList = cpeVar.e;
        this.mItemList = null;
        cpb cpbVar = cpeVar.a;
        this.mSearchCallbackDelegate = null;
        boolean z2 = cpeVar.f;
        this.mShowKeyboardByDefault = false;
        Action action = cpeVar.g;
        this.mHeaderAction = null;
        ActionStrip actionStrip = cpeVar.h;
        this.mActionStrip = null;
    }
}
