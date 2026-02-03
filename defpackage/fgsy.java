package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fgsy {
    public fgsj A;
    public Map B;
    public final fgss C = new fgss();
    private final fgsr a = new fgsr();
    public fgsk t;
    public fgsd u;
    public fgsw v;
    public fgrm w;
    public ArrayList x;
    public String y;
    public fgsu z;

    public abstract boolean N(fgsu fgsuVar);

    protected final fgrs Z() {
        int size = this.x.size();
        return size > 0 ? (fgrs) this.x.get(size - 1) : this.w;
    }

    protected final fgsl aa(String str, fgsj fgsjVar) {
        fgsl fgslVar = (fgsl) this.B.get(str);
        if (fgslVar != null) {
            return fgslVar;
        }
        fgsl fgslVarB = fgsl.b(str, fgsjVar);
        this.B.put(str, fgslVarB);
        return fgslVarB;
    }

    protected final boolean ab(String str) {
        fgrs fgrsVarZ;
        return (this.x.size() == 0 || (fgrsVarZ = Z()) == null || !fgrsVarZ.n().equals(str)) ? false : true;
    }

    protected final boolean ac(String str) {
        fgsu fgsuVar = this.z;
        fgsr fgsrVar = this.a;
        if (fgsuVar == fgsrVar) {
            fgsr fgsrVar2 = new fgsr();
            fgsrVar2.q(str);
            return N(fgsrVar2);
        }
        fgsrVar.a();
        fgsrVar.q(str);
        return N(fgsrVar);
    }

    protected final void ad(String str) {
        fgsu fgsuVar = this.z;
        fgss fgssVar = this.C;
        if (fgsuVar == fgssVar) {
            fgss fgssVar2 = new fgss();
            fgssVar2.q(str);
            N(fgssVar2);
        } else {
            fgssVar.a();
            fgssVar.q(str);
            N(fgssVar);
        }
    }
}
