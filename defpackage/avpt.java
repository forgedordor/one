package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avpt extends fcyz implements fdat {
    final /* synthetic */ ConversationIdType a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avpt(ConversationIdType conversationIdType, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = conversationIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avpt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        String[] strArr = avrd.a;
        avqu avquVar = new avqu();
        final ConversationIdType conversationIdType = this.a;
        avquVar.c(new Function() { // from class: avps
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                avrc avrcVar = (avrc) obj2;
                avrcVar.b(conversationIdType);
                return avrcVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        avquVar.f("removeUpgradedMmsGroupFromCache");
        int iD = avquVar.d();
        ekrw ekrwVarH = avpu.a.h();
        ekrwVarH.X(eksq.a, "BugleBCM");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.s, conversationIdType);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/conversation/match/ConversationMatcherCacheClearer$onMmsGroupUpgraded$1", "invokeSuspend", 45, "ConversationMatcherCacheClearer.kt")).r("onMmsGroupUpgraded: Removed %s entries from BCM cache", iD);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new avpt(this.a, fcxyVar);
    }
}
