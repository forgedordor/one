package defpackage;

import android.util.LruCache;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aukj extends LruCache {
    private final fcsu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aukj(fcsu fcsuVar) {
        super(5);
        fcsuVar.getClass();
        this.a = fcsuVar;
    }

    @Override // android.util.LruCache
    public final /* synthetic */ Object create(Object obj) {
        byte[] bArr;
        final int iIntValue = ((Number) obj).intValue();
        eieu eieuVarK = eiiy.k("CmsDatabaseOperations#getCmsKeyForIndex");
        try {
            bnbw bnbwVarA = bncb.a();
            bnbwVarA.A("getCmsKeyForIndex");
            bnbwVarA.e(new Function() { // from class: cpqg
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    bnca bncaVar = (bnca) obj2;
                    bncaVar.c(iIntValue);
                    bncaVar.e(1);
                    return bncaVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bnbh bnbhVar = (bnbh) bnbwVarA.b().p();
            try {
                if (bnbhVar.moveToNext()) {
                    byte[] bArrF = bnbhVar.f();
                    bnbhVar.close();
                    eieuVarK.close();
                    bArr = bArrF;
                } else {
                    cqbd cqbdVarE = cpqk.a.e();
                    cqbdVarE.y("keyIndex", iIntValue);
                    cqbdVarE.y("keyType", 1);
                    cqbdVarE.I("No key found.");
                    cqbdVarE.r();
                    bnbhVar.close();
                    eieuVarK.close();
                    bArr = null;
                }
                if (bArr != null) {
                    return bArr;
                }
                throw new auki(a.g(iIntValue, "Failed to get encryption key at keyIndex "));
            } finally {
            }
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
