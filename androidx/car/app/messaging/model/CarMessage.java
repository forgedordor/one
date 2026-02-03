package androidx.car.app.messaging.model;

import android.net.Uri;
import android.os.Bundle;
import androidx.car.app.model.CarText;
import defpackage.cmb;
import defpackage.cmz;
import defpackage.cng;
import defpackage.kxa;
import j$.util.Objects;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public class CarMessage {
    private final CarText mBody;
    private final boolean mIsRead;
    private final String mMultimediaMimeType;
    private final Uri mMultimediaUri;
    private final long mReceivedTimeEpochMillis;
    private final Bundle mSender;

    private CarMessage() {
        this.mSender = null;
        this.mBody = null;
        this.mMultimediaMimeType = null;
        this.mMultimediaUri = null;
        this.mReceivedTimeEpochMillis = 0L;
        this.mIsRead = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarMessage)) {
            return false;
        }
        CarMessage carMessage = (CarMessage) obj;
        return cng.b(getSender(), carMessage.getSender()) && Objects.equals(this.mBody, carMessage.mBody) && this.mReceivedTimeEpochMillis == carMessage.mReceivedTimeEpochMillis && this.mIsRead == carMessage.mIsRead;
    }

    public CarText getBody() {
        return this.mBody;
    }

    public String getMultimediaMimeType() {
        return this.mMultimediaMimeType;
    }

    public Uri getMultimediaUri() {
        return this.mMultimediaUri;
    }

    public long getReceivedTimeEpochMillis() {
        return this.mReceivedTimeEpochMillis;
    }

    public kxa getSender() {
        Bundle bundle = this.mSender;
        if (bundle == null) {
            return null;
        }
        return kxa.b(bundle);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(cng.a(getSender())), this.mBody, Long.valueOf(this.mReceivedTimeEpochMillis), Boolean.valueOf(this.mIsRead));
    }

    public boolean isRead() {
        return this.mIsRead;
    }

    public CarMessage(cmz cmzVar) {
        Bundle bundleA;
        kxa kxaVar = cmzVar.a;
        if (kxaVar == null) {
            bundleA = null;
        } else {
            ConversationItem.validateSender(kxaVar);
            bundleA = kxaVar.a();
        }
        this.mSender = bundleA;
        this.mBody = cmzVar.b;
        this.mMultimediaMimeType = cmzVar.c;
        this.mMultimediaUri = cmzVar.d;
        this.mReceivedTimeEpochMillis = cmzVar.e;
        this.mIsRead = cmzVar.f;
    }
}
