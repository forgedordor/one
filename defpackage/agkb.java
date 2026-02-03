package defpackage;

import android.app.NotificationChannel;
import android.content.Intent;
import androidx.preference.TwoStatePreference;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agkb {
    public static final cqce a = cqce.g("Bugle", "NotificationSettingsFragmentPeer");
    public final agju b;
    public final ehac c;
    public final egpr d;
    public final eils e;
    public final Optional f;
    public final ajhd g;
    public final crac h;
    public final cqzr i;
    public final crqx j;
    public final fcsu k;
    public final egzv l = new egzv<Boolean>() { // from class: agkb.1
        @Override // defpackage.egzv
        public final void a(Throwable th) {
            agkb.this.o.ifPresent(new Consumer() { // from class: agjy
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ((TwoStatePreference) obj).G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            agkb.a.n("Failed to load reminder setting data");
        }

        @Override // defpackage.egzv
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            final Boolean bool = (Boolean) obj;
            agkb.this.o.ifPresent(new Consumer() { // from class: agjz
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    TwoStatePreference twoStatePreference = (TwoStatePreference) obj2;
                    twoStatePreference.G(true);
                    twoStatePreference.k(bool.booleanValue());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.egzv
        public final void hn() {
            agkb.this.o.ifPresent(new Consumer() { // from class: agka
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
    public final egps m = new egps<Boolean, Void>() { // from class: agkb.2
        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            agkb.this.o.ifPresent(new Consumer() { // from class: agkf
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
            agkb.this.o.ifPresent(new Consumer() { // from class: agke
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
            agkb agkbVar = agkb.this;
            agkbVar.o.ifPresent(new Consumer() { // from class: agkc
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    ((TwoStatePreference) obj2).k(!bool.booleanValue());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            agkbVar.o.ifPresent(new Consumer() { // from class: agkd
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    ((TwoStatePreference) obj2).G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            agkb.a.n("Failed to save reminder action setting");
        }
    };
    public final egps n = new egps<Void, Void>() { // from class: agkb.3
        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void b(Object obj) {
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
            agkb agkbVar = agkb.this;
            intent.putExtra("android.provider.extra.APP_PACKAGE", agkbVar.h.a.getPackageName());
            agkbVar.p = agkbVar.i.f();
            agkbVar.b.startActivityForResult(intent, 1001);
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
            agkb.a.n("Failed to enable default notification");
        }
    };
    public Optional o;
    public NotificationChannel p;

    public agkb(agju agjuVar, ehac ehacVar, egpr egprVar, eils eilsVar, Optional optional, ajhd ajhdVar, crac cracVar, cqzr cqzrVar, crqx crqxVar, fcsu fcsuVar) {
        this.b = agjuVar;
        this.c = ehacVar;
        this.d = egprVar;
        this.e = eilsVar;
        this.g = ajhdVar;
        this.h = cracVar;
        this.i = cqzrVar;
        this.f = optional;
        this.j = crqxVar;
        this.k = fcsuVar;
    }

    public final Optional a(int i) {
        agju agjuVar = this.b;
        return Optional.ofNullable(agjuVar.a(agjuVar.Y(i)));
    }
}
