package defpackage;

import j$.time.DayOfWeek;
import j$.time.Period;
import j$.time.ZoneId;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eitg {
    public static final eith a;
    public static final eith b;
    public static final eith c;
    public static final eith d;
    public static final eith e;

    static {
        eith eithVarA = eiux.b("ListItem", new Supplier() { // from class: eitd
            @Override // java.util.function.Supplier
            public final Object get() {
                return new eiwp();
            }
        }).a();
        a = eithVarA;
        eiux eiuxVarB = eiux.b("ItemList", new Supplier() { // from class: eirt
            @Override // java.util.function.Supplier
            public final Object get() {
                return new eiwn();
            }
        });
        eiuxVarB.n("itemListElement", new Function() { // from class: eirz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eixi) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, eithVarA);
        eiuxVarB.a();
        eith eithVarA2 = eiux.b("OrderItem", new Supplier() { // from class: eism
            @Override // java.util.function.Supplier
            public final Object get() {
                return new eiwt();
            }
        }).a();
        b = eithVarA2;
        eith eithVarA3 = eiux.b("Organization", new Supplier() { // from class: eist
            @Override // java.util.function.Supplier
            public final Object get() {
                return new eiwv();
            }
        }).a();
        c = eithVarA3;
        eiux eiuxVarO = eiux.o("ParcelDelivery");
        eiuxVarO.l("deliveryAddress", new Function() { // from class: eitb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eixr) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        eiuxVarO.m("expectedArrivalFrom", new Function() { // from class: eitc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eixr) obj).e();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        eiuxVarO.m("expectedArrivalUntil", new Function() { // from class: eiro
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eixr) obj).f();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        eiuxVarO.l("hasDeliveryMethod", new Function() { // from class: eirp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eixr) obj).d();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        eiuxVarO.l("trackingNumber", new Function() { // from class: eirq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eixr) obj).g();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        eiuxVarO.l("trackingUrl", new Function() { // from class: eirr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eixr) obj).h();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        eith eithVarA4 = eiuxVarO.a();
        d = eithVarA4;
        eiux eiuxVarB2 = eiux.b("Order", new Supplier() { // from class: eirs
            @Override // java.util.function.Supplier
            public final Object get() {
                return new eiwr();
            }
        });
        eiuxVarB2.m("orderDate", new Function() { // from class: eiru
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eixm) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        eiuxVarB2.k("orderDelivery", new Function() { // from class: eirv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eixm) obj).d();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, eithVarA4);
        eiuxVarB2.n("orderedItem", new Function() { // from class: eirw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eixm) obj).g();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, eithVarA2);
        eiuxVarB2.g("orderStatus", new Function() { // from class: eirx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eixm) obj).e();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        eiuxVarB2.k("seller", new Function() { // from class: eiry
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eixm) obj).f();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, eithVarA3);
        eiuxVarB2.a();
        eiux eiuxVarB3 = eiux.b("Person", new Supplier() { // from class: eisa
            @Override // java.util.function.Supplier
            public final Object get() {
                return new eiwx();
            }
        });
        eiuxVarB3.l("email", new Function() { // from class: eisb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eixt) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        eiuxVarB3.l("telephone", new Function() { // from class: eisc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eixt) obj).d();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        eiuxVarB3.l("name", new Function() { // from class: eisd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eixt) obj).c();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        eiuxVarB3.a();
        eiux eiuxVarB4 = eiux.b("Timer", new Supplier() { // from class: eise
            @Override // java.util.function.Supplier
            public final Object get() {
                return new eixd();
            }
        });
        eiuxVarB4.g("timerStatus", new Function() { // from class: eisf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eiyd) obj).d();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        eiuxVarB4.f(new Function() { // from class: eisg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eiyd) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        eiuxVarB4.a();
        eiux eiuxVarB5 = eiux.b("CalendarEvent", new Supplier() { // from class: eish
            @Override // java.util.function.Supplier
            public final Object get() {
                return new eiwl();
            }
        });
        eiuxVarB5.m("startDate", new Function() { // from class: eisi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eixg) obj).d();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        eiuxVarB5.m("endDate", new Function() { // from class: eisj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eixg) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        eiuxVarB5.n("attendee", new Function() { // from class: eisk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eixg) obj).e();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new eitf());
        eiuxVarB5.a();
        eiux eiuxVarB6 = eiux.b("SafetyCheck", new Supplier() { // from class: eisl
            @Override // java.util.function.Supplier
            public final Object get() {
                return new eiwz();
            }
        });
        eiuxVarB6.f(new Function() { // from class: eisn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eixv) obj).d();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        eiuxVarB6.m("checkinTime", new Function() { // from class: eiso
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eixv) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        eiuxVarB6.a();
        eiux eiuxVarB7 = eiux.b("Schedule", new Supplier() { // from class: eisp
            @Override // java.util.function.Supplier
            public final Object get() {
                return new eixb();
            }
        });
        eiuxVarB7.h("startDate", new Function() { // from class: eisq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eixx) obj).g();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        eiuxVarB7.i("startTime", new Function() { // from class: eisr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eixx) obj).h();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        eiuxVarB7.h("endDate", new Function() { // from class: eiss
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eixx) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        eiuxVarB7.i("endTime", new Function() { // from class: eisu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eixx) obj).d();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final Function function = new Function() { // from class: eisv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eixx) obj).f();
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        eiuxVarB7.e("scheduleTimezone", new Function() { // from class: eiti
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Optional) function.apply(obj)).map(new Function() { // from class: eiuf
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((ZoneId) obj2).toString();
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }).map(new eitp());
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }, new eirk() { // from class: eits
        });
        final Function function2 = new Function() { // from class: eisw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eixx) obj).e();
            }

            public final /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        };
        eiuxVarB7.e("repeatFrequency", new Function() { // from class: eiui
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Optional) function2.apply(obj)).map(new Function() { // from class: eiur
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function3) {
                        return Function$CC.$default$andThen(this, function3);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((Period) obj2).toString();
                    }

                    public final /* synthetic */ Function compose(Function function3) {
                        return Function$CC.$default$compose(this, function3);
                    }
                }).map(new eitp());
            }

            public final /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        }, new eirk() { // from class: eiuj
        });
        Function function3 = new Function() { // from class: eisx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function4) {
                return Function$CC.$default$andThen(this, function4);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eixx) obj).i();
            }

            public final /* synthetic */ Function compose(Function function4) {
                return Function$CC.$default$compose(this, function4);
            }
        };
        final Function function4 = new Function() { // from class: eisy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function5) {
                return Function$CC.$default$andThen(this, function5);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eith eithVar = eitg.a;
                switch (eite.a[((DayOfWeek) obj).ordinal()]) {
                    case 1:
                        return "http://schema.org/Monday";
                    case 2:
                        return "http://schema.org/Tuesday";
                    case 3:
                        return "http://schema.org/Wednesday";
                    case 4:
                        return "http://schema.org/Thursday";
                    case 5:
                        return "http://schema.org/Friday";
                    case 6:
                        return "http://schema.org/Saturday";
                    case 7:
                        return "http://schema.org/Sunday";
                    default:
                        return "";
                }
            }

            public final /* synthetic */ Function compose(Function function5) {
                return Function$CC.$default$compose(this, function5);
            }
        };
        eiuxVarB7.j("byDay", function3, new Function() { // from class: eiuq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function5) {
                return Function$CC.$default$andThen(this, function5);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Optional optionalOfNullable = Optional.ofNullable(obj);
                final Function function5 = function4;
                return optionalOfNullable.map(new Function() { // from class: eity
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function6) {
                        return Function$CC.$default$andThen(this, function6);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return eiux.c((String) function5.apply(obj2));
                    }

                    public final /* synthetic */ Function compose(Function function6) {
                        return Function$CC.$default$compose(this, function6);
                    }
                });
            }

            public final /* synthetic */ Function compose(Function function5) {
                return Function$CC.$default$compose(this, function5);
            }
        });
        eith eithVarA5 = eiuxVarB7.a();
        e = eithVarA5;
        eiux eiuxVarB8 = eiux.b("Alarm", new Supplier() { // from class: eisz
            @Override // java.util.function.Supplier
            public final Object get() {
                return new eiwj();
            }
        });
        eiuxVarB8.k("alarmSchedule", new Function() { // from class: eita
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function5) {
                return Function$CC.$default$andThen(this, function5);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eiwf) obj).a();
            }

            public final /* synthetic */ Function compose(Function function5) {
                return Function$CC.$default$compose(this, function5);
            }
        }, eithVarA5);
        eiuxVarB8.a();
    }
}
