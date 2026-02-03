package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjer extends cjcx {
    static final ejvj a = new cjdu();
    static final ejvj b = new cjet();
    static final ejvj c = new cjdn();

    @Override // defpackage.cjcx
    public final void b(augw augwVar, cjlf cjlfVar) {
        aubq aubqVar = augwVar.d;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        cjgr cjgrVarA = cjdj.a(aubqVar, augwVar.i);
        cjlfVar.copyOnWrite();
        cjlg cjlgVar = (cjlg) cjlfVar.instance;
        cjlg cjlgVar2 = cjlg.a;
        cjgrVarA.getClass();
        cjlgVar.e = cjgrVarA;
        cjlgVar.b |= 4;
    }

    @Override // defpackage.cjcx
    public final void c(augw augwVar, cjlf cjlfVar) {
        cjia cjiaVar = (cjia) cjib.b.createBuilder();
        cjjv cjjvVar = (cjjv) cjjw.a.createBuilder();
        String str = augwVar.h;
        cjjvVar.copyOnWrite();
        cjjw cjjwVar = (cjjw) cjjvVar.instance;
        str.getClass();
        cjjwVar.b |= 1;
        cjjwVar.c = str;
        cjiaVar.copyOnWrite();
        cjib cjibVar = (cjib) cjiaVar.instance;
        cjjw cjjwVar2 = (cjjw) cjjvVar.build();
        cjjwVar2.getClass();
        cjibVar.d = cjjwVar2;
        cjibVar.c |= 1;
        aubq aubqVar = augwVar.c;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        cjju cjjuVarB = cjel.b(aubqVar);
        cjiaVar.copyOnWrite();
        cjib cjibVar2 = (cjib) cjiaVar.instance;
        cjjuVarB.getClass();
        cjibVar2.e = cjjuVarB;
        cjibVar2.c |= 2;
        cjii cjiiVar = (cjii) cjij.a.createBuilder();
        aubt aubtVar = augwVar.k;
        if (aubtVar == null) {
            aubtVar = aubt.a;
        }
        evqs evqsVar = aubtVar.d;
        cjiiVar.copyOnWrite();
        cjij cjijVar = (cjij) cjiiVar.instance;
        evqsVar.getClass();
        cjijVar.b |= 2;
        cjijVar.d = evqsVar;
        ejvj ejvjVar = c;
        aubt aubtVar2 = augwVar.k;
        if (aubtVar2 == null) {
            aubtVar2 = aubt.a;
        }
        aubx aubxVar = aubtVar2.c;
        if (aubxVar == null) {
            aubxVar = aubx.a;
        }
        cjgl cjglVar = (cjgl) ejvjVar.fM(aubxVar);
        cjiiVar.copyOnWrite();
        cjij cjijVar2 = (cjij) cjiiVar.instance;
        cjglVar.getClass();
        cjijVar2.c = cjglVar;
        cjijVar2.b |= 1;
        cjiaVar.copyOnWrite();
        cjib cjibVar3 = (cjib) cjiaVar.instance;
        cjij cjijVar3 = (cjij) cjiiVar.build();
        cjijVar3.getClass();
        cjibVar3.a();
        cjibVar3.g.add(cjijVar3);
        if ((augwVar.b & 4) != 0) {
            aubq aubqVar2 = augwVar.e;
            if (aubqVar2 == null) {
                aubqVar2 = aubq.a;
            }
            cjju cjjuVarB2 = cjel.b(aubqVar2);
            cjiaVar.copyOnWrite();
            cjib cjibVar4 = (cjib) cjiaVar.instance;
            cjjuVarB2.getClass();
            cjibVar4.f = cjjuVarB2;
            cjibVar4.c |= 4;
        }
        if ((augwVar.b & 128) != 0) {
            eyga eygaVar = augwVar.j;
            if (eygaVar == null) {
                eygaVar = eyga.a;
            }
            cjiaVar.copyOnWrite();
            cjib cjibVar5 = (cjib) cjiaVar.instance;
            eygaVar.getClass();
            cjibVar5.i = eygaVar;
            cjibVar5.c |= 16;
        }
        cjib cjibVar6 = (cjib) cjiaVar.build();
        cjlfVar.copyOnWrite();
        cjlg cjlgVar = (cjlg) cjlfVar.instance;
        cjlg cjlgVar2 = cjlg.a;
        cjibVar6.getClass();
        cjlgVar.f = cjibVar6;
        cjlgVar.b |= 8;
    }

    @Override // defpackage.cjcx
    public final void d(augw augwVar, cjlf cjlfVar) {
        evqd evqdVar = (evqd) evqe.a.createBuilder();
        evqs evqsVar = augwVar.l;
        evqdVar.copyOnWrite();
        evqe evqeVar = (evqe) evqdVar.instance;
        evqsVar.getClass();
        evqeVar.c = evqsVar;
        evqe evqeVar2 = (evqe) evqdVar.build();
        cjlfVar.copyOnWrite();
        cjlg cjlgVar = (cjlg) cjlfVar.instance;
        cjlg cjlgVar2 = cjlg.a;
        evqeVar2.getClass();
        cjlgVar.c = evqeVar2;
        cjlgVar.b |= 1;
    }

    @Override // defpackage.cjcx
    public final void e(cjlf cjlfVar) {
        cjix cjixVar = cjix.MESSAGING_METHOD_CHAT;
        cjlfVar.copyOnWrite();
        cjlg cjlgVar = (cjlg) cjlfVar.instance;
        cjlg cjlgVar2 = cjlg.a;
        cjlgVar.h = cjixVar.d;
        cjlgVar.b |= 32;
    }
}
