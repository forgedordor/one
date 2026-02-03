package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekk implements eni {
    private final emi a;

    public ekk(emi emiVar) {
        this.a = emiVar;
    }

    @Override // defpackage.eni
    public final int a() {
        return this.a.b();
    }

    @Override // defpackage.eni
    public final int b() {
        return this.a.d().d();
    }

    @Override // defpackage.eni
    public final int c() {
        return ((eln) fcva.S(this.a.d().i())).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eni
    public final int d() {
        long j;
        long j2;
        emi emiVar = this.a;
        int i = 0;
        if (emiVar.d().i().isEmpty()) {
            return 0;
        }
        elf elfVarD = emiVar.d();
        dwm dwmVarH = elfVarD.h();
        dwm dwmVar = dwm.a;
        long j3 = 4294967295L;
        int iG = (int) (dwmVarH == dwmVar ? elfVarD.g() & 4294967295L : elfVarD.g() >> 32);
        elf elfVarD2 = emiVar.d();
        dwm dwmVarH2 = elfVarD2.h();
        List listI = elfVarD2.i();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i2 >= listI.size()) {
                break;
            }
            boolean z = dwmVarH2 != dwmVar ? i : 1;
            int iA = elg.a(z, elfVarD2, i2);
            if (iA == -1) {
                i2++;
            } else {
                int iMax = i;
                while (i2 < listI.size() && elg.a(z, elfVarD2, i2) == iA) {
                    if (z != 0) {
                        j = j3;
                        j2 = ((eln) listI.get(i2)).j & j;
                    } else {
                        j = j3;
                        j2 = ((eln) listI.get(i2)).j >> 32;
                    }
                    iMax = Math.max(iMax, (int) j2);
                    i2++;
                    j3 = j;
                }
                i3 += iMax;
                i4++;
                j3 = j3;
                i = 0;
            }
        }
        int iC = (i3 / i4) + elfVarD2.c();
        if (iC == 0) {
            return 1;
        }
        return fddu.f(iG / iC, 1);
    }

    @Override // defpackage.eni
    public final boolean e() {
        return !this.a.d().i().isEmpty();
    }
}
