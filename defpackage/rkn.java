package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rkn implements rlq {
    @Override // defpackage.rlq
    public final rlp a(Object obj, int i, int i2, rex rexVar) {
        return new rlp(new ruq(obj), new rkk(obj.toString()));
    }

    @Override // defpackage.rlq
    public final boolean b(Object obj) {
        return obj.toString().startsWith("data:image");
    }
}
