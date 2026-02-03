package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvwx {
    public final ekgb a;

    public cvwx() {
        this((byte[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cvwx) && fdbq.f(this.a, ((cvwx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DescriptionUiData(items=" + this.a + ")";
    }

    public cvwx(ekgb ekgbVar) {
        ekgbVar.getClass();
        this.a = ekgbVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cvwx(byte[] bArr) {
        this(ekoe.a);
        int i = ekgb.d;
    }
}
