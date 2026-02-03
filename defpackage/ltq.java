package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ltq extends fcuh {
    public final List a;
    public final List b;
    public final ltm c;

    public ltq(ltm ltmVar, List list, List list2, csz cszVar) {
        if (cszVar.b != list2.size() + 1) {
            throw new IllegalArgumentException("Outline progress size is expected to be the cubics size + 1");
        }
        if (cszVar.b == 0) {
            cwh.d("FloatList is empty.");
        }
        int i = 0;
        float fA = 0.0f;
        if (cszVar.a[0] != 0.0f) {
            throw new IllegalArgumentException("First outline progress value is expected to be zero");
        }
        if (cszVar.b() != 1.0f) {
            throw new IllegalArgumentException("Last outline progress value is expected to be one");
        }
        this.c = ltmVar;
        this.b = list;
        ArrayList arrayList = new ArrayList();
        int size = list2.size();
        while (i < size) {
            int i2 = i + 1;
            if (cszVar.a(i2) - cszVar.a(i) > 1.0E-4f) {
                arrayList.add(new ltp(this, (ltb) list2.get(i), fA, cszVar.a(i2)));
                fA = cszVar.a(i2);
            }
            i = i2;
        }
        ltp ltpVar = (ltp) arrayList.get(fcva.e(arrayList));
        if (ltpVar.b > 1.0f) {
            throw new IllegalArgumentException("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
        }
        ltpVar.c = 1.0f;
        this.a = arrayList;
    }

    @Override // defpackage.fcub
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.fcub, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof ltp) {
            return super.contains((ltp) obj);
        }
        return false;
    }

    @Override // defpackage.fcuh, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return (ltp) this.a.get(i);
    }

    @Override // defpackage.fcuh, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof ltp) {
            return super.indexOf((ltp) obj);
        }
        return -1;
    }

    @Override // defpackage.fcuh, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof ltp) {
            return super.lastIndexOf((ltp) obj);
        }
        return -1;
    }
}
