package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.stream.Stream;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaoi implements aalu {
    private static final eksp a = eksp.c("Misthreading");
    private final aalw b;
    private final aaoh c;
    private final aaob d;

    public aaoi(aalw aalwVar, aaoh aaohVar, aaob aaobVar) {
        this.b = aalwVar;
        this.c = aaohVar;
        this.d = aaobVar;
    }

    @Override // defpackage.aalu
    public final synchronized void a() {
        aalw aalwVar = this.b;
        if (aalwVar.b()) {
            aalwVar.a();
            ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/custodian/inspectors/misthreading/Misthreading", "startAnalysis", 35, "Misthreading.java")).q("Starting analysis.");
            final aaoh aaohVar = this.c;
            cczi ccziVar = aaoh.a;
            final Runnable runnable = new Runnable() { // from class: aaoe
                @Override // java.lang.Runnable
                public final void run() {
                    aaoh aaohVar2 = aaohVar;
                    aaohVar2.d.M(aaohVar2);
                }
            };
            auvh.h(ccziVar.b().h(new ejvr() { // from class: aalt
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    if (!((Boolean) obj).booleanValue()) {
                        return null;
                    }
                    runnable.run();
                    return null;
                }
            }, aaohVar.b));
            final aaob aaobVar = this.d;
            auvh.h(aaobVar.d.a(eiid.c(new eooy() { // from class: aanv
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    cczi ccziVar2 = aaob.a;
                    final aaob aaobVar2 = aaobVar;
                    final Supplier supplier = new Supplier() { // from class: aany
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            final aaob aaobVar3 = aaobVar2;
                            final aaoq aaoqVar = aaobVar3.b;
                            return eiju.g(new egpe(new eooy() { // from class: aaoj
                                @Override // defpackage.eooy
                                public final ListenableFuture a() {
                                    final aaoq aaoqVar2 = aaoqVar;
                                    return eijx.f(new Runnable() { // from class: aaok
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            ((eksl) aaoq.a.n().h("com/google/android/apps/messaging/custodian/inspectors/misthreading/RcsGroupIdUpdateChecker", "cacheExtantRcsGroupIds", 75, "RcsGroupIdUpdateChecker.java")).q("Caching existing RCS Group Ids.");
                                            Stream stream = Collection.EL.stream(aaoq.a().entrySet());
                                            final aaoq aaoqVar3 = aaoqVar2;
                                            stream.forEach(new Consumer() { // from class: aaop
                                                @Override // java.util.function.Consumer
                                                /* renamed from: accept */
                                                public final void z(Object obj) {
                                                    Map.Entry entry = (Map.Entry) obj;
                                                    aaoqVar3.e.a.putIfAbsent((ConversationIdType) entry.getKey(), (String) entry.getValue());
                                                }

                                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                    return Consumer$CC.$default$andThen(this, consumer);
                                                }
                                            });
                                        }
                                    }, aaoqVar2.b);
                                }
                            }, aaoqVar.c).c()).h(new ejvr() { // from class: aanw
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj) {
                                    aaob aaobVar4 = aaobVar3;
                                    aaobVar4.e.M(aaobVar4);
                                    return null;
                                }
                            }, aaobVar3.c);
                        }
                    };
                    return ccziVar2.b().i(new eooz() { // from class: aals
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            return ((Boolean) obj).booleanValue() ? (ListenableFuture) supplier.get() : eijx.e(null);
                        }
                    }, aaobVar2.c);
                }
            }), aaobVar.c));
        }
    }
}
