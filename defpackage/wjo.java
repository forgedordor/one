package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wjo implements fdap {
    final /* synthetic */ wjy a;
    final /* synthetic */ List b;

    public wjo(wjy wjyVar, List list) {
        this.a = wjyVar;
        this.b = list;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.a.j.a(this.b, Integer.valueOf(((Number) obj).intValue()));
        return fctx.a;
    }
}
