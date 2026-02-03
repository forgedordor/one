package defpackage;

import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpqk {
    public static final cqce a = cqce.g("BugleCms", "CmsDatabaseOperations");
    private final cogw b;

    public cpqk(cogw cogwVar) {
        this.b = cogwVar;
    }

    public final int a(final int i, final int i2, String str) {
        eieu eieuVarK = eiiy.k("CmsDatabaseOperations#setCmsKeyCmsId");
        try {
            ejwl.l(!ecem.g());
            String[] strArr = bncb.a;
            bnby bnbyVar = new bnby();
            bnbyVar.ap("setCmsKeyCmsId");
            bnbyVar.al();
            bnbyVar.e(new Function() { // from class: cpqj
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
            bnbyVar.d(str);
            int iE = bnbyVar.b().e();
            eieuVarK.close();
            return iE;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final bnar b(final int i, final int i2) {
        bnar bnarVar;
        eieu eieuVarK = eiiy.k("CmsDatabaseOperations#getCmsKeyDataForIndex");
        try {
            bnbw bnbwVarA = bncb.a();
            bnbwVarA.A("getCmsKeyDataForIndex");
            bnbwVarA.e(new Function() { // from class: cpqf
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bnca bncaVar = (bnca) obj;
                    bncaVar.c(i);
                    bncaVar.e(i2);
                    return bncaVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bnbh bnbhVar = (bnbh) bnbwVarA.b().p();
            try {
                if (bnbhVar.moveToFirst()) {
                    bnarVar = (bnar) bnbhVar.cQ();
                    bnbhVar.close();
                } else {
                    bnbhVar.close();
                    bnarVar = null;
                }
                eieuVarK.close();
                return bnarVar;
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

    public final bnar c(final int i) {
        bnar bnarVar;
        eieu eieuVarK = eiiy.k("CmsDatabaseOperations#getMaxIndexedCmsKey");
        try {
            bnbw bnbwVarA = bncb.a();
            bnbwVarA.A("getMaxIndexedCmsKey");
            bnbwVarA.e(new Function() { // from class: cpqe
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bnca bncaVar = (bnca) obj;
                    bncaVar.e(i);
                    return bncaVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bnbwVarA.c(new bnbt(bncb.c.a));
            bnbwVarA.y(1);
            bnbh bnbhVar = (bnbh) bnbwVarA.b().p();
            try {
                if (bnbhVar.moveToFirst()) {
                    bnarVar = (bnar) bnbhVar.cQ();
                    bnbhVar.close();
                } else {
                    bnbhVar.close();
                    bnarVar = null;
                }
                eieuVarK.close();
                return bnarVar;
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

    public final List d(final int i) {
        eieu eieuVarK = eiiy.k("CmsDatabaseOperations#listAllCmsKeysOfType");
        try {
            bnbw bnbwVarA = bncb.a();
            bnbwVarA.A("listAllCmsKeysOfType");
            bnbwVarA.e(new Function() { // from class: cpqh
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bnca bncaVar = (bnca) obj;
                    bncaVar.e(i);
                    return bncaVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            ekgb ekgbVarZ = bnbwVarA.b().z();
            eieuVarK.close();
            return ekgbVarZ;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void e(byte[] bArr, int i) {
        eieu eieuVarK = eiiy.k("CmsDatabaseOperations#insertCmsKey");
        try {
            String[] strArr = bncb.a;
            bnau bnauVar = new bnau();
            bnauVar.e(1);
            bnauVar.d(bArr);
            bnauVar.f(i);
            bnauVar.a().n().longValue();
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void f(String str, String str2, avbk avbkVar, String str3) {
        ecem.b();
        String[] strArr = bnak.a;
        bmyy bmyyVar = new bmyy();
        bmyyVar.g(1L);
        bmyyVar.e(str);
        bmyyVar.c(str2);
        bmyyVar.d(avbkVar);
        bmyyVar.h(this.b.f().toEpochMilli());
        bmyyVar.f(str3);
        bmyyVar.b(0L);
        final bmyv bmyvVarA = bmyyVar.a();
        final dqsy dqsyVarA = bnak.a();
        Long.valueOf(dqru.b(bnak.a(), "cms_status", bmyvVarA, new Function() { // from class: bmyt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dqsyVarA.O("cms_status", (dqst) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bmyu
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                Long l = (Long) obj;
                if (l.longValue() >= 0) {
                    bmyv bmyvVar = bmyvVarA;
                    bmyvVar.a = l.longValue();
                    bmyvVar.fN(0);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        })).getClass();
    }
}
