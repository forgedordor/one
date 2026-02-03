package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csyx implements bayk, bayb, baye {
    private final aqcf a;

    public csyx(aqcf aqcfVar) {
        this.a = aqcfVar;
    }

    private static final void m(final MessageCoreData messageCoreData, final int i, int i2) {
        if (csyw.a(messageCoreData)) {
            bsbs bsbsVarF = ParticipantsTable.f();
            bsbsVarF.ap("recordInviteStateInVideoReachability");
            bsbsVarF.S(i2);
            bsbsVarF.U(new Function() { // from class: csyv
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsbx bsbxVar = (bsbx) obj;
                    boca bocaVarA = bocg.a();
                    bocaVarA.c(bocg.c.c);
                    final MessageCoreData messageCoreData2 = messageCoreData;
                    bocaVarA.d(new Function() { // from class: csyu
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            bocf bocfVar = (bocf) obj2;
                            bocfVar.b(messageCoreData2.A());
                            return bocfVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bsbxVar.l(bocaVarA.b());
                    int iIntValue = ParticipantsTable.i().intValue();
                    if (iIntValue < 13050) {
                        dqru.x("video_reachability", iIntValue);
                    }
                    bsbxVar.ap(new dqty("participants.video_reachability", 1, Integer.valueOf(i)));
                    return bsbxVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bsbsVarF.b().e();
        }
    }

    @Override // defpackage.baye
    public final /* synthetic */ eieu c() {
        return bayd.a();
    }

    @Override // defpackage.bayb
    public final void d(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        if (this.a.a()) {
            m(messageCoreData, 8, 10);
        }
    }

    @Override // defpackage.baye, defpackage.baxz
    public final /* synthetic */ void e(String str) {
    }

    @Override // defpackage.bayk
    public final void f(MessageCoreData messageCoreData, MessageIdType messageIdType) {
        messageCoreData.getClass();
        messageIdType.getClass();
        if (this.a.a()) {
            m(messageCoreData, 7, 11);
        }
    }

    @Override // defpackage.baye, defpackage.baxz
    public final void gb(MessageCoreData messageCoreData) {
        if (this.a.a()) {
            m(messageCoreData, 8, 10);
        }
    }

    @Override // defpackage.bayk
    public final boolean j() {
        return this.a.a();
    }

    @Override // defpackage.bayb
    public final /* synthetic */ void k(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.bayb
    public final /* synthetic */ void e(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.bayb
    public final void g(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bayk
    public final /* synthetic */ void h(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bayk
    public final /* synthetic */ void i(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bayk
    public final /* synthetic */ Object a(MessageCoreData messageCoreData, fcxy fcxyVar) {
        return messageCoreData;
    }

    @Override // defpackage.baye
    public final /* synthetic */ void l(long j, fhaz fhazVar) {
    }

    @Override // defpackage.bayk
    public final /* synthetic */ Object b(MessageCoreData messageCoreData, List list, fcxy fcxyVar) {
        return messageCoreData;
    }
}
