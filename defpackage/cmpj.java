package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmpj {
    public static final cmpk a(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        basd basdVarF = messageCoreData.F();
        if (basdVarF == null) {
            throw new IllegalStateException("Required value was null.");
        }
        String strAz = messageCoreData.az();
        if (strAz == null) {
            throw new IllegalStateException("Required value was null.");
        }
        boolean zCB = messageCoreData.cB();
        aubq aubqVarW = messageCoreData.w();
        aubqVarW.getClass();
        return new cmpk(basdVarF, strAz, zCB, aubqVarW, messageCoreData.ac());
    }
}
