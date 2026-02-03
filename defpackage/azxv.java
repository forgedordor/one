package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azxv implements azvb {
    public static final azxv a = new azxv();

    private azxv() {
    }

    @Override // defpackage.azvb
    public final /* bridge */ /* synthetic */ dqpo a() {
        return azfi.c.a;
    }

    @Override // defpackage.azvb
    public final /* synthetic */ dqws b() {
        String[] strArr = azfi.a;
        return new azff(azfi.a);
    }

    @Override // defpackage.azvb
    public final /* bridge */ /* synthetic */ dqws c(dqws dqwsVar, List list) {
        azff azffVar = (azff) dqwsVar;
        azer[] azerVarArr = (azer[]) list.toArray(new azer[0]);
        azer[] azerVarArr2 = (azer[]) Arrays.copyOf(azerVarArr, azerVarArr.length);
        int iA = azfi.b().a();
        Integer.valueOf(iA).getClass();
        for (azer azerVar : azerVarArr2) {
            if (((Integer) azfi.b.getOrDefault(azerVar.toString(), -1)).intValue() > iA) {
                dqru.x("columnReference.toString()", iA);
            }
        }
        azffVar.m(azerVarArr2);
        return azffVar;
    }
}
