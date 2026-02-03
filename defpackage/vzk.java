package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vzk {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/api/transportcapability/MapiTransportCapabilityResolver");
    public final Context b;
    public final ConversationId c;
    public final fcyh d;
    public final fcyh e;
    public final fcsu f;
    public final aqbh g;
    public final fcsu h;
    public final arvu i;
    public final fdpl j;
    public final fdpl k;
    public final fdpl l;
    public final fdpl m;
    public final fdpl n;
    private final arqu o;
    private final fdpl p;
    private final fdpl q;
    private final fdpl r;
    private final fdpl s;
    private final fdpl t;
    private final fdpl u;

    public vzk(Context context, ConversationId conversationId, fdpl fdplVar, fdpl fdplVar2, wre wreVar, fcyh fcyhVar, fcyh fcyhVar2, fcsu fcsuVar, fcsu fcsuVar2, arqu arquVar, aqbh aqbhVar, fcsu fcsuVar3, arvu arvuVar, fdpl fdplVar3, aquo aquoVar, arwb arwbVar) {
        fdpl fdplVar4;
        fdpl fdplVar5;
        fdpl fdplVarA;
        context.getClass();
        conversationId.getClass();
        fdplVar.getClass();
        fdplVar2.getClass();
        wreVar.getClass();
        fcyhVar.getClass();
        fcyhVar2.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        aqbhVar.getClass();
        fcsuVar3.getClass();
        arvuVar.getClass();
        fdplVar3.getClass();
        aquoVar.getClass();
        arwbVar.getClass();
        this.b = context;
        this.c = conversationId;
        this.d = fcyhVar;
        this.e = fcyhVar2;
        this.f = fcsuVar;
        this.o = arquVar;
        this.g = aqbhVar;
        this.h = fcsuVar3;
        this.i = arvuVar;
        fdpl fdplVar6 = fdplVar3;
        this.p = fdplVar6;
        fdpl fdpuVar = ((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue() ? (fdpl) fcsuVar2.b() : new fdpu(false);
        fdpuVar.getClass();
        fdpl fdplVarA2 = fdqq.a(fdpuVar);
        this.q = fdplVarA2;
        fdpl fdplVarA3 = fdqq.a(aquoVar.a() ? fdplVar6 : new fdpu(false));
        this.r = fdplVarA3;
        fdpl fdplVarA4 = fdqq.a(new vxy(fdplVar2));
        this.s = fdplVarA4;
        fdpl fdplVarA5 = fdqq.a(new vyb(fdplVar, this));
        this.t = fdplVarA5;
        this.j = fdqq.a(new vyn(fdqc.a(fdud.a(fdqq.a(new vye(fdplVar)), fdqq.a(new vyh(fdplVar)), fdqq.a(new vyk(wreVar.a)), new vxr(null))), this));
        fdpl fdplVarA6 = fdqq.a(fdud.a(fdplVarA5, fdplVarA4, fdqq.a(new vyq(wreVar.a)), new vzj(this, null)));
        vxs vxsVar = new vxs(null, this);
        int i = fdsn.a;
        fdpl fdplVarA7 = fdqq.a(new fdwg(vxsVar, fdplVarA6));
        this.u = fdplVarA7;
        if (arquVar.a()) {
            fdpl fdplVarC = fdud.c(fdplVarA5, fdplVarA4, fdplVarA7, fdqq.a(new vyt(wreVar.a)), fdplVarA3, new vzh(this, null));
            fdplVar5 = fdplVarA5;
            fdplVar4 = fdplVarA4;
            fdplVarA = fdqq.a(fdplVarC);
        } else {
            fdplVar4 = fdplVarA4;
            fdplVar5 = fdplVarA5;
            fdplVarA = fdqq.a(auyf.a(fdplVar5, fdplVar4, fdplVarA7, fdqq.a(new vyw(wreVar.a)), fdplVarA2, fdplVarA3, new vzi(this, null)));
        }
        this.k = fdplVarA;
        this.l = fdqq.a(new vxx(new fdua(fdplVarA, wreVar.a, new vxq(this, null))));
        this.m = fdqq.a(new fdua(fdplVar4, fdplVar5, new vxo(this, null)));
        this.n = fdqq.a(new fdui(new vzg(fdplVar, this, arwbVar, null)));
    }

    public static final vzv a(ajlj ajljVar, vwu vwuVar, waf wafVar) {
        if (wafVar.a || wafVar.b) {
            ekrw ekrwVarG = a.g();
            ekrwVarG.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarG.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/api/transportcapability/MapiTransportCapabilityResolver", "calculateTransportBeforeSimpleMessageProperties", BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, "MapiTransportCapabilityResolver.kt")).q("Forcing MMS since draft contains subject or is urgent.");
            return vzp.a;
        }
        boolean z = wafVar.c;
        ajna ajnaVar = vwuVar.c;
        int i = vwuVar.h;
        if (ajnaVar.g) {
            if (i == 3 && z) {
                ekrw ekrwVarG2 = a.g();
                ekrwVarG2.X(eksq.a, "BugleComposeRow2");
                ((ekrd) ekrwVarG2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/api/transportcapability/MapiTransportCapabilityResolver", "getTransportForRichTransportFeatureSet", 677, "MapiTransportCapabilityResolver.kt")).q("Forcing MMS since media attachments not supported in RCS and draft contains attachments.");
                return vzp.a;
            }
            ekrw ekrwVarG3 = a.g();
            ekrwVarG3.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarG3.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/api/transportcapability/MapiTransportCapabilityResolver", "getTransportForRichTransportFeatureSet", 685, "MapiTransportCapabilityResolver.kt")).t("Using RCS due to its best available transport feature set %s.", ajnaVar);
            return vzq.a;
        }
        if (ajnaVar == ajna.SATELLITE) {
            return new vzr((byte[]) null);
        }
        if (ajnaVar != ajna.SIMPLE) {
            throw new IllegalStateException("Check failed.");
        }
        if (z) {
            ekrw ekrwVarG4 = a.g();
            ekrwVarG4.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarG4.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/api/transportcapability/MapiTransportCapabilityResolver", "getTransportForSimpleTransportFeatureSet", 700, "MapiTransportCapabilityResolver.kt")).q("Upgrading to MMS since draft contains attachments.");
            return vzp.a;
        }
        ajlj ajljVar2 = ajlj.GROUP;
        if (ajljVar == ajljVar2 && i == 2) {
            ekrw ekrwVarG5 = a.g();
            ekrwVarG5.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarG5.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/api/transportcapability/MapiTransportCapabilityResolver", "getTransportForSimpleTransportFeatureSet", 704, "MapiTransportCapabilityResolver.kt")).q("Using SMS since we are sending as mass sms.");
            return new vzs((byte[]) null);
        }
        if (ajljVar != ajljVar2) {
            return null;
        }
        ekrw ekrwVarG6 = a.g();
        ekrwVarG6.X(eksq.a, "BugleComposeRow2");
        ((ekrd) ekrwVarG6.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/api/transportcapability/MapiTransportCapabilityResolver", "getTransportForSimpleTransportFeatureSet", 708, "MapiTransportCapabilityResolver.kt")).q("Upgrading to MMS since its a group conversation.");
        return vzp.a;
    }

    public static final fdpl b(vzv vzvVar, fdpl fdplVar) {
        if (fdbq.f(vzvVar, vzp.a) || fdbq.f(vzvVar, vzq.a)) {
            return new fdpu(vzvVar);
        }
        if (vzvVar instanceof vzr) {
            return new vxk(fdplVar);
        }
        if ((vzvVar instanceof vzu) || vzvVar == null) {
            return new vxn(fdplVar, new fdci(), vzvVar);
        }
        throw new fctg();
    }
}
