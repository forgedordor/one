package defpackage;

import android.content.Context;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crqu {
    private final crqs a;
    private final crny b;
    private final Optional c;
    private final cvx d = new cvx();
    private final Object e = new Object();

    public crqu(crqs crqsVar, crny crnyVar, Optional optional) {
        this.a = crqsVar;
        this.b = crnyVar;
        this.c = optional;
    }

    public final crqv a(int i) throws Throwable {
        int iA = this.b.h(i).a();
        cvx cvxVar = this.d;
        crqr crqrVar = (crqr) cvy.a(cvxVar, iA);
        if (crqrVar != null) {
            return crqrVar;
        }
        synchronized (this.e) {
            try {
                try {
                    final crqr crqrVar2 = (crqr) cvy.a(cvxVar, iA);
                    if (crqrVar2 == null) {
                        crqs crqsVar = this.a;
                        Context context = (Context) crqsVar.a.b();
                        context.getClass();
                        crqp crqpVar = (crqp) crqsVar.b.b();
                        crqpVar.getClass();
                        crny crnyVar = (crny) crqsVar.c.b();
                        crnyVar.getClass();
                        cmum cmumVar = (cmum) crqsVar.d.b();
                        cmumVar.getClass();
                        crqrVar2 = new crqr(context, crqpVar, crnyVar, cmumVar, iA, this);
                        cvxVar.f(iA, crqrVar2);
                        this.c.ifPresent(new Consumer() { // from class: crqt
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj) {
                                szw szwVar = ((crqo) obj).a;
                                szwVar.a(crqrVar2.a(), szg.b(szwVar.a));
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                    }
                    return crqrVar2;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
