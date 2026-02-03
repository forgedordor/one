package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eivq extends eivr {
    private final String a = "softwareInstruction.name";
    private final Function b;
    private final eivi c;

    public eivq(Function function, eivi eiviVar) {
        this.b = function;
        this.c = eiviVar;
    }

    @Override // defpackage.eivr
    public final String a() {
        return this.a;
    }

    @Override // defpackage.eivr
    public final Function b() {
        return this.b;
    }

    @Override // defpackage.eivr
    public final eivi c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eivr) {
            eivr eivrVar = (eivr) obj;
            if (this.a.equals(eivrVar.a()) && this.b.equals(eivrVar.b()) && this.c.equals(eivrVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        eivi eiviVar = this.c;
        return "ParamBinding{name=" + this.a + ", paramGetter=" + this.b.toString() + ", argumentSetter=" + eiviVar.toString() + "}";
    }
}
