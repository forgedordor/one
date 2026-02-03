package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class baqx {
    private final fcsu a;
    private final fcsu b;

    public baqx(fcsu fcsuVar, fcsu fcsuVar2) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
    }

    public final ConversationIdType a(String str) {
        bojh bojhVarB = b(str);
        return bojhVarB == null ? barn.a : bojhVarB.C();
    }

    public final bojh b(final String str) {
        eieu eieuVarK = eiiy.k("GetConversationDataFromOtherParticipantDestination#getConversationDataFromOtherParticipantDestination");
        try {
            ecem.b();
            botb botbVarE = botm.e();
            botbVarE.A("getConversationDataFromOtherParticipantDestination");
            botbVarE.i(new Function() { // from class: baqw
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    botl botlVar = (botl) obj;
                    botlVar.C(str);
                    return botlVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bopp boppVar = botm.c;
            botbVarE.e(new bosy(boppVar.r, false), new bosy(boppVar.a, false));
            bopr boprVar = (bopr) botbVarE.b().p();
            try {
                cqaz.d(boprVar.getCount(), 0, 1);
                if (boprVar.getCount() > 1) {
                    ((ains) this.a.b()).e("Bugle.Datamodel.Operations.GetConversationFromOtherParticipantDestination.ReturnedMoreThanOneConversation", boprVar.getCount());
                    ((ayjj) this.b.b()).a(false).j();
                }
                bojh bojhVar = null;
                if (boprVar.moveToFirst()) {
                    bojh bojhVar2 = (bojh) boprVar.cQ();
                    if (bojhVar2 != null) {
                        bojhVar = bojhVar2;
                    }
                }
                boprVar.close();
                eieuVarK.close();
                return bojhVar;
            } finally {
            }
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
