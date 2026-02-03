package defpackage;

import com.google.android.apps.aicore.aidl.IAICoreService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class smt extends smi {
    private final IAICoreService a;
    private final sor b;

    public smt(IAICoreService iAICoreService, sor sorVar) {
        if (iAICoreService == null) {
            throw new NullPointerException("Null service");
        }
        this.a = iAICoreService;
        if (sorVar == null) {
            throw new NullPointerException("Null disconnectSignal");
        }
        this.b = sorVar;
    }

    @Override // defpackage.smi
    public final IAICoreService a() {
        return this.a;
    }

    @Override // defpackage.smi
    public final sor b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof smi) {
            smi smiVar = (smi) obj;
            if (this.a.equals(smiVar.a()) && this.b.equals(smiVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        sor sorVar = this.b;
        return "ServiceContext{service=" + this.a.toString() + ", disconnectSignal=" + sorVar.toString() + "}";
    }
}
