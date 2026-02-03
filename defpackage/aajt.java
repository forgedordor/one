package defpackage;

import com.google.android.apps.messaging.conversation2.api.OpenConversation2Arguments;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aajt implements aajn, aafh {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/topcontent/topappbar/TopAppBarMiddleUiAdapterImpl");
    public final fdjx b;
    public final OpenConversation2Arguments c;
    public final afzc d;
    public final cssf e;
    public final ajlu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    public final fduf l;
    public final fdpl m;
    public final fdat n;
    private final fdpl o;
    private final admf p;

    public aajt(fdjx fdjxVar, OpenConversation2Arguments openConversation2Arguments, afzc afzcVar, cssf cssfVar, zqm zqmVar, fdpl fdplVar, fdpl fdplVar2, ajlu ajluVar, @apob fcsu fcsuVar, fcsu fcsuVar2, aajz aajzVar, ygn ygnVar, admf admfVar, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        fdjxVar.getClass();
        openConversation2Arguments.getClass();
        afzcVar.getClass();
        cssfVar.getClass();
        zqmVar.getClass();
        fdplVar.getClass();
        fdplVar2.getClass();
        ajluVar.getClass();
        fcsuVar.getClass();
        aajzVar.getClass();
        ygnVar.getClass();
        admfVar.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        this.b = fdjxVar;
        this.c = openConversation2Arguments;
        this.d = afzcVar;
        this.e = cssfVar;
        this.o = fdplVar2;
        this.f = ajluVar;
        this.g = fcsuVar;
        this.h = fcsuVar2;
        this.p = admfVar;
        this.i = fcsuVar3;
        this.j = fcsuVar4;
        this.k = fcsuVar5;
        String str = openConversation2Arguments.c;
        fduf fdufVarA = fdvf.a((str == null || fdgn.H(str)) ? null : str);
        this.l = fdufVarA;
        this.m = auyf.b(fdplVar, zqmVar.a(), fdufVarA, fdplVar2, aajzVar.a(), auyk.a(ygnVar.a(ygp.b), "IsScrolledPastThreshold"), admfVar.a, new aajq(this, null));
        this.n = auxh.d(new aajs(this), fdjxVar);
    }
}
