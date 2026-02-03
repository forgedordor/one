package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rmx implements rlq {
    public static final rew a = new rew("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500, rew.a);
    private final rlo b;

    public rmx(rlo rloVar) {
        this.b = rloVar;
    }

    @Override // defpackage.rlq
    public final /* bridge */ /* synthetic */ rlp a(Object obj, int i, int i2, rex rexVar) {
        rlo rloVar = this.b;
        rlc rlcVar = (rlc) obj;
        if (rloVar != null) {
            rlc rlcVar2 = (rlc) rloVar.a(rlcVar, 0, 0);
            if (rlcVar2 == null) {
                rloVar.b(rlcVar, 0, 0, rlcVar);
            } else {
                rlcVar = rlcVar2;
            }
        }
        return new rlp(rlcVar, new rfp(rlcVar, ((Integer) rexVar.b(a)).intValue()));
    }

    @Override // defpackage.rlq
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }

    public rmx() {
        this(null);
    }
}
