package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bway implements bvuy {
    private static final cqce a = cqce.g("BugleE2eeEtouffee", "ConversationDraftEncryptionUpdater");
    private final fcsu b;
    private final fcsu c;

    public bway(fcsu fcsuVar, fcsu fcsuVar2) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    @Override // defpackage.bvuy
    public final void a(final String str, boolean z) {
        if (bwbt.a()) {
            if (!z && bwbv.g()) {
                ekqg ekqgVarListIterator = ((bakt) this.b.b()).D(str).listIterator();
                while (ekqgVarListIterator.hasNext()) {
                    ConversationIdType conversationIdType = (ConversationIdType) ekqgVarListIterator.next();
                    cqbd cqbdVarC = a.c();
                    cqbdVarC.I("Disable encryption on the conversation.");
                    cqbdVarC.c(conversationIdType);
                    cqbdVarC.r();
                    ((bvus) this.c.b()).i(conversationIdType, 0, bwvi.DEFAULT);
                }
                return;
            }
            botb botbVarE = botm.e();
            botbVarE.A("onEncryptionStatusUpdate");
            botbVarE.i(new Function() { // from class: bwax
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
            bopr boprVar = (bopr) botbVarE.b().p();
            try {
                if (boprVar.moveToFirst()) {
                    bojh bojhVar = (bojh) boprVar.cQ();
                    if (bwbv.g()) {
                        cqbd cqbdVarC2 = a.c();
                        cqbdVarC2.I("Update encryption status.");
                        cqbdVarC2.c(bojhVar.C());
                        cqbdVarC2.B("encryptionEnabled", z);
                        cqbdVarC2.r();
                    }
                    ((bvus) this.c.b()).i(bojhVar.C(), z ? 1 : 0, bwvi.DEFAULT);
                }
                boprVar.close();
            } catch (Throwable th) {
                try {
                    boprVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }
}
