package defpackage;

import android.content.Context;
import android.net.NetworkInfo;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Calendar;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfyd implements dfzi {
    public static final dfny a = dfod.a(180131982);
    public static final dfny b = dfnv.b("log_sip_disabled_by_bugle_ignore_reason");
    public final Context c;
    public final deyw d;
    public final String e = UUID.randomUUID().toString();
    public final long f = Calendar.getInstance().getTimeInMillis();
    public long g = 0;
    public final dbho h;
    public final dbho i;
    public final dbho j;
    public final dbho k;
    final dbho l;
    public final dbho m;
    public final dbho n;
    public final dbho o;
    final dbho p;
    final dbho q;
    public Optional r;
    private final dhet s;
    private final dhes t;
    private final dgrs u;
    private final cmlb v;
    private final fcsu w;
    private final dbhq x;

    public dfyd(Context context, dhet dhetVar, dhes dhesVar, deyw deywVar, dgrs dgrsVar, cmlb cmlbVar, fcsu fcsuVar) {
        dbhq dbhqVar = new dbhq("uptime_tracker");
        this.x = dbhqVar;
        this.h = new dbhj(dbhqVar, "last_registered_ts", 0L);
        this.i = new dbhj(dbhqVar, "last_unregistered_ts", 0L);
        this.j = new dbhj(dbhqVar, "last_ignore_ts", 0L);
        this.k = new dbhm(dbhqVar, "last_ignore_reason", 0);
        this.l = new dbhm(dbhqVar, "last_unregistered_reason", 0);
        this.m = new dbhm(dbhqVar, "previous_state", 0);
        this.n = new dbhm(dbhqVar, "current_state", 0);
        this.o = new dbhm(dbhqVar, "last_registered_network_type", 0);
        this.p = new dbhj(dbhqVar, "previous_event_ts", 0L);
        this.q = new dbhm(dbhqVar, "previously_logged_state", 0);
        this.c = context;
        this.s = dhetVar;
        this.t = dhesVar;
        this.d = deywVar;
        this.r = Optional.empty();
        this.u = dgrsVar;
        this.v = cmlbVar;
        this.w = fcsuVar;
    }

    public static final boolean o(ewfw ewfwVar) {
        return ewfwVar != ewfw.RCS_UPTIME_IGNORE_REASON_UNKNOWN;
    }

    private final NetworkInfo s() {
        return dhkq.f(this.c).d();
    }

    private final void t(dezf dezfVar) {
        ewfw ewfwVarC = dezfVar == dezf.SHUTDOWN ? ewfw.RCS_UPTIME_IGNORE_DEVICE_SHUTDOWN : c();
        if (o(ewfwVarC)) {
            k(ewfwVarC);
        } else {
            m(dezfVar);
        }
    }

    private static final int u(dbho dbhoVar) {
        int iA = ewfy.a(((Integer) dbhoVar.d()).intValue());
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final ewfr a() {
        ewfr ewfrVar = (ewfr) b(Calendar.getInstance().getTimeInMillis()).toBuilder();
        if (r(2)) {
            ewfw ewfwVarD = d(this.k);
            ewfrVar.copyOnWrite();
            ewfu ewfuVar = (ewfu) ewfrVar.instance;
            ewfuVar.e = ewfwVarD.j;
            ewfuVar.b |= 4;
            return ewfrVar;
        }
        if (r(3)) {
            int iA = ewga.a(((Integer) this.l.d()).intValue());
            if (iA == 0) {
                iA = 1;
            }
            ewfrVar.copyOnWrite();
            ewfu ewfuVar2 = (ewfu) ewfrVar.instance;
            ewfuVar2.f = iA - 1;
            ewfuVar2.b |= 8;
        }
        return ewfrVar;
    }

    final ewfu b(long j) {
        ewfr ewfrVar = (ewfr) ewfu.a.createBuilder();
        ewfrVar.copyOnWrite();
        ewfu ewfuVar = (ewfu) ewfrVar.instance;
        String str = this.e;
        str.getClass();
        ewfuVar.b |= 512;
        ewfuVar.l = str;
        ewfrVar.copyOnWrite();
        ewfu ewfuVar2 = (ewfu) ewfrVar.instance;
        ewfuVar2.b |= 1024;
        ewfuVar2.m = this.f;
        long j2 = this.g + 1;
        this.g = j2;
        ewfrVar.copyOnWrite();
        ewfu ewfuVar3 = (ewfu) ewfrVar.instance;
        ewfuVar3.b |= 2048;
        ewfuVar3.n = j2;
        int iU = u(this.n);
        ewfrVar.copyOnWrite();
        ewfu ewfuVar4 = (ewfu) ewfrVar.instance;
        ewfuVar4.c = iU - 1;
        ewfuVar4.b |= 1;
        int iU2 = u(this.m);
        ewfrVar.copyOnWrite();
        ewfu ewfuVar5 = (ewfu) ewfrVar.instance;
        ewfuVar5.d = iU2 - 1;
        ewfuVar5.b |= 2;
        long jLongValue = ((Long) this.j.d()).longValue();
        ewfrVar.copyOnWrite();
        ewfu ewfuVar6 = (ewfu) ewfrVar.instance;
        ewfuVar6.b |= 64;
        ewfuVar6.i = jLongValue;
        long jLongValue2 = ((Long) this.h.d()).longValue();
        ewfrVar.copyOnWrite();
        ewfu ewfuVar7 = (ewfu) ewfrVar.instance;
        ewfuVar7.b |= 16;
        ewfuVar7.g = jLongValue2;
        long jLongValue3 = ((Long) this.i.d()).longValue();
        ewfrVar.copyOnWrite();
        ewfu ewfuVar8 = (ewfu) ewfrVar.instance;
        ewfuVar8.b |= 32;
        ewfuVar8.h = jLongValue3;
        ewfs ewfsVar = (ewfs) ewft.a.createBuilder();
        int iU3 = u(this.q);
        ewfsVar.copyOnWrite();
        ewft ewftVar = (ewft) ewfsVar.instance;
        ewftVar.d = iU3 - 1;
        ewftVar.b |= 2;
        long jLongValue4 = ((Long) this.p.d()).longValue();
        ewfsVar.copyOnWrite();
        ewft ewftVar2 = (ewft) ewfsVar.instance;
        ewftVar2.b |= 1;
        ewftVar2.c = jLongValue4;
        ewfrVar.copyOnWrite();
        ewfu ewfuVar9 = (ewfu) ewfrVar.instance;
        ewft ewftVar3 = (ewft) ewfsVar.build();
        ewftVar3.getClass();
        ewfuVar9.p = ewftVar3;
        ewfuVar9.b |= 8192;
        ewfrVar.copyOnWrite();
        ewfu ewfuVar10 = (ewfu) ewfrVar.instance;
        ewfuVar10.b |= 16384;
        ewfuVar10.q = j;
        int iA = ewrb.a(((Integer) this.o.d()).intValue());
        if (iA != 0) {
            ewfrVar.copyOnWrite();
            ewfu ewfuVar11 = (ewfu) ewfrVar.instance;
            ewfuVar11.k = iA - 1;
            ewfuVar11.b |= 256;
        }
        int iQ = q();
        ewfrVar.copyOnWrite();
        ewfu ewfuVar12 = (ewfu) ewfrVar.instance;
        ewfuVar12.j = iQ - 1;
        ewfuVar12.b |= 128;
        return (ewfu) ewfrVar.build();
    }

    public final ewfw c() {
        String[] strArr = dhka.a;
        int length = strArr.length;
        int i = 0;
        while (true) {
            Context context = this.c;
            if (i < 3) {
                if (!dhkg.a(context, strArr[i])) {
                    break;
                }
                i++;
            } else if ((craf.b && dhkv.g(context).a.hasCarrierPrivileges()) || dhkg.a(context, "android.permission.READ_PRIVILEGED_PHONE_STATE") || dhkg.a(context, "android.permission.READ_PHONE_STATE")) {
                dgrs dgrsVar = this.u;
                if (!((Boolean) dgrsVar.k().map(new Function() { // from class: dfxz
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        dgiq dgiqVar = (dgiq) obj;
                        dfny dfnyVar = dfyd.a;
                        boolean z = false;
                        if (dgiqVar.T() && dgiqVar.a() == 1 && dgiqVar.g() > 0) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(false)).booleanValue()) {
                    return ewfw.RCS_UPTIME_IGNORE_NO_VALID_CONFIG;
                }
                if (!this.s.f()) {
                    return ewfw.RCS_UPTIME_IGNORE_NO_SIM;
                }
                if (!dgrsVar.D()) {
                    return ewfw.RCS_UPTIME_IGNORE_DISABLED_VIA_PREFERENCES;
                }
                NetworkInfo networkInfoS = s();
                if (networkInfoS != null && networkInfoS.isConnected()) {
                    return (((Boolean) b.a()).booleanValue() && ((Boolean) this.r.map(new Function() { // from class: dfyc
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            dfny dfnyVar = dfyd.a;
                            return Boolean.valueOf(dhds.REGISTRATION_DISABLED_BY_BUGLE.equals(((dezc) obj).getRegistrationState().a));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).orElse(false)).booleanValue()) ? ewfw.RCS_UPTIME_IGNORE_SIP_DISABLED_BY_BUGLE : ewfw.RCS_UPTIME_IGNORE_REASON_UNKNOWN;
                }
                NetworkInfo networkInfoS2 = s();
                if (networkInfoS2 == null || networkInfoS2.getDetailedState() != NetworkInfo.DetailedState.BLOCKED) {
                    return ewfw.RCS_UPTIME_IGNORE_NO_NETWORK_CONNECTIVITY;
                }
                dhja.q("Network is blocked. This should not happen. Something is wrong with this device's rcs engine doze exemption setup", new Object[0]);
                dhja.k("Network info: %s", networkInfoS2.toString());
                return ewfw.RCS_UPTIME_IGNORE_BLOCKED_NETWORK;
            }
        }
        return ewfw.RCS_UPTIME_IGNORE_MISSING_PERMISSION;
    }

    public final ewfw d(dbho dbhoVar) {
        ewfw ewfwVarB = ewfw.b(((Integer) dbhoVar.d()).intValue());
        return ewfwVarB == null ? ewfw.RCS_UPTIME_IGNORE_REASON_UNKNOWN : ewfwVarB;
    }

    public final Instant e(dbho dbhoVar) {
        return Instant.ofEpochMilli(((Long) dbhoVar.d()).longValue());
    }

    public final String f(dbho dbhoVar) {
        int iU = u(dbhoVar) - 1;
        return iU != 1 ? iU != 2 ? iU != 3 ? "RCS_UPTIME_STATE_UNKNOWN" : "RCS_UPTIME_STATE_REGISTERED" : "RCS_UPTIME_STATE_UNREGISTERED" : "RCS_UPTIME_STATE_IGNORE";
    }

    @Override // defpackage.dfzi
    public final void g(dezf dezfVar) {
        if (n()) {
            try {
                t(dezfVar);
            } catch (dhkf unused) {
                dhja.g("Missing permission to calculate uptime metric.", new Object[0]);
            }
        }
    }

    @Override // defpackage.dfzi
    public final void h() {
        if (n()) {
            l();
        }
    }

    @Override // defpackage.dfzi
    public final void i(dezf dezfVar) {
        if (n()) {
            try {
                t(dezfVar);
            } catch (dhkf unused) {
                dhja.g("Missing permission to calculate uptime metric.", new Object[0]);
            }
        }
    }

    public final void j(final ewfr ewfrVar) {
        this.r.ifPresent(new Consumer() { // from class: dfya
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                dfny dfnyVar = dfyd.a;
                boolean zHasActiveRegistration = ((dezc) obj).hasActiveRegistration();
                ewfr ewfrVar2 = ewfrVar;
                ewfrVar2.copyOnWrite();
                ewfu ewfuVar = (ewfu) ewfrVar2.instance;
                ewfu ewfuVar2 = ewfu.a;
                ewfuVar.b |= 4096;
                ewfuVar.o = zHasActiveRegistration;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        dgiq dgiqVarF = this.u.f(((dflu) this.w.b()).a() ? (String) this.v.h(cmla.a).map(new Function() { // from class: dfyb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((cmmh) obj).c;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse("") : this.t.l());
        ewfh ewfhVar = (ewfh) ewfk.a.createBuilder();
        boolean z = dgiqVarF != null;
        ewfhVar.copyOnWrite();
        ewfk ewfkVar = (ewfk) ewfhVar.instance;
        ewfkVar.b |= 1;
        ewfkVar.c = z;
        if (dgiqVarF != null) {
            int iE = dgiqVarF.e();
            ewfhVar.copyOnWrite();
            ewfk ewfkVar2 = (ewfk) ewfhVar.instance;
            ewfkVar2.b |= 2;
            ewfkVar2.d = iE;
            long jG = dgiqVarF.g();
            ewfhVar.copyOnWrite();
            ewfk ewfkVar3 = (ewfk) ewfhVar.instance;
            ewfkVar3.b |= 4;
            ewfkVar3.e = jG;
            int iA = ewfj.a(dgiqVarF.a());
            ewfhVar.copyOnWrite();
            ewfk ewfkVar4 = (ewfk) ewfhVar.instance;
            int i = iA - 1;
            if (iA == 0) {
                throw null;
            }
            ewfkVar4.f = i;
            ewfkVar4.b |= 8;
        }
        deyw deywVar = this.d;
        Context context = this.c;
        ewfu ewfuVar = (ewfu) ewfrVar.build();
        ewfk ewfkVar5 = (ewfk) ewfhVar.build();
        ewsd ewsdVar = (ewsd) ewse.a.createBuilder();
        ewsdVar.copyOnWrite();
        ewse ewseVar = (ewse) ewsdVar.instance;
        ewfuVar.getClass();
        ewseVar.d = ewfuVar;
        ewseVar.c = 6;
        ewsdVar.copyOnWrite();
        ewse ewseVar2 = (ewse) ewsdVar.instance;
        ewfkVar5.getClass();
        ewseVar2.f = ewfkVar5;
        ewseVar2.b |= 8;
        deywVar.i(context, ewsdVar, ewqu.RCS_UPTIME_EVENT);
        this.q.e(Integer.valueOf((ewfy.a(((ewfu) ewfrVar.instance).c) != 0 ? r1 : 1) - 1));
        this.p.e(Long.valueOf(((ewfu) ewfrVar.instance).q));
    }

    public final void k(ewfw ewfwVar) {
        if (r(2) && ((Integer) this.k.d()).intValue() == ewfwVar.j) {
            return;
        }
        dhja.o("Sending RCS uptime ignore event with reason: %s", ewfwVar);
        long jP = p(2);
        dbho dbhoVar = this.k;
        int i = ewfwVar.j;
        dbhoVar.e(Integer.valueOf(i));
        ewfr ewfrVar = (ewfr) b(jP).toBuilder();
        ewfrVar.copyOnWrite();
        ewfu ewfuVar = (ewfu) ewfrVar.instance;
        ewfuVar.e = i;
        ewfuVar.b |= 4;
        j(ewfrVar);
    }

    public final void l() {
        if (r(4)) {
            return;
        }
        dhja.o("Sending RCS uptime registered event", new Object[0]);
        long jP = p(4);
        this.o.e(Integer.valueOf(q() - 1));
        j((ewfr) b(jP).toBuilder());
    }

    public final void m(dezf dezfVar) {
        if (r(3)) {
            return;
        }
        dhja.o("Sending RCS uptime unregistered event with reason: %s", dezfVar);
        long jP = p(3);
        this.l.e(Integer.valueOf(dezfVar.ordinal()));
        ewfr ewfrVar = (ewfr) b(jP).toBuilder();
        if (ewga.a(dezfVar.ordinal()) != 0) {
            int iA = ewga.a(dezfVar.ordinal());
            ewfrVar.copyOnWrite();
            ewfu ewfuVar = (ewfu) ewfrVar.instance;
            if (iA == 0) {
                throw null;
            }
            ewfuVar.f = iA - 1;
            ewfuVar.b |= 8;
        }
        j(ewfrVar);
    }

    public final boolean n() {
        Context context = this.c;
        return dhka.i(context) ? dhka.a(context) != 2 : ((Integer) dhhb.f.d()).intValue() == 2;
    }

    final long p(int i) {
        dbho dbhoVar = this.n;
        this.m.e((Integer) dbhoVar.d());
        int i2 = i - 1;
        dbhoVar.e(Integer.valueOf(i2));
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (i2 == 1) {
            this.j.e(Long.valueOf(timeInMillis));
            return timeInMillis;
        }
        if (i2 != 3) {
            this.i.e(Long.valueOf(timeInMillis));
            return timeInMillis;
        }
        this.h.e(Long.valueOf(timeInMillis));
        return timeInMillis;
    }

    final int q() {
        NetworkInfo networkInfoS;
        try {
            networkInfoS = s();
        } catch (dhkf unused) {
            dhja.g("Missing permission to retrieve network info for uptime metric.", new Object[0]);
            networkInfoS = null;
        }
        if (networkInfoS == null) {
            return 1;
        }
        int type = networkInfoS.getType();
        if (type == 0) {
            return 7;
        }
        if (type != 1) {
            return (type == 17 && ((Boolean) a.a()).booleanValue()) ? 15 : 1;
        }
        return 5;
    }

    final boolean r(int i) {
        return ((Integer) this.n.d()).intValue() == i + (-1);
    }
}
