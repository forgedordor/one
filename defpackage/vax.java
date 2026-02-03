package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vax implements fdap {
    final /* synthetic */ kpv a;
    final /* synthetic */ List b;
    final /* synthetic */ Map c;

    public vax(kpv kpvVar, List list, Map map) {
        this.a = kpvVar;
        this.b = list;
        this.c = map;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = this.b;
        Map map = this.c;
        this.a.c((iyk) obj, list, map);
        return fctx.a;
    }
}
