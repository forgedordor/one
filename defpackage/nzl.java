package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nzl implements nze {
    final /* synthetic */ nzn a;
    private final mfq b = new mfq(new byte[4]);

    public nzl(nzn nznVar) {
        this.a = nznVar;
    }

    @Override // defpackage.nze
    public final void a(mfr mfrVar) {
        if (mfrVar.j() == 0 && (mfrVar.j() & 128) != 0) {
            mfrVar.L(6);
            int iA = mfrVar.a() / 4;
            for (int i = 0; i < iA; i++) {
                mfq mfqVar = this.b;
                mfrVar.E(mfqVar, 4);
                int iD = mfqVar.d(16);
                mfqVar.n(3);
                if (iD == 0) {
                    mfqVar.n(13);
                } else {
                    int iD2 = mfqVar.d(13);
                    nzn nznVar = this.a;
                    SparseArray sparseArray = nznVar.b;
                    if (sparseArray.get(iD2) == null) {
                        sparseArray.put(iD2, new nzf(new nzm(nznVar, iD2)));
                        nznVar.f++;
                    }
                }
            }
            this.a.b.remove(0);
        }
    }

    @Override // defpackage.nze
    public final void b(mfy mfyVar, nnu nnuVar, nzq nzqVar) {
    }
}
