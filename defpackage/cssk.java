package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class cssk implements Function {
    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        cssi cssiVar = (cssi) obj;
        return new csrv(Pattern.compile(cssiVar.c).matcher(""), cssiVar.d, cssiVar.e);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
