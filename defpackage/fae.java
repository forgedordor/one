package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fae {
    public static final fae a = new fae(0, null, 0, 0, 127);
    public final int b;
    public final int c;
    public final int d;
    private final Boolean e;
    private final keo f;
    private final Boolean g;
    private final kfu h;

    public /* synthetic */ fae(int i, Boolean bool, int i2, int i3, int i4) {
        this.b = 1 == (i4 & 1) ? -1 : i;
        this.e = (i4 & 2) != 0 ? null : bool;
        this.c = (i4 & 4) != 0 ? 0 : i2;
        this.d = (i4 & 8) != 0 ? -1 : i3;
        this.f = null;
        this.g = null;
        this.h = null;
    }

    public final kdy a(boolean z) {
        int i;
        boolean z2;
        kec kecVar = new kec(this.b);
        if (true == kec.b(kecVar.a, -1)) {
            kecVar = null;
        }
        int i2 = kecVar != null ? kecVar.a : 0;
        Boolean bool = this.e;
        if (bool != null) {
            bool.booleanValue();
            i = -1;
            z2 = false;
        } else {
            i = -1;
            z2 = true;
        }
        ked kedVar = new ked(this.c);
        if (true == ked.b(kedVar.a, 0)) {
            kedVar = null;
        }
        int i3 = kedVar != null ? kedVar.a : 1;
        kdw kdwVar = new kdw(this.d);
        kdw kdwVar2 = true != kdw.b(kdwVar.a, i) ? kdwVar : null;
        return new kdy(z, i2, z2, i3, kdwVar2 != null ? kdwVar2.a : 1, kfu.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fae)) {
            return false;
        }
        fae faeVar = (fae) obj;
        if (!kec.b(this.b, faeVar.b) || !fdbq.f(this.e, faeVar.e) || !ked.b(this.c, faeVar.c) || !kdw.b(this.d, faeVar.d)) {
            return false;
        }
        keo keoVar = faeVar.f;
        if (!fdbq.f(null, null)) {
            return false;
        }
        Boolean bool = faeVar.g;
        if (!fdbq.f(null, null)) {
            return false;
        }
        kfu kfuVar = faeVar.h;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        Boolean bool = this.e;
        return ((((((this.b * 31) + (bool != null ? bool.hashCode() : 0)) * 31) + this.c) * 31) + this.d) * 29791;
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) kec.a(this.b)) + ", autoCorrectEnabled=" + this.e + ", keyboardType=" + ((Object) ked.a(this.c)) + ", imeAction=" + ((Object) kdw.a(this.d)) + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }
}
