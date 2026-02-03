package defpackage;

import com.google.android.rcs.client.messaging.data.MessageClass;

/* compiled from: PG */
/* loaded from: classes5.dex */
class efox extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        MessageClass messageClass = (MessageClass) obj;
        cjic cjicVar = (cjic) cjih.a.createBuilder();
        cjig cjigVar = (cjig) efqg.a.fH().fM(messageClass.b());
        cjicVar.copyOnWrite();
        cjih cjihVar = (cjih) cjicVar.instance;
        cjihVar.c = cjigVar.d;
        cjihVar.b |= 1;
        cjie cjieVar = (cjie) efqg.b.fH().fM(messageClass.a());
        cjicVar.copyOnWrite();
        cjih cjihVar2 = (cjih) cjicVar.instance;
        cjihVar2.d = cjieVar.e;
        cjihVar2.b |= 2;
        boolean zD = messageClass.d();
        cjicVar.copyOnWrite();
        cjih cjihVar3 = (cjih) cjicVar.instance;
        cjihVar3.b |= 4;
        cjihVar3.e = zD;
        boolean zC = messageClass.c();
        cjicVar.copyOnWrite();
        cjih cjihVar4 = (cjih) cjicVar.instance;
        cjihVar4.b |= 8;
        cjihVar4.f = zC;
        return (cjih) cjicVar.build();
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        cjih cjihVar = (cjih) obj;
        efjw efjwVarE = MessageClass.e();
        if ((cjihVar.b & 1) != 0) {
            ejvj ejvjVar = efqg.a;
            cjig cjigVarB = cjig.b(cjihVar.c);
            if (cjigVarB == null) {
                cjigVarB = cjig.UNKNOWN_MESSAGE_SOURCE;
            }
            efjwVarE.e((efjy) ejvjVar.fM(cjigVarB));
        }
        if ((cjihVar.b & 2) != 0) {
            ejvj ejvjVar2 = efqg.b;
            cjie cjieVarB = cjie.b(cjihVar.d);
            if (cjieVarB == null) {
                cjieVarB = cjie.UNKNOWN_MESSAGE_PRIORITY;
            }
            efjwVarE.d((efjx) ejvjVar2.fM(cjieVarB));
        }
        if ((cjihVar.b & 4) != 0) {
            efjwVarE.c(cjihVar.e);
        }
        if ((cjihVar.b & 8) != 0) {
            efjwVarE.b(cjihVar.f);
        }
        return efjwVarE.a();
    }
}
