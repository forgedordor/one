package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djlz implements fdap {
    final /* synthetic */ List a;

    public djlz(List list) {
        this.a = list;
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        this.a.get(((Number) obj).intValue());
        return null;
    }
}
