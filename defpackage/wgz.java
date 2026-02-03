package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wgz implements wgu {
    public final asif a;
    private final fdjx b;
    private final xck c;
    private final wjd d;
    private final wzf e;
    private final wum f;
    private final Optional g;
    private final wgt h;

    public wgz(fdjx fdjxVar, wqu wquVar, xck xckVar, wjd wjdVar, wzf wzfVar, wum wumVar, asif asifVar, Optional optional, wgt wgtVar) {
        fdjxVar.getClass();
        wquVar.getClass();
        xckVar.getClass();
        wjdVar.getClass();
        wzfVar.getClass();
        wumVar.getClass();
        wgtVar.getClass();
        this.b = fdjxVar;
        this.c = xckVar;
        this.d = wjdVar;
        this.e = wzfVar;
        this.f = wumVar;
        this.a = asifVar;
        this.g = optional;
        this.h = wgtVar;
        auvw.k(wquVar.c, wquVar.b, null, new wqt(wquVar, null), 2);
    }

    @Override // defpackage.wgu
    public final fdvc a() {
        wgt wgtVar = this.h;
        fdjx fdjxVar = this.b;
        fdus fdusVar = fdur.b;
        fdvc fdvcVarB = this.c.b();
        fdvc fdvcVarA = this.d.a();
        fdvc fdvcVarA2 = this.e.a();
        fdvc fdvcVarA3 = wgtVar.a(fdjxVar);
        fdvc fdvcVarA4 = this.f.a();
        final fdap fdapVar = new fdap() { // from class: wgv
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return ((wvk) obj).a();
            }
        };
        Object objOrElse = this.g.map(new Function() { // from class: wgw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return fdapVar.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(new auxs(new fdae() { // from class: wgx
            @Override // defpackage.fdae
            public final Object invoke() {
                return null;
            }
        }));
        objOrElse.getClass();
        return avba.b(fdjxVar, fdusVar, fdvcVarB, fdvcVarA, fdvcVarA2, fdvcVarA3, fdvcVarA4, (fdvc) objOrElse, new fdax() { // from class: wgy
            @Override // defpackage.fdax
            public final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                djcv djcvVar = (djcv) obj;
                djcq djcqVar = (djcq) obj2;
                djew djewVar = (djew) obj3;
                djcvVar.getClass();
                djcqVar.getClass();
                djewVar.getClass();
                return new djcy(djcvVar, djcqVar, (djcw) obj4, djewVar, (djcr) obj5, (djdy) obj6, new djcx(this.a.a.a()));
            }
        });
    }
}
