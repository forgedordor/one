package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eait {
    private static final eanu a = new eanu();
    private static volatile eans b;

    public static synchronized eavo a(Context context) {
        eawn eawnVar;
        try {
            context.getClass();
            String packageName = context.getPackageName();
            int i = 0;
            try {
                i = context.getPackageManager().getPackageInfo(packageName, 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (packageName == null) {
                throw new NullPointerException("Null packageName");
            }
            eawnVar = new eawn(packageName, i);
            ejwl.b(!eawnVar.a.isEmpty(), "Package name must not be empty.");
        } catch (Error | RuntimeException e) {
            eawq.b(e);
            throw e;
        }
        return b(context, eawnVar);
    }

    public static synchronized eavo b(Context context, eawo eawoVar) {
        eanm eanmVar;
        eanu eanuVar;
        eanb eanbVar;
        eaix eaixVar;
        eajb eajbVar;
        eajc eajcVarC;
        diep diepVar;
        fbqm fbqmVar;
        eajc eajcVarC2;
        diep diepVar2;
        Object objB;
        Object objB2;
        ealm ealmVarD;
        try {
            ejwl.m(c(), "Places must be initialized first.");
            eyik eyikVar = eann.a;
            eanmVar = new eanm(context, a, eawoVar);
            eanuVar = eanmVar.a;
            eaww eawwVar = new eaww(eanmVar.b);
            eajj eajjVar = new eajj(eanmVar.b(), new eams());
            eajo eajoVar = new eajo(eanmVar.b());
            eajc eajcVarC3 = eanmVar.c();
            eyik eyikVar2 = eanmVar.e;
            diep diepVar3 = (diep) eyikVar2.b();
            int i = eanc.a;
            eanbVar = new eanb(eanuVar, eawwVar, eajjVar, eajoVar, eajcVarC3, diepVar3);
            Context contextA = eanmVar.a();
            Context contextA2 = eanmVar.a();
            int i2 = ddny.a;
            eaixVar = new eaix(contextA, new ddos(contextA2), new eanl());
            eajbVar = new eajb(eanmVar.a(), (diep) eyikVar2.b());
            eajcVarC = eanmVar.c();
            diepVar = (diep) eyikVar2.b();
            fbqmVar = (fbqm) eanmVar.f.b();
            eajcVarC2 = eanmVar.c();
            diepVar2 = (diep) eyikVar2.b();
            Object objB3 = eanmVar.i.b();
            objB = eanmVar.j.b();
            Object objB4 = eanmVar.k.b();
            Object objB5 = eanmVar.l.b();
            Object objB6 = eanmVar.m.b();
            objB2 = eanmVar.o.b();
            Object objB7 = eanmVar.p.b();
            Object objB8 = eanmVar.q.b();
            ealmVarD = eanmVar.d();
            eyik eyikVar3 = eanmVar.t;
            Object objB9 = eyikVar3.b();
            eanmVar.a();
            fbqm fbqmVar2 = (fbqm) eanmVar.s.b();
            eanmVar.d();
            new ealz(fbqmVar2);
        } catch (Error | RuntimeException e) {
            eawq.b(e);
            throw e;
        }
        return new eakh(eanuVar, eanbVar, eaixVar, eajbVar, eajcVarC, diepVar, new eall(eanuVar, fbqmVar, eajcVarC2, diepVar2, (eamf) objB, (ealr) objB2, ealmVarD, esrz.a(eanmVar.w)), new dtbq((fbqm) eanmVar.y.b(), (dtbl) eanmVar.d.b(), dtbf.a()));
    }

    public static synchronized boolean c() {
        try {
        } catch (Error | RuntimeException e) {
            eawq.b(e);
            throw e;
        }
        return a.c();
    }

    public static synchronized void d(Context context) {
        try {
            context.getClass();
            ejwl.b(true, "API Key must not be empty.");
            eawq.a(context.getApplicationContext());
            a.e();
        } catch (Error | RuntimeException e) {
            eawq.b(e);
            throw e;
        }
    }

    public static void e(Context context) {
        try {
            d(context);
        } catch (Error | RuntimeException e) {
            eawq.b(e);
            throw e;
        }
    }
}
