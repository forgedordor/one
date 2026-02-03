package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjou implements cjok {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/rcs/performance/ChannelBasedAwakeSender");
    public final eosc b;
    public final fcsu c;
    public final aoer d;
    private final fcsu e;

    public cjou(fcsu fcsuVar, eosc eoscVar, fcsu fcsuVar2, aoer aoerVar) {
        this.e = fcsuVar;
        this.d = aoerVar;
        this.c = fcsuVar2;
        this.b = eoscVar;
    }

    public static int c(int i) {
        return i + (-1) != 1 ? 1 : 2;
    }

    @Override // defpackage.cjok
    public final void a(String str, final int i) {
        eieu eieuVarK = eiiy.k("ChannelBasedAwakeSender::prewarm");
        try {
            ((ekrd) ((ekrd) a.h()).h("com/google/android/apps/messaging/shared/rcs/performance/ChannelBasedAwakeSender", "prewarm", 71, "ChannelBasedAwakeSender.java")).t("Attempting to send prewarm by %s", this.d);
            ezok ezokVar = (ezok) ezol.a.createBuilder();
            felm felmVar = felm.PHONE_NUMBER;
            ezokVar.copyOnWrite();
            ((ezol) ezokVar.instance).b = felmVar.a();
            ezokVar.copyOnWrite();
            ((ezol) ezokVar.instance).d = "RCS";
            ezokVar.copyOnWrite();
            ((ezol) ezokVar.instance).c = str;
            final ezol ezolVar = (ezol) ezokVar.build();
            eiju eijuVarE = eijx.h(new eooy() { // from class: cjor
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    return this.a.b().a(ezolVar, cjou.c(i));
                }
            }, this.b).e(Throwable.class, new ejvr() { // from class: cjos
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    ((ekrd) ((ekrd) ((ekrd) cjou.a.j()).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/rcs/performance/ChannelBasedAwakeSender", "prewarm", '[', "ChannelBasedAwakeSender.java")).q("Failed to prewarm remote client");
                    return null;
                }
            }, eoqg.a);
            eieuVarK.b(eijuVarE);
            auvh.h(eijuVarE);
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

    public final cnlm b() {
        Optional optionalFlatMap = this.d.o().flatMap(new Function() { // from class: cjoo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((alqm) obj).e();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final cnlh cnlhVar = (cnlh) this.e.b();
        cnlhVar.getClass();
        return (cnlm) optionalFlatMap.map(new Function() { // from class: cjop
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return cnlhVar.a((aubq) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElseThrow(new Supplier() { // from class: cjoq
            @Override // java.util.function.Supplier
            public final Object get() {
                return new cjot();
            }
        });
    }
}
