package defpackage;

import com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2;
import com.google.communication.synapse.security.scytale.Scope;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwfh extends fcyz implements fdat {
    int a;
    final /* synthetic */ bwfq b;
    final /* synthetic */ ekot c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwfh(fcxy fcxyVar, bwfq bwfqVar, ekot ekotVar) {
        super(2, fcxyVar);
        this.b = bwfqVar;
        this.c = ekotVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bwfh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Scope scope;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            scope = (Scope) this.d;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            bwfq bwfqVar = this.b;
            bwfqVar.b.b();
            Scope scopeCreate = Scope.create(((bwkr) bwfqVar.f.b()).b());
            eiju eijuVarB = ((bwbn) bwfqVar.h.b()).b(bwfqVar.l.d);
            eijuVarB.getClass();
            this.d = scopeCreate;
            this.a = 1;
            obj = fdxs.c(eijuVarB, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            scope = scopeCreate;
        }
        return Boolean.valueOf(((ArrayList) bwlb.a(((NativeMessageEncryptorV2) obj).checkMissingSessions(scope, ekjz.a(this.c.v())))).isEmpty());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bwfh bwfhVar = new bwfh(fcxyVar, this.b, this.c);
        bwfhVar.d = obj;
        return bwfhVar;
    }
}
