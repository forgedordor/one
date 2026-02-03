package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaqm implements aaqa {
    private static final eksp a = eksp.c("LoggingReporter");

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.aapx
    public final void b(aapw aapwVar) {
        eksl ekslVar = (eksl) ((eksl) a.j()).h("com/google/android/apps/messaging/custodian/reporter/sinks/logger/LoggingReporter", "reportError", 17, "LoggingReporter.java");
        aapt aaptVar = (aapt) aapwVar;
        emvl emvlVar = aaptVar.a;
        switch (emvlVar.ordinal()) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                StringBuilder sb = new StringBuilder();
                sb.append(emvlVar.name());
                sb.append(": occurred in conversation with id=");
                sb.append(aaptVar.b);
                Optional optional = aaptVar.d;
                if (optional.isPresent()) {
                    sb.append(" in message id=");
                    sb.append((String) optional.get());
                }
                Optional optional2 = aaptVar.e;
                if (optional2.isPresent()) {
                    sb.append(" with forked conversation join states(");
                    sb.append((String) Collection.EL.stream(optional2.get()).map(new Function() { // from class: aapu
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return bvdh.a(((Integer) obj).intValue());
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.joining(", ")));
                    sb.append(")");
                }
                Optional optional3 = aaptVar.f;
                if (optional3.isPresent()) {
                    sb.append(" with forked conversation different names local count= ");
                    sb.append(optional3.get());
                }
                ekslVar.t("%s", sb.toString());
                return;
            default:
                throw new IllegalStateException("No error message implemented for error: ".concat(String.valueOf(emvlVar.name())));
        }
    }
}
