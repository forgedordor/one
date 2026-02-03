package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.ListTemplate;
import androidx.car.app.model.SectionedItemList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class coc {
    public boolean a;
    public ItemList b;
    public final List c;
    public CarText d;
    public Action e;
    public ActionStrip f;
    public final List g;
    public Header h;

    public coc() {
        this.c = new ArrayList();
        this.g = new ArrayList();
    }

    public final ListTemplate a() {
        boolean z = true;
        if (this.b == null && this.c.isEmpty()) {
            z = false;
        }
        if (this.a == z) {
            throw new IllegalStateException("Template is in a loading state but lists are added, or vice versa");
        }
        if (z) {
            List list = this.c;
            if (!list.isEmpty()) {
                cqa cqaVar = cqa.b;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ItemList itemList = ((SectionedItemList) it.next()).getItemList();
                    if (itemList.getOnSelectedDelegate() != null && !cqaVar.e) {
                        throw new IllegalArgumentException("Selectable lists are not allowed");
                    }
                    arrayList.addAll(itemList.getItems());
                }
                cqaVar.a(arrayList);
            } else if (this.b != null) {
                cqa cqaVar2 = cqa.b;
                ItemList itemList2 = this.b;
                if (itemList2.getOnSelectedDelegate() != null && !cqaVar2.e) {
                    throw new IllegalArgumentException("Selectable lists are not allowed");
                }
                cqaVar2.a(itemList2.getItems());
            }
        }
        List list2 = this.c;
        if (list2.isEmpty()) {
            ItemList itemList3 = this.b;
            if (itemList3 != null) {
                this.b = ListTemplate.truncate(itemList3, new cod());
            }
        } else {
            List<SectionedItemList> truncatedCopy = ListTemplate.getTruncatedCopy(list2);
            list2.clear();
            list2.addAll(truncatedCopy);
        }
        return new ListTemplate(this);
    }

    public final void b(ItemList itemList) {
        this.b = itemList;
        this.c.clear();
    }

    public coc(ListTemplate listTemplate) {
        this.a = listTemplate.isLoading();
        this.e = listTemplate.getHeaderAction();
        this.d = listTemplate.getTitle();
        this.b = listTemplate.getSingleList();
        this.c = new ArrayList(listTemplate.getSectionedLists());
        this.f = listTemplate.getActionStrip();
        this.g = new ArrayList(listTemplate.getActions());
        this.h = listTemplate.getHeader();
    }
}
