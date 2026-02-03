package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awgl implements awgf {
    public static final /* synthetic */ int a = 0;
    private static final cczi b = cdag.j(cdag.b, "phone_number_min_match_guesser_max_length", 15);
    private final eosc c;
    private final dqsn d;

    public awgl(eosc eoscVar, dqsn dqsnVar) {
        this.c = eoscVar;
        this.d = dqsnVar;
    }

    @Override // defpackage.awgf
    public final eiju a() {
        return eijx.g(new Callable() { // from class: awgk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.b();
            }
        }, this.c);
    }

    @Override // defpackage.awgf
    public final Optional b() {
        final int iIntValue = ((Integer) b.e()).intValue();
        return (Optional) this.d.c("guessPhoneNumber", new ejxr() { // from class: awgj
            @Override // defpackage.ejxr
            public final Object get() {
                int i = awgl.a;
                String[] strArr = bsnw.a;
                bsno bsnoVar = new bsno();
                bsnoVar.f("guessPhoneNumberCompareMinMatchValueSync");
                bsnoVar.e();
                bsnoVar.d();
                int i2 = iIntValue;
                StringBuilder sb = new StringBuilder(i2);
                sb.append('4');
                for (int i3 = 1; i3 < i2; i3++) {
                    String string = sb.toString();
                    bsnc bsncVar = new bsnc();
                    bsncVar.b(string);
                    final bsmz bsmzVarA = bsncVar.a();
                    final dqsy dqsyVarA = bsnw.a();
                    dqru.b(bsnw.a(), "phone_number_min_match_guesser", bsmzVarA, new Function() { // from class: bsmy
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return Long.valueOf(dqsyVarA.P("phone_number_min_match_guesser", (dqst) obj));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Consumer() { // from class: bsmx
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            Long l = (Long) obj;
                            if (l.longValue() >= 0) {
                                bsmz bsmzVar = bsmzVarA;
                                bsmzVar.a = l.longValue();
                                bsmzVar.fN(0);
                            }
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    sb.append('4');
                    String string2 = sb.toString();
                    bsnv bsnvVar = new bsnv();
                    bsnvVar.ar(new dqxl("PHONE_NUMBERS_EQUAL($V, $V, $V)", new Object[]{bsnw.b.b, string2, 0}));
                    bsnu bsnuVar = new bsnu(bsnvVar);
                    bsnt bsntVar = new bsnt(bsnw.a);
                    bsntVar.A("guessPhoneNumberCompareMinMatchValueSync");
                    bsntVar.k(bsnuVar);
                    if (bsntVar.b().h() > 0) {
                        return Optional.of(Integer.valueOf(i3));
                    }
                }
                return Optional.empty();
            }
        });
    }
}
