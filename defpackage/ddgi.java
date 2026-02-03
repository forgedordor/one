package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddgi implements dcia {
    final /* synthetic */ byte[] a;

    public ddgi(byte[] bArr) {
        this.a = bArr;
    }

    @Override // defpackage.dcia
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ddfr ddfrVar = (ddfr) obj;
        try {
            ddfrVar.a(DesugarCollections.unmodifiableMap(((ddff) evsn.parseFrom(ddff.a, this.a, evrr.a())).b));
        } catch (evtj e) {
            throw new IllegalStateException("Failed parsing account alerts proto", e);
        }
    }

    @Override // defpackage.dcia
    public final void b() {
    }
}
