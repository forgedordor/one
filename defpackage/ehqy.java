package defpackage;

import android.content.ComponentCallbacks2;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehqy implements ehrc {
    public final eg a;
    public final ehrd b;

    public ehqy(eg egVar, ehrd ehrdVar) {
        this.a = egVar;
        this.b = ehrdVar;
    }

    @Override // defpackage.ehrc
    public final void a(ehrb ehrbVar) {
        eg egVar = this.a;
        ComponentCallbacks2 componentCallbacks2 = ehrbVar.b;
        egVar.registerComponentCallbacks(componentCallbacks2);
        this.b.a(egVar, ehrbVar);
        egVar.P().c(new ehqx(this, ehrbVar, componentCallbacks2));
    }
}
