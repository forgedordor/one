package defpackage;

import com.google.android.rcs.client.messaging.data.MessageClass;

/* compiled from: PG */
/* loaded from: classes8.dex */
class cjbg extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        MessageClass messageClass = (MessageClass) obj;
        aufs aufsVar = (aufs) aufx.a.createBuilder();
        aufw aufwVar = (aufw) cjbu.a.fH().fM(messageClass.b());
        aufsVar.copyOnWrite();
        aufx aufxVar = (aufx) aufsVar.instance;
        aufxVar.c = aufwVar.d;
        aufxVar.b |= 1;
        aufu aufuVar = (aufu) cjbu.b.fH().fM(messageClass.a());
        aufsVar.copyOnWrite();
        aufx aufxVar2 = (aufx) aufsVar.instance;
        aufxVar2.d = aufuVar.e;
        aufxVar2.b |= 2;
        boolean zD = messageClass.d();
        aufsVar.copyOnWrite();
        aufx aufxVar3 = (aufx) aufsVar.instance;
        aufxVar3.b |= 4;
        aufxVar3.e = zD;
        boolean zC = messageClass.c();
        aufsVar.copyOnWrite();
        aufx aufxVar4 = (aufx) aufsVar.instance;
        aufxVar4.b |= 8;
        aufxVar4.f = zC;
        return (aufx) aufsVar.build();
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        aufx aufxVar = (aufx) obj;
        efjw efjwVarE = MessageClass.e();
        if ((aufxVar.b & 1) != 0) {
            ejvj ejvjVar = cjbu.a;
            aufw aufwVarB = aufw.b(aufxVar.c);
            if (aufwVarB == null) {
                aufwVarB = aufw.UNKNOWN_MESSAGE_SOURCE;
            }
            efjwVarE.e((efjy) ejvjVar.fM(aufwVarB));
        }
        if ((aufxVar.b & 2) != 0) {
            ejvj ejvjVar2 = cjbu.b;
            aufu aufuVarB = aufu.b(aufxVar.d);
            if (aufuVarB == null) {
                aufuVarB = aufu.UNKNOWN_MESSAGE_PRIORITY;
            }
            efjwVarE.d((efjx) ejvjVar2.fM(aufuVarB));
        }
        if ((aufxVar.b & 4) != 0) {
            efjwVarE.c(aufxVar.e);
        }
        if ((aufxVar.b & 8) != 0) {
            efjwVarE.b(aufxVar.f);
        }
        return efjwVarE.a();
    }
}
