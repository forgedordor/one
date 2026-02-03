package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afhq implements eora {
    final /* synthetic */ afhr a;

    public afhq(afhr afhrVar) {
        this.a = afhrVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Optional optional = (Optional) obj;
        afhr afhrVar = this.a;
        if (afhrVar.b) {
            return;
        }
        synchronized (afhs.b) {
            afho afhoVar = (afho) afhrVar.a.c.get();
            if (afhoVar != null) {
                if (optional.isPresent()) {
                    afhoVar.b((eatj) optional.get());
                } else {
                    afhoVar.b(null);
                    afhs.a.n("ReverseGeocode: place is null");
                }
            }
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        if (!(th instanceof dcff)) {
            throw new ejyc(th);
        }
        afhr afhrVar = this.a;
        if (afhrVar.b) {
            return;
        }
        afhs.a.o("Failed to get place by calling ReverseGeocode", th);
        synchronized (afhs.b) {
            afho afhoVar = (afho) afhrVar.a.c.get();
            if (afhoVar != null) {
                afhoVar.b(null);
            }
        }
    }
}
