package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class azxx implements azvb {
    public static final azxx a = new azxx();

    private azxx() {
    }

    @Override // defpackage.azvb
    public final /* bridge */ /* synthetic */ dqpo a() {
        return azlc.c.a;
    }

    @Override // defpackage.azvb
    public final /* synthetic */ dqws b() {
        return azlc.a();
    }

    @Override // defpackage.azvb
    public final /* bridge */ /* synthetic */ dqws c(dqws dqwsVar, List list) {
        azkz azkzVar = (azkz) dqwsVar;
        azjj[] azjjVarArr = (azjj[]) list.toArray(new azjj[0]);
        azkzVar.c((azjj[]) Arrays.copyOf(azjjVarArr, azjjVarArr.length));
        return azkzVar;
    }
}
