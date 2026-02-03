package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axit {
    final String a = eiiy.d();
    final ejxr b;

    public axit() {
        final RuntimeException runtimeException = new RuntimeException();
        this.b = ejxx.a(new ejxr() { // from class: axis
            @Override // defpackage.ejxr
            public final Object get() {
                return Arrays.toString(runtimeException.getStackTrace());
            }
        });
    }

    public final String a() {
        return (String) this.b.get();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof axit)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        axit axitVar = (axit) obj;
        return Objects.equals(axitVar.a, this.a) && Objects.equals(axitVar.a(), a());
    }

    public final int hashCode() {
        return Objects.hash(a(), this.a);
    }
}
