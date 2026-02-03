package defpackage;

import com.google.communication.synapse.security.scytale.NativeBaseCrypto;
import com.google.communication.synapse.security.scytale.Scope;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwme extends fcyz implements fdat {
    int a;
    final /* synthetic */ bwmc b;
    final /* synthetic */ bwmg c;
    final /* synthetic */ Scope d;
    Object e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwme(fcxy fcxyVar, bwmc bwmcVar, bwmg bwmgVar, Scope scope) {
        super(2, fcxyVar);
        this.b = bwmcVar;
        this.c = bwmgVar;
        this.d = scope;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bwme) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        String str;
        Object obj2;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            obj2 = this.e;
            str = (String) this.f;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            bwmc bwmcVar = this.b;
            aubq aubqVar = bwmcVar.c;
            if (aubqVar == null) {
                aubqVar = aubq.a;
            }
            if (aubqVar == null) {
                throw new IllegalStateException("No self identity is available.");
            }
            str = aubqVar.d;
            str.getClass();
            if (str.length() == 0) {
                throw new IllegalStateException("No identifier available in the self identity chat endpoint.");
            }
            String str2 = bwmcVar.d;
            str2.getClass();
            eiju eijuVarA = ((bwbn) this.c.b.b()).a(str);
            this.f = str;
            this.e = str2;
            this.a = 1;
            Object objC = fdxs.c(eijuVarA, this);
            if (objC == fcylVar) {
                return fcylVar;
            }
            obj2 = str2;
            obj = objC;
        }
        cqbd cqbdVarC = bwmg.a.c();
        cqbdVarC.I("Deleting etouffee data");
        cqbdVarC.k(str);
        String str3 = (String) obj2;
        cqbdVarC.h(basd.a(str3));
        cqbdVarC.r();
        bwlb.b(((NativeBaseCrypto) obj).deleteMessageData(this.d, str3));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bwme bwmeVar = new bwme(fcxyVar, this.b, this.c, this.d);
        bwmeVar.f = obj;
        return bwmeVar;
    }
}
