package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zcj {
    public final Context a;
    private final fcyh b;
    private final ymw c;

    public zcj(Context context, fcyh fcyhVar, ymw ymwVar) {
        context.getClass();
        fcyhVar.getClass();
        this.a = context;
        this.b = fcyhVar;
        this.c = ymwVar;
    }

    public final auyl a(fdjx fdjxVar, final ajmx ajmxVar, final fdap fdapVar) {
        if (ajmxVar instanceof anjo) {
            return new auxq(new fdae() { // from class: zcf
                @Override // defpackage.fdae
                public final Object invoke() {
                    return new dkzl(dkzm.a, null);
                }
            });
        }
        if (!(ajmxVar instanceof ajms)) {
            throw new fctg();
        }
        ajms ajmsVar = (ajms) ajmxVar;
        final dkzl dkzlVar = new dkzl(zvy.a(ajmsVar.a(), this.a), new fdae() { // from class: zcg
            @Override // defpackage.fdae
            public final Object invoke() {
                fdap fdapVar2 = fdapVar;
                if (fdapVar2 != null) {
                    fdapVar2.invoke(((ajms) ajmxVar).a().b());
                }
                return fctx.a;
            }
        });
        if (!(ajmsVar.a().g() instanceof uin)) {
            return new auxq(new fdae() { // from class: zch
                @Override // defpackage.fdae
                public final Object invoke() {
                    return dkzlVar;
                }
            });
        }
        fduf fdufVarA = fdvf.a(dkzlVar);
        ajlt ajltVarA = ajmsVar.a();
        auvw.k(fdjxVar, this.b, null, new zci(fdufVarA, this.c.a(((uin) ajltVarA.g()).e()), ajltVarA, this, null), 2);
        return auyp.a(fdufVarA);
    }
}
