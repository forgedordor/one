package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxlp {
    private static erzj a;

    public static synchronized erzj a(Context context, dxlo dxloVar, dxgy dxgyVar) {
        if (a == null) {
            if (((dxgw) dxgyVar).f) {
                erzj erzjVarA = dxloVar.a(context);
                a = erzjVarA;
                return erzjVarA;
            }
            dclh.l("AIzaSyC8UYZpvA2eknNex0Pjid0_eTLJoDu6los", "ApiKey must be set.");
            dclh.l("1:747654520220:android:0000000000000000", "ApplicationId must be set.");
            a = dxloVar.c(context, new erzu("1:747654520220:android:0000000000000000", "AIzaSyC8UYZpvA2eknNex0Pjid0_eTLJoDu6los", null, null, ((dxgw) dxgyVar).b, null, "chime-sdk"));
        }
        return a;
    }
}
