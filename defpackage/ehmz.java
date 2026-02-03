package defpackage;

import defpackage.ehmx;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehmz extends lxd {
    public final lwn a;
    public final ehnc b;
    public final efwo c;
    public final Object d = new Object();
    public volatile Object e;

    public ehmz(lwn lwnVar, ehnc ehncVar, efwo efwoVar) {
        this.a = lwnVar;
        this.b = ehncVar;
        this.c = efwoVar;
    }

    @Override // defpackage.lxd
    public final void fC() {
        eyha eyhaVarC;
        synchronized (this.d) {
            eyhaVarC = this.e != null ? ((ehmx.b) eygm.a(this.e, ehmx.b.class)).c() : null;
        }
        if (eyhaVarC != null) {
            eyhaVarC.b();
        }
    }
}
