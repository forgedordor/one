package defpackage;

import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import j$.util.DesugarArrays;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bypi extends fcyz implements fdat {
    int a;
    final /* synthetic */ bypl b;
    final /* synthetic */ String c;
    final /* synthetic */ bmsp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bypi(bypl byplVar, String str, bmsp bmspVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = byplVar;
        this.c = str;
        this.d = bmspVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bypi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final bypl byplVar = this.b;
            String str = this.c;
            bmsp bmspVar = this.d;
            this.a = 1;
            bypl.a.p(a.m(bmspVar, str, "Inserting deleted message entry with message ID ", " and deletion reason "));
            long epochMilli = byplVar.b.f().toEpochMilli();
            if (((appx) byplVar.e.b()).a()) {
                epochMilli = Instant.ofEpochMilli(epochMilli).truncatedTo(ChronoUnit.DAYS).toEpochMilli();
            }
            String[] strArr = bmso.a;
            final bmrj bmrjVar = new bmrj();
            bmrjVar.d(Long.parseLong(str));
            bmrjVar.b(epochMilli);
            bmrjVar.c(bmspVar);
            eiju eijuVarB = byplVar.j.b("CmsDeletedMessagesBufferPersister#insertDeletedMessageEntry", new Runnable() { // from class: bypc
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    String[] strArr2 = bmso.a;
                    String[] strArr3 = bmso.a;
                    bmsl bmslVar = new bmsl(strArr3);
                    bmslVar.A("CmsDeletedMessagesBufferPersister#insertDeletedMessageEntry");
                    if (bmslVar.b().h() == byplVar.h) {
                        bmsl bmslVar2 = new bmsl(strArr3);
                        bmslVar2.A("CmsDeletedMessagesBufferPersister#evictOldestMessageDeletedEntry#getEntry");
                        bmrv bmrvVar = bmso.b.a;
                        bmslVar2.D((String) DesugarArrays.stream(new bmsi[]{new bmsi(bmrvVar)}).map(new Function() { // from class: bmsk
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                return ((bmsi) obj3).a();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(Collectors.joining(", ")));
                        bmslVar2.y(1);
                        bmslVar2.s();
                        bmrw bmrwVar = (bmrw) bmslVar2.b().q(bmrvVar);
                        try {
                            ekgb ekgbVarC = bmrwVar.c();
                            bmrwVar.close();
                            final Long l = (Long) ekgbVarC.get(0);
                            bmse bmseVar = new bmse();
                            bmseVar.f("CmsDeletedMessagesBufferPersister#evictOldestMessageDeletedEntry#deleteEntry");
                            bmseVar.a(new Function() { // from class: bypd
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    bmsn bmsnVar = (bmsn) obj3;
                                    Long l2 = l;
                                    l2.longValue();
                                    bmsnVar.ap(new dqty("cms_deleted_messages_buffer._id", 1, l2));
                                    return bmsnVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            bmseVar.d();
                        } catch (Throwable th) {
                            try {
                                bmrwVar.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    final bmre bmreVarA = bmrjVar.a(new Supplier() { // from class: bmrg
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return new bmrf();
                        }
                    });
                    final dqsy dqsyVarA = bmso.a();
                    dqru.b(bmso.a(), "cms_deleted_messages_buffer", bmreVarA, new Function() { // from class: bmrd
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj3) {
                            return Long.valueOf(dqsyVarA.P("cms_deleted_messages_buffer", (dqst) obj3));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Consumer() { // from class: bmrc
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj3) {
                            Long l2 = (Long) obj3;
                            if (l2.longValue() >= 0) {
                                bmre bmreVar = bmreVarA;
                                bmreVar.a = l2.longValue();
                                bmreVar.fN(0);
                            }
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
            });
            eijuVarB.getClass();
            Object objC = fdxs.c(eijuVarB, this);
            if (objC != obj2) {
                objC = fctx.a;
            }
            if (objC == obj2) {
                return obj2;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bypi(this.b, this.c, this.d, fcxyVar);
    }
}
