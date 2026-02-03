package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dabb extends fcyz implements fdat {
    int a;
    final /* synthetic */ dabc b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dabb(dabc dabcVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dabcVar;
        this.c = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dabb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objC;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            objC = obj;
        } else {
            eiju eijuVarB = this.b.a.a().b();
            eijuVarB.getClass();
            this.a = 1;
            objC = fdxs.c(eijuVarB, this);
            if (objC == fcylVar) {
                return fcylVar;
            }
        }
        dabc dabcVar = this.b;
        ekgb ekgbVar = (ekgb) objC;
        if (dabcVar.b >= ekgbVar.size()) {
            return new byar(this.c, "", dabcVar.e, dabcVar.f, false, dabcVar.g, dabcVar.d);
        }
        final SelfIdentityId selfIdentityIdH = ((aoer) ekgbVar.get(dabcVar.b)).h();
        brdr brdrVarD = MessagesTable.d();
        brao braoVar = MessagesTable.c.b;
        brdrVarD.c(braoVar);
        brdrVarD.h(new Function() { // from class: daba
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                brec brecVar = (brec) obj2;
                brecVar.V(selfIdentityIdH.b());
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.w(braoVar);
        brdp brdpVarB = brdrVarD.b();
        String[] strArr = bdxk.a;
        bdxj bdxjVar = new bdxj();
        bdxjVar.ap(new dqpk("conversations._id", 3, brdpVarB));
        String[] strArr2 = bcve.a;
        bcvd bcvdVar = new bcvd();
        bcvdVar.e(brdpVarB);
        return new byar(this.c, ((aoer) ekgbVar.get(dabcVar.b)).q(), bdxjVar, bcvdVar, ekgbVar.size() > 1, dabcVar.g, dabcVar.d);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dabb(this.b, this.c, fcxyVar);
    }
}
