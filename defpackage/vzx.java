package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vzx {
    public final int a;

    public vzx(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vzx) && this.a == ((vzx) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "DirectSendIconData(legacyLocationSendIconType=" + this.a + ")";
    }
}
