package defpackage;

import android.content.Context;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csvt {
    public final eosc c;
    public final eosc d;
    public final cden e;
    private final ejxr g;
    private final cogw h;
    public static final cqce a = cqce.g("Bugle", "VerifiedSmsKeyCryptor");
    private static final byte[] f = new byte[0];
    public static final cczv b = cdag.p(168221060);

    public csvt(eosc eoscVar, eosc eoscVar2, final Context context, cogw cogwVar, cden cdenVar) {
        this.c = eoscVar;
        this.d = eoscVar2;
        this.g = ejxx.a(new ejxr() { // from class: csvn
            @Override // defpackage.ejxr
            public final Object get() {
                if (byew.a().booleanValue()) {
                    throw new IllegalStateException();
                }
                final Context context2 = context;
                return eijx.g(new Callable() { // from class: csvp
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return csvt.d(context2);
                    }
                }, this.a.c);
            }
        });
        this.h = cogwVar;
        this.e = cdenVar;
    }

    static /* synthetic */ erdf d(Context context) {
        try {
            cqce cqceVar = a;
            cqbd cqbdVarC = cqceVar.c();
            cqbdVarC.I("Initializing HybridConfig...");
            cqbdVarC.r();
            erbc.a();
            cqbd cqbdVarC2 = cqceVar.c();
            cqbdVarC2.I("Constructing AndroidKeysetManager...");
            cqbdVarC2.r();
            erde erdeVar = new erde();
            erdeVar.c(context, "verified_sms_master_key", "verified_sms");
            erdeVar.e = erbq.a;
            erdeVar.b("android-keystore://verified_sms");
            return erdeVar.a();
        } catch (IOException | GeneralSecurityException e) {
            a.o("Error while initializing Tink's HybridConfig/AndroidKeysetManager", e);
            throw new csvs(e);
        }
    }

    public static KeyPair e(csvg csvgVar, erdf erdfVar) {
        if (byew.a().booleanValue()) {
            throw new IllegalStateException();
        }
        byte[] bArrI = csvgVar.d.I();
        byte[] bArrI2 = csvgVar.c.I();
        try {
            eqse eqseVar = (eqse) erdfVar.a().h(erfz.a, eqse.class);
            byte[] bArr = f;
            byte[] bArrA = eqseVar.a(bArrI, bArr);
            byte[] bArrA2 = eqseVar.a(bArrI2, bArr);
            if (byew.a().booleanValue()) {
                throw new IllegalStateException();
            }
            ervg ervgVar = ervg.g;
            KeyPair keyPair = new KeyPair((ECPublicKey) ((KeyFactory) ervgVar.a("EC")).generatePublic(new X509EncodedKeySpec(bArrA)), (ECPrivateKey) ((KeyFactory) ervgVar.a("EC")).generatePrivate(new PKCS8EncodedKeySpec(bArrA2)));
            cqbd cqbdVarC = a.c();
            cqbdVarC.I("Deserialized key pair:");
            cqbdVarC.y("private_size", keyPair.getPrivate().getEncoded().length);
            cqbdVarC.y("public_size", keyPair.getPublic().getEncoded().length);
            cqbdVarC.M("private_class", keyPair.getPrivate().getClass().getName());
            cqbdVarC.M("public_class", keyPair.getPublic().getClass().getName());
            cqbdVarC.r();
            return keyPair;
        } catch (GeneralSecurityException e) {
            cqce cqceVar = a;
            cqbd cqbdVarE = cqceVar.e();
            cqbdVarE.I("Decryption failed, at rest information for key pair:");
            cqbdVarE.y("private_encrypted_size", bArrI2.length);
            cqbdVarE.y("public_encrypted_size", bArrI.length);
            cqbdVarE.r();
            cqbd cqbdVarE2 = cqceVar.e();
            cqbdVarE2.I("Error while decrypting/restoring VSMS key pair.");
            cqbdVarE2.s(e);
            throw new csvr("Error while decrypting/restoring VSMS key pair.", e);
        }
    }

    public final /* synthetic */ csvg a(KeyPair keyPair, erdf erdfVar) {
        try {
            eqsf eqsfVar = (eqsf) erdfVar.a().e().h(erfz.a, eqsf.class);
            byte[] encoded = keyPair.getPrivate().getEncoded();
            byte[] bArr = f;
            byte[] bArrA = eqsfVar.a(encoded, bArr);
            byte[] bArrA2 = eqsfVar.a(keyPair.getPublic().getEncoded(), bArr);
            csvf csvfVar = (csvf) csvg.a.createBuilder();
            evqs evqsVarX = evqs.x(bArrA);
            csvfVar.copyOnWrite();
            ((csvg) csvfVar.instance).c = evqsVarX;
            evqs evqsVarX2 = evqs.x(bArrA2);
            csvfVar.copyOnWrite();
            ((csvg) csvfVar.instance).d = evqsVarX2;
            evvp evvpVarC = evxc.c(this.h.f().toEpochMilli());
            csvfVar.copyOnWrite();
            csvg csvgVar = (csvg) csvfVar.instance;
            evvpVarC.getClass();
            csvgVar.e = evvpVarC;
            csvgVar.b |= 1;
            return (csvg) csvfVar.build();
        } catch (GeneralSecurityException e) {
            cqbd cqbdVarB = a.b();
            cqbdVarB.I("Error while encrypting VSMS key pair.");
            cqbdVarB.s(e);
            throw new csvr("Error while encrypting VSMS key pair.", e);
        }
    }

    final eiju b(final List list) {
        if (byew.a().booleanValue()) {
            int i = ekgb.d;
            return eijx.e(ekoe.a);
        }
        cqbd cqbdVarC = a.c();
        cqbdVarC.I("Decrypting VSMS key pairs...");
        cqbdVarC.y("number", list.size());
        cqbdVarC.r();
        return c().h(new ejvr() { // from class: csvm
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                final erdf erdfVar = (erdf) obj;
                cqce cqceVar = csvt.a;
                Stream map = Collection.EL.stream(list).map(new Function() { // from class: csvl
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return csvt.e((csvg) obj2, erdfVar);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i2 = ekgb.d;
                return (ekgb) map.collect(ekcv.a);
            }
        }, this.c).f(Exception.class, new csvk(this), this.d);
    }

    public final eiju c() {
        if (byew.a().booleanValue()) {
            throw new IllegalStateException();
        }
        return (eiju) this.g.get();
    }
}
