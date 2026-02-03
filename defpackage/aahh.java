package defpackage;

import android.R;
import android.content.Context;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aahh implements aagx {
    public final zqm a;
    public final aafh b;
    public final afzc c;
    public final fcsu d;
    public final aahj e;
    public final aahj f;
    public final fdvc g;
    public final fdvc h;
    private final Context i;
    private final fdjx j;
    private final fdae k;

    public aahh(Context context, fdjx fdjxVar, zqm zqmVar, aafh aafhVar, afzc afzcVar, fcsu fcsuVar) {
        context.getClass();
        fdjxVar.getClass();
        zqmVar.getClass();
        afzcVar.getClass();
        this.i = context;
        this.j = fdjxVar;
        this.a = zqmVar;
        this.b = aafhVar;
        this.c = afzcVar;
        this.d = fcsuVar;
        this.k = auxh.b(new fdae() { // from class: aaha
            @Override // defpackage.fdae
            public final Object invoke() {
                aahh aahhVar = this.a;
                fcsu fcsuVar2 = aahhVar.d;
                Optional optional = (Optional) fcsuVar2.b();
                final fdap fdapVar = new fdap() { // from class: aagy
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(((ahbi) obj).a() != null);
                    }
                };
                if (((Boolean) optional.map(new Function() { // from class: aagz
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return fdapVar.invoke(obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(false)).booleanValue()) {
                    ahbg ahbgVarA = ((ahbi) ((Optional) fcsuVar2.b()).get()).a();
                    if (ahbgVarA == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    ahbgVarA.a();
                } else {
                    aahhVar.c.h(agbf.a);
                }
                return fctx.a;
            }
        }, fdjxVar);
        String string = context.getString(R.string.cancel);
        string.getClass();
        this.e = new aahj(string, djrr.ak, new fdae() { // from class: aahb
            @Override // defpackage.fdae
            public final Object invoke() {
                this.a.a.b();
                return fctx.a;
            }
        });
        String string2 = context.getString(R.string.cancel);
        string2.getClass();
        this.f = new aahj(string2, djrr.q, new fdae() { // from class: aahc
            @Override // defpackage.fdae
            public final Object invoke() {
                ((aajt) this.a.b).l.f(null);
                return fctx.a;
            }
        });
        fdpl fdplVarA = fdud.a(zqmVar.a(), ((aajt) aafhVar).l, afzcVar.g(), new aahd(this, null));
        fdus fdusVarA = fdur.a(0L, 3);
        agbf agbfVar = agbf.a;
        fdvc fdvcVarB = fdtg.b(fdplVarA, fdjxVar, fdusVarA, a(afzcVar.i(agbfVar)));
        this.g = fdvcVarB;
        this.h = fdtg.b(new aahg(fdvcVarB), fdjxVar, fdur.a(0L, 3), Boolean.valueOf(a(afzcVar.i(agbfVar)).c));
    }

    public final aahj a(boolean z) {
        String string = this.i.getString(com.google.android.apps.messaging.R.string.top_app_bar_back);
        string.getClass();
        return new aahj(string, djrr.q, false, z, this.k);
    }
}
