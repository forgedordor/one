package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhxy implements dhxa {
    private static final eclu a = new eclu(dhxc.a);
    private final Context b;
    private final ecjl c;
    private final Map d;

    public dhxy(Context context, diep diepVar, ecjl ecjlVar) {
        context.getClass();
        diepVar.getClass();
        ecjlVar.getClass();
        this.b = context;
        this.c = ecjlVar;
        this.d = new LinkedHashMap();
    }

    @Override // defpackage.dhxa
    public final synchronized dhwz a(dhnv dhnvVar) {
        dhnvVar.getClass();
        Map map = this.d;
        dhwz dhwzVar = (dhwz) map.get(dhnvVar);
        if (dhwzVar != null) {
            return dhwzVar;
        }
        Context context = this.b;
        Pattern pattern = ecfb.a;
        ecfa ecfaVar = new ecfa(context);
        ecfaVar.f("moirai");
        ecfaVar.g(fdbq.f(dhnvVar.b, "") ? "metadata.pb" : a.h(dhnvVar, "metadata_{", ".role}.pb"));
        ecfaVar.b.h(echy.b(echy.a));
        Uri uriA = ecfaVar.a();
        uriA.getClass();
        ecji ecjiVarH = ecjj.h();
        ecjiVarH.f(uriA);
        ecjiVarH.e(dhxc.a);
        ecjiVarH.d(a);
        dhxx dhxxVar = new dhxx(this.c.a(ecjiVarH.a()));
        map.put(dhnvVar, dhxxVar);
        return dhxxVar;
    }
}
