package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.PatternSyntaxException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpfc {
    public static final cczi a = cdag.h(cdag.b, "otp_allow_from_contact", true);
    private final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/util/OtpMessageAnnotator");
    private byte[] c = new byte[0];
    private List d = new ArrayList();
    private final Object e = new Object();
    private final fcsu f;
    private final ajhd g;

    public cpfc(fcsu fcsuVar, ajhd ajhdVar) {
        this.f = fcsuVar;
        this.g = ajhdVar;
    }

    public final ezds a(MessageCoreData messageCoreData) {
        return b(messageCoreData, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0128 A[Catch: all -> 0x01d6, TryCatch #1 {all -> 0x01d6, blocks: (B:3:0x0008, B:5:0x000f, B:8:0x0018, B:11:0x0024, B:12:0x0026, B:15:0x002f, B:17:0x0042, B:22:0x0050, B:42:0x0128, B:44:0x014a, B:46:0x015e, B:48:0x0164, B:50:0x01bc, B:52:0x01ca, B:25:0x005a, B:26:0x005e, B:28:0x0064, B:38:0x009c, B:40:0x00a6, B:31:0x0078, B:33:0x0082, B:36:0x008d, B:57:0x01d5, B:13:0x0027, B:14:0x002e), top: B:66:0x0008, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x009c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x005e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ezds b(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpfc.b(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, boolean):ezds");
    }

    public final boolean c(byte[] bArr) {
        boolean z;
        boolean z2;
        ArrayList arrayList;
        eieu eieuVarK = eiiy.k("OtpMessageAnnotator#refreshGrammar");
        try {
            Object obj = this.e;
            synchronized (obj) {
                z = false;
                if (bArr != null) {
                    try {
                        z2 = bArr.length == 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Boolean.valueOf(z2).getClass();
                if (z2) {
                    ekrw ekrwVarJ = this.b.j();
                    ekrwVarJ.X(eksq.a, "BugleOtp");
                    ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/util/OtpMessageAnnotator", "refreshGrammar", 87, "OtpMessageAnnotator.java")).q("Serialized patterns are empty. Resetting OTP patterns.");
                    synchronized (obj) {
                        this.c = new byte[0];
                        this.d = new ArrayList();
                    }
                } else if (Arrays.equals(this.c, bArr)) {
                    ekrw ekrwVarF = this.b.f();
                    ekrwVarF.X(eksq.a, "BugleOtp");
                    ((ekrd) ((ekrd) ekrwVarF).h("com/google/android/apps/messaging/shared/util/OtpMessageAnnotator", "refreshGrammar", 93, "OtpMessageAnnotator.java")).q("No change in OTP patterns.");
                    z = true;
                } else {
                    try {
                        try {
                            eieuVarK = eiiy.k("OtpMessageAnnotator#parseGrammar");
                            try {
                                if (bArr.length == 0) {
                                    arrayList = new ArrayList();
                                } else {
                                    ejgp ejgpVar = (ejgp) evsn.parseFrom(ejgp.a, bArr, evrr.a());
                                    ArrayList arrayList2 = new ArrayList();
                                    for (ejgr ejgrVar : ejgpVar.b) {
                                        ejmd ejmdVar = new ejmd(ejgrVar);
                                        int i = ejmdVar.c;
                                        if (i <= 0 || i > ejmdVar.a.matcher("").groupCount()) {
                                            throw new IndexOutOfBoundsException("Part " + ejgrVar.c + " is out of capture group bounds.");
                                        }
                                        arrayList2.add(ejmdVar);
                                    }
                                    arrayList = arrayList2;
                                }
                                eieuVarK.close();
                                ekrw ekrwVarH = this.b.h();
                                ekrwVarH.X(eksq.a, "BugleOtp");
                                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/util/OtpMessageAnnotator", "refreshGrammar", 112, "OtpMessageAnnotator.java")).q("OTP patterns refreshed.");
                                this.c = bArr;
                                this.d = arrayList;
                                z = !arrayList.isEmpty();
                            } finally {
                            }
                        } catch (evtj e) {
                            ekrw ekrwVarI = this.b.i();
                            ekrwVarI.X(eksq.a, "BugleOtp");
                            ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).h("com/google/android/apps/messaging/shared/util/OtpMessageAnnotator", "refreshGrammar", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "OtpMessageAnnotator.java")).q("Invalid OTPGrammarConfig. Cannot deserialize the otp grammar.");
                            z = !this.d.isEmpty();
                        }
                    } catch (IndexOutOfBoundsException e2) {
                        ekrw ekrwVarI2 = this.b.i();
                        ekrwVarI2.X(eksq.a, "BugleOtp");
                        ((ekrd) ((ekrd) ((ekrd) ekrwVarI2).g(e2)).h("com/google/android/apps/messaging/shared/util/OtpMessageAnnotator", "refreshGrammar", 105, "OtpMessageAnnotator.java")).q("Capture group out of bounds.");
                        z = !this.d.isEmpty();
                    } catch (PatternSyntaxException e3) {
                        ekrw ekrwVarI3 = this.b.i();
                        ekrwVarI3.X(eksq.a, "BugleOtp");
                        ((ekrd) ((ekrd) ((ekrd) ekrwVarI3).g(e3)).h("com/google/android/apps/messaging/shared/util/OtpMessageAnnotator", "refreshGrammar", 108, "OtpMessageAnnotator.java")).t("Part %s is not a valid regex.", e3.getPattern());
                        z = !this.d.isEmpty();
                    }
                }
            }
            eieuVarK.close();
            return z;
        } finally {
        }
    }
}
