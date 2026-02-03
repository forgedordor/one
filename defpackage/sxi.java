package defpackage;

import android.net.Uri;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sxi extends fcyz implements fdat {
    int a;
    final /* synthetic */ sxp b;
    final /* synthetic */ sxk c;
    final /* synthetic */ cayy d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sxi(fcxy fcxyVar, sxp sxpVar, sxk sxkVar, cayy cayyVar) {
        super(2, fcxyVar);
        this.b = sxpVar;
        this.c = sxkVar;
        this.d = cayyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sxi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                eksl ekslVar = (eksl) sxl.a.h();
                sxp sxpVar = this.b;
                ekslVar.t("Transcription started, %s.", sxpVar.c);
                sxk sxkVar = this.c;
                sxkVar.b(sxpVar, aonp.VMT_STATUS_IN_PROGRESS, null);
                sxe sxeVar = sxkVar.a;
                Uri uri = Uri.parse(sxpVar.c);
                uri.getClass();
                String str = sxpVar.d;
                str.getClass();
                this.a = 1;
                obj = fdin.a(eicg.a(sxeVar.a), new swz(null, sxeVar, uri, str), this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            sxg sxgVar = (sxg) obj;
            sxk sxkVar2 = this.c;
            sxp sxpVar2 = this.b;
            aonp aonpVar = aonp.VMT_STATUS_COMPLETE;
            String str2 = sxgVar.b;
            sxkVar2.b(sxpVar2, aonpVar, str2);
            sty styVar = sxkVar2.b;
            int iA = sxo.a(sxpVar2.g);
            if (iA == 0) {
                iA = 1;
            }
            int i = ((caxm) this.d.a()).c;
            sxgVar.getClass();
            eocw eocwVar = (eocw) eocx.a.createBuilder();
            eocwVar.getClass();
            eodb eodbVar = (eodb) eodc.a.createBuilder();
            eodbVar.getClass();
            int iB = sty.b(sxgVar.c);
            eodbVar.copyOnWrite();
            eodc eodcVar = (eodc) eodbVar.instance;
            eodcVar.b |= 1;
            eodcVar.c = iB;
            boolean zH = fdgn.H(str2);
            eodbVar.copyOnWrite();
            eodc eodcVar2 = (eodc) eodbVar.instance;
            eodcVar2.b |= 2;
            eodcVar2.d = zH;
            evsn evsnVarBuild = eodbVar.build();
            evsnVarBuild.getClass();
            eocwVar.copyOnWrite();
            eocx eocxVar = (eocx) eocwVar.instance;
            eocxVar.d = (eodc) evsnVarBuild;
            eocxVar.c = 1;
            eoct eoctVar = (eoct) eocu.a.createBuilder();
            eoctVar.getClass();
            svz svzVar = sxgVar.a;
            eocv.b(sty.b(svzVar.c), eoctVar);
            eocv.d(svzVar.a, eoctVar);
            eocv.e(sty.c(svzVar.b), eoctVar);
            eocv.c(svzVar.d, eoctVar);
            eocy.c(eocv.a(eoctVar), eocwVar);
            eocy.d(sty.d(iA), eocwVar);
            eocy.b(i, eocwVar);
            styVar.a(eocy.a(eocwVar));
            ((eksl) sxl.a.h()).t("Transcription completed, %s.", sxpVar2.c);
            return cbcw.i();
        } catch (sxf e) {
            sxk sxkVar3 = this.c;
            sxp sxpVar3 = this.b;
            int iA2 = sxo.a(sxpVar3.g);
            if (iA2 == 0) {
                iA2 = 1;
            }
            cayy cayyVar = this.d;
            int i2 = ((caxm) cayyVar.a()).c;
            eocw eocwVar2 = (eocw) eocx.a.createBuilder();
            eocwVar2.getClass();
            eocz eoczVar = (eocz) eoda.a.createBuilder();
            eoczVar.getClass();
            if (e.getCause() instanceof swj) {
                Throwable cause = e.getCause();
                cause.getClass();
                int i3 = ((swj) cause).a;
                eoczVar.copyOnWrite();
                eoda eodaVar = (eoda) eoczVar.instance;
                eodaVar.b = 1 | eodaVar.b;
                eodaVar.c = i3;
            }
            evsn evsnVarBuild2 = eoczVar.build();
            evsnVarBuild2.getClass();
            eocwVar2.copyOnWrite();
            eocx eocxVar2 = (eocx) eocwVar2.instance;
            eocxVar2.d = (eoda) evsnVarBuild2;
            eocxVar2.c = 2;
            svz svzVar2 = e.a;
            if (svzVar2 != null) {
                eoct eoctVar2 = (eoct) eocu.a.createBuilder();
                eoctVar2.getClass();
                eocv.b(sty.b(svzVar2.c), eoctVar2);
                eocv.d(svzVar2.a, eoctVar2);
                eocv.e(sty.c(svzVar2.b), eoctVar2);
                eocv.c(svzVar2.d, eoctVar2);
                eocy.c(eocv.a(eoctVar2), eocwVar2);
            }
            sty styVar2 = sxkVar3.b;
            eocy.d(sty.d(iA2), eocwVar2);
            eocy.b(i2, eocwVar2);
            styVar2.a(eocy.a(eocwVar2));
            if ((e.getCause() instanceof IOException) || (e.getCause() instanceof IllegalStateException)) {
                ((eksl) ((eksl) sxl.a.j()).g(e)).t("Transcription failed, permanent error, %s.", sxpVar3.c);
                sxkVar3.b(sxpVar3, aonp.VMT_STATUS_ERROR_PERMANENT, null);
                return cbcw.k();
            }
            if (!cayyVar.c()) {
                Throwable cause2 = e.getCause();
                swj swjVar = cause2 instanceof swj ? (swj) cause2 : null;
                if (swjVar != null && swjVar.a == 8) {
                    ((eksl) ((eksl) sxl.a.j()).g(e)).t("Transcription failed, temporary error, %s.", sxpVar3.c);
                    sxkVar3.b(sxpVar3, aonp.VMT_STATUS_ERROR_TEMPORARY, null);
                    return cbcw.k();
                }
            }
            if (cayyVar.c()) {
                return cbcw.m();
            }
            ((eksl) ((eksl) sxl.a.j()).g(e)).t("Transcription failed, unclassified error, %s.", sxpVar3.c);
            sxkVar3.b(sxpVar3, aonp.VMT_STATUS_ERROR_UNKNOWN, null);
            return cbcw.k();
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        sxi sxiVar = new sxi(fcxyVar, this.b, this.c, this.d);
        sxiVar.e = obj;
        return sxiVar;
    }
}
