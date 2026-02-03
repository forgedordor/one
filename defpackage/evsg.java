package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evsg extends evqb {
    private final evsn a;

    public evsg(evsn evsnVar) {
        this.a = evsnVar;
    }

    @Override // defpackage.evqb
    public final /* bridge */ /* synthetic */ evuh e(byte[] bArr, int i, int i2, evrr evrrVar) {
        return evsn.parsePartialFrom(this.a, bArr, i, i2, evrrVar);
    }

    @Override // defpackage.evuo
    public final /* bridge */ /* synthetic */ Object n(evqz evqzVar, evrr evrrVar) {
        return evsn.parsePartialFrom(this.a, evqzVar, evrrVar);
    }
}
