package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
class eilk implements ebzv {
    final ebzv a;
    final /* synthetic */ eilm b;

    public eilk(eilm eilmVar, ebzv ebzvVar) {
        this.b = eilmVar;
        this.a = ebzvVar;
    }

    @Override // defpackage.ebzv
    public final String c() {
        return this.a.c();
    }

    @Override // defpackage.ebzv
    public final List d() {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        Iterator it = this.a.d().iterator();
        while (it.hasNext()) {
            ekfwVar.h(new eili(this.b, (ebzu) it.next()));
        }
        return ekfwVar.g();
    }

    @Override // defpackage.ebzv
    public final List e() {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        Iterator it = this.a.e().iterator();
        while (it.hasNext()) {
            ekfwVar.h(this.b.a((ebzv) it.next()));
        }
        return ekfwVar.g();
    }
}
