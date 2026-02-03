package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import java.util.Comparator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class cazc {
    /* JADX WARN: Multi-variable type inference failed */
    public static cazc j(String str, ekgb ekgbVar) {
        cbdg cbdgVar = (cbdg) ekgbVar.get(0);
        String strQ = cbdgVar.q();
        int iIndexOf = strQ.indexOf("-");
        String strSubstring = iIndexOf > 0 ? strQ.substring(iIndexOf + 1) : "";
        ekgb ekgbVar2 = (ekgb) Collection.EL.stream(ekgbVar).map(new Function() { // from class: cayz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((cbdg) obj).k());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(ekcv.a);
        long jLongValue = ((Long) Collection.EL.stream(ekgbVar).map(new Function() { // from class: caza
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cbdg cbdgVar2 = (cbdg) obj;
                return (cbdgVar2.s() == null || cbdgVar2.s().getTime() == 0) ? Long.valueOf(cbdgVar2.n()) : Long.valueOf(cbdgVar2.s().getTime());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).min(new Comparator() { // from class: cazb
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
            }
        }).orElse(0L)).longValue();
        String strR = cbdgVar.r();
        if (true == strSubstring.isEmpty()) {
            strSubstring = null;
        }
        return new caxm(str, strR, strSubstring, cbdgVar.q(), cbdgVar.o(), cbdgVar.k(), ekgbVar2, cbdgVar.m(), jLongValue);
    }

    public abstract int a();

    public abstract long b();

    public abstract long c();

    public abstract ekgb d();

    public abstract String e();

    public abstract String f();

    public abstract String g();

    public abstract String h();

    public abstract String i();
}
