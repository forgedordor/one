package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgg implements der {
    private final int a;

    public dgg() {
        this((byte[]) null);
    }

    @Override // defpackage.ddz
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final djb a(dib dibVar) {
        return new djj(this.a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dgg) && ((dgg) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a;
    }

    public dgg(int i) {
        this.a = i;
    }

    public /* synthetic */ dgg(byte[] bArr) {
        this(0);
    }
}
