package defpackage;

import j$.util.Optional;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cepj implements cepg {
    public final Optional a;
    public final Optional b;
    public final Optional c;
    public final fcsu d;
    private final fcsu e;

    public cepj(fcsu fcsuVar, Optional optional, Optional optional2, Optional optional3, fcsu fcsuVar2) {
        fcsuVar.getClass();
        optional.getClass();
        optional2.getClass();
        fcsuVar2.getClass();
        this.e = fcsuVar;
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = fcsuVar2;
    }

    @Override // defpackage.cepg
    public final cepf a(final ezol ezolVar) throws IOException {
        ezolVar.getClass();
        cepf cepfVar = null;
        if (!this.a.isEmpty() && !this.b.isEmpty()) {
            cepe cepeVar = (cepe) this.e.b();
            fdat fdatVar = new fdat() { // from class: ceph
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ceog ceogVar = (ceog) obj;
                    cepb cepbVar = (cepb) obj2;
                    ceogVar.getClass();
                    cepbVar.getClass();
                    cepj cepjVar = this.a;
                    cepn cepnVar = new cepn((eywd) cepjVar.a.get(), (eywc) cepjVar.b.get(), Optional.of(ceogVar), cepbVar);
                    if (!((Boolean) cepjVar.d.b()).booleanValue()) {
                        return cepnVar;
                    }
                    ezol ezolVar2 = ezolVar;
                    Optional optional = cepjVar.c;
                    optional.isPresent();
                    cfsi cfsiVar = (cfsi) optional.get();
                    eywd eywdVar = (eywd) cfsiVar.a.b();
                    eywdVar.getClass();
                    eywc eywcVar = (eywc) cfsiVar.b.b();
                    eywcVar.getClass();
                    cepb cepbVar2 = (cepb) cfsiVar.c.b();
                    cepbVar2.getClass();
                    return new cfsh(eywdVar, eywcVar, cepbVar2, ceogVar, ezolVar2, cepnVar);
                }
            };
            eieu eieuVarH = eiiy.h("GrpcProxyFactory#createWithChannelConfiguration");
            try {
                dggl dgglVar = (dggl) cepeVar.b.b();
                String str = ezolVar.c;
                str.getClass();
                ceog ceogVarA = ((cepu) cepeVar.a.b()).a(dgglVar.a(str));
                cepb cepbVar = (cepb) cepeVar.c.b();
                cepbVar.getClass();
                Object objA = fdatVar.a(ceogVarA, cepbVar);
                fczl.a(eieuVarH, null);
                cepfVar = (cepf) objA;
            } finally {
            }
        }
        return cepfVar == null ? (cepf) ((cepe) this.e.b()).a(ezolVar, cepi.a) : cepfVar;
    }
}
