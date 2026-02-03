package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzwq implements bzwn {
    @Override // defpackage.bzwn
    public final Optional a(bnar bnarVar) {
        String strP = bnarVar.p();
        strP.getClass();
        bnbw bnbwVarA = bncb.a();
        bnbwVarA.A("cms.queryOnCmsId");
        bnbwVarA.q();
        bnca bncaVar = new bnca();
        int iIntValue = bncb.c().intValue();
        if (iIntValue < 35020) {
            dqru.x("cms_id", iIntValue);
        }
        bncaVar.ap(new dqpj("cms.cms_id", 1, strP));
        bnbwVarA.d(bncaVar);
        Optional optionalOfNullable = Optional.ofNullable((bnar) dqru.c(bnbwVarA.b()));
        if (optionalOfNullable.isPresent()) {
            return optionalOfNullable;
        }
        final int iK = bnarVar.k();
        final int iM = bnarVar.m();
        byte[] bArrQ = bnarVar.q();
        bnbw bnbwVarA2 = bncb.a();
        bnbwVarA2.A("findDuplicationWithKeyProperties");
        bnbwVarA2.e(new Function() { // from class: bzwo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bnca bncaVar2 = (bnca) obj;
                bncaVar2.c(iK);
                bncaVar2.e(iM);
                return bncaVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bnbh bnbhVar = (bnbh) bnbwVarA2.b().p();
        try {
            if (!bnbhVar.moveToFirst()) {
                bnbhVar.close();
                return Optional.empty();
            }
            if (Arrays.equals(bArrQ, bnbhVar.f())) {
                Optional optionalOf = Optional.of((bnar) bnbhVar.cQ());
                bnbhVar.close();
                return optionalOf;
            }
            Optional optionalEmpty = Optional.empty();
            bnbhVar.close();
            return optionalEmpty;
        } catch (Throwable th) {
            try {
                bnbhVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bzwn
    public final void b(bnar bnarVar, final int i, final int i2) {
        String strP = bnarVar.p();
        strP.getClass();
        String[] strArr = bncb.a;
        bnby bnbyVar = new bnby();
        bnbyVar.ap("overwriteWithCmsKeyObject");
        bnbyVar.e(new Function() { // from class: bzwp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bnca bncaVar = (bnca) obj;
                bncaVar.e(i2);
                bncaVar.c(i);
                return bncaVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bnbyVar.d(strP);
        bnbyVar.b().e();
    }
}
