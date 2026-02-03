package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzkx implements bzhz {
    private final eosc a;

    public bzkx(eosc eoscVar) {
        this.a = eoscVar;
    }

    @Override // defpackage.bzhz
    public final eiju a(final int i, final aumf aumfVar, final int i2) {
        if (i > 0) {
            return eijx.g(new Callable() { // from class: bzku
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    bsbo bsboVarE = ParticipantsTable.e();
                    bsboVarE.A("ParticipantBatchBackupScheduler#schedule");
                    long j = aumfVar.c;
                    bsbx bsbxVar = new bsbx();
                    ekhx ekhxVar = cpyi.w;
                    int iIntValue = ParticipantsTable.i().intValue();
                    if (iIntValue < 58210) {
                        dqru.x("cms_life_cycle", iIntValue);
                    }
                    final int i3 = i2;
                    int i4 = i;
                    bsbxVar.ap(new dqpm("participants.cms_life_cycle", 3, bsbx.as((Iterable) ekpo.a(ekhxVar).map(new Function() { // from class: bsbw
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return Integer.valueOf(((cpyi) obj).ordinal());
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.toCollection(new bsbv()))), true));
                    bsbxVar.n(j);
                    bsbxVar.b(new Function() { // from class: bzkv
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bsbx bsbxVar2 = (bsbx) obj;
                            bsbxVar2.v(-1);
                            return bsbxVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: bzkw
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bsbx bsbxVar2 = (bsbx) obj;
                            bsbxVar2.v(-2);
                            return bsbxVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bsbxVar.g();
                    bsboVarE.g(bsbxVar);
                    bsboVarE.d(new bsbl(ParticipantsTable.c.a, false));
                    bsboVarE.y(i4);
                    Stream map = Collection.EL.stream(bsboVarE.b().f()).map(new Function() { // from class: bzkt
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return bzhy.a(3, (String) obj, bzas.a(17), i3);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int i5 = ekgb.d;
                    return (ekgb) map.collect(ekcv.a);
                }
            }, this.a);
        }
        int i3 = ekgb.d;
        return eijx.e(ekoe.a);
    }
}
