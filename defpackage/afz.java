package defpackage;

import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afz extends ajn {
    final List a;
    private final String b;
    private final boolean c;
    private final agl d;

    public afz(String str, boolean z, agl aglVar, List list) {
        this.c = z;
        this.b = str;
        this.d = aglVar;
        list.getClass();
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof afz)) {
            return false;
        }
        afz afzVar = (afz) obj;
        return this.c == afzVar.c && Objects.equals(this.b, afzVar.b) && Objects.equals(this.d, afzVar.d) && Objects.equals(this.a, afzVar.a);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.c), this.b, this.d, this.a);
    }
}
