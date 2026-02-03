package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddgy implements dcia {
    final /* synthetic */ byte[] a;

    public ddgy(byte[] bArr) {
        this.a = bArr;
    }

    @Override // defpackage.dcia
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ddfs ddfsVar = (ddfs) obj;
        try {
            ddfsVar.a(DesugarCollections.unmodifiableMap(((ddfk) evsn.parseFrom(ddfk.a, this.a, evrr.a())).b));
        } catch (evtj e) {
            throw new IllegalStateException("Failed parsing account alerts proto", e);
        }
    }

    @Override // defpackage.dcia
    public final void b() {
    }
}
