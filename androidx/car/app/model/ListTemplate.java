package androidx.car.app.model;

import androidx.car.app.messaging.model.ConversationItem;
import defpackage.cmb;
import defpackage.cnf;
import defpackage.cnt;
import defpackage.cny;
import defpackage.cnz;
import defpackage.coc;
import defpackage.cod;
import defpackage.cpp;
import defpackage.crk;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public final class ListTemplate implements cpp {
    static final int MAX_ALLOWED_ITEMS = 100;
    static final int MAX_MESSAGES_PER_CONVERSATION = 10;

    @Deprecated
    private final ActionStrip mActionStrip;
    private final List<Action> mActions;
    private final Header mHeader;

    @Deprecated
    private final Action mHeaderAction;
    private final boolean mIsLoading;
    private final List<SectionedItemList> mSectionedLists;
    private final ItemList mSingleList;

    @Deprecated
    private final CarText mTitle;

    private ListTemplate() {
        this.mIsLoading = false;
        this.mTitle = null;
        this.mHeaderAction = null;
        this.mSingleList = null;
        this.mSectionedLists = Collections.EMPTY_LIST;
        this.mActionStrip = null;
        this.mActions = Collections.EMPTY_LIST;
        this.mHeader = null;
    }

    public static List<SectionedItemList> getTruncatedCopy(List<SectionedItemList> list) {
        cod codVar = new cod();
        ArrayList arrayList = new ArrayList();
        for (SectionedItemList sectionedItemList : list) {
            arrayList.add(SectionedItemList.create(truncate(sectionedItemList.getItemList(), codVar), sectionedItemList.getHeader().toCharSequence()));
            if (codVar.a <= 0) {
                break;
            }
        }
        return arrayList;
    }

    public static ItemList truncate(ItemList itemList, cod codVar) {
        cnz cnzVar = new cnz(itemList);
        cnzVar.a.clear();
        for (cny cnyVar : itemList.getItems()) {
            if (cnyVar instanceof ConversationItem) {
                ConversationItem conversationItem = (ConversationItem) cnyVar;
                if (!codVar.b(2)) {
                    break;
                }
                cnf cnfVar = new cnf(conversationItem);
                int iMin = Math.min(codVar.a(), 10);
                int size = conversationItem.getMessages().size();
                int iMin2 = Math.min(size, iMin);
                cnfVar.f = conversationItem.getMessages().subList(size - iMin2, size);
                cnzVar.b(new ConversationItem(cnfVar));
                codVar.a -= iMin2;
            } else {
                if (!codVar.b(1)) {
                    break;
                }
                cnzVar.b(cnyVar);
                codVar.a();
            }
        }
        return cnzVar.a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListTemplate)) {
            return false;
        }
        ListTemplate listTemplate = (ListTemplate) obj;
        return this.mIsLoading == listTemplate.mIsLoading && Objects.equals(this.mTitle, listTemplate.mTitle) && Objects.equals(this.mHeaderAction, listTemplate.mHeaderAction) && Objects.equals(this.mSingleList, listTemplate.mSingleList) && Objects.equals(this.mSectionedLists, listTemplate.mSectionedLists) && Objects.equals(this.mActionStrip, listTemplate.mActionStrip) && Objects.equals(this.mActions, listTemplate.mActions) && Objects.equals(this.mHeader, listTemplate.mHeader);
    }

    @Deprecated
    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public List<Action> getActions() {
        return this.mActions;
    }

    public Header getHeader() {
        Header header = this.mHeader;
        if (header != null) {
            return header;
        }
        if (this.mTitle == null && this.mHeaderAction == null && this.mActionStrip == null) {
            return null;
        }
        cnt cntVar = new cnt();
        CarText carText = this.mTitle;
        if (carText != null) {
            cntVar.d(carText);
        }
        Action action = this.mHeaderAction;
        if (action != null) {
            cntVar.c(action);
        }
        ActionStrip actionStrip = this.mActionStrip;
        if (actionStrip != null) {
            Iterator<Action> it = actionStrip.getActions().iterator();
            while (it.hasNext()) {
                cntVar.b(it.next());
            }
        }
        return cntVar.a();
    }

    @Deprecated
    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public List<SectionedItemList> getSectionedLists() {
        return crk.a(this.mSectionedLists);
    }

    public ItemList getSingleList() {
        return this.mSingleList;
    }

    @Deprecated
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsLoading), this.mTitle, this.mHeaderAction, this.mSingleList, this.mSectionedLists, this.mActionStrip, this.mHeader);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public coc toBuilder() {
        return new coc(this);
    }

    public String toString() {
        return "ListTemplate";
    }

    public ListTemplate(coc cocVar) {
        this.mIsLoading = cocVar.a;
        this.mTitle = cocVar.d;
        this.mHeaderAction = cocVar.e;
        this.mSingleList = cocVar.b;
        this.mSectionedLists = crk.b(cocVar.c);
        this.mActionStrip = cocVar.f;
        this.mActions = crk.b(cocVar.g);
        this.mHeader = cocVar.h;
    }
}
