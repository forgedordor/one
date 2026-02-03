package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.communication.synapse.security.scytale.MediaEncryptor;
import j$.time.Duration;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwdh implements coty {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EncryptedFileUploadPreprocessor");
    private final Context b;
    private final cogw c;
    private final eygg d;
    private final cotz e;
    private final cqmz f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final aqvb j;

    public bwdh(Context context, cogw cogwVar, eygg eyggVar, cotz cotzVar, cqmz cqmzVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, aqvb aqvbVar) {
        this.b = context;
        this.c = cogwVar;
        this.d = eyggVar;
        this.e = cotzVar;
        this.f = cqmzVar;
        this.g = fcsuVar;
        this.h = fcsuVar2;
        this.i = fcsuVar3;
        this.j = aqvbVar;
    }

    private static String b() {
        return UUID.randomUUID().toString().substring(0, 8);
    }

    @Override // defpackage.coty
    public final cous a(MessageCoreData messageCoreData, ekgb ekgbVar) throws Throwable {
        eieu eieuVar;
        Uri uriT;
        cbtk cbtkVar;
        epvz epvzVar;
        epvz epvzVar2;
        if (!messageCoreData.cB()) {
            return this.e.a(messageCoreData, ekgbVar);
        }
        MessagePartCoreData messagePartCoreDataH = messageCoreData.H();
        if (messagePartCoreDataH == null) {
            throw new IllegalArgumentException();
        }
        String[] strArr = bpio.a;
        bpga bpgaVar = new bpga();
        bpgaVar.r(messageCoreData.F());
        bpgaVar.h(this.c.f());
        eksp ekspVar = cous.h;
        couc coucVar = new couc();
        epvz epvzVar3 = (epvz) epwa.a.createBuilder();
        aqvb aqvbVar = this.j;
        cbtk cbtkVarA = aqvbVar.a() ? ((cbtl) this.i.b()).a(messageCoreData.Q()) : null;
        try {
            eieu eieuVarK = eiiy.k("EncryptedFileUploadPreprocessor#encryptFile");
            try {
                uriT = messagePartCoreDataH.t();
            } catch (Throwable th) {
                th = th;
                eieuVar = eieuVarK;
            }
            try {
                if (uriT == null) {
                    throw new IllegalArgumentException("The file transfer message does not contain an expected content URI");
                }
                String strA = cotx.a(messagePartCoreDataH);
                String strR = messagePartCoreDataH.R();
                eieuVar = eieuVarK;
                if (aqvbVar.a()) {
                    cbtkVarA.getClass();
                    if (strA == null) {
                        strA = "";
                    }
                    strR.getClass();
                    cbtj cbtjVarB = cbtkVarA.b(uriT, strA, strR);
                    cbtf cbtfVar = cbtjVarB.b;
                    cbtkVar = cbtkVarA;
                    if (cbtfVar instanceof cbte) {
                        eyfn eyfnVar = ((cbte) cbtfVar).a;
                        bpgaVar.e(eyfnVar.c.I());
                        bpgaVar.d(eyfnVar.d.I());
                        bpgaVar.g(cbtjVarB.a);
                        bpgaVar.m(strA);
                        bpgaVar.l(strR);
                        bpgaVar.f(eyfnVar.e);
                        coucVar.d(bvug.a);
                        coucVar.f("encrypted_file");
                    } else {
                        if (!(cbtfVar instanceof cbtd)) {
                            throw new IllegalStateException("Unsupported encryption metadata was returned");
                        }
                        epwc epwcVar = ((cbtd) cbtfVar).a;
                        epvzVar3.copyOnWrite();
                        epwa epwaVar = (epwa) epvzVar3.instance;
                        epwaVar.c = epwcVar;
                        epwaVar.b |= 1;
                        coucVar.d(auby.d(cche.b));
                        coucVar.f(b());
                    }
                    ekrw ekrwVarE = a.e();
                    ekrwVarE.X(eksq.a, "BugleE2eeEtouffee");
                    ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EncryptedFileUploadPreprocessor", "encryptAttachmentContentsAndProvideMetadata", 228, "EncryptedFileUploadPreprocessor.java")).q("Hiding file name and content type in fileUploadInfo");
                    coucVar.e(cbtjVarB.a);
                    epvzVar = epvzVar3;
                } else {
                    cbtkVar = cbtkVarA;
                    InputStream inputStreamF = this.f.f(uriT);
                    this.d.b();
                    MediaEncryptor mediaEncryptor = (MediaEncryptor) bwlb.a(MediaEncryptor.createEncryptorInstance());
                    epvzVar = epvzVar3;
                    epqr epqrVar = new epqr(inputStreamF, mediaEncryptor, 1);
                    try {
                        Uri uriG = bxlf.g(epqrVar, this.b);
                        epqrVar.close();
                        bpgaVar.e(mediaEncryptor.getKeyMaterial());
                        bpgaVar.d(mediaEncryptor.getDigest());
                        bpgaVar.f(mediaEncryptor.getVersion());
                        bpgaVar.g(uriG);
                        bpgaVar.m(strA);
                        bpgaVar.l(strR);
                        ekrw ekrwVarE2 = a.e();
                        ekrwVarE2.X(eksq.a, "BugleE2eeEtouffee");
                        ((ekrd) ((ekrd) ekrwVarE2).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EncryptedFileUploadPreprocessor", "encryptAttachmentContentsAndProvideMetadata", 252, "EncryptedFileUploadPreprocessor.java")).q("Hiding file name and content type in fileUploadInfo");
                        coucVar.d(bvug.a);
                        coucVar.e(uriG);
                        coucVar.f("encrypted_file");
                    } finally {
                    }
                }
                eieuVar.close();
                if (messagePartCoreDataH.bj() || messagePartCoreDataH.bx()) {
                    eieu eieuVarK2 = eiiy.k("EncryptedFileUploadPreprocessor#encryptPreview");
                    try {
                        byte[] bArrA = ((coua) this.g.b()).a(messagePartCoreDataH, ((coub) this.h.b()).a(ekgbVar));
                        if (bArrA == null) {
                            epvzVar2 = epvzVar;
                        } else if (this.j.a()) {
                            cbtkVar.getClass();
                            String strR2 = messagePartCoreDataH.R();
                            strR2.getClass();
                            cbti cbtiVarA = cbtkVar.a(bArrA, strR2);
                            cbtf cbtfVar2 = cbtiVarA.b;
                            if (cbtfVar2 instanceof cbte) {
                                eyfn eyfnVar2 = ((cbte) cbtfVar2).a;
                                bpgaVar.p(eyfnVar2.c.I());
                                bpgaVar.o(eyfnVar2.d.I());
                                bpgaVar.n(efne.h.toString());
                                bpgaVar.q(eyfnVar2.e);
                                ekrw ekrwVarE3 = a.e();
                                ekrwVarE3.X(eksq.a, "BugleE2eeEtouffee");
                                ((ekrd) ((ekrd) ekrwVarE3).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EncryptedFileUploadPreprocessor", "createAndEncryptImagePreviewAndProvideMetadata", 292, "EncryptedFileUploadPreprocessor.java")).q("Hiding thumbnail content type in fileUploadInfo");
                                coucVar.h(bvug.a);
                            } else {
                                if (cbtfVar2 instanceof cbtd) {
                                    epwc epwcVar2 = ((cbtd) cbtfVar2).a;
                                    epvzVar.copyOnWrite();
                                    epvzVar2 = epvzVar;
                                    epwa epwaVar2 = (epwa) epvzVar2.instance;
                                    epwaVar2.d = epwcVar2;
                                    epwaVar2.b |= 2;
                                    coucVar.h(auby.d(cche.b));
                                    coucVar.f(b());
                                }
                                coucVar.i(cbtiVarA.a);
                            }
                            epvzVar2 = epvzVar;
                            coucVar.i(cbtiVarA.a);
                        } else {
                            epvzVar2 = epvzVar;
                            this.d.b();
                            MediaEncryptor mediaEncryptor2 = (MediaEncryptor) bwlb.a(MediaEncryptor.createEncryptorInstance());
                            byte[] bArr = (byte[]) bwlb.a(mediaEncryptor2.encrypt(bArrA, true));
                            bpgaVar.p(mediaEncryptor2.getKeyMaterial());
                            bpgaVar.o(mediaEncryptor2.getDigest());
                            bpgaVar.q(mediaEncryptor2.getVersion());
                            bpgaVar.n(efne.h.toString());
                            ekrw ekrwVarE4 = a.e();
                            ekrwVarE4.X(eksq.a, "BugleE2eeEtouffee");
                            ((ekrd) ((ekrd) ekrwVarE4).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EncryptedFileUploadPreprocessor", "createAndEncryptImagePreviewAndProvideMetadata", 316, "EncryptedFileUploadPreprocessor.java")).q("Hiding thumbnail content type in fileUploadInfo");
                            coucVar.h(bvug.a);
                            coucVar.i(evqs.x(bArr));
                        }
                        eieuVarK2.close();
                    } finally {
                    }
                } else {
                    if (messagePartCoreDataH.aY()) {
                        coucVar.c(Duration.ofMillis(messagePartCoreDataH.k()));
                    }
                    epvzVar2 = epvzVar;
                }
                if (this.j.a()) {
                    epwa epwaVar3 = (epwa) epvzVar2.build();
                    if (!epwaVar3.equals(epwa.a)) {
                        bpgaVar.k(epwaVar3);
                    }
                }
                bpgaVar.c();
                return coucVar.j();
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                try {
                    eieuVar.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException e) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleE2eeEtouffee");
            ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarJ).g(e);
            ekrdVar.X(cqnc.f, messageCoreData.F());
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EncryptedFileUploadPreprocessor", "prepareFileForUpload", 146, "EncryptedFileUploadPreprocessor.java")).q("Unable to encrypt file transfer content");
            throw e;
        }
    }
}
