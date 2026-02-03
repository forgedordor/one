package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bver {
    private static final cqce f = cqce.g("BugleNetwork", "DittoBroadcastReceiverManager");
    public ezol a;
    public String b;
    public final fcsu c;
    public final ains d;
    public final eigp e;
    private final Context g;
    private final cqbm h;
    private final aypz i;
    private bveq j = new bveq(this);
    private cqew k;

    public bver(Context context, cqbm cqbmVar, aypz aypzVar, fcsu fcsuVar, ains ainsVar, eigp eigpVar) {
        this.g = context;
        this.h = cqbmVar;
        this.i = aypzVar;
        this.c = fcsuVar;
        this.d = ainsVar;
        this.e = eigpVar;
    }

    public static boolean i(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    static final int j(Intent intent) {
        int intExtra = (intent.getIntExtra("level", -1) * 100) / intent.getIntExtra("scale", 1);
        if (intExtra < 0) {
            return -1;
        }
        return intExtra;
    }

    final eiju a(boolean z) {
        String str;
        ezol ezolVar = this.a;
        if (ezolVar != null && (str = this.b) != null) {
            return z ? this.i.f(5, ezolVar, str) : this.i.f(6, ezolVar, str);
        }
        cqbd cqbdVarE = f.e();
        cqbdVarE.I("Changes in battery level should not be notified with null values");
        cqbdVarE.A("desktopId", this.a);
        cqbdVarE.A("requestId", this.b);
        cqbdVarE.r();
        return eijx.e(null);
    }

    final eiju b() {
        this.d.c("Bugle.Ditto.Connectivity.UpdateOnWorker.Start.Count");
        ((bvud) this.c.b()).a(this.a, this.b);
        return eijx.e(null);
    }

    final ListenableFuture c() {
        Optional optionalD = d();
        return optionalD.isEmpty() ? eork.i(null) : a(((Boolean) optionalD.get()).booleanValue());
    }

    public final Optional d() {
        Intent intentRegisterReceiver = this.g.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return Optional.empty();
        }
        int iJ = j(intentRegisterReceiver);
        if (iJ < 0) {
            return Optional.empty();
        }
        boolean z = false;
        if (iJ <= 15 && !i(intentRegisterReceiver)) {
            z = true;
        }
        return Optional.of(Boolean.valueOf(z));
    }

    final void e(ezol ezolVar, String str) {
        f(ezolVar, str);
        if (this.k == null) {
            bvep bvepVar = new bvep(this);
            this.k = bvepVar;
            cqey cqeyVar = (cqey) this.h.a();
            cqer cqerVar = (cqer) cqeu.a.createBuilder();
            cqet cqetVar = cqet.ALL_ACTIVE_SUBSCRIPTIONS;
            cqerVar.copyOnWrite();
            cqeu cqeuVar = (cqeu) cqerVar.instance;
            cqeuVar.c = cqetVar.e;
            cqeuVar.b |= 1;
            cqeyVar.m(bvepVar, (cqeu) cqerVar.build());
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        bveq bveqVar = new bveq(this);
        this.j = bveqVar;
        this.g.registerReceiver(bveqVar, intentFilter);
    }

    final void f(ezol ezolVar, String str) {
        this.a = ezolVar;
        this.b = str;
        if (ezolVar != null) {
            b();
            c();
        }
    }

    final void g(ezol ezolVar, String str) {
        this.a = ezolVar;
        this.b = str;
    }

    final void h() {
        cqew cqewVar = this.k;
        if (cqewVar != null) {
            this.k = null;
            cqey cqeyVar = (cqey) this.h.a();
            cqer cqerVar = (cqer) cqeu.a.createBuilder();
            cqet cqetVar = cqet.ALL_ACTIVE_SUBSCRIPTIONS;
            cqerVar.copyOnWrite();
            cqeu cqeuVar = (cqeu) cqerVar.instance;
            cqeuVar.c = cqetVar.e;
            cqeuVar.b |= 1;
            cqeyVar.n(cqewVar, (cqeu) cqerVar.build());
        }
        this.g.unregisterReceiver(this.j);
        f(null, null);
        ((bvsu) ((bvud) this.c.b()).a.b()).c.set(bvst.UNKNOWN);
    }
}
