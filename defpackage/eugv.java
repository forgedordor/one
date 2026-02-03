package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eugv extends eujl {
    public final boolean a;
    public final Object b;
    private final Runnable c;

    public eugv(boolean z, Object obj, Runnable runnable) {
        this.a = z;
        this.b = obj;
        this.c = runnable;
    }

    @Override // defpackage.eujl
    public final Object a() {
        return this.b;
    }

    @Override // defpackage.eujl
    public final Runnable b() {
        return this.c;
    }

    @Override // defpackage.eujl
    public final boolean c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof eujl) {
            eujl eujlVar = (eujl) obj;
            if (this.a == eujlVar.c() && ((obj2 = this.b) != null ? obj2.equals(eujlVar.a()) : eujlVar.a() == null) && this.c.equals(eujlVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.b;
        return (((obj == null ? 0 : obj.hashCode()) ^ (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Runnable runnable = this.c;
        return "ModelResult{changed=" + this.a + ", model=" + String.valueOf(this.b) + ", modelUnlocker=" + runnable.toString() + "}";
    }
}
