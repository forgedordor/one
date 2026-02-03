package androidx.car.app.model;

import defpackage.cmb;
import defpackage.cny;
import defpackage.cnz;
import defpackage.coj;
import defpackage.cop;
import defpackage.cor;
import defpackage.crk;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public final class ItemList {
    private final List<cny> mItems;
    private final CarText mNoItemsMessage;
    private final cop mOnItemVisibilityChangedDelegate;
    private final cor mOnSelectedDelegate;
    private final int mSelectedIndex;

    private ItemList() {
        this.mSelectedIndex = 0;
        this.mItems = Collections.EMPTY_LIST;
        this.mNoItemsMessage = null;
        this.mOnSelectedDelegate = null;
        this.mOnItemVisibilityChangedDelegate = null;
    }

    public static coj getOnClickDelegate(cny cnyVar) {
        if (cnyVar instanceof Row) {
            return ((Row) cnyVar).getOnClickDelegate();
        }
        if (cnyVar instanceof GridItem) {
            return ((GridItem) cnyVar).getOnClickDelegate();
        }
        return null;
    }

    public static Toggle getToggle(cny cnyVar) {
        if (cnyVar instanceof Row) {
            return ((Row) cnyVar).getToggle();
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemList)) {
            return false;
        }
        ItemList itemList = (ItemList) obj;
        if (this.mSelectedIndex == itemList.mSelectedIndex && Objects.equals(this.mItems, itemList.mItems)) {
            if (Objects.equals(Boolean.valueOf(this.mOnSelectedDelegate == null), Boolean.valueOf(itemList.mOnSelectedDelegate == null))) {
                if (Objects.equals(Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null), Boolean.valueOf(itemList.mOnItemVisibilityChangedDelegate == null)) && Objects.equals(this.mNoItemsMessage, itemList.mNoItemsMessage)) {
                    return true;
                }
            }
        }
        return false;
    }

    public List<cny> getItems() {
        return crk.a(this.mItems);
    }

    public CarText getNoItemsMessage() {
        return this.mNoItemsMessage;
    }

    public cop getOnItemVisibilityChangedDelegate() {
        return this.mOnItemVisibilityChangedDelegate;
    }

    public cor getOnSelectedDelegate() {
        return this.mOnSelectedDelegate;
    }

    public int getSelectedIndex() {
        return this.mSelectedIndex;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mSelectedIndex), this.mItems, Boolean.valueOf(this.mOnSelectedDelegate == null), Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null), this.mNoItemsMessage);
    }

    public cnz toBuilder() {
        return new cnz(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ items: ");
        List<cny> list = this.mItems;
        sb.append(list != null ? list.toString() : null);
        sb.append(", selected: ");
        sb.append(this.mSelectedIndex);
        sb.append("]");
        return sb.toString();
    }

    public ItemList(cnz cnzVar) {
        this.mSelectedIndex = cnzVar.b;
        this.mItems = crk.b(cnzVar.a);
        this.mNoItemsMessage = cnzVar.e;
        this.mOnSelectedDelegate = cnzVar.c;
        this.mOnItemVisibilityChangedDelegate = cnzVar.d;
    }
}
