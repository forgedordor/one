package defpackage;

import android.util.Base64;
import java.io.UnsupportedEncodingException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aboz extends abot {
    final /* synthetic */ abpk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aboz(abpk abpkVar, abou abouVar) {
        super(abpkVar, abouVar);
        this.c = abpkVar;
    }

    @Override // defpackage.abot
    public final void a(String str, final abpg abpgVar) {
        cqce cqceVar = abpk.a;
        try {
            if (str == null) {
                throw new IllegalStateException("Cannot decode empty data.");
            }
            final eppi eppiVar = (eppi) evsn.parseFrom(eppi.a, Base64.decode(str.getBytes("UTF-8"), 0), evrr.a());
            final eppj eppjVar = (eppj) eppl.a.createBuilder();
            String str2 = eppiVar.d;
            eppjVar.copyOnWrite();
            eppl epplVar = (eppl) eppjVar.instance;
            str2.getClass();
            epplVar.d = str2;
            abpk abpkVar = this.c;
            ((abdl) abpkVar.g.b()).d(eppiVar.d, epph.b(epph.c(eppiVar.b)));
            eiju eijuVarA = abpgVar.a().a(eppiVar, eppjVar);
            ejvr ejvrVar = new ejvr() { // from class: abox
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    eppl epplVar2 = (eppl) obj;
                    if (epplVar2 == null) {
                        throw new abpl(exmt.UNAVAILABLE, "Received a null response from the handler");
                    }
                    abpg abpgVar2 = abpgVar;
                    aboz abozVar = this.a;
                    String strA = abpk.a(epplVar2);
                    cqbd cqbdVarC = abpk.a.c();
                    cqbdVarC.I("Sending JsBridge response to Ditto");
                    cqbdVarC.A("payloadCase", eppk.a(epplVar2.b));
                    cqbdVarC.y("length", strA.length());
                    cqbdVarC.r();
                    abpgVar2.b().a(strA);
                    ((abdl) abozVar.c.g.b()).j(epplVar2.d, eppk.a(epplVar2.b).B);
                    return true;
                }
            };
            eosd eosdVar = abpkVar.e;
            eijuVarA.h(ejvrVar, eosdVar).e(Exception.class, new ejvr() { // from class: aboy
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    Exception exc = (Exception) obj;
                    boolean z = exc instanceof abpl;
                    eppj eppjVar2 = eppjVar;
                    aboz abozVar = this.a;
                    abpg abpgVar2 = abpgVar;
                    if (z) {
                        abozVar.c.c((abpl) exc, eppjVar2, abpgVar2);
                    } else if (exc == null || !(exc.getCause() instanceof abpl)) {
                        eppi eppiVar2 = eppiVar;
                        abpk.a.s("Unknown exception when handling JsBridge request", exc);
                        abdl abdlVar = (abdl) abozVar.c.g.b();
                        String str3 = eppiVar2.d;
                        int iB = epph.b(epph.c(eppiVar2.b));
                        exmt exmtVar = exmt.UNKNOWN;
                        abdlVar.i(str3, iB, exmtVar);
                        try {
                            abqi abqiVarB = abpgVar2.b();
                            eppjVar2.copyOnWrite();
                            eppl epplVar2 = (eppl) eppjVar2.instance;
                            eppl epplVar3 = eppl.a;
                            epplVar2.e = exmtVar.a();
                            eppjVar2.copyOnWrite();
                            ((eppl) eppjVar2.instance).f = "Unknown Error";
                            abqiVarB.a(abpk.a(eppjVar2.build()));
                        } catch (abpv e) {
                            abpk.a.s("Could not send reply to Ditto. Channel has closed", e);
                        }
                    } else {
                        abozVar.c.c((abpl) exc.getCause(), eppjVar2, abpgVar2);
                    }
                    return false;
                }
            }, eosdVar).k(auvh.b(), eosdVar);
        } catch (evtj e) {
            throw new IllegalStateException("Could not parse SatelliteBridgeRequest proto", e);
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalStateException("Could not decode Satellite Bridge Request", e2);
        }
    }
}
