package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class babi {
    public static final Map a;
    public static final Set b;
    public static final Map c;
    public static final Map d;
    private static final dqtr e;
    private static final dqxe f;
    private static final dqxe g;
    private static final dqxe h;

    static {
        aznt azntVar = aznt.a;
        Map map = aznt.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!fdbq.f(entry.getKey(), azns.c.a) && !fdbq.f(entry.getKey(), azns.c.b)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        a = fcwa.l(linkedHashMap);
        b = fcwm.b(new azwa(azns.c.b, PartsTable.d.b, azvt.b));
        String[] strArr = bmkn.a;
        bmki bmkiVar = new bmki(bmkn.a);
        bmkiVar.c(bmkn.c.d);
        bmkiVar.d(new Function() { // from class: babf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bmkm bmkmVar = (bmkm) obj;
                Map map2 = babi.a;
                bmkmVar.ar(new dqxl("$V{J:convo_id_map} = $V", new Object[]{bmkn.c.b, azvt.a.a}));
                return bmkmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dqtr dqtrVarI = dqts.i(bmkiVar.b(), bmkn.c.c, azlc.c.g);
        ((dqos) dqtrVarI).e = "convo_id_map";
        e = dqtrVarI;
        bmki bmkiVar2 = new bmki(bmkn.a);
        bmkiVar2.c(bmkn.c.d);
        bmkiVar2.d(new Function() { // from class: babg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bmkm bmkmVar = (bmkm) obj;
                Map map2 = babi.a;
                bmkmVar.g(azvt.a.a);
                return bmkmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dqts.i(bmkiVar2.b(), bmkn.c.c, azlc.c.g);
        aznp aznpVarA = azns.a();
        aznpVarA.A("conversationIdForPartQuery");
        aznpVarA.v();
        ((dqox) aznpVarA.a).u = "bp";
        azkz azkzVarA = azlc.a();
        azkzVarA.v();
        dqtr dqtrVarI2 = dqts.i(((azkz) azkzVarA.j(dqtrVarI)).b(), azlc.c.a, azns.c.b);
        ((dqos) dqtrVarI2).e = "bm";
        azno aznoVarB = ((aznp) aznpVarA.j(dqtrVarI2)).b();
        f = aznoVarB;
        dqxl dqxlVar = new dqxl("(SELECT bugle_id FROM ($V))", new Object[]{aznoVarB});
        g = dqxlVar;
        dqxl dqxlVar2 = new dqxl("($V)", new Object[]{1});
        h = dqxlVar2;
        bsgr bsgrVar = PartsTable.d;
        c = fcwa.g(new fcti(bsgrVar.p, dqxlVar), new fcti(bsgrVar.Q, dqxlVar2));
        azmp azmpVar = azns.c;
        azmq azmqVar = azmpVar.c;
        bsgr bsgrVar2 = PartsTable.d;
        d = fcwa.g(new fcti(azmqVar, bsgrVar2.f), new fcti(azmpVar.f, bsgrVar2.i), new fcti(azmpVar.g, bsgrVar2.j), new fcti(azmpVar.h, bsgrVar2.t), new fcti(azmpVar.i, bsgrVar2.u), new fcti(azmpVar.n, bsgrVar2.I), new fcti(azmpVar.o, bsgrVar2.J));
    }
}
