package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Message;
import j$.util.Optional;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgmf extends dgmn {
    final /* synthetic */ dgng a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgmf(dgng dgngVar) {
        super(dgngVar);
        this.a = dgngVar;
    }

    @Override // defpackage.dgop, defpackage.dfmy
    public final String a() {
        return "RequestWithoutAuthState";
    }

    @Override // defpackage.dgmn, defpackage.dfmy
    public final void b() {
        super.b();
        try {
            ewrp ewrpVar = ewrp.RCS_PROVISIONING_REQUEST_WITHOUT_AUTH_STATE;
            dgng dgngVar = this.a;
            ckiz ckizVarI = ckja.i(ewrpVar, Optional.ofNullable(dgngVar.l));
            String strS = dgngVar.s();
            dgnj dgnjVar = dgngVar.q;
            Context context = dgngVar.m;
            String str = dgngVar.h;
            String str2 = dgngVar.j;
            dgiq dgiqVarF = dgnjVar.b.f(str);
            dgti dgtiVarA = dgnjVar.a(context, str2, str);
            try {
                dgtk dgtkVar = dgnjVar.a;
                Optional optionalOf = Optional.of(ckizVarI);
                dhja.o("Using network authenticated config server query", new Object[0]);
                ckiz ckizVar = (ckiz) optionalOf.orElse(dgtk.a());
                ckizVar.f(dgtk.b(dgtk.f(strS, dgiqVarF, dgtiVarA, new dgtj(Build.MANUFACTURER, Build.MODEL, Build.VERSION.RELEASE), ckizVar).build().toString()));
            } catch (IOException e) {
                dhja.i(e, "Error while building ACS URL", new Object[0]);
            }
            dgng dgngVar2 = this.a;
            List listT = dgngVar2.t();
            ckizVarI.k("Cookie", dgif.a(listT));
            dgnj dgnjVar2 = dgngVar2.q;
            String str3 = dgngVar2.j;
            String str4 = dgngVar2.h;
            String strC = dgnjVar2.c(str3, str4);
            dgjw dgjwVarI = dgjx.i();
            dgjwVarI.c(strC);
            ((dgjr) dgjwVarI).e = Optional.ofNullable(dgngVar2.l);
            dgng.an(dgjwVarI, listT);
            if (dgngVar2.Y.c(str4).N) {
                dgngVar2.F.b(dgjwVarI.a(), ckizVarI);
            }
            dgngVar2.N(dgib.MSG_SEND_CONFIG_REQUEST, ckizVarI.j());
        } catch (MalformedURLException e2) {
            dgng dgngVar3 = this.a;
            ewrp ewrpVar2 = ewrp.RCS_PROVISIONING_REQUEST_WITHOUT_AUTH_STATE;
            dgngVar3.H(ewrpVar2);
            dgngVar3.z.e("Failed to request without authentication when building query. MalformedUrl encountered. %s", dhiz.URI.c(e2));
            dgngVar3.G(ewrpVar2);
        }
    }

    @Override // defpackage.dgmn
    public final dgib f() {
        return dgib.MSG_TRANSITION_TO_REQUEST_WITHOUT_AUTH;
    }

    @Override // defpackage.dgmn
    public final ewrp g() {
        return ewrp.RCS_PROVISIONING_REQUEST_WITHOUT_AUTH_STATE;
    }

    @Override // defpackage.dgmn
    public final boolean h() {
        return true;
    }

    @Override // defpackage.dgmn
    public final boolean j() {
        return true;
    }

    @Override // defpackage.dgop
    public final boolean k(Message message, dgib dgibVar) {
        dgng dgngVar = this.a;
        dgngVar.F("RequestWithoutAuthState", message);
        int iOrdinal = dgng.al(message).ordinal();
        if (iOrdinal == 42) {
            dgngVar.J((HttpURLConnection) message.obj, message.arg2, this);
            return true;
        }
        if (iOrdinal != 44) {
            if (iOrdinal != 45) {
                return super.q(message, dgibVar);
            }
            return false;
        }
        dgngVar.s.c(dgngVar.h);
        dgngVar.T(dgngVar.al);
        dgngVar.p.a((HttpURLConnection) message.obj, null, "RequestWithoutAuthState");
        return true;
    }
}
