package defpackage;

import android.app.Activity;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aisy implements aisx {
    private final eygg a;
    private final eygg b;
    private final eygg c;
    private final eygg d;

    public aisy(eygg eyggVar, eygg eyggVar2, eygg eyggVar3, eygg eyggVar4, eygg eyggVar5) {
        eyggVar.getClass();
        eyggVar2.getClass();
        eyggVar3.getClass();
        eyggVar4.getClass();
        eyggVar5.getClass();
        this.a = eyggVar;
        this.b = eyggVar2;
        this.c = eyggVar4;
        this.d = eyggVar5;
    }

    @Override // defpackage.aisx
    public final void a(View view, int i) {
        if (view == null) {
            return;
        }
        dsuy dsuyVarA = ((dswb) this.a.b()).a(i);
        Object objB = this.d.b();
        objB.getClass();
        dsuyVarA.f(aita.a((aite) objB));
        ((dsvx) this.b.b()).b(view, dsuyVarA);
    }

    @Override // defpackage.aisx
    public final void b(Activity activity, int i) {
        dsuy dsuyVarA = ((dswb) this.a.b()).a(i);
        dsuyVarA.g(dswc.b());
        dsvk dsvkVar = dsvd.b;
        dsvd dsvdVar = dsuyVarA.c;
        ejwl.p(dsvdVar == null, "CVE %s has already been built.", dsvdVar);
        dsuyVarA.b = dsvkVar;
        Object objB = this.d.b();
        objB.getClass();
        dsuyVarA.f(aita.a((aite) objB));
        ((dsvx) this.b.b()).f(activity, dsuyVarA);
    }

    @Override // defpackage.aisx
    public final void c(View view) {
        ((dsvh) this.c.b()).a(dsvg.e(), view);
    }
}
