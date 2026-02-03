package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qtc implements qtk {
    public final List a;

    public qtc(List list) {
        this.a = list;
    }

    @Override // defpackage.qtk
    public final qpv a() {
        List list = this.a;
        return ((qxa) list.get(0)).e() ? new qqg(list) : new qqf(list);
    }

    @Override // defpackage.qtk
    public final List b() {
        return this.a;
    }

    @Override // defpackage.qtk
    public final boolean c() {
        List list = this.a;
        return list.size() == 1 && ((qxa) list.get(0)).e();
    }
}
