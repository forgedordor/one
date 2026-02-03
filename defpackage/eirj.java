package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eirj extends eirl {
    private final String a;
    private final Function b;
    private final eirk c;

    public eirj(String str, Function function, eirk eirkVar) {
        this.a = str;
        this.b = function;
        this.c = eirkVar;
    }

    @Override // defpackage.eirl
    public final eirk a() {
        return this.c;
    }

    @Override // defpackage.eirl
    public final String b() {
        return this.a;
    }

    @Override // defpackage.eirl
    public final Function c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eirl) {
            eirl eirlVar = (eirl) obj;
            if (this.a.equals(eirlVar.b()) && this.b.equals(eirlVar.c()) && this.c.equals(eirlVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        eirk eirkVar = this.c;
        return "FieldBinding{name=" + this.a + ", valueGetter=" + this.b.toString() + ", valueSetter=" + eirkVar.toString() + "}";
    }
}
