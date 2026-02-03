package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eagy {
    private final String a = "/com/google/android/libraries/phonenumbers/data/PhoneNumberMetadataProto".concat("_");

    public final String a(Object obj) {
        String string = obj.toString();
        if (string != null && string.length() != 0) {
            int length = string.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iCodePointAt = string.codePointAt(iCharCount);
                if (Character.isLetterOrDigit(iCodePointAt)) {
                    iCharCount += Character.charCount(iCodePointAt);
                }
            }
            String str = this.a;
            Objects.toString(obj);
            return str.concat(String.valueOf(obj));
        }
        throw new IllegalArgumentException("Invalid key: ".concat(String.valueOf(string)));
    }
}
