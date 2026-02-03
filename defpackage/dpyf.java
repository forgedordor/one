package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpyf extends mo {
    final /* synthetic */ dpyi a;
    final /* synthetic */ List b;

    public dpyf(dpyi dpyiVar, List list) {
        this.a = dpyiVar;
        this.b = list;
    }

    @Override // defpackage.mo
    public final int a() {
        return this.b.size();
    }

    @Override // defpackage.mo
    public final int b() {
        return this.a.d.size();
    }

    @Override // defpackage.mo
    public final boolean d(int i, int i2) {
        return dlth.a((dlti) this.a.d.get(i), (dlti) this.b.get(i2));
    }

    @Override // defpackage.mo
    public final boolean e(int i, int i2) {
        return dlth.a((dlti) this.a.d.get(i), (dlti) this.b.get(i2));
    }
}
