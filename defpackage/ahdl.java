package defpackage;

import androidx.preference.TwoStatePreference;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahdl {
    public static final cqce a = cqce.g("Bugle", "PrivacySettingsFragmentPeer");
    public final ahdf b;
    public final ehac c;
    public final egpr d;
    public final eils e;
    public final fcsu f;
    public Optional g;
    public final egzv h = new egzv<Boolean>() { // from class: ahdl.1
        @Override // defpackage.egzv
        public final void a(Throwable th) {
            ahdl.this.g.ifPresent(new Consumer() { // from class: ahdj
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ((TwoStatePreference) obj).G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            ahdl.a.o("Failed to load etouffee setting data", th);
        }

        @Override // defpackage.egzv
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            final Boolean bool = (Boolean) obj;
            ahdl.this.g.ifPresent(new Consumer() { // from class: ahdi
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
            ahdl.this.g.ifPresent(new Consumer() { // from class: ahdk
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
    public final egps i = new egps<Boolean, Void>() { // from class: ahdl.2
        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            ahdl.this.g.ifPresent(new Consumer() { // from class: ahdm
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
            ahdl.this.g.ifPresent(new Consumer() { // from class: ahdo
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
            ahdl.this.g.ifPresent(new Consumer() { // from class: ahdn
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
            ahdl.a.o("Failed to save etouffee setting data", th);
        }
    };

    public ahdl(ahdf ahdfVar, ehac ehacVar, egpr egprVar, eils eilsVar, fcsu fcsuVar) {
        this.b = ahdfVar;
        this.c = ehacVar;
        this.d = egprVar;
        this.e = eilsVar;
        this.f = fcsuVar;
    }
}
