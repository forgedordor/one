package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rkf implements rlq {
    private final rkb a;

    public rkf(rkb rkbVar) {
        this.a = rkbVar;
    }

    @Override // defpackage.rlq
    public final /* bridge */ /* synthetic */ rlp a(Object obj, int i, int i2, rex rexVar) {
        byte[] bArr = (byte[]) obj;
        return new rlp(new ruq(bArr), new rkc(bArr, this.a));
    }

    @Override // defpackage.rlq
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }
}
