package defpackage;

import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
class ekkc extends ekej implements Serializable {
    private static final long serialVersionUID = 3;
    final ekkp a;
    final ekkp b;
    final ejvp c;
    final int d;
    transient ConcurrentMap e;

    public ekkc(ekkp ekkpVar, ekkp ekkpVar2, ejvp ejvpVar, int i, ConcurrentMap concurrentMap) {
        this.a = ekkpVar;
        this.b = ekkpVar2;
        this.c = ejvpVar;
        this.d = i;
        this.e = concurrentMap;
    }

    @Override // defpackage.ekej, defpackage.ekeo
    protected final /* synthetic */ Map b() {
        return this.e;
    }

    @Override // defpackage.ekej
    protected final ConcurrentMap c() {
        return this.e;
    }

    @Override // defpackage.ekeo, defpackage.eker
    protected final /* synthetic */ Object hp() {
        return this.e;
    }
}
