package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agpy implements agpj {
    public static final cczi a = cdag.i(cdag.b, "p13n_decay_factor", 0.5f);
    public static final cczi b = cdag.j(cdag.b, "top_n_tokens", 2000);
    public final eosc c;
    public final dqsn d;
    public final crid e;

    public agpy(eosc eoscVar, crid cridVar, dqsn dqsnVar) {
        this.c = eoscVar;
        this.e = cridVar;
        this.d = dqsnVar;
    }

    public static ekgp a(ekgp ekgpVar, Function function) {
        return (ekgp) Collection.EL.stream(ekgpVar.entrySet()).collect(ekcv.a(new Function() { // from class: agpt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Map.Entry) obj).getKey();
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }, function));
    }
}
