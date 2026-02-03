package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgyj extends dhao {
    public final boolean a;
    public final efgw b;

    public dgyj(boolean z, efgw efgwVar) {
        this.a = z;
        this.b = efgwVar;
    }

    @Override // defpackage.dhao
    public final efgw a() {
        return this.b;
    }

    @Override // defpackage.dhao
    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dhao) {
            dhao dhaoVar = (dhao) obj;
            if (this.a == dhaoVar.b() && this.b.equals(dhaoVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SendCpimMessageRequest{requiresFailureReport=" + this.a + ", message=" + this.b.toString() + "}";
    }
}
