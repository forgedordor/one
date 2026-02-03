package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.conversation2.api.OpenConversation2Arguments;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ver implements vdy {
    public final Context a;
    public final afzc b;
    public final OpenConversation2Arguments c;
    private final fdpl d;
    private final Set e;

    public ver(Context context, afzc afzcVar, fdpl fdplVar, fdpl fdplVar2, xvd xvdVar, OpenConversation2Arguments openConversation2Arguments) {
        context.getClass();
        afzcVar.getClass();
        fdplVar.getClass();
        fdplVar2.getClass();
        xvdVar.getClass();
        openConversation2Arguments.getClass();
        this.a = context;
        this.b = afzcVar;
        this.c = openConversation2Arguments;
        xve xveVar = xve.a;
        xveVar.getClass();
        Map map = xvdVar.a;
        if (!map.containsKey(xveVar)) {
            map.put(xveVar, fdvf.a(null));
        }
        Object obj = map.get(xveVar);
        obj.getClass();
        this.d = fdud.a(fdplVar, fdplVar2, (fdpl) obj, new veq(this, null));
        this.e = fcwm.b(zqx.a);
    }

    @Override // defpackage.vdy
    public final Set a() {
        return this.e;
    }

    @Override // defpackage.vdy
    public final fdpl b() {
        return this.d;
    }
}
