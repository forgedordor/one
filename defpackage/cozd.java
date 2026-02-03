package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cozd implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        coze cozeVar = (coze) obj;
        coze cozeVar2 = (coze) obj2;
        cozeVar.getClass();
        cozeVar2.getClass();
        Integer num = (Integer) cozn.a.e();
        return (num != null && num.intValue() == -1) ? new coza().compare(cozeVar, cozeVar2) : new cozc(new cozb(num)).compare(cozeVar, cozeVar2);
    }
}
