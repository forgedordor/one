package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nrt extends nqm {
    private final mfr a = new mfr();
    private final mfq b = new mfq();
    private mfy c;

    @Override // defpackage.nqm
    protected final mbt b(nql nqlVar, ByteBuffer byteBuffer) {
        mbs nrwVar;
        long j;
        mfy mfyVar = this.c;
        if (mfyVar == null || nqlVar.h != mfyVar.f()) {
            mfy mfyVar2 = new mfy(nqlVar.f);
            this.c = mfyVar2;
            mfyVar2.a(nqlVar.f - nqlVar.h);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        mfr mfrVar = this.a;
        mfrVar.I(bArrArray, iLimit);
        mfq mfqVar = this.b;
        mfqVar.k(bArrArray, iLimit);
        mfqVar.n(39);
        long jD = mfqVar.d(1);
        long jD2 = mfqVar.d(32);
        mfqVar.n(20);
        int iD = mfqVar.d(12);
        int iD2 = mfqVar.d(8);
        mfrVar.L(14);
        long j2 = (jD << 32) | jD2;
        if (iD2 == 0) {
            nrwVar = new nrw();
        } else if (iD2 == 255) {
            int i = iD - 4;
            long jR = mfrVar.r();
            mfrVar.F(new byte[i], 0, i);
            nrwVar = new nrr(jR, j2);
        } else if (iD2 == 4) {
            int iJ = mfrVar.j();
            ArrayList arrayList = new ArrayList(iJ);
            for (int i2 = 0; i2 < iJ; i2++) {
                mfrVar.r();
                int iJ2 = mfrVar.j() & 128;
                ArrayList arrayList2 = new ArrayList();
                if (iJ2 == 0) {
                    int iJ3 = mfrVar.j();
                    int i3 = iJ3 & 64;
                    int i4 = iJ3 & 32;
                    if (i3 != 0) {
                        mfrVar.r();
                    } else {
                        int iJ4 = mfrVar.j();
                        ArrayList arrayList3 = new ArrayList(iJ4);
                        for (int i5 = 0; i5 < iJ4; i5++) {
                            mfrVar.j();
                            mfrVar.r();
                            arrayList3.add(new nrx());
                        }
                        arrayList2 = arrayList3;
                    }
                    if (i4 != 0) {
                        mfrVar.j();
                        mfrVar.r();
                    }
                    mfrVar.n();
                    mfrVar.j();
                    mfrVar.j();
                }
                arrayList.add(new nry(arrayList2));
            }
            nrwVar = new nrz(arrayList);
        } else if (iD2 == 5) {
            mfy mfyVar3 = this.c;
            mfrVar.r();
            int iJ5 = mfrVar.j() & 128;
            List list = Collections.EMPTY_LIST;
            if (iJ5 == 0) {
                int iJ6 = mfrVar.j();
                boolean z = (iJ6 & 64) != 0;
                int i6 = iJ6 & 32;
                boolean z2 = (iJ6 & 16) != 0;
                long jD3 = (!z || z2) ? -9223372036854775807L : nsa.d(mfrVar, j2);
                if (!z) {
                    int iJ7 = mfrVar.j();
                    ArrayList arrayList4 = new ArrayList(iJ7);
                    for (int i7 = 0; i7 < iJ7; i7++) {
                        mfrVar.j();
                        mfyVar3.b(!z2 ? nsa.d(mfrVar, j2) : -9223372036854775807L);
                        arrayList4.add(new nru());
                    }
                    list = arrayList4;
                }
                if (i6 != 0) {
                    mfrVar.j();
                    mfrVar.r();
                }
                mfrVar.n();
                mfrVar.j();
                mfrVar.j();
                j = jD3;
            } else {
                j = -9223372036854775807L;
            }
            nrwVar = new nrv(j, mfyVar3.b(j), list);
        } else if (iD2 != 6) {
            nrwVar = null;
        } else {
            mfy mfyVar4 = this.c;
            long jD4 = nsa.d(mfrVar, j2);
            nrwVar = new nsa(jD4, mfyVar4.b(jD4));
        }
        return nrwVar == null ? new mbt(new mbs[0]) : new mbt(nrwVar);
    }
}
