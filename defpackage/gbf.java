package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbf {
    public final float a;

    public gbf(float f) {
        this.a = f;
    }

    public final hsf a(boolean z, ebk ebkVar, hml hmlVar, int i) {
        ddp ddpVar;
        hmlVar.v(-1763481333);
        float f = 0.0f;
        if (ebkVar == null) {
            hmlVar.v(167750219);
            hmw hmwVar = (hmw) hmlVar;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                hpl hplVar = new hpl(new kir(0.0f), hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            hox hoxVar = (hox) objS;
            hmwVar.ab();
            hmwVar.ab();
            return hoxVar;
        }
        hmlVar.v(167823255);
        hmw hmwVar2 = (hmw) hmlVar;
        hmwVar2.ab();
        Object objS2 = hmwVar2.S();
        Object obj = hmk.a;
        if (objS2 == obj) {
            objS2 = new iac();
            hmwVar2.af(objS2);
        }
        iac iacVar = (iac) objS2;
        boolean z2 = (((i & 112) ^ 48) > 32 && hmlVar.D(ebkVar)) || (i & 48) == 32;
        Object objS3 = hmwVar2.S();
        if (z2 || objS3 == obj) {
            objS3 = new gbd(ebkVar, iacVar, null);
            hmwVar2.af(objS3);
        }
        hob.g(ebkVar, (fdat) objS3, hmlVar);
        ebj ebjVar = (ebj) fcva.T(iacVar);
        if (z && !(ebjVar instanceof ebm)) {
            if (ebjVar instanceof ebh) {
                f = this.a;
            } else if (!(ebjVar instanceof ebc) && (ebjVar instanceof eba)) {
                f = 6.0f;
            }
        }
        Object objS4 = hmwVar2.S();
        if (objS4 == obj) {
            objS4 = new ddp(new kir(f), diu.c, null, 12);
            hmwVar2.af(objS4);
        }
        ddp ddpVar2 = (ddp) objS4;
        kir kirVar = new kir(f);
        boolean zF = hmlVar.F(ddpVar2) | hmlVar.A(f) | ((((i & 14) ^ 6) > 4 && hmlVar.E(z)) || (i & 6) == 4) | ((((i & 896) ^ 384) > 256 && hmlVar.D(this)) || (i & 384) == 256) | hmlVar.F(ebjVar);
        Object objS5 = hmwVar2.S();
        if (zF || objS5 == obj) {
            ddpVar = ddpVar2;
            gbe gbeVar = new gbe(ddpVar, f, z, this, ebjVar, null);
            hmwVar2.af(gbeVar);
            objS5 = gbeVar;
        } else {
            ddpVar = ddpVar2;
        }
        hob.g(kirVar, (fdat) objS5, hmlVar);
        deb debVar = ddpVar.a;
        hmwVar2.ab();
        return debVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof gbf)) {
            return false;
        }
        return kir.b(0.0f, 0.0f) && kir.b(0.0f, 0.0f) && kir.b(0.0f, 0.0f) && kir.b(this.a, ((gbf) obj).a) && kir.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(0.0f) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(this.a)) * 31) + Float.floatToIntBits(0.0f);
    }
}
