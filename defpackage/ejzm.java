package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejzm<K, V> extends ejzn<K, V> implements ejyq<K, V> {
    private static final long serialVersionUID = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejzm(ejyk ejykVar, ejyn ejynVar) {
        super(new ekak(ejykVar, ejynVar));
        ejynVar.getClass();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use LoadingSerializationProxy");
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0222, code lost:
    
        if (r8.d() != r7) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0224, code lost:
    
        r7.f();
        r2.set(r5, r4.e(r6, r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x022e, code lost:
    
        r4.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0235, code lost:
    
        r4.unlock();
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045 A[Catch: all -> 0x0262, ExecutionException -> 0x0264, TRY_LEAVE, TryCatch #0 {ExecutionException -> 0x0264, blocks: (B:3:0x0016, B:5:0x001a, B:7:0x0020, B:9:0x002e, B:10:0x0035, B:12:0x003f, B:13:0x0045, B:43:0x00f3, B:91:0x01ce, B:131:0x0252, B:129:0x024f, B:130:0x0251, B:32:0x00c3, B:135:0x025b, B:136:0x0261), top: B:151:0x0016, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0134 A[Catch: all -> 0x01da, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x01da, blocks: (B:61:0x0134, B:79:0x0190, B:80:0x0193, B:83:0x01a8, B:88:0x01c9, B:94:0x01d3, B:95:0x01d9, B:98:0x01dd, B:99:0x01ea, B:62:0x013a, B:64:0x014d, B:65:0x0154, B:67:0x0166, B:70:0x0172, B:72:0x017a, B:75:0x0186, B:78:0x018b, B:82:0x0197, B:86:0x01ad, B:87:0x01b4), top: B:159:0x0132, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01dd A[Catch: all -> 0x01da, TryCatch #5 {all -> 0x01da, blocks: (B:61:0x0134, B:79:0x0190, B:80:0x0193, B:83:0x01a8, B:88:0x01c9, B:94:0x01d3, B:95:0x01d9, B:98:0x01dd, B:99:0x01ea, B:62:0x013a, B:64:0x014d, B:65:0x0154, B:67:0x0166, B:70:0x0172, B:72:0x017a, B:75:0x0186, B:78:0x018b, B:82:0x0197, B:86:0x01ad, B:87:0x01b4), top: B:159:0x0132, inners: #2 }] */
    @Override // defpackage.ejyq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejzm.a(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ejvr
    public final V apply(K k) {
        return (V) e(k);
    }

    public final Object e(Object obj) {
        try {
            return a(obj);
        } catch (ExecutionException e) {
            throw new eotd(e.getCause());
        }
    }

    @Override // defpackage.ejzn
    Object writeReplace() {
        return new ejzk(this.a);
    }
}
