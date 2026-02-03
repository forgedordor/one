package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aher implements ahdx {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/profile/sendingas/SendingAsUiAdapterImpl");
    public final fdjx b;
    public final fdpl c;
    public final fdpl d;
    public final fdpl e;
    public final fcyh f;
    public final chlv g;
    public final cphz h;
    public final chna i;
    public final ConcurrentHashMap j;
    public final wre k;
    private final xvf l;
    private final fdvc m;
    private final fdvc n;

    public aher(fdjx fdjxVar, fdpl fdplVar, fdpl fdplVar2, fdpl fdplVar3, fcyh fcyhVar, chlv chlvVar, yir yirVar, cphz cphzVar, chna chnaVar, xvf xvfVar, wre wreVar) {
        fdjxVar.getClass();
        fdplVar.getClass();
        fdplVar2.getClass();
        fcyhVar.getClass();
        yirVar.getClass();
        chnaVar.getClass();
        xvfVar.getClass();
        wreVar.getClass();
        this.b = fdjxVar;
        this.c = fdplVar;
        this.d = fdplVar2;
        this.e = fdplVar3;
        this.f = fcyhVar;
        this.g = chlvVar;
        this.h = cphzVar;
        this.i = chnaVar;
        this.l = xvfVar;
        this.k = wreVar;
        this.j = new ConcurrentHashMap();
        fdvc fdvcVar = xvfVar.a;
        this.m = fdvcVar;
        fdpl fdplVarA = fdqq.a(new ahel(fdvcVar));
        ahem ahemVar = new ahem(null, this);
        int i = fdsn.a;
        this.n = fdtg.b(new fdwg(ahemVar, fdplVarA), fdjxVar, fdur.a(0L, 3), null);
    }

    @Override // defpackage.ahdx
    public final fdvc a() {
        return this.n;
    }
}
