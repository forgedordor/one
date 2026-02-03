package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azwj implements azvb {
    public static final azwj a = new azwj();

    private azwj() {
    }

    @Override // defpackage.azvb
    public final /* bridge */ /* synthetic */ dqpo a() {
        return ayzh.c.a;
    }

    @Override // defpackage.azvb
    public final /* synthetic */ dqws b() {
        return ayzh.a();
    }

    @Override // defpackage.azvb
    public final /* bridge */ /* synthetic */ dqws c(dqws dqwsVar, List list) {
        ayze ayzeVar = (ayze) dqwsVar;
        ayya[] ayyaVarArr = (ayya[]) list.toArray(new ayya[0]);
        ayzeVar.c((ayya[]) Arrays.copyOf(ayyaVarArr, ayyaVarArr.length));
        return ayzeVar;
    }
}
