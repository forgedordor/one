package defpackage;

import android.text.TextUtils;
import androidx.car.app.model.Alert;
import com.google.android.ims.provisioning.config.CapabilityConfiguration;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.android.ims.provisioning.config.ServerMessage;
import com.google.android.ims.provisioning.config.WelcomeMessage;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.io.IOException;
import java.io.InputStream;
import java.util.Stack;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgqw {
    private final dhjz f;
    private final crmx g;
    private final fcsu h;
    private static final dhip b = new dhip("OMACPRcsConfigParser");
    private static final String[] c = {BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION, "validity"};
    private static final String[] d = {"imSessionStart", "ftWarnSize", "MaxSizeFileTr"};
    public static final dfny a = dfnv.b("override_config_validity_for_debug");
    private static final dfny e = dfnv.b("log_warning_on_invalid_public_user_identity");

    public dgqw(crmx crmxVar, fcsu fcsuVar) {
        this.g = crmxVar;
        this.h = fcsuVar;
        this.f = new dhjz(crmxVar);
    }

    static final void b(dgir dgirVar, dgij dgijVar) throws dgqu {
        if (dgijVar == null) {
            throw new dgqu("Unable to parse transportProto, source characteristic is null", 1);
        }
        dgij dgijVarC = dgijVar.c("transportProto");
        dgirVar.q(dgqt.a(dgijVarC, "psSignalling"));
        dgirVar.p(dgqt.a(dgijVarC, "psRTMedia"));
        dgirVar.o(dgqt.a(dgijVarC, "psMedia"));
        dgirVar.C(dgqt.a(dgijVarC, "wifiSignalling"));
        dgirVar.B(dgqt.a(dgijVarC, "wifiRTMedia"));
        dgirVar.A(dgqt.a(dgijVarC, "wifiMedia"));
    }

    private static dgij c(dgij dgijVar) {
        dgij dgijVarC = dgijVar.c("SERVICEPROVIDEREXT");
        if (dgijVarC == null) {
            return null;
        }
        return dgijVarC.c("joyn");
    }

    private static dgij d(dgqx dgqxVar) {
        dgij dgijVarD = dgqxVar.d("AppId", "ap2002");
        if (dgijVarD == null) {
            dgijVarD = dgqxVar.d("Name", "RCS-e settings");
        }
        return dgijVarD == null ? dgqxVar.d("Name", "RCS settings") : dgijVarD;
    }

    private static dgij e(dgij dgijVar) {
        return dgijVar.c("UX");
    }

    private static dgqx f(InputStream inputStream) throws XmlPullParserException, dgqu, IOException {
        dgqx dgqxVar = new dgqx();
        try {
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, "utf-8");
            xmlPullParserNewPullParser.nextTag();
            String name = xmlPullParserNewPullParser.getName();
            Stack stack = new Stack();
            int iNextTag = xmlPullParserNewPullParser.nextTag();
            dgij dgijVarB = null;
            while (!xmlPullParserNewPullParser.getName().equals(name)) {
                String name2 = xmlPullParserNewPullParser.getName();
                if (iNextTag == 2) {
                    if (name2.equals("param") || name2.equals("parm")) {
                        if (dgijVarB == null) {
                            dgijVarB = null;
                        } else {
                            String attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "name");
                            String attributeValue2 = xmlPullParserNewPullParser.getAttributeValue(null, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE);
                            if (attributeValue != null && attributeValue2 != null) {
                                dgijVarB.a.add(new dgii(attributeValue, attributeValue2));
                            }
                        }
                        xmlPullParserNewPullParser.nextTag();
                    } else if (name2.equals("characteristic")) {
                        String attributeValue3 = xmlPullParserNewPullParser.getAttributeValue(null, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
                        if (attributeValue3 == null) {
                            throw new dgqu((String) null, 1);
                        }
                        dgijVarB = dgijVarB == null ? dgqxVar.b(attributeValue3) : dgijVarB.b(attributeValue3);
                        stack.push(dgijVarB);
                    } else {
                        continue;
                    }
                } else if (iNextTag == 3 && name2.equals("characteristic")) {
                    stack.pop();
                    dgijVarB = stack.isEmpty() ? null : (dgij) stack.peek();
                }
                iNextTag = xmlPullParserNewPullParser.nextTag();
            }
            return dgqxVar;
        } catch (XmlPullParserException e2) {
            throw new IOException("Error while parsing document: ".concat(String.valueOf(e2.getMessage())), e2.getCause());
        }
    }

    private static void g(dgij dgijVar, dgiq dgiqVar) {
        dgij dgijVarC = dgijVar.c("CAPDISCOVERY");
        if (dgijVarC != null) {
            CapabilityConfiguration capabilityConfiguration = new CapabilityConfiguration();
            capabilityConfiguration.mPollingPeriod = dgijVarC.a("pollingPeriod", 0);
            capabilityConfiguration.mCapInfoExpiry = dgijVarC.a("capInfoExpiry", 0);
            capabilityConfiguration.mNonRcsCapInfoExpiry = dgijVarC.a("nonRCScapInfoExpiry", 0);
            int iA = dgijVarC.a("defaultDisc", 0);
            if (iA == 0) {
                capabilityConfiguration.mPresenceDiscovery = false;
            } else if (iA == 1) {
                capabilityConfiguration.mPresenceDiscovery = true;
            } else {
                dhja.r(b, "Invalid parameter value defaultDisc:%d", Integer.valueOf(iA));
                capabilityConfiguration.mPresenceDiscovery = false;
            }
            capabilityConfiguration.disableInitialAddressBookScan = dgijVarC.a("disableInitialAddressBookScan", 0) == 1;
            dgij dgijVarC2 = dgijVarC.c("Ext");
            dgij dgijVarC3 = dgijVarC2 == null ? null : dgijVarC2.c("joyn");
            if (dgijVarC3 != null) {
                capabilityConfiguration.msgCapValidity = dgijVarC3.a("msgCapValidity", 5);
            }
            ((Configuration) dgiqVar).mCapabilityDiscoveryConfiguration = capabilityConfiguration;
        }
    }

    private static void h(dgij dgijVar, dgiq dgiqVar) throws dgqu {
        dgij dgijVarC = dgijVar.c("IM");
        dgqt.b(dgijVarC, d);
        if (dgijVarC != null) {
            InstantMessageConfiguration instantMessageConfiguration = new InstantMessageConfiguration();
            instantMessageConfiguration.mImCapAlwaysOn = dgijVarC.a("imCapAlwaysON", 0) == 1;
            instantMessageConfiguration.mFullGroupSandFSupported = dgijVarC.a("GroupChatFullStandFwd", 0) == 1;
            instantMessageConfiguration.mImWarnSF = dgijVarC.a("imWarnSF", 0) == 1;
            instantMessageConfiguration.mImSessionStart = dgijVarC.a("imSessionStart", 0);
            instantMessageConfiguration.mChatAuth = dgijVarC.a("ChatAuth", 0) == 1;
            instantMessageConfiguration.mSmsFallBackAuth = dgijVarC.a("SmsFallBackAuth", 0) == 1;
            instantMessageConfiguration.mAutoAccept = dgijVarC.a("AutAccept", 0) == 1;
            instantMessageConfiguration.mAutoAcceptGroupChat = dgijVarC.a("AutAcceptGroupChat", 1) == 1;
            int iA = dgijVarC.a("MaxSize", Alert.DURATION_SHOW_INDEFINITELY);
            instantMessageConfiguration.mMaxSize1to1 = dgijVarC.a("MaxSize1to1", iA);
            instantMessageConfiguration.mMaxSize1toM = dgijVarC.a("MaxSize1toM", iA);
            int iA2 = dgijVarC.a("TimerIdle", 120);
            instantMessageConfiguration.mTimerIdleSecs = iA2;
            dhip dhipVar = b;
            dhja.d(dhipVar, "Instant Message Session TimerIdle: %d", Integer.valueOf(iA2));
            instantMessageConfiguration.mPublishPresenceCap = dgijVarC.a("pres-srv-cap", 0) == 1;
            instantMessageConfiguration.mMaxAdhocGroupSize = dgijVarC.a("max_adhoc_group_size", Alert.DURATION_SHOW_INDEFINITELY);
            String strE = dgijVarC.e("deferred-msg-func-uri");
            if (strE == null || strE.trim().length() == 0) {
                instantMessageConfiguration.mDeferredMessageFunctionUri = null;
            } else {
                if (!strE.startsWith("sip:") && !strE.startsWith("sips:")) {
                    strE = "sip:".concat(strE);
                }
                instantMessageConfiguration.mDeferredMessageFunctionUri = strE;
            }
            String strE2 = dgijVarC.e("conf-fcty-uri");
            if (strE2 == null) {
                throw new dgqu("conferenceFactoryUri cannot be set to null.", 1);
            }
            instantMessageConfiguration.mConferenceFactoryUri = strE2;
            instantMessageConfiguration.mExploderUri = dgijVarC.e("exploder-uri");
            instantMessageConfiguration.mFileTransferAutoAcceptSupported = dgijVarC.a("ftAutAccept", 1) == 1;
            instantMessageConfiguration.mMaxSizeFileTransfer = dgijVarC.a("MaxSizeFileTr", 0) * 1024;
            instantMessageConfiguration.mWarnSizeFileTransfer = dgijVarC.a("ftWarnSize", 0) * 1024;
            instantMessageConfiguration.mFtCapAlwaysOn = dgijVarC.a("ftCapAlwaysON", 0) == 1;
            String strE3 = dgijVarC.e("ftDefaultMech");
            String str = "http";
            if (!"http".equalsIgnoreCase(strE3)) {
                if ("msrp".equalsIgnoreCase(strE3)) {
                    str = "msrp";
                } else {
                    dhja.q("Invalid parameter ftDefaultMech:%s. Falling back to HTTP.", String.valueOf(strE3));
                }
            }
            instantMessageConfiguration.mFtDefaultMechanism = str;
            instantMessageConfiguration.mDefaultSharingMethod = dgijVarC.a("ftHTTPFallback", -1);
            instantMessageConfiguration.mFtStoreAndForwardEnabled = dgijVarC.a("ftStAndFwEnabled", 0) == 1;
            instantMessageConfiguration.mFtThumbnailSupported = dgijVarC.a("ftThumb", 0) == 1;
            instantMessageConfiguration.mMaxConcurrentSession = dgijVarC.a("MaxConcurrentSession", -1);
            String strE4 = dgijVarC.e("ftHTTPCSURI");
            if (strE4 != null) {
                instantMessageConfiguration.mFtHttpContentServerUri = strE4;
            }
            String strE5 = dgijVarC.e("ftHTTPCSUser");
            if (strE5 != null) {
                instantMessageConfiguration.mFtHttpContentServerUser = strE5;
            }
            String strE6 = dgijVarC.e("ftHTTPCSPwd");
            if (strE6 != null) {
                instantMessageConfiguration.mFtHttpContentServerPassword = strE6;
            }
            instantMessageConfiguration.mChatRevokeTimer = dgijVarC.a("ChatRevokeTimer", 0);
            int iA3 = dgijVarC.a("imMsgTech", 0);
            if (iA3 == 0) {
                instantMessageConfiguration.mMessageTech = 0;
            } else if (iA3 == 1) {
                instantMessageConfiguration.mMessageTech = 1;
            } else {
                dhja.r(dhipVar, "Invalid parameter value imMsgTech:%d", Integer.valueOf(iA3));
                instantMessageConfiguration.mMessageTech = 0;
            }
            ((Configuration) dgiqVar).mInstantMessageConfiguration = instantMessageConfiguration;
        }
    }

    private static void i(dgqx dgqxVar, dgiq dgiqVar) {
        dgij dgijVarC;
        dgij dgijVarC2;
        if (!dfpi.E() || (dgijVarC = dgqxVar.c("XGOOGLE")) == null || (dgijVarC2 = dgijVarC.c("InvalidConfigDetails")) == null) {
            return;
        }
        String strE = dgijVarC2.e("InvalidConfigReason");
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        try {
            Configuration.InvalidConfigReason invalidConfigReason = Configuration.InvalidConfigReason.INVALID_CONFIG_REASON_UNSPECIFIED;
            ((Configuration) dgiqVar).invalidConfigReason = (Configuration.InvalidConfigReason) Enum.valueOf(Configuration.InvalidConfigReason.class, strE);
        } catch (IllegalArgumentException unused) {
            dhja.r(b, "InvalidConfigReason is not a valid enum value: %s", strE);
            ((Configuration) dgiqVar).invalidConfigReason = Configuration.InvalidConfigReason.INVALID_CONFIG_REASON_UNSPECIFIED;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v8 */
    private static void j(dgiq dgiqVar, dgij dgijVar) throws dgqu {
        ?? r1;
        boolean z;
        ?? r15;
        String strE = dgijVar.e("message");
        if (strE == null) {
            throw new dgqu("message field cannot be null.", 3);
        }
        String strE2 = dgijVar.e(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE);
        if (strE2 == null) {
            throw new dgqu("title field cannot be null.", 3);
        }
        boolean z2 = false;
        boolean z3 = true;
        if (dgijVar.a("Reject_btn", 0) != 0) {
            r1 = 1;
        } else {
            r1 = 1;
            z3 = false;
        }
        if (dgijVar.a("Accept_btn", 0) != 0) {
            z = false;
            z2 = r1;
        } else {
            z = false;
        }
        if (z2 == z3) {
            ?? r152 = z ? 1 : 0;
            dhip dhipVar = b;
            Boolean boolValueOf = Boolean.valueOf(z2);
            Boolean boolValueOf2 = Boolean.valueOf(z3);
            Object[] objArr = new Object[4];
            objArr[r152] = strE;
            objArr[r1] = strE2;
            objArr[2] = boolValueOf;
            objArr[3] = boolValueOf2;
            dhja.d(dhipVar, "msg: %s, title: %s, accept: %s, reject: %s", objArr);
            ((Configuration) dgiqVar).mServerMessage = new ServerMessage(strE, strE2, z2, z3);
            return;
        }
        if (dgijVar.a("Settings_btn", z ? 1 : 0) != 0) {
            r15 = z ? 1 : 0;
            z = r1;
        } else {
            r15 = z ? 1 : 0;
        }
        dhip dhipVar2 = b;
        Boolean boolValueOf3 = Boolean.valueOf(z2);
        Boolean boolValueOf4 = Boolean.valueOf(z3);
        Boolean boolValueOf5 = Boolean.valueOf(z);
        Object[] objArr2 = new Object[5];
        objArr2[r15] = strE;
        objArr2[r1] = strE2;
        objArr2[2] = boolValueOf3;
        objArr2[3] = boolValueOf4;
        objArr2[4] = boolValueOf5;
        dhja.d(dhipVar2, "welcome msg: %s, title: %s, accept: %s, reject: %s, settings: %s", objArr2);
        ((Configuration) dgiqVar).welcomeMessage = new WelcomeMessage(strE, strE2, z2, z3, z);
    }

    private static byte[] k(String str) {
        return eldz.f.g().k(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:398:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x08a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.io.InputStream r20, final defpackage.dgiq r21, boolean r22) throws org.xmlpull.v1.XmlPullParserException, defpackage.dgqu, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 2295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgqw.a(java.io.InputStream, dgiq, boolean):void");
    }
}
