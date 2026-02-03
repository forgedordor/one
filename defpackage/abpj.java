package defpackage;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abpj extends abot {
    final /* synthetic */ abpk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abpj(abpk abpkVar, abou abouVar) {
        super(abpkVar, abouVar);
        this.c = abpkVar;
    }

    @Override // defpackage.abot
    public final void a(String str, abpg abpgVar) {
        kog kogVar;
        if (str == null || str.equals("stl_open_port")) {
            return;
        }
        cqce cqceVar = abpk.a;
        try {
            eppl epplVar = (eppl) evsn.parseFrom(eppl.a, Base64.decode(str.getBytes("UTF-8"), 0), evrr.a());
            Map map = this.c.j;
            synchronized (map) {
                kogVar = (kog) map.remove(epplVar.d);
            }
            if (kogVar == null) {
                cqbd cqbdVarE = abpk.a.e();
                cqbdVarE.I("Received a Ditto response with no associated request");
                cqbdVarE.A("payloadCase", eppk.a(epplVar.b));
                cqbdVarE.A("requestId", epplVar.d);
                cqbdVarE.r();
                return;
            }
            int i = epplVar.e;
            exmt exmtVarB = exmt.b(i);
            if (exmtVarB == null) {
                exmtVarB = exmt.UNRECOGNIZED;
            }
            if (exmtVarB != exmt.UNKNOWN) {
                exmt exmtVarB2 = exmt.b(i);
                if (exmtVarB2 == null) {
                    exmtVarB2 = exmt.UNRECOGNIZED;
                }
                if (exmtVarB2 != exmt.OK) {
                    kogVar.c(new abph(epplVar.f));
                    abdl abdlVar = (abdl) this.c.g.b();
                    String str2 = epplVar.d;
                    int i2 = eppk.a(epplVar.b).B;
                    exmt exmtVarB3 = exmt.b(epplVar.e);
                    if (exmtVarB3 == null) {
                        exmtVarB3 = exmt.UNRECOGNIZED;
                    }
                    abdlVar.e(str2, i2, exmtVarB3);
                    return;
                }
            }
            kogVar.b(epplVar);
            ((abdl) this.c.g.b()).f(epplVar.d, eppk.a(epplVar.b).B);
        } catch (evtj e) {
            throw new IllegalStateException("Could not parse SatelliteBridgeRequest proto", e);
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalStateException("Could not decode Satellite Bridge Request", e2);
        }
    }
}
