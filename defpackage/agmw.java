package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agmw {
    public final agnw a;
    public final agni b;
    public final agoo c;
    public final fcsu d;
    public final ekrg e = ekrg.c("com/google/android/apps/messaging/otp/deletion/OtpDeletionApiImpl");
    private final eosc f;
    private final eosc g;

    public agmw(eosc eoscVar, eosc eoscVar2, agnw agnwVar, agni agniVar, agoo agooVar, fcsu fcsuVar) {
        this.f = eoscVar;
        this.g = eoscVar2;
        this.a = agnwVar;
        this.b = agniVar;
        this.c = agooVar;
        this.d = fcsuVar;
    }

    public final eiju a(boolean z) {
        return !z ? this.a.b(false) : this.a.b(true).i(new eooz() { // from class: agmu
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.a.c();
            }
        }, this.g).h(new ejvr() { // from class: agmv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                bpzs bpzsVarA = bpzx.a();
                bpzsVarA.A("enableOtpAutoDelete2");
                bpzsVarA.e(new Function() { // from class: agmr
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bpzw bpzwVar = (bpzw) obj2;
                        bpzwVar.b(1);
                        return bpzwVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bpze bpzeVar = (bpze) bpzsVarA.b().p();
                agmw agmwVar = this.a;
                try {
                    List list = (List) Collection.EL.stream(bpzeVar.c()).map(new Function() { // from class: agms
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return ((MessageIdType) obj2).b();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.toCollection(new Supplier() { // from class: agmt
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return new ArrayList();
                        }
                    }));
                    String string = UUID.randomUUID().toString();
                    if (((arpw) agmwVar.d.b()).a()) {
                        ekrw ekrwVarH = agmwVar.e.h();
                        ekrwVarH.X(eksq.a, "BugleOtp");
                        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/otp/deletion/OtpDeletionApiImpl", "queueForDeletion", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "OtpDeletionApiImpl.java")).w("Queueing batch deletion job for %s OTP messages. SessionId: %s", list.size(), string);
                    }
                    agmwVar.c.d(string, 2);
                    agni agniVar = agmwVar.b;
                    agnj agnjVar = (agnj) agnk.a.createBuilder();
                    agnjVar.copyOnWrite();
                    agnk agnkVar = (agnk) agnjVar.instance;
                    agnkVar.a();
                    evpz.addAll(list, agnkVar.b);
                    agnjVar.copyOnWrite();
                    agnk agnkVar2 = (agnk) agnjVar.instance;
                    string.getClass();
                    agnkVar2.c = string;
                    agnk agnkVar3 = (agnk) agnjVar.build();
                    caxr caxrVar = new caxr();
                    caxrVar.c = Duration.ofMillis(((Long) agnl.b.e()).longValue());
                    agniVar.a(agnkVar3, caxrVar.a());
                    bpzeVar.close();
                    return null;
                } catch (Throwable th) {
                    try {
                        bpzeVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }, this.f);
    }
}
