package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class babm implements azvb {
    public static final babm a = new babm();

    private babm() {
    }

    @Override // defpackage.azvb
    public final /* bridge */ /* synthetic */ dqpo a() {
        return azut.c.a;
    }

    @Override // defpackage.azvb
    public final /* synthetic */ dqws b() {
        return azut.a();
    }

    @Override // defpackage.azvb
    public final /* bridge */ /* synthetic */ dqws c(dqws dqwsVar, List list) {
        azuq azuqVar = (azuq) dqwsVar;
        azto[] aztoVarArr = (azto[]) list.toArray(new azto[0]);
        azuqVar.c((azto[]) Arrays.copyOf(aztoVarArr, aztoVarArr.length));
        return azuqVar;
    }
}
