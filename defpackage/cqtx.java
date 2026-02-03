package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.util.Objects;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqtx {
    public static final cqce a = cqce.g("Bugle", "CallbackTrackerUtil");
    private final eosc b;

    public cqtx(eosc eoscVar) {
        this.b = eoscVar;
    }

    public final eiju a(final Object obj, final String str, final cqtw cqtwVar) {
        cqbd cqbdVarD = a.d();
        cqbdVarD.I("Waiting for value on a CallbackTracker");
        cqbdVarD.A(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE, obj);
        cqbdVarD.A("traceString", str);
        cqbdVarD.r();
        final Function function = new Function() { // from class: cqtr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return ((abof) cqtwVar).a.c(str, (cqtk) obj2);
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        return eiju.g(kol.a(new koi() { // from class: cqtt
            @Override // defpackage.koi
            public final Object a(final kog kogVar) {
                final Object obj2 = new Object();
                final elee eleeVar = new elee();
                final Runnable runnableK = eiid.k(new Runnable() { // from class: cqtu
                    @Override // java.lang.Runnable
                    public final void run() {
                        Object obj3 = obj2;
                        elee eleeVar2 = eleeVar;
                        try {
                            synchronized (obj3) {
                                eleeVar2.close();
                            }
                        } catch (IOException e) {
                            cqtx.a.s("Could not close SubscriptionTokens", e);
                        }
                    }
                });
                final Object obj3 = obj;
                eleeVar.a((cquc) function.apply(new cqtk() { // from class: cqtv
                    @Override // defpackage.cqtk
                    public final eiju a(Object obj4) {
                        if (Objects.equals(obj3, obj4)) {
                            Runnable runnable = runnableK;
                            kogVar.b(null);
                            runnable.run();
                        }
                        return eijx.e(null);
                    }
                }));
                kogVar.a(runnableK, eoqg.a);
                return null;
            }
        })).h(new ejvr() { // from class: cqts
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                Void r4 = (Void) obj2;
                cqbd cqbdVarD2 = cqtx.a.d();
                cqbdVarD2.I("Received the awaited value on a CallbackTracker");
                cqbdVarD2.A(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE, obj);
                cqbdVarD2.A("traceString", str);
                cqbdVarD2.r();
                return r4;
            }
        }, this.b);
    }
}
