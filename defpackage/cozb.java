package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cozb implements Comparator {
    final /* synthetic */ Integer a;

    public cozb(Integer num) {
        this.a = num;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = ((coze) obj2).f.e;
        Integer num = this.a;
        return fcxl.a(Boolean.valueOf(num != null && i == num.intValue()), Boolean.valueOf(num != null && ((coze) obj).f.e == num.intValue()));
    }
}
