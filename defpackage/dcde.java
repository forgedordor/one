package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcde implements dcfa {
    public final int a;
    public final int b;

    public dcde(dcdd dcddVar) {
        this.a = dcddVar.a;
        this.b = dcddVar.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dcde)) {
            return false;
        }
        dcde dcdeVar = (dcde) obj;
        return this.a == dcdeVar.a && this.b == dcdeVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }
}
