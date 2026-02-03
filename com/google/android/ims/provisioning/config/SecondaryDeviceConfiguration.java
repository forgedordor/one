package com.google.android.ims.provisioning.config;

import android.text.TextUtils;
import defpackage.dgij;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class SecondaryDeviceConfiguration implements Serializable {
    private static final long serialVersionUID = 3571080866179902281L;
    private boolean mIsChatEnabled;
    private boolean mIsFileTransferEnabled;
    private boolean mIsImageShareEnabled;
    private boolean mIsSendSmsEnabled;
    private boolean mIsVideoShareEnabled;
    private boolean mIsVoiceCallEnabled;

    public SecondaryDeviceConfiguration() {
        this.mIsVoiceCallEnabled = true;
        this.mIsChatEnabled = true;
        this.mIsSendSmsEnabled = true;
        this.mIsFileTransferEnabled = true;
        this.mIsVideoShareEnabled = true;
        this.mIsImageShareEnabled = true;
    }

    private static boolean a(dgij dgijVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strE = dgijVar.e(str);
        if (strE == null) {
            strE = "";
        }
        return !strE.equals("1");
    }

    public SecondaryDeviceConfiguration(dgij dgijVar) {
        this.mIsVoiceCallEnabled = true;
        this.mIsChatEnabled = true;
        this.mIsSendSmsEnabled = true;
        this.mIsFileTransferEnabled = true;
        this.mIsVideoShareEnabled = true;
        this.mIsImageShareEnabled = true;
        this.mIsVoiceCallEnabled = a(dgijVar, "VoiceCall");
        this.mIsChatEnabled = a(dgijVar, "Chat");
        this.mIsSendSmsEnabled = a(dgijVar, "SendSms");
        this.mIsFileTransferEnabled = a(dgijVar, "FileTransfer");
        this.mIsVideoShareEnabled = a(dgijVar, "VideoShare");
        this.mIsImageShareEnabled = a(dgijVar, "ImageShare");
    }
}
