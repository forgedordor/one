package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfvt implements dfvy {
    private final dgtw a;

    public dfvt(dgtw dgtwVar) {
        this.a = dgtwVar;
    }

    @Override // defpackage.dfvy
    public final dhat createIncomingSession(ebqr ebqrVar) {
        throw null;
    }

    @Override // defpackage.dfvy
    public final dham createOutgoingSession(String str) {
        return this.a.createOutgoingSession(str);
    }

    @Override // defpackage.dfvy
    public final dham createOutgoingSlmSession(String str) {
        return this.a.createOutgoingSlmSession(str);
    }
}
