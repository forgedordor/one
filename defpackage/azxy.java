package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class azxy implements azvb {
    public static final azxy a = new azxy();

    private azxy() {
    }

    @Override // defpackage.azvb
    public final /* bridge */ /* synthetic */ dqpo a() {
        return azns.c.a;
    }

    @Override // defpackage.azvb
    public final /* synthetic */ dqws b() {
        return azns.a();
    }

    @Override // defpackage.azvb
    public final /* bridge */ /* synthetic */ dqws c(dqws dqwsVar, List list) {
        aznp aznpVar = (aznp) dqwsVar;
        azmq[] azmqVarArr = (azmq[]) list.toArray(new azmq[0]);
        azmq[] azmqVarArr2 = (azmq[]) Arrays.copyOf(azmqVarArr, azmqVarArr.length);
        int iIntValue = azns.c().intValue();
        for (azmq azmqVar : azmqVarArr2) {
            if (((Integer) azns.b.getOrDefault(azmqVar.toString(), -1)).intValue() > iIntValue) {
                dqru.x("columnReference.toString()", iIntValue);
            }
        }
        aznpVar.m(azmqVarArr2);
        return aznpVar;
    }
}
