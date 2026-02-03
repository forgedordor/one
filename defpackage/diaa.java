package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diaa {
    public final diag a;
    public final ekhx b;
    private final ejwi c = ejwi.i(null);

    public diaa(dhzz dhzzVar) {
        this.a = dhzzVar.a;
        this.b = dhzzVar.b.g();
    }

    public static ejwi a(Class cls) {
        try {
            return ejwi.j((diaj) cls.getDeclaredConstructor(null).newInstance(null));
        } catch (ReflectiveOperationException unused) {
            return ejud.a;
        }
    }

    static /* synthetic */ ekgp c() {
        return ekgp.r(dbjt.DO_NOTHING, dibd.class, dbjt.FILE_DELETION, dibg.class, dbjt.EXEC_SQL_FIX, dibe.class, dbjt.SEND_BROADCAST, dibi.class, dbjt.PROCESS_RESTART, dibh.class, dbjt.SHARED_PREFERENCES_DELETION, dibn.class, dbjt.COMPONENT_ENABLED_SETTING_FIX, dibc.class, dbjt.START_SERVICE, dibo.class);
    }

    public final ekgp b() {
        ejwi ejwiVar = this.c;
        if (!ejwiVar.g()) {
            return c();
        }
        ekgi ekgiVar = new ekgi();
        ekgiVar.g(c());
        ekgiVar.g((Map) ((ejxr) ejwiVar.c()).get());
        return ekgiVar.c();
    }

    public final void d(Context context, dbjt dbjtVar, dbjq dbjqVar) {
        Log.e("AppDoctor", "Failed on fix: " + dbjtVar.a());
        dbjp dbjpVar = (dbjp) dbjs.a.createBuilder();
        String packageName = context.getPackageName();
        dbjpVar.copyOnWrite();
        dbjs dbjsVar = (dbjs) dbjpVar.instance;
        packageName.getClass();
        dbjsVar.b |= 1;
        dbjsVar.c = packageName;
        dbjpVar.copyOnWrite();
        dbjs dbjsVar2 = (dbjs) dbjpVar.instance;
        dbjsVar2.g = dbjqVar.a();
        dbjsVar2.b |= 16;
        dbjpVar.copyOnWrite();
        dbjs dbjsVar3 = (dbjs) dbjpVar.instance;
        dbjsVar3.f = dbjr.a(6);
        dbjsVar3.b |= 8;
        dbjpVar.copyOnWrite();
        dbjs dbjsVar4 = (dbjs) dbjpVar.instance;
        dbjsVar4.e = dbjtVar.a();
        dbjsVar4.b |= 4;
        this.a.a((dbjs) dbjpVar.build());
    }

    public final void e(Context context, dbky dbkyVar, dbjq dbjqVar) {
        dbjt dbjtVarB;
        if (dbkyVar != null) {
            dbjtVarB = dbjt.b(dbkyVar.b);
            if (dbjtVarB == null) {
                dbjtVarB = dbjt.UNRECOGNIZED;
            }
        } else {
            dbjtVarB = dbjt.UNSPECIFIED_FIX;
        }
        d(context, dbjtVarB, dbjqVar);
    }

    public final void f(Context context, dbjt dbjtVar, dbjq dbjqVar) {
        dbjp dbjpVar = (dbjp) dbjs.a.createBuilder();
        String packageName = context.getPackageName();
        dbjpVar.copyOnWrite();
        dbjs dbjsVar = (dbjs) dbjpVar.instance;
        packageName.getClass();
        dbjsVar.b |= 1;
        dbjsVar.c = packageName;
        dbjpVar.copyOnWrite();
        dbjs dbjsVar2 = (dbjs) dbjpVar.instance;
        dbjsVar2.g = dbjqVar.a();
        dbjsVar2.b |= 16;
        dbjpVar.copyOnWrite();
        dbjs dbjsVar3 = (dbjs) dbjpVar.instance;
        dbjsVar3.f = dbjr.a(5);
        dbjsVar3.b |= 8;
        dbjpVar.copyOnWrite();
        dbjs dbjsVar4 = (dbjs) dbjpVar.instance;
        dbjsVar4.e = dbjtVar.a();
        dbjsVar4.b |= 4;
        this.a.a((dbjs) dbjpVar.build());
    }

    final boolean g(Context context, dbjq dbjqVar) {
        List<dbky> list;
        dbjt dbjtVarB;
        if (diac.a(context)) {
            diao diaoVar = new diao();
            diaoVar.b = context;
            diaoVar.a = dbjqVar;
            diaoVar.c = this.a;
            diap diapVarA = diaoVar.a();
            try {
                diad diadVar = new diad(context);
                try {
                    diaw diawVar = new diaw(new dhzx(this, diadVar, diapVarA));
                    ekgp ekgpVarB = b();
                    Bundle bundleCall = diadVar.b.call("get_fixes", null, diadVar.a());
                    if (bundleCall == null) {
                        Log.e("AppDoctorProviderClient", "Failed to get config from AppDoctorProvider.");
                        int i = ekgb.d;
                        list = ekoe.a;
                    } else {
                        byte[] byteArray = bundleCall.getByteArray("com.google.android.gms.common.appdoctor.teledoctorconfig");
                        if (byteArray == null) {
                            Log.e("AppDoctorProviderClient", "TeleDoctor Config empty");
                            int i2 = ekgb.d;
                            list = ekoe.a;
                        } else {
                            try {
                                evrr evrrVar = evrr.a;
                                evuq evuqVar = evuq.a;
                                list = ((dbkz) evsn.parseFrom(dbkz.a, byteArray, evrr.a)).b;
                            } catch (evtj e) {
                                Log.e("AppDoctorProviderClient", "Failed to parse TeleDoctorConfig.", e);
                                int i3 = ekgb.d;
                                list = ekoe.a;
                            }
                        }
                    }
                    for (dbky dbkyVar : list) {
                        dbjt dbjtVarB2 = dbjt.b(dbkyVar.b);
                        if (dbjtVarB2 == null) {
                            dbjtVarB2 = dbjt.UNRECOGNIZED;
                        }
                        if (ekgpVarB.containsKey(dbjtVarB2)) {
                            dbjt dbjtVarB3 = dbjt.b(dbkyVar.b);
                            if (dbjtVarB3 == null) {
                                dbjtVarB3 = dbjt.UNRECOGNIZED;
                            }
                            ejwi ejwiVarA = a((Class) ekgpVarB.get(dbjtVarB3));
                            if (ejwiVarA.g()) {
                                String str = dbkyVar.d;
                                dbjt dbjtVarB4 = dbjt.b(dbkyVar.b);
                                if (dbjtVarB4 == null) {
                                    dbjtVarB4 = dbjt.UNRECOGNIZED;
                                }
                                dbkw dbkwVar = dbkyVar.c;
                                if (dbkwVar == null) {
                                    dbkwVar = dbkw.a;
                                }
                                diaj diajVar = (diaj) ejwiVarA.c();
                                dbkw dbkwVar2 = dbkwVar;
                                diawVar.c(new dian(str, dbjtVarB4, dbkwVar2, diajVar, dian.a));
                            } else {
                                e(diapVarA.b, dbkyVar, diapVarA.a);
                            }
                        } else {
                            Context context2 = diapVarA.b;
                            dbjq dbjqVar2 = diapVarA.a;
                            if (dbkyVar != null) {
                                dbjtVarB = dbjt.b(dbkyVar.b);
                                if (dbjtVarB == null) {
                                    dbjtVarB = dbjt.UNRECOGNIZED;
                                }
                            } else {
                                dbjtVarB = dbjt.UNSPECIFIED_FIX;
                            }
                            f(context2, dbjtVarB, dbjqVar2);
                        }
                    }
                    diav diavVarB = diawVar.b(diapVarA);
                    try {
                        diavVarB.b.get();
                        boolean z = diavVarB.a;
                        diadVar.close();
                        return z;
                    } catch (InterruptedException | RuntimeException | ExecutionException unused) {
                        e(context, dbky.a, dbjqVar);
                        diadVar.close();
                    }
                } finally {
                }
            } catch (RemoteException | RuntimeException unused2) {
                e(context, dbky.a, dbjqVar);
            }
        }
        return false;
    }
}
