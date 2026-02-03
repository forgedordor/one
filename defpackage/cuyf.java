package defpackage;

import androidx.preference.TwoStatePreference;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuyf {
    public final efwo a;
    public egps b;
    public egps c;
    public egps d;
    public final ozm e;
    public final fcsu f;
    public Optional g;
    public Optional h;
    public Optional i;
    public final fcsu j;
    public final fcsu k;

    /* compiled from: PG */
    final class a implements egzv<afhi> {
        public a() {
        }

        @Override // defpackage.egzv
        public final void a(Throwable th) {
            cuyf cuyfVar = cuyf.this;
            cuyfVar.g.ifPresent(new Consumer() { // from class: cuxo
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ((TwoStatePreference) obj).G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            cuyfVar.i.ifPresent(new Consumer() { // from class: cuxw
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ((TwoStatePreference) obj).G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            cuyfVar.h.ifPresent(new Consumer() { // from class: cuxx
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ((TwoStatePreference) obj).G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.egzv
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            final afhi afhiVar = (afhi) obj;
            cuyf cuyfVar = cuyf.this;
            cuyfVar.g.ifPresent(new Consumer() { // from class: cuxy
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    ((TwoStatePreference) obj2).G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            cuyfVar.g.ifPresent(new Consumer() { // from class: cuya
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    ((TwoStatePreference) obj2).k(afhiVar.b());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            if (afhiVar.a()) {
                cuyfVar.g.ifPresent(new Consumer() { // from class: cuyb
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
            cuyfVar.i.ifPresent(new Consumer() { // from class: cuyc
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    ((TwoStatePreference) obj2).G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            cuyfVar.i.ifPresent(new Consumer() { // from class: cuyd
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    ((TwoStatePreference) obj2).k(afhiVar.a());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            cuyfVar.h.ifPresent(new Consumer() { // from class: cuye
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    ((TwoStatePreference) obj2).G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            cuyfVar.h.ifPresent(new Consumer() { // from class: cuxp
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    ((TwoStatePreference) obj2).k(afhiVar.c());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            if (!afhiVar.a() && !afhiVar.b()) {
                cuyfVar.h.ifPresent(new Consumer() { // from class: cuxq
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
            cuyfVar.g.ifPresent(new Consumer() { // from class: cuxr
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    ((TwoStatePreference) obj2).N(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            cuyfVar.i.ifPresent(new Consumer() { // from class: cuxs
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    ((TwoStatePreference) obj2).N(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            cuyfVar.h.ifPresent(new Consumer() { // from class: cuxz
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    ((TwoStatePreference) obj2).N(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.egzv
        public final void hn() {
            cuyf cuyfVar = cuyf.this;
            cuyfVar.g.ifPresent(new Consumer() { // from class: cuxt
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ((TwoStatePreference) obj).G(false);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            cuyfVar.i.ifPresent(new Consumer() { // from class: cuxu
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ((TwoStatePreference) obj).G(false);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            cuyfVar.h.ifPresent(new Consumer() { // from class: cuxv
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
    }

    /* compiled from: PG */
    final class b implements egps<Boolean, Void> {
        public b() {
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            cuyf.this.i.ifPresent(new Consumer() { // from class: cuyi
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
            cuyf.this.i.ifPresent(new Consumer() { // from class: cuyh
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
            cuyf.this.i.ifPresent(new Consumer() { // from class: cuyg
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    ((TwoStatePreference) obj2).k(!bool.booleanValue());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    /* compiled from: PG */
    final class c implements egps<Boolean, Void> {
        public c() {
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            cuyf.this.g.ifPresent(new Consumer() { // from class: cuyk
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
            cuyf.this.g.ifPresent(new Consumer() { // from class: cuyj
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
            cuyf cuyfVar = cuyf.this;
            cuyfVar.g.ifPresent(new Consumer() { // from class: cuyl
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    ((TwoStatePreference) obj2).G(false);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            cuyfVar.g.ifPresent(new Consumer() { // from class: cuym
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    ((TwoStatePreference) obj2).k(!bool.booleanValue());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    /* compiled from: PG */
    final class d implements egps<Boolean, Void> {
        public d() {
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            cuyf.this.h.ifPresent(new Consumer() { // from class: cuyn
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
            cuyf.this.h.ifPresent(new Consumer() { // from class: cuyo
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
            cuyf.this.h.ifPresent(new Consumer() { // from class: cuyp
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    ((TwoStatePreference) obj2).k(!bool.booleanValue());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    public cuyf(cuxh cuxhVar, fcsu fcsuVar, efwo efwoVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.a = efwoVar;
        this.e = cuxhVar;
        this.f = fcsuVar;
        this.j = fcsuVar2;
        this.k = fcsuVar3;
    }
}
