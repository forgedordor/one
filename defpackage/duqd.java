package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duqd implements eyif {
    private final eyik a;
    private final eyik b;

    public duqd(eyik eyikVar, eyik eyikVar2) {
        this.a = eyikVar;
        this.b = eyikVar2;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        Context contextB = ((duoq) this.a).b();
        ejwi ejwiVar = (ejwi) this.b.b();
        Pattern pattern = ecfb.a;
        ecfa ecfaVar = new ecfa(contextB);
        ecfaVar.f("mdd_pds_config");
        ecfaVar.g(duto.d("DiagSharedFiles", ejwiVar));
        Uri uriA = ecfaVar.a();
        uriA.getClass();
        return uriA;
    }
}
