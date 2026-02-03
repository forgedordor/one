package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class evqb implements evuo {
    private static final evrr a;

    static {
        evrr evrrVar = evrr.a;
        evuq evuqVar = evuq.a;
        a = evrr.a;
    }

    private static final void o(evuh evuhVar) throws evtj {
        if (evuhVar != null && !evuhVar.isInitialized()) {
            throw ((evpz) evuhVar).newUninitializedMessageException().a();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [evuh, java.lang.Object] */
    @Override // defpackage.evuo
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final evuh i(evqs evqsVar, evrr evrrVar) throws evtj {
        evqz evqzVarL = evqsVar.l();
        ?? N = n(evqzVarL, evrrVar);
        evqzVarL.z(0);
        o(N);
        return N;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [evuh, java.lang.Object] */
    @Override // defpackage.evuo
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final evuh k(InputStream inputStream, evrr evrrVar) throws evtj {
        evqz evqzVarK = evqz.K(inputStream);
        ?? N = n(evqzVarK, evrrVar);
        evqzVarK.z(0);
        o(N);
        return N;
    }

    @Override // defpackage.evuo
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final evuh l(byte[] bArr, evrr evrrVar) {
        return m(bArr, 0, bArr.length, evrrVar);
    }

    @Override // defpackage.evuo
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final evuh m(byte[] bArr, int i, int i2, evrr evrrVar) throws evtj {
        evuh evuhVarE = e(bArr, i, i2, evrrVar);
        o(evuhVarE);
        return evuhVarE;
    }

    public evuh e(byte[] bArr, int i, int i2, evrr evrrVar) {
        throw null;
    }

    @Override // defpackage.evuo
    public final /* bridge */ /* synthetic */ Object f(evqs evqsVar) {
        return i(evqsVar, a);
    }

    @Override // defpackage.evuo
    public final /* bridge */ /* synthetic */ Object g(InputStream inputStream) {
        return k(inputStream, a);
    }

    @Override // defpackage.evuo
    public final /* bridge */ /* synthetic */ Object h(byte[] bArr) {
        return l(bArr, a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [evuh, java.lang.Object] */
    @Override // defpackage.evuo
    public final /* bridge */ /* synthetic */ Object j(evqz evqzVar, evrr evrrVar) throws evtj {
        ?? N = n(evqzVar, evrrVar);
        o(N);
        return N;
    }
}
