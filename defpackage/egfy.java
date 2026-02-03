package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egfy implements rlq {
    private final rlz a;

    public egfy(rlz rlzVar) {
        this.a = rlzVar;
    }

    @Override // defpackage.rlq
    public final /* bridge */ /* synthetic */ rlp a(Object obj, int i, int i2, rex rexVar) {
        return this.a.a(String.class, InputStream.class).a(((egjs) obj).b().h, i, i2, rexVar);
    }

    @Override // defpackage.rlq
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return (((egjs) obj).b().b & 32) != 0;
    }
}
