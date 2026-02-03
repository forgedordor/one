package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwje implements cwin {
    public final Context a;
    public final ConversationId b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final boolean f;
    private final fdjx g;
    private final fcsu h;
    private final fcsu i;
    private final fcsu j;
    private final fcsu k;
    private final eiju l;
    private final eiju m;
    private final eiju n;
    private final fdpl o;
    private final eiju p;
    private final eiju q;
    private final fduf r;
    private final fdpl s;
    private final fduf t;
    private final fdvc u;

    public cwje(Context context, fdjx fdjxVar, fcsu fcsuVar, ConversationId conversationId, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7) {
        context.getClass();
        fdjxVar.getClass();
        conversationId.getClass();
        this.a = context;
        this.g = fdjxVar;
        this.h = fcsuVar;
        this.b = conversationId;
        this.i = fcsuVar2;
        this.j = fcsuVar3;
        this.k = fcsuVar4;
        this.c = fcsuVar5;
        this.d = fcsuVar6;
        this.e = fcsuVar7;
        this.f = conversationId instanceof PenpalBotConversationId;
        eiju eijuVarT = ((ajmh) fcsuVar.b()).t(ekgb.r(amvv.d));
        eijuVarT.getClass();
        auvw.n(eijuVarT);
        this.l = eijuVarT;
        eiju eijuVarT2 = ((ajmh) fcsuVar.b()).t(ekgb.r(amvv.b));
        eijuVarT2.getClass();
        auvw.n(eijuVarT2);
        this.m = eijuVarT2;
        eiju eijuVarT3 = ((ajmh) fcsuVar.b()).t(ekgb.r(amvv.c));
        eijuVarT3.getClass();
        auvw.n(eijuVarT3);
        this.n = eijuVarT3;
        this.o = avac.g(auyk.a(auvw.f(eijuVarT), "Videos"), auyk.a(auvw.f(eijuVarT2), "Links"), auyk.a(auvw.f(eijuVarT3), "Locations"), fdjxVar, new cwjd(null));
        eiju eijuVarT4 = ((ajmh) fcsuVar.b()).t(ekgb.r(amvv.a));
        eijuVarT4.getClass();
        auvw.n(eijuVarT4);
        this.p = eijuVarT4;
        eiju eijuVarQ = ((ajmh) fcsuVar.b()).q();
        eijuVarQ.getClass();
        auvw.n(eijuVarQ);
        this.q = eijuVarQ;
        fduf fdufVarA = fdvf.a(Boolean.valueOf(conversationId instanceof PenpalBotConversationId));
        this.r = fdufVarA;
        cwjc cwjcVar = new cwjc(fdufVarA);
        this.s = cwjcVar;
        fduf fdufVarA2 = fdvf.a(new cwjk(null, 3));
        this.t = fdufVarA2;
        this.u = fdtg.b(avac.i(auyk.a(cwjcVar, "GeminiProactiveStateCacheInit"), new auyh("GeminiProactiveStateCacheSet", fdufVarA2), fdjxVar, new cwiz(null)), fdjxVar, fdur.b, new cwjk(null, 3));
    }

    @Override // defpackage.cwin
    public final fdvc a() {
        fdpl fdplVarA = auyk.a(this.o, "VideosLinksPlacesCount");
        fdpl fdplVarA2 = auyk.a(auvw.f(this.p), "ImagePreview");
        fdpl fdplVarA3 = auyk.a(auvw.f(this.q), "StarredCount");
        fdpl fdplVarA4 = auyk.a(((vjw) this.i.b()).b, "ImageSearchActionPlugin");
        fdpl fdplVarA5 = auyk.a(((vmi) this.j.b()).c, "SearchActionPlugin");
        fdpl fdplVarA6 = auyk.a(((vpv) this.k.b()).c, "ViewStarredActionPlugin");
        fdvc fdvcVarB = auyk.b(this.u, "GeminiGetProactiveStateResult");
        cwiy cwiyVar = new cwiy(this, null);
        fdjx fdjxVar = this.g;
        return fdtg.b(avac.f(fdplVarA, fdplVarA2, fdplVarA3, fdplVarA4, fdplVarA5, fdplVarA6, fdvcVarB, fdjxVar, cwiyVar), fdjxVar, fdur.a(0L, 3), null);
    }
}
