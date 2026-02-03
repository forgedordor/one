package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cavg extends cayv {
    private final asnl a;

    public cavg(asnl asnlVar) {
        this.a = asnlVar;
    }

    private static int k(int i) {
        int i2 = i - 2;
        if (i2 == 1) {
            return 4;
        }
        if (i2 == 2) {
            return 3;
        }
        if (i2 == 3 || i2 == 4) {
            return 5;
        }
        throw new IllegalArgumentException("Unrecognized proto enum");
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        pzh pzhVar = new pzh();
        pzhVar.c(2);
        ((caxk) caxzVarL).a = pzhVar.a();
        caxzVarL.c(((Integer) asow.b.e()).intValue());
        caxzVarL.f(((Boolean) ((cczi) asow.d.get()).e()).booleanValue() ? pza.a : pza.b);
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("RbmBusinessInfoRetrievalHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return cavk.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        cavk cavkVar = (cavk) evuhVar;
        int i = cavkVar.c;
        char c = i != 0 ? i != 1 ? i != 2 ? (char) 0 : (char) 4 : (char) 3 : (char) 2;
        if (c == 0 || c != 4) {
            asnl asnlVar = this.a;
            String str = cavkVar.b;
            int iB = cavj.b(cavkVar.d);
            return asnlVar.f(new asnm(str, k(iB != 0 ? iB : 1)));
        }
        final asnl asnlVar2 = this.a;
        String str2 = cavkVar.b;
        int iB2 = cavj.b(cavkVar.d);
        final asnm asnmVar = new asnm(str2, k(iB2 != 0 ? iB2 : 1));
        final String str3 = asnmVar.a;
        cqce cqceVar = asnl.a;
        cqceVar.p("Request made for ".concat(str3));
        cqbd cqbdVarC = cqceVar.c();
        cqbdVarC.I("Initiating business info retrieval handler...");
        cqbdVarC.A("RBM bot id", str3);
        cqbdVarC.r();
        eiju eijuVarG = eijx.g(new Callable() { // from class: asme
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cqbd cqbdVarA = asnl.a.a();
                cqbdVarA.I("Checking for pre-existing business info...");
                final String str4 = str3;
                cqbdVarA.A("RBM bot id", str4);
                cqbdVarA.r();
                final asnl asnlVar3 = asnlVar2;
                return (Boolean) bsyn.e(str4, new Function() { // from class: asmc
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bswk bswkVar = (bswk) obj;
                        if (bswkVar.k() >= asnlVar3.n.f().toEpochMilli()) {
                            return false;
                        }
                        String str5 = str4;
                        cqbd cqbdVarC2 = asnl.a.c();
                        cqbdVarC2.I("Business info in database has expired");
                        cqbdVarC2.A("RBM bot id", str5);
                        cqbdVarC2.H(bswkVar.k());
                        cqbdVarC2.r();
                        return true;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Supplier() { // from class: asmd
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        cqbd cqbdVarC2 = asnl.a.c();
                        cqbdVarC2.I("Business info does not exist in database");
                        cqbdVarC2.A("RBM bot id", str4);
                        cqbdVarC2.r();
                        return true;
                    }
                });
            }
        }, asnlVar2.h);
        eooz eoozVar = new eooz() { // from class: asnb
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (Boolean.TRUE.equals((Boolean) obj)) {
                    asnm asnmVar2 = asnmVar;
                    asnl asnlVar3 = asnlVar2;
                    asnlVar3.p.b("Bugle.Rbm.ChatbotDirectory.BotInfoDownloadLatency");
                    return asnlVar3.j(asnmVar2);
                }
                String str4 = str3;
                cqbd cqbdVarC2 = asnl.a.c();
                cqbdVarC2.I("Business info already exists and not expired. Skipping download of business info.");
                cqbdVarC2.A("RBM bot id", str4);
                cqbdVarC2.r();
                return eijx.e(asnl.c(str4));
            }
        };
        eosc eoscVar = asnlVar2.g;
        return eijuVarG.i(eoozVar, eoscVar).h(new ejvr() { // from class: asnc
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cbcw cbcwVar = (cbcw) obj;
                asnlVar2.p.k("Bugle.Rbm.ChatbotDirectory.BotInfoDownloadLatency");
                return cbcwVar;
            }
        }, eoscVar);
    }
}
