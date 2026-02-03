package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coca implements coby {
    public static final fctc a = fctd.a(new fdae() { // from class: cobz
        @Override // defpackage.fdae
        public final Object invoke() {
            fctc fctcVar = coca.a;
            return fcwm.d((cocp) codb.a.a(), (cocp) cocg.a.a(), (cocp) cock.a.a(), (cocp) cocw.a.a(), (cocp) cocw.b.a(), (cocp) coco.b.a());
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:107:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02b0  */
    @Override // defpackage.coby
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cobw a(defpackage.cnyk r22, java.util.Collection r23) {
        /*
            Method dump skipped, instructions count: 779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coca.a(cnyk, java.util.Collection):cobw");
    }

    @Override // defpackage.coby
    public final cobx b(cnyz cnyzVar, Collection collection) {
        Object next;
        cnyzVar.getClass();
        Iterator it = ((Set) a.a()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Boolean) ((cocp) next).a.a(cnyzVar, collection)).booleanValue()) {
                break;
            }
        }
        cocp cocpVar = (cocp) next;
        if (cocpVar == null) {
            return null;
        }
        if (((Boolean) cocpVar.a.a(cnyzVar, collection)).booleanValue()) {
            return (cobx) cocpVar.b.a(cnyzVar, collection);
        }
        Class<?> cls = cocpVar.getClass();
        int i = fdcj.a;
        throw new IllegalStateException("MergeCase " + new fdbi(cls).c() + " is not applicable fornewRequest: " + cnyzVar + " and queuedSyncs " + collection);
    }
}
