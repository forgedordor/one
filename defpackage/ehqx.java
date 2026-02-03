package defpackage;

import android.content.ComponentCallbacks2;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehqx implements lun {
    final /* synthetic */ ehrb a;
    final /* synthetic */ ComponentCallbacks2 b;
    final /* synthetic */ ehqy c;

    public ehqx(ehqy ehqyVar, ehrb ehrbVar, ComponentCallbacks2 componentCallbacks2) {
        this.a = ehrbVar;
        this.b = componentCallbacks2;
        this.c = ehqyVar;
    }

    @Override // defpackage.lun
    public final void fh(lvj lvjVar) {
        ehqy ehqyVar = this.c;
        ehrd ehrdVar = ehqyVar.b;
        eg egVar = ehqyVar.a;
        ehrdVar.c(egVar, this.a);
        egVar.unregisterComponentCallbacks(this.b);
        egVar.P().d(this);
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
