package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emfg extends evsf implements evui {
    public emfg() {
        super(emfp.a);
    }

    public final void a(emfl emflVar) {
        copyOnWrite();
        emfp emfpVar = (emfp) this.instance;
        emfp emfpVar2 = emfp.a;
        emflVar.getClass();
        evsx evsxVar = emfpVar.f;
        if (!evsxVar.c()) {
            emfpVar.f = evsn.mutableCopy(evsxVar);
        }
        emfpVar.f.h(emflVar.e);
    }

    public final void b(emfl emflVar) {
        copyOnWrite();
        emfp emfpVar = (emfp) this.instance;
        emfp emfpVar2 = emfp.a;
        emflVar.getClass();
        evsx evsxVar = emfpVar.e;
        if (!evsxVar.c()) {
            emfpVar.e = evsn.mutableCopy(evsxVar);
        }
        emfpVar.e.h(emflVar.e);
    }
}
