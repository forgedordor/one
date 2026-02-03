package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlel implements dlen {
    private final Integer a;
    private final int b;
    private final boolean c;

    public dlel() {
        this(null);
    }

    @Override // defpackage.dlen
    public final int a() {
        return 20;
    }

    @Override // defpackage.dlen
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlel)) {
            return false;
        }
        dlel dlelVar = (dlel) obj;
        Integer num = dlelVar.a;
        if (!fdbq.f(null, null)) {
            return false;
        }
        int i = dlelVar.b;
        boolean z = dlelVar.c;
        return true;
    }

    public final int hashCode() {
        return 1857;
    }

    public final String toString() {
        return a.h(null, "Tinted(iconTint=", ", cornerRadiusDp=20, primaryColored=false)");
    }

    public /* synthetic */ dlel(byte[] bArr) {
        this.a = null;
        this.b = 20;
        this.c = false;
    }
}
