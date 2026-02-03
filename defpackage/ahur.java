package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.UUID;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahur implements Runnable {
    final /* synthetic */ UUID a;
    final /* synthetic */ ahwd b;
    final /* synthetic */ aiaf c;

    public ahur(UUID uuid, ahwd ahwdVar, aiaf aiafVar) {
        this.a = uuid;
        this.b = ahwdVar;
        this.c = aiafVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        btqt btqtVarA = btqy.a();
        btqtVarA.A("completeActiveExecution");
        UUID uuid = this.a;
        btqtVarA.c(new ahup(uuid));
        if (((btor) btqtVarA.b().l()) == null) {
            throw new ahui(uuid);
        }
        ahwd ahwdVar = this.b;
        aiaf aiafVar = this.c;
        int iLongValue = (int) ((Number) ahwdVar.g.b()).longValue();
        btqt btqtVarA2 = btqy.a();
        btqtVarA2.A("onlyKeepLastNInactiveExecutions");
        btqtVarA2.s();
        Function function = new Function() { // from class: ahtw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return btqy.c.a;
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        btpv btpvVar = btqy.c;
        btpw[] btpwVarArr = {(btpw) function.apply(btpvVar)};
        int iIntValue = btqy.c().intValue();
        if (((Integer) btqy.b.getOrDefault(btpwVarArr[0].toString(), -1)).intValue() > iIntValue) {
            dqru.x("columnReference.toString()", iIntValue);
        }
        btqtVarA2.m(btpwVarArr);
        btqtVarA2.c(new Function() { // from class: ahtx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btqx btqxVar = (btqx) obj;
                btqxVar.getClass();
                ahwd.B(btqxVar);
                return btqxVar;
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        });
        btqtVarA2.D((String) DesugarArrays.stream(new btqq[]{new btqq(btpvVar.a)}).map(new Function() { // from class: btqs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((btqq) obj).a();
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }).collect(Collectors.joining(", ")));
        btqtVarA2.y(iLongValue - 1);
        final btqr btqrVarB = btqtVarA2.b();
        btqm btqmVar = new btqm();
        btqmVar.f("onlyKeepLastNInactiveExecutions");
        btqmVar.b = new btqw((btqx) new Function() { // from class: ahty
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btqx btqxVar = (btqx) obj;
                btqxVar.getClass();
                ahwd.B(btqxVar);
                btqxVar.ap(new dqpk("restore_workflow_executions._id", 4, btqrVarB));
                return btqxVar;
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }.apply(new btqx()));
        btqmVar.e();
        btqmVar.d();
        ahwdVar.t(uuid, aiafVar, new ahuq(ahwdVar));
    }
}
