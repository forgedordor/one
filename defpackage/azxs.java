package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azxs implements azvb {
    public static final azxs a = new azxs();

    private azxs() {
    }

    @Override // defpackage.azvb
    public final /* bridge */ /* synthetic */ dqpo a() {
        return azbe.c.a;
    }

    @Override // defpackage.azvb
    public final /* synthetic */ dqws b() {
        String[] strArr = azbe.a;
        return new azbb(azbe.a);
    }

    @Override // defpackage.azvb
    public final /* bridge */ /* synthetic */ dqws c(dqws dqwsVar, List list) {
        azbb azbbVar = (azbb) dqwsVar;
        azaj[] azajVarArr = (azaj[]) list.toArray(new azaj[0]);
        azaj[] azajVarArr2 = (azaj[]) Arrays.copyOf(azajVarArr, azajVarArr.length);
        int iA = azbe.b().a();
        Integer.valueOf(iA).getClass();
        for (azaj azajVar : azajVarArr2) {
            if (((Integer) azbe.b.getOrDefault(azajVar.toString(), -1)).intValue() > iA) {
                dqru.x("columnReference.toString()", iA);
            }
        }
        azbbVar.m(azajVarArr2);
        return azbbVar;
    }
}
