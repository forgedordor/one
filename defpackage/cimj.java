package defpackage;

import j$.util.Map;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cimj {
    public final int a;
    private final Map b;
    private final List c;
    private final List d;

    public cimj() {
        this((byte[]) null);
    }

    private static final void c(List list, cilt ciltVar) {
        list.add(ciltVar);
        fcva.s(list, new fcxm(new fdap[]{new fdap() { // from class: cimh
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cilt ciltVar2 = (cilt) obj;
                ciltVar2.getClass();
                return ciltVar2.a;
            }
        }, new fdap() { // from class: cimi
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cilt ciltVar2 = (cilt) obj;
                ciltVar2.getClass();
                return ciltVar2.b;
            }
        }}));
    }

    public final cimd a() {
        Map map = this.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(fcwa.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((cimj) entry.getValue()).a());
        }
        return new cimd(linkedHashMap, fcva.ao(this.c), fcva.ao(this.d));
    }

    public final void b(cilu ciluVar) {
        String str = ciluVar.a;
        int i = this.a;
        String str2 = "@" + fdgn.Z(str, i);
        String strY = fdgn.Y(str, i);
        anue anueVar = ciluVar.c;
        c(this.c, new cilt(anueVar, str2, strY));
        Integer num = ciluVar.b;
        if (num != null && num.intValue() <= i) {
            c(this.d, new cilt(anueVar, fdgn.Z(str, i), fdgn.Y(str, i)));
        }
        if (i >= str.length()) {
            return;
        }
        char cA = cimc.a(str.charAt(i));
        Map map = this.b;
        Character chValueOf = Character.valueOf(cA);
        final fdap fdapVar = new fdap() { // from class: cimf
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((Character) obj).getClass();
                return new cimj(this.a.a + 1);
            }
        };
        ((cimj) Map.EL.computeIfAbsent(map, chValueOf, new Function() { // from class: cimg
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
        })).b(ciluVar);
    }

    public cimj(int i) {
        this.a = i;
        this.b = new LinkedHashMap();
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    public /* synthetic */ cimj(byte[] bArr) {
        this(0);
    }
}
