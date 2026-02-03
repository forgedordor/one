package defpackage;

import android.app.Activity;
import android.os.Bundle;
import j$.lang.Iterable$EL;
import j$.util.function.Consumer$CC;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqaw implements cqax {
    public static final /* synthetic */ int a = 0;
    private final Set b;
    private final Set c = new HashSet();
    private final Set d = new HashSet();
    private final Set e = new HashSet();

    public cqaw(Set set) {
        this.b = set;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        eieu eieuVarK = eiiy.k("AppStateManagerV2#onActivityCreated");
        try {
            Set set = this.c;
            if (set.add(activity) && set.size() == 1) {
                Iterable$EL.forEach(this.b, new Consumer() { // from class: cqau
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i = cqaw.a;
                        ((cqad) obj).a();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Set set = this.e;
        if (set.remove(activity) && set.isEmpty()) {
            Iterable$EL.forEach(this.b, new Consumer() { // from class: cqak
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i = cqaw.a;
                    ((cqad) obj).e();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        Set set2 = this.d;
        if (set2.remove(activity) && set2.isEmpty()) {
            Iterable$EL.forEach(this.b, new Consumer() { // from class: cqan
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i = cqaw.a;
                    ((cqad) obj).f();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        Set set3 = this.c;
        if (set3.remove(activity) && set3.isEmpty()) {
            Iterable$EL.forEach(this.b, new Consumer() { // from class: cqao
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i = cqaw.a;
                    ((cqad) obj).d();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Set set = this.e;
        if (set.remove(activity) && set.isEmpty()) {
            Iterable$EL.forEach(this.b, new Consumer() { // from class: cqar
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i = cqaw.a;
                    ((cqad) obj).e();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        eieu eieuVarK = eiiy.k("AppStateManagerV2#onActivityResumed");
        try {
            Set set = this.c;
            if (set.add(activity) && set.size() == 1) {
                Iterable$EL.forEach(this.b, new Consumer() { // from class: cqav
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i = cqaw.a;
                        ((cqad) obj).a();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            Set set2 = this.d;
            if (set2.add(activity) && set2.size() == 1) {
                Iterable$EL.forEach(this.b, new Consumer() { // from class: cqal
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i = cqaw.a;
                        ((cqad) obj).c();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            Set set3 = this.e;
            if (set3.add(activity) && set3.size() == 1) {
                Iterable$EL.forEach(this.b, new Consumer() { // from class: cqam
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i = cqaw.a;
                        ((cqad) obj).b();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        eieu eieuVarK = eiiy.k("AppStateManagerV2#onActivityStarted");
        try {
            Set set = this.c;
            if (set.add(activity) && set.size() == 1) {
                Iterable$EL.forEach(this.b, new Consumer() { // from class: cqas
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i = cqaw.a;
                        ((cqad) obj).a();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            Set set2 = this.d;
            if (set2.add(activity) && set2.size() == 1) {
                Iterable$EL.forEach(this.b, new Consumer() { // from class: cqat
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i = cqaw.a;
                        ((cqad) obj).c();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Set set = this.e;
        if (set.remove(activity) && set.isEmpty()) {
            Iterable$EL.forEach(this.b, new Consumer() { // from class: cqap
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i = cqaw.a;
                    ((cqad) obj).e();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        Set set2 = this.d;
        if (set2.remove(activity) && set2.isEmpty()) {
            Iterable$EL.forEach(this.b, new Consumer() { // from class: cqaq
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i = cqaw.a;
                    ((cqad) obj).f();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
