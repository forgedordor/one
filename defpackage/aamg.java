package defpackage;

import android.text.TextUtils;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aamg {
    private final fcsu d;
    private static final eksp c = eksp.c("ConvMatchingAlgoUtils");
    public static final Pattern a = Pattern.compile("\\D");
    public static final int b = awcn.a();

    public aamg(fcsu fcsuVar) {
        this.d = fcsuVar;
    }

    public static boolean d(char c2) {
        return (c2 >= '0' && c2 <= '9') || c2 == '*' || c2 == '#' || c2 == '+';
    }

    public final String a(String str, awch awchVar) {
        try {
            str = String.valueOf(((ephj) this.d.b()).n(str, "").b());
        } catch (ephe unused) {
            ekrw ekrwVarN = c.n();
            ekrwVarN.V(1, TimeUnit.MINUTES);
            ((eksl) ekrwVarN.h("com/google/android/apps/messaging/custodian/inspectors/forking/conversationstable/ConversationMatchingAlgorithmsUtils", "getPossibleShortCode", 124, "ConversationMatchingAlgorithmsUtils.java")).t("The given destination to determine if shortcode %s cant be parsed", new awcc(awchVar, str));
        }
        if (alwh.k(str)) {
            return str;
        }
        return null;
    }

    public final HashMap b(final bojh bojhVar, List list, final awch awchVar) {
        return (HashMap) Collection.EL.stream(list).map(new Function() { // from class: aamc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                aamg aamgVar = this.a;
                String str = (String) obj;
                if (aamgVar.c(str, bojhVar)) {
                    return "";
                }
                String strA = aamgVar.a(str, awchVar);
                if (strA != null) {
                    return strA;
                }
                String strTrim = aamg.a.matcher(str).replaceAll("").trim();
                int length = strTrim.length();
                int i = aamg.b;
                return strTrim.length() >= i ? strTrim.substring(Math.max(0, length - i)) : strTrim;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: aamd
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                Pattern pattern = aamg.a;
                return !TextUtils.isEmpty((String) obj);
            }
        }).collect(Collectors.groupingBy(Function$CC.identity(), new Supplier() { // from class: aame
            @Override // java.util.function.Supplier
            public final Object get() {
                return new HashMap();
            }
        }, Collectors.summingInt(new ToIntFunction() { // from class: aamf
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                Pattern pattern = aamg.a;
                return 1;
            }
        })));
    }

    public final boolean c(String str, bojh bojhVar) {
        return TextUtils.equals(str, "ʼUNKNOWN_SENDER!ʼ") || TextUtils.equals(str, "ʼWAP_PUSH_SI!ʼ") || alwh.i(str) || bojhVar.an() || alpd.a(str) || alpd.b(str);
    }
}
