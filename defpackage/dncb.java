package defpackage;

import android.app.Activity;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dncb {
    private adj a;

    public static /* synthetic */ void c(dncb dncbVar, Activity activity, dnbx dnbxVar, final adi adiVar) {
        activity.getClass();
        dnbxVar.getClass();
        if (!(activity instanceof eg)) {
            throw new IllegalStateException("Check failed.");
        }
        eg egVar = (eg) activity;
        String strAF = fcva.aF(dnbxVar.a, "_", null, null, null, 62);
        StringBuilder sb = new StringBuilder("compose_system_content_picker_");
        sb.append(strAF);
        sb.append("_");
        boolean z = dnbxVar.b;
        sb.append(true != z ? "single" : "multiple");
        String string = sb.toString();
        dncbVar.a = z ? egVar.h.b(string, new dnbz(egVar, dnbxVar), adiVar) : egVar.h.b(string, new dnca(egVar, dnbxVar), new adi() { // from class: dnby
            @Override // defpackage.adi
            public final void a(Object obj) {
                Uri uri = (Uri) obj;
                adiVar.a(uri != null ? fcva.b(uri) : fcvo.a);
            }
        });
    }

    public final void a() {
        adj adjVar = this.a;
        if (adjVar == null) {
            fdbq.c("launcher");
            adjVar = null;
        }
        adjVar.c("*/*");
    }
}
