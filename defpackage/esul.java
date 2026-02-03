package defpackage;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esul {
    public static final esum a(String str) {
        Parcelable.Creator creator = ParcelFileDescriptor.CREATOR;
        creator.getClass();
        fbwe fbweVar = new fbwe(creator, false);
        int i = fbrb.d;
        String strConcat = str.concat("-bin");
        fbrc fbrcVar = new fbrc(strConcat, fbweVar);
        fbog fbogVar = fbog.d;
        return new esum(fbrcVar, new fbod("REQ-".concat(strConcat)), new fbod("RESH-".concat(strConcat)), new fbod("REST-".concat(strConcat)));
    }
}
