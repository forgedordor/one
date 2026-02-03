package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqth {
    public final dqwl a;
    public final dqpo b;
    public final dqpo c;
    public final String d;
    public final String e;
    public final boolean f;
    public final dqyj g;
    public int h;
    public final int i;

    public dqth(dqwl dqwlVar, dqpo dqpoVar, dqpo dqpoVar2, String str, dqyj dqyjVar, int i, boolean z, String str2) {
        this.a = dqwlVar;
        if (!z && dqpoVar != null && !((dqoh) dqpoVar.a).f) {
            throw new IllegalArgumentException(a.b(dqpoVar, "join on ", " without index"));
        }
        this.b = dqpoVar;
        this.c = dqpoVar2;
        this.d = str;
        this.g = dqyjVar;
        this.i = i;
        this.e = str2;
        boolean z2 = true;
        if (dqpoVar != null) {
            dqpo dqpoVarC = dqpoVar.c();
            if (dqpoVar.h() || (dqpoVarC != null && dqpoVarC.h())) {
                z2 = false;
            }
        }
        this.f = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(dqsy dqsyVar, dqqf dqqfVar, dqtm dqtmVar, boolean z) {
        Stream stream = Collection.EL.stream(ekjz.c(dqqfVar.f));
        Function function = z ? new Function() { // from class: dqte
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (!str.startsWith("group_concat(quote(")) {
                    return str;
                }
                String strSubstring = str.substring(19);
                return strSubstring.substring(0, strSubstring.indexOf("), '|')"));
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        } : new Function() { // from class: dqtf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (String) obj;
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        dqwl dqwlVar = this.a;
        String str = this.e;
        ArrayList arrayList = (ArrayList) stream.map(function).collect(Collectors.toCollection(new Supplier() { // from class: dqtg
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        }));
        dqqfVar.h.put(str, dqwlVar.a(dqsyVar, dqqfVar, (String[]) arrayList.toArray(new String[0]), null, dqtmVar.b(str), dqtmVar));
        ekgb ekgbVarC = dqwlVar.m.c();
        int i = ((ekoe) ekgbVarC).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((dqth) ekgbVarC.get(i2)).a(dqsyVar, dqqfVar, dqtmVar, z);
        }
    }

    public final void b() {
    }
}
