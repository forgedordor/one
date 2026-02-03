package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqgf implements fdap {
    final /* synthetic */ List a;

    public dqgf(List list) {
        this.a = list;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.a.get(((Number) obj).intValue());
        return null;
    }
}
