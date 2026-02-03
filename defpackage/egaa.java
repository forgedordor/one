package defpackage;

import android.content.Intent;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egaa {
    public final egcd a;
    public final Set b;
    private final Map c;
    private final Map d;
    private final Map e;
    private final efyt f;

    public egaa(egcd egcdVar, Map map, Map map2, Map map3, Set set, efyt efytVar) {
        this.a = egcdVar;
        this.c = map;
        this.d = map2;
        this.e = map3;
        this.b = set;
        this.f = efytVar;
        Boolean bool = false;
        bool.getClass();
    }

    final ekgb a(List list) {
        if (list == null) {
            return this.f.e();
        }
        if (list.isEmpty()) {
            return ekoe.a;
        }
        ekfw ekfwVarD = ekgb.d(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fcsu fcsuVar = (fcsu) this.e.get((Class) it.next());
            fcsuVar.getClass();
            ekfwVarD.h((efyq) fcsuVar.b());
        }
        return ekfwVarD.g();
    }

    final ListenableFuture b(final efwo efwoVar, final List list, final Intent intent, final efxb efxbVar) {
        return eooq.g(this.a.a(efwoVar), eiid.d(new eooz() { // from class: efzq
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.e(efwoVar, list, intent, efxbVar);
            }
        }), eoqg.a);
    }

    final ListenableFuture c(final ListenableFuture listenableFuture, final List list, final Intent intent) {
        return eooq.g(listenableFuture, eiid.d(new eooz() { // from class: efzt
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                efwo efwoVar;
                efxe efxeVar = (efxe) obj;
                if (efxeVar.c != null || (efwoVar = efxeVar.a) == null) {
                    return listenableFuture;
                }
                return this.a.e(efwoVar, list, intent, efxeVar.e);
            }
        }), eoqg.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final ListenableFuture d(final efzi efziVar, List list, final efxb efxbVar) {
        Object obj;
        ArrayList arrayList = new ArrayList(((ekoe) list).c);
        ekqh it = ((ekgb) list).iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            if (efzf.class.isAssignableFrom(cls)) {
                ejwl.p(!efzh.class.isAssignableFrom(cls), "An account selector should only implement either AutoSelectorKey or InteractiveSelectorKey, but not both. Found %s that implements both keys", cls);
                Map map = this.c;
                ejwl.p(map.containsKey(cls), "Selector with key: [%s] not found, did you forget to include the module providing the selector for this key?", cls);
                obj = map.get(cls);
            } else {
                if (!efzh.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("No selector registered for key: ".concat(String.valueOf(String.valueOf(cls))));
                }
                ejwl.p(!efzf.class.isAssignableFrom(cls), "An account selector should only implement either AutoSelectorKey or InteractiveSelectorKey, but not both. Found %s that implements both keys", cls);
                Map map2 = this.d;
                ejwl.p(map2.containsKey(cls), "Selector with key: [%s] not found, did you forget to include the module providing the selector for this key?", cls);
                obj = map2.get(cls);
            }
            final fcsu fcsuVar = (fcsu) obj;
            arrayList.add(new eooy() { // from class: efzs
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    final efzc efzcVar = (efzc) fcsuVar.b();
                    return eooq.f(efzcVar.a(efziVar), new ejvr() { // from class: efzr
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            return Pair.create(efzcVar, obj2);
                        }
                    }, eoqg.a);
                }
            });
        }
        ejwm ejwmVar = new ejwm() { // from class: efzu
            @Override // defpackage.ejwm
            public final boolean a(Object obj2) {
                return ((Pair) obj2).second != null;
            }
        };
        eoqg eoqgVar = eoqg.a;
        return eooq.g(egax.a(arrayList, ejwmVar, eoqgVar), eiid.d(new eooz() { // from class: efzv
            /* JADX WARN: Removed duplicated region for block: B:10:0x005a A[Catch: all -> 0x006f, TRY_LEAVE, TryCatch #1 {all -> 0x006f, blocks: (B:4:0x000e, B:6:0x0014, B:7:0x0033, B:9:0x0039, B:10:0x005a), top: B:22:0x000e }] */
            @Override // defpackage.eooz
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r9) {
                /*
                    r8 = this;
                    android.util.Pair r9 = (android.util.Pair) r9
                    java.lang.String r0 = "AccountUiService handle selection result"
                    eieu r1 = defpackage.eiiy.k(r0)
                    egaa r0 = r8.a
                    efxb r7 = r2
                    if (r9 == 0) goto L5a
                    java.lang.Object r2 = r9.first     // Catch: java.lang.Throwable -> L6f
                    boolean r2 = r2 instanceof defpackage.efzg     // Catch: java.lang.Throwable -> L6f
                    if (r2 == 0) goto L33
                    java.lang.Object r0 = r9.second     // Catch: java.lang.Throwable -> L6f
                    android.content.Intent r0 = (android.content.Intent) r0     // Catch: java.lang.Throwable -> L6f
                    java.lang.Object r9 = r9.first     // Catch: java.lang.Throwable -> L6f
                    efzg r9 = (defpackage.efzg) r9     // Catch: java.lang.Throwable -> L6f
                    com.google.common.util.concurrent.ListenableFuture r9 = r9.b(r0)     // Catch: java.lang.Throwable -> L6f
                    efzw r0 = new efzw     // Catch: java.lang.Throwable -> L6f
                    r0.<init>()     // Catch: java.lang.Throwable -> L6f
                    ejvr r0 = defpackage.eiid.a(r0)     // Catch: java.lang.Throwable -> L6f
                    eoqg r2 = defpackage.eoqg.a     // Catch: java.lang.Throwable -> L6f
                    com.google.common.util.concurrent.ListenableFuture r9 = defpackage.eooq.f(r9, r0, r2)     // Catch: java.lang.Throwable -> L6f
                    r1.b(r9)     // Catch: java.lang.Throwable -> L6f
                    goto L6b
                L33:
                    java.lang.Object r2 = r9.first     // Catch: java.lang.Throwable -> L6f
                    boolean r2 = r2 instanceof defpackage.efze     // Catch: java.lang.Throwable -> L6f
                    if (r2 == 0) goto L5a
                    java.lang.Object r2 = r9.second     // Catch: java.lang.Throwable -> L6f
                    efwo r2 = (defpackage.efwo) r2     // Catch: java.lang.Throwable -> L6f
                    java.lang.Object r9 = r9.first     // Catch: java.lang.Throwable -> L6f
                    efze r9 = (defpackage.efze) r9     // Catch: java.lang.Throwable -> L6f
                    egcd r3 = r0.a     // Catch: java.lang.Throwable -> L6f
                    com.google.common.util.concurrent.ListenableFuture r3 = r3.c(r2)     // Catch: java.lang.Throwable -> L6f
                    efzp r4 = new efzp     // Catch: java.lang.Throwable -> L6f
                    r4.<init>()     // Catch: java.lang.Throwable -> L6f
                    eooz r9 = defpackage.eiid.d(r4)     // Catch: java.lang.Throwable -> L6f
                    eoqg r0 = defpackage.eoqg.a     // Catch: java.lang.Throwable -> L6f
                    com.google.common.util.concurrent.ListenableFuture r9 = defpackage.eooq.g(r3, r9, r0)     // Catch: java.lang.Throwable -> L6f
                    r1.b(r9)     // Catch: java.lang.Throwable -> L6f
                    goto L6b
                L5a:
                    efxe r2 = new efxe     // Catch: java.lang.Throwable -> L6f
                    egbs r4 = defpackage.egbs.a     // Catch: java.lang.Throwable -> L6f
                    r5 = 0
                    r6 = 0
                    r3 = 0
                    r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L6f
                    com.google.common.util.concurrent.ListenableFuture r9 = defpackage.eork.i(r2)     // Catch: java.lang.Throwable -> L6f
                    r1.b(r9)     // Catch: java.lang.Throwable -> L6f
                L6b:
                    r1.close()
                    return r9
                L6f:
                    r0 = move-exception
                    r9 = r0
                    r1.close()     // Catch: java.lang.Throwable -> L75
                    goto L79
                L75:
                    r0 = move-exception
                    r9.addSuppressed(r0)
                L79:
                    throw r9
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.efzv.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
            }
        }), eoqgVar);
    }

    final ListenableFuture e(final efwo efwoVar, List list, Intent intent, final efxb efxbVar) {
        return eooq.g(this.f.g(efwoVar, a(list), intent), eiid.d(new eooz() { // from class: efzx
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final egbd egbdVar = (egbd) obj;
                boolean zC = egbdVar.c();
                efwo efwoVar2 = efwoVar;
                final efxb efxbVar2 = efxbVar;
                if (zC) {
                    return eooq.f(this.a.a.c(efwoVar2), eiid.a(new ejvr() { // from class: efzy
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            egbe egbeVar = (egbe) obj2;
                            efwo efwoVarA = egbeVar.a();
                            egbs egbsVarB = egbeVar.b();
                            egbd egbdVar2 = egbdVar;
                            ejwl.m(egbdVar2.c(), "Trying to propagate AccountInfo for invalid account.");
                            return new efxe(efwoVarA, egbsVarB, egbdVar2, null, efxbVar2);
                        }
                    }), eoqg.a);
                }
                ejwl.l(!egbdVar.c());
                return eork.i(new efxe(efwoVar2, egbs.a, egbdVar, null, efxbVar2));
            }
        }), eoqg.a);
    }
}
