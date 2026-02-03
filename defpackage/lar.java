package defpackage;

import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lar {
    final String a;
    final String b;
    final List c;

    public lar(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lar)) {
            return false;
        }
        lar larVar = (lar) obj;
        return Objects.equals(this.a, larVar.a) && Objects.equals(this.b, larVar.b) && Objects.equals(this.c, larVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
