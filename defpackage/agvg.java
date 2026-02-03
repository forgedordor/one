package defpackage;

import com.google.android.gms.auth.TokenData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agvg extends agvi {
    private final TokenData a;

    public agvg(TokenData tokenData) {
        this.a = tokenData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agvg) && fdbq.f(this.a, ((agvg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(tokenData=" + this.a + ")";
    }
}
