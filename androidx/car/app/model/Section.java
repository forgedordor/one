package androidx.car.app.model;

import androidx.car.app.serialization.ListDelegateImpl;
import defpackage.cmb;
import defpackage.cny;
import defpackage.cop;
import defpackage.cpg;
import defpackage.crf;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public abstract class Section<T extends cny> {
    private final crf<T> mItemsDelegate;
    private final CarText mNoItemsMessage;
    private final cop mOnItemVisibilityChangedDelegate;
    private final CarText mTitle;

    protected Section() {
        this.mItemsDelegate = new ListDelegateImpl(Collections.EMPTY_LIST);
        this.mTitle = null;
        this.mNoItemsMessage = null;
        this.mOnItemVisibilityChangedDelegate = null;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Section)) {
            return false;
        }
        Section section = (Section) obj;
        if (Objects.equals(this.mItemsDelegate, section.mItemsDelegate) && Objects.equals(this.mTitle, section.mTitle) && Objects.equals(this.mNoItemsMessage, section.mNoItemsMessage)) {
            if (Objects.equals(Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null), Boolean.valueOf(section.mOnItemVisibilityChangedDelegate == null))) {
                return true;
            }
        }
        return false;
    }

    public crf<T> getItemsDelegate() {
        return this.mItemsDelegate;
    }

    public CarText getNoItemsMessage() {
        return this.mNoItemsMessage;
    }

    public cop getOnItemVisibilityChangedDelegate() {
        return this.mOnItemVisibilityChangedDelegate;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mItemsDelegate, this.mTitle, this.mNoItemsMessage, Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Section { title: ");
        sb.append(this.mTitle);
        sb.append(", noItemsMessage: ");
        sb.append(this.mNoItemsMessage);
        sb.append(", itemsDelegate: ");
        sb.append(this.mItemsDelegate);
        sb.append(", onItemVisibilityChangedDelegate: ");
        sb.append(this.mOnItemVisibilityChangedDelegate != null);
        return sb.toString();
    }

    protected Section(cpg<T, ?> cpgVar) {
        List list = cpgVar.c;
        this.mItemsDelegate = new ListDelegateImpl(DesugarCollections.unmodifiableList(null));
        CarText carText = cpgVar.d;
        this.mTitle = null;
        CarText carText2 = cpgVar.e;
        this.mNoItemsMessage = null;
        cop copVar = cpgVar.f;
        this.mOnItemVisibilityChangedDelegate = null;
    }
}
