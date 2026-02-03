package defpackage;

import android.os.SystemClock;
import android.util.Log;
import com.android.vcard.VCardConfig;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dbyd implements dbzs {
    public final dbya a;
    public final eyeh b;
    public boolean c;
    public emky d;
    public ArrayList e;
    public ArrayList f;
    protected ArrayList g;
    public ArrayList h;
    public Set i;
    public String j;
    public String k;
    public eyek l;
    public final dbyw m;
    public dbyw n;
    public boolean o;

    protected dbyd(dbya dbyaVar) {
        eyen eyenVar;
        eyeh eyehVar = (eyeh) eyei.a.createBuilder();
        this.b = eyehVar;
        this.c = false;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.o = false;
        this.a = dbyaVar;
        this.k = dbyaVar.i;
        this.j = dbyaVar.e;
        dbyt dbytVar = dbyaVar.g.getApplicationContext() instanceof dbyt ? (dbyt) dbyaVar.g.getApplicationContext() : (dbyt) dbyv.a.get();
        dbyw dbywVarD = dbytVar != null ? dbytVar.d() : null;
        if (dbywVarD == null) {
            this.m = null;
        } else {
            eyen eyenVar2 = ((dbyf) dbywVarD).a;
            eyen eyenVar3 = eyen.CPS_APP_PROCESS_GLOBAL_PROVIDER;
            if (eyenVar2 == eyenVar3 || eyenVar2 == (eyenVar = eyen.NON_CPS_APP_PROCESS_GLOBAL_PROVIDER)) {
                this.m = dbywVarD;
            } else {
                Log.e("AbstractLogEventBuilder", "The provided ProductIdOrigin " + eyenVar2.toString() + " is not one of the process-level expected values: " + String.valueOf(eyenVar3) + " or " + String.valueOf(eyenVar));
                this.m = null;
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        eyehVar.copyOnWrite();
        eyei eyeiVar = (eyei) eyehVar.instance;
        eyeiVar.b |= 1;
        eyeiVar.c = jCurrentTimeMillis;
        long j = ((eyei) eyehVar.instance).c;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(TimeZone.getDefault().getOffset(j));
        eyehVar.copyOnWrite();
        eyei eyeiVar2 = (eyei) eyehVar.instance;
        eyeiVar2.b |= 131072;
        eyeiVar2.g = seconds;
        if (dqyw.g(dbyaVar.g)) {
            eyehVar.copyOnWrite();
            eyei eyeiVar3 = (eyei) eyehVar.instance;
            eyeiVar3.b |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
            eyeiVar3.i = true;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime != 0) {
            eyehVar.copyOnWrite();
            eyei eyeiVar4 = (eyei) eyehVar.instance;
            eyeiVar4.b |= 2;
            eyeiVar4.d = jElapsedRealtime;
        }
    }

    public abstract dbyd a();

    public abstract LogEventParcelable b();

    public abstract defn c();

    public abstract ListenableFuture d(dbye dbyeVar);

    public final eyek e() {
        eyek eyekVar = this.l;
        return eyekVar != null ? eyekVar : this.a.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(dbyw dbywVar) {
        eyeh eyehVar = this.b;
        eyeo eyeoVar = ((eyei) eyehVar.instance).m;
        if (eyeoVar == null) {
            eyeoVar = eyeo.a;
        }
        eyel eyelVar = (eyel) eyeoVar.toBuilder();
        eyen eyenVarB = dbywVar.b();
        eyelVar.copyOnWrite();
        eyeo eyeoVar2 = (eyeo) eyelVar.instance;
        eyeoVar2.d = eyenVarB.l;
        eyeoVar2.b |= 2;
        exda exdaVar = eyeoVar2.c;
        if (exdaVar == null) {
            exdaVar = exda.a;
        }
        excz exczVar = (excz) exdaVar.toBuilder();
        excy excyVar = ((exda) exczVar.instance).c;
        if (excyVar == null) {
            excyVar = excy.a;
        }
        excx excxVar = (excx) excyVar.toBuilder();
        int iA = dbywVar.a();
        excxVar.copyOnWrite();
        excy excyVar2 = (excy) excxVar.instance;
        excyVar2.b |= 1;
        excyVar2.c = iA;
        exczVar.copyOnWrite();
        exda exdaVar2 = (exda) exczVar.instance;
        excy excyVar3 = (excy) excxVar.build();
        excyVar3.getClass();
        exdaVar2.c = excyVar3;
        exdaVar2.b |= 1;
        eyelVar.copyOnWrite();
        eyeo eyeoVar3 = (eyeo) eyelVar.instance;
        exda exdaVar3 = (exda) exczVar.build();
        exdaVar3.getClass();
        eyeoVar3.c = exdaVar3;
        eyeoVar3.b |= 1;
        eyeo eyeoVar4 = (eyeo) eyelVar.build();
        eyehVar.copyOnWrite();
        eyei eyeiVar = (eyei) eyehVar.instance;
        eyeoVar4.getClass();
        eyeiVar.m = eyeoVar4;
        eyeiVar.b |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
    }

    public final void g(String str) {
        if (this.a.e()) {
            throw new IllegalArgumentException("addMendelPackage forbidden on deidentified logger");
        }
        if (this.f == null) {
            this.f = new ArrayList();
        }
        this.f.add(str);
    }

    public final void h(String str) {
        if (!this.a.k.a(dcab.ACCOUNT_NAME)) {
            throw new IllegalStateException("setUploadAccountName forbidden on deidentified logger");
        }
        this.j = str;
    }

    public final void i(int[] iArr) {
        if (this.a.e()) {
            throw new IllegalArgumentException("addExperimentIds forbidden on deidentified logger");
        }
        if (iArr == null || (iArr.length) == 0) {
            return;
        }
        if (this.g == null) {
            this.g = new ArrayList();
        }
        for (int i : iArr) {
            this.g.add(Integer.valueOf(i));
        }
    }

    public final void j(int i) {
        eyeh eyehVar = this.b;
        eyehVar.copyOnWrite();
        eyei eyeiVar = (eyei) eyehVar.instance;
        eyei eyeiVar2 = eyei.a;
        eyeiVar.b |= 32;
        eyeiVar.e = i;
    }

    public final void k(long j, long j2) {
        eyeh eyehVar = this.b;
        eyehVar.copyOnWrite();
        eyei eyeiVar = (eyei) eyehVar.instance;
        eyei eyeiVar2 = eyei.a;
        eyeiVar.b |= 1;
        eyeiVar.c = j;
        eyehVar.copyOnWrite();
        eyei eyeiVar3 = (eyei) eyehVar.instance;
        eyeiVar3.b |= 2;
        eyeiVar3.d = j2;
        long j3 = eyeiVar3.c;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(TimeZone.getDefault().getOffset(j3));
        eyehVar.copyOnWrite();
        eyei eyeiVar4 = (eyei) eyehVar.instance;
        eyeiVar4.b |= 131072;
        eyeiVar4.g = seconds;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AbstractLogEventBuilderuploadAccount: ");
        sb.append(this.j);
        sb.append(", logSourceName: ");
        sb.append(this.k);
        sb.append(", qosTier: ");
        sb.append(e().f);
        sb.append(", veMessage: ");
        sb.append(this.d);
        sb.append(", testCodes: ");
        ArrayList arrayList = this.e;
        sb.append(arrayList != null ? dbya.c(arrayList) : null);
        sb.append(", mendelPackages: ");
        ArrayList arrayList2 = this.f;
        sb.append(arrayList2 != null ? dbya.c(arrayList2) : null);
        sb.append(", experimentIds: ");
        ArrayList arrayList3 = this.g;
        sb.append(arrayList3 != null ? dbya.c(arrayList3) : null);
        sb.append(", experimentTokens: ");
        ArrayList arrayList4 = this.h;
        sb.append(arrayList4 != null ? dbya.c(arrayList4) : null);
        sb.append(", addPhenotype: true]");
        return sb.toString();
    }
}
