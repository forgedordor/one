package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckdc {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;

    public ckdc(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fcsuVar4;
    }

    public final MessageIdType a(final basd basdVar, final String str) {
        int i;
        String[] strArr = MessagesTable.a;
        brdu brduVar = new brdu();
        brduVar.ap("processRcsDeleteMessage");
        brduVar.q(true);
        brduVar.X(new Function() { // from class: ckcx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                brecVar.W(str);
                brecVar.N(basdVar);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        if (brduVar.b().e() == 0) {
            return null;
        }
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("RcsDeleteDatabaseHandler-deleteMessage");
        brdrVarD.h(new Function() { // from class: ckcy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                brecVar.N(basdVar);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekgb ekgbVarZ = brdrVarD.b().z();
        ekgbVarZ.getClass();
        MessagesTable.BindData bindData = (MessagesTable.BindData) fcva.P(ekgbVarZ);
        if (bindData == null) {
            return null;
        }
        if (MessageData.cJ(bindData.s())) {
            i = 117;
        } else {
            if (!MessageData.cT(bindData.s())) {
                return null;
            }
            i = 23;
        }
        bveg bvegVar = (bveg) this.a.b();
        bquv bquvVar = new bquv();
        bquvVar.ag(bindData.Z());
        bquvVar.ai(bindData.aa());
        bquvVar.W(((auau) this.c.b()).a());
        bquvVar.m(bindData.D());
        bquvVar.aq(i);
        bquvVar.P(bindData.m());
        bquvVar.y(bindData.k());
        bquvVar.aa(bindData.w());
        bquvVar.ak(bindData.z());
        ((bauh) this.b.b()).a(bvegVar.c(bquvVar.a(), fcvo.a));
        cdys cdysVar = (cdys) this.d.b();
        MessageIdType messageIdTypeE = bindData.E();
        cdye cdyeVar = cdysVar.a;
        cdyc cdycVar = (cdyc) cdyd.a.createBuilder();
        cdycVar.b(messageIdTypeE.b());
        ((cazj) cdyeVar.a.b()).g(cbcu.f("delete_message", (cdyd) cdycVar.build()));
        return bindData.E();
    }
}
