package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dspn implements dsoq {
    public static final eksp a = eksp.c("GnpSdk");
    private static final dsjq d = new dsjq();
    public final dsah b;
    public final dsnc c;
    private final Context e;
    private final String f;
    private final dxgg g;
    private final fcsu h;
    private final Set i;
    private final eosc j;
    private final drzs k;

    public dspn(Context context, String str, dxgg dxggVar, dsah dsahVar, fcsu fcsuVar, Set set, dsnc dsncVar, eosc eoscVar, drzs drzsVar) {
        this.e = context;
        this.f = str;
        this.g = dxggVar;
        this.b = dsahVar;
        this.h = fcsuVar;
        this.i = set;
        this.c = dsncVar;
        this.j = eoscVar;
        this.k = drzsVar;
    }

    private final Intent f(etjz etjzVar) {
        Intent launchIntentForPackage;
        String str = etjzVar.e;
        String str2 = etjzVar.d;
        String str3 = !etjzVar.c.isEmpty() ? etjzVar.c : TextUtils.isEmpty(str2) ? this.f : "";
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            launchIntentForPackage = this.e.getPackageManager().getLaunchIntentForPackage(str3);
            if (launchIntentForPackage == null) {
                return null;
            }
        } else {
            Intent intent = new Intent();
            if (!TextUtils.isEmpty(str)) {
                intent.setClassName(str3, str);
            } else if (!TextUtils.isEmpty(str3)) {
                intent.setPackage(str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                intent.setAction(str2);
            }
            launchIntentForPackage = intent;
        }
        String str4 = etjzVar.f;
        if (!TextUtils.isEmpty(str4)) {
            launchIntentForPackage.setData(Uri.parse(str4));
        }
        launchIntentForPackage.addFlags(etjzVar.i);
        return launchIntentForPackage;
    }

    @Override // defpackage.dsoq
    public final /* synthetic */ etjv a(etlk etlkVar) {
        etli etliVarB = etli.b(etlkVar.e);
        if (etliVarB == null) {
            etliVarB = etli.ACTION_UNKNOWN;
        }
        int iOrdinal = etliVarB.ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? etjv.UNKNOWN_ACTION : etjv.ACKNOWLEDGE_RESPONSE : etjv.DISMISSED : etjv.NEGATIVE_RESPONSE : etjv.POSITIVE_RESPONSE;
    }

    @Override // defpackage.dsoq
    public final void b(Activity activity, etjy etjyVar, Intent intent) {
        if (intent == null) {
            ((eksl) ((eksl) a.j()).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/UserActionUtilImpl", "launchIntent", 174, "UserActionUtilImpl.java")).q("Intent could not be loaded, not launching.");
            return;
        }
        int iOrdinal = etjyVar.ordinal();
        if (iOrdinal == 1) {
            try {
                activity.startActivity(intent);
                return;
            } catch (ActivityNotFoundException e) {
                ((eksl) ((eksl) ((eksl) a.j()).g(e)).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/UserActionUtilImpl", "launchIntent", (char) 182, "UserActionUtilImpl.java")).q("Did not found activity to start");
                return;
            }
        }
        if (iOrdinal == 2) {
            activity.startService(intent);
            return;
        }
        if (iOrdinal == 3) {
            activity.sendBroadcast(intent);
            return;
        }
        if (iOrdinal != 4) {
            ((eksl) ((eksl) a.j()).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/UserActionUtilImpl", "launchIntent", 199, "UserActionUtilImpl.java")).t("IntentType %s not yet supported", etjyVar.name());
            return;
        }
        try {
            activity.startActivityForResult(intent, 0);
        } catch (ActivityNotFoundException e2) {
            ((eksl) ((eksl) ((eksl) a.j()).g(e2)).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/UserActionUtilImpl", "launchIntent", (char) 195, "UserActionUtilImpl.java")).q("Did not found activity to start");
        }
    }

    @Override // defpackage.dsoq
    public final void c(final dsbi dsbiVar, final etjv etjvVar) {
        ethk ethkVarC = dsbiVar.c();
        ethd ethdVar = (ethd) ethg.a.createBuilder();
        etht ethtVar = ethkVarC.c;
        if (ethtVar == null) {
            ethtVar = etht.a;
        }
        ethdVar.copyOnWrite();
        ethg ethgVar = (ethg) ethdVar.instance;
        ethtVar.getClass();
        ethgVar.c = ethtVar;
        ethgVar.b |= 1;
        ethdVar.copyOnWrite();
        ((ethg) ethdVar.instance).d = etjvVar.a();
        evvo evvoVar = (evvo) evvp.a.createBuilder();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(dsbiVar.a());
        evvoVar.copyOnWrite();
        ((evvp) evvoVar.instance).b = seconds;
        ethdVar.copyOnWrite();
        ethg ethgVar2 = (ethg) ethdVar.instance;
        evvp evvpVar = (evvp) evvoVar.build();
        evvpVar.getClass();
        ethgVar2.e = evvpVar;
        ethgVar2.b |= 2;
        if (dsbiVar.d() != null) {
            ethf ethfVar = (ethf) d.fM(dsbiVar.d());
            ethdVar.copyOnWrite();
            ethg ethgVar3 = (ethg) ethdVar.instance;
            ethfVar.getClass();
            ethgVar3.f = ethfVar;
            ethgVar3.b |= 4;
        }
        ethg ethgVar4 = (ethg) ethdVar.build();
        dski dskiVar = (dski) this.g.a(dsbiVar.e());
        etht ethtVar2 = ethkVarC.c;
        if (ethtVar2 == null) {
            ethtVar2 = etht.a;
        }
        ListenableFuture listenableFutureD = dskiVar.d(dskj.b(ethtVar2), ethgVar4);
        drzs drzsVar = this.k;
        ethr ethrVar = ethkVarC.j;
        if (ethrVar == null) {
            ethrVar = ethr.a;
        }
        drzsVar.a(ethgVar4, ethrVar);
        dxlc.a(listenableFutureD, new ejwy() { // from class: dspl
            @Override // defpackage.ejwy
            public final void a(Object obj) {
                dspn dspnVar = this.a;
                dsbi dsbiVar2 = dsbiVar;
                int iOrdinal = etjvVar.ordinal();
                if (iOrdinal == 1) {
                    dspnVar.b.n(dsbiVar2);
                    return;
                }
                if (iOrdinal == 2) {
                    dspnVar.b.m(dsbiVar2, evoo.ACTION_POSITIVE);
                    return;
                }
                if (iOrdinal == 3) {
                    dspnVar.b.m(dsbiVar2, evoo.ACTION_NEGATIVE);
                } else if (iOrdinal != 6) {
                    dspnVar.b.m(dsbiVar2, evoo.ACTION_UNKNOWN);
                } else {
                    dspnVar.b.m(dsbiVar2, evoo.ACTION_ACKNOWLEDGE);
                }
            }
        }, new ejwy() { // from class: dspm
            @Override // defpackage.ejwy
            public final void a(Object obj) {
                ((eksl) ((eksl) ((eksl) dspn.a.j()).g((Throwable) obj)).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/UserActionUtilImpl", "persistUserChoice", 156, "UserActionUtilImpl.java")).q("Failed to persist dialog button click.");
            }
        });
        eork.b(listenableFutureD).b(eiid.c(new eooy() { // from class: dspj
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                return this.a.c.a(evje.GROWTHKIT_SYNC_AFTER_USER_ACTION);
            }
        }), this.j);
        dssw dsswVar = (dssw) this.h.b();
        if (dsswVar != null) {
            dssl dsslVar = new dssl();
            etnj etnjVar = ethkVarC.f;
            if (etnjVar == null) {
                etnjVar = etnj.a;
            }
            dsslVar.c = dsbk.b(etnjVar);
            dsslVar.a();
            int iOrdinal = etjvVar.ordinal();
            dsswVar.d(iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 6 ? dssp.ACTION_UNKNOWN : dssp.ACTION_ACKNOWLEDGE : dssp.ACTION_NEGATIVE : dssp.ACTION_POSITIVE : dssp.ACTION_DISMISS);
        }
    }

    @Override // defpackage.dsoq
    public final boolean d(Context context, etjz etjzVar) {
        etjy etjyVarB = etjy.b(etjzVar.g);
        if (etjyVarB == null) {
            etjyVarB = etjy.UNKNOWN;
        }
        if (!etjy.ACTIVITY.equals(etjyVarB) && !etjy.ACTIVITY_WITH_RESULT.equals(etjyVarB)) {
            return true;
        }
        Intent intentF = f(etjzVar);
        return (intentF == null || intentF.resolveActivityInfo(context.getPackageManager(), intentF.getFlags()) == null) ? false : true;
    }

    @Override // defpackage.dsoq
    public final ListenableFuture e(etjz etjzVar, etlk etlkVar) {
        etmr etmrVarB;
        final Intent intentF = f(etjzVar);
        if (intentF == null) {
            return eork.i(null);
        }
        for (etmt etmtVar : etjzVar.h) {
            int i = etmtVar.c;
            int iA = etms.a(i);
            if (iA == 0) {
                throw null;
            }
            int i2 = iA - 1;
            if (i2 == 0) {
                intentF.putExtra(etmtVar.e, i == 2 ? (String) etmtVar.d : "");
            } else if (i2 == 1) {
                intentF.putExtra(etmtVar.e, i == 4 ? ((Integer) etmtVar.d).intValue() : 0);
            } else if (i2 == 2) {
                intentF.putExtra(etmtVar.e, i == 5 ? ((Boolean) etmtVar.d).booleanValue() : false);
            } else if (i2 == 3) {
                if (i != 3 || (etmrVarB = etmr.b(((Integer) etmtVar.d).intValue())) == null) {
                    etmrVarB = etmr.CLIENT_VALUE_UNKNOWN;
                }
                etmrVarB.ordinal();
            }
        }
        ArrayList arrayList = new ArrayList();
        Bundle extras = intentF.getExtras();
        etli etliVarB = etli.b(etlkVar.e);
        if (etliVarB == null) {
            etliVarB = etli.ACTION_UNKNOWN;
        }
        dssp dsspVarA = dsbk.a(etliVarB);
        if (dsspVarA == null) {
            throw new NullPointerException("Null actionType");
        }
        dssn dssnVar = new dssn(extras, dsspVarA);
        ekqg ekqgVarListIterator = ((ekph) this.i).listIterator();
        while (ekqgVarListIterator.hasNext()) {
            arrayList.add(dstq.b(dssnVar));
        }
        return eooq.f(eork.e(arrayList), new ejvr() { // from class: dspk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksp ekspVar = dspn.a;
                Iterator it = ((List) obj).iterator();
                while (true) {
                    Intent intent = intentF;
                    if (!it.hasNext()) {
                        return intent;
                    }
                    Bundle bundle = (Bundle) it.next();
                    if (bundle != null) {
                        intent.putExtras(bundle);
                    }
                }
            }
        }, eoqg.a);
    }
}
