package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdkv implements fdll {
    public final boolean a;

    public fdkv(boolean z) {
        this.a = z;
    }

    @Override // defpackage.fdll
    public final boolean hA() {
        return this.a;
    }

    @Override // defpackage.fdll
    public final fdmj hy() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(true != this.a ? "New" : "Active");
        sb.append("}");
        return sb.toString();
    }
}
