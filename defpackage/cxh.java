package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cxh extends fdbr implements fdap {
    final /* synthetic */ List a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxh(List list) {
        super(1);
        this.a = list;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = this.a;
        iyk iykVar = (iyk) obj;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            iykVar.s((iyl) list.get(i), 0, 0, 0.0f);
        }
        return fctx.a;
    }
}
