package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asqn extends fcyz implements fdat {
    int a;
    final /* synthetic */ asqr b;
    final /* synthetic */ ConversationIdType c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asqn(asqr asqrVar, ConversationIdType conversationIdType, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = asqrVar;
        this.c = conversationIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((asqn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            asqr asqrVar = this.b;
            ConversationIdType conversationIdType = this.c;
            this.a = 1;
            obj = asqrVar.a(conversationIdType, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            return asqe.HIDE;
        }
        bmma bmmaVarA = bmmf.a();
        bmmaVarA.A("getToolstoneState");
        bmln[] bmlnVarArr = {(bmln) new Function() { // from class: asql
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return ((bmlm) obj2).e;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(bmmf.c)};
        int iIntValue = bmmf.c().intValue();
        if (((Integer) bmmf.b.getOrDefault(bmlnVarArr[0].toString(), -1)).intValue() > iIntValue) {
            dqru.x("columnReference.toString()", iIntValue);
        }
        bmmaVarA.m(bmlnVarArr);
        final ConversationIdType conversationIdType2 = this.c;
        bmmaVarA.c(new Function() { // from class: asqm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bmme bmmeVar = (bmme) obj2;
                bmmeVar.b(conversationIdType2);
                return bmmeVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekgb ekgbVarZ = bmmaVarA.b().z();
        if (ekgbVarZ.isEmpty() || ((bmkv) ekgbVarZ.get(0)).l() == asqe.NOT_SET) {
            this.b.b(conversationIdType2);
            Object objE = asqt.f.e();
            objE.getClass();
            return ((Boolean) objE).booleanValue() ? asqe.SHOW : asqe.HIDE;
        }
        asqe asqeVarL = ((bmkv) ekgbVarZ.get(0)).l();
        asqe asqeVar = asqe.HIDE;
        if (asqeVarL != asqeVar) {
            asqe asqeVarL2 = ((bmkv) ekgbVarZ.get(0)).l();
            asqeVarL2.getClass();
            return asqeVarL2;
        }
        if (((Boolean) asqt.k.e()).booleanValue()) {
            return this.b.f(4, conversationIdType2);
        }
        this.b.g(4, conversationIdType2);
        return asqeVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new asqn(this.b, this.c, fcxyVar);
    }
}
