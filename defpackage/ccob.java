package defpackage;

import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccob implements epzh {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/e2ee/mls/data/traits/KeyPackageStorageImpl");
    public final fcsu a;

    public ccob(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.a = fcsuVar;
    }

    @Override // defpackage.epzh
    public final eqaw a(final byte[] bArr) {
        String[] strArr = ccha.a;
        ccgs ccgsVar = new ccgs();
        ccgsVar.f("KeyPackageStorageImpl#delete");
        ccgsVar.c(new Function() { // from class: ccoa
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ccgz ccgzVar = (ccgz) obj;
                byte[] bArr2 = bArr;
                byte[] bArrCopyOf = Arrays.copyOf(bArr2, bArr2.length);
                bArrCopyOf.getClass();
                ccgzVar.b(bArrCopyOf);
                return ccgzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        if (ccgsVar.b().b() > 0) {
            eqax eqaxVar = eqaw.a;
            return eqav.c();
        }
        eqax eqaxVar2 = eqaw.a;
        return eqav.b();
    }

    @Override // defpackage.epzh
    public final eqaw b() {
        String[] strArr = ccha.a;
        ccgs ccgsVar = new ccgs();
        ccgsVar.e();
        ccgsVar.f("KeyPackageStorageImpl#deleteExpired");
        ccgsVar.c(new Function() { // from class: ccnz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ccgz ccgzVar = (ccgz) obj;
                ccgzVar.ap(new dqpj("mls_key_packages.expiration_timestamp", 8, Long.valueOf(bart.a(((coha) this.a.a.b()).a()))));
                return ccgzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ccgsVar.b().b();
        eqax eqaxVar = eqaw.a;
        return eqav.c();
    }

    @Override // defpackage.epzh
    public final eqaw c(byte[] bArr, epze epzeVar) {
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        bArrCopyOf.getClass();
        String[] strArr = ccha.a;
        ccgx ccgxVar = new ccgx(ccha.a);
        ccgxVar.A("mls_key_packages.queryOnId");
        ccgxVar.q();
        ccgz ccgzVar = new ccgz();
        ccgzVar.b(bArrCopyOf);
        ccgxVar.k(new ccgy(ccgzVar));
        Optional optionalOfNullable = Optional.ofNullable((ccga) dqru.c(ccgxVar.b()));
        if (optionalOfNullable.isEmpty()) {
            eqax eqaxVar = eqaw.a;
            return eqav.b();
        }
        ccga ccgaVar = (ccga) optionalOfNullable.get();
        ccgaVar.aA(1, "key_package");
        byte[] bArr2 = ccgaVar.b;
        bArr2.getClass();
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
        bArrCopyOf2.getClass();
        epzeVar.a(bArrCopyOf2);
        eqax eqaxVar2 = eqaw.a;
        return eqav.c();
    }

    @Override // defpackage.epzh
    public final eqaw d(byte[] bArr, byte[] bArr2) {
        byte[] bArrCopyOf = Arrays.copyOf(bArr2, bArr2.length);
        bArrCopyOf.getClass();
        eptg eptgVar = (eptg) evsn.parseFrom(eptg.a, bArrCopyOf);
        eptgVar.getClass();
        try {
            String[] strArr = ccha.a;
            ccgd ccgdVar = new ccgd();
            byte[] bArrCopyOf2 = Arrays.copyOf(bArr, bArr.length);
            bArrCopyOf2.getClass();
            ccgdVar.c(bArrCopyOf2);
            ccgdVar.d(bArrCopyOf);
            ccgdVar.b(Instant.ofEpochMilli(eptgVar.b));
            ccga ccgaVarA = ccgdVar.a();
            final dqsy dqsyVarA = ccha.a();
            dqru.b(ccha.a(), "mls_key_packages", ccgaVarA, new Function() { // from class: ccfy
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(dqsyVarA.P("mls_key_packages", (dqst) obj));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Consumer() { // from class: ccfz
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            eqax eqaxVar = eqaw.a;
            return eqav.c();
        } catch (Exception e) {
            ekrw ekrwVarI = b.i();
            ekrwVarI.X(eksq.a, "BugleE2eeMls");
            ((ekrd) ((ekrd) ekrwVarI).g(e).h("com/google/android/apps/messaging/shared/e2ee/mls/data/traits/KeyPackageStorageImpl", "insert-uo5YlkA", 50, "KeyPackageStorageImpl.kt")).t("Failed to insert key package into MlsKeyPackages table, id: %s", ccoj.a(bArr));
            eqax eqaxVar2 = eqaw.a;
            return eqav.a(eqbq.w);
        }
    }
}
