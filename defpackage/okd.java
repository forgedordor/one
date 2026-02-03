package defpackage;

import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class okd {
    public static final okq a(TypedValue typedValue, okq okqVar, okq okqVar2, String str, String str2) throws XmlPullParserException {
        if (okqVar == null || okqVar == okqVar2) {
            return okqVar == null ? okqVar2 : okqVar;
        }
        throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
    }
}
