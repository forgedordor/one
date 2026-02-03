package defpackage;

import android.content.Context;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afto implements aftd {
    public final Context a;
    public final fcsu b;
    public final fcsu c;
    public final ajln d;
    public final fcsu e;
    public final fcsu f;
    public final cssf g;
    public final fcsu h;
    public final fcsu i;
    public final dzuc j;
    public final asgv k;
    public final ardc l;
    public final fcsu m;
    public final fduf n;
    private final fdjx o;
    private final fdvc p;
    private final fdvc q;

    public afto(Context context, fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, afmz afmzVar, ajln ajlnVar, fcsu fcsuVar3, fcsu fcsuVar4, cssf cssfVar, fcsu fcsuVar5, fcsu fcsuVar6, dzuc dzucVar, asgv asgvVar, ardc ardcVar, fcsu fcsuVar7, lwn lwnVar) {
        Long lValueOf;
        context.getClass();
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        afmzVar.getClass();
        ajlnVar.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        cssfVar.getClass();
        fcsuVar6.getClass();
        dzucVar.getClass();
        ardcVar.getClass();
        this.a = context;
        this.o = fdjxVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = ajlnVar;
        this.e = fcsuVar3;
        this.f = fcsuVar4;
        this.g = cssfVar;
        this.h = fcsuVar5;
        this.i = fcsuVar6;
        this.j = dzucVar;
        this.k = asgvVar;
        this.l = ardcVar;
        this.m = fcsuVar7;
        Bundle bundle = (Bundle) lwnVar.b("conversation_list_bundle_key");
        if (bundle != null) {
            Object objB = fcsuVar.b();
            objB.getClass();
            lValueOf = Long.valueOf(bundle.getLong("conversation_list_limit_key", ((Number) objB).longValue()));
        } else {
            lValueOf = (Long) fcsuVar.b();
        }
        fduf fdufVarA = fdvf.a(lValueOf);
        this.n = fdufVarA;
        lwnVar.e("conversation_list_bundle_key", new piw() { // from class: afte
            @Override // defpackage.piw
            public final Bundle a() {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("conversation_list_limit_key", ((Number) this.a.n.c()).longValue());
                return bundle2;
            }
        });
        fdvc fdvcVarB = fdtg.b(new aftn(fdufVarA, this), fdjxVar, fdur.a(0L, 3), new afti(null));
        this.p = fdvcVarB;
        this.q = fdtg.b(new fdua(afmzVar.b(), fdvcVarB, new aftk(this, afmzVar, null)), fdjxVar, fdur.a(0L, 3), new aftp(false, 7));
    }

    @Override // defpackage.aftd
    public final fdvc a() {
        return this.q;
    }
}
