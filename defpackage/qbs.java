package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qbs {
    public final List a;
    public final List b;
    public final List c;

    /* JADX WARN: Illegal instructions before constructor call */
    public qbs() {
        List list = null;
        this(list, list, list, 15);
    }

    public static final qbs a(String... strArr) {
        List list = null;
        return new qbs(list, list, fcur.M(strArr), 11);
    }

    public /* synthetic */ qbs(List list, List list2, List list3, int i) {
        list = (i & 1) != 0 ? fcvo.a : list;
        list2 = (i & 2) != 0 ? fcvo.a : list2;
        list3 = (i & 4) != 0 ? fcvo.a : list3;
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.a = list;
        this.b = list2;
        this.c = list3;
    }
}
