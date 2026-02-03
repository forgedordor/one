package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebnu extends ebob implements Cloneable {
    public int a;

    public ebnu() {
        super("Content-Length");
    }

    @Override // defpackage.ebob
    public final String a() {
        return String.valueOf(this.a);
    }

    public final void b(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("parameter is <0");
        }
        this.a = i;
        this.d = String.valueOf(i);
    }

    @Override // defpackage.ebob, defpackage.ebmd
    public final Object clone() {
        ebnu ebnuVar = new ebnu();
        ebnuVar.a = this.a;
        return ebnuVar;
    }

    @Override // defpackage.ebob
    public final ebmk d() {
        return null;
    }
}
