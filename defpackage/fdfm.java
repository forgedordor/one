package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes6.dex */
public class fdfm extends fdfh {
    public static final Object f(fdev fdevVar) {
        fdevVar.getClass();
        Iterator itA = fdevVar.a();
        if (itA.hasNext()) {
            return itA.next();
        }
        return null;
    }

    public static final List g(fdev fdevVar) {
        Iterator itA = fdevVar.a();
        if (!itA.hasNext()) {
            return fcvo.a;
        }
        Object next = itA.next();
        if (!itA.hasNext()) {
            return fcva.b(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (itA.hasNext()) {
            arrayList.add(itA.next());
        }
        return arrayList;
    }

    public static final fdev h(fdev fdevVar, int i) {
        if (i >= 0) {
            return i != 0 ? fdevVar instanceof fden ? ((fden) fdevVar).b(i) : new fdem(fdevVar, i) : fdevVar;
        }
        throw new IllegalArgumentException(a.e(i, "Requested element count ", " is less than zero."));
    }

    public static final fdev i(fdev fdevVar) {
        return new fdeq(fdevVar, false, new fdap() { // from class: fdfj
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(obj == null);
            }
        });
    }

    public static final fdev j(fdev fdevVar, fdap fdapVar) {
        fdevVar.getClass();
        return new fdfu(fdevVar, fdapVar);
    }

    public static final fdev k(fdev fdevVar, fdap fdapVar) {
        fdevVar.getClass();
        return fdey.i(new fdfu(fdevVar, fdapVar));
    }

    public static final fdev l(fdev fdevVar, int i) {
        if (i >= 0) {
            return i == 0 ? fdeo.a : fdevVar instanceof fden ? ((fden) fdevVar).c(i) : new fdfq(fdevVar, i);
        }
        throw new IllegalArgumentException(a.e(i, "Requested element count ", " is less than zero."));
    }

    public static /* synthetic */ String m(fdev fdevVar, CharSequence charSequence, int i) throws IOException {
        if (1 == (i & 1)) {
            charSequence = ", ";
        }
        charSequence.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        Iterator itA = fdevVar.a();
        int i2 = 0;
        while (itA.hasNext()) {
            Object next = itA.next();
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            fdgn.a(sb, next, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }
}
