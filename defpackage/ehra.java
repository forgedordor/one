package defpackage;

import android.content.ComponentCallbacks2;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehra implements ehrc {
    public final ea a;
    public final ehrd b;

    public ehra(ea eaVar, ehrd ehrdVar) {
        this.a = eaVar;
        this.b = ehrdVar;
    }

    @Override // defpackage.ehrc
    public final void a(ehrb ehrbVar) {
        ea eaVar = this.a;
        eg egVarG = eaVar.G();
        egVarG.getClass();
        ComponentCallbacks2 componentCallbacks2 = ehrbVar.b;
        egVarG.registerComponentCallbacks(componentCallbacks2);
        this.b.a(egVarG, ehrbVar);
        eaVar.P().c(new ehqz(this, egVarG, ehrbVar, componentCallbacks2));
    }
}
