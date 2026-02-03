package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuae implements fdap {
    final /* synthetic */ fdap a;
    final /* synthetic */ List b;

    public cuae(fdap fdapVar, List list) {
        this.a = fdapVar;
        this.b = list;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return this.a.invoke(this.b.get(((Number) obj).intValue()));
    }
}
