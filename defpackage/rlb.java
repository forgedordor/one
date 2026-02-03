package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rlb implements rlq {
    private final rky a;

    public rlb(rky rkyVar) {
        this.a = rkyVar;
    }

    @Override // defpackage.rlq
    public final /* bridge */ /* synthetic */ rlp a(Object obj, int i, int i2, rex rexVar) {
        File file = (File) obj;
        return new rlp(new ruq(file), new rkx(file, this.a));
    }

    @Override // defpackage.rlq
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }
}
