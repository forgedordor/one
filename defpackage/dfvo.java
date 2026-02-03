package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfvo extends dfwe {
    public final dgzn a;
    public final int b;

    public dfvo(int i, dgzn dgznVar) {
        this.b = i;
        this.a = dgznVar;
    }

    @Override // defpackage.dfwe
    public final dgzn a() {
        return this.a;
    }

    @Override // defpackage.dfwe
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dfwe) {
            dfwe dfweVar = (dfwe) obj;
            if (this.b == dfweVar.b() && this.a.equals(dfweVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        int i = this.b;
        return "SessionStoreResult{action=" + (i != 1 ? i != 2 ? "REPLACED" : "REUSED" : "CREATED") + ", session=" + this.a.toString() + "}";
    }
}
