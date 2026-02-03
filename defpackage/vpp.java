package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vpp implements vdy {
    public final Context a;
    public final fdjx b;
    public final fcsu c;
    public final aqcg d;
    public final csze e;
    public final cszj f;
    public final fcsu g;
    public final fcsu h;
    public final asit i;
    public final aqla j;
    public final fcsu k;
    public final asiu l;
    public final fduf m;
    public final Map n;
    public final fdpl o;
    private final cszm p;
    private final fduj q;
    private final fdpl r;
    private final Set s;

    public vpp(Context context, fdjx fdjxVar, fcsu fcsuVar, fdpl fdplVar, fdpl fdplVar2, fdpl fdplVar3, aqcg aqcgVar, csze cszeVar, cszj cszjVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, asit asitVar, cszm cszmVar, aqla aqlaVar, fcsu fcsuVar6, asiu asiuVar, fduj fdujVar) {
        context.getClass();
        fdjxVar.getClass();
        fcsuVar.getClass();
        fdplVar.getClass();
        fdplVar2.getClass();
        fdplVar3.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        this.a = context;
        this.b = fdjxVar;
        this.c = fcsuVar;
        this.d = aqcgVar;
        this.e = cszeVar;
        this.f = cszjVar;
        this.g = fcsuVar2;
        this.h = fcsuVar5;
        this.i = asitVar;
        this.p = cszmVar;
        this.j = aqlaVar;
        this.k = fcsuVar6;
        this.l = asiuVar;
        this.q = fdujVar;
        fduf fdufVarA = fdvf.a(false);
        this.m = fdufVarA;
        fdvc fdvcVarH = ((cliy) fcsuVar4.b()).h();
        this.r = fdvcVarH;
        fcxe fcxeVar = new fcxe();
        fcxeVar.put(avgg.a.b, new vpe(djrr.eU, eocq.VIDEO_CALLING_SERVICE_TYPE_WHATSAPP, new vpn(cszmVar)));
        this.n = fcwa.b(fcxeVar);
        c();
        this.o = auyf.a(fdplVar, fdplVar2, fdplVar3, fdufVarA, fdvcVarH, fdujVar, new vph(this, null));
        this.s = fcwm.b(zqx.a);
    }

    public static final boolean d(ekgb ekgbVar) {
        if ((ekgbVar instanceof Collection) && ekgbVar.isEmpty()) {
            return true;
        }
        Iterator<E> it = ekgbVar.iterator();
        while (it.hasNext()) {
            if (!((aobo) ((ResolvedRecipient) it.next()).m()).c) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.vdy
    public final Set a() {
        return this.s;
    }

    @Override // defpackage.vdy
    public final fdpl b() {
        return this.o;
    }

    public final void c() {
        auvw.k(this.b, null, null, new vpo(this, null), 3);
    }
}
