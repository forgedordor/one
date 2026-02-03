package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kmy extends fdbr implements fdap {
    final /* synthetic */ List a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmy(List list) {
        super(1);
        this.a = list;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = this.a;
        iyk iykVar = (iyk) obj;
        int iE = fcva.e(list);
        if (iE >= 0) {
            int i = 0;
            while (true) {
                iyk.A(iykVar, (iyl) list.get(i), 0, 0);
                if (i == iE) {
                    break;
                }
                i++;
            }
        }
        return fctx.a;
    }
}
