package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drry extends AbstractList {
    public static final ekrg a = ekrg.c("com/google/android/libraries/inputmethod/emoji/picker/ItemViewDataFlatList");
    public final int b;
    public final List c;
    public final int[] d;
    public int e;
    private final int[] f;
    private final int g;
    private final int h;

    public drry(ekgb ekgbVar, int i, int i2) {
        ArrayList arrayList = new ArrayList(ekgbVar);
        this.c = arrayList;
        this.g = i;
        this.h = i2;
        int size = arrayList.size();
        this.b = size;
        this.f = new int[size];
        this.d = new int[size];
        e();
        if (ekgbVar.isEmpty()) {
            ((ekrd) a.a(drub.a).h("com/google/android/libraries/inputmethod/emoji/picker/ItemViewDataFlatList", "<init>", 44, "ItemViewDataFlatList.java")).q("Initialized with empty categorized sources");
        }
    }

    private final void e() {
        int i = 0;
        for (int i2 = 0; i2 < this.b; i2++) {
            ekgb ekgbVar = (ekgb) this.c.get(i2);
            int size = ekgbVar.size();
            this.d[i2] = i;
            int i3 = this.h;
            int iMax = Math.max((int) Math.ceil(size / i3), this.g);
            int i4 = (size == 0 || (size == 1 && (ekgbVar.get(0) instanceof drrp))) ? (iMax > 0 ? (iMax - 1) * i3 : 0) + 2 : (iMax * i3) + 1;
            this.f[i2] = i4;
            i += i4;
        }
        this.e = i;
    }

    final int a(int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= this.b || i < this.d[i3]) {
                break;
            }
            i2 = i3;
        }
        return i2;
    }

    final int b(int i) {
        int i2 = this.b;
        if (i < i2) {
            return this.f[i];
        }
        ((ekrd) a.a(drub.a).h("com/google/android/libraries/inputmethod/emoji/picker/ItemViewDataFlatList", "getCategorySize", 140, "ItemViewDataFlatList.java")).u("Too large categoryIndex (%s vs %s)", i, i2);
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final drrx get(int i) {
        int[] iArr = this.d;
        int iA = a(i);
        int i2 = i - iArr[iA];
        if (i2 < 0) {
            ((ekrd) a.a(drub.a).h("com/google/android/libraries/inputmethod/emoji/picker/ItemViewDataFlatList", "get", 89, "ItemViewDataFlatList.java")).u("position (%d) for category (%d) is invalid", i, iA);
            return drpb.b;
        }
        if (i2 == 0) {
            return new droz(iA, 0);
        }
        List list = this.c;
        return i2 < ((ekgb) list.get(iA)).size() + 1 ? (drrx) ((ekgb) list.get(iA)).get(i2 - 1) : (i2 == 1 && ((ekgb) list.get(iA)).isEmpty()) ? drrp.b : drpb.b;
    }

    final void d(int i, ekgb ekgbVar) {
        if (this.b == 0) {
            ((ekrd) a.a(drub.a).h("com/google/android/libraries/inputmethod/emoji/picker/ItemViewDataFlatList", "updateSourcesByIndex", 50, "ItemViewDataFlatList.java")).q("Couldn't update due to empty categorizes sources");
        } else {
            this.c.set(0, ekgbVar);
            e();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
