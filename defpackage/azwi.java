package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azwi implements azvb {
    public static final azwi a = new azwi();

    private azwi() {
    }

    @Override // defpackage.azvb
    public final /* bridge */ /* synthetic */ dqpo a() {
        return ayuu.c.a;
    }

    @Override // defpackage.azvb
    public final /* synthetic */ dqws b() {
        return ayuu.a();
    }

    @Override // defpackage.azvb
    public final /* bridge */ /* synthetic */ dqws c(dqws dqwsVar, List list) {
        ayur ayurVar = (ayur) dqwsVar;
        ayub[] ayubVarArr = (ayub[]) list.toArray(new ayub[0]);
        ayurVar.c((ayub[]) Arrays.copyOf(ayubVarArr, ayubVarArr.length));
        return ayurVar;
    }
}
