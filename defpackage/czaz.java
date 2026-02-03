package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czaz extends czbb {
    public final int a;
    public final int b;
    private int d;

    public czaz(int i, int i2, int i3) {
        super(i);
        this.d = -1;
        this.a = i2;
        this.b = i3;
    }

    @Override // defpackage.czbb
    public final int a() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iHashCode = hashCode();
        this.d = iHashCode;
        return iHashCode;
    }

    @Override // defpackage.czbb
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof czaz)) {
            return false;
        }
        czaz czazVar = (czaz) obj;
        return super.equals(obj) && this.a == czazVar.a && this.b == czazVar.b;
    }

    @Override // defpackage.czbb
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.c), Integer.valueOf(this.a), Integer.valueOf(this.b));
    }
}
