package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eipw extends eipy {
    public Object a;
    public byte b;

    @Override // defpackage.eipy
    public final eipz a() {
        if (this.b == 1) {
            return new eipx(this.a);
        }
        throw new IllegalStateException("Missing required properties: startDictation");
    }
}
