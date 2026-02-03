package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dltz {
    public static final dltm a(dltt dlttVar) {
        if (c(dlttVar)) {
            return dltl.a;
        }
        throw new IllegalArgumentException("Local attachment source wasn't set");
    }

    public static final dltt b(dltn dltnVar) {
        dltp dltpVar = (dltp) dltt.a.createBuilder();
        dltpVar.getClass();
        String strA = dltnVar.b().a();
        strA.getClass();
        dltpVar.copyOnWrite();
        dltt dlttVar = (dltt) dltpVar.instance;
        dlttVar.b |= 1;
        dlttVar.e = strA;
        dltu.b(dltnVar.f(), dltpVar);
        long jA = dltnVar.a();
        dltpVar.copyOnWrite();
        dltt dlttVar2 = (dltt) dltpVar.instance;
        dlttVar2.b |= 4;
        dlttVar2.g = jA;
        String strD = dltnVar.d();
        if (strD != null) {
            dltpVar.copyOnWrite();
            dltt dlttVar3 = (dltt) dltpVar.instance;
            dlttVar3.b |= 8;
            dlttVar3.h = strD;
        }
        evvp evvpVarB = evxd.b(dltnVar.c());
        dltpVar.copyOnWrite();
        dltt dlttVar4 = (dltt) dltpVar.instance;
        dlttVar4.i = evvpVarB;
        dlttVar4.b |= 16;
        if (dltnVar.fo() instanceof dltl) {
            dltr dltrVar = (dltr) dlts.a.createBuilder();
            dltrVar.getClass();
            evsn evsnVarBuild = dltrVar.build();
            evsnVarBuild.getClass();
            dltpVar.copyOnWrite();
            dltt dlttVar5 = (dltt) dltpVar.instance;
            dlttVar5.d = (dlts) evsnVarBuild;
            dlttVar5.c = BasePaymentResult.ERROR_REQUEST_FAILED;
        }
        return dltu.a(dltpVar);
    }

    public static final boolean c(dltt dlttVar) {
        int i = dlttVar.c;
        return (dltq.a(i) == 0 || dltq.a(i) == 1) ? false : true;
    }

    public static final void d(dlty dltyVar, dltt dlttVar) {
        String str = dlttVar.e;
        str.getClass();
        doig doigVarA = dohx.a(str);
        if (doigVarA == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        dltyVar.e(doigVarA);
        String str2 = dlttVar.f;
        str2.getClass();
        dltyVar.u(str2);
        dltyVar.r(dlttVar.g);
        dltt dlttVar2 = (dlttVar.b & 8) == 0 ? null : dlttVar;
        if (dlttVar2 != null) {
            String str3 = dlttVar2.h;
            str3.getClass();
            dltyVar.d(str3);
        }
        evvp evvpVar = dlttVar.i;
        if (evvpVar == null) {
            evvpVar = evvp.a;
        }
        evvpVar.getClass();
        dltyVar.c(evxd.d(evvpVar));
    }
}
