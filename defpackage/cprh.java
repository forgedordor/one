package defpackage;

import android.content.ContentValues;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cprh {
    public static final cczi a = cdag.h(cdag.b, "use_hmac_participant_hash", false);
    public final fcsu b;
    private final fcsu c;
    private final dqsn d;

    public cprh(fcsu fcsuVar, fcsu fcsuVar2, dqsn dqsnVar) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = dqsnVar;
    }

    private final evqs e(evqs evqsVar) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance("HmacSHA256");
        byte[] bArr = (byte[]) this.d.c("CmsEncryptionUtility#generateHmac", new ejxr() { // from class: cprf
            @Override // defpackage.ejxr
            public final Object get() {
                fcsu fcsuVar = this.a.b;
                List listD = ((cpqk) fcsuVar.b()).d(3);
                if (!listD.isEmpty()) {
                    return ((bnar) listD.get(0)).q();
                }
                byte[] bArrB = cpzk.b();
                eieu eieuVarK = eiiy.k("CmsDatabaseOperations#upsertCmsKey");
                try {
                    String[] strArr = bncb.a;
                    bnau bnauVar = new bnau();
                    bnauVar.e(1);
                    bnauVar.d(bArrB);
                    bnauVar.f(3);
                    final bnar bnarVarA = bnauVar.a();
                    bnca bncaVar = new bnca();
                    bncaVar.e(3);
                    bncaVar.c(1);
                    final bnbz bnbzVar = new bnbz(bncaVar);
                    final dqsy dqsyVarB = bncb.b();
                    ((Boolean) dqsyVarB.o(new ejxr() { // from class: bnam
                        @Override // defpackage.ejxr
                        public final Object get() {
                            String[] strArr2 = bncb.a;
                            bnby bnbyVar = new bnby();
                            ContentValues contentValues = bnbyVar.a;
                            bnar bnarVar = bnarVarA;
                            contentValues.put("key_index", Integer.valueOf(bnarVar.k()));
                            contentValues.put("encryption_key", bnarVar.q());
                            contentValues.put("key_type", Integer.valueOf(bnarVar.m()));
                            bnbyVar.c(bnarVar.o());
                            bnbyVar.d(bnarVar.p());
                            bnbyVar.al();
                            bnbyVar.af(bnbzVar);
                            bnbyVar.an(new dqsb("cms", "-updateOrInsert-update"));
                            if (bnbyVar.a().e() != 0) {
                                return true;
                            }
                            final dqsy dqsyVar = dqsyVarB;
                            return Boolean.valueOf(dqru.b(bncb.b(), "cms", bnarVar, new Function() { // from class: bnap
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return Long.valueOf(dqsyVar.O("cms", (dqst) obj));
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Consumer() { // from class: bnaq
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj) {
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            }) != -1);
                        }
                    })).booleanValue();
                    eieuVarK.close();
                    return bArrB;
                } catch (Throwable th) {
                    try {
                        eieuVarK.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        });
        bArr.getClass();
        mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
        mac.update(evqsVar.I());
        byte[] bArrDoFinal = mac.doFinal();
        Arrays.fill(bArr, (byte) 0);
        return evqs.x(bArrDoFinal);
    }

    public final String a(evqs evqsVar) {
        if (((Boolean) a.e()).booleanValue()) {
            try {
                return e(evqsVar).E();
            } catch (InvalidKeyException | NoSuchAlgorithmException e) {
                throw new cpoa("Unable to generate participant hash", e);
            }
        }
        int i = elcz.a;
        return eldz.e.j(elcx.a.b(evqsVar.I()).e());
    }

    public final String b(String str, Boolean bool) {
        if (bool.booleanValue()) {
            return a(evqs.A("cms:self_participant"));
        }
        str.getClass();
        return a(evqs.A(str));
    }

    public final String c(String str) {
        try {
            return eldz.e.j(e(evqs.A(str)).I());
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new cpoa("Unable to generate rcs message Cms ID", e);
        }
    }

    public final byte[] d(ezol ezolVar) throws GeneralSecurityException {
        byte[] bArr = (byte[]) this.d.c("CmsEncryptionUtility#getCmsBackupKey", new ejxr() { // from class: cprg
            @Override // defpackage.ejxr
            public final Object get() {
                List listD = ((cpqk) this.a.b.b()).d(2);
                if (listD.isEmpty()) {
                    return null;
                }
                return ((bnar) listD.get(0)).q();
            }
        });
        if (bArr == null) {
            throw new InvalidKeyException("Key is null");
        }
        evqs evqsVarV = ((cehg) this.c.b()).v(evqs.x(bArr), ezolVar);
        if (evqsVarV != null) {
            return evqsVarV.I();
        }
        throw new GeneralSecurityException("Encrypted data is null");
    }
}
