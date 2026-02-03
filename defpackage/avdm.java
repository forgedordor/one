package defpackage;

import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avdm {
    private final fcyh a;
    private final dqsn b;
    private final alrj c;

    public avdm(fcyh fcyhVar, dqsn dqsnVar, alrj alrjVar) {
        fcyhVar.getClass();
        dqsnVar.getClass();
        alrjVar.getClass();
        this.a = fcyhVar;
        this.b = dqsnVar;
        this.c = alrjVar;
    }

    @fcsv
    public static final void d(final List list) throws IOException {
        list.getClass();
        eieu eieuVarH = eiiy.h("ContactsSyncDataService#deleteContacts");
        try {
            if (((Boolean) avbs.k.e()).booleanValue()) {
                Object objE = avbs.l.e();
                objE.getClass();
                List<List> listAa = fcva.aa(list, ((Number) objE).intValue());
                ArrayList arrayList = new ArrayList(fcva.p(listAa, 10));
                for (final List list2 : listAa) {
                    String[] strArr = bnfe.a;
                    bnet bnetVar = new bnet();
                    bnetVar.f("deleteContactsBlockingDeprecated");
                    bnetVar.a(new Function() { // from class: avdh
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bnfd bnfdVar = (bnfd) obj;
                            bnfdVar.b(list2);
                            return bnfdVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    arrayList.add(Integer.valueOf(bnetVar.d()));
                }
            } else {
                String[] strArr2 = bnfe.a;
                bnet bnetVar2 = new bnet();
                bnetVar2.f("deleteContactsBlockingDeprecated");
                bnetVar2.a(new Function() { // from class: avdi
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bnfd bnfdVar = (bnfd) obj;
                        bnfdVar.b(list);
                        return bnfdVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bnetVar2.d();
            }
            fczl.a(eieuVarH, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fczl.a(eieuVarH, th);
                throw th2;
            }
        }
    }

    public final Object a(fcxy fcxyVar) {
        Object objA = fdin.a(eicg.a(this.a), new avdl(null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    public final List b(List list) {
        list.getClass();
        ArrayList<avdp> arrayList = new ArrayList();
        for (Object obj : list) {
            avdp avdpVar = (avdp) obj;
            if (avdq.c(avdpVar)) {
                String str = avdpVar.k;
                if (str == null) {
                    str = avdpVar.j;
                }
                if (!bbcf.c(str)) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(fcva.p(arrayList, 10));
        for (avdp avdpVar2 : arrayList) {
            alrj alrjVar = this.c;
            String str2 = avdpVar2.k;
            if (str2 == null) {
                str2 = avdpVar2.j;
                str2.getClass();
            }
            alqm alqmVarN = alrjVar.n(str2);
            String string = alqmVarN.F().toString();
            String strL = alqmVarN.l();
            String[] strArr = bnfe.a;
            bnci bnciVar = new bnci();
            bnciVar.g(avdpVar2.a);
            bnciVar.e(avdpVar2.b);
            bnciVar.h(string);
            bnciVar.n(strL);
            bnciVar.m(avdpVar2.c);
            bnciVar.i(avdpVar2.d);
            bnciVar.k(avdpVar2.h);
            bnciVar.j(avdpVar2.i);
            bnciVar.q(avdpVar2.o);
            bnciVar.s(avdpVar2.p);
            bnciVar.c(avdpVar2.r);
            bnciVar.b(avdpVar2.s);
            bnciVar.l(avdpVar2.t);
            bnciVar.r(avdpVar2.e);
            bnciVar.p(avdpVar2.f);
            bnciVar.o(avdpVar2.g);
            bnciVar.f(avdpVar2.m);
            bnciVar.t(avdpVar2.n);
            arrayList2.add(bnciVar.a());
        }
        return arrayList2;
    }

    public final void c(final List list) {
        eieu eieuVarH = eiiy.h("ContactsSyncDataService#upsertContactsBlocking");
        try {
            this.b.d("ContactsSyncDataService#upsertContactsBlocking", new Runnable() { // from class: avdg
                @Override // java.lang.Runnable
                public final void run() {
                    for (bncf bncfVar : list) {
                        final dqsy dqsyVarB = bnfe.b();
                        dqru.b(bnfe.b(), "contacts", bncfVar, new Function() { // from class: bncd
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return Long.valueOf(dqsyVarB.Q("contacts", (dqst) obj, 5));
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Consumer() { // from class: bnce
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj) {
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                    }
                }
            });
            fczl.a(eieuVarH, null);
        } finally {
        }
    }
}
