package defpackage;

import android.content.ComponentCallbacks2;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehqz implements lun {
    final /* synthetic */ eg a;
    final /* synthetic */ ehrb b;
    final /* synthetic */ ComponentCallbacks2 c;
    final /* synthetic */ ehra d;

    public ehqz(ehra ehraVar, eg egVar, ehrb ehrbVar, ComponentCallbacks2 componentCallbacks2) {
        this.a = egVar;
        this.b = ehrbVar;
        this.c = componentCallbacks2;
        this.d = ehraVar;
    }

    @Override // defpackage.lun
    public final void fh(lvj lvjVar) {
        ehra ehraVar = this.d;
        ehrd ehrdVar = ehraVar.b;
        eg egVar = this.a;
        ehrdVar.c(egVar, this.b);
        egVar.unregisterComponentCallbacks(this.c);
        ehraVar.a.P().d(this);
    }

    @Override // defpackage.lun
    public final /* synthetic */ void c(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void d(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void f(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void gF(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void gG(lvj lvjVar) {
    }
}
