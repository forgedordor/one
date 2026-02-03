package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
class cyyp implements egzv<egbs> {
    final /* synthetic */ Bundle a;
    final /* synthetic */ cyye b;

    public cyyp(cyye cyyeVar, Bundle bundle) {
        this.a = bundle;
        this.b = cyyeVar;
    }

    @Override // defpackage.egzv
    public final void a(Throwable th) {
        cqca.n("Bugle", "AccountFullscreenGalleryFragmentPeer: failed to fetch account info");
        this.b.a(new ejxr() { // from class: cyyn
            @Override // defpackage.ejxr
            public final Object get() {
                return false;
            }
        }, this.a);
    }

    @Override // defpackage.egzv
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        final egbs egbsVar = (egbs) obj;
        cyye cyyeVar = this.b;
        final boolean z = cyyeVar.p.c;
        cyyeVar.a(new ejxr() { // from class: cyyo
            @Override // defpackage.ejxr
            public final Object get() {
                boolean z2 = false;
                if (!z && !egbsVar.k.equals("pseudonymous")) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            }
        }, this.a);
    }

    @Override // defpackage.egzv
    public final /* synthetic */ void hn() {
    }
}
