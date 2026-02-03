package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyvs implements rlq {
    private final rlz a;

    public dyvs(rlz rlzVar) {
        this.a = rlzVar;
    }

    @Override // defpackage.rlq
    public final /* synthetic */ rlp a(Object obj, int i, int i2, rex rexVar) {
        String str = ((dyvb) ((dyvv) obj).b()).c;
        str.getClass();
        return this.a.a(String.class, InputStream.class).a(str, i, i2, rexVar);
    }

    @Override // defpackage.rlq
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return ((dyvb) ((dyvv) obj).b()).c != null;
    }
}
