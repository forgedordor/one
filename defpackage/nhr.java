package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nhr extends mcp {
    public boolean A;
    public boolean B;
    public final SparseArray C;
    public final SparseBooleanArray D;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public nhr() {
        this.C = new SparseArray();
        this.D = new SparseBooleanArray();
        this.v = true;
        this.w = true;
        this.x = true;
        this.y = true;
        this.z = true;
        this.A = true;
        this.B = true;
    }

    @Override // defpackage.mcp
    public final /* synthetic */ mcq a() {
        return new nhs(this);
    }

    protected final void f(mcq mcqVar) {
        super.b(mcqVar);
    }

    public final void g(Set set) {
        super.d(set);
    }

    public nhr(nhs nhsVar) {
        super(nhsVar);
        this.v = nhsVar.G;
        boolean z = nhsVar.H;
        this.w = nhsVar.I;
        boolean z2 = nhsVar.J;
        this.x = nhsVar.K;
        boolean z3 = nhsVar.L;
        boolean z4 = nhsVar.M;
        boolean z5 = nhsVar.N;
        boolean z6 = nhsVar.O;
        this.y = nhsVar.P;
        this.z = nhsVar.Q;
        this.A = nhsVar.R;
        boolean z7 = nhsVar.S;
        this.B = nhsVar.T;
        boolean z8 = nhsVar.U;
        SparseArray sparseArray = nhsVar.V;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.C = sparseArray2;
        this.D = nhsVar.W.clone();
    }
}
