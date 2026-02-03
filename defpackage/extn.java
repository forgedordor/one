package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class extn extends extv {
    private final boolean a;

    public extn(boolean z) {
        this.a = z;
    }

    @Override // defpackage.extv
    protected final int a() {
        return c((byte) -32);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        extv extvVar = (extv) obj;
        if (a() != extvVar.a()) {
            return a() - extvVar.a();
        }
        return (true != this.a ? 20 : 21) - (true == ((extn) extvVar).a ? 21 : 20);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a == ((extn) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(a()), Boolean.valueOf(this.a)});
    }

    public final String toString() {
        return Boolean.toString(this.a);
    }
}
