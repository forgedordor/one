package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hub implements htz {
    final /* synthetic */ htz a;
    final /* synthetic */ hre b;

    public hub(htz htzVar, hre hreVar) {
        this.a = htzVar;
        this.b = hreVar;
    }

    @Override // defpackage.htz
    public final List a() {
        List listA = this.a.a();
        hre hreVar = this.b;
        int i = hreVar.s;
        return i < 0 ? listA : fcva.ah(ibe.d(hreVar, i, Integer.valueOf(hreVar.l(i))), listA);
    }
}
