package defpackage;

import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
final class npv extends npz {
    private static final int[] a = {5512, 11025, 22050, 44100};
    private boolean b;
    private boolean c;
    private int e;

    public npv(nox noxVar) {
        super(noxVar);
    }

    @Override // defpackage.npz
    protected final boolean a(mfr mfrVar) throws npy {
        if (this.b) {
            mfrVar.L(1);
        } else {
            int iJ = mfrVar.j();
            int i = iJ >> 4;
            this.e = i;
            if (i == 2) {
                int i2 = a[(iJ >> 2) & 3];
                mat matVar = new mat();
                matVar.a("video/x-flv");
                matVar.c("audio/mpeg");
                matVar.E = 1;
                matVar.F = i2;
                this.d.i(new mau(matVar));
                this.c = true;
            } else if (i == 7 || i == 8) {
                mat matVar2 = new mat();
                matVar2.a("video/x-flv");
                matVar2.c(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                matVar2.E = 1;
                matVar2.F = 8000;
                this.d.i(new mau(matVar2));
                this.c = true;
            } else if (i != 10) {
                throw new npy(a.g(i, "Audio format not supported: "));
            }
            this.b = true;
        }
        return true;
    }

    @Override // defpackage.npz
    protected final boolean b(mfr mfrVar, long j) {
        if (this.e == 2) {
            int iA = mfrVar.a();
            nox noxVar = this.d;
            noxVar.m(mfrVar, iA);
            noxVar.o(j, 1, iA, 0, null);
            return true;
        }
        int iJ = mfrVar.j();
        if (iJ != 0 || this.c) {
            if (this.e == 10 && iJ != 1) {
                return false;
            }
            int iA2 = mfrVar.a();
            nox noxVar2 = this.d;
            noxVar2.m(mfrVar, iA2);
            noxVar2.o(j, 1, iA2, 0, null);
            return true;
        }
        int iA3 = mfrVar.a();
        byte[] bArr = new byte[iA3];
        mfrVar.F(bArr, 0, iA3);
        nmr nmrVarA = nms.a(bArr);
        mat matVar = new mat();
        matVar.a("video/x-flv");
        matVar.c("audio/mp4a-latm");
        matVar.j = nmrVarA.c;
        matVar.E = nmrVarA.b;
        matVar.F = nmrVarA.a;
        matVar.p = Collections.singletonList(bArr);
        this.d.i(new mau(matVar));
        this.c = true;
        return false;
    }
}
