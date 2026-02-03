package defpackage;

import com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLib;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqzl implements cqyy {
    private final cugg a;
    private final eosc b;

    public cqzl(cugg cuggVar, eosc eoscVar) {
        this.a = cuggVar;
        this.b = eoscVar;
    }

    @Override // defpackage.cqyy
    public final eiju a(final String str) {
        eiju eijuVarA = this.a.a();
        ejvr ejvrVar = new ejvr() { // from class: cqzi
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                final String str2 = str;
                return ((Optional) obj).map(new Function() { // from class: cqzk
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        TextClassifierLib textClassifierLib = (TextClassifierLib) obj2;
                        euke eukeVar = new euke();
                        int i = ekgb.d;
                        ekfw ekfwVar = new ekfw();
                        if (((Boolean) crao.b.e()).booleanValue()) {
                            ekfwVar.h("entity");
                        }
                        if (((Boolean) crao.c.e()).booleanValue()) {
                            ekfwVar.h("address");
                        }
                        if (((Boolean) crao.d.e()).booleanValue()) {
                            ekfwVar.h("contact");
                        }
                        if (((Boolean) crao.e.e()).booleanValue()) {
                            ekfwVar.h("datetime");
                            ekfwVar.h("date");
                        }
                        if (((Boolean) crao.f.e()).booleanValue()) {
                            ekfwVar.h("url");
                        }
                        if (((Boolean) crao.g.e()).booleanValue()) {
                            ekfwVar.h("email");
                        }
                        if (((Boolean) crao.h.e()).booleanValue()) {
                            ekfwVar.h("phone");
                        }
                        String str3 = str2;
                        eukeVar.b = ekfwVar.g();
                        eukeVar.b();
                        eukf eukfVarA = eukeVar.a();
                        eulo euloVar = new eulo(str3);
                        eukj eukjVar = eukj.RAW;
                        euloVar.a = eukfVarA;
                        return textClassifierLib.g(eujx.a(eukjVar, euloVar, null));
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        };
        eosc eoscVar = this.b;
        return eijuVarA.h(ejvrVar, eoscVar).h(new ejvr() { // from class: cqzj
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                final String str2 = str;
                return (List) ((Optional) obj).map(new Function() { // from class: cqzg
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
                    @Override // java.util.function.Function
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object apply(java.lang.Object r27) throws defpackage.cqyl {
                        /*
                            Method dump skipped, instructions count: 2306
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqzg.apply(java.lang.Object):java.lang.Object");
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElseGet(new Supplier() { // from class: cqzh
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        int i = ekgb.d;
                        return ekoe.a;
                    }
                });
            }
        }, eoscVar);
    }
}
