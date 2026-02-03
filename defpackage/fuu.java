package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fuu implements fdax {
    final /* synthetic */ fdat a;
    final /* synthetic */ boolean b;
    final /* synthetic */ fdat c;
    final /* synthetic */ ikp d;
    final /* synthetic */ fdat e;
    final /* synthetic */ egc f;
    final /* synthetic */ boolean g;
    final /* synthetic */ fdat h;
    final /* synthetic */ foz i;
    final /* synthetic */ int j;

    public fuu(fdat fdatVar, foz fozVar, boolean z, fdat fdatVar2, ikp ikpVar, int i, fdat fdatVar3, egc egcVar, boolean z2, fdat fdatVar4) {
        this.a = fdatVar;
        this.i = fozVar;
        this.b = z;
        this.c = fdatVar2;
        this.d = ikpVar;
        this.j = i;
        this.e = fdatVar3;
        this.f = egcVar;
        this.g = z2;
        this.h = fdatVar4;
    }

    @Override // defpackage.fdax
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i;
        hwv hwvVarD;
        final float fFloatValue = ((Number) obj).floatValue();
        long j = ((ije) obj2).i;
        long j2 = ((ije) obj3).i;
        float fFloatValue2 = ((Number) obj4).floatValue();
        hml hmlVar = (hml) obj5;
        int iIntValue = ((Number) obj6).intValue();
        if ((iIntValue & 6) == 0) {
            i = (true != hmlVar.A(fFloatValue) ? 2 : 4) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= true != hmlVar.C(j) ? 16 : 32;
        }
        if ((iIntValue & 384) == 0) {
            i |= true != hmlVar.C(j2) ? 128 : 256;
        }
        if ((iIntValue & 3072) == 0) {
            i |= true != hmlVar.A(fFloatValue2) ? 1024 : 2048;
        }
        int i2 = i;
        if ((i2 & 9363) == 9362 && hmlVar.I()) {
            hmlVar.s();
        } else {
            int i3 = i2 << 21;
            fdat fdatVar = this.a;
            hmlVar.v(986681679);
            hwv hwvVarD2 = hxe.d(723429411, new fur(fFloatValue, j2, fdatVar, this.g, j), hmlVar);
            hmlVar.o();
            hmlVar.v(988091558);
            hmlVar.o();
            foz fozVar = this.i;
            boolean z = this.b;
            hmlVar.v(-1519634405);
            hsf hsfVarA = hsc.a(new ije(!z ? fozVar.e : fozVar.d), hmlVar);
            hmlVar.o();
            long j3 = ((ije) hsfVarA.a()).i;
            hmlVar.v(988280317);
            hmlVar.o();
            hmlVar.v(1383318157);
            hsf hsfVarA2 = hsc.a(new ije(!z ? fozVar.g : fozVar.f), hmlVar);
            hmlVar.o();
            long j4 = ((ije) hsfVarA2.a()).i;
            fdat fdatVar2 = this.c;
            if (fdatVar2 == null) {
                hmlVar.v(988573980);
                hmlVar.o();
                hwvVarD = null;
            } else {
                hmlVar.v(988573981);
                hwvVarD = hxe.d(262889693, new fus(j4, fdatVar2), hmlVar);
                hmlVar.o();
            }
            ico icoVar = ics.e;
            hmlVar.v(-1423938813);
            hsf hsfVarA3 = hsc.a(new ije(fozVar.h), hmlVar);
            hmlVar.o();
            ics icsVarA = dkl.a(icoVar, ((ije) hsfVarA3.a()).i, this.d);
            if (this.j - 1 != 0) {
                int i4 = i3 & 29360128;
                hmlVar.v(989433704);
                Object objF = hmlVar.f();
                Object obj7 = hmk.a;
                if (objF == obj7) {
                    hpl hplVar = new hpl(new ihz(0L), hsi.a);
                    hmlVar.y(hplVar);
                    objF = hplVar;
                }
                egc egcVar = this.f;
                final hox hoxVar = (hox) objF;
                hwv hwvVarD3 = hxe.d(-1107746014, new fut(hoxVar, egcVar, this.h), hmlVar);
                fdat fdatVar3 = this.e;
                int i5 = i2 & 14;
                Object objF2 = hmlVar.f();
                if (i5 == 4 || objF2 == obj7) {
                    objF2 = new fdap() { // from class: fuq
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj8) {
                            long j5 = ((ihz) obj8).a;
                            float fC = ihz.c(j5);
                            float f = fFloatValue;
                            float f2 = fC * f;
                            float fA = ihz.a(j5) * f;
                            hox hoxVar2 = hoxVar;
                            if (ihz.c(((ihz) hoxVar2.a()).a) != f2 || ihz.a(((ihz) hoxVar2.a()).a) != fA) {
                                hoxVar2.b(new ihz(iia.a(f2, fA)));
                            }
                            return fctx.a;
                        }
                    };
                    hmlVar.y(objF2);
                }
                frk.d(icsVarA, fdatVar3, hwvVarD2, hwvVarD, fFloatValue, (fdap) objF2, hwvVarD3, egcVar, hmlVar, i4 | 805306368, 0);
                hmlVar.o();
            } else {
                hmlVar.v(988854345);
                fvd.d(icsVarA, this.e, hwvVarD2, hwvVarD, fFloatValue, this.f, hmlVar, i3 & 29360128);
                hmlVar.o();
            }
        }
        return fctx.a;
    }
}
