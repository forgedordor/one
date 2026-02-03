package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dndl {
    public static final ecjh a(Context context, ecjl ecjlVar, evuh evuhVar, String str, String str2) {
        Pattern pattern = ecfb.a;
        ecfa ecfaVar = new ecfa(context);
        ecfaVar.f(str);
        ecfaVar.g(str2.concat(".pb"));
        Uri uriA = ecfaVar.a();
        ecji ecjiVarH = ecjj.h();
        ecjiVarH.f(uriA);
        ecjiVarH.e(evuhVar);
        return ecjlVar.a(ecjiVarH.a());
    }
}
