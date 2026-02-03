package defpackage;

import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akaq extends fcyz implements fdat {
    final /* synthetic */ akbc a;
    final /* synthetic */ awjl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akaq(akbc akbcVar, awjl awjlVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = akbcVar;
        this.b = awjlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akaq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        botb botbVarE = botm.e();
        final awjl awjlVar = this.b;
        botbVarE.i(new Function() { // from class: akap
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                botl botlVar = (botl) obj2;
                botlVar.m(awjlVar);
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        botbVarE.e(new bosy(botm.c.r, false));
        botbVarE.A("DestinationConversationMatcher#matchByForeignKey");
        ekgb ekgbVarZ = botbVarE.b().z();
        ekgbVarZ.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVarZ, 10));
        Iterator<E> it = ekgbVarZ.iterator();
        while (it.hasNext()) {
            arrayList.add(((bojh) it.next()).C());
        }
        akbc akbcVar = this.a;
        if (arrayList.size() == 1) {
            ((ains) akbcVar.b.b()).e("Bugle.Cme.Destination.Conversation.Match.Fallback", 6);
        }
        if (arrayList.size() > 1) {
            ekrw ekrwVarJ = akbc.a.j();
            ekrwVarJ.X(eksq.a, "BugleCME");
            ekrd ekrdVar = (ekrd) ekrwVarJ;
            ekrdVar.X(cqnc.ag, awjlVar);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/destination/BugleDestinationConversationMatcher", "logForeignKeyMatchResult", 308, "BugleDestinationConversationMatcher.kt")).t("DestinationToken map to multiple conversations %s", arrayList);
            ((ains) akbcVar.b.b()).e("Bugle.Cme.Destination.Conversation.Match.Fallback", 9);
        }
        return fcva.P(arrayList);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akaq(this.a, this.b, fcxyVar);
    }
}
