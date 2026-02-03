package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qpx extends qxc {
    final /* synthetic */ qxc a;

    public qpx(qxc qxcVar) {
        this.a = qxcVar;
    }

    @Override // defpackage.qxc
    public final /* bridge */ /* synthetic */ Object a(qxb qxbVar) {
        Float f = (Float) this.a.a(qxbVar);
        if (f == null) {
            return null;
        }
        return Float.valueOf(f.floatValue() * 2.55f);
    }
}
