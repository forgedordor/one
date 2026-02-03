package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Calendar;
import java.util.HashSet;
import java.util.UUID;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajku implements ajkv {
    public static final cqce a = cqce.g("BugleUsageStatistics", "UptimeTracker");
    public final fcsu b;
    public final cqbm c;
    private final Context f;
    private final fcsu g;
    private final dhes h;
    private final fcsu i;
    private final fcsu j;
    private Integer m;
    private ewfc n;
    private long o;
    private long p;
    private long q;
    private final cqew r;
    private final String k = UUID.randomUUID().toString();
    private long l = 0;
    public enwr d = enwr.INVALID_PRE_KOTO;
    private int s = 1;
    public int e = 1;

    public ajku(Context context, fcsu fcsuVar, dhes dhesVar, cqbm cqbmVar, crma crmaVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        ajkt ajktVar = new ajkt(this);
        this.r = ajktVar;
        this.f = context;
        this.g = fcsuVar;
        this.h = dhesVar;
        this.c = cqbmVar;
        this.i = fcsuVar2;
        this.j = fcsuVar4;
        this.b = fcsuVar3;
        cqey cqeyVar = (cqey) cqbmVar.a();
        cqer cqerVar = (cqer) cqeu.a.createBuilder();
        cqet cqetVar = crmaVar.k() ? cqet.ALL_ACTIVE_SUBSCRIPTIONS : cqet.DEFAULT_SYSTEM_SUBSCRIPTION;
        cqerVar.copyOnWrite();
        cqeu cqeuVar = (cqeu) cqerVar.instance;
        cqeuVar.c = cqetVar.e;
        cqeuVar.b |= 1;
        cqeyVar.m(ajktVar, (cqeu) cqerVar.build());
        if (((aqsx) fcsuVar3.b()).a()) {
            h(2);
        } else {
            i(Optional.empty(), 2, this.d);
        }
    }

    private final elsl j(final int i, Optional optional) {
        return (elsl) ((cmlb) this.i.b()).j(new dggp((String) optional.orElse(""))).stream().flatMap(new Function() { // from class: ajks
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cmmh cmmhVar = (cmmh) obj;
                Optional optionalOf = Optional.of(cmmhVar);
                String str = cmmhVar.c;
                ajku ajkuVar = this.a;
                return Stream.CC.ofNullable(ajkuVar.i(optionalOf, i, ajkuVar.b(str)));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new ajko()).findFirst().orElse(null);
    }

    public final elsl a(Optional optional, enwr enwrVar) {
        int iIntValue;
        elsi elsiVar = (elsi) elsl.a.createBuilder();
        int i = this.e;
        elsiVar.copyOnWrite();
        elsl elslVar = (elsl) elsiVar.instance;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        elslVar.c = i2;
        elslVar.b |= 1;
        int i3 = this.s;
        elsiVar.copyOnWrite();
        elsl elslVar2 = (elsl) elsiVar.instance;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        elslVar2.d = i4;
        elslVar2.b |= 2;
        if (!((aqsx) this.b.b()).a()) {
            enwrVar = this.d;
        }
        elsiVar.copyOnWrite();
        elsl elslVar3 = (elsl) elsiVar.instance;
        elslVar3.e = enwrVar.N;
        elslVar3.b |= 4;
        long j = this.o;
        elsiVar.copyOnWrite();
        elsl elslVar4 = (elsl) elsiVar.instance;
        elslVar4.b |= 8;
        elslVar4.f = j;
        long j2 = this.p;
        elsiVar.copyOnWrite();
        elsl elslVar5 = (elsl) elsiVar.instance;
        elslVar5.b |= 16;
        elslVar5.g = j2;
        long j3 = this.q;
        elsiVar.copyOnWrite();
        elsl elslVar6 = (elsl) elsiVar.instance;
        elslVar6.b |= 32;
        elslVar6.h = j3;
        String str = this.k;
        elsiVar.copyOnWrite();
        elsl elslVar7 = (elsl) elsiVar.instance;
        str.getClass();
        elslVar7.b |= 64;
        elslVar7.i = str;
        long j4 = this.l;
        this.l = 1 + j4;
        elsiVar.copyOnWrite();
        elsl elslVar8 = (elsl) elsiVar.instance;
        elslVar8.b |= 128;
        elslVar8.j = j4;
        elvt elvtVar = (elvt) elvv.a.createBuilder();
        Integer num = this.m;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            try {
                this.m = Integer.valueOf(this.f.getPackageManager().getPackageInfo("com.google.android.ims", 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                this.m = -1;
            }
            a.q("Loaded CS version.");
            iIntValue = this.m.intValue();
        }
        elvtVar.copyOnWrite();
        elvv elvvVar = (elvv) elvtVar.instance;
        elvvVar.b |= 1;
        elvvVar.c = iIntValue;
        elsiVar.copyOnWrite();
        elsl elslVar9 = (elsl) elsiVar.instance;
        elvv elvvVar2 = (elvv) elvtVar.build();
        elvvVar2.getClass();
        elslVar9.k = elvvVar2;
        elslVar9.b |= 256;
        fcsu fcsuVar = this.b;
        if (!((aqsx) fcsuVar.b()).a()) {
            optional = Optional.empty();
        }
        ewfc ewfcVar = this.n;
        if (ewfcVar == null) {
            boolean zA = ((aqsx) fcsuVar.b()).a();
            String strM = zA ? (String) optional.map(new Function() { // from class: ajkj
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((cmmh) obj).s;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse("") : this.h.m();
            if (TextUtils.isEmpty(strM)) {
                a.r("Unable to retrieve SIM operator information for metrics!");
                ewfcVar = ewfc.a;
            } else {
                String strN = zA ? (String) optional.map(new Function() { // from class: ajkk
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((cmmh) obj).r;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse("") : this.h.n();
                String strI = zA ? (String) optional.map(new Function() { // from class: ajkl
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((cmmh) obj).t;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse("") : this.h.i();
                ewfb ewfbVar = (ewfb) ewfc.a.createBuilder();
                String strSubstring = strM.substring(0, 3);
                ewfbVar.copyOnWrite();
                ewfc ewfcVar2 = (ewfc) ewfbVar.instance;
                strSubstring.getClass();
                ewfcVar2.b |= 1;
                ewfcVar2.c = strSubstring;
                String strSubstring2 = strM.substring(3);
                ewfbVar.copyOnWrite();
                ewfc ewfcVar3 = (ewfc) ewfbVar.instance;
                strSubstring2.getClass();
                ewfcVar3.b |= 2;
                ewfcVar3.d = strSubstring2;
                boolean zBooleanValue = zA ? ((Boolean) optional.map(new Function() { // from class: ajkm
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Boolean.valueOf(((cmmh) obj).o);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(false)).booleanValue() : this.h.t();
                ewfbVar.copyOnWrite();
                ewfc ewfcVar4 = (ewfc) ewfbVar.instance;
                ewfcVar4.b |= 16;
                ewfcVar4.g = zBooleanValue;
                if (!TextUtils.isEmpty(strI)) {
                    String strI2 = zA ? (String) optional.map(new Function() { // from class: ajkl
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((cmmh) obj).t;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).orElse("") : this.h.i();
                    ewfbVar.copyOnWrite();
                    ewfc ewfcVar5 = (ewfc) ewfbVar.instance;
                    strI2.getClass();
                    ewfcVar5.b |= 8;
                    ewfcVar5.f = strI2;
                }
                if (!TextUtils.isEmpty(strN)) {
                    ewfbVar.copyOnWrite();
                    ewfc ewfcVar6 = (ewfc) ewfbVar.instance;
                    strN.getClass();
                    ewfcVar6.b |= 4;
                    ewfcVar6.e = strN;
                }
                this.n = (ewfc) ewfbVar.build();
                a.q("Loaded GSMNetworkId.");
                ewfcVar = this.n;
            }
        }
        elsiVar.copyOnWrite();
        elsl elslVar10 = (elsl) elsiVar.instance;
        ewfcVar.getClass();
        elslVar10.l = ewfcVar;
        elslVar10.b |= 1024;
        return (elsl) elsiVar.build();
    }

    public final enwr b(String str) {
        return ((dggw) this.j.b()).b(str).a;
    }

    public final void c(elsl elslVar) {
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        elslVar.getClass();
        ellhVar.I = elslVar;
        ellhVar.c |= 32;
        ((aill) this.g.b()).j(ellgVar);
        cqbd cqbdVarD = a.d();
        int iA = elsk.a(elslVar.c);
        cqbdVarD.A("Sending event to clearcut", (iA == 0 || iA == 1) ? "UNKNOWN_RCS_UPTIME_STATE" : iA != 2 ? iA != 3 ? "RCS_UPTIME_STATE_REGISTERED" : "RCS_UPTIME_STATE_UNREGISTERED" : "RCS_UPTIME_STATE_IGNORE");
        cqbdVarD.r();
    }

    @Override // defpackage.ajkv
    public final void d() {
        elsl elslVarA;
        a.q("Logging periodic event.");
        HashSet hashSet = new HashSet();
        synchronized (this) {
            this.s = this.e;
            if (((aqsx) this.b.b()).a()) {
                Iterable$EL.forEach((ekhx) Collection.EL.stream(((cmlb) this.i.b()).p()).map(new Function() { // from class: ajkr
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        cmmh cmmhVar = (cmmh) obj;
                        Optional optionalOf = Optional.of(cmmhVar);
                        String str = cmmhVar.c;
                        ajku ajkuVar = this.a;
                        return ajkuVar.a(optionalOf, ajkuVar.b(str));
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(ekcv.b), new ajkp(hashSet));
                elslVarA = null;
            } else {
                elslVarA = a(Optional.empty(), this.d);
            }
        }
        if (((aqsx) this.b.b()).a()) {
            Iterable$EL.forEach(hashSet, new ajkq(this));
        } else if (elslVarA != null) {
            c(elslVarA);
        }
    }

    @Override // defpackage.ajkv
    public final void e(enwr enwrVar, Optional optional) {
        elsl elslVarJ;
        cqbd cqbdVarD = a.d();
        cqbdVarD.A("Availability updated", enwrVar);
        cqbdVarD.r();
        synchronized (this) {
            elslVarJ = !g(enwrVar) ? ((aqsx) this.b.b()).a() ? j(2, optional) : i(Optional.empty(), 2, enwrVar) : this.e == 4 ? ((aqsx) this.b.b()).a() ? j(4, optional) : i(Optional.empty(), 4, enwrVar) : ((aqsx) this.b.b()).a() ? j(3, optional) : i(Optional.empty(), 3, enwrVar);
        }
        if (elslVarJ != null) {
            c(elslVarJ);
        }
    }

    @Override // defpackage.ajkv
    public final void f(boolean z) {
        elsl elslVarI;
        cqbd cqbdVarD = a.d();
        cqbdVarD.B("Registration updated", z);
        cqbdVarD.r();
        HashSet hashSet = new HashSet();
        synchronized (this) {
            elslVarI = null;
            if (z) {
                if (((aqsx) this.b.b()).a()) {
                    Iterable$EL.forEach(h(4), new ajkp(hashSet));
                } else {
                    elslVarI = i(Optional.empty(), 4, this.d);
                }
            } else if (g(this.d)) {
                if (((aqsx) this.b.b()).a()) {
                    Iterable$EL.forEach(h(3), new ajkp(hashSet));
                } else {
                    elslVarI = i(Optional.empty(), 3, this.d);
                }
            } else if (((aqsx) this.b.b()).a()) {
                Iterable$EL.forEach(h(2), new ajkp(hashSet));
            } else {
                elslVarI = i(Optional.empty(), 2, this.d);
            }
        }
        if (((aqsx) this.b.b()).a()) {
            Iterable$EL.forEach(hashSet, new ajkq(this));
        } else if (elslVarI != null) {
            c(elslVarI);
        }
    }

    public final boolean g(enwr enwrVar) {
        return ((cqey) this.c.a()).r() && enwrVar == enwr.AVAILABLE;
    }

    public final ekhx h(final int i) {
        return (ekhx) Collection.EL.stream(((cmlb) this.i.b()).p()).flatMap(new Function() { // from class: ajkn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cmmh cmmhVar = (cmmh) obj;
                Optional optionalOf = Optional.of(cmmhVar);
                String str = cmmhVar.c;
                ajku ajkuVar = this.a;
                return Stream.CC.ofNullable(ajkuVar.i(optionalOf, i, ajkuVar.b(str)));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new ajko()).collect(ekcv.b);
    }

    public final elsl i(Optional optional, int i, enwr enwrVar) {
        int i2 = this.e;
        if (i2 == i && this.d == enwrVar) {
            return null;
        }
        this.s = i2;
        this.e = i;
        this.d = enwrVar;
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        int i3 = i - 1;
        if (i3 == 2) {
            this.p = timeInMillis;
        } else if (i3 != 3) {
            this.q = timeInMillis;
        } else {
            this.o = timeInMillis;
        }
        return a(optional, this.d);
    }
}
