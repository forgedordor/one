package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcfe {
    public static final Logger a = Logger.getLogger(fcfe.class.getName());

    private fcfe() {
    }

    public static Object a(etdb etdbVar) throws IOException {
        ejwl.m(etdbVar.r(), "unexpected end of JSON");
        int iT = etdbVar.t() - 1;
        if (iT == 0) {
            etdbVar.l();
            ArrayList arrayList = new ArrayList();
            while (etdbVar.r()) {
                arrayList.add(a(etdbVar));
            }
            ejwl.m(etdbVar.t() == 2, "Bad token: ".concat(etdbVar.e()));
            etdbVar.n();
            return DesugarCollections.unmodifiableList(arrayList);
        }
        if (iT == 2) {
            etdbVar.m();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (etdbVar.r()) {
                String strH = etdbVar.h();
                ejwl.f(!linkedHashMap.containsKey(strH), "Duplicate key found: %s", strH);
                linkedHashMap.put(strH, a(etdbVar));
            }
            ejwl.m(etdbVar.t() == 4, "Bad token: ".concat(etdbVar.e()));
            etdbVar.o();
            return DesugarCollections.unmodifiableMap(linkedHashMap);
        }
        if (iT == 5) {
            return etdbVar.j();
        }
        if (iT == 6) {
            return Double.valueOf(etdbVar.a());
        }
        if (iT == 7) {
            return Boolean.valueOf(etdbVar.s());
        }
        if (iT != 8) {
            throw new IllegalStateException("Bad token: ".concat(etdbVar.e()));
        }
        etdbVar.p();
        return null;
    }
}
