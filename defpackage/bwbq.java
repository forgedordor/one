package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.communication.synapse.security.scytale.UserDevices;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwbq implements cfrj {
    private static final cqce a = cqce.g("BugleE2eeEtouffee", "DownloadPreKeysHandler");
    private final ArrayList b;
    private final String c;
    private String d = "";
    private long e = 0;

    public bwbq(ArrayList arrayList, String str) {
        this.b = arrayList;
        this.c = str;
    }

    @Override // defpackage.cfrj
    public final long a() {
        return this.e;
    }

    @Override // defpackage.cfrj
    public final cfrh b() {
        return new cfre(this.c);
    }

    @Override // defpackage.cfrj
    public final ListenableFuture c(ezpp ezppVar) {
        ezvb ezvbVar = (ezvb) ezvc.a.createBuilder();
        ezvbVar.copyOnWrite();
        ((ezvc) ezvbVar.instance).e = 3;
        ezvbVar.copyOnWrite();
        ((ezvc) ezvbVar.instance).f = 3;
        ezvbVar.copyOnWrite();
        ezvc ezvcVar = (ezvc) ezvbVar.instance;
        ezppVar.getClass();
        ezvcVar.c = ezppVar;
        ezvcVar.b |= 1;
        ezvbVar.copyOnWrite();
        ((ezvc) ezvbVar.instance).g = false;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            UserDevices userDevices = (UserDevices) arrayList.get(i);
            Stream map = Collection.EL.stream(userDevices.getDeviceIds()).map(new Function() { // from class: bwbp
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return evqs.A((String) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i2 = ekgb.d;
            Iterable iterable = (Iterable) map.collect(ekcv.a);
            ezqa ezqaVar = (ezqa) ezqb.a.createBuilder();
            ezok ezokVar = (ezok) ezol.a.createBuilder();
            ezokVar.copyOnWrite();
            ((ezol) ezokVar.instance).d = "RCS";
            felm felmVar = felm.PHONE_NUMBER;
            ezokVar.copyOnWrite();
            ((ezol) ezokVar.instance).b = felmVar.a();
            String userId = userDevices.getUserId();
            ezokVar.copyOnWrite();
            ezol ezolVar = (ezol) ezokVar.instance;
            userId.getClass();
            ezolVar.c = userId;
            ezqaVar.copyOnWrite();
            ezqb ezqbVar = (ezqb) ezqaVar.instance;
            ezol ezolVar2 = (ezol) ezokVar.build();
            ezolVar2.getClass();
            ezqbVar.c = ezolVar2;
            ezqbVar.b |= 1;
            ezqaVar.copyOnWrite();
            ezqb ezqbVar2 = (ezqb) ezqaVar.instance;
            evtg evtgVar = ezqbVar2.d;
            if (!evtgVar.c()) {
                ezqbVar2.d = evsn.mutableCopy(evtgVar);
            }
            evpz.addAll(iterable, ezqbVar2.d);
            ezqb ezqbVar3 = (ezqb) ezqaVar.build();
            ezvbVar.copyOnWrite();
            ezvc ezvcVar2 = (ezvc) ezvbVar.instance;
            ezqbVar3.getClass();
            evtg evtgVar2 = ezvcVar2.d;
            if (!evtgVar2.c()) {
                ezvcVar2.d = evsn.mutableCopy(evtgVar2);
            }
            ezvcVar2.d.add(ezqbVar3);
        }
        this.d = ezppVar.c;
        return eork.i((ezvc) ezvbVar.build());
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture d(cezv cezvVar, evuh evuhVar) {
        ezvc ezvcVar = (ezvc) evuhVar;
        cqbd cqbdVarD = a.d();
        cqbdVarD.I("Sent");
        cqbdVarD.A("GetPreKeyBatchRequest", ezvcVar);
        cqbdVarD.r();
        ezok ezokVar = (ezok) ezol.a.createBuilder();
        ezokVar.copyOnWrite();
        ((ezol) ezokVar.instance).c = this.c;
        return cezvVar.d((ezol) ezokVar.build()).b(ezvcVar);
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture e(evuh evuhVar) {
        long j;
        ezvi ezviVar = (ezvi) evuhVar;
        if (ezviVar != null) {
            ezpr ezprVar = ezviVar.b;
            if (ezprVar == null) {
                ezprVar = ezpr.a;
            }
            j = ezprVar.b;
        } else {
            j = 0;
        }
        this.e = j;
        return eork.i(ezviVar);
    }

    @Override // defpackage.cfrj
    public final String f() {
        return "DownloadPreKeysHandler";
    }

    @Override // defpackage.cfrj
    public final String g() {
        return this.d;
    }

    @Override // defpackage.cfrj
    public final /* synthetic */ void h(Throwable th) {
        cfri.c(this);
    }

    @Override // defpackage.cfrj
    public final /* synthetic */ void i() {
        cfri.a(this);
    }

    @Override // defpackage.cfrj
    public final /* synthetic */ void j() {
        cfri.b(this);
    }

    @Override // defpackage.cfxa
    public final void k() {
    }

    @Override // defpackage.cfxa
    public final /* synthetic */ void l() {
    }
}
