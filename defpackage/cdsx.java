package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdsx {
    public static final dqxe a;

    static {
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("MatrixQueries.containsMatrixParticipant");
        bsboVarE.f(new Function() { // from class: cdst
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                dqxe dqxeVar = cdsx.a;
                return ((brzh) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsboVarE.h(new Function() { // from class: cdsu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsbx bsbxVar = (bsbx) obj;
                dqxe dqxeVar = cdsx.a;
                String[] strArr = boiv.a;
                boiq boiqVar = new boiq(boiv.a);
                boiqVar.e(new Function() { // from class: cdsv
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        dqxe dqxeVar2 = cdsx.a;
                        return ((boic) obj2).b;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                boiqVar.f(new Function() { // from class: cdsw
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        boiu boiuVar = (boiu) obj2;
                        dqxe dqxeVar2 = cdsx.a;
                        boiuVar.c(botm.c.a);
                        return boiuVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bsbxVar.l(boiqVar.b());
                int iIntValue = ParticipantsTable.i().intValue();
                if (iIntValue < 12001) {
                    dqru.x("participant_type", iIntValue);
                }
                bsbxVar.ap(new dqty("participants.participant_type", 1, 2));
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        a = new dqwh(bsboVarE.b());
    }
}
