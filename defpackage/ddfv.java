package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddfv implements dcia {
    final /* synthetic */ byte[] a;

    public ddfv(byte[] bArr) {
        this.a = bArr;
    }

    @Override // defpackage.dcia
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ddfq ddfqVar = (ddfq) obj;
        try {
            ddez ddezVar = (ddez) evsn.parseFrom(ddez.a, this.a, evrr.a());
            ddezVar.getClass();
            DesugarCollections.unmodifiableMap(ddezVar.b).getClass();
            ddfqVar.a();
        } catch (evtj e) {
            throw new IllegalStateException("Failed parsing account data response proto", e);
        }
    }

    @Override // defpackage.dcia
    public final void b() {
    }
}
