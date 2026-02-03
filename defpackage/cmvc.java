package defpackage;

import android.os.Bundle;
import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmvc extends fcyz implements fdat {
    int a;
    final /* synthetic */ cmvd b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmvc(cmvd cmvdVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cmvdVar;
        this.c = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmvc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Bundle bundle;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cmvd cmvdVar = this.b;
            int i2 = this.c;
            this.a = 1;
            obj = cmvdVar.a(i2, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        etsn etsnVar = (etsn) obj;
        int i3 = cmvd.d;
        if (etsnVar == null) {
            bundle = Bundle.EMPTY;
            bundle.getClass();
        } else {
            Bundle bundle2 = new Bundle();
            if ((etsnVar.b & 1) != 0) {
                bundle2.putBoolean("enabledMMS", etsnVar.d);
            }
            if ((etsnVar.b & 2) != 0) {
                bundle2.putBoolean("enableGroupMms", etsnVar.e);
            }
            if ((etsnVar.b & 4) != 0) {
                bundle2.putBoolean("groupChatDefaultsToMMS", etsnVar.f);
            }
            if ((etsnVar.b & 8) != 0) {
                bundle2.putString("httpParams", etsnVar.g);
            }
            if ((etsnVar.b & 16) != 0) {
                bundle2.putString("spamForwardingNumber", etsnVar.h);
            }
            if ((etsnVar.b & 32) != 0) {
                bundle2.putBoolean("enableMultipartSMS", etsnVar.i);
            }
            if ((etsnVar.b & 64) != 0) {
                bundle2.putInt("smsToMmsTextThreshold", etsnVar.j);
            }
            if ((etsnVar.b & 128) != 0) {
                bundle2.putBoolean("enabledTransID", etsnVar.k);
            }
            if ((etsnVar.b & 256) != 0) {
                bundle2.putBoolean("allowEditingSmscAddress", etsnVar.l);
            }
            if ((etsnVar.b & 512) != 0) {
                bundle2.putInt("maxMessageSize", etsnVar.m);
            }
            if ((etsnVar.b & 1024) != 0) {
                bundle2.putInt("maxImageHeight", etsnVar.n);
            }
            if ((etsnVar.b & 2048) != 0) {
                bundle2.putInt("maxImageWidth", etsnVar.o);
            }
            if ((etsnVar.b & VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES) != 0) {
                bundle2.putString("uaProfTagName", etsnVar.F);
            }
            if ((etsnVar.b & 536870912) != 0) {
                bundle2.putBoolean("supportMmsContentDisposition", etsnVar.G);
            }
            if ((etsnVar.b & VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS) != 0) {
                bundle2.putBoolean("supportHttpCharsetHeader", etsnVar.E);
            }
            if ((etsnVar.b & 4194304) != 0) {
                evrj evrjVar = etsnVar.z;
                if (evrjVar == null) {
                    evrjVar = evrj.a;
                }
                bundle2.putInt("httpSocketTimeout", (int) evrjVar.b);
            }
            if ((etsnVar.c & 512) != 0) {
                bundle2.putBoolean("useCustomUserAgent", etsnVar.S);
            }
            if ((etsnVar.b & 1073741824) != 0) {
                bundle2.putBoolean("supportMmsPriority", etsnVar.H);
            }
            if ((etsnVar.b & 2097152) != 0) {
                bundle2.putBoolean("enabledNotifyWapMMSC", etsnVar.y);
            }
            if ((etsnVar.b & VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING) != 0) {
                bundle2.putInt("recipientLimit", etsnVar.C);
            }
            if ((etsnVar.b & VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES) != 0) {
                bundle2.putString("uaProfTagName", etsnVar.F);
            }
            if ((etsnVar.b & 16777216) != 0) {
                bundle2.putString("naiSuffix", etsnVar.B);
            }
            if ((etsnVar.b & 16384) != 0) {
                bundle2.putBoolean("aliasEnabled", etsnVar.r);
            }
            if ((etsnVar.b & 32768) != 0) {
                bundle2.putInt("aliasMinChars", etsnVar.s);
            }
            if ((etsnVar.b & 65536) != 0) {
                bundle2.putInt("aliasMaxChars", etsnVar.t);
            }
            if ((etsnVar.c & 4) != 0) {
                bundle2.putBoolean("sendMultipartSmsAsSeparateMessages", etsnVar.L);
            }
            if ((etsnVar.c & 256) != 0) {
                bundle2.putBoolean("smsUsesSimpleCharactersOnly", etsnVar.R);
            }
            if ((etsnVar.c & 32) != 0) {
                bundle2.putBoolean("smsEncodingChangeable", etsnVar.O);
            }
            if ((etsnVar.c & 128) != 0) {
                bundle2.putInt("smsToMmsTextLengthThreshold", etsnVar.Q);
            }
            if ((etsnVar.b & 1048576) != 0) {
                bundle2.putString("emailGatewayNumber", String.valueOf(etsnVar.x));
            }
            if ((etsnVar.b & 4096) != 0) {
                bundle2.putBoolean("enableWapPushSI", etsnVar.p);
            }
            if ((etsnVar.b & 8192) != 0) {
                bundle2.putBoolean("allowEnablingWapPushSI", etsnVar.q);
            }
            if ((etsnVar.b & 262144) != 0) {
                bundle2.putBoolean("mms_auto_retrieve_enabled_bool", etsnVar.v);
            }
            if ((etsnVar.b & 131072) != 0) {
                bundle2.putBoolean("allowChangingMmsRoamingAutoRetrieve", etsnVar.u);
            }
            if ((etsnVar.b & VCardConfig.FLAG_APPEND_TYPE_PARAM) != 0) {
                bundle2.putBoolean("mmsRoamingAutoRetrieveByDefault", etsnVar.D);
            }
            if ((etsnVar.c & 64) != 0) {
                bundle2.putString("smsErrorDescMap", String.valueOf(etsnVar.P));
            }
            if ((etsnVar.b & 524288) != 0) {
                bundle2.putBoolean("config_cellBroadcastAppLinks", etsnVar.w);
            }
            if ((etsnVar.c & 1) != 0) {
                bundle2.putString("hiddenContactsData", etsnVar.J);
            }
            if ((etsnVar.c & 8) != 0) {
                bundle2.putBoolean("enableSMSDeliveryReports", etsnVar.M);
            }
            if ((etsnVar.c & 16) != 0) {
                bundle2.putBoolean("smsDeliveryReportSettingOnByDefault", etsnVar.N);
            }
            if ((etsnVar.b & VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT) != 0) {
                bundle2.putInt("maxSubjectLength", etsnVar.A);
            }
            if ((etsnVar.b & Integer.MIN_VALUE) != 0) {
                bundle2.putInt("emailGatewaySmsToMmsTextThreshold", etsnVar.I);
            }
            if ((etsnVar.c & 2) != 0) {
                bundle2.putInt("maxMessageTextSize", etsnVar.K);
            }
            bundle = bundle2;
        }
        cmvd cmvdVar2 = this.b;
        cmuh cmuhVar = new cmuh(this.c, bundle);
        int i4 = cmuhVar.a;
        cmuo cmuoVar = cmvdVar2.b;
        cmuoVar.b.lock();
        try {
            cmuoVar.e.put(i4, cmuhVar);
            cmuoVar.b.unlock();
            return fctx.a;
        } catch (Throwable th) {
            cmuoVar.b.unlock();
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cmvc(this.b, this.c, fcxyVar);
    }
}
