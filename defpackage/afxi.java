package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afxi implements fdap {
    final /* synthetic */ fdap a;
    final /* synthetic */ List b;

    public afxi(fdap fdapVar, List list) {
        this.a = fdapVar;
        this.b = list;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return this.a.invoke(this.b.get(((Number) obj).intValue()));
    }
}
