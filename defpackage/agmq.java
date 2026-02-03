package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Duration;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agmq implements bmgk {
    public final agni b;
    public final agoo c;
    public final fcsu d;
    private bpzr e;
    public final ekrg a = ekrg.c("com/google/android/apps/messaging/otp/deletion/OtpAnnotationDataChangeObserver");
    private final agmm f = new agmm(new Consumer() { // from class: agmn
        @Override // java.util.function.Consumer
        /* renamed from: accept */
        public final void z(Object obj) {
            MessageIdType messageIdType = (MessageIdType) obj;
            boolean zBooleanValue = ((Boolean) agnl.a.e()).booleanValue();
            agmq agmqVar = this.a;
            if (!zBooleanValue) {
                if (((arpw) agmqVar.d.b()).a()) {
                    ekrw ekrwVarE = agmqVar.a.e();
                    ekrwVarE.X(eksq.a, "BugleOtp");
                    ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/otp/deletion/OtpAnnotationDataChangeObserver", "onOTPInsertion", 92, "OtpAnnotationDataChangeObserver.java")).q("Not queueing OTP deletion job because flag is disabled.");
                    return;
                }
                return;
            }
            String string = UUID.randomUUID().toString();
            if (((arpw) agmqVar.d.b()).a()) {
                ekrw ekrwVarH = agmqVar.a.h();
                ekrwVarH.X(eksq.a, "BugleOtp");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/otp/deletion/OtpAnnotationDataChangeObserver", "onOTPInsertion", 99, "OtpAnnotationDataChangeObserver.java")).t("Queueing deletion job for OTP message. SessionId: %s", string);
            } else {
                ekrw ekrwVarH2 = agmqVar.a.h();
                ekrwVarH2.X(eksq.a, "BugleOtp");
                ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/otp/deletion/OtpAnnotationDataChangeObserver", "onOTPInsertion", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "OtpAnnotationDataChangeObserver.java")).q("Queueing deletion job for OTP message");
            }
            agmqVar.c.d(string, 2);
            agni agniVar = agmqVar.b;
            agnj agnjVar = (agnj) agnk.a.createBuilder();
            String strB = messageIdType.b();
            agnjVar.copyOnWrite();
            agnk agnkVar = (agnk) agnjVar.instance;
            strB.getClass();
            agnkVar.a();
            agnkVar.b.add(strB);
            agnjVar.copyOnWrite();
            agnk agnkVar2 = (agnk) agnjVar.instance;
            string.getClass();
            agnkVar2.c = string;
            agnk agnkVar3 = (agnk) agnjVar.build();
            caxr caxrVar = new caxr();
            caxrVar.c = Duration.ofMillis(((Long) agnl.b.e()).longValue());
            agniVar.a(agnkVar3, caxrVar.a());
        }

        public final /* synthetic */ Consumer andThen(Consumer consumer) {
            return Consumer$CC.$default$andThen(this, consumer);
        }
    });
    private final AtomicBoolean g = new AtomicBoolean(false);

    public agmq(agni agniVar, agoo agooVar, fcsu fcsuVar) {
        this.b = agniVar;
        this.d = fcsuVar;
        this.c = agooVar;
    }

    @Override // defpackage.bmgk
    public final void a() {
        bpzs bpzsVarA = bpzx.a();
        bpzsVarA.A("OtpAnnotationDataChangeObserver#createQueryObject1");
        bpzsVarA.d(new Function() { // from class: agmo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bpzc) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bpzsVarA.e(new Function() { // from class: agmp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bpzw bpzwVar = (bpzw) obj;
                bpzwVar.b(1);
                return bpzwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        this.e = bpzsVarA.b();
    }

    @Override // defpackage.bmgk
    public final void fZ() {
        if (this.g.compareAndSet(false, true)) {
            this.e.M(this.f);
        }
    }
}
