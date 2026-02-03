package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwyb implements ehay {
    final /* synthetic */ cwyf a;

    public cwyb(cwyf cwyfVar) {
        this.a = cwyfVar;
    }

    @Override // defpackage.ehay
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        cjro cjroVar = (cjro) obj;
        Optional optionalOf = Optional.of(cjroVar);
        cwyf cwyfVar = this.a;
        cwyfVar.f.set(optionalOf);
        cwye cwyeVar = cwyfVar.a;
        if (cwyeVar != null) {
            cwyeVar.k(Optional.of(cjroVar));
        }
    }

    @Override // defpackage.ehay
    public final void a(Throwable th) {
    }
}
