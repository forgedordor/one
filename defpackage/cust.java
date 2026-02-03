package defpackage;

import androidx.preference.SwitchPreferenceCompat;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cust {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public Optional f = Optional.empty();
    public Optional g = Optional.empty();
    public final egzv h = new egzv<crku>() { // from class: cust.1
        @Override // defpackage.egzv
        public final void a(Throwable th) {
            cust custVar = cust.this;
            custVar.f.ifPresent(new Consumer() { // from class: cusr
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ((SwitchPreferenceCompat) obj).G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            custVar.g.ifPresent(new Consumer() { // from class: cuss
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ((SwitchPreferenceCompat) obj).G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.egzv
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            final crku crkuVar = (crku) obj;
            cust custVar = cust.this;
            custVar.f.ifPresent(new Consumer() { // from class: cusn
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) obj2;
                    switchPreferenceCompat.k(crkuVar.c);
                    switchPreferenceCompat.G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            custVar.g.ifPresent(new Consumer() { // from class: cuso
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) obj2;
                    switchPreferenceCompat.k(crkuVar.e);
                    switchPreferenceCompat.G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.egzv
        public final void hn() {
            cust custVar = cust.this;
            custVar.f.ifPresent(new Consumer() { // from class: cusp
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ((SwitchPreferenceCompat) obj).G(false);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            custVar.g.ifPresent(new Consumer() { // from class: cusq
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ((SwitchPreferenceCompat) obj).G(false);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    };
    public final egps i = new egps<Boolean, Void>() { // from class: cust.2
        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            final Boolean bool = (Boolean) obj;
            cust.this.f.ifPresent(new Consumer() { // from class: cusw
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) obj2;
                    switchPreferenceCompat.G(false);
                    switchPreferenceCompat.k(bool.booleanValue());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            cust.this.f.ifPresent(new Consumer() { // from class: cusv
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj3) {
                    ((SwitchPreferenceCompat) obj3).G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
            final Boolean bool = (Boolean) obj;
            cust.this.f.ifPresent(new Consumer() { // from class: cusu
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) obj2;
                    switchPreferenceCompat.k(!bool.booleanValue());
                    switchPreferenceCompat.G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    };
    public final egps j = new egps<Boolean, Void>() { // from class: cust.3
        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            final Boolean bool = (Boolean) obj;
            cust.this.g.ifPresent(new Consumer() { // from class: cusz
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) obj2;
                    switchPreferenceCompat.G(false);
                    switchPreferenceCompat.k(bool.booleanValue());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            cust.this.g.ifPresent(new Consumer() { // from class: cusy
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj3) {
                    ((SwitchPreferenceCompat) obj3).G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
            final Boolean bool = (Boolean) obj;
            cust.this.g.ifPresent(new Consumer() { // from class: cusx
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) obj2;
                    switchPreferenceCompat.k(!bool.booleanValue());
                    switchPreferenceCompat.G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    };

    public cust(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fcsuVar4;
        this.e = fcsuVar5;
    }

    public static boolean b() {
        return tet.a() && ((Boolean) ((cczi) tet.c.get()).e()).booleanValue();
    }

    public final Optional a(int i) {
        fcsu fcsuVar = this.a;
        return Optional.ofNullable(((cusf) fcsuVar.b()).a(((cusf) fcsuVar.b()).Y(i)));
    }
}
