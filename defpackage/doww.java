package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doww extends fcyz implements fdat {
    int a;
    final /* synthetic */ dowx b;
    final /* synthetic */ Object c;
    final /* synthetic */ String d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doww(dowx dowxVar, Object obj, String str, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dowxVar;
        this.c = obj;
        this.d = str;
        this.e = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((doww) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                fdav fdavVarE = this.b.e();
                Object obj2 = this.c;
                String str = this.d;
                Integer num = new Integer(this.e);
                this.a = 1;
                obj = fdavVarE.a(obj2, str, num, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            Iterable iterable = (Iterable) obj;
            fdap fdapVarD = this.b.d();
            ArrayList arrayList = new ArrayList(fcva.p(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(fdapVarD.invoke(it.next()));
            }
            return arrayList;
        } catch (IOException e) {
            ((ekrd) ((ekrd) dowx.c.i()).g(e).h("com/google/android/libraries/compose/proxy/ui/search/SearchSuggestionsSource$provideSuggestions$3$1", "invokeSuspend", 34, "SearchSuggestionsSource.kt")).q("Unable to fetch search rows.");
            return fcvo.a;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new doww(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
