package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.IntFunction;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byox {
    private static final cqce a = cqce.g("BugleCms", "CmsConversationConsumer");
    private final fcsu b;
    private final fcsu c;

    public byox(fcsu fcsuVar, fcsu fcsuVar2) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    public static ConversationIdType a(bojh bojhVar, String str) {
        ecem.b();
        try {
            ConversationIdType conversationIdTypeD = bojhVar.D();
            if (!conversationIdTypeD.b()) {
                return conversationIdTypeD;
            }
            cqbd cqbdVarE = a.e();
            cqbdVarE.I("Insert conversation failed");
            cqbdVarE.A("cms_id", str);
            cqbdVarE.r();
            throw new cair();
        } catch (Throwable th) {
            if ((aqbf.a() || cpyl.a()) && (th instanceof Error)) {
                throw th;
            }
            cqbd cqbdVarE2 = a.e();
            cqbdVarE2.I("Insert conversation threw");
            cqbdVarE2.A("cms_id", str);
            cqbdVarE2.s(th);
            throw new cais(th);
        }
    }

    public static void b(ConversationIdType conversationIdType) {
        ecem.b();
        String[] strArr = botm.a;
        bote boteVar = new bote();
        boteVar.ap("markConversationRestoreComplete");
        boteVar.l(cpyi.RESTORED_FROM_CMS);
        boteVar.f(conversationIdType);
    }

    public static void d(cppd cppdVar, final ConversationIdType conversationIdType) {
        ecem.b();
        bohm[] bohmVarArr = (bohm[]) Collection.EL.stream(cppdVar.c()).map(new Function() { // from class: byot
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bohq bohqVarP = ((bohm) obj).p();
                bohqVarP.c(conversationIdType);
                return bohqVarP.a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).toArray(new IntFunction() { // from class: byou
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return new bohm[i];
            }
        });
        boiv.b(0, bohmVarArr);
        bocg.f(0, (boar[]) DesugarArrays.stream(bohmVarArr).map(new Function() { // from class: byov
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bohm bohmVar = (bohm) obj;
                String[] strArr = bocg.a;
                boau boauVar = new boau();
                boauVar.b(bohmVar.n());
                boauVar.c(bohmVar.k());
                boauVar.d(bohmVar.m());
                return boauVar.a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).toArray(new IntFunction() { // from class: byow
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return new boar[i];
            }
        }));
    }

    public final void c(ConversationIdType conversationIdType, bojh bojhVar) {
        ecem.b();
        ((bakt) this.b.b()).V(conversationIdType, bojhVar.H() == bvdp.NAME_IS_AUTOMATIC ? null : bojhVar.Y(), bojhVar.k(), true);
        cqbd cqbdVarC = a.c();
        cqbdVarC.I("Refreshing conversation");
        cqbdVarC.A("conv_id", conversationIdType);
        cqbdVarC.r();
        ((baqi) this.c.b()).b(conversationIdType, false, null);
    }
}
