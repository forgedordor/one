package defpackage;

import androidx.preference.TwoStatePreference;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahbv {
    public static final cqce a = cqce.g("Bugle", "EtouffeeToggleFragmentPeer");
    public final ahbp b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public Optional h = Optional.empty();
    public final egzv i = new egzv<Boolean>() { // from class: ahbv.1
        @Override // defpackage.egzv
        public final void a(Throwable th) {
            ahbv.this.h.ifPresent(new Consumer() { // from class: ahbt
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ((TwoStatePreference) obj).G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            ahbv.a.o("Failed to load etouffee setting data", th);
        }

        @Override // defpackage.egzv
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            final Boolean bool = (Boolean) obj;
            ahbv.this.h.ifPresent(new Consumer() { // from class: ahbs
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    TwoStatePreference twoStatePreference = (TwoStatePreference) obj2;
                    twoStatePreference.k(bool.booleanValue());
                    twoStatePreference.G(true);
                    twoStatePreference.N(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.egzv
        public final void hn() {
            ahbv.this.h.ifPresent(new Consumer() { // from class: ahbu
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ((TwoStatePreference) obj).G(false);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    };
    public final egps j = new egps<Boolean, Void>() { // from class: ahbv.2
        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            ahbv.this.h.ifPresent(new Consumer() { // from class: ahby
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    ((TwoStatePreference) obj2).G(false);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            ahbv.this.h.ifPresent(new Consumer() { // from class: ahbw
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj3) {
                    ((TwoStatePreference) obj3).G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
            final Boolean bool = (Boolean) obj;
            ahbv.this.h.ifPresent(new Consumer() { // from class: ahbx
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    TwoStatePreference twoStatePreference = (TwoStatePreference) obj2;
                    twoStatePreference.k(!bool.booleanValue());
                    twoStatePreference.G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            ahbv.a.o("Failed to save etouffee setting data", th);
        }
    };

    public ahbv(ahbp ahbpVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        this.b = ahbpVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.f = fcsuVar;
        this.g = fcsuVar5;
    }
}
