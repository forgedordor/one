package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atxi extends cayv {
    public final atya a;
    public final asnl b;
    public final eosc c;

    public atxi(atya atyaVar, asnl asnlVar, eosc eoscVar) {
        this.a = atyaVar;
        this.b = asnlVar;
        this.c = eoscVar;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        pzh pzhVar = new pzh();
        pzhVar.c(2);
        ((caxk) caxzVarL).a = pzhVar.a();
        caxzVarL.c(((Integer) asow.b.e()).intValue());
        caxzVarL.f(((Boolean) ((cczi) asow.d.get()).e()).booleanValue() ? pza.a : pza.b);
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("IncomingRbmMessageRequestHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return aufh.b.getParserForType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(final cayy cayyVar, evuh evuhVar) {
        final aufh aufhVar = (aufh) evuhVar;
        aubq aubqVar = aufhVar.d;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        final String str = aubqVar.d;
        eyga eygaVar = aufhVar.l;
        if (eygaVar == null) {
            eygaVar = eyga.a;
        }
        eyge eygeVar = eyge.a;
        evub evubVar = eygaVar.b;
        if (evubVar.containsKey("urn:rcs:google:")) {
            eygeVar = (eyge) evubVar.get("urn:rcs:google:");
        }
        evub evubVar2 = eygeVar.b;
        String str2 = evubVar2.containsKey("Agent-Name") ? (String) evubVar2.get("Agent-Name") : "";
        final Optional optionalEmpty = str2.isEmpty() ? Optional.empty() : Optional.of(str2);
        return this.b.d(str).i(new eooz() { // from class: atxg
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                aufk aufkVar = (aufk) aufl.a.createBuilder();
                aufkVar.copyOnWrite();
                aufl auflVar = (aufl) aufkVar.instance;
                aufh aufhVar2 = aufhVar;
                aufhVar2.getClass();
                auflVar.c = aufhVar2;
                auflVar.b |= 1;
                boolean zC = cayyVar.c();
                aufkVar.copyOnWrite();
                aufl auflVar2 = (aufl) aufkVar.instance;
                auflVar2.b |= 2;
                auflVar2.d = zC;
                final aufl auflVar3 = (aufl) aufkVar.build();
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                final atxi atxiVar = this.a;
                String str3 = str;
                if (!zBooleanValue && optionalEmpty.isPresent()) {
                    cqbd cqbdVarC = atxi.E.c();
                    cqbdVarC.I("Business Info is missing and Bot Name header is present, postponing Business Info Download");
                    cqbdVarC.A("RBM bot id", str3);
                    cqbdVarC.r();
                    return atxiVar.a.a(auflVar3).h(new atxf(), eoqg.a);
                }
                asnl asnlVar = atxiVar.b;
                aufh aufhVar3 = auflVar3.c;
                if (aufhVar3 == null) {
                    aufhVar3 = aufh.b;
                }
                String str4 = aufhVar3.j;
                str3.getClass();
                str4.getClass();
                return asnlVar.f(new asnm(str3, 2, str4, null)).i(new eooz() { // from class: atxh
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        cbcw cbcwVar = (cbcw) obj2;
                        cbcwVar.getClass();
                        if (!cbcwVar.e()) {
                            return eijx.e(cbcwVar);
                        }
                        return atxiVar.a.a(auflVar3).h(new atxf(), eoqg.a);
                    }
                }, atxiVar.c);
            }
        }, this.c);
    }
}
