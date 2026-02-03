package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awlu extends fcyz implements fdat {
    final /* synthetic */ awmk a;
    final /* synthetic */ awpx b;
    final /* synthetic */ bojh c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awlu(fcxy fcxyVar, awmk awmkVar, awpx awpxVar, bojh bojhVar) {
        super(2, fcxyVar);
        this.a = awmkVar;
        this.b = awpxVar;
        this.c = bojhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awlu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        bojh bojhVar = this.c;
        final ConversationIdType conversationIdTypeC = bojhVar.C();
        conversationIdTypeC.getClass();
        String[] strArr = boiv.a;
        boiq boiqVar = new boiq(boiv.a);
        boiqVar.A("CachingGroupManager#subscribeConversationToParticipantsChange");
        boiqVar.f(new Function() { // from class: awlf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                boiu boiuVar = (boiu) obj2;
                boiuVar.b(conversationIdTypeC);
                return boiuVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        boip boipVarB = boiqVar.b();
        awmk awmkVar = this.a;
        boipVarB.M(new awmg(awmkVar, this.b));
        return ((bakt) awmkVar.e.b()).K(bojhVar.C());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        awlu awluVar = new awlu(fcxyVar, this.a, this.b, this.c);
        awluVar.d = obj;
        return awluVar;
    }
}
