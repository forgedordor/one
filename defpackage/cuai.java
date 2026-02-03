package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuai implements fdap {
    final /* synthetic */ List a;

    public cuai(List list) {
        this.a = list;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.a.get(((Number) obj).intValue());
        return null;
    }
}
