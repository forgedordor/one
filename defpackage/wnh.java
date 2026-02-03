package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wnh implements wms {
    private final wnf a;
    private final wng b;
    private final wna c;
    private final wmz d;
    private final wnm e;
    private final wmw f;

    public wnh(wnf wnfVar, wng wngVar, wna wnaVar, wmz wmzVar, wnm wnmVar, wmw wmwVar) {
        this.a = wnfVar;
        this.b = wngVar;
        this.c = wnaVar;
        this.d = wmzVar;
        this.e = wnmVar;
        this.f = wmwVar;
    }

    @Override // defpackage.wms
    public final Object a(vvr vvrVar, wmv wmvVar, String str, fcxy fcxyVar) {
        wms wmsVar;
        dltd dltdVar = vvrVar.a;
        if (!(dltdVar instanceof dohs)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        dohs dohsVar = (dohs) dltdVar;
        if (dohsVar instanceof dojr) {
            wmsVar = this.a;
        } else if (dohsVar instanceof doju) {
            wmsVar = this.b;
        } else if (dohsVar instanceof dojp) {
            wmsVar = this.c;
        } else if (dohsVar instanceof dnyz) {
            wmsVar = this.d;
        } else if (dohsVar instanceof doyt) {
            wmsVar = this.e;
        } else {
            if (!(dohsVar instanceof dnvg)) {
                Objects.toString(dohsVar);
                throw new UnsupportedOperationException("Unsupported media: ".concat(dohsVar.toString()));
            }
            wmsVar = this.f;
        }
        return wmsVar.a(vvrVar, wmvVar, str, fcxyVar);
    }
}
