package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class botb extends dqws<bopr, bosz, botb, bojh, bopq> {
    public botb(String[] strArr) {
        super("conversations", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bosz b() {
        l();
        return new bosz(this.a.a());
    }

    public final void c(bopq... bopqVarArr) {
        int iIntValue = botm.g().intValue();
        for (bopq bopqVar : bopqVarArr) {
            if (((Integer) botm.b.getOrDefault(bopqVar.toString(), -1)).intValue() > iIntValue) {
                dqru.x("columnReference.toString()", iIntValue);
            }
        }
        m(bopqVarArr);
    }

    public final void d() {
        ((dqox) this.a).o = true;
    }

    public final void e(bosy... bosyVarArr) {
        D((String) DesugarArrays.stream(bosyVarArr).map(new Function() { // from class: bota
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bosy) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }

    public final void f(Function function) {
        c((bopq[]) function.apply(botm.c));
    }

    public final void g(Function function) {
        c((bopq) function.apply(botm.c));
    }

    public final void h(botl botlVar) {
        k(new botf(botlVar));
    }

    public final void i(Function function) {
        String[] strArr = botm.a;
        k(new botf((botl) function.apply(new botl())));
    }
}
