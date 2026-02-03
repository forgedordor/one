package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxyi extends dxzt {
    public final String a;
    public final dxzm b;
    public final int c;
    public final dyks d;

    public dxyi(dxzm dxzmVar, dyks dyksVar, String str, int i) {
        this.b = dxzmVar;
        this.d = dyksVar;
        this.a = str;
        this.c = i;
    }

    @Override // defpackage.dxzt
    public final String a() {
        return this.a;
    }

    @Override // defpackage.dxzt
    public final dxzm b() {
        return this.b;
    }

    @Override // defpackage.dxzt
    public final int c() {
        return this.c;
    }

    @Override // defpackage.dxzt
    public final dyks d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dxzt) {
            dxzt dxztVar = (dxzt) obj;
            dxzm dxzmVar = this.b;
            if (dxzmVar != null ? dxzmVar.equals(dxztVar.b()) : dxztVar.b() == null) {
                dyks dyksVar = this.d;
                if (dyksVar != null ? dyksVar.equals(dxztVar.d()) : dxztVar.d() == null) {
                    String str = this.a;
                    if (str != null ? str.equals(dxztVar.a()) : dxztVar.a() == null) {
                        int i = this.c;
                        if (i != 0 ? i == dxztVar.c() : dxztVar.c() == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        dxzm dxzmVar = this.b;
        int iHashCode = dxzmVar == null ? 0 : dxzmVar.hashCode();
        dyks dyksVar = this.d;
        int iHashCode2 = dyksVar == null ? 0 : dyksVar.hashCode();
        int i = iHashCode ^ 1000003;
        String str = this.a;
        int iHashCode3 = ((((i * 1000003) ^ iHashCode2) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        int i2 = this.c;
        return iHashCode3 ^ (i2 != 0 ? i2 : 0);
    }

    public final String toString() {
        dyks dyksVar = this.d;
        String strValueOf = String.valueOf(this.b);
        String strValueOf2 = String.valueOf(dyksVar);
        int i = this.c;
        return "RingContent{scalableRingDrawableProvider=" + strValueOf + ", ringDrawableProvider=" + strValueOf2 + ", contentDescription=" + this.a + ", discAnimationType=" + (i != 0 ? Integer.toString(i - 1) : "null") + "}";
    }
}
