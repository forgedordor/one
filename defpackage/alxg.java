package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alxg implements amet, cmqg, axjy {
    public static final /* synthetic */ int f = 0;
    private static final ekgb g;
    public final amfa a;
    public final eosc b;
    public final brdp c;
    public final List d;
    public final Object e = new Object();

    static {
        int i = ekgb.d;
        g = ekoe.a;
    }

    public alxg(dqsn dqsnVar, eosc eoscVar) {
        this.b = eoscVar;
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("MessageChangeObserver");
        brdrVarD.e(new Function() { // from class: alwz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bran branVar = (bran) obj;
                int i = alxg.f;
                return new brao[]{branVar.a, branVar.n, branVar.k, branVar.G, branVar.b};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.h(new Function() { // from class: alxa
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                int i = alxg.f;
                brecVar.A(false);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        this.c = brdrVarD.b();
        this.d = new ArrayList();
        this.a = new amfa(dqsnVar, new Consumer() { // from class: alxb
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ekgb ekgbVarN;
                ekgb ekgbVar = (ekgb) obj;
                alxg alxgVar = this.a;
                synchronized (alxgVar.e) {
                    ekgbVarN = ekgb.n(alxgVar.d);
                }
                int size = ekgbVar.size();
                for (int i = 0; i < size; i++) {
                    final ajmf ajmfVar = (ajmf) ekgbVar.get(i);
                    final ekgb ekgbVar2 = (ekgb) Collection.EL.stream(ekgbVarN).map(new Function() { // from class: alww
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            int i2 = alxg.f;
                            return ((ajmg) obj2).a(ajmfVar);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(ekcv.a);
                    if (!ekgbVar2.isEmpty()) {
                        auvh.h(eijx.h(new eooy() { // from class: alwx
                            @Override // defpackage.eooy
                            public final ListenableFuture a() {
                                int i2 = alxg.f;
                                return eijx.a(ekgbVar2);
                            }
                        }, alxgVar.b));
                    }
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.cmqg
    public final void a(boolean z) {
        ekgb ekgbVarN;
        synchronized (this.e) {
            List list = this.d;
            if (list.isEmpty()) {
                ekgbVarN = g;
            } else {
                this.c.M(this.a);
                ekgbVarN = ekgb.n(list);
            }
        }
        Stream map = Collection.EL.stream(ekgbVarN).map(new Function() { // from class: alxe
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ajmg) obj).b();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        final ekgb ekgbVar = (ekgb) map.collect(ekcv.a);
        if (ekgbVar.isEmpty()) {
            return;
        }
        auvh.h(eijx.h(new eooy() { // from class: alxf
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                int i2 = alxg.f;
                return eijx.a(ekgbVar);
            }
        }, this.b));
    }

    @Override // defpackage.cmqg
    public final void b(boolean z) {
        e();
    }

    @Override // defpackage.amet
    public final cquc c(final ajmg ajmgVar) {
        synchronized (this.e) {
            List list = this.d;
            list.add(ajmgVar);
            if (list.size() == 1) {
                this.c.M(this.a);
            }
        }
        return new cquc() { // from class: alwy
            @Override // defpackage.cquc
            public final void a() {
                ajmg ajmgVar2 = ajmgVar;
                alxg alxgVar = this.a;
                synchronized (alxgVar.e) {
                    List list2 = alxgVar.d;
                    list2.remove(ajmgVar2);
                    if (list2.isEmpty()) {
                        alxgVar.c.Q(alxgVar.a);
                    }
                }
            }

            @Override // defpackage.cquc, java.io.Closeable, java.lang.AutoCloseable
            public final /* synthetic */ void close() {
                cqub.a(this);
            }
        };
    }

    @Override // defpackage.axjy
    public final void d(String str, String str2, long j) {
        ekgb ekgbVarN;
        synchronized (this.e) {
            ekgbVarN = ekgb.n(this.d);
        }
        final anap anapVar = new anap(ajle.INSERT, new CoreBugleMessageId(bary.b(str), -1L), new BugleConversationId(str2), Instant.ofEpochMilli(j), 0);
        final ekgb ekgbVar = (ekgb) Collection.EL.stream(ekgbVarN).map(new Function() { // from class: alxc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = alxg.f;
                return ((ajmg) obj).a(anapVar);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(ekcv.a);
        if (ekgbVar.isEmpty()) {
            return;
        }
        auvh.h(eijx.h(new eooy() { // from class: alxd
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                int i = alxg.f;
                return eijx.a(ekgbVar);
            }
        }, this.b));
    }

    public final void e() {
        synchronized (this.e) {
            if (this.d.isEmpty()) {
                return;
            }
            this.c.Q(this.a);
        }
    }
}
