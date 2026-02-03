package com.google.android.ims.jibe.service.profile;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.car.app.hardware.info.EnergyProfile;
import com.android.vcard.VCardConstants;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import com.google.android.ims.rcsservice.profile.IRcsProfile;
import com.google.android.ims.rcsservice.profile.RcsProfileServiceResult;
import defpackage.crmx;
import defpackage.dfpq;
import defpackage.dgiq;
import defpackage.dgrs;
import defpackage.dgtg;
import defpackage.dhff;
import defpackage.dhgz;
import defpackage.dhja;
import defpackage.dhjv;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class RcsProfileEngine extends IRcsProfile.Stub {
    private final Context a;
    private final dhgz b;
    private final crmx c;
    private final dgtg d;
    private final dgrs e;

    public RcsProfileEngine(Context context, dhgz dhgzVar, crmx crmxVar, dgtg dgtgVar, dgrs dgrsVar) {
        if (crmxVar == null) {
            throw new IllegalArgumentException("buglePhoneNumberUtils must not be null or getMsisdn() will throw NPE");
        }
        this.a = context;
        this.b = dhgzVar;
        this.c = crmxVar;
        this.d = dgtgVar;
        this.e = dgrsVar;
    }

    protected int getDefaultSharingMethod(dgiq dgiqVar) {
        if (dfpq.n()) {
            return 1;
        }
        if (dfpq.d()) {
            return dgiqVar.o().mDefaultSharingMethod;
        }
        return -1;
    }

    @Override // com.google.android.ims.rcsservice.profile.IRcsProfile
    @Deprecated
    public Bundle getRcsConfig() throws RemoteException {
        dhff.d(this.a, Binder.getCallingUid());
        dgiq dgiqVar = (dgiq) this.e.k().orElse(null);
        Bundle bundle = new Bundle(1);
        if (dgiqVar instanceof Configuration) {
            bundle.putSerializable("Configuration", (Configuration) dgiqVar);
        }
        return bundle;
    }

    @Override // com.google.android.ims.rcsservice.profile.IRcsProfile
    public RcsProfileServiceResult getValue(int i) throws RemoteException {
        String str;
        String strK;
        try {
            dhff.d(this.a, Binder.getCallingUid());
            if (i == 1000) {
                return new RcsProfileServiceResult(1000, (String) this.d.c().orElse(null));
            }
            if (i == 1001) {
                return new RcsProfileServiceResult(1001, null);
            }
            dgiq dgiqVar = (dgiq) this.e.k().orElse(null);
            if (dgiqVar != null && !dgiqVar.U()) {
                if (i == 4) {
                    ImsConfiguration imsConfigurationN = dgiqVar.n();
                    String str2 = "";
                    if (imsConfigurationN != null && (str = imsConfigurationN.mPublicIdentity) != null && (strK = dhjv.k(str, this.c)) != null) {
                        str2 = strK;
                    }
                    return new RcsProfileServiceResult(i, str2);
                }
                if (i == 5) {
                    return new RcsProfileServiceResult(i, this.b.g());
                }
                if (i == 136) {
                    return new RcsProfileServiceResult(i, "false");
                }
                switch (i) {
                    case VCardConstants.DEFAULT_PREF /* 100 */:
                        return new RcsProfileServiceResult(i, String.valueOf(dgiqVar.o().mImCapAlwaysOn));
                    case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                        return new RcsProfileServiceResult(i, String.valueOf(dgiqVar.r().mGroupChatAuth));
                    case 102:
                        return new RcsProfileServiceResult(i, String.valueOf(dgiqVar.o().mMaxAdhocGroupSize));
                    case 103:
                        return new RcsProfileServiceResult(i, String.valueOf(dgiqVar.o().mImSessionStart));
                    default:
                        switch (i) {
                            case 120:
                                return new RcsProfileServiceResult(i, String.valueOf(dgiqVar.o().mMaxSizeFileTransfer));
                            case 121:
                                return new RcsProfileServiceResult(i, String.valueOf(dgiqVar.o().mWarnSizeFileTransfer));
                            case 122:
                                return new RcsProfileServiceResult(i, String.valueOf(dgiqVar.o().mMaxSize1to1));
                            case 123:
                                return new RcsProfileServiceResult(i, String.valueOf(dgiqVar.o().mMaxSize1toM));
                            case 124:
                                return new RcsProfileServiceResult(i, String.valueOf(dgiqVar.o().mAutoAccept));
                            case 125:
                                return new RcsProfileServiceResult(i, String.valueOf(dgiqVar.o().mAutoAcceptGroupChat));
                            case 126:
                                return new RcsProfileServiceResult(i, String.valueOf(dgiqVar.o().mFileTransferAutoAcceptSupported));
                            case 127:
                                return new RcsProfileServiceResult(i, String.valueOf(dgiqVar.p().mUsePresence));
                            case 128:
                                return new RcsProfileServiceResult(i, String.valueOf(dgiqVar.o().mFtHttpCapAlwaysOn));
                            case 129:
                                return new RcsProfileServiceResult(i, String.valueOf(dgiqVar.o().mFtCapAlwaysOn));
                            case 130:
                                return new RcsProfileServiceResult(i, String.valueOf(dgiqVar.r().mChatAuth));
                            case 131:
                                return new RcsProfileServiceResult(i, String.valueOf(!TextUtils.isEmpty(dgiqVar.o().mFtHttpContentServerUri)));
                            case 132:
                                return new RcsProfileServiceResult(i, String.valueOf(dgiqVar.r().mFtAuth));
                            case 133:
                                return new RcsProfileServiceResult(i, String.valueOf(dgiqVar.r().mGeoLocPushAuth));
                            case 134:
                                return new RcsProfileServiceResult(i, String.valueOf(dgiqVar.r().mGeoLocPullAuth != 0));
                            default:
                                switch (i) {
                                    case 139:
                                        return new RcsProfileServiceResult(i, String.valueOf(dgiqVar.o().mImWarnSF));
                                    case 140:
                                        return new RcsProfileServiceResult(i, String.valueOf(!dgiqVar.o().mFullGroupSandFSupported));
                                    case 141:
                                        return new RcsProfileServiceResult(i, String.valueOf(dgiqVar.o().mDeliveryReportTimeout));
                                    case 142:
                                        return new RcsProfileServiceResult(i, String.valueOf(getDefaultSharingMethod(dgiqVar)));
                                    default:
                                        return new RcsProfileServiceResult(16, "Not supported", i, null);
                                }
                        }
                }
            }
            return new RcsProfileServiceResult(18, "Configuration not set", i, null);
        } catch (NullPointerException e) {
            dhja.i(e, "RcsProfileEngine: NPE while getting value for id: %d", Integer.valueOf(i));
            return new RcsProfileServiceResult(18, "Unable to retrieve value", i, null);
        }
    }
}
