package defpackage;

import j$.time.Instant;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chim extends ejvj {
    @Override // defpackage.ejvj
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        chit chitVar = (chit) obj;
        long j = chitVar.c;
        UUID uuidFromString = UUID.fromString(chitVar.o);
        uuidFromString.getClass();
        fhaz fhazVar = chitVar.p;
        if (fhazVar == null) {
            fhazVar = fhaz.a;
        }
        fhazVar.getClass();
        String str = chitVar.d;
        str.getClass();
        int i = chitVar.e;
        boolean z = chitVar.f;
        String str2 = chitVar.g;
        str2.getClass();
        int i2 = chitVar.h;
        String str3 = chitVar.i;
        str3.getClass();
        String str4 = chitVar.j;
        str4.getClass();
        boolean z2 = chitVar.k;
        String str5 = chitVar.l;
        str5.getClass();
        evvp evvpVar = chitVar.m;
        if (evvpVar == null) {
            evvpVar = evvp.a;
        }
        evvpVar.getClass();
        Instant instantD = evxd.d(evvpVar);
        int iA = elpc.a(chitVar.n);
        if (iA == 0) {
            iA = 1;
        }
        return new chij(j, uuidFromString, fhazVar, new chic(str, i, z, str2, i2, str3, str4, z2, str5, instantD, iA));
    }

    @Override // defpackage.ejvj
    public final /* synthetic */ Object b(Object obj) throws cgzt {
        chil chilVar = (chil) obj;
        chij chijVar = chilVar instanceof chij ? (chij) chilVar : null;
        if (chijVar == null) {
            Class<?> cls = chilVar.getClass();
            int i = fdcj.a;
            throw new cgzt(new fdbi(chij.class), new fdbi(cls));
        }
        chis chisVar = (chis) chit.a.createBuilder();
        chisVar.getClass();
        chisVar.copyOnWrite();
        ((chit) chisVar.instance).c = chijVar.a;
        chisVar.copyOnWrite();
        chit chitVar = (chit) chisVar.instance;
        chic chicVar = chijVar.d;
        chitVar.d = chicVar.a;
        chisVar.copyOnWrite();
        ((chit) chisVar.instance).e = chicVar.b;
        chisVar.copyOnWrite();
        ((chit) chisVar.instance).f = chicVar.c;
        chisVar.copyOnWrite();
        ((chit) chisVar.instance).g = chicVar.d;
        chisVar.copyOnWrite();
        ((chit) chisVar.instance).h = chicVar.e;
        chisVar.copyOnWrite();
        ((chit) chisVar.instance).i = chicVar.f;
        chisVar.copyOnWrite();
        ((chit) chisVar.instance).j = chicVar.g;
        chisVar.copyOnWrite();
        ((chit) chisVar.instance).k = chicVar.h;
        chisVar.copyOnWrite();
        ((chit) chisVar.instance).l = chicVar.i;
        evvp evvpVarB = evxd.b(chicVar.j);
        chisVar.copyOnWrite();
        chit chitVar2 = (chit) chisVar.instance;
        chitVar2.m = evvpVarB;
        chitVar2.b |= 1;
        chisVar.copyOnWrite();
        ((chit) chisVar.instance).n = chicVar.k - 1;
        String string = chijVar.b.toString();
        string.getClass();
        chisVar.copyOnWrite();
        ((chit) chisVar.instance).o = string;
        chisVar.copyOnWrite();
        chit chitVar3 = (chit) chisVar.instance;
        chitVar3.p = chijVar.c;
        chitVar3.b |= 2;
        evsn evsnVarBuild = chisVar.build();
        evsnVarBuild.getClass();
        return (chit) evsnVarBuild;
    }
}
