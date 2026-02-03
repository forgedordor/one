package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class dzbo extends dzcc {
    public final boolean a;
    public final Parcelable b;

    public dzbo(boolean z, Parcelable parcelable) {
        this.a = z;
        if (parcelable == null) {
            throw new NullPointerException("Null parentState");
        }
        this.b = parcelable;
    }

    @Override // defpackage.dzcc
    public final Parcelable a() {
        return this.b;
    }

    @Override // defpackage.dzcc
    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzcc) {
            dzcc dzccVar = (dzcc) obj;
            if (this.a == dzccVar.b() && this.b.equals(dzccVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "State{isPortraitInFullScreen=" + this.a + ", parentState=" + this.b.toString() + "}";
    }
}
