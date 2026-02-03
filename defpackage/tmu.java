package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tmu implements cfoy {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/cloudstore/cmsrpc/CmsRpcInboxMessageHandler");
    public final efwo b;
    public final fcsu c;
    public final aurx d;
    public final autx e;
    public final cfab f;
    public final fcsu g;
    public final Map h;
    public final aprp i;
    private final fdjx j;

    public tmu(fdjx fdjxVar, efwo efwoVar, fcsu fcsuVar, aurx aurxVar, autx autxVar, cfab cfabVar, fcsu fcsuVar2, Map map, aprp aprpVar) {
        fdjxVar.getClass();
        efwoVar.getClass();
        fcsuVar.getClass();
        aurxVar.getClass();
        autxVar.getClass();
        aprpVar.getClass();
        this.j = fdjxVar;
        this.b = efwoVar;
        this.c = fcsuVar;
        this.d = aurxVar;
        this.e = autxVar;
        this.f = cfabVar;
        this.g = fcsuVar2;
        this.h = map;
        this.i = aprpVar;
        Iterator<E> it = ((ekgp) map).keySet().iterator();
        while (it.hasNext()) {
            ((ekrd) a.e().h("com/google/android/apps/messaging/cloudstore/cmsrpc/CmsRpcInboxMessageHandler", "<init>", 45, "CmsRpcInboxMessageHandler.kt")).t("Registered CmsRpcPayloadDelegate for %s ", ((epmo) it.next()).name());
        }
    }

    public static final String b(ezjj ezjjVar) {
        ezji ezjiVarB = ezji.b(ezjjVar.d);
        if (ezjiVarB == null) {
            ezjiVarB = ezji.UNRECOGNIZED;
        }
        String str = String.format("messageType: %s, messageId: %s", Arrays.copyOf(new Object[]{ezjiVarB.name(), ezjjVar.c}, 2));
        str.getClass();
        return str;
    }

    @Override // defpackage.cfoy
    public final eiju a(ezjj ezjjVar) {
        ezjjVar.getClass();
        return auvw.c(this.j, fcyi.a, fdjz.a, new tmt(this, ezjjVar, null));
    }
}
