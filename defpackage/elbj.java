package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elbj extends elbk {
    public elbj(Object obj, Object obj2) {
        super(obj, obj2);
    }

    @Override // defpackage.elbk
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.elbk
    public final Object b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof elbk)) {
            return false;
        }
        elbk elbkVar = (elbk) obj;
        elbkVar.c();
        return this.a.equals(elbkVar.a()) && this.b.equals(elbkVar.b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        Object obj = this.b;
        return "<" + this.a.toString() + " -> " + obj.toString() + ">";
    }

    @Override // defpackage.elbk
    public final void c() {
    }
}
