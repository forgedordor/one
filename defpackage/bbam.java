package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbam {

    /* compiled from: PG */
    public interface a {
        Optional eX();
    }

    public static final bbaj a(String str) {
        bbaj bbajVar = bbaj.a;
        if (str != null) {
            List listR = fdgn.R(str, new char[]{':'});
            ArrayList arrayList = new ArrayList();
            Iterator it = listR.iterator();
            while (it.hasNext()) {
                Long lH = fdgn.h((String) it.next());
                if (lH != null) {
                    arrayList.add(lH);
                }
            }
            if (arrayList.size() != 2) {
                arrayList = null;
            }
            if (arrayList != null) {
                return new bbaj(((Number) arrayList.get(0)).longValue(), ((Number) arrayList.get(1)).longValue());
            }
        }
        return bbaj.a;
    }

    public static final bbaj b() {
        bbaj bbajVarD = d();
        return bbajVarD == null ? bbaj.c : bbajVarD;
    }

    public static final String c(bbaj bbajVar) {
        bbajVar.getClass();
        return bbajVar.d + ":" + bbajVar.e;
    }

    public static final bbaj d() {
        Optional optionalEX = ((a) cqtf.a(a.class)).eX();
        final fdap fdapVar = new fdap() { // from class: bbak
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return ((bbah) obj).a();
            }
        };
        return (bbaj) optionalEX.map(new Function() { // from class: bbal
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
        }).orElse(null);
    }
}
