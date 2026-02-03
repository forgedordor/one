package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esym extends esyj {
    public final etal a = new etal(etal.a, false);

    public final esym d(String str) {
        return (esym) this.a.get(str);
    }

    public final void e(String str, esyj esyjVar) {
        this.a.put(str, esyjVar);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof esym) && ((esym) obj).a.equals(this.a);
        }
        return true;
    }

    public final void f(String str, String str2) {
        e(str, str2 == null ? esyl.a : new esyp(str2));
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
