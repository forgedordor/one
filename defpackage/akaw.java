package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akaw extends fcyz implements fdat {
    final /* synthetic */ akbc a;
    final /* synthetic */ awjb b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akaw(fcxy fcxyVar, akbc akbcVar, awjb awjbVar) {
        super(2, fcxyVar);
        this.a = akbcVar;
        this.b = awjbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akaw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        botb botbVarE = botm.e();
        akbc akbcVar = this.a;
        botbVarE.f(new akax(akbcVar));
        botbVarE.i(new akay(this.b));
        botbVarE.A("DestinationConversationMatcher#matchRcsGroupConversation");
        ekgb ekgbVarZ = botbVarE.b().z();
        ekgbVarZ.getClass();
        ((ains) akbcVar.b.b()).e("Bugle.Cme.Destination.Conversation.Match.Fallback", ekgbVarZ.isEmpty() ? 3 : ekgbVarZ.size() > 1 ? 2 : (akbcVar.e.a() && ((bojh) fcva.X(ekgbVarZ)).B() != null) ? 7 : 1);
        if (ekgbVarZ.size() <= 1) {
            return fcva.Y(ekgbVarZ);
        }
        ekrw ekrwVarJ = akbc.a.j();
        ekrwVarJ.X(eksq.a, "BugleCME");
        ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/destination/BugleDestinationConversationMatcher$matchRcsGroupConversationFallback$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 187, "BugleDestinationConversationMatcher.kt")).q("Found more than one conversation for an RCS group.");
        Iterator<E> it = ekgbVarZ.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((bojh) next).C().a;
            do {
                Object next2 = it.next();
                long j2 = ((bojh) next2).C().a;
                if (j < j2) {
                    j = j2;
                }
                if (j < j2) {
                    next = next2;
                }
            } while (it.hasNext());
        }
        return next;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        akaw akawVar = new akaw(fcxyVar, this.a, this.b);
        akawVar.c = obj;
        return akawVar;
    }
}
