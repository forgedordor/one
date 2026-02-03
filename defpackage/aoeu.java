package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aoeu extends fcyz implements fdat {
    int a;
    final /* synthetic */ aoew b;
    final /* synthetic */ axcm c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoeu(fcxy fcxyVar, aoew aoewVar, axcm axcmVar) {
        super(2, fcxyVar);
        this.b = aoewVar;
        this.c = axcmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aoeu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        final axfu axfuVar;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            axfuVar = (axfu) this.d;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            aoew aoewVar = this.b;
            axfu axfuVar2 = (axfu) aoewVar.a.b();
            axcm axcmVar = this.c;
            this.d = axfuVar2;
            this.a = 1;
            obj = aoewVar.b.g(axcmVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            axfuVar = axfuVar2;
        }
        awxn awxnVar = (awxn) obj;
        final awyv awyvVarA = ((awyu) axfuVar.i.b()).a(awxnVar);
        final axcm axcmVarB = awxnVar.b();
        final ekhx ekhxVarA = awyvVarA.a();
        Optional map = Collection.EL.stream(axfuVar.j()).filter(new Predicate() { // from class: axfd
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj2) {
                eksp ekspVar = axfu.a;
                return ((axft) obj2).a().equals(axcmVarB);
            }
        }).findFirst().map(new Function() { // from class: axff
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                axft axftVar = (axft) obj2;
                eksp ekspVar = axfu.a;
                return aofa.a(axftVar.b(), axftVar.a());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return map.isPresent() ? (SelfIdentityId) map.get() : aofa.a((String) ((dqsn) axfuVar.d.b()).c("createSubscriptionForMyIdentity", new ejxr() { // from class: axet
            @Override // defpackage.ejxr
            public final Object get() {
                dqxl dqxlVar;
                final String str = (String) awyvVarA.c().orElse("");
                ekhx ekhxVar = ekhxVarA;
                ejwl.a(Collection.EL.stream(ekhxVar).noneMatch(new Predicate() { // from class: axfh
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo538negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        eksp ekspVar = axfu.a;
                        return ((Integer) obj2).intValue() < 0;
                    }
                }));
                String[] strArr = ParticipantsTable.a;
                final bsbx bsbxVar = new bsbx();
                bsbxVar.ap(new dqpm("participants.sub_id", 3, bsbx.as(ekhxVar), true));
                if (!TextUtils.isEmpty(str)) {
                    bsbx bsbxVar2 = new bsbx();
                    bsbxVar2.b(new Function() { // from class: axfi
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            eksp ekspVar = axfu.a;
                            return bsbxVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: axfj
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            bsbx bsbxVar3 = (bsbx) obj2;
                            eksp ekspVar = axfu.a;
                            bsbxVar3.r(str);
                            bsbxVar3.w(-1);
                            return bsbxVar3;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bsbxVar = bsbxVar2;
                }
                axcm axcmVar2 = axcmVarB;
                if (TextUtils.isEmpty(str)) {
                    brzh brzhVar = ParticipantsTable.c;
                    dqxlVar = new dqxl("$V=$V DESC, $V IS NULL DESC", new Object[]{brzhVar.c, axcmVar2.b(), brzhVar.f});
                } else {
                    brzh brzhVar2 = ParticipantsTable.c;
                    dqxlVar = new dqxl("$V=$V DESC, $V=$V DESC", new Object[]{brzhVar2.c, axcmVar2.b(), brzhVar2.f, str});
                }
                bsbo bsboVarE = ParticipantsTable.e();
                bsboVarE.A("queryBuilderForSubIdsInOrNumberEquals");
                bsboVarE.g(bsbxVar);
                bsboVarE.C(dqxlVar);
                bsboVarE.e(new Function() { // from class: axfm
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        brzh brzhVar3 = (brzh) obj2;
                        eksp ekspVar = axfu.a;
                        return new brzi[]{brzhVar3.a, brzhVar3.d};
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bsboVarE.y(1);
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) bsboVarE.b().l();
                if (bindData != null) {
                    ekrw ekrwVarN = axfu.a.n();
                    ekrwVarN.X(cqnc.z, axcmVar2);
                    ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "loadSubscriptionByMyIdentity", 887, "SubscriptionsTracker.java")).r("loadSubscriptionByMyIdentity matches %s", bindData.r());
                    return bindData.R();
                }
                final axfu axfuVar3 = axfuVar;
                int iA = ekhxVar.isEmpty() ? axfuVar3.a() : ((Integer) Collection.EL.stream(ekhxVar).min(Comparator.CC.naturalOrder()).get()).intValue();
                ejwl.l(iA >= 0);
                brvp brvpVarH = axfu.h(iA);
                brvpVarH.I(str);
                brvpVarH.R(str);
                brvpVarH.E(axcmVar2);
                brvpVarH.F(axcmVar2);
                long jB = axjq.b(brvpVarH.a());
                eksl ekslVar = (eksl) axfu.a.j();
                ekslVar.X(cqnc.z, axcmVar2);
                ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "loadSubscriptionByMyIdentity", 907, "SubscriptionsTracker.java")).y("loadSubscriptionByMyIdentity created new row %s with subId %s", jB, iA);
                ((dqsn) axfuVar3.d.b()).g(new dqsm() { // from class: axfn
                    @Override // defpackage.dqsm
                    public final eieu a() {
                        eksp ekspVar = axfu.a;
                        return eiiy.k("loadSubscriptionByToken::runAfterCommit");
                    }
                }, axcmVar2.toString(), new Runnable() { // from class: axfo
                    @Override // java.lang.Runnable
                    public final void run() {
                        axfuVar3.q();
                    }
                });
                return String.valueOf(jB);
            }
        }), axcmVarB);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aoeu aoeuVar = new aoeu(fcxyVar, this.b, this.c);
        aoeuVar.d = obj;
        return aoeuVar;
    }
}
