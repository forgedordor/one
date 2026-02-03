package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azwh implements azvb {
    public static final azwh a = new azwh();

    private azwh() {
    }

    @Override // defpackage.azvb
    public final /* bridge */ /* synthetic */ dqpo a() {
        return aywb.c.a;
    }

    @Override // defpackage.azvb
    public final /* synthetic */ dqws b() {
        String[] strArr = aywb.a;
        return new ayvy(aywb.a);
    }

    @Override // defpackage.azvb
    public final /* bridge */ /* synthetic */ dqws c(dqws dqwsVar, List list) {
        ayvy ayvyVar = (ayvy) dqwsVar;
        ayvl[] ayvlVarArr = (ayvl[]) list.toArray(new ayvl[0]);
        ayvl[] ayvlVarArr2 = (ayvl[]) Arrays.copyOf(ayvlVarArr, ayvlVarArr.length);
        int iA = aywb.b().a();
        Integer.valueOf(iA).getClass();
        for (ayvl ayvlVar : ayvlVarArr2) {
            if (((Integer) aywb.b.getOrDefault(ayvlVar.toString(), -1)).intValue() > iA) {
                dqru.x("columnReference.toString()", iA);
            }
        }
        ayvyVar.m(ayvlVarArr2);
        return ayvyVar;
    }
}
