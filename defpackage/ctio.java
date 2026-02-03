package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctio implements fdat {
    final /* synthetic */ ctiu a;

    public ctio(ctiu ctiuVar) {
        this.a = ctiuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ctiu ctiuVar = this.a;
            Optional optional = (Optional) ctiuVar.i.b();
            hmlVar.v(1849434622);
            Object objF = hmlVar.f();
            if (objF == hmk.a) {
                final fdap fdapVar = new fdap() { // from class: ctik
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        return ((aidn) obj3).a();
                    }
                };
                Function function = new Function() { // from class: ctil
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        return fdapVar.invoke(obj3);
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                };
                hmlVar.y(function);
                objF = function;
            }
            Function functionM178m = aky$$ExternalSyntheticApiModelOutline0.m178m(objF);
            hmlVar.o();
            cuit.a(null, null, false, null, false, hxe.d(704378719, new ctin(ctiuVar, (aidm) optional.map(functionM178m).orElse((((Boolean) ctiuVar.j.a()).booleanValue() && ctiuVar.b()) ? aidm.b : aidm.a)), hmlVar), hmlVar, 196608, 31);
        }
        return fctx.a;
    }
}
