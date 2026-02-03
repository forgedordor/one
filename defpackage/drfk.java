package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drfk {
    public final ejwi a;
    private final ejwi b = ejud.a;

    public drfk(int i) {
        this.a = ejwi.j(Integer.valueOf(i));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof drfk) {
            drfk drfkVar = (drfk) obj;
            if (this.b.equals(drfkVar.b) && this.a.equals(drfkVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }

    public final String toString() {
        return ((Integer) ((ejwt) this.a).a).toString();
    }
}
