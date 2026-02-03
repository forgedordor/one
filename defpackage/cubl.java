package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cubl implements cubb {
    public static final cqce a = cqce.g("BugleProfiles", "ProfileSuggestionsAdapterImpl");
    public final Context b;
    public final fcsu c;
    public final fcsu d;
    public final cmvy e;
    public final eilt f;
    public final fcsu g;
    public final asgz h;
    public final fcsu i;
    public final ctma j;
    private final fdjx k;
    private final cucf l;
    private final fcsu m;
    private final cudy n;
    private final fcsu o;
    private final aqod p;
    private final fcsu q;
    private final ardr r;
    private final fdpl s;
    private final fdvc t;

    public cubl(fdjx fdjxVar, Context context, cucf cucfVar, fcsu fcsuVar, cudy cudyVar, fcsu fcsuVar2, fcsu fcsuVar3, cmvy cmvyVar, eilt eiltVar, fcsu fcsuVar4, fcsu fcsuVar5, aqod aqodVar, fcsu fcsuVar6, asgz asgzVar, fcsu fcsuVar7, ctma ctmaVar, ardr ardrVar) {
        fdpl fduaVar;
        fdjxVar.getClass();
        context.getClass();
        cucfVar.getClass();
        fcsuVar.getClass();
        cudyVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        cmvyVar.getClass();
        eiltVar.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        ctmaVar.getClass();
        ardrVar.getClass();
        this.k = fdjxVar;
        this.b = context;
        this.l = cucfVar;
        this.m = fcsuVar;
        this.n = cudyVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = cmvyVar;
        this.f = eiltVar;
        this.o = fcsuVar4;
        this.g = fcsuVar5;
        this.p = aqodVar;
        this.q = fcsuVar6;
        this.h = asgzVar;
        this.i = fcsuVar7;
        this.j = ctmaVar;
        this.r = ardrVar;
        fdpl fdplVarB = cucfVar.b();
        this.s = fdplVarB;
        if (ardrVar.a()) {
            fdua fduaVar2 = new fdua(fdplVarB, cudyVar.a(), new cubf(null));
            cubh cubhVar = new cubh(null, this);
            int i = fdsn.a;
            fduaVar = new fdwg(cubhVar, fduaVar2);
        } else {
            fduaVar = new fdua(fdplVarB, cudyVar.a(), new cubg(this));
        }
        this.t = fdtg.b(fduaVar, fdjxVar, fdur.a(0L, 3), new cuba(null));
    }

    public static final alqm c(fctc fctcVar) {
        return (alqm) fctcVar.a();
    }

    @Override // defpackage.cubb
    public final fdvc a() {
        return this.t;
    }

    public final alqm b(String str) {
        fcsu fcsuVar = this.m;
        alqm alqmVarP = ((alrj) fcsuVar.b()).p(str);
        if (!((eoth) ((aqno) this.p).a.b()).a("bugle.new_conversation_from_typing_uses_normalized_number") || !alqmVarP.r() || !((crmx) this.q.b()).I(alqmVarP.l())) {
            return alqmVarP;
        }
        String strL = alqmVarP.l();
        if (strL != null) {
            return ((alrj) fcsuVar.b()).d(((dggl) this.o.b()).a(strL));
        }
        throw new IllegalStateException("Required value was null.");
    }
}
