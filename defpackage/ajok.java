package defpackage;

import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajok {
    private final ejxk a = ejxk.b('|');
    private final ajpl b;

    public ajok(ajpl ajplVar) {
        this.b = ajplVar;
    }

    public final ekgb a(String str, Function function) throws Throwable {
        bndx bndxVar;
        String strG;
        String strH;
        String strF;
        ekfw ekfwVar;
        int i;
        String str2;
        long j;
        int i2 = ekgb.d;
        ekfw ekfwVar2 = new ekfw();
        bnfb bnfbVarA = bnfe.a();
        bnfbVarA.A(str);
        bnfbVarA.d(new Function() { // from class: ajoi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bndv bndvVar = (bndv) obj;
                return new bndw[]{bndvVar.b, bndvVar.c, bndvVar.n, bndvVar.e, bndvVar.h};
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        });
        String str3 = "count";
        bnfbVarA.n(new dqxm("COUNT(*)"), "count");
        bndv bndvVar = bnfe.c;
        int i3 = 1;
        bnfbVarA.n(new dqxl("group_concat($V, '|')", new Object[]{bndvVar.d}), "phones");
        bnfbVarA.n(new dqxl("group_concat($V, '|')", new Object[]{bndvVar.r}), "display_destinations");
        bnfbVarA.n(new dqxl("group_concat($V, '|')", new Object[]{bndvVar.p}), "types");
        bnfbVarA.n(new dqxl("group_concat(COALESCE($V, $V), '|')", new Object[]{bndvVar.q, ""}), "labels");
        bnfbVarA.f(function);
        bnfbVarA.w(bndvVar.b);
        bnfbVarA.c(new bney(bndvVar.o), new bney(bndvVar.m));
        bndx bndxVar2 = (bndx) bnfbVarA.b().p();
        while (bndxVar2.moveToNext()) {
            try {
                long jC = bndxVar2.c();
                strG = bndxVar2.g();
                strH = bndxVar2.h();
                strF = bndxVar2.f();
                ekfwVar = new ekfw();
                i = Integer.parseInt(bndxVar2.de(str3));
                if (i == i3) {
                    str2 = str3;
                    j = jC;
                    ekfwVar.h(this.b.a(Integer.parseInt(bndxVar2.de("types")), bndxVar2.de("labels"), bndxVar2.de("phones"), bndxVar2.de("display_destinations")));
                } else {
                    str2 = str3;
                    j = jC;
                    ejxk ejxkVar = this.a;
                    Iterable iterableG = ejxkVar.g(bndxVar2.de("phones"));
                    Iterator it = ejxkVar.g(bndxVar2.de("display_destinations")).iterator();
                    Iterator it2 = ejxkVar.g(bndxVar2.de("types")).iterator();
                    Iterator it3 = ejxkVar.g(bndxVar2.de("labels")).iterator();
                    Iterator it4 = iterableG.iterator();
                    while (it4.hasNext()) {
                        bndx bndxVar3 = bndxVar2;
                        ekfwVar.h(this.b.a(Integer.parseInt((String) it2.next()), it3 != null ? (String) it3.next() : null, (String) it4.next(), (String) it.next()));
                        bndxVar2 = bndxVar3;
                        it4 = it4;
                        it3 = it3;
                    }
                }
                bndxVar = bndxVar2;
            } catch (Throwable th) {
                th = th;
                bndxVar = bndxVar2;
            }
            try {
                ekgb ekgbVarG = ekfwVar.g();
                ejwl.a(((ekoe) ekgbVarG).c == i);
                ekfwVar2.h(ajpm.g(j, strG, strH, strF, ekgbVarG, bndxVar.e()));
                bndxVar2 = bndxVar;
                str3 = str2;
                i3 = 1;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                try {
                    bndxVar.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        }
        bndxVar2.close();
        return ekfwVar2.g();
    }
}
