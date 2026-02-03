package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wjq implements fdap {
    final /* synthetic */ wjy a;
    final /* synthetic */ List b;

    public wjq(wjy wjyVar, List list) {
        this.a = wjyVar;
        this.b = list;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.a.k.a(this.b, Integer.valueOf(((Number) obj).intValue()));
        return fctx.a;
    }
}
