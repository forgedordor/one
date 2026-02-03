package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azxw implements azvb {
    public static final azxw a = new azxw();

    private azxw() {
    }

    @Override // defpackage.azvb
    public final /* bridge */ /* synthetic */ dqpo a() {
        return azgl.c.a;
    }

    @Override // defpackage.azvb
    public final /* synthetic */ dqws b() {
        String[] strArr = azgl.a;
        return new azgi(azgl.a);
    }

    @Override // defpackage.azvb
    public final /* bridge */ /* synthetic */ dqws c(dqws dqwsVar, List list) {
        azgi azgiVar = (azgi) dqwsVar;
        azfw[] azfwVarArr = (azfw[]) list.toArray(new azfw[0]);
        azfw[] azfwVarArr2 = (azfw[]) Arrays.copyOf(azfwVarArr, azfwVarArr.length);
        int iA = azgl.b().a();
        Integer.valueOf(iA).getClass();
        for (azfw azfwVar : azfwVarArr2) {
            if (((Integer) azgl.b.getOrDefault(azfwVar.toString(), -1)).intValue() > iA) {
                dqru.x("columnReference.toString()", iA);
            }
        }
        azgiVar.m(azfwVarArr2);
        return azgiVar;
    }
}
