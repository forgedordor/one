package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azxu implements azvb {
    public static final azxu a = new azxu();

    private azxu() {
    }

    @Override // defpackage.azvb
    public final /* bridge */ /* synthetic */ dqpo a() {
        return azdx.c.a;
    }

    @Override // defpackage.azvb
    public final /* synthetic */ dqws b() {
        String[] strArr = azdx.a;
        return new azdu(azdx.a);
    }

    @Override // defpackage.azvb
    public final /* bridge */ /* synthetic */ dqws c(dqws dqwsVar, List list) {
        azdu azduVar = (azdu) dqwsVar;
        azde[] azdeVarArr = (azde[]) list.toArray(new azde[0]);
        azde[] azdeVarArr2 = (azde[]) Arrays.copyOf(azdeVarArr, azdeVarArr.length);
        int iA = azdx.b().a();
        Integer.valueOf(iA).getClass();
        for (azde azdeVar : azdeVarArr2) {
            if (((Integer) azdx.b.getOrDefault(azdeVar.toString(), -1)).intValue() > iA) {
                dqru.x("columnReference.toString()", iA);
            }
        }
        azduVar.m(azdeVarArr2);
        return azduVar;
    }
}
