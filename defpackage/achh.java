package defpackage;

import android.app.Activity;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class achh implements achf {
    private static final cqce a = cqce.g("Bugle", "VerifiedSmsInvestigativeRpcPromo");
    private final csve b;

    public achh(csve csveVar) {
        this.b = csveVar;
    }

    @Override // defpackage.achf
    public final void b(Activity activity) {
        if (byew.a().booleanValue()) {
            eijx.e(null);
        } else {
            this.b.d(new Function() { // from class: csvb
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ekfk ekfkVar = csve.a;
                    csul csulVar = (csul) ((csup) obj).toBuilder();
                    csulVar.copyOnWrite();
                    ((csup) csulVar.instance).f = true;
                    return csulVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }
        a.p("Investigative RPC accepted.");
    }

    @Override // defpackage.achf
    public final /* synthetic */ void a(Activity activity) {
    }
}
