package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azxz implements azvb {
    public static final azxz a = new azxz();

    private azxz() {
    }

    @Override // defpackage.azvb
    public final /* bridge */ /* synthetic */ dqpo a() {
        return azph.c.a;
    }

    @Override // defpackage.azvb
    public final /* synthetic */ dqws b() {
        String[] strArr = azph.a;
        return new azpe(azph.a);
    }

    @Override // defpackage.azvb
    public final /* bridge */ /* synthetic */ dqws c(dqws dqwsVar, List list) {
        azpe azpeVar = (azpe) dqwsVar;
        azop[] azopVarArr = (azop[]) list.toArray(new azop[0]);
        azop[] azopVarArr2 = (azop[]) Arrays.copyOf(azopVarArr, azopVarArr.length);
        int iA = azph.b().a();
        Integer.valueOf(iA).getClass();
        for (azop azopVar : azopVarArr2) {
            if (((Integer) azph.b.getOrDefault(azopVar.toString(), -1)).intValue() > iA) {
                dqru.x("columnReference.toString()", iA);
            }
        }
        azpeVar.m(azopVarArr2);
        return azpeVar;
    }
}
