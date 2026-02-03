package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ace {
    public final fcuq a;
    public abs b;
    private final Runnable c;
    private OnBackInvokedCallback d;
    private OnBackInvokedDispatcher e;
    private boolean f;
    private boolean g;

    public ace() {
        this(null);
    }

    private final void g(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        OnBackInvokedCallback onBackInvokedCallback = this.d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z) {
            if (this.f) {
                return;
            }
            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, onBackInvokedCallback);
            this.f = true;
            return;
        }
        if (this.f) {
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.f = false;
        }
    }

    public final aap a(abs absVar) {
        this.a.add(absVar);
        acb acbVar = new acb(this, absVar);
        absVar.e(acbVar);
        f();
        absVar.c = new acd(this);
        return acbVar;
    }

    public final void b(lvj lvjVar, abs absVar) {
        lvjVar.getClass();
        absVar.getClass();
        lvc lvcVarP = lvjVar.P();
        if (lvcVarP.a() == lvb.a) {
            return;
        }
        absVar.e(new aca(this, lvcVarP, absVar));
        f();
        absVar.c = new acc(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void c() {
        abs absVarPrevious;
        abs absVar = this.b;
        if (absVar == null) {
            fcuq fcuqVar = this.a;
            ListIterator listIterator = fcuqVar.listIterator(fcuqVar.a);
            while (true) {
                if (!listIterator.hasPrevious()) {
                    absVarPrevious = 0;
                    break;
                } else {
                    absVarPrevious = listIterator.previous();
                    if (((abs) absVarPrevious).b) {
                        break;
                    }
                }
            }
            absVar = absVarPrevious;
        }
        this.b = null;
        if (absVar != null) {
            absVar.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void d() {
        abs absVarPrevious;
        abs absVar = this.b;
        if (absVar == null) {
            fcuq fcuqVar = this.a;
            ListIterator listIterator = fcuqVar.listIterator(fcuqVar.a);
            while (true) {
                if (!listIterator.hasPrevious()) {
                    absVarPrevious = 0;
                    break;
                } else {
                    absVarPrevious = listIterator.previous();
                    if (((abs) absVarPrevious).b) {
                        break;
                    }
                }
            }
            absVar = absVarPrevious;
        }
        this.b = null;
        if (absVar != null) {
            absVar.b();
            return;
        }
        Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void e(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        this.e = onBackInvokedDispatcher;
        g(this.g);
    }

    public final void f() {
        boolean z = this.g;
        fcuq fcuqVar = this.a;
        boolean z2 = false;
        if (!fcuqVar.isEmpty()) {
            Iterator<E> it = fcuqVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((abs) it.next()).b) {
                    z2 = true;
                    break;
                }
            }
        }
        this.g = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        g(z2);
    }

    public ace(Runnable runnable) {
        OnBackInvokedCallback abzVar;
        this.c = runnable;
        this.a = new fcuq();
        if (Build.VERSION.SDK_INT >= 33) {
            if (Build.VERSION.SDK_INT >= 34) {
                abzVar = new abz(new fdap() { // from class: abt
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        Object objPrevious;
                        aao aaoVar = (aao) obj;
                        aaoVar.getClass();
                        ace aceVar = this.a;
                        fcuq fcuqVar = aceVar.a;
                        ListIterator<E> listIterator = fcuqVar.listIterator(fcuqVar.a);
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                objPrevious = null;
                                break;
                            }
                            objPrevious = listIterator.previous();
                            if (((abs) objPrevious).b) {
                                break;
                            }
                        }
                        abs absVar = (abs) objPrevious;
                        if (aceVar.b != null) {
                            aceVar.c();
                        }
                        aceVar.b = absVar;
                        if (absVar != null) {
                            absVar.d(aaoVar);
                        }
                        return fctx.a;
                    }
                }, new fdap() { // from class: abu
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        Object objPrevious;
                        aao aaoVar = (aao) obj;
                        aaoVar.getClass();
                        ace aceVar = this.a;
                        abs absVar = aceVar.b;
                        if (absVar == null) {
                            fcuq fcuqVar = aceVar.a;
                            ListIterator<E> listIterator = fcuqVar.listIterator(fcuqVar.a);
                            while (true) {
                                if (!listIterator.hasPrevious()) {
                                    objPrevious = null;
                                    break;
                                }
                                objPrevious = listIterator.previous();
                                if (((abs) objPrevious).b) {
                                    break;
                                }
                            }
                            absVar = (abs) objPrevious;
                        }
                        if (absVar != null) {
                            absVar.c(aaoVar);
                        }
                        return fctx.a;
                    }
                }, new fdae() { // from class: abv
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        this.a.d();
                        return fctx.a;
                    }
                }, new fdae() { // from class: abw
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        this.a.c();
                        return fctx.a;
                    }
                });
            } else {
                final fdae fdaeVar = new fdae() { // from class: abx
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        this.a.d();
                        return fctx.a;
                    }
                };
                abzVar = new OnBackInvokedCallback() { // from class: aby
                    public final void onBackInvoked() {
                        fdaeVar.invoke();
                    }
                };
            }
            this.d = abzVar;
        }
    }
}
