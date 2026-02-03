package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crxw extends fcyz implements fdat {
    int a;
    final /* synthetic */ crxy b;
    final /* synthetic */ csdr c;
    final /* synthetic */ cryl d;
    final /* synthetic */ csdl e;
    final /* synthetic */ eoeo f;
    final /* synthetic */ int g;
    final /* synthetic */ eofg h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crxw(crxy crxyVar, csdr csdrVar, cryl crylVar, csdl csdlVar, eoeo eoeoVar, int i, eofg eofgVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = crxyVar;
        this.c = csdrVar;
        this.d = crylVar;
        this.e = csdlVar;
        this.f = eoeoVar;
        this.g = i;
        this.h = eofgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crxw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        crxw crxwVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            crxwVar = this;
        } else {
            cryk crykVar = (cryk) this.b.a.b();
            csdr csdrVar = this.c;
            cryl crylVar = this.d;
            MessageIdType messageIdTypeD = csdrVar.d();
            ConversationIdType conversationIdTypeC = csdrVar.c();
            csnx csnxVarE = csdrVar.e();
            this.a = 1;
            crxwVar = this;
            obj = crykVar.k(messageIdTypeD, conversationIdTypeC, csnxVarE, crylVar, crxwVar);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        crxy crxyVar = crxwVar.b;
        csdl csdlVar = crxwVar.e;
        eoeo eoeoVar = crxwVar.f;
        int i2 = crxwVar.g;
        eofg eofgVar = crxwVar.h;
        eofc eofcVar = (eofc) obj;
        eoel eoelVarA = crxy.a(csdlVar, eoeoVar, i2);
        eoelVarA.copyOnWrite();
        eoem eoemVar = (eoem) eoelVarA.instance;
        eoem eoemVar2 = eoem.a;
        eoemVar.j = eofgVar.a();
        eoemVar.b |= 64;
        eoem eoemVar3 = (eoem) eoelVarA.build();
        eofcVar.copyOnWrite();
        eofe eofeVar = (eofe) eofcVar.instance;
        eofe eofeVar2 = eofe.a;
        eoemVar3.getClass();
        eofeVar.d = eoemVar3;
        eofeVar.c = 4;
        cryb crybVar = (cryb) crxyVar.b.b();
        eoea eoeaVar = (eoea) eoeb.a.createBuilder();
        eoeaVar.copyOnWrite();
        eoeb eoebVar = (eoeb) eoeaVar.instance;
        eofe eofeVar3 = (eofe) eofcVar.build();
        eofeVar3.getClass();
        eoebVar.c = eofeVar3;
        eoebVar.b = 1;
        evsn evsnVarBuild = eoeaVar.build();
        evsnVarBuild.getClass();
        crybVar.b((eoeb) evsnVarBuild);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new crxw(this.b, this.c, this.d, this.e, this.f, this.g, this.h, fcxyVar);
    }
}
