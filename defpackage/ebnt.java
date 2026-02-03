package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebnt extends ebob implements Cloneable {
    private final String a;

    public ebnt(String str) {
        super("Content-ID");
        this.a = str;
    }

    @Override // defpackage.ebob
    public final String a() {
        return String.format("<%s>", this.a);
    }

    @Override // defpackage.ebob, defpackage.ebmd
    public final Object clone() {
        return new ebnt(this.a);
    }

    @Override // defpackage.ebob
    public final ebmk d() {
        return new ebmk();
    }
}
