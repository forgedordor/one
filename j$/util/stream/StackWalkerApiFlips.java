package j$.util.stream;

import java.util.function.Function;

/* loaded from: classes9.dex */
public class StackWalkerApiFlips {
    public static Function<?, ?> flipFunctionStream(Function<?, ?> function) {
        C0095j c0095j = new C0095j(3);
        c0095j.b = function;
        return c0095j;
    }
}
