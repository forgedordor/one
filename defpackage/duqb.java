package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duqb implements eyif {
    private final dupu a;
    private final eyik b;
    private final eyik c;

    public duqb(dupu dupuVar, eyik eyikVar, eyik eyikVar2) {
        this.a = dupuVar;
        this.b = eyikVar;
        this.c = eyikVar2;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        Context contextB = ((duoq) this.b).b();
        ejwi ejwiVar = (ejwi) this.c.b();
        Pattern pattern = ecfb.a;
        ecfa ecfaVar = new ecfa(contextB);
        ecfaVar.f("mdd_pds_config");
        ecfaVar.g(duto.d("LoggingState", ejwiVar));
        Uri uriA = ecfaVar.a();
        ecji ecjiVarH = ecjj.h();
        ecjiVarH.f(uriA);
        ecjiVarH.e(dtsb.a);
        ecjiVarH.g(false);
        dupu dupuVar = this.a;
        ecjs ecjsVarD = ecjv.d(contextB, dupuVar.a);
        ecjsVarD.c = duuj.d("gms_icing_mdd_network_usage_monitor", ejwiVar);
        ecjsVarD.b();
        ecjsVarD.d(new dusz());
        ecjiVarH.h(ecjsVarD.a());
        return dupuVar.b.a(ecjiVarH.a());
    }
}
