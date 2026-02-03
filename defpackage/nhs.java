package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import j$.util.Objects;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nhs extends mcq {
    public static final nhs F = new nhs(new nhr());
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;
    public final boolean R;
    public final boolean S;
    public final boolean T;
    public final boolean U;
    public final SparseArray V;
    public final SparseBooleanArray W;

    static {
        mgb.O(1000);
        mgb.O(1001);
        mgb.O(1002);
        mgb.O(1003);
        mgb.O(1004);
        mgb.O(1005);
        mgb.O(1006);
        mgb.O(1007);
        mgb.O(1008);
        mgb.O(1009);
        mgb.O(1010);
        mgb.O(1011);
        mgb.O(1012);
        mgb.O(1013);
        mgb.O(1014);
        mgb.O(1015);
        mgb.O(1016);
        mgb.O(1017);
        mgb.O(1018);
    }

    public nhs(nhr nhrVar) {
        super(nhrVar);
        this.G = nhrVar.v;
        this.H = false;
        this.I = nhrVar.w;
        this.J = false;
        this.K = nhrVar.x;
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = nhrVar.y;
        this.Q = nhrVar.z;
        this.R = nhrVar.A;
        this.S = false;
        this.T = nhrVar.B;
        this.U = false;
        this.V = nhrVar.C;
        this.W = nhrVar.D;
    }

    @Override // defpackage.mcq
    public final /* synthetic */ mcp a() {
        return new nhr(this);
    }

    public final boolean b(int i) {
        return this.W.get(i);
    }

    @Override // defpackage.mcq
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            nhs nhsVar = (nhs) obj;
            if (super.equals(nhsVar) && this.G == nhsVar.G && this.I == nhsVar.I && this.K == nhsVar.K && this.P == nhsVar.P && this.Q == nhsVar.Q && this.R == nhsVar.R && this.T == nhsVar.T) {
                SparseBooleanArray sparseBooleanArray = this.W;
                SparseBooleanArray sparseBooleanArray2 = nhsVar.W;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = this.V;
                            SparseArray sparseArray2 = nhsVar.V;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (iIndexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i2);
                                        Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                ngo ngoVar = (ngo) entry.getKey();
                                                if (!map2.containsKey(ngoVar) || !Objects.equals(entry.getValue(), map2.get(ngoVar))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.mcq
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.G ? 1 : 0)) * 961) + (this.I ? 1 : 0)) * 961) + (this.K ? 1 : 0)) * 28629151) + (this.P ? 1 : 0)) * 31) + (this.Q ? 1 : 0)) * 31) + (this.R ? 1 : 0)) * 961) + (this.T ? 1 : 0)) * 31;
    }
}
