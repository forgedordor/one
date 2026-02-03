package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nfb implements nel, nek {
    private final nel[] a;
    private final boolean[] b;
    private final IdentityHashMap c;
    private final ArrayList d = new ArrayList();
    private final HashMap e = new HashMap();
    private nek f;
    private ngo g;
    private nel[] h;
    private nge i;

    public nfb(long[] jArr, nel... nelVarArr) {
        this.a = nelVarArr;
        int i = ekgb.d;
        ekgb ekgbVar = ekoe.a;
        this.i = new nds(ekgbVar, ekgbVar);
        this.c = new IdentityHashMap();
        this.h = new nel[0];
        this.b = new boolean[nelVarArr.length];
        for (int i2 = 0; i2 < nelVarArr.length; i2++) {
            long j = jArr[i2];
            if (j != 0) {
                this.b[i2] = true;
                this.a[i2] = new ngl(nelVarArr[i2], j);
            }
        }
    }

    @Override // defpackage.nel
    public final long a(long j, mtq mtqVar) {
        nel[] nelVarArr = this.h;
        return (nelVarArr.length > 0 ? nelVarArr[0] : this.a[0]).a(j, mtqVar);
    }

    @Override // defpackage.ngd
    public final /* bridge */ /* synthetic */ void b(nge ngeVar) {
        nek nekVar = this.f;
        mee.f(nekVar);
        nekVar.b(this);
    }

    @Override // defpackage.nel, defpackage.nge
    public final long c() {
        return this.i.c();
    }

    @Override // defpackage.nek
    public final void d(nel nelVar) {
        ArrayList arrayList = this.d;
        arrayList.remove(nelVar);
        if (arrayList.isEmpty()) {
            nel[] nelVarArr = this.a;
            int i = 0;
            for (nel nelVar2 : nelVarArr) {
                i += nelVar2.i().b;
            }
            mcm[] mcmVarArr = new mcm[i];
            int i2 = 0;
            for (int i3 = 0; i3 < nelVarArr.length; i3++) {
                ngo ngoVarI = nelVarArr[i3].i();
                int i4 = ngoVarI.b;
                int i5 = 0;
                while (i5 < i4) {
                    mcm mcmVarB = ngoVarI.b(i5);
                    int i6 = mcmVarB.a;
                    mau[] mauVarArr = new mau[i6];
                    for (int i7 = 0; i7 < i6; i7++) {
                        mau mauVarA = mcmVarB.a(i7);
                        mat matVar = new mat(mauVarA);
                        String str = mauVarA.a;
                        if (str == null) {
                            str = "";
                        }
                        matVar.a = i3 + ":" + str;
                        mauVarArr[i7] = new mau(matVar);
                    }
                    mcm mcmVar = new mcm(i3 + ":" + mcmVarB.b, mauVarArr);
                    this.e.put(mcmVar, mcmVarB);
                    mcmVarArr[i2] = mcmVar;
                    i5++;
                    i2++;
                }
            }
            this.g = new ngo(mcmVarArr);
            nek nekVar = this.f;
            mee.f(nekVar);
            nekVar.d(this);
        }
    }

    @Override // defpackage.nel, defpackage.nge
    public final long e() {
        return this.i.e();
    }

    @Override // defpackage.nel
    public final long f() {
        long j = -9223372036854775807L;
        for (nel nelVar : this.h) {
            long jF = nelVar.f();
            if (jF == -9223372036854775807L) {
                if (j != -9223372036854775807L && nelVar.g(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (nel nelVar2 : this.h) {
                    if (nelVar2 == nelVar) {
                        break;
                    }
                    if (nelVar2.g(jF) != jF) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jF;
            } else if (jF != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // defpackage.nel
    public final long g(long j) {
        long jG = this.h[0].g(j);
        int i = 1;
        while (true) {
            nel[] nelVarArr = this.h;
            if (i >= nelVarArr.length) {
                return jG;
            }
            if (nelVarArr[i].g(jG) != jG) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // defpackage.nel
    public final long h(nif[] nifVarArr, boolean[] zArr, ngc[] ngcVarArr, boolean[] zArr2, long j) {
        int length;
        int[] iArr;
        int length2 = nifVarArr.length;
        int[] iArr2 = new int[length2];
        int[] iArr3 = new int[length2];
        int i = 0;
        int i2 = 0;
        while (true) {
            length = nifVarArr.length;
            if (i2 >= length) {
                break;
            }
            ngc ngcVar = ngcVarArr[i2];
            Integer num = ngcVar == null ? null : (Integer) this.c.get(ngcVar);
            iArr2[i2] = num == null ? -1 : num.intValue();
            nif nifVar = nifVarArr[i2];
            if (nifVar != null) {
                String str = nifVar.c().b;
                iArr3[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i2] = -1;
            }
            i2++;
        }
        IdentityHashMap identityHashMap = this.c;
        identityHashMap.clear();
        nel[] nelVarArr = this.a;
        ngc[] ngcVarArr2 = new ngc[length];
        ngc[] ngcVarArr3 = new ngc[length];
        nif[] nifVarArr2 = new nif[length];
        ArrayList arrayList = new ArrayList(nelVarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < nelVarArr.length) {
            int i4 = i;
            while (i4 < nifVarArr.length) {
                ngcVarArr3[i4] = iArr2[i4] == i3 ? ngcVarArr[i4] : null;
                if (iArr3[i4] == i3) {
                    nif nifVar2 = nifVarArr[i4];
                    mee.f(nifVar2);
                    iArr = iArr3;
                    mcm mcmVar = (mcm) this.e.get(nifVar2.c());
                    mee.f(mcmVar);
                    nifVarArr2[i4] = new nfa(nifVar2, mcmVar);
                } else {
                    iArr = iArr3;
                    nifVarArr2[i4] = null;
                }
                i4++;
                iArr3 = iArr;
            }
            int[] iArr4 = iArr3;
            ArrayList arrayList2 = arrayList;
            int i5 = i3;
            long jH = nelVarArr[i3].h(nifVarArr2, zArr, ngcVarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jH;
            } else if (jH != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < nifVarArr.length; i6++) {
                if (iArr4[i6] == i5) {
                    ngc ngcVar2 = ngcVarArr3[i6];
                    mee.f(ngcVar2);
                    ngcVarArr2[i6] = ngcVarArr3[i6];
                    identityHashMap.put(ngcVar2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr2[i6] == i5) {
                    mee.c(ngcVarArr3[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(nelVarArr[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            iArr3 = iArr4;
            i = 0;
        }
        int i7 = i;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(ngcVarArr2, i7, ngcVarArr, i7, length);
        this.h = (nel[]) arrayList3.toArray(new nel[i7]);
        this.i = new nds(arrayList3, ekjz.g(arrayList3, new ejvr() { // from class: nez
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ekgb.n(ekjz.g(((nel) obj).i().c, new ejvr() { // from class: ngn
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        ngo ngoVar = ngo.a;
                        return Integer.valueOf(((mcm) obj2).c);
                    }
                }));
            }
        }));
        return j2;
    }

    @Override // defpackage.nel
    public final ngo i() {
        ngo ngoVar = this.g;
        mee.f(ngoVar);
        return ngoVar;
    }

    @Override // defpackage.nel
    public final void j() {
        int i = 0;
        while (true) {
            nel[] nelVarArr = this.a;
            if (i >= nelVarArr.length) {
                return;
            }
            nelVarArr[i].j();
            i++;
        }
    }

    @Override // defpackage.nel
    public final void k(nek nekVar, long j) {
        this.f = nekVar;
        ArrayList arrayList = this.d;
        nel[] nelVarArr = this.a;
        Collections.addAll(arrayList, nelVarArr);
        for (nel nelVar : nelVarArr) {
            nelVar.k(this, j);
        }
    }

    @Override // defpackage.nel, defpackage.nge
    public final void l(long j) {
        this.i.l(j);
    }

    public final nel m(int i) {
        return this.b[i] ? ((ngl) this.a[i]).a : this.a[i];
    }

    @Override // defpackage.nel, defpackage.nge
    public final boolean n(msd msdVar) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return this.i.n(msdVar);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((nel) arrayList.get(i)).n(msdVar);
        }
        return false;
    }

    @Override // defpackage.nel, defpackage.nge
    public final boolean o() {
        return this.i.o();
    }

    @Override // defpackage.nel
    public final void q(long j) {
        for (nel nelVar : this.h) {
            nelVar.q(j);
        }
    }
}
