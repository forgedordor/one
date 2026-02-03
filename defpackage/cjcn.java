package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
class cjcn extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        cjih cjihVar = (cjih) obj;
        aufs aufsVar = (aufs) aufx.a.createBuilder();
        if ((cjihVar.b & 1) != 0) {
            ejvj ejvjVarFH = cjdu.a.fH();
            cjig cjigVarB = cjig.b(cjihVar.c);
            if (cjigVarB == null) {
                cjigVarB = cjig.UNKNOWN_MESSAGE_SOURCE;
            }
            aufw aufwVar = (aufw) ejvjVarFH.fM(cjigVarB);
            aufsVar.copyOnWrite();
            aufx aufxVar = (aufx) aufsVar.instance;
            aufxVar.c = aufwVar.d;
            aufxVar.b |= 1;
        }
        if ((cjihVar.b & 2) != 0) {
            ejvj ejvjVarFH2 = cjdu.b.fH();
            cjie cjieVarB = cjie.b(cjihVar.d);
            if (cjieVarB == null) {
                cjieVarB = cjie.UNKNOWN_MESSAGE_PRIORITY;
            }
            aufu aufuVar = (aufu) ejvjVarFH2.fM(cjieVarB);
            aufsVar.copyOnWrite();
            aufx aufxVar2 = (aufx) aufsVar.instance;
            aufxVar2.d = aufuVar.e;
            aufxVar2.b |= 2;
        }
        if ((cjihVar.b & 4) != 0) {
            boolean z = cjihVar.e;
            aufsVar.copyOnWrite();
            aufx aufxVar3 = (aufx) aufsVar.instance;
            aufxVar3.b |= 4;
            aufxVar3.e = z;
        }
        if ((cjihVar.b & 8) != 0) {
            boolean z2 = cjihVar.f;
            aufsVar.copyOnWrite();
            aufx aufxVar4 = (aufx) aufsVar.instance;
            aufxVar4.b |= 8;
            aufxVar4.f = z2;
        }
        return (aufx) aufsVar.build();
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        aufx aufxVar = (aufx) obj;
        cjic cjicVar = (cjic) cjih.a.createBuilder();
        if ((aufxVar.b & 1) != 0) {
            ejvj ejvjVar = cjdu.a;
            aufw aufwVarB = aufw.b(aufxVar.c);
            if (aufwVarB == null) {
                aufwVarB = aufw.UNKNOWN_MESSAGE_SOURCE;
            }
            cjig cjigVar = (cjig) ejvjVar.fM(aufwVarB);
            cjicVar.copyOnWrite();
            cjih cjihVar = (cjih) cjicVar.instance;
            cjihVar.c = cjigVar.d;
            cjihVar.b |= 1;
        }
        if ((aufxVar.b & 2) != 0) {
            ejvj ejvjVar2 = cjdu.b;
            aufu aufuVarB = aufu.b(aufxVar.d);
            if (aufuVarB == null) {
                aufuVarB = aufu.UNKNOWN_MESSAGE_PRIORITY;
            }
            cjie cjieVar = (cjie) ejvjVar2.fM(aufuVarB);
            cjicVar.copyOnWrite();
            cjih cjihVar2 = (cjih) cjicVar.instance;
            cjihVar2.d = cjieVar.e;
            cjihVar2.b |= 2;
        }
        if ((aufxVar.b & 4) != 0) {
            boolean z = aufxVar.e;
            cjicVar.copyOnWrite();
            cjih cjihVar3 = (cjih) cjicVar.instance;
            cjihVar3.b |= 4;
            cjihVar3.e = z;
        }
        if ((aufxVar.b & 8) != 0) {
            boolean z2 = aufxVar.f;
            cjicVar.copyOnWrite();
            cjih cjihVar4 = (cjih) cjicVar.instance;
            cjihVar4.b |= 8;
            cjihVar4.f = z2;
        }
        return (cjih) cjicVar.build();
    }
}
